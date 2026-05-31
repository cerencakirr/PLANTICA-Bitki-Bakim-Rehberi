package bitkibakimi;

import java.util.ArrayList;

public class Agac extends Bitki {

    private String bakimBilgisi;
    private String detayliBilgi;
    private String gorselYolu;

    public Agac(String isim, String bilimselIsim, String bakimBilgisi, String detayliBilgi, String gorselYolu) {
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
    


    
    public static ArrayList<Agac> getAgacTuruListesi() {
        ArrayList<Agac> agaclar = new ArrayList<>();

        agaclar.add(new Agac(
        	    "Meşe",
        	    "Quercus",
        	    """
        	    Meşe ağacı bakımı, uzun ömürlü ve sağlam bir ağaç yetiştirmek için dikkat ister. Tohum ekimi genellikle sonbaharda yapılır ve tohumlar soğuklama sürecinden geçmelidir. Meşe, iyi drene edilmiş, hafif asidik ve humus açısından zengin toprakları tercih eder. Özellikle gençlik döneminde düzenli sulamaya ihtiyaç duyar; ancak gelişim sağlandığında kuraklığa karşı oldukça dayanıklıdır. Günde en az 6 saat doğrudan güneş ışığı almalıdır.

        	    Ağaç, geniş bir taç yapısına sahip olduğu için yeterli alan gerektirir. İlk yıllarda budama ile şekillendirilmesi önerilir. Kökleri derine indiği için yer değiştirmesi zordur; bu yüzden ekim yeri dikkatlice seçilmelidir. Zararlılara karşı dirençlidir, ancak yaprak biti ve mantar hastalıklarına karşı dönemsel kontrol önerilir.
        	    """,
        	    """
        	    Meşe ağacı, yüzyıllardır gücün, direncin ve bilgelik sembolü olarak kabul edilir. Kütlesel gövdesi, sert ve kaliteli odunu sayesinde inşaattan mobilyaya kadar pek çok alanda kullanılır. 20 ila 40 metreye kadar ulaşabilen boyuyla görkemli bir siluete sahiptir. Yaprakları sonbaharda altın sarısı, kahverengi ve kırmızı tonlarına bürünerek görsel bir şölen sunar.

        	    Ekosistem açısından da büyük öneme sahiptir: çok sayıda kuş ve böcek türüne barınma alanı sağlar; palamutları ise sincaplar ve geyikler gibi birçok canlı için besin kaynağıdır. Aynı zamanda toprağı erozyondan korur, karbon tutar ve iklim dengesine katkı sağlar. Türkiye’de özellikle Karadeniz ve Marmara bölgelerinde yaygın olarak bulunur.
        	    """,
        	    "mese.jpg"
        	));


        agaclar.add(new Agac(
        	    "Çam",
        	    "Pinus",
        	    """
        	    Çam ağacı, zorlu koşullara dayanıklıdır. Kumlu ve iyi drene edilmiş toprakları tercih eder. Güneş ışığını sever, gölgede gelişimi yavaştır. Fidanla dikimi yaygındır, çünkü tohumdan büyümesi uzun sürebilir. Kuraklığa dayanıklıdır, ancak genç fidanlar haftalık sulama ister. Güçlü kök yapısıyla eğimli arazilerde erozyonu önler. Kozalakları dökülmeden önce uzun süre ağaçta kalabilir. Budama genellikle gerekmez.
        	    """,
        	    """
        	    Çam ağacı, yıl boyu yeşil kalan iğne yapraklarıyla bilinir. Reçineli yapısı sayesinde odunu dayanıklıdır. İnşaat, kağıt üretimi ve mobilyacılıkta kullanılır. Türkiye’de kızılçam, sarıçam ve karaçam gibi farklı türleri bulunur. 30 metreye kadar büyüyebilir. Orman yangınlarına karşı dayanıklılığı ile dikkat çeker; bazı türleri yangından sonra kendini yenileyebilir. Orman ekosistemlerinde büyük rol oynar.
        	    """,
        	    "cam.jpg"
        	));


        
        agaclar.add(new Agac(
        	    "Karaağaç",
        	    "Ulmus",
        	    """
        	    Karaağaç, nemli ve zengin topraklarda hızlı büyür. Şehir iklimine ve kirli havaya dayanıklıdır. Tohumları rüzgarla yayılır, ancak peyzajda genellikle fidanla yetiştirilir. Tam güneş alan bölgelerde daha verimli gelişir. Sulama özellikle yaz aylarında düzenli yapılmalıdır. Zararlılara açık bir ağaçtır; özellikle “Dutch Elm Disease” gibi mantar hastalıklarına dikkat edilmelidir. Budama ilkbahar veya sonbaharda yapılabilir.
        	    """,
        	    """
        	    Karaağaç, kalın gövdesi ve geniş yayılı dallarıyla gölge sağlayan bir ağaçtır. 20–35 metreye kadar büyüyebilir. Yaprakları tırtıklı ve parlaktır, sonbaharda sarı tonlara döner. Mobilya üretiminde kullanılan odunu serttir. Aynı zamanda doğal yaşam için yuva ve barınma sağlar. Türkiye'nin Marmara ve İç Anadolu bölgelerinde yaygın olarak görülür. Park ve bahçelerde sıklıkla tercih edilir.
        	    """,
        	    "karaagac.jpg"
        	));


        agaclar.add(new Agac(
        	    "Kızılçam",
        	    "Pinus brutia",
        	    """
        	    Kızılçam, sıcak ve kurak iklim koşullarına uyumludur. Kumlu, taşlı ve zayıf topraklarda bile büyüyebilir. Tohumla kolayca yayılır; yangın sonrası kozalakları açılarak tohum bırakır. Tam güneş ışığı ister ve gölgeye toleransı düşüktür. Su ihtiyacı azdır, özellikle Akdeniz iklimine uygundur. Budama gerekmez, doğası gereği simetrik bir taç yapısı oluşturur. Kozalakları reçine içerir, yangına dayanıklı türler arasındadır.
        	    """,
        	    """
        	    Kızılçam, Türkiye’nin güney sahillerinde en yaygın çam türüdür. Genellikle 20–25 metreye kadar büyür. Kırmızımsı gövdesi ve uzun iğne yaprakları ile tanınır. Orman yangınlarına karşı adaptasyon yeteneği yüksek olduğundan, yangın sonrası hızla alanı yeşillendirir. Odunu yapı sektöründe kullanılır. Aynı zamanda arıcılık için de önemli bir türdür; “çam balı” bu ağaçlardan elde edilir.
        	    """,
        	    "kızılcam.jpg"
        	));


        agaclar.add(new Agac(
        	    "Ihlamur",
        	    "Tilia",
        	    """
        	    Ihlamur ağacı nemli, humuslu ve derin toprakları sever. Yarı gölge veya tam güneş alan ortamlarda gelişebilir. Tohumdan yetiştirilebilir ancak yavaş büyür; genellikle fidanla dikimi tercih edilir. Kurak dönemlerde düzenli sulama gereklidir. Gelişim sürecinde, özellikle gençken budama ile şekil verilebilir. Kökleri geniş alana yayılır, bu nedenle çevresinde başka ağaçlarla rekabet edebilir. Zararlılar nadiren görülür, genelde dayanıklıdır.
        	    """,
        	    """
        	    Ihlamur, hoş kokulu sarımsı çiçekleriyle tanınır. İlkbaharın sonu ve yaz başında çiçek açar; bu çiçekler kurutularak çay olarak tüketilir ve sakinleştirici etkisi vardır. Genellikle 20–30 metreye kadar büyüyebilir. Geniş yaprakları, kalp şeklindedir. Arılar için değerli bir nektar kaynağıdır. Türkiye’de Marmara ve Karadeniz bölgelerinde sıkça görülür. Parklarda, caddelerde gölge ağacı olarak da tercih edilir.
        	    """,
        	    "ihlamur.jpg"
        	));

        agaclar.add(new Agac(
        	    "Kavak",
        	    "Populus",
        	    """
        	    Kavak, hızlı büyümesiyle bilinen bir ağaç türüdür. Sulak alanları ve nehir kenarlarını tercih eder. Kumlu veya balçıklı topraklarda rahat gelişir. Genellikle çelikle çoğaltılır. Bol su ister; kurak dönemlerde düzenli sulama şarttır. Güneşi seven bir türdür ve gölgede cılız kalır. Budama büyüme döneminin dışında yapılmalıdır. Kök sistemi yaygındır, bina temellerinden uzak dikilmelidir.
        	    """,
        	    """
        	    Kavak ağacı, 10 yıldan kısa sürede kesime hazır hale gelebilir. Bu özelliğiyle endüstriyel orman yetiştiriciliğinde yaygın olarak tercih edilir. Yaprakları geniş ve kalp şeklindedir; rüzgarda hoş bir ses çıkartır. Hafif ve yumuşak odunu, inşaat, kontrplak ve kağıt üretiminde kullanılır. Türkiye’de özellikle İç Anadolu ve Marmara bölgelerinde yoğun olarak yetiştirilir.
        	    """,
        	    "kavak.jpg"
        	));


        agaclar.add(new Agac(
        	    "Ardıç",
        	    "Juniperus",
        	    """
        	    Ardıç ağacı, kuraklığa dayanıklı yapısıyla zorlu doğa koşullarında bile hayatta kalabilir. Hafif asidik, iyi drene edilmiş ve taşlı toprakları sever. Genellikle tohumla çoğaltılır fakat çimlenmesi yavaştır. Güneşli bölgelerde daha sağlıklı gelişir. Sulama ihtiyacı düşüktür, yalnızca kurak dönemlerde su verilmelidir. Budama gerektirmez ancak şekil verilecekse kış sonunda yapılmalıdır. Zararlılara ve hastalıklara karşı oldukça dirençlidir.
        	    """,
        	    """
        	    Ardıç, iğne yapraklı ve genellikle çalı formunda olsa da bazı türleri ağaç boyuna ulaşabilir. Mavi-yeşil yaprakları ve koyu mor kozalak benzeri meyveleriyle tanınır. Geleneksel tıpta, özellikle solunum yolları ve sindirim sorunlarına karşı ardıç meyvesi kullanılır. Kuşlar bu meyveleri yayarak ardıcın doğal yayılımına katkı sağlar. Türkiye’nin dağlık bölgelerinde yaygın olarak bulunur ve step ormanlarının önemli bir parçasıdır.
        	    """,
        	    "ardic.jpg"
        	));


        agaclar.add(new Agac(
        	    "Söğüt",
        	    "Salix",
        	    """
        	    Söğüt, bol su isteyen bir ağaçtır. Akarsu kenarları ve nemli zeminler ideal yaşam alanlarıdır. Gevşek, geçirgen topraklarda hızla köklenir. Kış sonunda veya erken ilkbaharda çelikle kolayca çoğaltılır. Tam güneş alan yerlerde gelişimi hızlanır. Sık sulama ister, kuraklığa karşı hassastır. Budamaya uygundur; şekil verilerek dalları yönlendirilebilir. Zararlılara karşı dayanıklı olsa da yaprak bitleriyle zaman zaman mücadele gerekebilir.
        	    """,
        	    """
        	    Söğüt ağacı, sarkık dalları ve uzun, ince yapraklarıyla su kenarlarının vazgeçilmez simgesidir. Estetik görünümü nedeniyle peyzajda sıkça tercih edilir. 10-20 metreye kadar büyüyebilir. Gövdesi esnek olup rüzgara dayanıklıdır. Söğüt kabuğu, tarih boyunca ağrı kesici özelliği nedeniyle tıbbi amaçlarla kullanılmıştır. Sulak alanların biyolojik çeşitliliğini destekleyen önemli bir türdür.
        	    """,
        	    "sögüt.jpg"
        	));


        agaclar.add(new Agac(
        	    "Zeytin",
        	    "Olea europaea",
        	    """
        	    Zeytin ağacı, sıcak ve kuru iklimleri sever. Kireçli, taşlı ve iyi drene edilmiş topraklarda yetişir. Tohumla veya aşılı fidanlarla çoğaltılır. Sulama gereksinimi düşüktür, ama genç fidanlarda düzenli sulama önerilir. Güneşi çok sever; gölgede gelişemez. Budama her yıl yapılmalıdır: hem ürün verimini hem ağacın şeklini korur. Zeytin sineği gibi zararlılar için mevsimsel önlem alınmalıdır.
        	    """,
        	    """
        	    Zeytin ağacı Akdeniz'in simgesidir. Binlerce yıl yaşayan bireyleriyle ölümsüzlüğü simgeler. Gümüş yeşili yaprakları, buruşuk gövdesi ve siyah-yeşil meyveleriyle bilinir. Zeytin meyvesi hem sofralık hem de yağlık olarak değerlendirilir. Barışın sembolü olmuş bu ağaç, kültürel ve ekonomik açıdan büyük öneme sahiptir. Türkiye’nin Ege ve Akdeniz bölgelerinde yaygındır.
        	    """,
        	    "zeytin.jpg"
        	));


        agaclar.add(new Agac(
        	    "Kayın",
        	    "Fagus",
        	    """
        	    Kayın ağacı nemli ve serin iklimlerde en iyi şekilde gelişir. Organik madde açısından zengin, derin ve nemli topraklarda kökleri sağlıklı büyür. Tohumlar sonbaharda ekilir ve soğuklama sürecine ihtiyaç duyar. Gelişim sürecinde düzenli sulama önemlidir, fakat kök çürümesini önlemek için su birikiminden kaçınılmalıdır. Gölgeye toleransı yüksek olsa da tam güneş alan ortamlarda daha hızlı büyür. İlk yıllarda zararlı böceklere ve mantar hastalıklarına karşı düzenli kontrol önerilir.
        	    """,
        	    """
        	    Kayın ağacı, düzgün gövdesi ve gümüşi kabuğuyla ormanlarda estetik bir duruş sergiler. Özellikle mobilya ve parke yapımında kullanılan odunu sert ve elastiktir. Geniş yaprakları sonbaharda altın ve kahverengi tonlarına bürünür. 30 metreye kadar ulaşabilen boyuyla gölge sağlayan bir ağaçtır. Doğada birçok kuş ve memeli türü bu ağacın dallarında barınır. Avrupa ve Türkiye’nin kuzey bölgelerinde doğal yayılış gösterir.
        	    """,
        	    "kayin.jpg"
        	));


        return agaclar;
    }
}
