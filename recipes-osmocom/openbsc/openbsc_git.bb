require ${PN}.inc

PV = "0.13.0+gitr${SRCPV}"
PR = "${INC_PR}.4"

SRCREV = "8a158bb1ea36d0f88da18d0f034884b30f09fda2"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git \
    file://revert-mncc-version.patch"

S = "${WORKDIR}/git/openbsc"
