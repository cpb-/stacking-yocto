SUMMARY = "Yocto Cooker - a meta-buildtool for Yocto Project"
HOMEPAGE = "https://github.com/cpb-/yocto-cooker"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

PYPI_SRC_URI = "git://github.com/cpb-/yocto-cooker;protocol=https;branch=master"
SRCREV = "6a9d122ef199a534a41aaea69d9d5837073df704"

inherit pypi setuptools3

S = "${WORKDIR}/git"

RDEPENDS:${PN} += "       \
    python3-core          \
    python3-urllib3       \
    python3-pkg-resources \
    python3-jsonschema    \
"

BBCLASSEXTEND = "native"
