SUMMARY = "Self-buildable Yocto Project image"
LICENSE = "MIT"

# Base image.
inherit core-image

# A non-priviledged user to run the build.
inherit extrausers
EXTRA_USERS_PARAMS_append = "usermod -P 'root'   root;"
EXTRA_USERS_PARAMS_append = "useradd -P 'stack' stack;"
EXTRA_USERS_PARAMS_append = "usermod -a -G sudo stack;"
IMAGE_INSTALL_append = " sudo"

# Comfortable shell and editor.
IMAGE_INSTALL_append = " bash"
IMAGE_INSTALL_append = " nano"

# Network configuration (extended by one of our recipe).
IMAGE_INSTALL_append = " resolv-conf"

# Developpement packages on the target.
IMAGE_FEATURES += "ssh-server-openssh"
IMAGE_FEATURES += "dev-pkgs"
IMAGE_FEATURES += "tools-sdk"

# Yocto Project needed tools.
IMAGE_INSTALL_append = " chrpath"
IMAGE_INSTALL_append = " cpio"
IMAGE_INSTALL_append = " git"
IMAGE_INSTALL_append = " perl"
IMAGE_INSTALL_append = " perl-modules"
IMAGE_INSTALL_append = " python3"
IMAGE_INSTALL_append = " resolvconf"
IMAGE_INSTALL_append = " rpcsvc-proto"
IMAGE_INSTALL_append = " tar"
IMAGE_INSTALL_append = " wget"

IMAGE_INSTALL_append = " kernel-module-tun"

# Yocto Cooker needed packages.
IMAGE_INSTALL_append = " yocto-cooker"
IMAGE_INSTALL_append = " python3-pkg-resources"
IMAGE_INSTALL_append = " python3-urllib3"
IMAGE_INSTALL_append = " python3-jsonschema"
