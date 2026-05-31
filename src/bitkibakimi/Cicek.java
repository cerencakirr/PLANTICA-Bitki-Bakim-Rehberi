package bitkibakimi;

import java.util.ArrayList;

public class Cicek extends Bitki {

    private String bakimBilgisi;
    private String detayliBilgi;
    private String gorselYolu;

    public Cicek(String isim, String bilimselIsim, String bakimBilgisi, String detayliBilgi, String gorselYolu) {
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

    public static ArrayList<Cicek> getCicekTuruListesi() {
        ArrayList<Cicek> cicekler = new ArrayList<>();

        cicekler.add(new Cicek("Gül", "Rosa",
        	    """
        	    Güller, ilkbaharda ekilir ve tam güneş alan alanlarda daha iyi gelişir. İyi drene edilmiş, humus açısından zengin ve hafif asidik toprakları tercih eder. Düzenli sulama şarttır; ancak yapraklara değil, kök bölgesine su verilmelidir. Çiçeklenme döneminde gübreleme verimi artırır. Yılda en az bir kez budanmalı ve solmuş çiçekler temizlenmelidir. Gül biti ve mantar hastalıklarına karşı kontrol yapılmalıdır.
        	    """,
        	    """
        	    Gül, tarih boyunca aşkın, zarafetin ve duygusallığın sembolü olmuştur. Kırmızıdan beyaza, sarıdan pembeye uzanan renk çeşitliliğiyle duyguları ifade eder. Yoğun kokusu ve katmanlı yapraklarıyla büyüleyicidir. Bahçelerden balkonlara, kozmetikten tıbba kadar pek çok alanda kullanılır. Gül Türkiye’nin pek çok bölgesinde, özellikle Isparta'da yaygın olarak yetiştirilir.
        	    """,
        	    "gul.jpg"
        	));

        	cicekler.add(new Cicek("Kasımpatı", "Chrysanthemum",
        	    """
        	    Kasımpatı sonbaharda ekilir ve serin havaları sever. Organik madde bakımından zengin, geçirgen topraklarda yetişir. Haftada 2–3 kez sulama idealdir. Bol güneş ışığı ister ama öğlen sıcağından korunmalıdır. Solan çiçeklerin temizlenmesi yeni çiçeklenmeyi teşvik eder. Kasımpatılar sık sık formda kalmaları için budanmalıdır. Mildiyö ve yaprak lekesi gibi hastalıklara dikkat edilmelidir.
        	    """,
        	    """
        	    Kasımpatı, özellikle sonbahar aylarında çiçek açarak diğer çiçeklerin solduğu dönemde doğaya renk katar. Japon kültüründe ölümsüzlüğü, Batı'da ise neşeyi simgeler. Renkleri arasında sarı, mor, beyaz ve pembe bulunur. Balkonlarda, bahçelerde ve mezarlıklarda yaygın olarak görülür. Uzun ömürlü ve dayanıklı bir çiçektir.
        	    """,
        	    "kasimpati.jpg"
        	));

        	cicekler.add(new Cicek("Orkide", "Orchidaceae",
        	    """
        	    Orkideler, yüksek nemli, havadar ve aydınlık ama doğrudan güneş ışığı almayan ortamları sever. Toprak yerine özel orkide karışımları (kabuklu ortam) kullanılır. Sulama genellikle haftada 1 kez yapılmalı, saksı dibinde su birikmemesine dikkat edilmelidir. Orkide gübresiyle beslenmeleri sağlanmalıdır. Çiçek sapları budanarak yeni tomurcuk oluşumu desteklenebilir.
        	    """,
        	    """
        	    Orkide, zarif yapısıyla tropikal çiçeklerin kraliçesidir. Farklı renklerde ve desenlerde binlerce türü vardır. Genellikle hediye edilen orkide, asaletin ve özel olmanın simgesidir. Evlerde salon süs bitkisi olarak tercih edilir. Özellikle Phalaenopsis türü, bakım kolaylığıyla popülerdir.
        	    """,
        	    "orkide.jpg"
        	));

        	cicekler.add(new Cicek("Menekşe", "Viola",
        	    """
        	    Menekşeler gölgeli ve serin ortamlarda iyi gelişir. Hafif asidik ve nemli topraklar idealdir. Toprak kurudukça sulama yapılmalıdır; fazla su kök çürümesine neden olabilir. Çiçeklenme döneminde haftalık sıvı gübre verilebilir. Çiçekleri soldukça koparılmalı ve saksı sıkışıklığına dikkat edilmelidir.
        	    """,
        	    """
        	    Menekşe, küçük boyuna rağmen renkli ve zengin görünümlüdür. Efsanelere konu olan bu çiçek, çoğu zaman sadelik ve masumiyetle özdeşleştirilir. Eflatun, mavi, beyaz ve sarı tonlarıyla balkonların vazgeçilmez süsüdür. Afrika menekşesi en bilinen iç mekan türüdür.
        	    """,
        	    "menekse.jpg"
        	));

        	cicekler.add(new Cicek("Lale", "Tulipa",
        	    """
        	    Lale soğanları sonbaharda dikilir, ilkbaharda çiçek açar. Bol güneşli alanlar ve geçirgen topraklar idealdir. Sulama, toprak kurudukça yapılmalı, soğanlar çürümemelidir. Çiçeklenme sonrası bitki tamamen kuruyana kadar beklenmeli, ardından soğanlar topraktan çıkarılıp serin yerde saklanmalıdır. Lale böceği gibi zararlılar izlenmelidir.
        	    """,
        	    """
        	    Lale, zarafeti ve simetriyi temsil eden çiçeklerin başında gelir. Osmanlı döneminin “Lale Devri”ne ismini veren bu çiçek, estetik anlayışın sembolüdür. Rengarenk yapısıyla park ve bahçelerde görsel şölen sunar. Türkiye'de özellikle Konya, İstanbul ve Manisa gibi şehirlerde yaygındır.
        	    """,
        	    "lale.jpg"
        	));

        	cicekler.add(new Cicek("Sümbül", "Hyacinthus",
        	    """
        	    Sümbül soğanları sonbaharda dikilir ve ilkbaharda çiçeklenir. Bol güneşli veya yarı gölgeli alanlar idealdir. Toprak sürekli nemli olmalı ama su birikmesine karşı dikkatli olunmalıdır. Çiçek açtıktan sonra solmuş çiçekler koparılmalıdır. Gelişim sonrası soğanlar kurutularak gelecek sezon için saklanabilir.
        	    """,
        	    """
        	    Sümbül, keskin ama hoş kokusuyla dikkat çeker. Pembe, mor, mavi ve beyaz tonlarıyla bahar aylarının müjdecisidir. Özellikle mezarlıklarda ve bahçelerde tercih edilir. Tarih boyunca tıpta, parfüm yapımında ve geleneksel bayram süslemelerinde kullanılmıştır.
        	    """,
        	    "sumbul.jpg"
        	));

        	cicekler.add(new Cicek("Karanfil", "Dianthus",
        	    """
        	    Karanfil, güneşi sever ama kavurucu sıcaktan korunmalıdır. Kireçli, geçirgen ve besin değeri yüksek topraklarda iyi yetişir. Sulama toprağın nemine göre yapılmalı, fazla sulamaktan kaçınılmalıdır. Kuruyan çiçeklerin kesilmesi çiçeklenmeyi artırır. Saksıda da bahçede de kolayca yetiştirilebilir.
        	    """,
        	    """
        	    Karanfil, hem kokusu hem dayanıklılığı ile tanınır. Renkleri arasında kırmızı, beyaz, pembe ve mor gibi çeşitler bulunur. Özellikle 1 Mayıs gibi sosyal etkinliklerde sembol olarak kullanılır. Ayrıca düğün, mezar ve milli günlerde çiçek aranjmanlarında sıklıkla yer alır.
        	    """,
        	    "karanfil.jpg"
        	));

        	cicekler.add(new Cicek("Zambak", "Lilium",
        	    """
        	    Zambaklar, yarı gölgeli ve serin ortamları tercih eder. Organik maddece zengin, hafif nemli topraklar idealdir. Soğanla çoğaltılır ve sonbaharda dikilir. Fazla sulamadan kaçınılmalı, kök çürümesine karşı dikkatli olunmalıdır. Uzayan saplar desteklenmelidir. Budama çiçek sonrası yapılır.
        	    """,
        	    """
        	    Zambak, özellikle beyaz türüyle saflığın ve masumiyetin sembolüdür. Büyük ve gösterişli çiçekleriyle dikkat çeker. Parfüm ve kozmetik endüstrisinde kokusu sıkça kullanılır. Ev içi ve mezarlık çiçeği olarak da tercih edilir.
        	    """,
        	    "zambak.jpg"
        	));

        	cicekler.add(new Cicek("Gelincik", "Papaver",
        	    """
        	    Gelincik, tohumdan kolayca çoğalır. Güneşli ve kuru alanları sever. İyi drene edilmiş, hafif alkali topraklarda yetişir. Fazla suya ihtiyaç duymaz. Hassas yapısıyla rüzgardan korunmalıdır. Solmuş çiçekler tohum oluşumu için bırakılabilir.
        	    """,
        	    """
        	    Gelincik, tarlalarda ve yol kenarlarında kendiliğinden yetişen, doğallığın sembolü olan çiçektir. Parlak kırmızı yaprakları ile dikkat çeker. Halk arasında “kan çiçeği” olarak da bilinir. Sembol olarak genellikle anma törenlerinde, özellikle savaş anılarında kullanılır.
        	    """,
        	    "gelincik.jpg"
        	));

        	cicekler.add(new Cicek("Petunya", "Petunia",
        	    """
        	    Petunya, ilkbahardan sonbahara kadar çiçeklenir. Tam güneş alan ve su geçirgenliği iyi olan topraklarda yetişir. Gün aşırı sulama önerilir, özellikle sıcak günlerde dikkat edilmelidir. Bitki besini ile aylık gübreleme verimi artırır. Solmuş çiçekler düzenli temizlenmelidir.
        	    """,
        	    """
        	    Petunya, sarkan veya klasik türleriyle balkonları ve pencere kenarlarını renklendirir. Pembe, mor, beyaz ve çizgili tonlarıyla göz alıcıdır. Çiçek ömrü uzundur ve düzenli bakımla aylarca çiçek verir. Estetik görünümü sayesinde şehir peyzajında da sık kullanılır.
        	    """,
        	    "petunya.jpg"
        	));


        return cicekler;
    }
}

