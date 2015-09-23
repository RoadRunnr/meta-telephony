require ${PN}.inc

# S = "${WORKDIR}/git"

SRC_URI[md5sum] = "d443496045057db9dbfbda19584e51b6"
SRC_URI[sha256sum] = "ab0873db81f12513c38ca21f6fa6dde0e84030f4d141a6e9031e9f2860fe8c39"

SRC_URI = "http://cgit.osmocom.org/${PN}/snapshot/${PN}-${PV}.tar.xz"
PR = "r2"

PACKAGES =+ "libosmoctrl"
FILES_libosmoctrl = "${libdir}/libosmoctrl${SOLIBS}"

EXTRA_OECONF += "--disable-pcsc"

do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}