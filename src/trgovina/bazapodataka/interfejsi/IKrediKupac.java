package trgovina.bazapodataka.interfejsi;

import trgovina.model.pcg_kupac.KupacKredit;

public interface IKrediKupac {
    void SnimiUplatuKupca(KupacKredit kupacKredit);

    void IspraviiUplatuKupca(KupacKredit kupacKredit);

    void ObrisiUplatuKupca(KupacKredit kupacKredit);

}
