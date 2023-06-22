import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class312 {
	@ObfuscatedName("wd")
	@ObfuscatedGetter(
		intValue = 1215221865
	)
	public static int field698;
	@ObfuscatedName("vm")
	@ObfuscatedGetter(
		intValue = 720193065
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vw")
	@ObfuscatedGetter(
		intValue = 783599583
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("xj")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	static final ApproximateRouteStrategy field804;
	@ObfuscatedName("vv")
	@ObfuscatedSignature(
		descriptor = "[Loe;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("xg")
	static int[] field805;
	@ObfuscatedName("xs")
	static int[] field806;
	@ObfuscatedName("uq")
	static boolean field691;
	@ObfuscatedName("uz")
	static boolean field725;
	@ObfuscatedName("vl")
	@ObfuscatedGetter(
		intValue = -873269387
	)
	static int field790;
	@ObfuscatedName("vf")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	static class466 field769;
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		intValue = 1185578715
	)
	static int field791;
	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	static class466 field768;
	@ObfuscatedName("wx")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wm")
	@ObfuscatedGetter(
		intValue = -961109671
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("wv")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("archive5")
	static class411 archive5;
	@ObfuscatedName("vp")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("ve")
	static short field776;
	@ObfuscatedName("vs")
	static short field620;
	@ObfuscatedName("vz")
	static short field591;
	@ObfuscatedName("vd")
	static short field783;
	@ObfuscatedName("vo")
	static short field781;
	@ObfuscatedName("vx")
	@ObfuscatedGetter(
		intValue = -1643604727
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vr")
	static short field780;
	@ObfuscatedName("vq")
	@ObfuscatedGetter(
		intValue = 259308951
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("wy")
	@ObfuscatedGetter(
		intValue = 1678388391
	)
	static int field767;
	@ObfuscatedName("vg")
	@ObfuscatedGetter(
		intValue = -53199623
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vy")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("uu")
	static boolean field581;
	@ObfuscatedName("vk")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("va")
	static boolean[] field771;
	@ObfuscatedName("um")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	static class467 field540;
	@ObfuscatedName("vt")
	static int[] field695;
	@ObfuscatedName("vi")
	static int[] field772;
	@ObfuscatedName("vj")
	static int[] field774;
	@ObfuscatedName("vb")
	static int[] field763;
	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wc")
	static List field800;
	@ObfuscatedName("wh")
	@ObfuscatedGetter(
		intValue = 963802713
	)
	static int field606;
	@ObfuscatedName("bt")
	static boolean field522;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -361192303
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1594594951
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1974414681
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("ch")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cp")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -621723441
	)
	static int field508;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1873796065
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1303669161
	)
	static int field510;
	@ObfuscatedName("cb")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1874870907
	)
	public static int field512;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1934597803
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dr")
	static boolean field516;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = 207322775
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		longValue = 4920127030277158151L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = -1329198241
	)
	static int field519;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = -107601749
	)
	static int field520;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		longValue = 66246132231975859L
	)
	static long field571;
	@ObfuscatedName("em")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = -594624579
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = 1185816639
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = 927029533
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = -1685525723
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = 279709309
	)
	static int field527;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = 1432360281
	)
	static int field697;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = 1693390980
	)
	static int field529;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = -1898498049
	)
	static int field530;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = -1843350445
	)
	static int field531;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ei")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("fm")
	@ObfuscatedGetter(
		intValue = 651974307
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("fe")
	@ObfuscatedGetter(
		intValue = -71801427
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = -1963002289
	)
	static int field761;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -1308383881
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = -1518386873
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -1193386643
	)
	static int field558;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 1612861341
	)
	static int field782;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 505924573
	)
	static int field542;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static class138 field677;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static class505 field633;
	@ObfuscatedName("hv")
	static final String field502;
	@ObfuscatedName("hu")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("hg")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "[Lde;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = -678887891
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ic")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		intValue = 837238677
	)
	static int field579;
	@ObfuscatedName("ig")
	static int[] field566;
	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = 279369499
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("it")
	static String field667;
	@ObfuscatedName("ia")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("ib")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = 1478251589
	)
	static int field572;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = 1203259771
	)
	static int field573;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = 851356617
	)
	static int field574;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 862283683
	)
	static int field580;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = 1151342763
	)
	static int field576;
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "[Lic;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("ja")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jv")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("jt")
	static final int[] field570;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = 1202134867
	)
	static int field733;
	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = -802733023
	)
	static int field582;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 581561651
	)
	static int field583;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = 1931130079
	)
	static int field584;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = 683242371
	)
	static int field799;
	@ObfuscatedName("km")
	static boolean field585;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = -2069941625
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("ke")
	@ObfuscatedGetter(
		intValue = 899688619
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = -228456983
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = -423306901
	)
	static int field590;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -2034568603
	)
	static int field559;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = 813916949
	)
	static int field727;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = -1310898497
	)
	static int field593;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = 1483337323
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = -1819633681
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = -1476675411
	)
	static int field596;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 1861968219
	)
	static int field597;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 835258425
	)
	static int field598;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = -1167753179
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = 633587213
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -717079565
	)
	public static int field601;
	@ObfuscatedName("lq")
	static boolean field602;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 2014518053
	)
	static int field637;
	@ObfuscatedName("lw")
	static boolean field604;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = 1911387623
	)
	static int field605;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = -295461231
	)
	static int field755;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -1571332777
	)
	static int field533;
	@ObfuscatedName("ly")
	static int[] field608;
	@ObfuscatedName("lv")
	static int[] field609;
	@ObfuscatedName("lk")
	static int[] field610;
	@ObfuscatedName("lb")
	static int[] field611;
	@ObfuscatedName("lr")
	static int[] field696;
	@ObfuscatedName("le")
	static int[] field543;
	@ObfuscatedName("lc")
	static int[][] field614;
	@ObfuscatedName("lz")
	static int[] field528;
	@ObfuscatedName("mr")
	static String[] field616;
	@ObfuscatedName("mi")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = -167407781
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = 529994781
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = -2079938207
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -1567924317
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = -1261201377
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = -1988934199
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -1623077269
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("mo")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = 1036165191
	)
	static int field626;
	@ObfuscatedName("ml")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "[Ldh;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = -959658109
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = 669795975
	)
	static int field630;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		longValue = 4312940255703293125L
	)
	static long field631;
	@ObfuscatedName("mz")
	static boolean field751;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = 1008374225
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = 1421383063
	)
	static int field634;
	@ObfuscatedName("nm")
	static int[] field635;
	@ObfuscatedName("nc")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("na")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("nn")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("nt")
	static int[] field778;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = 386812465
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "[[[Loy;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("nb")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nw")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nd")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nz")
	static boolean field648;
	@ObfuscatedName("ny")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = -54831947
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("nh")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("nj")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("nk")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("od")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("oe")
	static int[] field655;
	@ObfuscatedName("ow")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("oc")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("og")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("ob")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("oj")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("oo")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = 564992227
	)
	static int field662;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = -1048185617
	)
	static int field663;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = 2017584497
	)
	static int field664;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -293663295
	)
	static int field665;
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = -401745713
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ok")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 473608629
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = -83474659
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("on")
	static String field671;
	@ObfuscatedName("ou")
	static String field716;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = 1979039995
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -670100149
	)
	static int field517;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = 665264587
	)
	static int field613;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -1503823221
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = -435237791
	)
	static int field679;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = -1681407531
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 2048885255
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = -209634905
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pq")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = -240815633
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = -229809167
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pi")
	static boolean field639;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = 1131770577
	)
	static int field534;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = 1517291035
	)
	static int field692;
	@ObfuscatedName("pg")
	static boolean field693;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = -1498853671
	)
	static int field694;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = -795363147
	)
	static int field735;
	@ObfuscatedName("qy")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = 296406415
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qg")
	static int[] field653;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = -129556277
	)
	static int field699;
	@ObfuscatedName("qz")
	static int[] field700;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = 916973133
	)
	static int field701;
	@ObfuscatedName("qa")
	static int[] field672;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = 894180421
	)
	static int field703;
	@ObfuscatedName("qc")
	static int[] field704;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = 468164483
	)
	static int field705;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = -949804811
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = 384743405
	)
	static int field707;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = -25684401
	)
	static int field766;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = 1764483065
	)
	static int field709;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = 1910904227
	)
	static int field690;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = 992287529
	)
	static int field734;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = -28610459
	)
	static int field712;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = -1779434341
	)
	static int field711;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = -1098189745
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	static class518 field715;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	static NodeDeque field717;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	static NodeDeque field710;
	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	static NodeDeque field742;
	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = 10640823
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = -1231571959
	)
	static int field722;
	@ObfuscatedName("rf")
	static boolean[] field723;
	@ObfuscatedName("rh")
	static boolean[] field724;
	@ObfuscatedName("ru")
	static boolean[] field743;
	@ObfuscatedName("rl")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("rd")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("rz")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("rc")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = -1735385447
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		longValue = 4704190581364046081L
	)
	static long field731;
	@ObfuscatedName("ri")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sr")
	static int[] field577;
	@ObfuscatedName("sb")
	@ObfuscatedGetter(
		intValue = -395629927
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sc")
	@ObfuscatedGetter(
		intValue = -156895365
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sv")
	static String field736;
	@ObfuscatedName("sn")
	static long[] field737;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = 1912793217
	)
	static int field777;
	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	static class211 field739;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	static class209 field740;
	@ObfuscatedName("su")
	@ObfuscatedGetter(
		intValue = -1323389787
	)
	static int field741;
	@ObfuscatedName("sq")
	static int[] field676;
	@ObfuscatedName("ss")
	static int[] field545;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		longValue = -200923366042018747L
	)
	static long field744;
	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		descriptor = "[Lfs;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "[Lgv;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("sl")
	@ObfuscatedGetter(
		intValue = 633159419
	)
	static int field747;
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = 1516987681
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tp")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("th")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "[Ltm;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tg")
	@ObfuscatedGetter(
		intValue = 2129905511
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("tl")
	@ObfuscatedGetter(
		intValue = -661426691
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tf")
	@ObfuscatedGetter(
		intValue = 158440897
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("ty")
	@ObfuscatedGetter(
		intValue = 988605677
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("tn")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("tm")
	@ObfuscatedGetter(
		intValue = 2146886129
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("tt")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("td")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("tq")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("tw")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("tx")
	@ObfuscatedSignature(
		descriptor = "[Lbh;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("uf")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("ud")
	static boolean field764;
	@ObfuscatedName("gu")
	String field708;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	class14 field546;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	class18 field644;
	@ObfuscatedName("he")
	OtlTokenRequester field548;
	@ObfuscatedName("ha")
	Future field549;
	@ObfuscatedName("hk")
	boolean field550;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	class18 field551;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field552;
	@ObfuscatedName("hi")
	Future field553;
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	Buffer field746;
	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	class7 field652;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		longValue = -6530021425365224405L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field522 = true; // L: 161
		worldId = 1; // L: 162
		worldProperties = 0; // L: 163
		gameBuild = 0; // L: 165
		isMembersWorld = false; // L: 168
		isLowDetail = false; // L: 169
		field508 = -1; // L: 174
		clientType = -1; // L: 175
		field510 = -1; // L: 176
		onMobile = false; // L: 177
		field512 = 214; // L: 178
		gameState = 0; // L: 190
		field516 = true; // L: 214
		cycle = 0; // L: 215
		mouseLastLastPressedTimeMillis = -1L; // L: 216
		field519 = -1; // L: 218
		field520 = -1; // L: 219
		field571 = -1L; // L: 220
		hadFocus = true; // L: 221
		rebootTimer = 0; // L: 222
		hintArrowType = 0; // L: 223
		hintArrowNpcIndex = 0; // L: 224
		hintArrowPlayerIndex = 0; // L: 225
		field527 = 0; // L: 226
		field697 = 0; // L: 227
		field529 = 0; // L: 228
		field530 = 0; // L: 229
		field531 = 0; // L: 230
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 232
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 233
		renderSelf = false; // L: 234
		titleLoadingStage = 0;
		js5ConnectState = 0;
		field761 = 0;
		js5Errors = 0; // L: 270
		loginState = 0; // L: 272
		field558 = 0; // L: 273
		field782 = 0; // L: 274
		field542 = 0; // L: 275
		field677 = class138.field1608; // L: 276
		field633 = class505.field5074; // L: 277
		int var1 = "com_jagex_auth_desktop_osrs:public".length(); // L: 304
		byte[] var2 = new byte[var1]; // L: 305

		for (int var3 = 0; var3 < var1; ++var3) { // L: 306
			char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3); // L: 307
			if (var4 > 127) { // L: 308
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 309
			}
		}

		String var5 = Archive.method6690(var2, 0, var2.length); // L: 315
		field502 = var5; // L: 317
		Login_isUsernameRemembered = false; // L: 330
		secureRandomFuture = new SecureRandomFuture(); // L: 331
		randomDatData = null; // L: 337
		npcs = new NPC[65536]; // L: 341
		npcCount = 0; // L: 342
		npcIndices = new int[65536]; // L: 343
		field579 = 0; // L: 344
		field566 = new int[250]; // L: 345
		packetWriter = new PacketWriter(); // L: 348
		logoutTimer = 0; // L: 350
		hadNetworkError = false; // L: 351
		timer = new Timer(); // L: 352
		fontsMap = new HashMap(); // L: 358
		field572 = 0; // L: 365
		field573 = 1; // L: 366
		field574 = 0; // L: 367
		field580 = 1; // L: 368
		field576 = 0; // L: 369
		collisionMaps = new CollisionMap[4]; // L: 377
		isInInstance = false; // L: 378
		instanceChunkTemplates = new int[4][13][13]; // L: 379
		field570 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 380
		field733 = 0; // L: 383
		field582 = 2301979; // L: 395
		field583 = 5063219; // L: 396
		field584 = 3353893; // L: 397
		field799 = 7759444; // L: 398
		field585 = false; // L: 399
		alternativeScrollbarWidth = 0; // L: 400
		camAngleX = 128; // L: 408
		camAngleY = 0; // L: 409
		field590 = 0; // L: 410
		field559 = 0; // L: 411
		field727 = 0; // L: 412
		field593 = 0; // L: 413
		oculusOrbState = 0; // L: 414
		camFollowHeight = 50; // L: 415
		field596 = 0; // L: 419
		field597 = 0; // L: 420
		field598 = 0; // L: 421
		oculusOrbNormalSpeed = 12; // L: 423
		oculusOrbSlowedSpeed = 6; // L: 424
		field601 = 0; // L: 425
		field602 = false; // L: 426
		field637 = 0; // L: 427
		field604 = false; // L: 428
		field605 = 0; // L: 429
		field755 = 0; // L: 430
		field533 = 50; // L: 431
		field608 = new int[field533]; // L: 432
		field609 = new int[field533]; // L: 433
		field610 = new int[field533]; // L: 434
		field611 = new int[field533]; // L: 435
		field696 = new int[field533]; // L: 436
		field543 = new int[field533]; // L: 437
		field614 = new int[field533][]; // L: 438
		field528 = new int[field533]; // L: 439
		field616 = new String[field533]; // L: 440
		tileLastDrawnActor = new int[104][104]; // L: 441
		viewportDrawCount = 0; // L: 442
		viewportTempX = -1; // L: 443
		viewportTempY = -1; // L: 444
		mouseCrossX = 0; // L: 445
		mouseCrossY = 0; // L: 446
		mouseCrossState = 0; // L: 447
		mouseCrossColor = 0; // L: 448
		showMouseCross = true; // L: 449
		field626 = 0; // L: 450
		showLoadingMessages = true; // L: 452
		players = new Player[2048]; // L: 454
		localPlayerIndex = -1; // L: 456
		field630 = 0; // L: 457
		field631 = -1L; // L: 458
		field751 = true; // L: 460
		drawPlayerNames = 0; // L: 465
		field634 = 0; // L: 466
		field635 = new int[1000]; // L: 467
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 469
		playerMenuActions = new String[8]; // L: 470
		playerOptionsPriorities = new boolean[8]; // L: 471
		field778 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 472
		combatTargetPlayerIndex = -1; // L: 473
		groundItems = new NodeDeque[4][104][104]; // L: 474
		pendingSpawns = new NodeDeque(); // L: 475
		projectiles = new NodeDeque(); // L: 476
		graphicsObjects = new NodeDeque(); // L: 477
		currentLevels = new int[25]; // L: 478
		levels = new int[25]; // L: 479
		experience = new int[25]; // L: 480
		field648 = false; // L: 481
		isMenuOpen = false; // L: 482
		menuOptionsCount = 0; // L: 488
		menuArguments1 = new int[500]; // L: 489
		menuArguments2 = new int[500]; // L: 490
		menuOpcodes = new int[500]; // L: 491
		menuIdentifiers = new int[500]; // L: 492
		field655 = new int[500]; // L: 493
		menuActions = new String[500]; // L: 494
		menuTargets = new String[500]; // L: 495
		menuShiftClick = new boolean[500]; // L: 496
		followerOpsLowPriority = false; // L: 497
		tapToDrop = false; // L: 499
		showMouseOverText = true; // L: 500
		field662 = -1; // L: 501
		field663 = -1; // L: 502
		field664 = 0; // L: 506
		field665 = 50; // L: 507
		isItemSelected = 0; // L: 508
		field667 = null; // L: 512
		isSpellSelected = false; // L: 513
		selectedSpellChildIndex = -1; // L: 515
		selectedSpellItemId = -1; // L: 516
		field671 = null; // L: 518
		field716 = null; // L: 519
		rootInterface = -1; // L: 520
		interfaceParents = new NodeHashTable(8); // L: 521
		field517 = 0; // L: 526
		field613 = -1; // L: 527
		chatEffects = 0; // L: 528
		meslayerContinueWidget = null; // L: 529
		field679 = 0; // L: 530
		weight = 0; // L: 531
		staffModLevel = 0; // L: 532
		followerIndex = -1; // L: 533
		playerMod = false; // L: 534
		viewportWidget = null; // L: 535
		clickedWidget = null; // L: 536
		clickedWidgetParent = null; // L: 537
		widgetClickX = 0; // L: 538
		widgetClickY = 0; // L: 539
		draggedOnWidget = null; // L: 540
		field639 = false; // L: 541
		field534 = -1; // L: 542
		field692 = -1; // L: 543
		field693 = false; // L: 544
		field694 = -1; // L: 545
		field735 = -1; // L: 546
		isDraggingWidget = false; // L: 547
		cycleCntr = 1; // L: 552
		field653 = new int[32]; // L: 555
		field699 = 0; // L: 556
		field700 = new int[32]; // L: 557
		field701 = 0; // L: 558
		field672 = new int[32]; // L: 559
		field703 = 0; // L: 560
		field704 = new int[32]; // L: 561
		field705 = 0; // L: 562
		chatCycle = 0; // L: 563
		field707 = 0; // L: 564
		field766 = 0; // L: 565
		field709 = 0; // L: 566
		field690 = 0; // L: 567
		field734 = 0; // L: 568
		field712 = 0; // L: 569
		field711 = 0; // L: 570
		mouseWheelRotation = 0; // L: 576
		field715 = new class518(); // L: 577
		scriptEvents = new NodeDeque(); // L: 578
		field717 = new NodeDeque(); // L: 579
		field710 = new NodeDeque(); // L: 580
		field742 = new NodeDeque(); // L: 581
		widgetFlags = new NodeHashTable(512); // L: 582
		rootWidgetCount = 0; // L: 584
		field722 = -2; // L: 585
		field723 = new boolean[100]; // L: 586
		field724 = new boolean[100]; // L: 587
		field743 = new boolean[100]; // L: 588
		rootWidgetXs = new int[100]; // L: 589
		rootWidgetYs = new int[100]; // L: 590
		rootWidgetWidths = new int[100]; // L: 591
		rootWidgetHeights = new int[100]; // L: 592
		gameDrawingMode = 0; // L: 593
		field731 = 0L; // L: 594
		isResizable = true; // L: 595
		field577 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 602
		publicChatMode = 0; // L: 603
		tradeChatMode = 0; // L: 605
		field736 = ""; // L: 606
		field737 = new long[100]; // L: 608
		field777 = 0; // L: 609
		field739 = new class211(); // L: 610
		field740 = new class209(); // L: 611
		field741 = 0; // L: 613
		field676 = new int[128]; // L: 614
		field545 = new int[128]; // L: 615
		field744 = -1L; // L: 616
		currentClanSettings = new ClanSettings[4]; // L: 620
		currentClanChannels = new ClanChannel[4]; // L: 622
		field747 = -1; // L: 624
		mapIconCount = 0; // L: 625
		mapIconXs = new int[1000]; // L: 626
		mapIconYs = new int[1000]; // L: 627
		mapIcons = new SpritePixels[1000]; // L: 628
		destinationX = 0; // L: 629
		destinationY = 0; // L: 630
		minimapState = 0; // L: 637
		currentTrackGroupId = -1; // L: 638
		playingJingle = false; // L: 639
		soundEffectCount = 0; // L: 645
		soundEffectIds = new int[50]; // L: 646
		queuedSoundEffectLoops = new int[50]; // L: 647
		queuedSoundEffectDelays = new int[50]; // L: 648
		soundLocations = new int[50]; // L: 649
		soundEffects = new SoundEffect[50]; // L: 650
		isCameraLocked = false; // L: 652
		field764 = false; // L: 658
		field725 = false; // L: 659
		field581 = false; // L: 660
		field540 = null; // L: 666
		field768 = null; // L: 667
		field769 = null; // L: 668
		field691 = false; // L: 669
		field771 = new boolean[5]; // L: 677
		field772 = new int[5]; // L: 678
		field695 = new int[5]; // L: 679
		field774 = new int[5]; // L: 680
		field763 = new int[5]; // L: 681
		field776 = 256; // L: 682
		field620 = 205; // L: 683
		zoomHeight = 256; // L: 684
		zoomWidth = 320; // L: 685
		field780 = 1; // L: 686
		field781 = 32767; // L: 687
		field591 = 1; // L: 688
		field783 = 32767; // L: 689
		viewportOffsetX = 0; // L: 690
		viewportOffsetY = 0; // L: 691
		viewportWidth = 0; // L: 692
		viewportHeight = 0; // L: 693
		viewportZoom = 0; // L: 694
		playerAppearance = new PlayerComposition(); // L: 696
		field790 = -1; // L: 697
		field791 = -1; // L: 698
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 700
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 702
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 705
		archive5 = new class411(8, class409.field4549); // L: 707
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 708
		Widget_cachedFonts = new EvictingDualNodeHashTable(64); // L: 709
		field606 = -1; // L: 712
		field698 = -1; // L: 718
		field800 = new ArrayList(); // L: 719
		archiveLoaders = new ArrayList(10); // L: 720
		archiveLoadersDone = 0; // L: 721
		field767 = 0; // L: 722
		field804 = new ApproximateRouteStrategy(); // L: 731
		field805 = new int[50]; // L: 732
		field806 = new int[50]; // L: 733
	}

	public Client() {
		this.field550 = false; // L: 295
		this.accountHash = -1L;
	} // L: 336

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field731 = WallObject.method5027() + 500L; // L: 4605
		this.resizeJS(); // L: 4606
		if (rootInterface != -1) { // L: 4607
			this.resizeRoot(true);
		}

	} // L: 4608

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "44"
	)
	@Export("setUp")
	protected final void setUp() {
		class168.method3400(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 991
		PcmPlayer.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 992
		SecureRandomFuture.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 993
		UserComparator8.currentPort = PcmPlayer.worldPort; // L: 994
		WorldMapSection1.field3036 = class328.field3585; // L: 995
		class13.field65 = class328.field3580; // L: 996
		GrandExchangeEvent.field4312 = class328.field3582; // L: 997
		class209.field2326 = class328.field3583; // L: 998
		class47.urlRequester = new class112(this.field550, 214); // L: 999
		this.setUpKeyboard(); // L: 1000
		this.method529(); // L: 1001
		SpriteMask.mouseWheel = this.mouseWheel(); // L: 1002
		this.method469(field740, 0); // L: 1003
		this.method469(field739, 1); // L: 1004
		ClanChannelMember.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1005
		AccessFile var2 = null; // L: 1008
		ClientPreferences var3 = new ClientPreferences(); // L: 1009

		try {
			var2 = FontName.getPreferencesFile("", GameBuild.field3841.name, false); // L: 1011
			byte[] var4 = new byte[(int)var2.length()]; // L: 1012

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) { // L: 1013 1014 1017
				var6 = var2.read(var4, var5, var4.length - var5); // L: 1015
				if (var6 == -1) {
					throw new IOException(); // L: 1016
				}
			}

			var3 = new ClientPreferences(new Buffer(var4)); // L: 1019
		} catch (Exception var8) { // L: 1021
		}

		try {
			if (var2 != null) { // L: 1023
				var2.close(); // L: 1024
			}
		} catch (Exception var7) { // L: 1027
		}

		class10.clientPreferences = var3; // L: 1030
		this.setUpClipboard(); // L: 1031
		class323.method5998(this, class136.field1591); // L: 1032
		HealthBar.setWindowedMode(class10.clientPreferences.method2456()); // L: 1033
		ApproximateRouteStrategy.friendSystem = new FriendSystem(WorldMapScaleHandler.loginType); // L: 1034
		this.field546 = new class14("tokenRequest", 1, 1); // L: 1035
		if (!class304.field3388.contains(this)) { // L: 1038
			class304.field3388.add(this); // L: 1039
		}

		class135.field1579 = new class215[1]; // L: 1043
		class213 var9 = class213.field2367; // L: 1044
		class135.field1579[0] = new class215(var9.field2375, var9.field2369); // L: 1045
	} // L: 1047

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "43"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1055
		this.doCycleJs5(); // L: 1056

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 1060
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 1061
			} // L: 1062

			if (var1 == null) { // L: 1063
				int var5;
				try {
					label111: {
						if (class304.musicPlayerStatus == 1) { // L: 1069
							var5 = class304.midiPcmStream.method5737(); // L: 1070
							if (var5 > 0 && class304.midiPcmStream.isReady()) { // L: 1071
								var5 -= class157.pcmSampleLength; // L: 1072
								if (var5 < 0) { // L: 1073
									var5 = 0;
								}

								class304.midiPcmStream.setPcmStreamVolume(var5); // L: 1074
								break label111;
							}

							class304.midiPcmStream.clear(); // L: 1077
							class304.midiPcmStream.removeAll(); // L: 1078
							class304.midiPcmStream.field3419.clear(); // L: 1079
							if (UserComparator9.musicTrackArchive != null) { // L: 1080
								class304.musicPlayerStatus = 2;
							} else {
								class304.musicPlayerStatus = 0; // L: 1081
							}

							class237.musicTrack = null; // L: 1082
							class304.soundCache = null; // L: 1083
						}

						if (class304.field3385 > -1 && !class304.midiPcmStream.isReady()) { // L: 1085
							class409.method7687(class304.field3385, class304.field3395); // L: 1086
							class304.field3385 = -1; // L: 1087
							class304.field3395 = -1; // L: 1088
						}
					}
				} catch (Exception var8) { // L: 1091
					var8.printStackTrace(); // L: 1092
					class304.midiPcmStream.clear(); // L: 1093
					class304.musicPlayerStatus = 0; // L: 1094
					class237.musicTrack = null; // L: 1095
					class304.soundCache = null; // L: 1096
					UserComparator9.musicTrackArchive = null; // L: 1097
				}

				WorldMapSectionType.playPcmPlayers(); // L: 1100
				field739.method4146(); // L: 1101
				this.method540(); // L: 1102
				synchronized(MouseHandler.MouseHandler_instance) { // L: 1104
					MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 1105
					MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 1106
					MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 1107
					MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 1108
					MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 1109
					MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 1110
					MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 1111
					MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 1112
					MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 1113
				} // L: 1114

				if (SpriteMask.mouseWheel != null) { // L: 1116
					var5 = SpriteMask.mouseWheel.useRotation(); // L: 1117
					mouseWheelRotation = var5; // L: 1118
				}

				if (gameState == 0) { // L: 1120
					class136.load(); // L: 1121
					class125.method2918(); // L: 1122
				} else if (gameState == 5) { // L: 1124
					class445.method8221(this, MouseHandler.fontPlain11, class404.fontPlain12); // L: 1125
					class136.load(); // L: 1126
					class125.method2918(); // L: 1127
				} else if (gameState != 10 && gameState != 11) { // L: 1129
					if (gameState == 20) { // L: 1130
						class445.method8221(this, MouseHandler.fontPlain11, class404.fontPlain12); // L: 1131
						this.doCycleLoggedOut(); // L: 1132
					} else if (gameState == 50) { // L: 1134
						class445.method8221(this, MouseHandler.fontPlain11, class404.fontPlain12); // L: 1135
						this.doCycleLoggedOut(); // L: 1136
					} else if (gameState == 25) { // L: 1138
						MouseHandler.method654();
					}
				} else {
					class445.method8221(this, MouseHandler.fontPlain11, class404.fontPlain12);
				}

				if (gameState == 30) { // L: 1139
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) { // L: 1140
					this.doCycleLoggedOut();
				}

				return; // L: 1141
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false); // L: 1064
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-146179282"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = WorldMapSection2.method5104(); // L: 1145
		if (var2 && playingJingle && MouseRecorder.pcmPlayer0 != null) { // L: 1146 1147
			MouseRecorder.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field731 != 0L && WallObject.method5027() > field731) { // L: 1149 1150
			HealthBar.setWindowedMode(class237.getWindowedMode()); // L: 1151
		}

		int var3;
		if (var1) { // L: 1154
			for (var3 = 0; var3 < 100; ++var3) { // L: 1155
				field723[var3] = true;
			}
		}

		if (gameState == 0) { // L: 1157
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1158
			InvDefinition.drawTitle(class166.fontBold12, MouseHandler.fontPlain11, class404.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1159
			if (gameState == 20) { // L: 1160
				InvDefinition.drawTitle(class166.fontBold12, MouseHandler.fontPlain11, class404.fontPlain12);
			} else if (gameState == 50) { // L: 1161
				InvDefinition.drawTitle(class166.fontBold12, MouseHandler.fontPlain11, class404.fontPlain12);
			} else if (gameState == 25) { // L: 1162
				if (field576 == 1) { // L: 1163
					if (field572 > field573) { // L: 1164
						field573 = field572;
					}

					var3 = (field573 * 50 - field572 * 50) / field573; // L: 1165
					class230.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1166
				} else if (field576 == 2) { // L: 1168
					if (field574 > field580) { // L: 1169
						field580 = field574;
					}

					var3 = (field580 * 50 - field574 * 50) / field580 + 50; // L: 1170
					class230.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1171
				} else {
					class230.drawLoadingMessage("Loading - please wait.", false); // L: 1173
				}
			} else if (gameState == 30) { // L: 1175
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1176
				class230.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1177
				class230.drawLoadingMessage("Please wait...", false);
			}
		} else {
			InvDefinition.drawTitle(class166.fontBold12, MouseHandler.fontPlain11, class404.fontPlain12); // L: 1167
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1178
			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1179
				if (field724[var3]) { // L: 1180
					WorldMapSectionType.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]); // L: 1181
					field724[var3] = false; // L: 1182
				}
			}
		} else if (gameState > 0) { // L: 1186
			WorldMapSectionType.rasterProvider.drawFull(0, 0); // L: 1187

			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1188
				field724[var3] = false;
			}
		}

	} // L: 1190

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "279913198"
	)
	@Export("kill0")
	protected final void kill0() {
		if (MouseHandler.varcs.hasUnwrittenChanges()) { // L: 1193
			MouseHandler.varcs.write();
		}

		if (class85.mouseRecorder != null) { // L: 1194
			class85.mouseRecorder.isRunning = false;
		}

		class85.mouseRecorder = null; // L: 1195
		packetWriter.close(); // L: 1196
		class155.method3287(); // L: 1197
		SpriteMask.mouseWheel = null; // L: 1198
		if (MouseRecorder.pcmPlayer0 != null) { // L: 1199
			MouseRecorder.pcmPlayer0.shutdown();
		}

		if (class290.pcmPlayer1 != null) { // L: 1200
			class290.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) { // L: 1202
			NetCache.NetCache_socket.close();
		}

		NPCComposition.method3714(); // L: 1204
		if (class47.urlRequester != null) { // L: 1205
			class47.urlRequester.close(); // L: 1206
			class47.urlRequester = null; // L: 1207
		}

		try {
			JagexCache.JagexCache_dat2File.close(); // L: 1211

			for (int var1 = 0; var1 < JagexCache.idxCount; ++var1) { // L: 1212
				WorldMapSection0.JagexCache_idxFiles[var1].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 1213
			JagexCache.JagexCache_randomDat.close(); // L: 1214
		} catch (Exception var3) { // L: 1216
		}

		this.field546.method174(); // L: 1218
	} // L: 1219

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	protected final void vmethod1197() {
	} // L: 740

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-100"
	)
	boolean method1201() {
		return PcmPlayer.field300 != null && !PcmPlayer.field300.trim().isEmpty() && class4.field8 != null && !class4.field8.trim().isEmpty(); // L: 933
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	boolean method1202() {
		return WorldMapDecorationType.field3788 != null && !WorldMapDecorationType.field3788.trim().isEmpty() && Ignored.field4610 != null && !Ignored.field4610.trim().isEmpty(); // L: 937
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "355053416"
	)
	@Export("isOtlTokenRequesterInitialized")
	boolean isOtlTokenRequesterInitialized() {
		return this.field548 != null; // L: 941
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-511119349"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 945
		var2.put("grant_type", "refresh_token"); // L: 946
		var2.put("scope", "gamesso.token.create"); // L: 947
		var2.put("refresh_token", var1); // L: 948
		URL var3 = new URL(MusicPatchNode2.field3380 + "shield/oauth/token" + (new class451(var2)).method8249()); // L: 949
		class407 var4 = new class407(); // L: 950
		var4.method7678(field502); // L: 951
		var4.method7642("Host", (new URL(MusicPatchNode2.field3380)).getHost()); // L: 952
		var4.method7649(class448.field4717); // L: 953
		class9 var5 = class9.field33; // L: 954
		RefreshAccessTokenRequester var6 = this.field552; // L: 955
		if (var6 != null) { // L: 956
			this.field553 = var6.request(var5.method82(), var3, var4.method7641(), ""); // L: 957
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field550); // L: 960
			this.field551 = this.field546.method173(var7); // L: 961
		}
	} // L: 958 962

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-8429"
	)
	void method1369(String var1) throws IOException {
		URL var2 = new URL(MusicPatchNode2.field3380 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 965
		class407 var3 = new class407(); // L: 966
		var3.method7646(var1); // L: 967
		class9 var4 = class9.field36; // L: 968
		OtlTokenRequester var5 = this.field548; // L: 969
		if (var5 != null) { // L: 970
			this.field549 = var5.request(var4.method82(), var2, var3.method7641(), ""); // L: 971
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field550); // L: 974
			this.field644 = this.field546.method173(var6); // L: 975
		}
	} // L: 972 976

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1224122403"
	)
	void method1206(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(MusicPatchNode2.field3380 + "/game-session/v1/tokens"); // L: 979
		class10 var4 = new class10(var3, class9.field33, this.field550); // L: 980
		var4.method93().method7646(var1); // L: 981
		var4.method93().method7649(class448.field4717); // L: 982
		JSONObject var5 = new JSONObject(); // L: 983
		var5.put("accountId", var2); // L: 984
		var4.method91(new class450(var5)); // L: 985
		this.field644 = this.field546.method173(var4); // L: 986
	} // L: 987

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1979643134"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1271
			long var2 = WallObject.method5027(); // L: 1274
			int var4 = (int)(var2 - class19.field100); // L: 1275
			class19.field100 = var2; // L: 1276
			if (var4 > 200) { // L: 1277
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4; // L: 1278
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) { // L: 1279
				var1 = true; // L: 1280
			} else if (NetCache.NetCache_socket == null) { // L: 1283
				var1 = false; // L: 1284
			} else {
				try {
					label240: {
						if (NetCache.NetCache_loadTime > 30000) { // L: 1288
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) { // L: 1289
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first(); // L: 1290
							var6 = new Buffer(4); // L: 1291
							var6.writeByte(1); // L: 1292
							var6.writeMedium((int)var5.key); // L: 1293
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1294
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key); // L: 1295
							--NetCache.NetCache_pendingPriorityWritesCount; // L: 1296
							++NetCache.NetCache_pendingPriorityResponsesCount; // L: 1297
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) { // L: 1299
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast(); // L: 1300
							var6 = new Buffer(4); // L: 1301
							var6.writeByte(0); // L: 1302
							var6.writeMedium((int)var5.key); // L: 1303
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1304
							var5.removeDual(); // L: 1305
							NetCache.NetCache_pendingResponses.put(var5, var5.key); // L: 1306
							--NetCache.NetCache_pendingWritesCount; // L: 1307
							++NetCache.NetCache_pendingResponsesCount; // L: 1308
						}

						for (int var17 = 0; var17 < 100; ++var17) { // L: 1310
							int var18 = NetCache.NetCache_socket.available(); // L: 1311
							if (var18 < 0) { // L: 1312
								throw new IOException();
							}

							if (var18 == 0) { // L: 1313
								break;
							}

							NetCache.NetCache_loadTime = 0; // L: 1314
							byte var7 = 0; // L: 1315
							if (ApproximateRouteStrategy.NetCache_currentResponse == null) { // L: 1316
								var7 = 8;
							} else if (NetCache.field4278 == 0) { // L: 1317
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							byte[] var10000;
							int var10001;
							Buffer var24;
							if (var7 > 0) { // L: 1318
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset; // L: 1319
								if (var8 > var18) { // L: 1320
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8); // L: 1321
								if (NetCache.field4282 != 0) { // L: 1322
									for (var9 = 0; var9 < var8; ++var9) { // L: 1323
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field4282;
									}
								}

								var24 = NetCache.NetCache_responseHeaderBuffer; // L: 1325
								var24.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) { // L: 1326
									break;
								}

								if (ApproximateRouteStrategy.NetCache_currentResponse == null) { // L: 1327
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1328
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1329
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 1330
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1331
									int var12 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 1332
									long var13 = (long)(var10 + (var9 << 16)); // L: 1333
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13); // L: 1334
									class464.field4803 = true; // L: 1335
									if (var15 == null) { // L: 1336
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13); // L: 1337
										class464.field4803 = false; // L: 1338
									}

									if (var15 == null) { // L: 1340
										throw new IOException(); // L: 1341
									}

									int var16 = var11 == 0 ? 5 : 9; // L: 1343
									ApproximateRouteStrategy.NetCache_currentResponse = var15; // L: 1344
									ModeWhere.NetCache_responseArchiveBuffer = new Buffer(var12 + var16 + ApproximateRouteStrategy.NetCache_currentResponse.padding); // L: 1345
									ModeWhere.NetCache_responseArchiveBuffer.writeByte(var11); // L: 1346
									ModeWhere.NetCache_responseArchiveBuffer.writeInt(var12); // L: 1347
									NetCache.field4278 = 8; // L: 1348
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1349
								} else if (NetCache.field4278 == 0) { // L: 1352
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 1353
										NetCache.field4278 = 1; // L: 1354
										NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1355
									} else {
										ApproximateRouteStrategy.NetCache_currentResponse = null; // L: 1359
									}
								}
							} else {
								var8 = ModeWhere.NetCache_responseArchiveBuffer.array.length - ApproximateRouteStrategy.NetCache_currentResponse.padding; // L: 1365
								var9 = 512 - NetCache.field4278; // L: 1366
								if (var9 > var8 - ModeWhere.NetCache_responseArchiveBuffer.offset) { // L: 1367
									var9 = var8 - ModeWhere.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) { // L: 1368
									var9 = var18;
								}

								NetCache.NetCache_socket.read(ModeWhere.NetCache_responseArchiveBuffer.array, ModeWhere.NetCache_responseArchiveBuffer.offset, var9); // L: 1369
								if (NetCache.field4282 != 0) { // L: 1370
									for (var10 = 0; var10 < var9; ++var10) { // L: 1371
										var10000 = ModeWhere.NetCache_responseArchiveBuffer.array;
										var10001 = ModeWhere.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field4282;
									}
								}

								var24 = ModeWhere.NetCache_responseArchiveBuffer; // L: 1373
								var24.offset += var9;
								NetCache.field4278 += var9; // L: 1374
								if (var8 == ModeWhere.NetCache_responseArchiveBuffer.offset) { // L: 1375
									if (ApproximateRouteStrategy.NetCache_currentResponse.key == 16711935L) { // L: 1376
										class411.field4561 = ModeWhere.NetCache_responseArchiveBuffer; // L: 1377

										for (var10 = 0; var10 < 256; ++var10) { // L: 1378
											Archive var19 = NetCache.NetCache_archives[var10]; // L: 1379
											if (var19 != null) { // L: 1380
												Fonts.method8576(var19, var10); // L: 1381
											}
										}
									} else {
										NetCache.NetCache_crc.reset(); // L: 1386
										NetCache.NetCache_crc.update(ModeWhere.NetCache_responseArchiveBuffer.array, 0, var8); // L: 1387
										var10 = (int)NetCache.NetCache_crc.getValue(); // L: 1388
										if (var10 != ApproximateRouteStrategy.NetCache_currentResponse.crc) { // L: 1389
											try {
												NetCache.NetCache_socket.close(); // L: 1391
											} catch (Exception var22) { // L: 1393
											}

											++NetCache.NetCache_crcMismatches; // L: 1394
											NetCache.NetCache_socket = null; // L: 1395
											NetCache.field4282 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 1396
											var1 = false; // L: 1397
											break label240;
										}

										NetCache.NetCache_crcMismatches = 0; // L: 1400
										NetCache.NetCache_ioExceptions = 0; // L: 1401
										ApproximateRouteStrategy.NetCache_currentResponse.archive.write((int)(ApproximateRouteStrategy.NetCache_currentResponse.key & 65535L), ModeWhere.NetCache_responseArchiveBuffer.array, 16711680L == (ApproximateRouteStrategy.NetCache_currentResponse.key & 16711680L), class464.field4803); // L: 1402
									}

									ApproximateRouteStrategy.NetCache_currentResponse.remove(); // L: 1404
									if (class464.field4803) { // L: 1405
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount; // L: 1406
									}

									NetCache.field4278 = 0; // L: 1407
									ApproximateRouteStrategy.NetCache_currentResponse = null; // L: 1408
									ModeWhere.NetCache_responseArchiveBuffer = null; // L: 1409
								} else {
									if (NetCache.field4278 != 512) { // L: 1411
										break;
									}

									NetCache.field4278 = 0;
								}
							}
						}

						var1 = true; // L: 1415
					}
				} catch (IOException var23) {
					try {
						NetCache.NetCache_socket.close(); // L: 1419
					} catch (Exception var21) { // L: 1421
					}

					++NetCache.NetCache_ioExceptions; // L: 1422
					NetCache.NetCache_socket = null; // L: 1423
					var1 = false; // L: 1424
				}
			}

			if (!var1) { // L: 1428
				this.doCycleJs5Connect();
			}

		}
	} // L: 1429

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1830302081"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1432
			this.error("js5crc"); // L: 1433
			UserComparator8.method2855(1000); // L: 1434
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1437
				if (gameState <= 5) { // L: 1438
					this.error("js5io"); // L: 1439
					UserComparator8.method2855(1000); // L: 1440
					return; // L: 1441
				}

				field761 = 3000; // L: 1444
				NetCache.NetCache_ioExceptions = 3; // L: 1445
			}

			if (--field761 + 1 <= 0) { // L: 1448
				try {
					if (js5ConnectState == 0) { // L: 1450
						class19.js5SocketTask = GameEngine.taskHandler.newSocketTask(class17.worldHost, UserComparator8.currentPort); // L: 1451
						++js5ConnectState; // L: 1452
					}

					if (js5ConnectState == 1) { // L: 1454
						if (class19.js5SocketTask.status == 2) { // L: 1455
							this.js5Error(-1); // L: 1456
							return; // L: 1457
						}

						if (class19.js5SocketTask.status == 1) { // L: 1459
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1461
						class217.js5Socket = ItemLayer.method4271((Socket)class19.js5SocketTask.result, 40000, 5000); // L: 1462
						Buffer var1 = new Buffer(5); // L: 1463
						var1.writeByte(15); // L: 1464
						var1.writeInt(214); // L: 1465
						class217.js5Socket.write(var1.array, 0, 5); // L: 1466
						++js5ConnectState; // L: 1467
						class183.field1893 = WallObject.method5027(); // L: 1468
					}

					if (js5ConnectState == 3) { // L: 1470
						if (class217.js5Socket.available() > 0) { // L: 1471
							int var2 = class217.js5Socket.readUnsignedByte(); // L: 1472
							if (var2 != 0) { // L: 1473
								this.js5Error(var2); // L: 1474
								return; // L: 1475
							}

							++js5ConnectState; // L: 1477
						} else if (WallObject.method5027() - class183.field1893 > 30000L) { // L: 1480
							this.js5Error(-2); // L: 1481
							return; // L: 1482
						}
					}

					if (js5ConnectState == 4) { // L: 1486
						AbstractByteArrayCopier.method6553(class217.js5Socket, gameState > 20); // L: 1487
						class19.js5SocketTask = null; // L: 1488
						class217.js5Socket = null; // L: 1489
						js5ConnectState = 0; // L: 1490
						js5Errors = 0; // L: 1491
					}
				} catch (IOException var3) { // L: 1494
					this.js5Error(-3); // L: 1495
				}

			}
		}
	} // L: 1435 1497

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1930613661"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class19.js5SocketTask = null; // L: 1500
		class217.js5Socket = null; // L: 1501
		js5ConnectState = 0; // L: 1502
		if (UserComparator8.currentPort == PcmPlayer.worldPort) { // L: 1503
			UserComparator8.currentPort = SecureRandomFuture.js5Port;
		} else {
			UserComparator8.currentPort = PcmPlayer.worldPort; // L: 1504
		}

		++js5Errors; // L: 1505
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1506
			if (gameState <= 5) { // L: 1507
				this.error("js5connect_full"); // L: 1508
				UserComparator8.method2855(1000); // L: 1509
			} else {
				field761 = 3000; // L: 1511
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1513
			this.error("js5connect_outofdate"); // L: 1514
			UserComparator8.method2855(1000); // L: 1515
		} else if (js5Errors >= 4) { // L: 1517
			if (gameState <= 5) { // L: 1518
				this.error("js5connect"); // L: 1519
				UserComparator8.method2855(1000); // L: 1520
			} else {
				field761 = 3000; // L: 1522
			}
		}

	} // L: 1524

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1145642874"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket(); // L: 2099
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 2100

		try {
			if (loginState == 0) { // L: 2102
				if (class137.secureRandom == null && (secureRandomFuture.isDone() || field558 > 250)) { // L: 2103
					class137.secureRandom = secureRandomFuture.get(); // L: 2104
					secureRandomFuture.shutdown(); // L: 2105
					secureRandomFuture = null; // L: 2106
				}

				if (class137.secureRandom != null) { // L: 2108
					if (var1 != null) { // L: 2109
						var1.close(); // L: 2110
						var1 = null; // L: 2111
					}

					Interpreter.socketTask = null; // L: 2113
					hadNetworkError = false; // L: 2114
					field558 = 0; // L: 2115
					if (field633.method9212()) { // L: 2116
						if (this.method1201()) { // L: 2117
							try {
								this.requestOtlToken(class4.field8); // L: 2119
								class347.method6613(21); // L: 2120
							} catch (Throwable var25) { // L: 2122
								class260.RunException_sendStackTrace((String)null, var25); // L: 2123
								WorldMapSprite.getLoginError(65); // L: 2124
								return; // L: 2125
							}
						} else {
							if (!this.method1202()) { // L: 2128
								WorldMapSprite.getLoginError(65); // L: 2140
								return; // L: 2141
							}

							try {
								this.method1206(WorldMapDecorationType.field3788, Ignored.field4610); // L: 2130
								class347.method6613(20); // L: 2131
							} catch (Exception var24) { // L: 2133
								class260.RunException_sendStackTrace((String)null, var24); // L: 2134
								WorldMapSprite.getLoginError(65); // L: 2135
								return; // L: 2136
							}
						}
					} else {
						class347.method6613(1); // L: 2145
					}
				}
			}

			class20 var27;
			if (loginState == 21) { // L: 2149
				if (this.field553 != null) { // L: 2150
					if (!this.field553.isDone()) { // L: 2151
						return; // L: 2152
					}

					if (this.field553.isCancelled()) { // L: 2154
						WorldMapSprite.getLoginError(65); // L: 2155
						this.field553 = null; // L: 2156
						return; // L: 2157
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field553.get(); // L: 2160
						if (!var3.isSuccess()) { // L: 2161
							WorldMapSprite.getLoginError(65); // L: 2162
							this.field553 = null; // L: 2163
							return; // L: 2164
						}

						PcmPlayer.field300 = var3.getAccessToken(); // L: 2166
						class4.field8 = var3.getRefreshToken(); // L: 2167
						this.field553 = null; // L: 2168
					} catch (Exception var23) { // L: 2170
						class260.RunException_sendStackTrace((String)null, var23); // L: 2171
						WorldMapSprite.getLoginError(65); // L: 2172
						this.field553 = null; // L: 2173
						return; // L: 2174
					}
				} else {
					if (this.field551 == null) { // L: 2177
						WorldMapSprite.getLoginError(65); // L: 2207
						return; // L: 2208
					}

					if (!this.field551.method275()) { // L: 2178
						return; // L: 2179
					}

					if (this.field551.method280()) { // L: 2181
						class260.RunException_sendStackTrace(this.field551.method274(), (Throwable)null); // L: 2182
						WorldMapSprite.getLoginError(65); // L: 2183
						this.field551 = null; // L: 2184
						return; // L: 2185
					}

					var27 = this.field551.method276(); // L: 2187
					if (var27.method299() != 200) { // L: 2188
						WorldMapSprite.getLoginError(65); // L: 2189
						this.field551 = null; // L: 2190
						return; // L: 2191
					}

					field558 = 0; // L: 2193
					class450 var4 = new class450(var27.method302()); // L: 2194

					try {
						PcmPlayer.field300 = var4.method8238().getString("access_token"); // L: 2196
						class4.field8 = var4.method8238().getString("refresh_token"); // L: 2197
					} catch (Exception var22) { // L: 2199
						class260.RunException_sendStackTrace("Error parsing tokens", var22); // L: 2200
						WorldMapSprite.getLoginError(65); // L: 2201
						this.field551 = null; // L: 2202
						return; // L: 2203
					}
				}

				this.method1369(PcmPlayer.field300); // L: 2210
				class347.method6613(20); // L: 2211
			}

			if (loginState == 20) { // L: 2213
				if (this.field549 != null) { // L: 2214
					if (!this.field549.isDone()) { // L: 2215
						return; // L: 2216
					}

					if (this.field549.isCancelled()) { // L: 2218
						WorldMapSprite.getLoginError(65); // L: 2219
						this.field549 = null; // L: 2220
						return; // L: 2221
					}

					try {
						OtlTokenResponse var28 = (OtlTokenResponse)this.field549.get(); // L: 2224
						if (!var28.isSuccess()) { // L: 2225
							WorldMapSprite.getLoginError(65); // L: 2226
							this.field549 = null; // L: 2227
							return; // L: 2228
						}

						this.field708 = var28.getToken(); // L: 2230
						this.field549 = null; // L: 2231
					} catch (Exception var21) { // L: 2233
						class260.RunException_sendStackTrace((String)null, var21); // L: 2234
						WorldMapSprite.getLoginError(65); // L: 2235
						this.field549 = null; // L: 2236
						return; // L: 2237
					}
				} else {
					if (this.field644 == null) { // L: 2240
						WorldMapSprite.getLoginError(65); // L: 2276
						return; // L: 2277
					}

					if (!this.field644.method275()) { // L: 2241
						return; // L: 2242
					}

					if (this.field644.method280()) { // L: 2244
						class260.RunException_sendStackTrace(this.field644.method274(), (Throwable)null); // L: 2245
						WorldMapSprite.getLoginError(65); // L: 2246
						this.field644 = null; // L: 2247
						return; // L: 2248
					}

					var27 = this.field644.method276(); // L: 2250
					if (var27.method299() != 200) { // L: 2251
						class260.RunException_sendStackTrace("Response code: " + var27.method299() + "Response body: " + var27.method302(), (Throwable)null); // L: 2252
						WorldMapSprite.getLoginError(65); // L: 2253
						this.field644 = null; // L: 2254
						return; // L: 2255
					}

					List var30 = (List)var27.method298().get("Content-Type"); // L: 2257
					if (var30 != null && var30.contains(class448.field4717.method8223())) { // L: 2258
						try {
							JSONObject var5 = new JSONObject(var27.method302()); // L: 2260
							this.field708 = var5.getString("token"); // L: 2261
						} catch (JSONException var20) { // L: 2263
							class260.RunException_sendStackTrace((String)null, var20); // L: 2264
							WorldMapSprite.getLoginError(65); // L: 2265
							this.field644 = null; // L: 2266
							return; // L: 2267
						}
					} else {
						this.field708 = var27.method302(); // L: 2271
					}

					this.field644 = null; // L: 2273
				}

				field558 = 0; // L: 2279
				class347.method6613(1); // L: 2280
			}

			if (loginState == 1) { // L: 2282
				if (Interpreter.socketTask == null) { // L: 2283
					Interpreter.socketTask = GameEngine.taskHandler.newSocketTask(class17.worldHost, UserComparator8.currentPort); // L: 2284
				}

				if (Interpreter.socketTask.status == 2) { // L: 2286
					throw new IOException();
				}

				if (Interpreter.socketTask.status == 1) { // L: 2287
					var1 = ItemLayer.method4271((Socket)Interpreter.socketTask.result, 40000, 5000); // L: 2288
					packetWriter.setSocket(var1); // L: 2289
					Interpreter.socketTask = null; // L: 2290
					class347.method6613(2); // L: 2291
				}
			}

			PacketBufferNode var29;
			if (loginState == 2) { // L: 2294
				packetWriter.clearBuffer(); // L: 2295
				var29 = EnumComposition.method3666(); // L: 2296
				var29.packetBuffer.writeByte(LoginPacket.field3342.id); // L: 2297
				packetWriter.addNode(var29); // L: 2298
				packetWriter.flush(); // L: 2299
				var2.offset = 0; // L: 2300
				class347.method6613(3); // L: 2301
			}

			int var13;
			if (loginState == 3) { // L: 2303
				if (MouseRecorder.pcmPlayer0 != null) { // L: 2304
					MouseRecorder.pcmPlayer0.method748();
				}

				if (class290.pcmPlayer1 != null) { // L: 2305
					class290.pcmPlayer1.method748();
				}

				if (var1.isAvailable(1)) { // L: 2306
					var13 = var1.readUnsignedByte(); // L: 2307
					if (MouseRecorder.pcmPlayer0 != null) { // L: 2308
						MouseRecorder.pcmPlayer0.method748();
					}

					if (class290.pcmPlayer1 != null) { // L: 2309
						class290.pcmPlayer1.method748();
					}

					if (var13 != 0) { // L: 2310
						WorldMapSprite.getLoginError(var13); // L: 2311
						return; // L: 2312
					}

					var2.offset = 0; // L: 2314
					class347.method6613(4); // L: 2315
				}
			}

			if (loginState == 4) { // L: 2318
				if (var2.offset < 8) { // L: 2319
					var13 = var1.available(); // L: 2320
					if (var13 > 8 - var2.offset) { // L: 2321
						var13 = 8 - var2.offset;
					}

					if (var13 > 0) { // L: 2322
						var1.read(var2.array, var2.offset, var13); // L: 2323
						var2.offset += var13; // L: 2324
					}
				}

				if (var2.offset == 8) { // L: 2327
					var2.offset = 0; // L: 2328
					MusicPatchNode.field3475 = var2.readLong(); // L: 2329
					class347.method6613(5); // L: 2330
				}
			}

			int var6;
			if (loginState == 5) { // L: 2333
				packetWriter.packetBuffer.offset = 0; // L: 2334
				packetWriter.clearBuffer(); // L: 2335
				PacketBuffer var31 = new PacketBuffer(500); // L: 2336
				int[] var32 = new int[]{class137.secureRandom.nextInt(), class137.secureRandom.nextInt(), class137.secureRandom.nextInt(), class137.secureRandom.nextInt()}; // L: 2337 2338 2339 2340 2341
				var31.offset = 0; // L: 2342
				var31.writeByte(1); // L: 2343
				var31.writeInt(var32[0]); // L: 2344
				var31.writeInt(var32[1]); // L: 2345
				var31.writeInt(var32[2]); // L: 2346
				var31.writeInt(var32[3]); // L: 2347
				var31.writeLong(MusicPatchNode.field3475); // L: 2348
				if (gameState == 40) { // L: 2349
					var31.writeInt(FloorOverlayDefinition.field2268[0]); // L: 2350
					var31.writeInt(FloorOverlayDefinition.field2268[1]); // L: 2351
					var31.writeInt(FloorOverlayDefinition.field2268[2]); // L: 2352
					var31.writeInt(FloorOverlayDefinition.field2268[3]); // L: 2353
				} else {
					if (gameState == 50) { // L: 2356
						var31.writeByte(class138.field1610.rsOrdinal()); // L: 2357
						var31.writeInt(GameObject.field2850); // L: 2358
					} else {
						var31.writeByte(field677.rsOrdinal()); // L: 2361
						switch(field677.field1611) { // L: 2362
						case 0:
						case 4:
							var31.writeMedium(class322.field3521); // L: 2371
							++var31.offset; // L: 2372
							break; // L: 2373
						case 1:
							var31.writeInt(class10.clientPreferences.method2459(Login.Login_username)); // L: 2377
							break;
						case 2:
							var31.offset += 4; // L: 2365
						case 3:
						}
					}

					if (field633.method9212()) { // L: 2382
						var31.writeByte(class505.field5073.rsOrdinal()); // L: 2383
						var31.writeStringCp1252NullTerminated(this.field708); // L: 2384
					} else {
						var31.writeByte(class505.field5074.rsOrdinal()); // L: 2387
						var31.writeStringCp1252NullTerminated(Login.Login_password); // L: 2388
					}
				}

				var31.encryptRsa(class74.field913, class74.field907); // L: 2391
				FloorOverlayDefinition.field2268 = var32; // L: 2392
				PacketBufferNode var35 = EnumComposition.method3666(); // L: 2393
				var35.packetBuffer.offset = 0; // L: 2394
				if (gameState == 40) { // L: 2395
					var35.packetBuffer.writeByte(LoginPacket.field3344.id); // L: 2396
				} else {
					var35.packetBuffer.writeByte(LoginPacket.field3343.id); // L: 2399
				}

				var35.packetBuffer.writeShort(0); // L: 2401
				var6 = var35.packetBuffer.offset; // L: 2402
				var35.packetBuffer.writeInt(214); // L: 2403
				var35.packetBuffer.writeInt(1); // L: 2404
				var35.packetBuffer.writeByte(clientType); // L: 2405
				var35.packetBuffer.writeByte(field510); // L: 2406
				byte var7 = 0; // L: 2407
				var35.packetBuffer.writeByte(var7); // L: 2408
				var35.packetBuffer.writeBytes(var31.array, 0, var31.offset); // L: 2409
				int var8 = var35.packetBuffer.offset; // L: 2410
				var35.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2411
				var35.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2412
				var35.packetBuffer.writeShort(class448.canvasWidth); // L: 2413
				var35.packetBuffer.writeShort(WorldMapID.canvasHeight); // L: 2414
				PacketBuffer var9 = var35.packetBuffer; // L: 2415
				if (randomDatData != null) { // L: 2417
					var9.writeBytes(randomDatData, 0, randomDatData.length); // L: 2418
				} else {
					byte[] var10 = WorldMapCacheName.method5532(); // L: 2421
					var9.writeBytes(var10, 0, var10.length); // L: 2422
				}

				var35.packetBuffer.writeStringCp1252NullTerminated(class443.field4710); // L: 2424
				var35.packetBuffer.writeInt(class156.field1726); // L: 2425
				if (field512 > 213) { // L: 2426
					var35.packetBuffer.writeByte(0); // L: 2427
				}

				Buffer var43 = new Buffer(ChatChannel.platformInfo.size()); // L: 2429
				ChatChannel.platformInfo.write(var43); // L: 2430
				var35.packetBuffer.writeBytes(var43.array, 0, var43.array.length); // L: 2431
				var35.packetBuffer.writeByte(clientType); // L: 2432
				var35.packetBuffer.writeInt(0); // L: 2433
				var35.packetBuffer.writeInt(Language.archive17.hash); // L: 2434
				var35.packetBuffer.method8961(class180.archive8.hash); // L: 2435
				var35.packetBuffer.method8962(0); // L: 2436
				var35.packetBuffer.writeInt(ViewportMouse.field2770.hash); // L: 2437
				var35.packetBuffer.method8919(class291.archive20.hash); // L: 2438
				var35.packetBuffer.writeInt(class17.archive15.hash); // L: 2439
				var35.packetBuffer.writeInt(class53.archive10.hash); // L: 2440
				var35.packetBuffer.method8961(BuddyRankComparator.archive7.hash); // L: 2441
				var35.packetBuffer.method8962(Language.field4347.hash); // L: 2442
				var35.packetBuffer.method8961(class350.archive18.hash); // L: 2443
				var35.packetBuffer.writeInt(MouseRecorder.archive2.hash); // L: 2444
				var35.packetBuffer.writeInt(class466.field4812.hash); // L: 2445
				var35.packetBuffer.method8919(class310.archive13.hash); // L: 2446
				var35.packetBuffer.method8961(Actor.field1223.hash); // L: 2447
				var35.packetBuffer.writeInt(ReflectionCheck.archive6.hash); // L: 2448
				var35.packetBuffer.method8961(class33.archive12.hash); // L: 2449
				var35.packetBuffer.method8919(FontName.archive11.hash); // L: 2450
				var35.packetBuffer.writeInt(GrandExchangeOffer.archive14.hash); // L: 2451
				var35.packetBuffer.method8961(ChatChannel.archive19.hash); // L: 2452
				var35.packetBuffer.method8962(LoginScreenAnimation.archive4.hash); // L: 2453
				var35.packetBuffer.method8961(class305.archive9.hash); // L: 2454
				var35.packetBuffer.xteaEncrypt(var32, var8, var35.packetBuffer.offset); // L: 2455
				var35.packetBuffer.writeLengthShort(var35.packetBuffer.offset - var6); // L: 2456
				packetWriter.addNode(var35); // L: 2457
				packetWriter.flush(); // L: 2458
				packetWriter.isaacCipher = new IsaacCipher(var32); // L: 2459
				int[] var11 = new int[4]; // L: 2460

				for (int var12 = 0; var12 < 4; ++var12) { // L: 2461
					var11[var12] = var32[var12] + 50;
				}

				var2.newIsaacCipher(var11); // L: 2462
				class347.method6613(6); // L: 2463
			}

			int var14;
			if (loginState == 6 && var1.available() > 0) { // L: 2465 2466
				var13 = var1.readUnsignedByte(); // L: 2467
				if (var13 == 61) { // L: 2468
					var14 = var1.available(); // L: 2469
					class112.field1401 = var14 == 1 && var1.readUnsignedByte() == 1; // L: 2470
					class347.method6613(5); // L: 2471
				}

				if (var13 == 21 && gameState == 20) { // L: 2473
					class347.method6613(12); // L: 2474
				} else if (var13 == 2) { // L: 2476
					class347.method6613(14); // L: 2477
				} else if (var13 == 15 && gameState == 40) { // L: 2479
					packetWriter.serverPacketLength = -1; // L: 2480
					class347.method6613(19); // L: 2481
				} else if (var13 == 64) { // L: 2483
					class347.method6613(10); // L: 2484
				} else if (var13 == 23 && field782 < 1) { // L: 2486
					++field782; // L: 2487
					class347.method6613(0); // L: 2488
				} else if (var13 == 29) { // L: 2490
					class347.method6613(17); // L: 2491
				} else {
					if (var13 != 69) { // L: 2493
						WorldMapSprite.getLoginError(var13); // L: 2497
						return; // L: 2498
					}

					class347.method6613(7); // L: 2494
				}
			}

			if (loginState == 7 && var1.available() >= 2) { // L: 2502 2503
				var1.read(var2.array, 0, 2); // L: 2504
				var2.offset = 0; // L: 2505
				class134.field1570 = var2.readUnsignedShort(); // L: 2506
				class347.method6613(8); // L: 2507
			}

			if (loginState == 8 && var1.available() >= class134.field1570) { // L: 2510 2511
				var2.offset = 0; // L: 2512
				var1.read(var2.array, var2.offset, class134.field1570); // L: 2513
				class6[] var33 = new class6[]{class6.field17}; // L: 2516
				class6 var34 = var33[var2.readUnsignedByte()]; // L: 2518

				try {
					switch(var34.field15) { // L: 2522
					case 0:
						class0 var37 = new class0(); // L: 2525
						this.field652 = new class7(var2, var37); // L: 2535
						class347.method6613(9); // L: 2536
						break;
					default:
						throw new IllegalArgumentException(); // L: 2530
					}
				} catch (Exception var19) { // L: 2538
					WorldMapSprite.getLoginError(22); // L: 2539
					return; // L: 2540
				}
			}

			if (loginState == 9 && this.field652.method37()) { // L: 2544 2545
				this.field746 = this.field652.method40(); // L: 2546
				this.field652.method50(); // L: 2547
				this.field652 = null; // L: 2548
				if (this.field746 == null) { // L: 2549
					WorldMapSprite.getLoginError(22); // L: 2550
					return; // L: 2551
				}

				packetWriter.clearBuffer(); // L: 2553
				var29 = EnumComposition.method3666(); // L: 2554
				var29.packetBuffer.writeByte(LoginPacket.field3345.id); // L: 2555
				var29.packetBuffer.writeShort(this.field746.offset); // L: 2556
				var29.packetBuffer.method8903(this.field746); // L: 2557
				packetWriter.addNode(var29); // L: 2558
				packetWriter.flush(); // L: 2559
				this.field746 = null; // L: 2560
				class347.method6613(6); // L: 2561
			}

			if (loginState == 10 && var1.available() > 0) { // L: 2564 2565
				Varcs.field1366 = var1.readUnsignedByte(); // L: 2566
				class347.method6613(11); // L: 2567
			}

			if (loginState == 11 && var1.available() >= Varcs.field1366) { // L: 2570 2571
				var1.read(var2.array, 0, Varcs.field1366); // L: 2572
				var2.offset = 0; // L: 2573
				class347.method6613(6); // L: 2574
			}

			if (loginState == 12 && var1.available() > 0) { // L: 2577 2578
				field542 = (var1.readUnsignedByte() + 3) * 60; // L: 2579
				class347.method6613(13); // L: 2580
			}

			if (loginState == 13) { // L: 2583
				field558 = 0; // L: 2584
				class478.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field542 / 60 + " seconds."); // L: 2585
				if (--field542 <= 0) { // L: 2586
					class347.method6613(0);
				}

			} else {
				if (loginState == 14 && var1.available() >= 1) { // L: 2589 2590
					class323.field3524 = var1.readUnsignedByte(); // L: 2591
					class347.method6613(15); // L: 2592
				}

				if (loginState == 15 && var1.available() >= class323.field3524) { // L: 2595 2596
					boolean var45 = var1.readUnsignedByte() == 1; // L: 2597
					var1.read(var2.array, 0, 4); // L: 2598
					var2.offset = 0; // L: 2599
					boolean var44 = false; // L: 2600
					if (var45) { // L: 2601
						var14 = var2.readByteIsaac() << 24; // L: 2602
						var14 |= var2.readByteIsaac() << 16; // L: 2603
						var14 |= var2.readByteIsaac() << 8; // L: 2604
						var14 |= var2.readByteIsaac(); // L: 2605
						class10.clientPreferences.method2457(Login.Login_username, var14); // L: 2606
					}

					if (Login_isUsernameRemembered) { // L: 2608
						class10.clientPreferences.method2432(Login.Login_username); // L: 2609
					} else {
						class10.clientPreferences.method2432((String)null); // L: 2612
					}

					class100.savePreferences(); // L: 2614
					staffModLevel = var1.readUnsignedByte(); // L: 2615
					playerMod = var1.readUnsignedByte() == 1; // L: 2616
					localPlayerIndex = var1.readUnsignedByte(); // L: 2617
					localPlayerIndex <<= 8; // L: 2618
					localPlayerIndex += var1.readUnsignedByte(); // L: 2619
					field630 = var1.readUnsignedByte(); // L: 2620
					var1.read(var2.array, 0, 8); // L: 2621
					var2.offset = 0; // L: 2622
					this.accountHash = var2.readLong(); // L: 2623
					var1.read(var2.array, 0, 8); // L: 2624
					var2.offset = 0; // L: 2625
					field631 = var2.readLong(); // L: 2626
					if (field512 >= 214) { // L: 2627
						var1.read(var2.array, 0, 8); // L: 2628
						var2.offset = 0; // L: 2629
						var2.readLong(); // L: 2630
					}

					var1.read(var2.array, 0, 1); // L: 2632
					var2.offset = 0; // L: 2633
					ServerPacket[] var40 = class260.method5377(); // L: 2634
					var6 = var2.readSmartByteShortIsaac(); // L: 2635
					if (var6 < 0 || var6 >= var40.length) { // L: 2636
						throw new IOException(var6 + " " + var2.offset);
					}

					packetWriter.serverPacket = var40[var6]; // L: 2637
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2638
					var1.read(var2.array, 0, 2); // L: 2639
					var2.offset = 0; // L: 2640
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2641

					try {
						class26.method378(class347.client, "zap"); // L: 2643
					} catch (Throwable var18) { // L: 2645
					}

					class347.method6613(16); // L: 2646
				}

				if (loginState != 16) { // L: 2649
					if (loginState == 17 && var1.available() >= 2) { // L: 2759 2760
						var2.offset = 0; // L: 2761
						var1.read(var2.array, 0, 2); // L: 2762
						var2.offset = 0; // L: 2763
						class394.field4443 = var2.readUnsignedShort(); // L: 2764
						class347.method6613(18); // L: 2765
					}

					if (loginState == 18 && var1.available() >= class394.field4443) { // L: 2768 2769
						var2.offset = 0; // L: 2770
						var1.read(var2.array, 0, class394.field4443); // L: 2771
						var2.offset = 0; // L: 2772
						String var42 = var2.readStringCp1252NullTerminated(); // L: 2773
						String var38 = var2.readStringCp1252NullTerminated(); // L: 2774
						String var41 = var2.readStringCp1252NullTerminated(); // L: 2775
						class478.setLoginResponseString(var42, var38, var41); // L: 2776
						UserComparator8.method2855(10); // L: 2777
						if (field633.method9212()) { // L: 2778
							class390.method7249(9); // L: 2779
						}
					}

					if (loginState == 19) { // L: 2783
						if (packetWriter.serverPacketLength == -1) { // L: 2784
							if (var1.available() < 2) { // L: 2785
								return;
							}

							var1.read(var2.array, 0, 2); // L: 2786
							var2.offset = 0; // L: 2787
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2788
						}

						if (var1.available() >= packetWriter.serverPacketLength) { // L: 2790
							var1.read(var2.array, 0, packetWriter.serverPacketLength); // L: 2791
							var2.offset = 0; // L: 2792
							var13 = packetWriter.serverPacketLength; // L: 2793
							timer.method7625(); // L: 2794
							PendingSpawn.method2350(); // L: 2795
							ClanSettings.updatePlayer(var2); // L: 2796
							if (var13 != var2.offset) { // L: 2797
								throw new RuntimeException(); // L: 2798
							}
						}
					} else {
						++field558; // L: 2802
						if (field558 > 2000) { // L: 2803
							if (field782 < 1) { // L: 2804
								if (PcmPlayer.worldPort == UserComparator8.currentPort) { // L: 2805
									UserComparator8.currentPort = SecureRandomFuture.js5Port;
								} else {
									UserComparator8.currentPort = PcmPlayer.worldPort; // L: 2806
								}

								++field782; // L: 2807
								class347.method6613(0); // L: 2808
							} else {
								WorldMapSprite.getLoginError(-3); // L: 2811
							}
						}
					}
				} else {
					if (var1.available() >= packetWriter.serverPacketLength) { // L: 2650
						var2.offset = 0; // L: 2651
						var1.read(var2.array, 0, packetWriter.serverPacketLength); // L: 2652
						timer.method7610(); // L: 2653
						mouseLastLastPressedTimeMillis = -1L; // L: 2656
						class85.mouseRecorder.index = 0; // L: 2657
						class31.hasFocus = true; // L: 2658
						hadFocus = true; // L: 2659
						field744 = -1L; // L: 2660
						class14.method186(); // L: 2661
						packetWriter.clearBuffer(); // L: 2662
						packetWriter.packetBuffer.offset = 0; // L: 2663
						packetWriter.serverPacket = null; // L: 2664
						packetWriter.field1390 = null; // L: 2665
						packetWriter.field1393 = null; // L: 2666
						packetWriter.field1392 = null; // L: 2667
						packetWriter.serverPacketLength = 0; // L: 2668
						packetWriter.field1388 = 0; // L: 2669
						rebootTimer = 0; // L: 2670
						logoutTimer = 0; // L: 2671
						hintArrowType = 0; // L: 2672
						Player.method2340(); // L: 2673
						MouseHandler.MouseHandler_idleCycles = 0; // L: 2675
						Messages.Messages_channels.clear(); // L: 2678
						Messages.Messages_hashTable.clear(); // L: 2679
						Messages.Messages_queue.clear(); // L: 2680
						Messages.Messages_count = 0; // L: 2681
						isItemSelected = 0; // L: 2683
						isSpellSelected = false; // L: 2684
						soundEffectCount = 0; // L: 2685
						camAngleY = 0; // L: 2686
						oculusOrbState = 0; // L: 2687
						class30.field152 = null; // L: 2688
						minimapState = 0; // L: 2689
						field747 = -1; // L: 2690
						destinationX = 0; // L: 2691
						destinationY = 0; // L: 2692
						playerAttackOption = AttackOption.AttackOption_hidden; // L: 2693
						npcAttackOption = AttackOption.AttackOption_hidden; // L: 2694
						npcCount = 0; // L: 2695
						MouseRecorder.method2260(); // L: 2696

						for (var13 = 0; var13 < 2048; ++var13) { // L: 2697
							players[var13] = null;
						}

						for (var13 = 0; var13 < 65536; ++var13) { // L: 2698
							npcs[var13] = null;
						}

						combatTargetPlayerIndex = -1; // L: 2699
						projectiles.clear(); // L: 2700
						graphicsObjects.clear(); // L: 2701

						for (var13 = 0; var13 < 4; ++var13) { // L: 2702
							for (var14 = 0; var14 < 104; ++var14) { // L: 2703
								for (int var17 = 0; var17 < 104; ++var17) { // L: 2704
									groundItems[var13][var14][var17] = null; // L: 2705
								}
							}
						}

						pendingSpawns = new NodeDeque(); // L: 2709
						ApproximateRouteStrategy.friendSystem.clear(); // L: 2710

						for (var13 = 0; var13 < VarpDefinition.field1903; ++var13) { // L: 2711
							VarpDefinition var36 = class100.VarpDefinition_get(var13); // L: 2712
							if (var36 != null) { // L: 2713
								Varps.Varps_temp[var13] = 0; // L: 2714
								Varps.Varps_main[var13] = 0; // L: 2715
							}
						}

						MouseHandler.varcs.clearTransient(); // L: 2718
						followerIndex = -1; // L: 2719
						if (rootInterface != -1) { // L: 2720
							class294.method5664(rootInterface);
						}

						for (InterfaceParent var39 = (InterfaceParent)interfaceParents.first(); var39 != null; var39 = (InterfaceParent)interfaceParents.next()) { // L: 2721
							SoundCache.closeInterface(var39, true); // L: 2722
						}

						rootInterface = -1; // L: 2724
						interfaceParents = new NodeHashTable(8); // L: 2725
						meslayerContinueWidget = null; // L: 2726
						Player.method2340(); // L: 2727
						playerAppearance.method6011((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1); // L: 2728

						for (var13 = 0; var13 < 8; ++var13) { // L: 2729
							playerMenuActions[var13] = null; // L: 2730
							playerOptionsPriorities[var13] = false; // L: 2731
						}

						class6.method36(); // L: 2733
						field516 = true; // L: 2734

						for (var13 = 0; var13 < 100; ++var13) { // L: 2735
							field723[var13] = true;
						}

						var29 = ObjectComposition.getPacketBufferNode(ClientPacket.field3195, packetWriter.isaacCipher); // L: 2738
						var29.packetBuffer.writeByte(class237.getWindowedMode()); // L: 2739
						var29.packetBuffer.writeShort(class448.canvasWidth); // L: 2740
						var29.packetBuffer.writeShort(WorldMapID.canvasHeight); // L: 2741
						packetWriter.addNode(var29); // L: 2742
						class406.friendsChatManager = null; // L: 2744
						class389.guestClanSettings = null; // L: 2745
						Arrays.fill(currentClanSettings, (Object)null); // L: 2746
						VerticalAlignment.guestClanChannel = null; // L: 2747
						Arrays.fill(currentClanChannels, (Object)null); // L: 2748

						for (var13 = 0; var13 < 8; ++var13) { // L: 2749
							grandExchangeOffers[var13] = new GrandExchangeOffer();
						}

						GrandExchangeOfferUnitPriceComparator.grandExchangeEvents = null; // L: 2750
						ClanSettings.updatePlayer(var2); // L: 2752
						class208.field2314 = -1; // L: 2753
						class19.loadRegions(false, var2); // L: 2754
						packetWriter.serverPacket = null; // L: 2755
					}

				}
			}
		} catch (IOException var26) { // L: 2815
			if (field782 < 1) { // L: 2816
				if (PcmPlayer.worldPort == UserComparator8.currentPort) { // L: 2817
					UserComparator8.currentPort = SecureRandomFuture.js5Port;
				} else {
					UserComparator8.currentPort = PcmPlayer.worldPort; // L: 2818
				}

				++field782; // L: 2819
				class347.method6613(0); // L: 2820
			} else {
				WorldMapSprite.getLoginError(-2); // L: 2823
			}
		}
	} // L: 2587 2757 2800 2809 2812 2821 2824 2826

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-43"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3100
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3101
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3102
			hadNetworkError = false; // L: 3103
			Interpreter.method2034(); // L: 3104
		} else {
			if (!isMenuOpen) { // L: 3107
				class442.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1434(packetWriter); ++var1) { // L: 3108 3109
			}

			if (gameState == 30) { // L: 3111
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 3115
					boolean var29;
					if (var2 == null) { // L: 3116
						var29 = false; // L: 3117
					} else {
						var29 = true; // L: 3120
					}

					int var3;
					PacketBufferNode var30;
					if (!var29) { // L: 3122
						PacketBufferNode var14;
						int var15;
						if (timer.field4499) { // L: 3130
							var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3117, packetWriter.isaacCipher); // L: 3132
							var14.packetBuffer.writeByte(0); // L: 3133
							var15 = var14.packetBuffer.offset; // L: 3134
							timer.write(var14.packetBuffer); // L: 3135
							var14.packetBuffer.method9017(var14.packetBuffer.offset - var15); // L: 3136
							packetWriter.addNode(var14); // L: 3137
							timer.method7617(); // L: 3138
						}

						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						PacketBuffer var10000;
						synchronized(class85.mouseRecorder.lock) { // L: 3141
							if (!field522) { // L: 3142
								class85.mouseRecorder.index = 0; // L: 3228
							} else if (MouseHandler.MouseHandler_lastButton != 0 || class85.mouseRecorder.index >= 40) { // L: 3143
								var30 = null; // L: 3145
								var3 = 0; // L: 3146
								var4 = 0; // L: 3147
								var5 = 0; // L: 3148
								var6 = 0; // L: 3149

								for (var7 = 0; var7 < class85.mouseRecorder.index && (var30 == null || var30.packetBuffer.offset - var3 < 246); ++var7) { // L: 3150 3151
									var4 = var7; // L: 3152
									var8 = class85.mouseRecorder.ys[var7]; // L: 3153
									if (var8 < -1) { // L: 3154
										var8 = -1;
									} else if (var8 > 65534) { // L: 3155
										var8 = 65534;
									}

									var9 = class85.mouseRecorder.xs[var7]; // L: 3156
									if (var9 < -1) { // L: 3157
										var9 = -1;
									} else if (var9 > 65534) { // L: 3158
										var9 = 65534;
									}

									if (var9 != field519 || var8 != field520) { // L: 3159
										if (var30 == null) { // L: 3162
											var30 = ObjectComposition.getPacketBufferNode(ClientPacket.field3170, packetWriter.isaacCipher); // L: 3163
											var30.packetBuffer.writeByte(0); // L: 3164
											var3 = var30.packetBuffer.offset; // L: 3165
											var10000 = var30.packetBuffer; // L: 3166
											var10000.offset += 2;
											var5 = 0; // L: 3167
											var6 = 0; // L: 3168
										}

										int var12;
										if (field571 != -1L) { // L: 3173
											var10 = var9 - field519; // L: 3174
											var11 = var8 - field520; // L: 3175
											var12 = (int)((class85.mouseRecorder.millis[var7] - field571) / 20L); // L: 3176
											var5 = (int)((long)var5 + (class85.mouseRecorder.millis[var7] - field571) % 20L); // L: 3177
										} else {
											var10 = var9; // L: 3180
											var11 = var8; // L: 3181
											var12 = Integer.MAX_VALUE; // L: 3182
										}

										field519 = var9; // L: 3184
										field520 = var8; // L: 3185
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3186
											var10 += 32; // L: 3187
											var11 += 32; // L: 3188
											var30.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3189
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3191
											var10 += 128; // L: 3192
											var11 += 128; // L: 3193
											var30.packetBuffer.writeByte(var12 + 128); // L: 3194
											var30.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3195
										} else if (var12 < 32) { // L: 3197
											var30.packetBuffer.writeByte(var12 + 192); // L: 3198
											if (var9 != -1 && var8 != -1) { // L: 3199
												var30.packetBuffer.writeInt(var9 | var8 << 16); // L: 3200
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var30.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3203
											if (var9 != -1 && var8 != -1) { // L: 3204
												var30.packetBuffer.writeInt(var9 | var8 << 16); // L: 3205
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6; // L: 3207
										field571 = class85.mouseRecorder.millis[var7]; // L: 3208
									}
								}

								if (var30 != null) { // L: 3210
									var30.packetBuffer.method9017(var30.packetBuffer.offset - var3); // L: 3211
									var7 = var30.packetBuffer.offset; // L: 3212
									var30.packetBuffer.offset = var3; // L: 3213
									var30.packetBuffer.writeByte(var5 / var6); // L: 3214
									var30.packetBuffer.writeByte(var5 % var6); // L: 3215
									var30.packetBuffer.offset = var7; // L: 3216
									packetWriter.addNode(var30); // L: 3217
								}

								if (var4 >= class85.mouseRecorder.index) { // L: 3219
									class85.mouseRecorder.index = 0;
								} else {
									MouseRecorder var52 = class85.mouseRecorder; // L: 3221
									var52.index -= var4;
									System.arraycopy(class85.mouseRecorder.xs, var4, class85.mouseRecorder.xs, 0, class85.mouseRecorder.index); // L: 3222
									System.arraycopy(class85.mouseRecorder.ys, var4, class85.mouseRecorder.ys, 0, class85.mouseRecorder.index); // L: 3223
									System.arraycopy(class85.mouseRecorder.millis, var4, class85.mouseRecorder.millis, 0, class85.mouseRecorder.index); // L: 3224
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !class305.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3230
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 3231
							if (var16 > 32767L) { // L: 3232
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 3233
							var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3234
							if (var3 < 0) { // L: 3235
								var3 = 0;
							} else if (var3 > WorldMapID.canvasHeight) { // L: 3236
								var3 = WorldMapID.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3237
							if (var4 < 0) { // L: 3238
								var4 = 0;
							} else if (var4 > class448.canvasWidth) { // L: 3239
								var4 = class448.canvasWidth;
							}

							var5 = (int)var16; // L: 3240
							var18 = ObjectComposition.getPacketBufferNode(ClientPacket.field3174, packetWriter.isaacCipher); // L: 3241
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 3242
							var18.packetBuffer.writeShort(var4); // L: 3243
							var18.packetBuffer.writeShort(var3); // L: 3244
							packetWriter.addNode(var18); // L: 3245
						}

						if (field739.field2338 > 0) { // L: 3247
							var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3177, packetWriter.isaacCipher); // L: 3248
							var14.packetBuffer.writeShort(0); // L: 3249
							var15 = var14.packetBuffer.offset; // L: 3250
							long var19 = WallObject.method5027(); // L: 3251

							for (var5 = 0; var5 < field739.field2338; ++var5) { // L: 3252
								long var21 = var19 - field744; // L: 3253
								if (var21 > 16777215L) { // L: 3254
									var21 = 16777215L;
								}

								field744 = var19; // L: 3255
								var14.packetBuffer.writeIntME(field739.field2339[var5]); // L: 3256
								var14.packetBuffer.method9065((int)var21); // L: 3257
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15); // L: 3259
							packetWriter.addNode(var14); // L: 3260
						}

						if (field637 > 0) { // L: 3262
							--field637;
						}

						if (field739.method4134(96) || field739.method4134(97) || field739.method4134(98) || field739.method4134(99)) { // L: 3263
							field604 = true; // L: 3264
						}

						if (field604 && field637 <= 0) { // L: 3266
							field637 = 20; // L: 3267
							field604 = false; // L: 3268
							var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3183, packetWriter.isaacCipher); // L: 3270
							var14.packetBuffer.method8949(camAngleX); // L: 3271
							var14.packetBuffer.method8948(camAngleY); // L: 3272
							packetWriter.addNode(var14); // L: 3273
						}

						if (class31.hasFocus && !hadFocus) { // L: 3275
							hadFocus = true; // L: 3276
							var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3158, packetWriter.isaacCipher); // L: 3278
							var14.packetBuffer.writeByte(1); // L: 3279
							packetWriter.addNode(var14); // L: 3280
						}

						if (!class31.hasFocus && hadFocus) { // L: 3282
							hadFocus = false; // L: 3283
							var14 = ObjectComposition.getPacketBufferNode(ClientPacket.field3158, packetWriter.isaacCipher); // L: 3285
							var14.packetBuffer.writeByte(0); // L: 3286
							packetWriter.addNode(var14); // L: 3287
						}

						if (ScriptFrame.worldMap != null) { // L: 3290
							ScriptFrame.worldMap.method8387();
						}

						class448.method8227(); // L: 3291
						if (class155.field1722) { // L: 3293
							for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3295
								Player var31 = players[Players.Players_indices[var1]]; // L: 3296
								var31.method2290(); // L: 3297
							}

							class155.field1722 = false; // L: 3300
						}

						PlatformInfo.method8309(); // L: 3303
						if (gameState != 30) { // L: 3304
							return;
						}

						for (PendingSpawn var36 = (PendingSpawn)pendingSpawns.last(); var36 != null; var36 = (PendingSpawn)pendingSpawns.previous()) { // L: 3306 3307 3350
							if (var36.hitpoints > 0) { // L: 3308
								--var36.hitpoints;
							}

							ObjectComposition var23;
							boolean var37;
							if (var36.hitpoints == 0) { // L: 3309
								if (var36.objectId >= 0) { // L: 3311
									var3 = var36.objectId; // L: 3313
									var4 = var36.field1133; // L: 3314
									var23 = class175.getObjectDefinition(var3); // L: 3316
									if (var4 == 11) { // L: 3317
										var4 = 10;
									}

									if (var4 >= 5 && var4 <= 8) { // L: 3318
										var4 = 4;
									}

									var37 = var23.method3908(var4); // L: 3319
									if (!var37) { // L: 3321
										continue;
									}
								}

								class251.method5059(var36.plane, var36.type, var36.x, var36.y, var36.objectId, var36.field1140, var36.field1133, var36.field1143); // L: 3323
								var36.remove(); // L: 3324
							} else {
								if (var36.delay > 0) { // L: 3328
									--var36.delay;
								}

								if (var36.delay == 0 && var36.x >= 1 && var36.y >= 1 && var36.x <= 102 && var36.y <= 102) { // L: 3329
									if (var36.field1148 >= 0) { // L: 3331
										var3 = var36.field1148; // L: 3333
										var4 = var36.field1142; // L: 3334
										var23 = class175.getObjectDefinition(var3); // L: 3336
										if (var4 == 11) { // L: 3337
											var4 = 10;
										}

										if (var4 >= 5 && var4 <= 8) { // L: 3338
											var4 = 4;
										}

										var37 = var23.method3908(var4); // L: 3339
										if (!var37) { // L: 3341
											continue;
										}
									}

									class251.method5059(var36.plane, var36.type, var36.x, var36.y, var36.field1148, var36.field1141, var36.field1142, var36.field1143); // L: 3343
									var36.delay = -1; // L: 3344
									if (var36.field1148 == var36.objectId && var36.objectId == -1) { // L: 3345
										var36.remove();
									} else if (var36.field1148 == var36.objectId && var36.field1140 == var36.field1141 && var36.field1133 == var36.field1142) { // L: 3346
										var36.remove();
									}
								}
							}
						}

						int var10002;
						for (var1 = 0; var1 < soundEffectCount; ++var1) { // L: 3354
							var10002 = queuedSoundEffectDelays[var1]--; // L: 3355
							if (queuedSoundEffectDelays[var1] >= -10) { // L: 3356
								SoundEffect var32 = soundEffects[var1]; // L: 3368
								if (var32 == null) { // L: 3369
									var10000 = null; // L: 3370
									var32 = SoundEffect.readSoundEffect(LoginScreenAnimation.archive4, soundEffectIds[var1], 0);
									if (var32 == null) { // L: 3371
										continue;
									}

									int[] var53 = queuedSoundEffectDelays; // L: 3372
									var53[var1] += var32.calculateDelay();
									soundEffects[var1] = var32; // L: 3373
								}

								if (queuedSoundEffectDelays[var1] < 0) { // L: 3379
									if (soundLocations[var1] != 0) { // L: 3381
										var4 = (soundLocations[var1] & 255) * 128; // L: 3382
										var5 = soundLocations[var1] >> 16 & 255; // L: 3383
										var6 = var5 * 128 + 64 - Projectile.localPlayer.x; // L: 3384
										if (var6 < 0) { // L: 3385
											var6 = -var6;
										}

										var7 = soundLocations[var1] >> 8 & 255; // L: 3386
										var8 = var7 * 128 + 64 - Projectile.localPlayer.y; // L: 3387
										if (var8 < 0) { // L: 3388
											var8 = -var8;
										}

										var9 = var6 + var8 - 128; // L: 3389
										if (var9 > var4) { // L: 3390
											queuedSoundEffectDelays[var1] = -100; // L: 3391
											continue; // L: 3392
										}

										if (var9 < 0) { // L: 3394
											var9 = 0;
										}

										var3 = (var4 - var9) * class10.clientPreferences.method2450() / var4; // L: 3395
									} else {
										var3 = class10.clientPreferences.method2445(); // L: 3397
									}

									if (var3 > 0) { // L: 3398
										RawSound var24 = var32.toRawSound().resample(FloorOverlayDefinition.field2259); // L: 3399
										RawPcmStream var41 = RawPcmStream.createRawPcmStream(var24, 100, var3); // L: 3400
										var41.setNumLoops(queuedSoundEffectLoops[var1] - 1); // L: 3401
										KitDefinition.pcmStreamMixer.addSubStream(var41); // L: 3402
									}

									queuedSoundEffectDelays[var1] = -100; // L: 3404
								}
							} else {
								--soundEffectCount; // L: 3357

								for (var15 = var1; var15 < soundEffectCount; ++var15) { // L: 3358
									soundEffectIds[var15] = soundEffectIds[var15 + 1]; // L: 3359
									soundEffects[var15] = soundEffects[var15 + 1]; // L: 3360
									queuedSoundEffectLoops[var15] = queuedSoundEffectLoops[var15 + 1]; // L: 3361
									queuedSoundEffectDelays[var15] = queuedSoundEffectDelays[var15 + 1]; // L: 3362
									soundLocations[var15] = soundLocations[var15 + 1]; // L: 3363
								}

								--var1; // L: 3365
							}
						}

						if (playingJingle) { // L: 3407
							if (class304.musicPlayerStatus != 0) { // L: 3410
								var29 = true; // L: 3411
							} else {
								var29 = class304.midiPcmStream.isReady(); // L: 3414
							}

							if (!var29) { // L: 3416
								if (class10.clientPreferences.method2488() != 0 && currentTrackGroupId != -1) { // L: 3417
									class368.method6892(ReflectionCheck.archive6, currentTrackGroupId, 0, class10.clientPreferences.method2488(), false);
								}

								playingJingle = false; // L: 3418
							}
						}

						++packetWriter.field1388; // L: 3422
						if (packetWriter.field1388 > 750) { // L: 3423
							Interpreter.method2034(); // L: 3424
							return; // L: 3425
						}

						var1 = Players.Players_count; // L: 3428
						int[] var33 = Players.Players_indices; // L: 3429

						for (var3 = 0; var3 < var1; ++var3) { // L: 3430
							Player var43 = players[var33[var3]]; // L: 3431
							if (var43 != null) { // L: 3432
								class298.updateActorSequence(var43, 1); // L: 3433
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 3438
							var15 = npcIndices[var1]; // L: 3439
							NPC var25 = npcs[var15]; // L: 3440
							if (var25 != null) { // L: 3441
								class298.updateActorSequence(var25, var25.definition.size); // L: 3442
							}
						}

						class1.method3(); // L: 3446
						++field733; // L: 3447
						if (mouseCrossColor != 0) { // L: 3448
							mouseCrossState = mouseCrossState * 400 + 20; // L: 3449
							if (mouseCrossState * 400 >= 400) { // L: 3450
								mouseCrossColor = 0;
							}
						}

						Widget var38 = ClanChannel.mousedOverWidgetIf1; // L: 3452
						Widget var34 = class19.field99; // L: 3453
						ClanChannel.mousedOverWidgetIf1 = null; // L: 3454
						class19.field99 = null; // L: 3455
						draggedOnWidget = null; // L: 3456
						field693 = false; // L: 3457
						field639 = false; // L: 3458
						field741 = 0; // L: 3459

						while (field739.method4133() && field741 < 128) { // L: 3460
							if (staffModLevel >= 2 && field739.method4134(82) && field739.field2349 == 66) { // L: 3461
								StringBuilder var45 = new StringBuilder(); // L: 3464

								Message var39;
								for (Iterator var42 = Messages.Messages_hashTable.iterator(); var42.hasNext(); var45.append(var39.text).append('\n')) { // L: 3465 3471
									var39 = (Message)var42.next(); // L: 3466
									if (var39.sender != null && !var39.sender.isEmpty()) { // L: 3468
										var45.append(var39.sender).append(':'); // L: 3469
									}
								}

								String var47 = var45.toString(); // L: 3474
								class347.client.method465(var47); // L: 3477
							} else if (oculusOrbState != 1 || field739.field2348 <= 0) { // L: 3480
								field545[field741] = field739.field2349; // L: 3483
								field676[field741] = field739.field2348; // L: 3484
								++field741; // L: 3485
							}
						}

						if (RouteStrategy.method4214() && field739.method4134(82) && field739.method4134(81) && mouseWheelRotation != 0) { // L: 3487
							var3 = Projectile.localPlayer.plane - mouseWheelRotation; // L: 3488
							if (var3 < 0) { // L: 3489
								var3 = 0;
							} else if (var3 > 3) { // L: 3490
								var3 = 3;
							}

							if (var3 != Projectile.localPlayer.plane) { // L: 3491
								var4 = Projectile.localPlayer.pathX[0] + class213.baseX * 64; // L: 3492
								var5 = Projectile.localPlayer.pathY[0] + class101.baseY * 64; // L: 3493
								var18 = ObjectComposition.getPacketBufferNode(ClientPacket.field3182, packetWriter.isaacCipher); // L: 3496
								var18.packetBuffer.method9000(var5); // L: 3497
								var18.packetBuffer.writeByte(var3); // L: 3498
								var18.packetBuffer.method8949(var4); // L: 3499
								var18.packetBuffer.method8961(0); // L: 3500
								packetWriter.addNode(var18); // L: 3501
							}

							mouseWheelRotation = 0; // L: 3504
						}

						if (MouseHandler.MouseHandler_lastButton == 1) { // L: 3506
							field740.method4102(); // L: 3507
						}

						if (rootInterface != -1) { // L: 3509
							RouteStrategy.updateRootInterface(rootInterface, 0, 0, class448.canvasWidth, WorldMapID.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3510

						while (true) {
							Widget var44;
							Widget var46;
							ScriptEvent var49;
							do {
								var49 = (ScriptEvent)field717.removeLast(); // L: 3512
								if (var49 == null) { // L: 3513
									while (true) {
										do {
											var49 = (ScriptEvent)field710.removeLast(); // L: 3524
											if (var49 == null) { // L: 3525
												while (true) {
													do {
														var49 = (ScriptEvent)scriptEvents.removeLast(); // L: 3536
														if (var49 == null) { // L: 3537
															while (true) {
																while (true) {
																	class210 var51;
																	do {
																		do {
																			do {
																				var51 = (class210)field742.removeLast(); // L: 3548
																				if (var51 == null) { // L: 3549
																					this.menu(); // L: 3604
																					InterfaceParent.method2243(); // L: 3605
																					if (clickedWidget != null) { // L: 3606
																						this.method1508();
																					}

																					if (Scene.shouldSendWalk()) { // L: 3607
																						var3 = Scene.Scene_selectedX; // L: 3608
																						var4 = Scene.Scene_selectedY; // L: 3609
																						PacketBufferNode var48 = ObjectComposition.getPacketBufferNode(ClientPacket.field3134, packetWriter.isaacCipher); // L: 3611
																						var48.packetBuffer.writeByte(5); // L: 3612
																						var48.packetBuffer.writeIntME(field739.method4134(82) ? (field739.method4134(81) ? 2 : 1) : 0); // L: 3613
																						var48.packetBuffer.writeShort(class213.baseX * 64 + var3); // L: 3614
																						var48.packetBuffer.method8949(class101.baseY * 64 + var4); // L: 3615
																						packetWriter.addNode(var48); // L: 3616
																						Scene.method4554(); // L: 3617
																						mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3618
																						mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3619
																						mouseCrossColor = 1; // L: 3620
																						mouseCrossState = 0; // L: 3621
																						destinationX = var3; // L: 3622
																						destinationY = var4; // L: 3623
																					}

																					if (var38 != ClanChannel.mousedOverWidgetIf1) { // L: 3625
																						if (var38 != null) { // L: 3626
																							Messages.invalidateWidget(var38);
																						}

																						if (ClanChannel.mousedOverWidgetIf1 != null) { // L: 3627
																							Messages.invalidateWidget(ClanChannel.mousedOverWidgetIf1);
																						}
																					}

																					if (var34 != class19.field99 && field664 == field665) { // L: 3629
																						if (var34 != null) { // L: 3630
																							Messages.invalidateWidget(var34);
																						}

																						if (class19.field99 != null) { // L: 3631
																							Messages.invalidateWidget(class19.field99);
																						}
																					}

																					if (class19.field99 != null) { // L: 3633
																						if (field664 < field665) { // L: 3634
																							++field664; // L: 3635
																							if (field665 == field664) { // L: 3636
																								Messages.invalidateWidget(class19.field99);
																							}
																						}
																					} else if (field664 > 0) { // L: 3639
																						--field664;
																					}

																					HealthBar.method2549(); // L: 3640
																					if (field691) { // L: 3641
																						class408.method7686();
																					} else if (isCameraLocked) { // L: 3642
																						if (!field764) { // L: 3643
																							var3 = class126.field1469 * 16384 + 64; // L: 3644
																							var4 = class217.field2401 * 16384 + 64; // L: 3645
																							var5 = Renderable.getTileHeight(var3, var4, Clock.Client_plane) - class85.field1044; // L: 3646
																							ApproximateRouteStrategy.method1186(var3, var5, var4); // L: 3647
																						} else if (field540 != null) { // L: 3649
																							class208.cameraX = field540.vmethod8351(); // L: 3650
																							ByteArrayPool.cameraZ = field540.vmethod8348(); // L: 3651
																							if (field581) { // L: 3652
																								class152.cameraY = field540.vmethod8347(); // L: 3653
																							} else {
																								class152.cameraY = Renderable.getTileHeight(class208.cameraX, ByteArrayPool.cameraZ, Clock.Client_plane) - field540.vmethod8347(); // L: 3656
																							}

																							field540.method8359(); // L: 3658
																						}

																						if (!field725) { // L: 3660
																							var3 = HealthBarUpdate.field1233 * 16384 + 64; // L: 3661
																							var4 = class137.field1605 * 128 + 64; // L: 3662
																							var5 = Renderable.getTileHeight(var3, var4, Clock.Client_plane) - HitSplatDefinition.field2142; // L: 3663
																							var6 = var3 - class208.cameraX; // L: 3664
																							var7 = var5 - class152.cameraY; // L: 3665
																							var8 = var4 - ByteArrayPool.cameraZ; // L: 3666
																							var9 = (int)Math.sqrt((double)(var8 * var8 + var6 * var6)); // L: 3667
																							var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.9490051269531D) & 2047; // L: 3668
																							var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.9490051269531D) & 2047; // L: 3669
																							InvDefinition.method3561(var10, var11); // L: 3670
																						} else {
																							if (field769 != null) { // L: 3673
																								MusicPatchNode.cameraPitch = field769.method8343(); // L: 3674
																								MusicPatchNode.cameraPitch = Math.min(Math.max(MusicPatchNode.cameraPitch, 128), 383); // L: 3675
																								field769.method8359(); // L: 3676
																							}

																							if (field768 != null) { // L: 3678
																								class291.cameraYaw = field768.method8343() & 2047; // L: 3679
																								field768.method8359(); // L: 3680
																							}
																						}
																					}

																					for (var3 = 0; var3 < 5; ++var3) { // L: 3684
																						var10002 = field763[var3]++;
																					}

																					MouseHandler.varcs.tryWrite(); // L: 3685
																					var3 = MenuAction.method2055(); // L: 3686
																					var4 = GameEngine.field197.method348(); // L: 3689
																					if (var3 > 15000 && var4 > 15000) { // L: 3692
																						logoutTimer = 250; // L: 3693
																						MouseHandler.MouseHandler_idleCycles = 14500; // L: 3695
																						var18 = ObjectComposition.getPacketBufferNode(ClientPacket.field3178, packetWriter.isaacCipher); // L: 3698
																						packetWriter.addNode(var18); // L: 3699
																					}

																					ApproximateRouteStrategy.friendSystem.processFriendUpdates(); // L: 3701
																					WorldMapEvent.method5599(); // L: 3702
																					++packetWriter.pendingWrites; // L: 3703
																					if (packetWriter.pendingWrites > 50) { // L: 3704
																						var18 = ObjectComposition.getPacketBufferNode(ClientPacket.field3149, packetWriter.isaacCipher); // L: 3706
																						packetWriter.addNode(var18); // L: 3707
																					}

																					try {
																						packetWriter.flush(); // L: 3710
																					} catch (IOException var27) { // L: 3712
																						Interpreter.method2034(); // L: 3713
																					}

																					return; // L: 3715
																				}
																			} while(var51 == null); // L: 3551
																		} while(var51.field2332 == null);

																		if (var51.field2332.childIndex < 0) { // L: 3552
																			break;
																		}

																		var46 = FriendSystem.getWidget(var51.field2332.parentId); // L: 3553
																	} while(var46 == null || var46.children == null || var46.children.length == 0 || var51.field2332.childIndex >= var46.children.length || var51.field2332 != var46.children[var51.field2332.childIndex]); // L: 3554

																	if (var51.field2332.type == 11 && var51.field2331 == 0) { // L: 3558
																		if (var51.field2332.method6369(var51.field2335, var51.field2330, 0, 0)) { // L: 3559
																			switch(var51.field2332.method6373()) { // L: 3560
																			case 0:
																				class27.openURL(var51.field2332.method6375(), true, false); // L: 3582
																				break;
																			case 1:
																				var5 = StudioGame.getWidgetFlags(var51.field2332); // L: 3563
																				boolean var35 = (var5 >> 22 & 1) != 0; // L: 3565
																				if (var35) { // L: 3567
																					int[] var40 = var51.field2332.method6385(); // L: 3568
																					if (var40 != null) { // L: 3569
																						PacketBufferNode var26 = ObjectComposition.getPacketBufferNode(ClientPacket.field3167, packetWriter.isaacCipher); // L: 3570
																						var26.packetBuffer.method8962(var40[2]); // L: 3571
																						var26.packetBuffer.method8962(var40[0]); // L: 3572
																						var26.packetBuffer.method8961(var40[1]); // L: 3573
																						var26.packetBuffer.writeInt(var51.field2332.method6374()); // L: 3574
																						var26.packetBuffer.writeShort(var51.field2332.childIndex); // L: 3575
																						var26.packetBuffer.method8919(var51.field2332.id); // L: 3576
																						packetWriter.addNode(var26); // L: 3577
																					}
																				}
																			}
																		}
																	} else if (var51.field2332.type == 12) { // L: 3587
																		class327 var50 = var51.field2332.method6380(); // L: 3588
																		if (var50 != null && var50.method6156()) { // L: 3589
																			switch(var51.field2331) { // L: 3590
																			case 0:
																				field740.method4120(var51.field2332); // L: 3595
																				var50.method6056(true); // L: 3596
																				var50.method6159(var51.field2335, var51.field2330, field739.method4134(82), field739.method4134(81)); // L: 3597
																				break;
																			case 1:
																				var50.method6096(var51.field2335, var51.field2330); // L: 3592
																			}
																		}
																	}
																}
															}
														}

														var46 = var49.widget; // L: 3538
														if (var46.childIndex < 0) { // L: 3539
															break;
														}

														var44 = FriendSystem.getWidget(var46.parentId); // L: 3540
													} while(var44 == null || var44.children == null || var46.childIndex >= var44.children.length || var46 != var44.children[var46.childIndex]); // L: 3541

													Clock.runScriptEvent(var49); // L: 3545
												}
											}

											var46 = var49.widget; // L: 3526
											if (var46.childIndex < 0) { // L: 3527
												break;
											}

											var44 = FriendSystem.getWidget(var46.parentId); // L: 3528
										} while(var44 == null || var44.children == null || var46.childIndex >= var44.children.length || var46 != var44.children[var46.childIndex]); // L: 3529

										Clock.runScriptEvent(var49); // L: 3533
									}
								}

								var46 = var49.widget; // L: 3514
								if (var46.childIndex < 0) { // L: 3515
									break;
								}

								var44 = FriendSystem.getWidget(var46.parentId); // L: 3516
							} while(var44 == null || var44.children == null || var46.childIndex >= var44.children.length || var46 != var44.children[var46.childIndex]); // L: 3517

							Clock.runScriptEvent(var49); // L: 3521
						}
					}

					var30 = ObjectComposition.getPacketBufferNode(ClientPacket.field3166, packetWriter.isaacCipher); // L: 3123
					var30.packetBuffer.writeByte(0); // L: 3124
					var3 = var30.packetBuffer.offset; // L: 3125
					World.performReflectionCheck(var30.packetBuffer); // L: 3126
					var30.packetBuffer.method9017(var30.packetBuffer.offset - var3); // L: 3127
					packetWriter.addNode(var30); // L: 3128
				}
			}
		}
	} // L: 3105

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-327300033"
	)
	public void vmethod5914(int var1, int var2) {
		if (var1 > -1 && class10.clientPreferences.method2488() > 0 && !playingJingle) { // L: 3793
			PacketBufferNode var3 = ObjectComposition.getPacketBufferNode(ClientPacket.field3130, packetWriter.isaacCipher); // L: 3794
			var3.packetBuffer.writeInt(var1); // L: 3795
			packetWriter.addNode(var3); // L: 3796
		}

	} // L: 3798

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "597538053"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class448.canvasWidth; // L: 4611
		int var2 = WorldMapID.canvasHeight; // L: 4612
		if (super.contentWidth < var1) { // L: 4613
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4614
		}

		if (class10.clientPreferences != null) { // L: 4615
			try {
				Client var3 = class347.client; // L: 4617
				Object[] var4 = new Object[]{class237.getWindowedMode()}; // L: 4618
				JSObject.getWindow(var3).call("resize", var4); // L: 4621
			} catch (Throwable var5) { // L: 4624
			}
		}

	} // L: 4626

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) { // L: 4629
			var1 = rootInterface; // L: 4630
			if (loadInterface(var1)) { // L: 4632
				class213.drawModelComponents(class16.Widget_interfaceComponents[var1], -1); // L: 4633
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4636
			if (field723[var1]) { // L: 4637
				field724[var1] = true;
			}

			field743[var1] = field723[var1]; // L: 4638
			field723[var1] = false; // L: 4639
		}

		field722 = cycle; // L: 4641
		field662 = -1; // L: 4642
		field663 = -1; // L: 4643
		if (rootInterface != -1) { // L: 4644
			rootWidgetCount = 0; // L: 4645
			Renderable.drawWidgets(rootInterface, 0, 0, class448.canvasWidth, WorldMapID.canvasHeight, 0, 0, -1); // L: 4646
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4648
		if (showMouseCross) { // L: 4649
			if (mouseCrossColor == 1) { // L: 4650
				class12.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4651
			}

			if (mouseCrossColor == 2) { // L: 4653
				class12.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4654
			}
		}

		int var2;
		int var3;
		if (!isMenuOpen) { // L: 4657
			if (field662 != -1) { // L: 4658
				var1 = field662; // L: 4659
				var2 = field663; // L: 4660
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) { // L: 4662 4663
					var3 = class132.method3034(); // L: 4664
					String var4;
					if (isItemSelected == 1 && menuOptionsCount < 2) { // L: 4666
						var4 = "Use" + " " + field667 + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) { // L: 4667
						var4 = field671 + " " + field716 + " " + "->";
					} else {
						String var5;
						if (var3 < 0) { // L: 4671
							var5 = ""; // L: 4672
						} else if (menuTargets[var3].length() > 0) { // L: 4675
							var5 = menuActions[var3] + " " + menuTargets[var3];
						} else {
							var5 = menuActions[var3]; // L: 4676
						}

						var4 = var5; // L: 4678
					}

					if (menuOptionsCount > 2) { // L: 4680
						var4 = var4 + class349.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					class166.fontBold12.drawRandomAlphaAndSpacing(var4, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000); // L: 4681
				}
			}
		} else {
			class7.method44(); // L: 4685
		}

		if (gameDrawingMode == 3) { // L: 4686
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4687
				if (field743[var1]) { // L: 4688
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4689
				} else if (field724[var1]) { // L: 4691
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4692
				}
			}
		}

		var1 = Clock.Client_plane; // L: 4696
		var2 = Projectile.localPlayer.x; // L: 4697
		var3 = Projectile.localPlayer.y; // L: 4698
		int var12 = field733; // L: 4699

		for (ObjectSound var14 = (ObjectSound)ObjectSound.objectSounds.last(); var14 != null; var14 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 4701
			if (var14.soundEffectId != -1 || var14.soundEffectIds != null) { // L: 4702
				int var6 = 0; // L: 4703
				if (var2 > var14.maxX * 16384) { // L: 4704
					var6 += var2 - var14.maxX * 16384;
				} else if (var2 < var14.x * 16384) { // L: 4705
					var6 += var14.x * 16384 - var2;
				}

				if (var3 > var14.maxY * 128) { // L: 4706
					var6 += var3 - var14.maxY * 128;
				} else if (var3 < var14.y * 128) { // L: 4707
					var6 += var14.y * 128 - var3;
				}

				if (var6 - 64 <= var14.field843 && class10.clientPreferences.method2450() != 0 && var1 == var14.plane) { // L: 4708
					var6 -= 64; // L: 4719
					if (var6 < 0) { // L: 4720
						var6 = 0;
					}

					int var7 = (var14.field843 - var6) * class10.clientPreferences.method2450() / var14.field843; // L: 4721
					Object var10000;
					if (var14.stream1 == null) { // L: 4722
						if (var14.soundEffectId >= 0) { // L: 4723
							var10000 = null; // L: 4724
							SoundEffect var8 = SoundEffect.readSoundEffect(LoginScreenAnimation.archive4, var14.soundEffectId, 0);
							if (var8 != null) { // L: 4725
								RawSound var9 = var8.toRawSound().resample(FloorOverlayDefinition.field2259); // L: 4726
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7); // L: 4727
								var10.setNumLoops(-1); // L: 4728
								KitDefinition.pcmStreamMixer.addSubStream(var10); // L: 4729
								var14.stream1 = var10; // L: 4730
							}
						}
					} else {
						var14.stream1.method853(var7); // L: 4734
					}

					if (var14.stream2 == null) { // L: 4735
						if (var14.soundEffectIds != null && (var14.field848 -= var12) <= 0) { // L: 4736
							int var13 = (int)(Math.random() * (double)var14.soundEffectIds.length); // L: 4737
							var10000 = null; // L: 4738
							SoundEffect var15 = SoundEffect.readSoundEffect(LoginScreenAnimation.archive4, var14.soundEffectIds[var13], 0);
							if (var15 != null) { // L: 4739
								RawSound var16 = var15.toRawSound().resample(FloorOverlayDefinition.field2259); // L: 4740
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var16, 100, var7); // L: 4741
								var11.setNumLoops(0); // L: 4742
								KitDefinition.pcmStreamMixer.addSubStream(var11); // L: 4743
								var14.stream2 = var11; // L: 4744
								var14.field848 = var14.field845 + (int)(Math.random() * (double)(var14.field836 - var14.field845)); // L: 4745
							}
						}
					} else {
						var14.stream2.method853(var7); // L: 4750
						if (!var14.stream2.hasNext()) { // L: 4751
							var14.stream2 = null; // L: 4752
						}
					}
				} else {
					if (var14.stream1 != null) { // L: 4709
						KitDefinition.pcmStreamMixer.removeSubStream(var14.stream1); // L: 4710
						var14.stream1 = null; // L: 4711
					}

					if (var14.stream2 != null) { // L: 4713
						KitDefinition.pcmStreamMixer.removeSubStream(var14.stream2); // L: 4714
						var14.stream2 = null; // L: 4715
					}
				}
			}
		}

		field733 = 0; // L: 4757
	} // L: 4758

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Lem;II)Z",
		garbageValue = "-1192650719"
	)
	boolean method1220(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 6384
			class406.friendsChatManager = null; // L: 6385
		} else {
			if (class406.friendsChatManager == null) { // L: 6388
				class406.friendsChatManager = new FriendsChatManager(WorldMapScaleHandler.loginType, class347.client); // L: 6389
			}

			class406.friendsChatManager.method7749(var1.packetBuffer, var2); // L: 6391
		}

		ClanChannel.method3348(); // L: 6393
		var1.serverPacket = null; // L: 6394
		return true; // L: 6395
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Lem;I)Z",
		garbageValue = "82431150"
	)
	boolean method1612(PacketWriter var1) {
		if (class406.friendsChatManager != null) { // L: 6399
			class406.friendsChatManager.method7768(var1.packetBuffer); // L: 6400
		}

		ClanChannel.method3348(); // L: 6402
		var1.serverPacket = null; // L: 6403
		return true; // L: 6404
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Lem;S)Z",
		garbageValue = "12915"
	)
	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6409
		PacketBuffer var3 = var1.packetBuffer; // L: 6410
		if (var2 == null) { // L: 6411
			return false;
		} else {
			String var21;
			int var25;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6413
					if (var1.field1387) { // L: 6414
						if (!var2.isAvailable(1)) { // L: 6415
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6416
						var1.field1388 = 0; // L: 6417
						var1.field1387 = false; // L: 6418
					}

					var3.offset = 0; // L: 6420
					if (var3.method8881()) { // L: 6421
						if (!var2.isAvailable(1)) { // L: 6422
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6423
						var1.field1388 = 0; // L: 6424
					}

					var1.field1387 = true; // L: 6426
					ServerPacket[] var4 = class260.method5377(); // L: 6427
					var5 = var3.readSmartByteShortIsaac(); // L: 6428
					if (var5 < 0 || var5 >= var4.length) { // L: 6429
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6430
					var1.serverPacketLength = var1.serverPacket.length; // L: 6431
				}

				if (var1.serverPacketLength == -1) { // L: 6433
					if (!var2.isAvailable(1)) { // L: 6434
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6435
					var1.serverPacketLength = var3.array[0] & 255; // L: 6436
				}

				if (var1.serverPacketLength == -2) { // L: 6438
					if (!var2.isAvailable(2)) { // L: 6439
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6440
					var3.offset = 0; // L: 6441
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6442
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6444
					return false;
				}

				var3.offset = 0; // L: 6445
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6446
				var1.field1388 = 0; // L: 6447
				timer.method7612(); // L: 6448
				var1.field1392 = var1.field1393; // L: 6449
				var1.field1393 = var1.field1390; // L: 6450
				var1.field1390 = var1.serverPacket; // L: 6451
				if (ServerPacket.field3242 == var1.serverPacket) { // L: 6452
					class149.updateNpcs(false, var3); // L: 6453
					var1.serverPacket = null; // L: 6454
					return true; // L: 6455
				}

				byte var20;
				if (ServerPacket.field3274 == var1.serverPacket) { // L: 6457
					FloorUnderlayDefinition.method3803(); // L: 6458
					var20 = var3.readByte(); // L: 6459
					class145 var73 = new class145(var3); // L: 6460
					ClanSettings var60;
					if (var20 >= 0) { // L: 6462
						var60 = currentClanSettings[var20];
					} else {
						var60 = class389.guestClanSettings; // L: 6463
					}

					var73.method3141(var60); // L: 6464
					var1.serverPacket = null; // L: 6465
					return true; // L: 6466
				}

				int var64;
				if (ServerPacket.field3305 == var1.serverPacket) { // L: 6468
					var64 = var3.readUnsignedByte(); // L: 6469
					if (var3.readUnsignedByte() == 0) { // L: 6470
						grandExchangeOffers[var64] = new GrandExchangeOffer(); // L: 6471
						var3.offset += 18; // L: 6472
					} else {
						--var3.offset; // L: 6475
						grandExchangeOffers[var64] = new GrandExchangeOffer(var3, false); // L: 6476
					}

					field734 = cycleCntr; // L: 6478
					var1.serverPacket = null; // L: 6479
					return true; // L: 6480
				}

				long var7;
				long var22;
				String var24;
				String var48;
				boolean var59;
				int var61;
				if (ServerPacket.field3220 == var1.serverPacket) { // L: 6482
					var48 = var3.readStringCp1252NullTerminated(); // L: 6483
					var22 = (long)var3.readUnsignedShort(); // L: 6484
					var7 = (long)var3.readMedium(); // L: 6485
					PlayerType var9 = (PlayerType)GameObject.findEnumerated(HealthBarDefinition.PlayerType_values(), var3.readUnsignedByte()); // L: 6486
					long var10 = var7 + (var22 << 32); // L: 6487
					var59 = false; // L: 6488

					for (var61 = 0; var61 < 100; ++var61) { // L: 6489
						if (field737[var61] == var10) { // L: 6490
							var59 = true; // L: 6491
							break; // L: 6492
						}
					}

					if (ApproximateRouteStrategy.friendSystem.isIgnored(new Username(var48, WorldMapScaleHandler.loginType))) { // L: 6495
						var59 = true;
					}

					if (!var59 && field626 == 0) { // L: 6496
						field737[field777] = var10; // L: 6497
						field777 = (field777 + 1) % 100; // L: 6498
						var24 = AbstractFont.escapeBrackets(class290.method5660(class16.method218(var3))); // L: 6499
						byte var63;
						if (var9.isPrivileged) { // L: 6501
							var63 = 7;
						} else {
							var63 = 3; // L: 6502
						}

						if (var9.modIcon != -1) { // L: 6503
							class59.addGameMessage(var63, class100.method2624(var9.modIcon) + var48, var24);
						} else {
							class59.addGameMessage(var63, var48, var24); // L: 6504
						}
					}

					var1.serverPacket = null; // L: 6506
					return true; // L: 6507
				}

				int var8;
				long var27;
				int var74;
				if (ServerPacket.field3238 == var1.serverPacket) { // L: 6509
					var64 = var3.method9030(); // L: 6510
					if (var64 == 65535) { // L: 6511
						var64 = -1;
					}

					var5 = var3.readInt(); // L: 6512
					var25 = var3.method8963(); // L: 6513
					var74 = var3.readUnsignedShort(); // L: 6514
					if (var74 == 65535) { // L: 6515
						var74 = -1;
					}

					for (var8 = var74; var8 <= var64; ++var8) { // L: 6516
						var27 = (long)var8 + ((long)var25 << 32); // L: 6517
						Node var57 = widgetFlags.get(var27); // L: 6518
						if (var57 != null) { // L: 6519
							var57.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var27); // L: 6520
					}

					var1.serverPacket = null; // L: 6522
					return true; // L: 6523
				}

				if (ServerPacket.field3292 == var1.serverPacket) { // L: 6525
					class213.method4211(class294.field3203); // L: 6526
					var1.serverPacket = null; // L: 6527
					return true; // L: 6528
				}

				if (ServerPacket.field3240 == var1.serverPacket) { // L: 6530
					for (var64 = 0; var64 < Varps.Varps_main.length; ++var64) { // L: 6531
						if (Varps.Varps_temp[var64] != Varps.Varps_main[var64]) { // L: 6532
							Varps.Varps_main[var64] = Varps.Varps_temp[var64]; // L: 6533
							class393.changeGameOptions(var64); // L: 6534
							field653[++field699 - 1 & 31] = var64; // L: 6535
						}
					}

					var1.serverPacket = null; // L: 6538
					return true; // L: 6539
				}

				if (ServerPacket.field3248 == var1.serverPacket) { // L: 6541
					class213.method4211(class294.field3206); // L: 6542
					var1.serverPacket = null; // L: 6543
					return true; // L: 6544
				}

				if (ServerPacket.field3287 == var1.serverPacket) { // L: 6546
					tradeChatMode = var3.readUnsignedByte(); // L: 6547
					publicChatMode = var3.readUnsignedByte(); // L: 6548
					var1.serverPacket = null; // L: 6549
					return true; // L: 6550
				}

				int var29;
				if (ServerPacket.field3233 == var1.serverPacket) { // L: 6552
					isCameraLocked = true; // L: 6553
					field691 = false; // L: 6554
					field725 = true; // L: 6555
					var64 = var3.readShort(); // L: 6556
					var5 = var3.readShort(); // L: 6557
					var25 = class322.method5990(var5 + MusicPatchNode.cameraPitch & 2027); // L: 6558
					var74 = var64 + class291.cameraYaw; // L: 6559
					var8 = var3.readUnsignedShort(); // L: 6560
					var29 = var3.readUnsignedByte(); // L: 6561
					field769 = new class466(MusicPatchNode.cameraPitch, var25, var8, var29); // L: 6562
					field768 = new class466(class291.cameraYaw, var74, var8, var29); // L: 6563
					var1.serverPacket = null; // L: 6564
					return true; // L: 6565
				}

				if (ServerPacket.field3243 == var1.serverPacket) { // L: 6567
					var64 = var3.readUnsignedByte(); // L: 6568
					WorldMapSection2.forceDisconnect(var64); // L: 6569
					var1.serverPacket = null; // L: 6570
					return false; // L: 6571
				}

				if (ServerPacket.field3310 == var1.serverPacket) { // L: 6573
					FloorUnderlayDefinition.method3803(); // L: 6574
					var20 = var3.readByte(); // L: 6575
					if (var1.serverPacketLength == 1) { // L: 6576
						if (var20 >= 0) { // L: 6577
							currentClanSettings[var20] = null;
						} else {
							class389.guestClanSettings = null; // L: 6578
						}

						var1.serverPacket = null; // L: 6579
						return true; // L: 6580
					}

					if (var20 >= 0) { // L: 6582
						currentClanSettings[var20] = new ClanSettings(var3); // L: 6583
					} else {
						class389.guestClanSettings = new ClanSettings(var3); // L: 6586
					}

					var1.serverPacket = null; // L: 6588
					return true; // L: 6589
				}

				if (ServerPacket.field3316 == var1.serverPacket) { // L: 6591
					PlatformInfo.method8310(); // L: 6592
					weight = var3.readShort(); // L: 6593
					field711 = cycleCntr; // L: 6594
					var1.serverPacket = null; // L: 6595
					return true; // L: 6596
				}

				Widget var53;
				int var76;
				if (ServerPacket.field3321 == var1.serverPacket) { // L: 6598
					var64 = var3.readInt(); // L: 6599
					var5 = var3.readUnsignedShort(); // L: 6600
					if (var64 < -70000) { // L: 6601
						var5 += 32768;
					}

					if (var64 >= 0) { // L: 6603
						var53 = FriendSystem.getWidget(var64);
					} else {
						var53 = null; // L: 6604
					}

					if (var53 != null) { // L: 6605
						for (var74 = 0; var74 < var53.itemIds.length; ++var74) { // L: 6606
							var53.itemIds[var74] = 0; // L: 6607
							var53.field3655[var74] = 0; // L: 6608
						}
					}

					ClientPacket.clearItemContainer(var5); // L: 6611
					var74 = var3.readUnsignedShort(); // L: 6612

					for (var8 = 0; var8 < var74; ++var8) { // L: 6613
						var29 = var3.method8943(); // L: 6614
						if (var29 == 255) { // L: 6615
							var29 = var3.readInt();
						}

						var76 = var3.method8952(); // L: 6616
						if (var53 != null && var8 < var53.itemIds.length) { // L: 6617 6618
							var53.itemIds[var8] = var76; // L: 6619
							var53.field3655[var8] = var29; // L: 6620
						}

						class74.itemContainerSetItem(var5, var8, var76 - 1, var29); // L: 6623
					}

					if (var53 != null) { // L: 6625
						Messages.invalidateWidget(var53);
					}

					PlatformInfo.method8310(); // L: 6626
					field700[++field701 - 1 & 31] = var5 & 32767; // L: 6627
					var1.serverPacket = null; // L: 6628
					return true; // L: 6629
				}

				if (ServerPacket.field3250 == var1.serverPacket) { // L: 6631
					var5 = var3.method8950(); // L: 6635
					var64 = var3.method8950(); // L: 6636
					var25 = var3.method8943(); // L: 6637
					if (var5 == 65535) { // L: 6638
						var5 = -1; // L: 6639
					}

					NPC var84 = npcs[var64]; // L: 6641
					if (var84 != null) { // L: 6642
						if (var5 == var84.sequence && var5 != -1) { // L: 6643
							var8 = WorldMapLabelSize.SequenceDefinition_get(var5).field2299; // L: 6644
							if (var8 == 1) { // L: 6645
								var84.sequenceFrame = 0; // L: 6646
								var84.sequenceFrameCycle = 0; // L: 6647
								var84.sequenceDelay = var25; // L: 6648
								var84.field1200 = 0; // L: 6649
							} else if (var8 == 2) { // L: 6651
								var84.field1200 = 0; // L: 6652
							}
						} else if (var5 == -1 || var84.sequence == -1 || WorldMapLabelSize.SequenceDefinition_get(var5).field2278 >= WorldMapLabelSize.SequenceDefinition_get(var84.sequence).field2278) { // L: 6655
							var84.sequence = var5; // L: 6656
							var84.sequenceFrame = 0; // L: 6657
							var84.sequenceFrameCycle = 0; // L: 6658
							var84.sequenceDelay = var25; // L: 6659
							var84.field1200 = 0; // L: 6660
							var84.field1226 = var84.pathLength; // L: 6661
						}
					}

					var1.serverPacket = null; // L: 6665
					return true; // L: 6666
				}

				boolean var65;
				if (ServerPacket.field3264 == var1.serverPacket) { // L: 6668
					var65 = var3.readUnsignedByte() == 1; // L: 6669
					if (var65) { // L: 6670
						ParamComposition.field2112 = WallObject.method5027() - var3.readLong(); // L: 6671
						GrandExchangeOfferUnitPriceComparator.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 6672
					} else {
						GrandExchangeOfferUnitPriceComparator.grandExchangeEvents = null; // L: 6674
					}

					field712 = cycleCntr; // L: 6675
					var1.serverPacket = null; // L: 6676
					return true; // L: 6677
				}

				if (ServerPacket.field3283 == var1.serverPacket) { // L: 6679
					var64 = var3.method9030(); // L: 6680
					var5 = var3.method8964(); // L: 6681
					var53 = FriendSystem.getWidget(var5); // L: 6682
					if (var53.modelType != 2 || var64 != var53.modelId) { // L: 6683
						var53.modelType = 2; // L: 6684
						var53.modelId = var64; // L: 6685
						Messages.invalidateWidget(var53); // L: 6686
					}

					var1.serverPacket = null; // L: 6688
					return true; // L: 6689
				}

				if (ServerPacket.field3276 == var1.serverPacket) { // L: 6691
					class350.method6623(var3.readStringCp1252NullTerminated()); // L: 6692
					var1.serverPacket = null; // L: 6693
					return true; // L: 6694
				}

				if (ServerPacket.field3226 == var1.serverPacket) { // L: 6696
					var65 = var3.readBoolean(); // L: 6697
					if (var65) { // L: 6698
						if (class30.field152 == null) { // L: 6699
							class30.field152 = new class367();
						}
					} else {
						class30.field152 = null; // L: 6701
					}

					var1.serverPacket = null; // L: 6702
					return true; // L: 6703
				}

				if (ServerPacket.field3319 == var1.serverPacket) { // L: 6705
					var64 = var3.method9030(); // L: 6706
					if (var64 == 65535) { // L: 6707
						var64 = -1;
					}

					MusicPatch.playSong(var64); // L: 6708
					var1.serverPacket = null; // L: 6709
					return true; // L: 6710
				}

				if (ServerPacket.field3236 == var1.serverPacket) { // L: 6712
					var64 = var3.readUnsignedShort(); // L: 6713
					if (var64 == 65535) { // L: 6714
						var64 = -1;
					}

					var5 = var3.readMedium(); // L: 6715
					HealthBarUpdate.method2400(var64, var5); // L: 6716
					var1.serverPacket = null; // L: 6717
					return true; // L: 6718
				}

				if (ServerPacket.field3334 == var1.serverPacket) { // L: 6720
					hintArrowType = var3.readUnsignedByte(); // L: 6721
					if (hintArrowType == 1) { // L: 6722
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 6723
						if (hintArrowType == 2) { // L: 6724
							field530 = 64; // L: 6725
							field531 = 64; // L: 6726
						}

						if (hintArrowType == 3) { // L: 6728
							field530 = 0; // L: 6729
							field531 = 64; // L: 6730
						}

						if (hintArrowType == 4) { // L: 6732
							field530 = 128; // L: 6733
							field531 = 64; // L: 6734
						}

						if (hintArrowType == 5) { // L: 6736
							field530 = 64; // L: 6737
							field531 = 0; // L: 6738
						}

						if (hintArrowType == 6) { // L: 6740
							field530 = 64; // L: 6741
							field531 = 128; // L: 6742
						}

						hintArrowType = 2; // L: 6744
						field527 = var3.readUnsignedShort(); // L: 6745
						field697 = var3.readUnsignedShort(); // L: 6746
						field529 = var3.readUnsignedByte() * 4; // L: 6747
					}

					if (hintArrowType == 10) { // L: 6749
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 6750
					return true; // L: 6751
				}

				if (ServerPacket.field3237 == var1.serverPacket) { // L: 6753
					PendingSpawn.readReflectionCheck(var3, var1.serverPacketLength); // L: 6754
					var1.serverPacket = null; // L: 6755
					return true; // L: 6756
				}

				int var12;
				int var15;
				int var32;
				if (ServerPacket.field3271 == var1.serverPacket) { // L: 6758
					var29 = var3.readUnsignedByte(); // L: 6769
					var76 = var29 >> 2; // L: 6770
					var32 = var29 & 3; // L: 6771
					var12 = field570[var76]; // L: 6772
					var61 = var3.method8950(); // L: 6773
					var25 = var3.method9106(); // L: 6774
					var64 = var25 >> 16; // L: 6775
					var5 = var25 >> 8 & 255; // L: 6776
					var74 = var64 + (var25 >> 4 & 7); // L: 6777
					var8 = var5 + (var25 & 7); // L: 6778
					if (var74 >= 0 && var8 >= 0 && var74 < 103 && var8 < 103) { // L: 6779
						if (var12 == 0) { // L: 6780
							WallObject var88 = class36.scene.method4534(Clock.Client_plane, var74, var8); // L: 6781
							if (var88 != null) { // L: 6782
								var15 = class215.Entity_unpackID(var88.tag); // L: 6783
								if (var76 == 2) { // L: 6784
									var88.renderable1 = new DynamicObject(var15, 2, var32 + 4, Clock.Client_plane, var74, var8, var61, false, var88.renderable1); // L: 6785
									var88.renderable2 = new DynamicObject(var15, 2, var32 + 1 & 3, Clock.Client_plane, var74, var8, var61, false, var88.renderable2); // L: 6786
								} else {
									var88.renderable1 = new DynamicObject(var15, var76, var32, Clock.Client_plane, var74, var8, var61, false, var88.renderable1); // L: 6788
								}
							}
						} else if (var12 == 1) { // L: 6791
							DecorativeObject var86 = class36.scene.method4535(Clock.Client_plane, var74, var8); // L: 6792
							if (var86 != null) { // L: 6793
								var15 = class215.Entity_unpackID(var86.tag); // L: 6794
								if (var76 != 4 && var76 != 5) { // L: 6795
									if (var76 == 6) { // L: 6798
										var86.renderable1 = new DynamicObject(var15, 4, var32 + 4, Clock.Client_plane, var74, var8, var61, false, var86.renderable1); // L: 6799
									} else if (var76 == 7) { // L: 6801
										var86.renderable1 = new DynamicObject(var15, 4, (var32 + 2 & 3) + 4, Clock.Client_plane, var74, var8, var61, false, var86.renderable1); // L: 6802
									} else if (var76 == 8) { // L: 6804
										var86.renderable1 = new DynamicObject(var15, 4, var32 + 4, Clock.Client_plane, var74, var8, var61, false, var86.renderable1); // L: 6805
										var86.renderable2 = new DynamicObject(var15, 4, (var32 + 2 & 3) + 4, Clock.Client_plane, var74, var8, var61, false, var86.renderable2); // L: 6806
									}
								} else {
									var86.renderable1 = new DynamicObject(var15, 4, var32, Clock.Client_plane, var74, var8, var61, false, var86.renderable1); // L: 6796
								}
							}
						} else if (var12 == 2) { // L: 6810
							GameObject var83 = class36.scene.getGameObject(Clock.Client_plane, var74, var8); // L: 6811
							if (var76 == 11) { // L: 6812
								var76 = 10; // L: 6813
							}

							if (var83 != null) { // L: 6815
								var83.renderable = new DynamicObject(class215.Entity_unpackID(var83.tag), var76, var32, Clock.Client_plane, var74, var8, var61, false, var83.renderable); // L: 6816
							}
						} else if (var12 == 3) { // L: 6819
							GroundObject var85 = class36.scene.getGroundObject(Clock.Client_plane, var74, var8); // L: 6820
							if (var85 != null) { // L: 6821
								var85.renderable = new DynamicObject(class215.Entity_unpackID(var85.tag), 22, var32, Clock.Client_plane, var74, var8, var61, false, var85.renderable); // L: 6822
							}
						}
					}

					var1.serverPacket = null; // L: 6826
					return true; // L: 6827
				}

				Widget var31;
				if (ServerPacket.field3258 == var1.serverPacket) { // L: 6829
					var64 = var3.method8918(); // L: 6830
					var5 = var3.readUnsignedShort(); // L: 6831
					if (var5 == 65535) { // L: 6832
						var5 = -1;
					}

					var25 = var3.method8918(); // L: 6833
					var31 = FriendSystem.getWidget(var64); // L: 6834
					ItemComposition var94;
					if (!var31.isIf3) { // L: 6835
						if (var5 == -1) { // L: 6836
							var31.modelType = 0; // L: 6837
							var1.serverPacket = null; // L: 6838
							return true; // L: 6839
						}

						var94 = class300.ItemComposition_get(var5); // L: 6841
						var31.modelType = 4; // L: 6842
						var31.modelId = var5; // L: 6843
						var31.modelAngleX = var94.xan2d; // L: 6844
						var31.modelAngleY = var94.yan2d; // L: 6845
						var31.modelZoom = var94.zoom2d * 100 / var25; // L: 6846
						Messages.invalidateWidget(var31); // L: 6847
					} else {
						var31.itemId = var5; // L: 6850
						var31.itemQuantity = var25; // L: 6851
						var94 = class300.ItemComposition_get(var5); // L: 6852
						var31.modelAngleX = var94.xan2d; // L: 6853
						var31.modelAngleY = var94.yan2d; // L: 6854
						var31.modelAngleZ = var94.zan2d; // L: 6855
						var31.modelOffsetX = var94.offsetX2d; // L: 6856
						var31.modelOffsetY = var94.offsetY2d; // L: 6857
						var31.modelZoom = var94.zoom2d; // L: 6858
						if (var94.isStackable == 1) { // L: 6859
							var31.itemQuantityMode = 1;
						} else {
							var31.itemQuantityMode = 2; // L: 6860
						}

						if (var31.field3667 > 0) { // L: 6861
							var31.modelZoom = var31.modelZoom * 32 / var31.field3667;
						} else if (var31.rawWidth > 0) { // L: 6862
							var31.modelZoom = var31.modelZoom * 32 / var31.rawWidth;
						}

						Messages.invalidateWidget(var31); // L: 6863
					}

					var1.serverPacket = null; // L: 6865
					return true; // L: 6866
				}

				long var36;
				InterfaceParent var77;
				if (ServerPacket.field3228 == var1.serverPacket) { // L: 6868
					var64 = var3.offset + var1.serverPacketLength; // L: 6869
					var5 = var3.readUnsignedShort(); // L: 6870
					if (var5 == 65535) { // L: 6871
						var5 = -1;
					}

					var25 = var3.readUnsignedShort(); // L: 6872
					if (var5 != rootInterface) { // L: 6873
						rootInterface = var5; // L: 6874
						this.resizeRoot(false); // L: 6875
						class136.Widget_resetModelFrames(rootInterface); // L: 6876
						class149.runWidgetOnLoadListener(rootInterface); // L: 6877

						for (var74 = 0; var74 < 100; ++var74) { // L: 6878
							field723[var74] = true;
						}
					}

					InterfaceParent var91;
					for (; var25-- > 0; var91.field1057 = true) { // L: 6880 6890
						var74 = var3.readInt(); // L: 6881
						var8 = var3.readUnsignedShort(); // L: 6882
						var29 = var3.readUnsignedByte(); // L: 6883
						var91 = (InterfaceParent)interfaceParents.get((long)var74); // L: 6884
						if (var91 != null && var8 != var91.group) { // L: 6885
							SoundCache.closeInterface(var91, true); // L: 6886
							var91 = null; // L: 6887
						}

						if (var91 == null) { // L: 6889
							var91 = VarpDefinition.method3580(var74, var8, var29);
						}
					}

					for (var77 = (InterfaceParent)interfaceParents.first(); var77 != null; var77 = (InterfaceParent)interfaceParents.next()) { // L: 6892
						if (var77.field1057) { // L: 6893
							var77.field1057 = false;
						} else {
							SoundCache.closeInterface(var77, true); // L: 6895
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6898

					while (var3.offset < var64) { // L: 6899
						var74 = var3.readInt(); // L: 6900
						var8 = var3.readUnsignedShort(); // L: 6901
						var29 = var3.readUnsignedShort(); // L: 6902
						var76 = var3.readInt(); // L: 6903

						for (var32 = var8; var32 <= var29; ++var32) { // L: 6904
							var36 = (long)var32 + ((long)var74 << 32); // L: 6905
							widgetFlags.put(new IntegerNode(var76), var36); // L: 6906
						}
					}

					var1.serverPacket = null; // L: 6909
					return true; // L: 6910
				}

				if (ServerPacket.field3291 == var1.serverPacket) { // L: 6912
					var48 = var3.readStringCp1252NullTerminated(); // L: 6913
					var5 = var3.method8964(); // L: 6914
					var53 = FriendSystem.getWidget(var5); // L: 6915
					if (!var48.equals(var53.text)) { // L: 6916
						var53.text = var48; // L: 6917
						Messages.invalidateWidget(var53); // L: 6918
					}

					var1.serverPacket = null; // L: 6920
					return true; // L: 6921
				}

				int var62;
				boolean var79;
				if (ServerPacket.field3335 == var1.serverPacket) { // L: 6923
					var20 = var3.readByte(); // L: 6924
					var22 = (long)var3.readUnsignedShort(); // L: 6925
					var7 = (long)var3.readMedium(); // L: 6926
					var27 = (var22 << 32) + var7; // L: 6927
					var79 = false; // L: 6928
					ClanChannel var95 = var20 >= 0 ? currentClanChannels[var20] : VerticalAlignment.guestClanChannel; // L: 6929
					if (var95 == null) { // L: 6930
						var79 = true;
					} else {
						for (var61 = 0; var61 < 100; ++var61) { // L: 6932
							if (var27 == field737[var61]) { // L: 6933
								var79 = true; // L: 6934
								break; // L: 6935
							}
						}
					}

					if (!var79) { // L: 6939
						field737[field777] = var27; // L: 6940
						field777 = (field777 + 1) % 100; // L: 6941
						var24 = class16.method218(var3); // L: 6942
						var62 = var20 >= 0 ? 43 : 46; // L: 6943
						ApproximateRouteStrategy.addChatMessage(var62, "", var24, var95.name); // L: 6944
					}

					var1.serverPacket = null; // L: 6946
					return true; // L: 6947
				}

				if (ServerPacket.field3266 == var1.serverPacket) { // L: 6949
					var64 = var3.readUnsignedShort(); // L: 6950
					if (var64 == 65535) { // L: 6951
						var64 = -1;
					}

					rootInterface = var64; // L: 6952
					this.resizeRoot(false); // L: 6953
					class136.Widget_resetModelFrames(var64); // L: 6954
					class149.runWidgetOnLoadListener(rootInterface); // L: 6955

					for (var5 = 0; var5 < 100; ++var5) { // L: 6956
						field723[var5] = true;
					}

					var1.serverPacket = null; // L: 6957
					return true; // L: 6958
				}

				if (ServerPacket.field3260 == var1.serverPacket) { // L: 6960
					class213.method4211(class294.field3201); // L: 6961
					var1.serverPacket = null; // L: 6962
					return true; // L: 6963
				}

				if (ServerPacket.field3324 == var1.serverPacket) { // L: 6965
					destinationX = var3.readUnsignedByte(); // L: 6966
					if (destinationX == 255) { // L: 6967
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6968
					if (destinationY == 255) { // L: 6969
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6970
					return true; // L: 6971
				}

				boolean var55;
				if (ServerPacket.field3275 == var1.serverPacket) { // L: 6973
					var64 = var3.readInt(); // L: 6974
					var55 = var3.method8942() == 1; // L: 6975
					var53 = FriendSystem.getWidget(var64); // L: 6976
					if (var55 != var53.isHidden) { // L: 6977
						var53.isHidden = var55; // L: 6978
						Messages.invalidateWidget(var53); // L: 6979
					}

					var1.serverPacket = null; // L: 6981
					return true; // L: 6982
				}

				if (ServerPacket.field3323 == var1.serverPacket) { // L: 6984
					var64 = var3.readInt(); // L: 6985
					var5 = var3.readInt(); // L: 6986
					var25 = class132.getGcDuration(); // L: 6987
					PacketBufferNode var80 = ObjectComposition.getPacketBufferNode(ClientPacket.field3123, packetWriter.isaacCipher); // L: 6989
					var80.packetBuffer.method8940(GameEngine.fps); // L: 6990
					var80.packetBuffer.method8940(var25); // L: 6991
					var80.packetBuffer.method8961(var64); // L: 6992
					var80.packetBuffer.method8919(var5); // L: 6993
					packetWriter.addNode(var80); // L: 6994
					var1.serverPacket = null; // L: 6995
					return true; // L: 6996
				}

				if (ServerPacket.field3338 == var1.serverPacket) { // L: 6998
					ApproximateRouteStrategy.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 6999
					Player.FriendSystem_invalidateIgnoreds(); // L: 7000
					field707 = cycleCntr; // L: 7001
					var1.serverPacket = null; // L: 7002
					return true; // L: 7003
				}

				if (ServerPacket.field3282 == var1.serverPacket) { // L: 7005
					FriendSystem.logOut(); // L: 7006
					var1.serverPacket = null; // L: 7007
					return false; // L: 7008
				}

				if (ServerPacket.field3294 == var1.serverPacket) { // L: 7010
					var64 = var3.method8950(); // L: 7011
					var5 = var3.method8963(); // L: 7012
					var53 = FriendSystem.getWidget(var5); // L: 7013
					if (var53.modelType != 1 || var64 != var53.modelId) { // L: 7014
						var53.modelType = 1; // L: 7015
						var53.modelId = var64; // L: 7016
						Messages.invalidateWidget(var53); // L: 7017
					}

					var1.serverPacket = null; // L: 7019
					return true; // L: 7020
				}

				if (ServerPacket.field3289 == var1.serverPacket) { // L: 7022
					ApproximateRouteStrategy.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 7023
					field707 = cycleCntr; // L: 7024
					var1.serverPacket = null; // L: 7025
					return true; // L: 7026
				}

				NPC var89;
				if (ServerPacket.field3229 == var1.serverPacket) { // L: 7028
					var64 = var3.method8952(); // L: 7029
					var5 = var3.method8941(); // L: 7030
					short var81 = (short)var3.method8953(); // L: 7031
					var74 = var3.readInt(); // L: 7032
					var89 = npcs[var64]; // L: 7033
					if (var89 != null) { // L: 7034
						var89.method2565(var5, var74, var81); // L: 7035
					}

					var1.serverPacket = null; // L: 7037
					return true; // L: 7038
				}

				if (ServerPacket.field3313 == var1.serverPacket) { // L: 7040
					class213.method4211(class294.field3200); // L: 7041
					var1.serverPacket = null; // L: 7042
					return true; // L: 7043
				}

				if (ServerPacket.field3317 == var1.serverPacket) { // L: 7045
					WorldMapIcon_0.field2950 = var3.method8943(); // L: 7046
					Archive.field4231 = var3.method8942(); // L: 7047
					var1.serverPacket = null; // L: 7048
					return true; // L: 7049
				}

				if (ServerPacket.field3332 == var1.serverPacket) { // L: 7051
					class149.updateNpcs(true, var3); // L: 7052
					var1.serverPacket = null; // L: 7053
					return true; // L: 7054
				}

				if (ServerPacket.field3224 == var1.serverPacket) { // L: 7056
					rebootTimer = var3.method9030() * 30; // L: 7057
					field711 = cycleCntr; // L: 7058
					var1.serverPacket = null; // L: 7059
					return true; // L: 7060
				}

				if (ServerPacket.field3311 == var1.serverPacket) { // L: 7062
					var64 = var3.readUnsignedShort(); // L: 7063
					var5 = var3.readUnsignedByte(); // L: 7064
					var25 = var3.readUnsignedShort(); // L: 7065
					SpriteMask.queueSoundEffect(var64, var5, var25); // L: 7066
					var1.serverPacket = null; // L: 7067
					return true; // L: 7068
				}

				if (ServerPacket.field3327 == var1.serverPacket) { // L: 7070
					class74.updatePlayers(var3, var1.serverPacketLength); // L: 7071
					PendingSpawn.method2354(); // L: 7072
					var1.serverPacket = null; // L: 7073
					return true; // L: 7074
				}

				if (ServerPacket.field3337 == var1.serverPacket) { // L: 7076
					var64 = var3.method9030(); // L: 7077
					var5 = var3.method8941(); // L: 7078
					if (var64 == 65535) { // L: 7079
						var64 = -1; // L: 7080
					}

					ServerPacket.performPlayerAnimation(Projectile.localPlayer, var64, var5); // L: 7082
					var1.serverPacket = null; // L: 7083
					return true; // L: 7084
				}

				if (ServerPacket.field3300 == var1.serverPacket) { // L: 7086
					Archive.field4231 = var3.method8943(); // L: 7087
					WorldMapIcon_0.field2950 = var3.method8941(); // L: 7088

					while (var3.offset < var1.serverPacketLength) { // L: 7089
						var64 = var3.readUnsignedByte(); // L: 7090
						class294 var72 = class135.method3046()[var64]; // L: 7091
						class213.method4211(var72); // L: 7092
					}

					var1.serverPacket = null; // L: 7094
					return true; // L: 7095
				}

				if (ServerPacket.field3284 == var1.serverPacket) { // L: 7097
					var64 = var3.readInt(); // L: 7098
					if (var64 != field601) { // L: 7099
						field601 = var64; // L: 7100
						class327.method6341(); // L: 7101
					}

					var1.serverPacket = null; // L: 7103
					return true; // L: 7104
				}

				if (ServerPacket.field3261 == var1.serverPacket) { // L: 7106
					for (var64 = 0; var64 < players.length; ++var64) { // L: 7107
						if (players[var64] != null) { // L: 7108
							players[var64].sequence = -1;
						}
					}

					for (var64 = 0; var64 < npcs.length; ++var64) { // L: 7110
						if (npcs[var64] != null) { // L: 7111
							npcs[var64].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 7113
					return true; // L: 7114
				}

				String var54;
				if (ServerPacket.field3286 == var1.serverPacket) { // L: 7116
					byte[] var52 = new byte[var1.serverPacketLength]; // L: 7117
					var3.method8876(var52, 0, var52.length); // L: 7118
					Buffer var71 = new Buffer(var52); // L: 7119
					var54 = var71.readStringCp1252NullTerminated(); // L: 7120
					class27.openURL(var54, true, false); // L: 7121
					var1.serverPacket = null; // L: 7122
					return true; // L: 7123
				}

				if (ServerPacket.field3301 == var1.serverPacket) { // L: 7125
					ApproximateRouteStrategy.friendSystem.method1804(); // L: 7126
					field707 = cycleCntr; // L: 7127
					var1.serverPacket = null; // L: 7128
					return true; // L: 7129
				}

				if (ServerPacket.field3263 == var1.serverPacket) { // L: 7131
					class213.method4211(class294.field3208); // L: 7132
					var1.serverPacket = null; // L: 7133
					return true; // L: 7134
				}

				if (ServerPacket.field3227 == var1.serverPacket) { // L: 7136
					return this.method1612(var1); // L: 7137
				}

				Widget var68;
				if (ServerPacket.field3290 == var1.serverPacket) { // L: 7139
					var64 = var3.method8963(); // L: 7140
					var68 = FriendSystem.getWidget(var64); // L: 7141

					for (var25 = 0; var25 < var68.itemIds.length; ++var25) { // L: 7142
						var68.itemIds[var25] = -1; // L: 7143
						var68.itemIds[var25] = 0; // L: 7144
					}

					Messages.invalidateWidget(var68); // L: 7146
					var1.serverPacket = null; // L: 7147
					return true; // L: 7148
				}

				if (ServerPacket.field3325 == var1.serverPacket) { // L: 7150
					class213.method4211(class294.field3202); // L: 7151
					var1.serverPacket = null; // L: 7152
					return true; // L: 7153
				}

				if (ServerPacket.field3312 == var1.serverPacket) { // L: 7155
					return this.method1220(var1, 2); // L: 7156
				}

				if (ServerPacket.field3328 == var1.serverPacket) { // L: 7158
					isCameraLocked = true; // L: 7159
					field691 = false; // L: 7160
					field764 = true; // L: 7161
					class126.field1469 = var3.readUnsignedByte() * 128; // L: 7162
					class217.field2401 = var3.readUnsignedByte() * 128; // L: 7163
					var64 = var3.readUnsignedShort(); // L: 7164
					var5 = var3.readUnsignedShort(); // L: 7165
					field581 = var3.readBoolean(); // L: 7166
					var25 = var3.readUnsignedByte(); // L: 7167
					var74 = class126.field1469 * 16384 + 64; // L: 7168
					var8 = class217.field2401 * 16384 + 64; // L: 7169
					boolean var82 = false; // L: 7170
					boolean var78 = false; // L: 7171
					if (field581) { // L: 7172
						var29 = class152.cameraY; // L: 7173
						var76 = Renderable.getTileHeight(var74, var8, Clock.Client_plane) - var64; // L: 7174
					} else {
						var29 = Renderable.getTileHeight(class208.cameraX, ByteArrayPool.cameraZ, Clock.Client_plane) - class152.cameraY; // L: 7177
						var76 = var64; // L: 7178
					}

					field540 = new class465(class208.cameraX, ByteArrayPool.cameraZ, var29, var74, var8, var76, var5, var25); // L: 7180
					var1.serverPacket = null; // L: 7181
					return true; // L: 7182
				}

				Widget var92;
				if (ServerPacket.field3270 == var1.serverPacket) { // L: 7184
					var64 = var3.method8964(); // L: 7185
					var5 = var3.method8963(); // L: 7186
					InterfaceParent var58 = (InterfaceParent)interfaceParents.get((long)var64); // L: 7187
					var77 = (InterfaceParent)interfaceParents.get((long)var5); // L: 7188
					if (var77 != null) { // L: 7189
						SoundCache.closeInterface(var77, var58 == null || var77.group != var58.group);
					}

					if (var58 != null) { // L: 7190
						var58.remove(); // L: 7191
						interfaceParents.put(var58, (long)var5); // L: 7192
					}

					var92 = FriendSystem.getWidget(var64); // L: 7194
					if (var92 != null) { // L: 7195
						Messages.invalidateWidget(var92);
					}

					var92 = FriendSystem.getWidget(var5); // L: 7196
					if (var92 != null) { // L: 7197
						Messages.invalidateWidget(var92); // L: 7198
						Projectile.revalidateWidgetScroll(class16.Widget_interfaceComponents[var92.id >>> 16], var92, true); // L: 7199
					}

					if (rootInterface != -1) { // L: 7201
						class453.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 7202
					return true; // L: 7203
				}

				if (ServerPacket.field3293 == var1.serverPacket) { // L: 7205
					var64 = var3.method8964(); // L: 7206
					var5 = var3.method8918(); // L: 7207
					var53 = FriendSystem.getWidget(var64); // L: 7208
					ItemComposition.method4019(var53, var5); // L: 7209
					Messages.invalidateWidget(var53); // L: 7210
					var1.serverPacket = null; // L: 7211
					return true; // L: 7212
				}

				if (ServerPacket.field3249 == var1.serverPacket) { // L: 7214
					class127.field1495 = null; // L: 7215
					var1.serverPacket = null; // L: 7216
					return true; // L: 7217
				}

				if (ServerPacket.field3231 == var1.serverPacket) { // L: 7219
					field691 = false; // L: 7220
					isCameraLocked = false; // L: 7221
					field764 = false; // L: 7222
					field725 = false; // L: 7223
					HealthBarUpdate.field1233 = 0; // L: 7224
					class137.field1605 = 0; // L: 7225
					HitSplatDefinition.field2142 = 0; // L: 7226
					field581 = false; // L: 7227
					BufferedSource.field4636 = 0; // L: 7228
					class209.field2322 = 0; // L: 7229
					LoginScreenAnimation.field1255 = 0; // L: 7230
					UserComparator4.field1410 = 0; // L: 7231
					class126.field1469 = 0; // L: 7232
					class217.field2401 = 0; // L: 7233
					class85.field1044 = 0; // L: 7234
					field540 = null; // L: 7235
					field769 = null; // L: 7236
					field768 = null; // L: 7237

					for (var64 = 0; var64 < 5; ++var64) { // L: 7238
						field771[var64] = false; // L: 7239
					}

					var1.serverPacket = null; // L: 7241
					return true; // L: 7242
				}

				if (ServerPacket.field3303 == var1.serverPacket) { // L: 7244
					isCameraLocked = true; // L: 7245
					field691 = false; // L: 7246
					field725 = false; // L: 7247
					HealthBarUpdate.field1233 = var3.readUnsignedByte() * 128; // L: 7248
					class137.field1605 = var3.readUnsignedByte() * 16384; // L: 7249
					HitSplatDefinition.field2142 = var3.readUnsignedShort(); // L: 7250
					BufferedSource.field4636 = var3.readUnsignedByte(); // L: 7251
					class209.field2322 = var3.readUnsignedByte(); // L: 7252
					if (class209.field2322 >= 100) { // L: 7253
						var64 = HealthBarUpdate.field1233 * 16384 + 64; // L: 7254
						var5 = class137.field1605 * 128 + 64; // L: 7255
						var25 = Renderable.getTileHeight(var64, var5, Clock.Client_plane) - HitSplatDefinition.field2142; // L: 7256
						var74 = var64 - class208.cameraX; // L: 7257
						var8 = var25 - class152.cameraY; // L: 7258
						var29 = var5 - ByteArrayPool.cameraZ; // L: 7259
						var76 = (int)Math.sqrt((double)(var29 * var29 + var74 * var74)); // L: 7260
						MusicPatchNode.cameraPitch = (int)(Math.atan2((double)var8, (double)var76) * 325.9490051269531D) & 2047; // L: 7261
						class291.cameraYaw = (int)(Math.atan2((double)var74, (double)var29) * -325.9490051269531D) & 2047; // L: 7262
						if (MusicPatchNode.cameraPitch < 128) { // L: 7263
							MusicPatchNode.cameraPitch = 128;
						}

						if (MusicPatchNode.cameraPitch > 383) { // L: 7264
							MusicPatchNode.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 7266
					return true; // L: 7267
				}

				if (ServerPacket.field3234 == var1.serverPacket) { // L: 7269
					World var51 = new World(); // L: 7270
					var51.host = var3.readStringCp1252NullTerminated(); // L: 7271
					var51.id = var3.readUnsignedShort(); // L: 7272
					var5 = var3.readInt(); // L: 7273
					var51.properties = var5; // L: 7274
					UserComparator8.method2855(45); // L: 7275
					var2.close(); // L: 7276
					var2 = null; // L: 7277
					class14.changeWorld(var51); // L: 7278
					var1.serverPacket = null; // L: 7279
					return false; // L: 7280
				}

				if (ServerPacket.field3333 == var1.serverPacket) { // L: 7282
					Archive.field4231 = var3.readUnsignedByte(); // L: 7283
					WorldMapIcon_0.field2950 = var3.readUnsignedByte(); // L: 7284

					for (var64 = WorldMapIcon_0.field2950; var64 < WorldMapIcon_0.field2950 + 8; ++var64) { // L: 7285
						for (var5 = Archive.field4231; var5 < Archive.field4231 + 8; ++var5) { // L: 7286
							if (groundItems[Clock.Client_plane][var64][var5] != null) { // L: 7287
								groundItems[Clock.Client_plane][var64][var5] = null; // L: 7288
								class128.updateItemPile(var64, var5); // L: 7289
							}
						}
					}

					for (PendingSpawn var50 = (PendingSpawn)pendingSpawns.last(); var50 != null; var50 = (PendingSpawn)pendingSpawns.previous()) { // L: 7293 7294 7296
						if (var50.x >= WorldMapIcon_0.field2950 && var50.x < WorldMapIcon_0.field2950 + 8 && var50.y >= Archive.field4231 && var50.y < Archive.field4231 + 8 && var50.plane == Clock.Client_plane) { // L: 7295
							var50.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 7298
					return true; // L: 7299
				}

				if (ServerPacket.field3297 == var1.serverPacket) { // L: 7301
					isCameraLocked = true; // L: 7302
					field691 = false; // L: 7303
					field725 = true; // L: 7304
					var64 = GrandExchangeOfferTotalQuantityComparator.method6812(var3.readShort() & 2027); // L: 7305
					var5 = class322.method5990(var3.readShort() & 2027); // L: 7306
					var25 = var3.readUnsignedShort(); // L: 7307
					var74 = var3.readUnsignedByte(); // L: 7308
					field769 = new class466(MusicPatchNode.cameraPitch, var5, var25, var74); // L: 7309
					field768 = new class466(class291.cameraYaw, var64, var25, var74); // L: 7310
					var1.serverPacket = null; // L: 7311
					return true; // L: 7312
				}

				if (ServerPacket.field3246 == var1.serverPacket) { // L: 7314
					var20 = var3.method8971(); // L: 7315
					var5 = var3.method8952(); // L: 7316
					Varps.Varps_temp[var5] = var20; // L: 7317
					if (Varps.Varps_main[var5] != var20) { // L: 7318
						Varps.Varps_main[var5] = var20; // L: 7319
					}

					class393.changeGameOptions(var5); // L: 7321
					field653[++field699 - 1 & 31] = var5; // L: 7322
					var1.serverPacket = null; // L: 7323
					return true; // L: 7324
				}

				if (ServerPacket.field3295 == var1.serverPacket) { // L: 7326
					var64 = var3.method8943(); // L: 7327
					var21 = var3.readStringCp1252NullTerminated(); // L: 7328
					var25 = var3.readUnsignedByte(); // L: 7329
					if (var25 >= 1 && var25 <= 8) { // L: 7330
						if (var21.equalsIgnoreCase("null")) { // L: 7331
							var21 = null;
						}

						playerMenuActions[var25 - 1] = var21; // L: 7332
						playerOptionsPriorities[var25 - 1] = var64 == 0; // L: 7333
					}

					var1.serverPacket = null; // L: 7335
					return true; // L: 7336
				}

				if (ServerPacket.field3279 == var1.serverPacket) { // L: 7338
					var64 = var3.readInt(); // L: 7339
					var5 = var3.readUnsignedShort(); // L: 7340
					if (var64 < -70000) { // L: 7341
						var5 += 32768;
					}

					if (var64 >= 0) { // L: 7343
						var53 = FriendSystem.getWidget(var64);
					} else {
						var53 = null; // L: 7344
					}

					for (; var3.offset < var1.serverPacketLength; class74.itemContainerSetItem(var5, var74, var8 - 1, var29)) { // L: 7345 7359
						var74 = var3.readUShortSmart(); // L: 7346
						var8 = var3.readUnsignedShort(); // L: 7347
						var29 = 0; // L: 7348
						if (var8 != 0) { // L: 7349
							var29 = var3.readUnsignedByte(); // L: 7350
							if (var29 == 255) { // L: 7351
								var29 = var3.readInt();
							}
						}

						if (var53 != null && var74 >= 0 && var74 < var53.itemIds.length) { // L: 7353 7354
							var53.itemIds[var74] = var8; // L: 7355
							var53.field3655[var74] = var29; // L: 7356
						}
					}

					if (var53 != null) { // L: 7361
						Messages.invalidateWidget(var53);
					}

					PlatformInfo.method8310(); // L: 7362
					field700[++field701 - 1 & 31] = var5 & 32767; // L: 7363
					var1.serverPacket = null; // L: 7364
					return true; // L: 7365
				}

				if (ServerPacket.field3315 == var1.serverPacket) { // L: 7367
					var64 = var3.readUnsignedByte(); // L: 7368
					var5 = var3.readUnsignedByte(); // L: 7369
					var25 = var3.readUnsignedByte(); // L: 7370
					var74 = var3.readUnsignedByte(); // L: 7371
					field771[var64] = true; // L: 7372
					field772[var64] = var5; // L: 7373
					field695[var64] = var25; // L: 7374
					field774[var64] = var74; // L: 7375
					field763[var64] = 0; // L: 7376
					var1.serverPacket = null; // L: 7377
					return true; // L: 7378
				}

				if (ServerPacket.field3280 == var1.serverPacket) { // L: 7380
					var64 = var3.method8953(); // L: 7381
					var5 = var3.readInt(); // L: 7382
					var53 = FriendSystem.getWidget(var5); // L: 7383
					if (var64 != var53.sequenceId || var64 == -1) { // L: 7384
						var53.sequenceId = var64; // L: 7385
						var53.modelFrame = 0; // L: 7386
						var53.modelFrameCycle = 0; // L: 7387
						Messages.invalidateWidget(var53); // L: 7388
					}

					var1.serverPacket = null; // L: 7390
					return true; // L: 7391
				}

				if (ServerPacket.field3232 == var1.serverPacket) { // L: 7393
					var29 = var3.readUnsignedShort(); // L: 7402
					var32 = var3.method8952(); // L: 7403
					var25 = var3.method9106(); // L: 7404
					var64 = var25 >> 16; // L: 7405
					var5 = var25 >> 8 & 255; // L: 7406
					var74 = var64 + (var25 >> 4 & 7); // L: 7407
					var8 = var5 + (var25 & 7); // L: 7408
					var76 = var3.method8943(); // L: 7409
					if (var74 >= 0 && var8 >= 0 && var74 < 104 && var8 < 104) { // L: 7410
						var74 = var74 * 128 + 64; // L: 7411
						var8 = var8 * 128 + 64; // L: 7412
						GraphicsObject var38 = new GraphicsObject(var29, Clock.Client_plane, var74, var8, Renderable.getTileHeight(var74, var8, Clock.Client_plane) - var76, var32, cycle); // L: 7413
						graphicsObjects.addFirst(var38); // L: 7414
					}

					var1.serverPacket = null; // L: 7416
					return true; // L: 7417
				}

				if (ServerPacket.field3299 == var1.serverPacket) { // L: 7419
					isCameraLocked = true; // L: 7420
					field691 = false; // L: 7421
					field725 = true; // L: 7422
					HealthBarUpdate.field1233 = var3.readUnsignedByte() * 128; // L: 7423
					class137.field1605 = var3.readUnsignedByte() * 16384; // L: 7424
					HitSplatDefinition.field2142 = var3.readUnsignedShort(); // L: 7425
					var64 = var3.readUnsignedShort(); // L: 7426
					var5 = var3.readUnsignedByte(); // L: 7427
					var25 = HealthBarUpdate.field1233 * 16384 + 64; // L: 7428
					var74 = class137.field1605 * 128 + 64; // L: 7429
					var8 = Renderable.getTileHeight(var25, var74, Clock.Client_plane) - HitSplatDefinition.field2142; // L: 7430
					var29 = var25 - class208.cameraX; // L: 7431
					var76 = var8 - class152.cameraY; // L: 7432
					var32 = var74 - ByteArrayPool.cameraZ; // L: 7433
					double var93 = Math.sqrt((double)(var29 * var29 + var32 * var32)); // L: 7434
					var62 = class322.method5990((int)(Math.atan2((double)var76, var93) * 325.9490051269531D) & 2047); // L: 7435
					var15 = GrandExchangeOfferTotalQuantityComparator.method6812((int)(Math.atan2((double)var29, (double)var32) * -325.9490051269531D) & 2047); // L: 7436
					field769 = new class466(MusicPatchNode.cameraPitch, var62, var64, var5); // L: 7437
					field768 = new class466(class291.cameraYaw, var15, var64, var5); // L: 7438
					var1.serverPacket = null; // L: 7439
					return true; // L: 7440
				}

				if (ServerPacket.field3244 == var1.serverPacket) { // L: 7442
					var64 = var3.readUnsignedShort(); // L: 7443
					var5 = var3.method8950(); // L: 7444
					var25 = var3.method8918(); // L: 7445
					var31 = FriendSystem.getWidget(var25); // L: 7446
					var31.field3659 = var64 + (var5 << 16); // L: 7447
					var1.serverPacket = null; // L: 7448
					return true; // L: 7449
				}

				if (ServerPacket.field3320 == var1.serverPacket) { // L: 7451
					var64 = var3.readInt(); // L: 7452
					var5 = var3.method9030(); // L: 7453
					Varps.Varps_temp[var5] = var64; // L: 7454
					if (Varps.Varps_main[var5] != var64) { // L: 7455
						Varps.Varps_main[var5] = var64; // L: 7456
					}

					class393.changeGameOptions(var5); // L: 7458
					field653[++field699 - 1 & 31] = var5; // L: 7459
					var1.serverPacket = null; // L: 7460
					return true; // L: 7461
				}

				if (ServerPacket.field3298 == var1.serverPacket) { // L: 7463
					class213.method4211(class294.field3207); // L: 7464
					var1.serverPacket = null; // L: 7465
					return true; // L: 7466
				}

				if (ServerPacket.field3230 == var1.serverPacket) { // L: 7468
					isCameraLocked = true; // L: 7469
					field691 = false; // L: 7470
					field764 = true; // L: 7471
					class126.field1469 = var3.readUnsignedByte() * 128; // L: 7472
					class217.field2401 = var3.readUnsignedByte() * 128; // L: 7473
					var64 = var3.readUnsignedShort(); // L: 7474
					var5 = var3.readUnsignedByte() * 128 + 64; // L: 7475
					var25 = var3.readUnsignedByte() * 128 + 64; // L: 7476
					var74 = var3.readUnsignedShort(); // L: 7477
					field581 = var3.readBoolean(); // L: 7478
					var8 = var3.readUnsignedByte(); // L: 7479
					var29 = class126.field1469 * 16384 + 64; // L: 7480
					var76 = class217.field2401 * 16384 + 64; // L: 7481
					var79 = false; // L: 7482
					var59 = false; // L: 7483
					if (field581) { // L: 7484
						var32 = class152.cameraY; // L: 7485
						var12 = Renderable.getTileHeight(var29, var76, Clock.Client_plane) - var64; // L: 7486
					} else {
						var32 = Renderable.getTileHeight(class208.cameraX, ByteArrayPool.cameraZ, Clock.Client_plane) - class152.cameraY; // L: 7489
						var12 = var64; // L: 7490
					}

					field540 = new class464(class208.cameraX, ByteArrayPool.cameraZ, var32, var29, var76, var12, var5, var25, var74, var8); // L: 7492
					var1.serverPacket = null; // L: 7493
					return true; // L: 7494
				}

				if (ServerPacket.field3253 == var1.serverPacket) { // L: 7496
					PlatformInfo.method8310(); // L: 7497
					var64 = var3.method8941(); // L: 7498
					var5 = var3.method8963(); // L: 7499
					var25 = var3.method8942(); // L: 7500
					experience[var64] = var5; // L: 7501
					currentLevels[var64] = var25; // L: 7502
					levels[var64] = 1; // L: 7503

					for (var74 = 0; var74 < 98; ++var74) { // L: 7504
						if (var5 >= Skills.Skills_experienceTable[var74]) {
							levels[var64] = var74 + 2;
						}
					}

					field672[++field703 - 1 & 31] = var64; // L: 7505
					var1.serverPacket = null; // L: 7506
					return true; // L: 7507
				}

				if (ServerPacket.field3241 == var1.serverPacket) { // L: 7509
					var64 = var3.readUnsignedByte(); // L: 7510
					WorldMapSection0.method5416(var64); // L: 7511
					var1.serverPacket = null; // L: 7512
					return true; // L: 7513
				}

				int var16;
				if (ServerPacket.field3262 == var1.serverPacket) { // L: 7515
					int var18 = var3.readUnsignedByte(); // L: 7531
					var12 = var3.method9030(); // L: 7532
					var15 = var3.method8952(); // L: 7533
					int var17 = var3.method8943(); // L: 7534
					byte var75 = var3.method8979(); // L: 7535
					var25 = var3.method8957(); // L: 7536
					var64 = var25 >> 16; // L: 7537
					var5 = var25 >> 8 & 255; // L: 7538
					var74 = var64 + (var25 >> 4 & 7); // L: 7539
					var8 = var5 + (var25 & 7); // L: 7540
					byte var30 = var3.method8971(); // L: 7541
					var32 = var3.method9027(); // L: 7542
					var16 = var3.method8952(); // L: 7543
					var61 = var3.method8943() * 4; // L: 7544
					var62 = var3.method8941() * 4; // L: 7545
					var29 = var75 + var74; // L: 7546
					var76 = var30 + var8; // L: 7547
					if (var74 >= 0 && var8 >= 0 && var74 < 104 && var8 < 104 && var29 >= 0 && var76 >= 0 && var29 < 104 && var76 < 104 && var12 != 65535) { // L: 7548
						var74 = var74 * 128 + 64; // L: 7549
						var8 = var8 * 128 + 64; // L: 7550
						var29 = var29 * 128 + 64; // L: 7551
						var76 = var76 * 128 + 64; // L: 7552
						Projectile var19 = new Projectile(var12, Clock.Client_plane, var74, var8, Renderable.getTileHeight(var74, var8, Clock.Client_plane) - var61, var15 + cycle, var16 + cycle, var17, var18, var32, var62); // L: 7553
						var19.setDestination(var29, var76, Renderable.getTileHeight(var29, var76, Clock.Client_plane) - var62, var15 + cycle); // L: 7554
						projectiles.addFirst(var19); // L: 7555
					}

					var1.serverPacket = null; // L: 7557
					return true; // L: 7558
				}

				if (ServerPacket.field3277 == var1.serverPacket) { // L: 7560
					var64 = var3.readInt(); // L: 7561
					InterfaceParent var70 = (InterfaceParent)interfaceParents.get((long)var64); // L: 7562
					if (var70 != null) { // L: 7563
						SoundCache.closeInterface(var70, true);
					}

					if (meslayerContinueWidget != null) { // L: 7564
						Messages.invalidateWidget(meslayerContinueWidget); // L: 7565
						meslayerContinueWidget = null; // L: 7566
					}

					var1.serverPacket = null; // L: 7568
					return true; // L: 7569
				}

				if (ServerPacket.field3331 == var1.serverPacket) { // L: 7571
					var64 = var3.method8963(); // L: 7572
					var5 = var3.method8952(); // L: 7573
					var53 = FriendSystem.getWidget(var64); // L: 7574
					if (var53.modelType != 6 || var5 != var53.modelId) { // L: 7575
						var53.modelType = 6; // L: 7576
						var53.modelId = var5; // L: 7577
						Messages.invalidateWidget(var53); // L: 7578
					}

					var1.serverPacket = null; // L: 7580
					return true; // L: 7581
				}

				if (ServerPacket.field3269 == var1.serverPacket) { // L: 7583
					var64 = var3.method8952(); // L: 7584
					var5 = var3.method8952(); // L: 7585
					var25 = var3.method8963(); // L: 7586
					var74 = var3.method8950(); // L: 7587
					var92 = FriendSystem.getWidget(var25); // L: 7588
					if (var64 != var92.modelAngleX || var5 != var92.modelAngleY || var74 != var92.modelZoom) { // L: 7589
						var92.modelAngleX = var64; // L: 7590
						var92.modelAngleY = var5; // L: 7591
						var92.modelZoom = var74; // L: 7592
						Messages.invalidateWidget(var92); // L: 7593
					}

					var1.serverPacket = null; // L: 7595
					return true; // L: 7596
				}

				if (ServerPacket.field3259 == var1.serverPacket) { // L: 7598
					var3.offset += 28; // L: 7599
					if (var3.checkCrc()) { // L: 7600
						class60.method1120(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 7601
					return true; // L: 7602
				}

				if (ServerPacket.field3285 == var1.serverPacket) { // L: 7604
					class127.field1495 = new class442(HealthBar.Ignored_cached); // L: 7605
					var1.serverPacket = null; // L: 7606
					return true; // L: 7607
				}

				if (ServerPacket.field3225 == var1.serverPacket) { // L: 7609
					class19.loadRegions(false, var1.packetBuffer); // L: 7610
					var1.serverPacket = null; // L: 7611
					return true; // L: 7612
				}

				if (ServerPacket.field3245 == var1.serverPacket) { // L: 7614
					if (class127.field1495 == null) { // L: 7615
						class127.field1495 = new class442(HealthBar.Ignored_cached);
					}

					class509 var49 = HealthBar.Ignored_cached.method8197(var3); // L: 7616
					class127.field1495.field4708.vmethod8642(var49.field5084, var49.field5083); // L: 7617
					field704[++field705 - 1 & 31] = var49.field5084; // L: 7618
					var1.serverPacket = null; // L: 7619
					return true; // L: 7620
				}

				if (ServerPacket.field3256 == var1.serverPacket) { // L: 7622
					field690 = cycleCntr; // L: 7623
					var20 = var3.readByte(); // L: 7624
					if (var1.serverPacketLength == 1) { // L: 7625
						if (var20 >= 0) { // L: 7626
							currentClanChannels[var20] = null;
						} else {
							VerticalAlignment.guestClanChannel = null; // L: 7627
						}

						var1.serverPacket = null; // L: 7628
						return true; // L: 7629
					}

					if (var20 >= 0) { // L: 7631
						currentClanChannels[var20] = new ClanChannel(var3); // L: 7632
					} else {
						VerticalAlignment.guestClanChannel = new ClanChannel(var3); // L: 7635
					}

					var1.serverPacket = null; // L: 7637
					return true; // L: 7638
				}

				if (ServerPacket.field3257 == var1.serverPacket) { // L: 7640
					var74 = var3.method8943(); // L: 7646
					var5 = var3.readInt(); // L: 7647
					var64 = var3.method9030(); // L: 7648
					var89 = npcs[var64]; // L: 7649
					var25 = var3.method8952(); // L: 7650
					if (var89 != null) { // L: 7651
						var89.method2363(var74, var25, var5 >> 16, var5 & 65535); // L: 7652
					}

					var1.serverPacket = null; // L: 7654
					return true; // L: 7655
				}

				if (ServerPacket.field3322 == var1.serverPacket) { // L: 7657
					var64 = var3.method8950(); // L: 7658
					ParamComposition.method3838(var64); // L: 7659
					field700[++field701 - 1 & 31] = var64 & 32767; // L: 7660
					var1.serverPacket = null; // L: 7661
					return true; // L: 7662
				}

				if (ServerPacket.field3336 == var1.serverPacket) { // L: 7664
					for (var64 = 0; var64 < VarpDefinition.field1903; ++var64) { // L: 7665
						VarpDefinition var69 = class100.VarpDefinition_get(var64); // L: 7666
						if (var69 != null) { // L: 7667
							Varps.Varps_temp[var64] = 0; // L: 7668
							Varps.Varps_main[var64] = 0; // L: 7669
						}
					}

					PlatformInfo.method8310(); // L: 7672
					field699 += 32; // L: 7673
					var1.serverPacket = null; // L: 7674
					return true; // L: 7675
				}

				if (ServerPacket.field3329 == var1.serverPacket) { // L: 7677
					var64 = var3.method8964(); // L: 7678
					var68 = FriendSystem.getWidget(var64); // L: 7679
					var68.modelType = 3; // L: 7680
					var68.modelId = Projectile.localPlayer.appearance.getChatHeadId(); // L: 7681
					Messages.invalidateWidget(var68); // L: 7682
					var1.serverPacket = null; // L: 7683
					return true; // L: 7684
				}

				if (ServerPacket.field3330 == var1.serverPacket) { // L: 7686
					var1.serverPacket = null; // L: 7687
					return true; // L: 7688
				}

				if (ServerPacket.field3326 == var1.serverPacket) { // L: 7690
					class213.method4211(class294.field3204); // L: 7691
					var1.serverPacket = null; // L: 7692
					return true; // L: 7693
				}

				if (ServerPacket.field3272 == var1.serverPacket) { // L: 7695
					var48 = var3.readStringCp1252NullTerminated(); // L: 7696
					Object[] var67 = new Object[var48.length() + 1]; // L: 7697

					for (var25 = var48.length() - 1; var25 >= 0; --var25) { // L: 7698
						if (var48.charAt(var25) == 's') { // L: 7699
							var67[var25 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var67[var25 + 1] = new Integer(var3.readInt()); // L: 7700
						}
					}

					var67[0] = new Integer(var3.readInt()); // L: 7702
					ScriptEvent var56 = new ScriptEvent(); // L: 7703
					var56.args = var67; // L: 7704
					Clock.runScriptEvent(var56); // L: 7705
					var1.serverPacket = null; // L: 7706
					return true; // L: 7707
				}

				if (ServerPacket.field3267 == var1.serverPacket) { // L: 7709
					var74 = var3.readUnsignedByte(); // L: 7715
					var25 = var3.method8963(); // L: 7716
					var64 = var3.method9030(); // L: 7717
					Player var87;
					if (var64 == localPlayerIndex) { // L: 7718
						var87 = Projectile.localPlayer; // L: 7719
					} else {
						var87 = players[var64]; // L: 7722
					}

					var5 = var3.method8952(); // L: 7724
					if (var87 != null) { // L: 7725
						var87.method2363(var74, var5, var25 >> 16, var25 & 65535); // L: 7726
					}

					var1.serverPacket = null; // L: 7728
					return true; // L: 7729
				}

				if (ServerPacket.field3308 == var1.serverPacket) { // L: 7731
					class213.method4211(class294.field3199); // L: 7732
					var1.serverPacket = null; // L: 7733
					return true; // L: 7734
				}

				if (ServerPacket.field3223 == var1.serverPacket) { // L: 7736
					var64 = var3.readUnsignedShort(); // L: 7737
					var5 = var3.method8964(); // L: 7738
					var25 = var64 >> 10 & 31; // L: 7739
					var74 = var64 >> 5 & 31; // L: 7740
					var8 = var64 & 31; // L: 7741
					var29 = (var74 << 11) + (var25 << 19) + (var8 << 3); // L: 7742
					Widget var90 = FriendSystem.getWidget(var5); // L: 7743
					if (var29 != var90.color) { // L: 7744
						var90.color = var29; // L: 7745
						Messages.invalidateWidget(var90); // L: 7746
					}

					var1.serverPacket = null; // L: 7748
					return true; // L: 7749
				}

				if (ServerPacket.field3304 == var1.serverPacket) { // L: 7751
					var64 = var3.readUnsignedShort(); // L: 7752
					var5 = var3.readUnsignedByte(); // L: 7753
					var25 = var3.method8964(); // L: 7754
					var77 = (InterfaceParent)interfaceParents.get((long)var25); // L: 7755
					if (var77 != null) { // L: 7756
						SoundCache.closeInterface(var77, var64 != var77.group);
					}

					VarpDefinition.method3580(var25, var64, var5); // L: 7757
					var1.serverPacket = null; // L: 7758
					return true; // L: 7759
				}

				if (ServerPacket.field3307 == var1.serverPacket) { // L: 7761
					isCameraLocked = true; // L: 7762
					field691 = false; // L: 7763
					field764 = false; // L: 7764
					class126.field1469 = var3.readUnsignedByte() * 128; // L: 7765
					class217.field2401 = var3.readUnsignedByte() * 128; // L: 7766
					class85.field1044 = var3.readUnsignedShort(); // L: 7767
					UserComparator4.field1410 = var3.readUnsignedByte(); // L: 7768
					LoginScreenAnimation.field1255 = var3.readUnsignedByte(); // L: 7769
					if (LoginScreenAnimation.field1255 >= 100) { // L: 7770
						class208.cameraX = class126.field1469 * 16384 + 64; // L: 7771
						ByteArrayPool.cameraZ = class217.field2401 * 16384 + 64; // L: 7772
						class152.cameraY = Renderable.getTileHeight(class208.cameraX, ByteArrayPool.cameraZ, Clock.Client_plane) - class85.field1044; // L: 7773
					}

					var1.serverPacket = null; // L: 7775
					return true; // L: 7776
				}

				if (ServerPacket.field3296 == var1.serverPacket) { // L: 7778
					var64 = var3.readUShortSmart(); // L: 7779
					var55 = var3.readUnsignedByte() == 1; // L: 7780
					var54 = ""; // L: 7781
					boolean var26 = false; // L: 7782
					if (var55) { // L: 7783
						var54 = var3.readStringCp1252NullTerminated(); // L: 7784
						if (ApproximateRouteStrategy.friendSystem.isIgnored(new Username(var54, WorldMapScaleHandler.loginType))) { // L: 7785
							var26 = true;
						}
					}

					String var34 = var3.readStringCp1252NullTerminated(); // L: 7787
					if (!var26) { // L: 7788
						class59.addGameMessage(var64, var54, var34);
					}

					var1.serverPacket = null; // L: 7789
					return true; // L: 7790
				}

				if (ServerPacket.field3281 == var1.serverPacket) { // L: 7792
					minimapState = var3.readUnsignedByte(); // L: 7793
					var1.serverPacket = null; // L: 7794
					return true; // L: 7795
				}

				if (ServerPacket.field3268 == var1.serverPacket) { // L: 7797
					PlatformInfo.method8310(); // L: 7798
					field679 = var3.readUnsignedShort(); // L: 7799
					field711 = cycleCntr; // L: 7800
					var1.serverPacket = null; // L: 7801
					return true; // L: 7802
				}

				if (ServerPacket.field3254 == var1.serverPacket) { // L: 7804
					var64 = var3.method8941(); // L: 7805
					var5 = var3.method8964(); // L: 7806
					var53 = FriendSystem.getWidget(var5); // L: 7807
					MusicPatchPcmStream.method5941(var53, Projectile.localPlayer.appearance.field3540, var64); // L: 7808
					Messages.invalidateWidget(var53); // L: 7809
					var1.serverPacket = null; // L: 7810
					return true; // L: 7811
				}

				if (ServerPacket.field3251 == var1.serverPacket) { // L: 7813
					if (rootInterface != -1) { // L: 7814
						class453.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 7815
					return true; // L: 7816
				}

				if (ServerPacket.field3265 == var1.serverPacket) { // L: 7818
					var64 = var3.method8963(); // L: 7819
					var5 = var3.readUnsignedByte(); // L: 7820
					var25 = var3.method8942(); // L: 7821
					var31 = FriendSystem.getWidget(var64); // L: 7822
					class199.method3808(var31, var5, var25); // L: 7823
					Messages.invalidateWidget(var31); // L: 7824
					var1.serverPacket = null; // L: 7825
					return true; // L: 7826
				}

				if (ServerPacket.field3288 == var1.serverPacket) { // L: 7828
					class19.loadRegions(true, var1.packetBuffer); // L: 7829
					var1.serverPacket = null; // L: 7830
					return true; // L: 7831
				}

				if (ServerPacket.field3314 == var1.serverPacket) { // L: 7833
					var64 = var3.method8963(); // L: 7834
					var5 = var3.readUnsignedShort(); // L: 7835
					var53 = FriendSystem.getWidget(var64); // L: 7836
					if (var53 != null && var53.type == 0) { // L: 7837
						if (var5 > var53.scrollHeight - var53.height) { // L: 7838
							var5 = var53.scrollHeight - var53.height;
						}

						if (var5 < 0) { // L: 7839
							var5 = 0;
						}

						if (var5 != var53.scrollY) { // L: 7840
							var53.scrollY = var5; // L: 7841
							Messages.invalidateWidget(var53); // L: 7842
						}
					}

					var1.serverPacket = null; // L: 7845
					return true; // L: 7846
				}

				if (ServerPacket.field3252 == var1.serverPacket) { // L: 7848
					var64 = var3.method8954(); // L: 7849
					var5 = var3.method8963(); // L: 7850
					var25 = var3.readShort(); // L: 7851
					var31 = FriendSystem.getWidget(var5); // L: 7852
					if (var64 != var31.rawX || var25 != var31.rawY || var31.xAlignment != 0 || var31.yAlignment != 0) { // L: 7853
						var31.rawX = var64; // L: 7854
						var31.rawY = var25; // L: 7855
						var31.xAlignment = 0; // L: 7856
						var31.yAlignment = 0; // L: 7857
						Messages.invalidateWidget(var31); // L: 7858
						this.alignWidget(var31); // L: 7859
						if (var31.type == 0) { // L: 7860
							Projectile.revalidateWidgetScroll(class16.Widget_interfaceComponents[var5 >> 16], var31, false);
						}
					}

					var1.serverPacket = null; // L: 7862
					return true; // L: 7863
				}

				if (ServerPacket.field3273 == var1.serverPacket) { // L: 7865
					return this.method1220(var1, 1); // L: 7866
				}

				if (ServerPacket.field3306 == var1.serverPacket) { // L: 7868
					var65 = var3.method8941() == 1; // L: 7869
					var5 = var3.readInt(); // L: 7870
					var53 = FriendSystem.getWidget(var5); // L: 7871
					GraphicsObject.method2043(var53, Projectile.localPlayer.appearance, var65); // L: 7872
					Messages.invalidateWidget(var53); // L: 7873
					var1.serverPacket = null; // L: 7874
					return true; // L: 7875
				}

				if (ServerPacket.field3222 == var1.serverPacket) { // L: 7877
					class213.method4211(class294.field3205); // L: 7878
					var1.serverPacket = null; // L: 7879
					return true; // L: 7880
				}

				if (ServerPacket.field3221 == var1.serverPacket) { // L: 7882
					var48 = var3.readStringCp1252NullTerminated(); // L: 7883
					var21 = AbstractFont.escapeBrackets(class290.method5660(class16.method218(var3))); // L: 7884
					class59.addGameMessage(6, var48, var21); // L: 7885
					var1.serverPacket = null; // L: 7886
					return true; // L: 7887
				}

				String var39;
				if (ServerPacket.field3247 == var1.serverPacket) { // L: 7889
					var48 = var3.readStringCp1252NullTerminated(); // L: 7890
					var22 = var3.readLong(); // L: 7891
					var7 = (long)var3.readUnsignedShort(); // L: 7892
					var27 = (long)var3.readMedium(); // L: 7893
					PlayerType var11 = (PlayerType)GameObject.findEnumerated(HealthBarDefinition.PlayerType_values(), var3.readUnsignedByte()); // L: 7894
					var36 = var27 + (var7 << 32); // L: 7895
					boolean var14 = false; // L: 7896

					for (var15 = 0; var15 < 100; ++var15) { // L: 7897
						if (field737[var15] == var36) { // L: 7898
							var14 = true; // L: 7899
							break; // L: 7900
						}
					}

					if (var11.isUser && ApproximateRouteStrategy.friendSystem.isIgnored(new Username(var48, WorldMapScaleHandler.loginType))) { // L: 7903 7904
						var14 = true;
					}

					if (!var14 && field626 == 0) { // L: 7906
						field737[field777] = var36; // L: 7907
						field777 = (field777 + 1) % 100; // L: 7908
						var39 = AbstractFont.escapeBrackets(class290.method5660(class16.method218(var3))); // L: 7909
						if (var11.modIcon != -1) { // L: 7910
							ApproximateRouteStrategy.addChatMessage(9, class100.method2624(var11.modIcon) + var48, var39, MusicPatchPcmStream.base37DecodeLong(var22));
						} else {
							ApproximateRouteStrategy.addChatMessage(9, var48, var39, MusicPatchPcmStream.base37DecodeLong(var22)); // L: 7911
						}
					}

					var1.serverPacket = null; // L: 7913
					return true; // L: 7914
				}

				if (ServerPacket.field3318 == var1.serverPacket) { // L: 7916
					field690 = cycleCntr; // L: 7917
					var20 = var3.readByte(); // L: 7918
					class159 var66 = new class159(var3); // L: 7919
					ClanChannel var6;
					if (var20 >= 0) { // L: 7921
						var6 = currentClanChannels[var20];
					} else {
						var6 = VerticalAlignment.guestClanChannel; // L: 7922
					}

					var66.method3313(var6); // L: 7923
					var1.serverPacket = null; // L: 7924
					return true; // L: 7925
				}

				if (ServerPacket.field3239 == var1.serverPacket) { // L: 7927
					class213.method4211(class294.field3198); // L: 7928
					var1.serverPacket = null; // L: 7929
					return true; // L: 7930
				}

				if (ServerPacket.field3302 == var1.serverPacket && isCameraLocked) { // L: 7932 7933
					field691 = true; // L: 7934
					field725 = false; // L: 7935
					field764 = false; // L: 7936

					for (var64 = 0; var64 < 5; ++var64) { // L: 7937
						field771[var64] = false; // L: 7938
					}

					var1.serverPacket = null; // L: 7940
					return true; // L: 7941
				}

				if (ServerPacket.field3278 == var1.serverPacket) { // L: 7944
					SpotAnimationDefinition.privateChatMode = class404.method7633(var3.readUnsignedByte()); // L: 7945
					var1.serverPacket = null; // L: 7946
					return true; // L: 7947
				}

				if (ServerPacket.field3309 == var1.serverPacket) { // L: 7949
					var20 = var3.readByte(); // L: 7950
					var21 = var3.readStringCp1252NullTerminated(); // L: 7951
					long var40 = (long)var3.readUnsignedShort(); // L: 7952
					long var42 = (long)var3.readMedium(); // L: 7953
					PlayerType var35 = (PlayerType)GameObject.findEnumerated(HealthBarDefinition.PlayerType_values(), var3.readUnsignedByte()); // L: 7954
					long var44 = (var40 << 32) + var42; // L: 7955
					boolean var13 = false; // L: 7956
					ClanChannel var33 = null; // L: 7957
					var33 = var20 >= 0 ? currentClanChannels[var20] : VerticalAlignment.guestClanChannel; // L: 7959
					if (var33 == null) { // L: 7960
						var13 = true; // L: 7961
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var35.isUser && ApproximateRouteStrategy.friendSystem.isIgnored(new Username(var21, WorldMapScaleHandler.loginType))) { // L: 7970 7971
									var13 = true;
								}
								break;
							}

							if (field737[var15] == var44) { // L: 7965
								var13 = true; // L: 7966
								break; // L: 7967
							}

							++var15; // L: 7964
						}
					}

					if (!var13) { // L: 7974
						field737[field777] = var44; // L: 7975
						field777 = (field777 + 1) % 100; // L: 7976
						var39 = AbstractFont.escapeBrackets(class16.method218(var3)); // L: 7977
						var16 = var20 >= 0 ? 41 : 44; // L: 7978
						if (var35.modIcon != -1) { // L: 7979
							ApproximateRouteStrategy.addChatMessage(var16, class100.method2624(var35.modIcon) + var21, var39, var33.name);
						} else {
							ApproximateRouteStrategy.addChatMessage(var16, var21, var39, var33.name); // L: 7980
						}
					}

					var1.serverPacket = null; // L: 7982
					return true; // L: 7983
				}

				class260.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1393 != null ? var1.field1393.id : -1) + "," + (var1.field1392 != null ? var1.field1392.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 7985
				FriendSystem.logOut(); // L: 7986
			} catch (IOException var46) { // L: 7988
				Interpreter.method2034(); // L: 7989
			} catch (Exception var47) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1393 != null ? var1.field1393.id : -1) + "," + (var1.field1392 != null ? var1.field1392.id : -1) + "," + var1.serverPacketLength + "," + (Projectile.localPlayer.pathX[0] + class213.baseX * 64) + "," + (Projectile.localPlayer.pathY[0] + class101.baseY * 64) + ","; // L: 7992

				for (var25 = 0; var25 < var1.serverPacketLength && var25 < 50; ++var25) { // L: 7993
					var21 = var21 + var3.array[var25] + ",";
				}

				class260.RunException_sendStackTrace(var21, var47); // L: 7994
				FriendSystem.logOut(); // L: 7995
			}

			return true; // L: 7997
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-319683254"
	)
	@Export("menu")
	final void menu() {
		MouseRecorder.method2261(); // L: 9166
		if (clickedWidget == null) { // L: 9167
			int var1 = MouseHandler.MouseHandler_lastButton; // L: 9168
			int var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (isMenuOpen) { // L: 9169
				if (var1 != 1 && (class305.mouseCam || var1 != 4)) { // L: 9170
					var2 = MouseHandler.MouseHandler_x; // L: 9171
					var3 = MouseHandler.MouseHandler_y; // L: 9172
					if (var2 < class180.menuX - 10 || var2 > class237.menuWidth + class180.menuX + 10 || var3 < class193.menuY - 10 || var3 > class60.menuHeight + class193.menuY + 10) { // L: 9173
						isMenuOpen = false; // L: 9174
						class20.method305(class180.menuX, class193.menuY, class237.menuWidth, class60.menuHeight); // L: 9175
					}
				}

				if (var1 == 1 || !class305.mouseCam && var1 == 4) { // L: 9178
					var2 = class180.menuX; // L: 9179
					var3 = class193.menuY; // L: 9180
					var4 = class237.menuWidth; // L: 9181
					var5 = MouseHandler.MouseHandler_lastPressedX; // L: 9182
					var6 = MouseHandler.MouseHandler_lastPressedY; // L: 9183
					var7 = -1; // L: 9184

					int var15;
					int var16;
					for (var15 = 0; var15 < menuOptionsCount; ++var15) { // L: 9185
						var16 = (menuOptionsCount - 1 - var15) * 15 + var3 + 31; // L: 9186
						if (var5 > var2 && var5 < var2 + var4 && var6 > var16 - 13 && var6 < var16 + 3) { // L: 9187
							var7 = var15;
						}
					}

					if (var7 != -1 && var7 >= 0) { // L: 9189 9190
						var15 = menuArguments1[var7]; // L: 9191
						var16 = menuArguments2[var7]; // L: 9192
						int var10 = menuOpcodes[var7]; // L: 9193
						int var11 = menuIdentifiers[var7]; // L: 9194
						int var12 = field655[var7]; // L: 9195
						String var13 = menuActions[var7]; // L: 9196
						String var14 = menuTargets[var7]; // L: 9197
						WorldMapIcon_0.method5391(var15, var16, var10, var11, var12, var13, var14, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 9198
					}

					isMenuOpen = false; // L: 9200
					class20.method305(class180.menuX, class193.menuY, class237.menuWidth, class60.menuHeight); // L: 9201
				}
			} else {
				var2 = class132.method3034(); // L: 9205
				if ((var1 == 1 || !class305.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) { // L: 9206 9207
					var1 = 2; // L: 9208
				}

				if ((var1 == 1 || !class305.mouseCam && var1 == 4) && menuOptionsCount > 0 && var2 >= 0) { // L: 9211 9213
					var3 = menuArguments1[var2]; // L: 9214
					var4 = menuArguments2[var2]; // L: 9215
					var5 = menuOpcodes[var2]; // L: 9216
					var6 = menuIdentifiers[var2]; // L: 9217
					var7 = field655[var2]; // L: 9218
					String var8 = menuActions[var2]; // L: 9219
					String var9 = menuTargets[var2]; // L: 9220
					WorldMapIcon_0.method5391(var3, var4, var5, var6, var7, var8, var9, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 9221
				}

				if (var1 == 2 && menuOptionsCount > 0) { // L: 9224
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	} // L: 9226

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "94"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = class132.method3034(); // L: 9229
		boolean var2 = field648 && menuOptionsCount > 2; // L: 9230
		if (!var2) { // L: 9231
			boolean var3;
			if (var1 < 0) { // L: 9234
				var3 = false; // L: 9235
			} else {
				int var4 = menuOpcodes[var1]; // L: 9238
				if (var4 >= 2000) { // L: 9239
					var4 -= 2000;
				}

				if (var4 == 1007) { // L: 9240
					var3 = true; // L: 9241
				} else {
					var3 = false; // L: 9244
				}
			}

			var2 = var3; // L: 9246
		}

		return var2 && !menuShiftClick[var1]; // L: 9248
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1710226579"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = class166.fontBold12.stringWidth("Choose Option"); // L: 9253

		int var4;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) { // L: 9254
			Font var8 = class166.fontBold12; // L: 9255
			String var9;
			if (var4 < 0) { // L: 9258
				var9 = ""; // L: 9259
			} else if (menuTargets[var4].length() > 0) { // L: 9262
				var9 = menuActions[var4] + " " + menuTargets[var4];
			} else {
				var9 = menuActions[var4]; // L: 9263
			}

			int var7 = var8.stringWidth(var9); // L: 9265
			if (var7 > var3) { // L: 9266
				var3 = var7;
			}
		}

		var3 += 8; // L: 9268
		var4 = menuOptionsCount * 15 + 22; // L: 9269
		int var5 = var1 - var3 / 2; // L: 9270
		if (var5 + var3 > class448.canvasWidth) { // L: 9271
			var5 = class448.canvasWidth - var3;
		}

		if (var5 < 0) { // L: 9272
			var5 = 0;
		}

		int var6 = var2; // L: 9273
		if (var2 + var4 > WorldMapID.canvasHeight) { // L: 9274
			var6 = WorldMapID.canvasHeight - var4;
		}

		if (var6 < 0) { // L: 9275
			var6 = 0;
		}

		class180.menuX = var5; // L: 9276
		class193.menuY = var6; // L: 9277
		class237.menuWidth = var3; // L: 9278
		class60.menuHeight = menuOptionsCount * 15 + 22; // L: 9279
		var1 -= viewportOffsetX; // L: 9281
		var2 -= viewportOffsetY; // L: 9282
		class36.scene.menuOpen(Clock.Client_plane, var1, var2, false); // L: 9283
		isMenuOpen = true; // L: 9284
	} // L: 9285

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "53"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		class13.method170(rootInterface, class448.canvasWidth, WorldMapID.canvasHeight, var1); // L: 11037
	} // L: 11038

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Lmb;B)V",
		garbageValue = "36"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : FriendSystem.getWidget(var1.parentId); // L: 11041
		int var3;
		int var4;
		if (var2 == null) { // L: 11044
			var3 = class448.canvasWidth; // L: 11045
			var4 = WorldMapID.canvasHeight; // L: 11046
		} else {
			var3 = var2.width; // L: 11049
			var4 = var2.height; // L: 11050
		}

		SoundSystem.alignWidgetSize(var1, var3, var4, false); // L: 11052
		class140.alignWidgetPosition(var1, var3, var4); // L: 11053
	} // L: 11054

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	final void method1508() {
		Messages.invalidateWidget(clickedWidget); // L: 11984
		++class348.widgetDragDuration; // L: 11985
		if (field693 && field639) { // L: 11986
			int var1 = MouseHandler.MouseHandler_x; // L: 11995
			int var2 = MouseHandler.MouseHandler_y; // L: 11996
			var1 -= widgetClickX; // L: 11997
			var2 -= widgetClickY; // L: 11998
			if (var1 < field534) { // L: 11999
				var1 = field534;
			}

			if (var1 + clickedWidget.width > field534 + clickedWidgetParent.width) { // L: 12000
				var1 = field534 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field692) { // L: 12001
				var2 = field692;
			}

			if (var2 + clickedWidget.height > field692 + clickedWidgetParent.height) { // L: 12002
				var2 = field692 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field694; // L: 12003
			int var4 = var2 - field735; // L: 12004
			int var5 = clickedWidget.dragZoneSize; // L: 12005
			if (class348.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 12006 12007
				isDraggingWidget = true; // L: 12008
			}

			int var6 = var1 - field534 + clickedWidgetParent.scrollX; // L: 12011
			int var7 = var2 - field692 + clickedWidgetParent.scrollY; // L: 12012
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 12013
				var8 = new ScriptEvent(); // L: 12014
				var8.widget = clickedWidget; // L: 12015
				var8.mouseX = var6; // L: 12016
				var8.mouseY = var7; // L: 12017
				var8.args = clickedWidget.onDrag; // L: 12018
				Clock.runScriptEvent(var8); // L: 12019
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 12021
				if (isDraggingWidget) { // L: 12022
					if (clickedWidget.onDragComplete != null) { // L: 12023
						var8 = new ScriptEvent(); // L: 12024
						var8.widget = clickedWidget; // L: 12025
						var8.mouseX = var6; // L: 12026
						var8.mouseY = var7; // L: 12027
						var8.dragTarget = draggedOnWidget; // L: 12028
						var8.args = clickedWidget.onDragComplete; // L: 12029
						Clock.runScriptEvent(var8); // L: 12030
					}

					if (draggedOnWidget != null) { // L: 12032
						Widget var9 = clickedWidget; // L: 12034
						int var10 = Interpreter.method1961(StudioGame.getWidgetFlags(var9)); // L: 12036
						Widget var13;
						if (var10 == 0) { // L: 12037
							var13 = null; // L: 12038
						} else {
							int var11 = 0;

							while (true) {
								if (var11 >= var10) {
									var13 = var9; // L: 12048
									break;
								}

								var9 = FriendSystem.getWidget(var9.parentId); // L: 12042
								if (var9 == null) { // L: 12043
									var13 = null; // L: 12044
									break; // L: 12045
								}

								++var11; // L: 12041
							}
						}

						if (var13 != null) { // L: 12050
							PacketBufferNode var12 = ObjectComposition.getPacketBufferNode(ClientPacket.field3119, packetWriter.isaacCipher); // L: 12052
							var12.packetBuffer.method8948(clickedWidget.itemId); // L: 12053
							var12.packetBuffer.method8948(draggedOnWidget.childIndex); // L: 12054
							var12.packetBuffer.writeInt(draggedOnWidget.id); // L: 12055
							var12.packetBuffer.method8961(clickedWidget.id); // L: 12056
							var12.packetBuffer.method8949(clickedWidget.childIndex); // L: 12057
							var12.packetBuffer.method9000(draggedOnWidget.itemId); // L: 12058
							packetWriter.addNode(var12); // L: 12059
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 12064
					this.openMenu(field694 + widgetClickX, widgetClickY + field735); // L: 12065
				} else if (menuOptionsCount > 0) { // L: 12067
					class382.method7141(widgetClickX + field694, widgetClickY + field735); // L: 12068
				}

				clickedWidget = null; // L: 12071
			}

		} else {
			if (class348.widgetDragDuration > 1) { // L: 11987
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 11988
					class382.method7141(field694 + widgetClickX, widgetClickY + field735); // L: 11989
				}

				clickedWidget = null; // L: 11991
			}

		}
	} // L: 11993 12073

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(I)Lun;",
		garbageValue = "-1538198940"
	)
	@Export("username")
	public Username username() {
		return Projectile.localPlayer != null ? Projectile.localPlayer.username : null; // L: 12731
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 746
				for (int var1 = 0; var1 <= 28; ++var1) { // L: 747
					String var2 = this.getParameter(Integer.toString(var1)); // L: 748
					if (var2 != null) { // L: 749
						switch(var1) { // L: 750
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 791
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 792
							}
							break;
						case 4:
							if (clientType == -1) { // L: 818
								clientType = Integer.parseInt(var2); // L: 819
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 813
							break; // L: 814
						case 6:
							int var4 = Integer.parseInt(var2); // L: 841
							Language var10;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) { // L: 843
								var10 = Language.Language_valuesOrdered[var4]; // L: 847
							} else {
								var10 = null; // L: 844
							}

							TriBool.clientLanguage = var10; // L: 849
							break;
						case 7:
							class25.field132 = class177.method3517(Integer.parseInt(var2)); // L: 764
							break; // L: 765
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 758
							}
							break;
						case 9:
							class443.field4710 = var2; // L: 769
							break; // L: 770
						case 10:
							StudioGame[] var5 = new StudioGame[]{StudioGame.game3, StudioGame.game5, StudioGame.game4, StudioGame.stellardawn, StudioGame.oldscape, StudioGame.runescape}; // L: 799
							GameBuild.field3841 = (StudioGame)GameObject.findEnumerated(var5, Integer.parseInt(var2)); // L: 801
							if (GameBuild.field3841 == StudioGame.oldscape) { // L: 802
								WorldMapScaleHandler.loginType = LoginType.oldscape;
							} else {
								WorldMapScaleHandler.loginType = LoginType.field4924; // L: 803
							}
							break;
						case 11:
							MusicPatchNode2.field3380 = var2; // L: 753
							break; // L: 754
						case 12:
							worldId = Integer.parseInt(var2); // L: 835
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						case 22:
						case 23:
						case 24:
						default:
							break;
						case 14:
							class156.field1726 = Integer.parseInt(var2); // L: 774
							break; // L: 775
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 830
							break; // L: 831
						case 17:
							class512.field5098 = var2; // L: 825
							break; // L: 826
						case 21:
							field508 = Integer.parseInt(var2); // L: 808
							break; // L: 809
						case 25:
							int var3 = var2.indexOf("."); // L: 779
							if (var3 == -1) { // L: 780
								field512 = Integer.parseInt(var2); // L: 781
							} else {
								field512 = Integer.parseInt(var2.substring(0, var3)); // L: 784
								Integer.parseInt(var2.substring(var3 + 1)); // L: 785
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 856
				isLowDetail = false; // L: 857
				class17.worldHost = this.getCodeBase().getHost(); // L: 859
				String var6 = class25.field132.name; // L: 860
				byte var7 = 0; // L: 861

				try {
					ItemComposition.method4004("oldschool", var6, var7, 22); // L: 863
				} catch (Exception var8) { // L: 865
					class260.RunException_sendStackTrace((String)null, var8); // L: 866
				}

				class347.client = this; // L: 868
				class451.clientType = clientType; // L: 869
				class490.method8769(); // L: 870
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) { // L: 871
					this.field550 = true; // L: 872
				}

				if (field510 == -1) { // L: 874
					if (!this.method1201() && !this.method1202()) { // L: 875
						field510 = 0; // L: 879
					} else {
						field510 = 5; // L: 876
					}
				}

				this.startThread(765, 503, 214, 1); // L: 882
			}
		} catch (RuntimeException var9) {
			throw MilliClock.newRunException(var9, "client.init(" + ')');
		}
	} // L: 883

	protected void finalize() throws Throwable {
		ObjectComposition.method3947(this); // L: 887
		super.finalize(); // L: 888
	} // L: 889

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 905
			this.field548 = var1; // L: 908
			class390.method7249(10); // L: 909
		}
	} // L: 906 910

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 924
	}

	public long getAccountHash() {
		return this.accountHash; // L: 929
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 915
			this.field552 = var1; // L: 918
		}
	} // L: 916 919

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-488867315"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class143.Widget_loadedInterfaces[var0]) { // L: 242
			return true;
		} else if (!Widget.Widget_archive.tryLoadGroup(var0)) { // L: 243
			return false;
		} else {
			int var1 = Widget.Widget_archive.getGroupFileCount(var0); // L: 244
			if (var1 == 0) { // L: 245
				class143.Widget_loadedInterfaces[var0] = true; // L: 246
				return true; // L: 247
			} else {
				if (class16.Widget_interfaceComponents[var0] == null) { // L: 249
					class16.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 250
					if (class16.Widget_interfaceComponents[var0][var2] == null) { // L: 251
						byte[] var3 = Widget.Widget_archive.takeFile(var0, var2); // L: 252
						if (var3 != null) { // L: 253
							class16.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 254
							class16.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 255
							if (var3[0] == -1) { // L: 256
								class16.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								class16.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 257
							}
						}
					}
				}

				class143.Widget_loadedInterfaces[var0] = true; // L: 261
				return true; // L: 262
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1332135425"
	)
	public static boolean method1203(int var0) {
		return var0 >= WorldMapDecorationType.field3803.id && var0 <= WorldMapDecorationType.field3809.id; // L: 47
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-1301142302"
	)
	static int method1335(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 4365
			logoutTimer = 250; // L: 4366
			return 1; // L: 4367
		} else {
			return 2; // L: 4369
		}
	}
}
