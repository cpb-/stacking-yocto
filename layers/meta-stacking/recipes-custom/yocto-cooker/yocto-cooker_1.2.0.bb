SUMMARY = "Yocto Cooker - a meta-buildtool for Yocto Project"
HOMEPAGE = "https://github.com/cpb-/yocto-cooker"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit pypi setuptools3

SRCREV = "${PV}"
PYPI_PACKAGE = "yocto-cooker"
PYPI_SRC_URI = "git://git@github.com/cpb-/yocto-cooker.git"

S = "${WORKDIR}/git"

RDEPENDS:${PN} += "       \
    python3-core          \
    python3-urllib3       \
    python3-pkg-resources \
    python3-jsonschema    \
"

BBCLASSEXTEND = "native"
