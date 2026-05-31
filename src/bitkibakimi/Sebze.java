package bitkibakimi;

import java.util.ArrayList;

public class Sebze extends Bitki {

    private String bakimBilgisi;
    private String detayliBilgi;
    private String gorselYolu;

    public Sebze(String isim, String bilimselIsim, String bakimBilgisi, String detayliBilgi, String gorselYolu) {
        super(isim, bilimselIsim);
        this.bakimBilgisi = bakimBilgisi;
        this.detayliBilgi = detayliBilgi;
        this.gorselYolu = gorselYolu;
    }

    @Override
    public String getBakimBilgisi() {
        return bakimBilgisi;
    }

    @Override
    public String getDetayliBilgi() {
        return detayliBilgi;
    }

    @Override
    public String getGorselYolu() {
        return gorselYolu;
    }

    public static ArrayList<Sebze> getSebzeTuruListesi() {
        ArrayList<Sebze> sebzeler = new ArrayList<>();

        sebzeler.add(new Sebze("Domates", "Solanum lycopersicum",
        	    """
        	    Domates, sıcak iklimi sever ve tohumları genellikle ilkbaharda ekilir. İyi drene edilmiş, humus açısından zengin topraklar en verimli sonucu verir. Güneş ışığına doyasıya ihtiyaç duyar; günde en az 6-8 saat doğrudan ışık idealdir. Sulama düzenli ve dipten yapılmalıdır. Fide gelişiminde destek çubukları gerekebilir. Yaprak biti ve mildiyö gibi hastalıklara karşı dikkatli olunmalıdır.
        	    """,
        	    """
        	    Domates, dünya genelinde en yaygın tüketilen sebzelerden biridir. Salçalardan çorbalara, soslardan kahvaltılıklara kadar mutfağın vazgeçilmezidir. C vitamini ve likopen açısından zengindir. Kırmızı, sarı ve pembe gibi farklı renklerde çeşitleri mevcuttur. Türkiye’de özellikle Ege ve Akdeniz bölgelerinde yoğun olarak yetiştirilir.
        	    """,
        	    "domates.jpg"
        	));

        	sebzeler.add(new Sebze("Biber", "Capsicum",
        	    """
        	    Biber, sıcak hava ve bol güneş ışığı isteyen bir sebzedir. Tohumları ilkbaharda fide olarak ekilir. Gevşek yapılı, organik maddece zengin topraklar tercih edilmelidir. Sulama düzenli olmalı, toprağın kurumasına izin verilmemelidir. Acı ve tatlı türleri farklı iklim isteklerine sahiptir. Bitkiyi güçlü tutmak için yan sürgünler budanabilir.
        	    """,
        	    """
        	    Biber, mutfakta hem taze hem de kurutulmuş halde kullanılır. Acı biber kapsaisin içerirken, tatlı biberler A vitamini bakımından zengindir. Kırmızı, yeşil, sarı ve mor renkte türleri bulunur. Türkiye'de Gaziantep ve Şanlıurfa gibi bölgelerde geleneksel kullanımı çok yaygındır.
        	    """,
        	    "biber.jpg"
        	));

        	sebzeler.add(new Sebze("Havuç", "Daucus carota",
        	    """
        	    Havuç serin iklim sebzesidir. Tohumları doğrudan toprağa, ilkbaharda veya sonbaharda ekilir. Gevşek, taşsız ve derin topraklar idealdir. Düzenli sulama yapılmalıdır, aksi takdirde çatlamalar oluşabilir. Toprak aşırı sıkıysa kök gelişimi zayıflar. Yabancı ot kontrolü önemlidir. Hasat, yaprakların sararmasıyla başlar.
        	    """,
        	    """
        	    Havuç, beta-karoten ve A vitamini açısından zengindir. Göz sağlığına katkısıyla bilinir. Çiğ, haşlanmış veya pişmiş olarak tüketilebilir. Salataların ve yemeklerin vazgeçilmezidir. Turuncu dışında mor, sarı ve beyaz çeşitleri de mevcuttur. Türkiye’de Ankara, Eskişehir gibi bölgelerde yaygın olarak yetiştirilir.
        	    """,
        	    "havuc.jpg"
        	));

        	sebzeler.add(new Sebze("Patlıcan", "Solanum melongena",
        	    """
        	    Patlıcan sıcak iklim sebzesidir. Don riskinin olmadığı ilkbahar aylarında ekilir. Gevşek, organik madde açısından zengin topraklarda gelişir. Güneş ışığına ihtiyaç duyar. Sık sulamaya gerek yoktur; toprak kurudukça sulama yapılmalıdır. Gelişim sürecinde destek çubuğu gerekebilir. Kök çürüklüğü ve kırmızı örümcek gibi zararlılara dikkat edilmelidir.
        	    """,
        	    """
        	    Patlıcan, kızartmalardan güveçlere kadar Türk mutfağının temel sebzelerindendir. İyi pişirildiğinde etli ve tok bir tada sahiptir. Mor ve uzun formları dışında minyatür türleri de vardır. Lif bakımından zengin, kalori açısından düşüktür. Türkiye’nin Ege ve Güneydoğu Anadolu bölgelerinde bolca yetiştirilir.
        	    """,
        	    "patlican.jpg"
        	));

        	sebzeler.add(new Sebze("Salatalık", "Cucumis sativus",
        	    """
        	    Salatalık, sıcak ve nemli ortamlarda hızlı büyür. İlkbaharda ekilir ve geçirgen, besince zengin toprakları tercih eder. Güneşi çok sever. Sulama sabah saatlerinde yapılmalı ve yapraklar ıslatılmamalıdır. Bitki sarmaşık gibi gelişir, bu nedenle destek sistemi kurulabilir. Tozlanma için arılar önemlidir. Hasat edilmezse acılaşabilir.
        	    """,
        	    """
        	    Salatalık, su oranı yüksek ve ferahlatıcı bir sebzedir. Özellikle yaz aylarında serinletici etkisiyle salatalarda başroldedir. Lifli yapısıyla sindirimi destekler. Ayrıca cilt maskelerinde de kullanılır. Türkiye’de Bursa ve Antalya başta olmak üzere pek çok bölgede yetiştirilir.
        	    """,
        	    "salatalik.jpg"
        	));

        	sebzeler.add(new Sebze("Soğan", "Allium cepa",
        	    """
        	    Soğan, serin iklimlerde ve tam güneş altında en iyi verimi verir. Tohumları sonbaharda veya erken ilkbaharda doğrudan toprağa ekilir. İyi drene edilmiş, hafif alkali toprakları tercih eder. Sulama başlangıçta düzenli olmalı; hasat dönemi yaklaştıkça azaltılmalıdır. Baş büyüklüğü için seyreltme yapılabilir. Zararlılara karşı dayanıklıdır.
        	    """,
        	    """
        	    Soğan, dünya mutfaklarının temel aromatik sebzesidir. Çiğ, kavrulmuş veya karamelize formda kullanılır. Kükürt bileşikleri sayesinde bağışıklık sistemini destekler. Sarı, beyaz ve mor renkli türleri vardır. Türkiye'de Amasya, Polatlı ve Adapazarı soğan üretimiyle ünlüdür.
        	    """,
        	    "sogan.jpg"
        	));

        	sebzeler.add(new Sebze("Lahana", "Brassica oleracea",
        	    """
        	    Lahana serin iklim sebzesidir ve erken ilkbaharda fideyle dikilir. Killi, nemli ve besince zengin topraklarda yetişir. Düzenli sulama ve güneşli alan gereklidir. Aşırı sıcaklarda gelişimi durur. Bitki sık dikilmemelidir, geniş alan ister. Yaprak biti ve lahana kelebeği gibi zararlılara karşı kontrol sağlanmalıdır.
        	    """,
        	    """
        	    Lahana, güçlü antioksidanlar ve C vitamini içerir. Bağışıklık sistemini destekler, sindirime katkı sağlar. Çorba, sarma, turşu gibi pek çok tarifte kullanılır. Beyaz, mor ve Brüksel lahanası gibi farklı türleri mevcuttur. Marmara ve Karadeniz bölgeleri üretimde öne çıkar.
        	    """,
        	    "lahana.jpg"
        	));

        	sebzeler.add(new Sebze("Kabak", "Cucurbita pepo",
        	    """
        	    Kabak tohumları ilkbaharda doğrudan toprağa ekilir. Gevşek yapılı, iyi drene edilmiş topraklarda ve tam güneş alan yerlerde yetişir. Toprak nemli tutulmalıdır ama aşırı sulamadan kaçınılmalıdır. Meyveler erken toplanırsa daha lezzetlidir. Bitki yayılma eğilimindedir, yer sıkıntısı göz önüne alınmalıdır. Unlu bit gibi zararlılar takip edilmelidir.
        	    """,
        	    """
        	    Kabak, hafif ve çok yönlü bir sebzedir. Dolması, mücveri, çorbası yapılır. Düşük kalorili ve lif oranı yüksek bir besindir. Yaz kabağı dışında balkabağı gibi farklı çeşitleri de bulunur. Ege ve Akdeniz bölgeleri üretimde ön sıralardadır.
        	    """,
        	    "kabak.jpg"
        	));

        	sebzeler.add(new Sebze("Pırasa", "Allium porrum",
        	    """
        	    Pırasa, serin iklimde sonbahar aylarında ekilir. Kumlu-tınlı ve iyi drenajlı toprakları sever. Toprak sürekli nemli tutulmalıdır. Kök boğazı toprakla örtülerek beyaz kısım uzatılır. Sulama düzenli yapılmalı, yaz aylarında dikkat edilmelidir. Tohumdan yetiştiriliyorsa fide aşamasında dikkatli seyreltme gerekir.
        	    """,
        	    """
        	    Pırasa, zengin lif ve C vitamini içeriğiyle sindirime ve bağışıklığa katkı sağlar. Zeytinyağlısı, yemeği ve böreği yapılır. Hafif tatlımsı aromasıyla kış mutfağının temel sebzelerindendir. Türkiye’de Trakya ve İç Anadolu bölgelerinde yaygın olarak yetiştirilir.
        	    """,
        	    "pirasa.jpg"
        	));

        	sebzeler.add(new Sebze("Bezelye", "Pisum sativum",
        	    """
        	    Bezelye, serin ve ılıman iklimleri sever. Tohumları erken ilkbaharda doğrudan toprağa ekilir. Hafif nemli, geçirgen topraklar idealdir. Bitki sarılma eğilimindedir; destek için sırık veya tel gereklidir. Düzenli sulama yapılmalı, özellikle çiçeklenme ve meyve oluşum döneminde önemlidir. Hasat gecikirse taneler sertleşir.
        	    """,
        	    """
        	    Bezelye, protein ve lif bakımından zengin, besleyici bir sebzedir. Taze, konserve veya kuru halde tüketilebilir. Pilavlardan çorbalara, garnitürden püreye kadar pek çok kullanım alanı vardır. Türkiye’de Bursa ve İç Anadolu bölgelerinde yaygın şekilde üretilir.
        	    """,
        	    "bezelye.jpg"
        	));


        return sebzeler;
    }
}

