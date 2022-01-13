SUMMARY = "resolv.conf"
SECTION = "custom"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://resolv-conf"

inherit update-rc.d

INITSCRIPT_NAME = "resolv-conf"
INITSCRIPT_PARAMS = "start 99 2 3 4 5 ."



do_install() {
	install -d ${D}${sysconfdir}
	install -d ${D}${sysconfdir}/init.d
	install -m 755 ${WORKDIR}/resolv-conf ${D}${sysconfdir}/init.d/resolv-conf
}

