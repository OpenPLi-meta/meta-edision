KV = "4.11.0"
SRCDATE = "20171106"
MODNAMES = "brcmstb-${MACHINE} ci ftm4862 fts260 sp988x"

RDEPENDS_${PN} += "firmware-mn8847x"

require edision-dvb-modules.inc

COMPATIBLE_MACHINE = "osminiplus"

SRC_URI[md5sum] = "cbad035c1fd10635b299e5a2325c2093"
SRC_URI[sha256sum] = "e2982333d6c8302251df143d77fbc63571cc80ea10100dc5382d44f83bc28581"
