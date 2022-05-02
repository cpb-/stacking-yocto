
do_install:append () {
	install -d -m 0750 ${D}${sysconfdir}/sudoers.d
	echo "%sudo ALL=(ALL:ALL) ALL" > ${D}${sysconfdir}/sudoers.d/sudo
	chmod 640 ${D}${sysconfdir}/sudoers.d/sudo
}

FILES:${PN} += "${sysconfdir}/sudoers.d/sudo"
