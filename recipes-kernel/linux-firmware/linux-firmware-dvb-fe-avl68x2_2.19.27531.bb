SUMMARY = "Availink demodulator firmware"
HOMEPAGE = "http://www.availink.com/"
LICENSE = "CLOSED"

COMPATIBLE_MACHINE = "osmini4k|osmio4k|osmio4kplus"

SRC_URI = "git://github.com/edision-open/linux-firmware.git;protocol=https"

SRCREV = "824e8de5b7a048eaf49221f7ba788dbb79123715"

S = "${WORKDIR}/git"

inherit allarch

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware/
    install -d ${D}${nonarch_base_libdir}/firmware/availink/
    install -m 0644 availink/dvb-fe-avl68x2-dvbc.fw ${D}${nonarch_base_libdir}/firmware/availink/
    install -m 0644 availink/dvb-fe-avl68x2-dvbsx.fw ${D}${nonarch_base_libdir}/firmware/availink/
    install -m 0644 availink/dvb-fe-avl68x2-dvbtx.fw ${D}${nonarch_base_libdir}/firmware/availink/
}

FILES_${PN} += "${nonarch_base_libdir}/firmware"
