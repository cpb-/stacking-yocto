SUMMARY = "Self-buildable Yocto Project image"
LICENSE = "MIT"

# Base image.
inherit core-image

# A non-priviledged user to run the build.
inherit extrausers
EXTRA_USERS_PARAMS_append = "usermod -P 'root'   root;"
EXTRA_USERS_PARAMS_append = "useradd -P 'stack' stack;"
EXTRA_USERS_PARAMS_append = "usermod -a -G sudo stack;"
IMAGE_INSTALL:append = " sudo"

# Comfortable shell and editor.
IMAGE_INSTALL:append = " bash"
IMAGE_INSTALL:append = " nano"

# Network configuration (extended by one of our recipe).
IMAGE_INSTALL:append = " resolv-conf"

# Developpement packages on the target.
IMAGE_FEATURES += "ssh-server-openssh"
IMAGE_FEATURES += "dev-pkgs"
IMAGE_FEATURES += "tools-sdk"

# Yocto Project needed tools.
IMAGE_INSTALL:append = " chrpath"
IMAGE_INSTALL:append = " cpio"
IMAGE_INSTALL:append = " git"
IMAGE_INSTALL:append = " perl"
IMAGE_INSTALL:append = " perl-modules"
IMAGE_INSTALL:append = " python3"
IMAGE_INSTALL:append = " resolvconf"
IMAGE_INSTALL:append = " rpcsvc-proto"
IMAGE_INSTALL:append = " tar"
IMAGE_INSTALL:append = " wget"

IMAGE_INSTALL:append = " kernel-module-tun"

# Yocto Cooker needed packages.
IMAGE_INSTALL:append = " yocto-cooker"
IMAGE_INSTALL:append = " python3-pkg-resources"
IMAGE_INSTALL:append = " python3-urllib3"
IMAGE_INSTALL:append = " python3-jsonschema"
