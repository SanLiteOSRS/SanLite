import com.jagex.oldscape.pub.OAuthApi;
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
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class311 {
	@ObfuscatedName("vd")
	@ObfuscatedGetter(
		intValue = -496070959
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vc")
	@ObfuscatedGetter(
		intValue = -957988005
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("wd")
	@ObfuscatedGetter(
		intValue = 1721185941
	)
	public static int field649;
	@ObfuscatedName("xy")
	static int[] field829;
	@ObfuscatedName("uh")
	static boolean field794;
	@ObfuscatedName("xf")
	static int[] field830;
	@ObfuscatedName("xm")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	static final ApproximateRouteStrategy field828;
	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("vb")
	@ObfuscatedGetter(
		intValue = 2122687767
	)
	static int field632;
	@ObfuscatedName("vw")
	static boolean[] field795;
	@ObfuscatedName("vs")
	@ObfuscatedGetter(
		intValue = -606789725
	)
	static int field815;
	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("wv")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wk")
	@ObfuscatedGetter(
		intValue = -170542827
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("ws")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("archive5")
	static class423 archive5;
	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	static class475 field671;
	@ObfuscatedName("vl")
	static short field800;
	@ObfuscatedName("vp")
	static short field685;
	@ObfuscatedName("vu")
	static short field806;
	@ObfuscatedName("vj")
	static short field807;
	@ObfuscatedName("ve")
	static short field635;
	@ObfuscatedName("vx")
	@ObfuscatedGetter(
		intValue = -544120667
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vf")
	static short field804;
	@ObfuscatedName("vo")
	@ObfuscatedGetter(
		intValue = -685574095
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("we")
	@ObfuscatedGetter(
		intValue = -1074907455
	)
	static int field827;
	@ObfuscatedName("vn")
	@ObfuscatedGetter(
		intValue = -212965565
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vm")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("vi")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vq")
	static int[] field748;
	@ObfuscatedName("vh")
	static int[] field588;
	@ObfuscatedName("vk")
	static int[] field658;
	@ObfuscatedName("vz")
	static int[] field744;
	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "[Loh;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("wy")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wa")
	@ObfuscatedGetter(
		intValue = -1467424607
	)
	static int field822;
	@ObfuscatedName("wt")
	static List field695;
	@ObfuscatedName("bc")
	static boolean field566;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -831561099
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1264215911
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -472947525
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cx")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cr")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -254020809
	)
	static int field531;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -647533501
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -260341301
	)
	static int field544;
	@ObfuscatedName("cu")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -331110037
	)
	public static int field708;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -667400491
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("di")
	static boolean field537;
	@ObfuscatedName("ed")
	static boolean field539;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 522278027
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		longValue = 3989900610207861207L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = 874241351
	)
	static int field542;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 139028677
	)
	static int field543;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		longValue = -152133301902653265L
	)
	static long field669;
	@ObfuscatedName("er")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = 275758355
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = 1514019037
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -709660557
	)
	static int field548;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = -1792372927
	)
	static int field567;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 1664778039
	)
	static int field550;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = 714789379
	)
	static int field693;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = -483444950
	)
	static int field557;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = -976559424
	)
	static int field713;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 342995904
	)
	static int field746;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("eu")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static class92 field558;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = 1824417205
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = -285158529
	)
	static int field560;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = -961634761
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = 1808720373
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = -772517067
	)
	static int field541;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = -830204195
	)
	static int field592;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = -441683383
	)
	static int field664;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	static class139 field776;
	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	static class519 field571;
	@ObfuscatedName("hl")
	static final String field778;
	@ObfuscatedName("hg")
	static final String field662;
	@ObfuscatedName("hm")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("ie")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "[Ldx;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 641541081
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ih")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("it")
	static String field692;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = 543863055
	)
	static int field640;
	@ObfuscatedName("ic")
	static int[] field737;
	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = 895819663
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("id")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("jn")
	static HashMap field595;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = 1461936041
	)
	static int field596;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = 2065503827
	)
	static int field630;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = 1509888147
	)
	static int field598;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -8326345
	)
	static int field599;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = -1422375547
	)
	static int field600;
	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "[Lis;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("jp")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jf")
	static int[][][] field603;
	@ObfuscatedName("jm")
	static final int[] field711;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = -1566404371
	)
	static int field605;
	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = 302083915
	)
	static int field607;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = 205680803
	)
	static int field718;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 312756687
	)
	static int field609;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = 1345195633
	)
	static int field798;
	@ObfuscatedName("kw")
	static boolean field611;
	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = -1757343563
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = 348196035
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -817936455
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = 603979869
	)
	static int field615;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -1883228053
	)
	static int field616;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = 1169837641
	)
	static int field538;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 1544467501
	)
	static int field682;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 453449917
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = 1252802435
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = -295239457
	)
	static int field621;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = 575673155
	)
	static int field622;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 5882375
	)
	static int field623;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = 623963831
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = -557098467
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = -1700661189
	)
	static int field626;
	@ObfuscatedName("lt")
	static boolean field627;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = -1087269561
	)
	static int field628;
	@ObfuscatedName("lz")
	static boolean field629;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = 393692699
	)
	static int field668;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 1918268123
	)
	static int field631;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 563286433
	)
	static int field563;
	@ObfuscatedName("li")
	static int[] field633;
	@ObfuscatedName("ll")
	static int[] field634;
	@ObfuscatedName("lb")
	static int[] field585;
	@ObfuscatedName("md")
	static int[] field811;
	@ObfuscatedName("mh")
	static int[] field637;
	@ObfuscatedName("mv")
	static int[] field638;
	@ObfuscatedName("mg")
	static int[][] field535;
	@ObfuscatedName("mq")
	static int[] field786;
	@ObfuscatedName("mu")
	static String[] field641;
	@ObfuscatedName("mk")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = -1271442429
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = -829592937
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -1703548153
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = 1726753241
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = 15985943
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = 798221835
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = 1950062223
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("mw")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = 1454203771
	)
	static int field651;
	@ObfuscatedName("mb")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "[Ldf;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = 530420265
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = 1997408031
	)
	static int field655;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		longValue = -367930453646370059L
	)
	static long field656;
	@ObfuscatedName("ms")
	static boolean field764;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		intValue = 2086333427
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = 218131503
	)
	static int field796;
	@ObfuscatedName("nt")
	static int[] field552;
	@ObfuscatedName("nb")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ns")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("nz")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ne")
	static int[] field707;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = 1574957247
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "[[[Low;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("ny")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nk")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nj")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nu")
	static boolean field673;
	@ObfuscatedName("nf")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = 1676985473
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("oz")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("oh")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("oy")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("od")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("og")
	static int[] field680;
	@ObfuscatedName("ob")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ok")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("on")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("oe")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("os")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("ow")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = -473784219
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 369924789
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = -1357245691
	)
	static int field689;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = 2098316339
	)
	static int field690;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 61632949
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("or")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = 757890481
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = 1365611331
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("pa")
	static String field709;
	@ObfuscatedName("pi")
	static String field720;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = 1642683045
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = -1685145543
	)
	static int field540;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = 2109391005
	)
	static int field701;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = 246939975
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 2106479597
	)
	static int field643;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = 679999119
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = 697939723
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = -1773996711
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pp")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = -1550111259
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -866831459
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pw")
	static boolean field715;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = 1055651323
	)
	static int field716;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = 16018961
	)
	static int field717;
	@ObfuscatedName("qn")
	static boolean field762;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = 2053842635
	)
	static int field564;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = -391941313
	)
	static int field636;
	@ObfuscatedName("qm")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = -1028226557
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qo")
	static int[] field723;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = -1139085369
	)
	static int field724;
	@ObfuscatedName("qx")
	static int[] field725;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = 311981329
	)
	static int field726;
	@ObfuscatedName("qz")
	static int[] field650;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = -85127843
	)
	static int field728;
	@ObfuscatedName("qu")
	static int[] field793;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = 220177805
	)
	static int field657;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = -898905347
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -1991914345
	)
	static int field732;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = 307590481
	)
	static int field733;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = -926799759
	)
	static int field734;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = -1052818097
	)
	static int field735;
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		intValue = -637792155
	)
	static int field736;
	@ObfuscatedName("rh")
	@ObfuscatedGetter(
		intValue = 1955656231
	)
	static int field597;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = -1436575603
	)
	static int field578;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = 1827467907
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rm")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	static class532 field740;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("rq")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static NodeDeque field727;
	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static NodeDeque field743;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static NodeDeque field780;
	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = 525652161
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = -2058470363
	)
	static int field747;
	@ObfuscatedName("re")
	static boolean[] field536;
	@ObfuscatedName("rf")
	static boolean[] field749;
	@ObfuscatedName("rl")
	static boolean[] field750;
	@ObfuscatedName("rt")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("rx")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("rw")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("rn")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = 874164869
	)
	static int field755;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		longValue = 7924104649919695757L
	)
	static long field756;
	@ObfuscatedName("sd")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("se")
	static int[] field758;
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = 1986660135
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = -2127681993
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sc")
	static String field554;
	@ObfuscatedName("si")
	static long[] field672;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = -765244531
	)
	static int field534;
	@ObfuscatedName("sp")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	static class212 field674;
	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static class210 field765;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = 1915135663
	)
	static int field766;
	@ObfuscatedName("so")
	static int[] field767;
	@ObfuscatedName("su")
	static int[] field768;
	@ObfuscatedName("sx")
	@ObfuscatedGetter(
		longValue = 7846728172107190483L
	)
	static long field769;
	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "[Lfi;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("tn")
	@ObfuscatedSignature(
		descriptor = "[Lgo;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = 713564975
	)
	static int field772;
	@ObfuscatedName("tl")
	@ObfuscatedGetter(
		intValue = 741539585
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tq")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("tg")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "[Lui;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = 850793817
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = -214324647
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("ta")
	@ObfuscatedGetter(
		intValue = 35990849
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tp")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = -1939358919
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("tf")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("tv")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("ua")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("uj")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("uu")
	@ObfuscatedSignature(
		descriptor = "[Lbp;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("ut")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("ur")
	static boolean field788;
	@ObfuscatedName("ux")
	static boolean field789;
	@ObfuscatedName("uo")
	static boolean field790;
	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	static class479 field791;
	@ObfuscatedName("ue")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	static class478 field582;
	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	static class478 field608;
	@ObfuscatedName("gz")
	String field568;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	class14 field569;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	class18 field648;
	@ObfuscatedName("ho")
	OtlTokenRequester field678;
	@ObfuscatedName("hj")
	Future field572;
	@ObfuscatedName("hh")
	boolean field573;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = 255508409
	)
	int field574;
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	class18 field575;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field576;
	@ObfuscatedName("hz")
	Future field577;
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	Buffer field613;
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	class7 field583;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		longValue = 7631410939937701965L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field566 = true; // L: 163
		worldId = 1; // L: 164
		worldProperties = 0; // L: 165
		gameBuild = 0; // L: 167
		isMembersWorld = false; // L: 170
		isLowDetail = false; // L: 171
		field531 = -1; // L: 176
		clientType = -1; // L: 177
		field544 = -1; // L: 178
		onMobile = false; // L: 179
		field708 = 216; // L: 180
		gameState = 0; // L: 192
		field537 = false; // L: 193
		field539 = true; // L: 217
		cycle = 0; // L: 218
		mouseLastLastPressedTimeMillis = -1L; // L: 219
		field542 = -1; // L: 221
		field543 = -1; // L: 222
		field669 = -1L; // L: 223
		hadFocus = true; // L: 224
		rebootTimer = 0; // L: 225
		hintArrowType = 0; // L: 226
		field548 = 0; // L: 227
		field567 = 0; // L: 228
		field550 = 0; // L: 229
		field693 = 0; // L: 230
		field557 = 0; // L: 231
		field713 = 0; // L: 232
		field746 = 0; // L: 233
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 235
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 236
		renderSelf = false; // L: 237
		field558 = class92.field1169; // L: 246
		js5ConnectState = 0; // L: 249
		field560 = 0; // L: 250
		js5Errors = 0; // L: 273
		loginState = 0; // L: 275
		field541 = 0; // L: 276
		field592 = 0; // L: 277
		field664 = 0; // L: 278
		field776 = class139.field1653; // L: 279
		field571 = class519.field5165; // L: 280
		int var2 = "com_jagex_auth_desktop_osrs:public".length(); // L: 309
		byte[] var3 = new byte[var2]; // L: 310

		int var4;
		char var5;
		for (var4 = 0; var4 < var2; ++var4) { // L: 311
			var5 = "com_jagex_auth_desktop_osrs:public".charAt(var4); // L: 312
			if (var5 > 127) { // L: 313
				var3[var4] = 63;
			} else {
				var3[var4] = (byte)var5; // L: 314
			}
		}

		String var0 = class11.method97(var3, 0, var3.length); // L: 320
		field778 = var0; // L: 322
		var2 = "com_jagex_auth_desktop_runelite:public".length(); // L: 331
		var3 = new byte[var2]; // L: 332

		for (var4 = 0; var4 < var2; ++var4) { // L: 333
			var5 = "com_jagex_auth_desktop_runelite:public".charAt(var4); // L: 334
			if (var5 > 127) { // L: 335
				var3[var4] = 63;
			} else {
				var3[var4] = (byte)var5; // L: 336
			}
		}

		var0 = class11.method97(var3, 0, var3.length); // L: 342
		field662 = var0; // L: 344
		Login_isUsernameRemembered = false; // L: 359
		secureRandomFuture = new SecureRandomFuture(); // L: 360
		randomDatData = null; // L: 366
		npcs = new NPC[65536]; // L: 370
		npcCount = 0; // L: 371
		npcIndices = new int[65536]; // L: 372
		field640 = 0; // L: 373
		field737 = new int[250]; // L: 374
		packetWriter = new PacketWriter(); // L: 377
		logoutTimer = 0; // L: 379
		hadNetworkError = false; // L: 380
		timer = new Timer(); // L: 381
		field595 = new HashMap(); // L: 387
		field596 = 0; // L: 394
		field630 = 1; // L: 395
		field598 = 0; // L: 396
		field599 = 1; // L: 397
		field600 = 0; // L: 398
		collisionMaps = new CollisionMap[4]; // L: 406
		isInInstance = false; // L: 407
		field603 = new int[4][13][13]; // L: 408
		field711 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 409
		field605 = 0; // L: 412
		field607 = 2301979; // L: 424
		field718 = 5063219; // L: 425
		field609 = 3353893; // L: 426
		field798 = 7759444; // L: 427
		field611 = false; // L: 428
		alternativeScrollbarWidth = 0; // L: 429
		camAngleX = 128; // L: 437
		camAngleY = 0; // L: 438
		field615 = 0; // L: 439
		field616 = 0; // L: 440
		field538 = 0; // L: 441
		field682 = 0; // L: 442
		oculusOrbState = 0; // L: 443
		camFollowHeight = 50; // L: 444
		field621 = 0; // L: 448
		field622 = 0; // L: 449
		field623 = 0; // L: 450
		oculusOrbNormalSpeed = 12; // L: 452
		oculusOrbSlowedSpeed = 6; // L: 453
		field626 = 0; // L: 454
		field627 = false; // L: 455
		field628 = 0; // L: 456
		field629 = false; // L: 457
		field668 = 0; // L: 458
		field631 = 0; // L: 459
		field563 = 50; // L: 460
		field633 = new int[field563]; // L: 461
		field634 = new int[field563]; // L: 462
		field585 = new int[field563]; // L: 463
		field811 = new int[field563]; // L: 464
		field637 = new int[field563]; // L: 465
		field638 = new int[field563]; // L: 466
		field535 = new int[field563][]; // L: 467
		field786 = new int[field563]; // L: 468
		field641 = new String[field563]; // L: 469
		tileLastDrawnActor = new int[104][104]; // L: 470
		viewportDrawCount = 0; // L: 471
		viewportTempX = -1; // L: 472
		viewportTempY = -1; // L: 473
		mouseCrossX = 0; // L: 474
		mouseCrossY = 0; // L: 475
		mouseCrossState = 0; // L: 476
		mouseCrossColor = 0; // L: 477
		showMouseCross = true; // L: 478
		field651 = 0; // L: 479
		showLoadingMessages = true; // L: 481
		players = new Player[2048]; // L: 483
		localPlayerIndex = -1; // L: 485
		field655 = 0; // L: 486
		field656 = -1L; // L: 487
		field764 = true; // L: 489
		drawPlayerNames = 0; // L: 494
		field796 = 0; // L: 495
		field552 = new int[1000]; // L: 496
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 498
		playerMenuActions = new String[8]; // L: 499
		playerOptionsPriorities = new boolean[8]; // L: 500
		field707 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 501
		combatTargetPlayerIndex = -1; // L: 502
		groundItems = new NodeDeque[4][104][104]; // L: 503
		pendingSpawns = new NodeDeque(); // L: 504
		projectiles = new NodeDeque(); // L: 505
		graphicsObjects = new NodeDeque(); // L: 506
		currentLevels = new int[25]; // L: 507
		levels = new int[25]; // L: 508
		experience = new int[25]; // L: 509
		field673 = false; // L: 510
		isMenuOpen = false; // L: 511
		menuOptionsCount = 0; // L: 517
		menuArguments1 = new int[500]; // L: 518
		menuArguments2 = new int[500]; // L: 519
		menuOpcodes = new int[500]; // L: 520
		menuIdentifiers = new int[500]; // L: 521
		field680 = new int[500]; // L: 522
		menuActions = new String[500]; // L: 523
		menuTargets = new String[500]; // L: 524
		menuShiftClick = new boolean[500]; // L: 525
		followerOpsLowPriority = false; // L: 526
		tapToDrop = false; // L: 528
		showMouseOverText = true; // L: 529
		viewportX = -1; // L: 530
		viewportY = -1; // L: 531
		field689 = 0; // L: 535
		field690 = 50; // L: 536
		isItemSelected = 0; // L: 537
		field692 = null; // L: 541
		isSpellSelected = false; // L: 542
		selectedSpellChildIndex = -1; // L: 544
		selectedSpellItemId = -1; // L: 545
		field709 = null; // L: 547
		field720 = null; // L: 548
		rootInterface = -1; // L: 549
		interfaceParents = new NodeHashTable(8); // L: 550
		field540 = 0; // L: 555
		field701 = -1; // L: 556
		chatEffects = 0; // L: 557
		meslayerContinueWidget = null; // L: 558
		field643 = 0; // L: 559
		weight = 0; // L: 560
		staffModLevel = 0; // L: 561
		followerIndex = -1; // L: 562
		playerMod = false; // L: 563
		viewportWidget = null; // L: 564
		clickedWidget = null; // L: 565
		clickedWidgetParent = null; // L: 566
		widgetClickX = 0; // L: 567
		widgetClickY = 0; // L: 568
		draggedOnWidget = null; // L: 569
		field715 = false; // L: 570
		field716 = -1; // L: 571
		field717 = -1; // L: 572
		field762 = false; // L: 573
		field564 = -1; // L: 574
		field636 = -1; // L: 575
		isDraggingWidget = false; // L: 576
		cycleCntr = 1; // L: 581
		field723 = new int[32]; // L: 584
		field724 = 0; // L: 585
		field725 = new int[32]; // L: 586
		field726 = 0; // L: 587
		field650 = new int[32]; // L: 588
		field728 = 0; // L: 589
		field793 = new int[32]; // L: 590
		field657 = 0; // L: 591
		chatCycle = 0; // L: 592
		field732 = 0; // L: 593
		field733 = 0; // L: 594
		field734 = 0; // L: 595
		field735 = 0; // L: 596
		field736 = 0; // L: 597
		field597 = 0; // L: 598
		field578 = 0; // L: 599
		mouseWheelRotation = 0; // L: 605
		field740 = new class532(); // L: 606
		scriptEvents = new NodeDeque(); // L: 607
		field727 = new NodeDeque(); // L: 608
		field743 = new NodeDeque(); // L: 609
		field780 = new NodeDeque(); // L: 610
		widgetFlags = new NodeHashTable(512); // L: 611
		rootWidgetCount = 0; // L: 613
		field747 = -2; // L: 614
		field536 = new boolean[100]; // L: 615
		field749 = new boolean[100]; // L: 616
		field750 = new boolean[100]; // L: 617
		rootWidgetXs = new int[100]; // L: 618
		rootWidgetYs = new int[100]; // L: 619
		rootWidgetWidths = new int[100]; // L: 620
		rootWidgetHeights = new int[100]; // L: 621
		field755 = 0; // L: 622
		field756 = 0L; // L: 623
		isResizable = true; // L: 624
		field758 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 631
		publicChatMode = 0; // L: 632
		tradeChatMode = 0; // L: 634
		field554 = ""; // L: 635
		field672 = new long[100]; // L: 637
		field534 = 0; // L: 638
		field674 = new class212(); // L: 639
		field765 = new class210(); // L: 640
		field766 = 0; // L: 642
		field767 = new int[128]; // L: 643
		field768 = new int[128]; // L: 644
		field769 = -1L; // L: 645
		currentClanSettings = new ClanSettings[4]; // L: 649
		currentClanChannels = new ClanChannel[4]; // L: 651
		field772 = -1; // L: 653
		mapIconCount = 0; // L: 654
		mapIconXs = new int[1000]; // L: 655
		mapIconYs = new int[1000]; // L: 656
		mapIcons = new SpritePixels[1000]; // L: 657
		destinationX = 0; // L: 658
		destinationY = 0; // L: 659
		minimapState = 0; // L: 666
		playingJingle = false; // L: 667
		soundEffectCount = 0; // L: 672
		soundEffectIds = new int[50]; // L: 673
		queuedSoundEffectLoops = new int[50]; // L: 674
		queuedSoundEffectDelays = new int[50]; // L: 675
		soundLocations = new int[50]; // L: 676
		soundEffects = new SoundEffect[50]; // L: 677
		isCameraLocked = false; // L: 679
		field788 = false; // L: 685
		field789 = false; // L: 686
		field790 = false; // L: 687
		field791 = null; // L: 693
		field582 = null; // L: 694
		field608 = null; // L: 695
		field794 = false; // L: 696
		field795 = new boolean[5]; // L: 704
		field588 = new int[5]; // L: 705
		field748 = new int[5]; // L: 706
		field658 = new int[5]; // L: 707
		field744 = new int[5]; // L: 708
		field800 = 256; // L: 709
		field685 = 205; // L: 710
		zoomHeight = 256; // L: 711
		zoomWidth = 320; // L: 712
		field804 = 1; // L: 713
		field635 = 32767; // L: 714
		field806 = 1; // L: 715
		field807 = 32767; // L: 716
		viewportOffsetX = 0; // L: 717
		viewportOffsetY = 0; // L: 718
		viewportWidth = 0; // L: 719
		viewportHeight = 0; // L: 720
		viewportZoom = 0; // L: 721
		playerAppearance = new PlayerComposition(); // L: 723
		field632 = -1; // L: 724
		field815 = -1; // L: 725
		field671 = new DesktopPlatformInfoProvider(); // L: 727
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 729
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 732
		archive5 = new class423(8, class421.field4606); // L: 734
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 736
		Widget_cachedFonts = new EvictingDualNodeHashTable(64); // L: 737
		field822 = -1; // L: 740
		field649 = -1; // L: 746
		field695 = new ArrayList(); // L: 747
		archiveLoaders = new ArrayList(10); // L: 748
		archiveLoadersDone = 0; // L: 749
		field827 = 0; // L: 750
		field828 = new ApproximateRouteStrategy(); // L: 759
		field829 = new int[50]; // L: 760
		field830 = new int[50]; // L: 761
	}

	public Client() {
		this.field573 = false; // L: 298
		this.field574 = 0; // L: 299
		this.accountHash = -1L; // L: 365
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "59"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field756 = GameEngine.method661() + 500L; // L: 4474
		this.resizeJS(); // L: 4475
		if (rootInterface != -1) { // L: 4476
			this.resizeRoot(true);
		}

	} // L: 4477

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "208117174"
	)
	@Export("setUp")
	protected final void setUp() {
		PacketBufferNode.method5707(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 1043
		class480.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 1044
		class129.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 1045
		class4.currentPort = class480.worldPort; // L: 1046
		UrlRequest.field1458 = class330.field3619; // L: 1047
		class140.field1659 = class330.field3623; // L: 1048
		PlayerComposition.field3578 = class330.field3621; // L: 1049
		PlayerComposition.field3586 = class330.field3622; // L: 1050
		FriendsChatManager.urlRequester = new class113(this.field573, 216); // L: 1051
		this.setUpKeyboard(); // L: 1052
		this.method503(); // L: 1053
		class12.mouseWheel = this.mouseWheel(); // L: 1054
		this.method652(field765, 0); // L: 1055
		this.method652(field674, 1); // L: 1056
		class6.field17 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1057
		AccessFile var2 = null; // L: 1060
		ClientPreferences var3 = new ClientPreferences(); // L: 1061

		try {
			var2 = Decimator.getPreferencesFile("", WorldMapSectionType.field2997.name, false); // L: 1063
			byte[] var4 = new byte[(int)var2.length()]; // L: 1064

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) { // L: 1065 1066 1069
				var6 = var2.read(var4, var5, var4.length - var5); // L: 1067
				if (var6 == -1) { // L: 1068
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4)); // L: 1071
		} catch (Exception var8) { // L: 1073
		}

		try {
			if (var2 != null) { // L: 1075
				var2.close(); // L: 1076
			}
		} catch (Exception var7) { // L: 1079
		}

		class449.clientPreferences = var3; // L: 1082
		this.setUpClipboard(); // L: 1083
		class25.method375(this, class18.field89); // L: 1084
		class270.setWindowedMode(class449.clientPreferences.method2470()); // L: 1085
		class299.friendSystem = new FriendSystem(Language.loginType); // L: 1086
		this.field569 = new class14("tokenRequest", 1, 1); // L: 1087
		if (!class305.field3407.contains(this)) { // L: 1090
			class305.field3407.add(this); // L: 1091
		}

		class218.field2412 = new class216[1]; // L: 1095
		class214 var9 = class214.field2381; // L: 1096
		class218.field2412[0] = new class216(var9.field2383, var9.field2388); // L: 1097
	} // L: 1099

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1753601126"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1107
		this.doCycleJs5(); // L: 1108

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 1112
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 1113
			} // L: 1114

			if (var1 == null) { // L: 1115
				boolean var5 = WorldMapArea.method5162(); // L: 1119
				if (var5 && playingJingle && class399.pcmPlayer0 != null) { // L: 1120 1121
					class399.pcmPlayer0.tryDiscard();
				}

				class301.method5721(); // L: 1123
				field674.method4108(); // L: 1124
				this.method501(); // L: 1125
				synchronized(MouseHandler.MouseHandler_instance) { // L: 1127
					MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 1128
					MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 1129
					MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 1130
					MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 1131
					MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 1132
					MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 1133
					MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 1134
					MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 1135
					MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 1136
				} // L: 1137

				if (class12.mouseWheel != null) { // L: 1139
					int var6 = class12.mouseWheel.useRotation(); // L: 1140
					mouseWheelRotation = var6; // L: 1141
				}

				if (gameState == 0) { // L: 1143
					ParamComposition.method3821(); // L: 1144
					PacketWriter.method2798(); // L: 1145
				} else if (gameState == 5) { // L: 1147
					GrandExchangeOfferWorldComparator.method6860(this, HealthBarUpdate.field1278, SecureRandomCallable.fontPlain12); // L: 1148
					ParamComposition.method3821(); // L: 1149
					PacketWriter.method2798(); // L: 1150
				} else if (gameState != 10 && gameState != 11) { // L: 1152
					if (gameState == 20) { // L: 1153
						GrandExchangeOfferWorldComparator.method6860(this, HealthBarUpdate.field1278, SecureRandomCallable.fontPlain12); // L: 1154
						this.doCycleLoggedOut(); // L: 1155
					} else if (gameState == 50) { // L: 1157
						GrandExchangeOfferWorldComparator.method6860(this, HealthBarUpdate.field1278, SecureRandomCallable.fontPlain12); // L: 1158
						this.doCycleLoggedOut(); // L: 1159
					} else if (gameState == 25) { // L: 1161
						class370.method6926();
					}
				} else {
					GrandExchangeOfferWorldComparator.method6860(this, HealthBarUpdate.field1278, SecureRandomCallable.fontPlain12);
				}

				if (gameState == 30) { // L: 1162
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) { // L: 1163
					this.doCycleLoggedOut();
				}

				return; // L: 1164
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false); // L: 1116
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1944984067"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field756 && GameEngine.method661() > field756) { // L: 1168 1169
			class270.setWindowedMode(class218.getWindowedMode()); // L: 1170
		}

		int var2;
		if (var1) { // L: 1173
			for (var2 = 0; var2 < 100; ++var2) { // L: 1174
				field536[var2] = true;
			}
		}

		if (gameState == 0) { // L: 1176
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1177
			class105.drawTitle(class59.fontBold12, HealthBarUpdate.field1278, SecureRandomCallable.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1178
			if (gameState == 20) { // L: 1179
				class105.drawTitle(class59.fontBold12, HealthBarUpdate.field1278, SecureRandomCallable.fontPlain12);
			} else if (gameState == 50) { // L: 1180
				class105.drawTitle(class59.fontBold12, HealthBarUpdate.field1278, SecureRandomCallable.fontPlain12);
			} else if (gameState == 25) { // L: 1181
				if (field600 == 1) { // L: 1182
					if (field596 > field630) { // L: 1183
						field630 = field596;
					}

					var2 = (field630 * 50 - field596 * 50) / field630; // L: 1184
					class405.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false); // L: 1185
				} else if (field600 == 2) { // L: 1187
					if (field598 > field599) { // L: 1188
						field599 = field598;
					}

					var2 = (field599 * 50 - field598 * 50) / field599 + 50; // L: 1189
					class405.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false); // L: 1190
				} else {
					class405.drawLoadingMessage("Loading - please wait.", false); // L: 1192
				}
			} else if (gameState == 30) { // L: 1194
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1195
				class405.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1196
				class405.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class105.drawTitle(class59.fontBold12, HealthBarUpdate.field1278, SecureRandomCallable.fontPlain12); // L: 1186
		}

		if (gameState == 30 && field755 == 0 && !var1 && !isResizable) { // L: 1197
			for (var2 = 0; var2 < rootWidgetCount; ++var2) { // L: 1198
				if (field749[var2]) { // L: 1199
					AttackOption.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]); // L: 1200
					field749[var2] = false; // L: 1201
				}
			}
		} else if (gameState > 0) { // L: 1205
			AttackOption.rasterProvider.drawFull(0, 0); // L: 1206

			for (var2 = 0; var2 < rootWidgetCount; ++var2) { // L: 1207
				field749[var2] = false;
			}
		}

	} // L: 1209

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1298916795"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class25.varcs.hasUnwrittenChanges()) { // L: 1212
			class25.varcs.write();
		}

		if (class126.mouseRecorder != null) { // L: 1213
			class126.mouseRecorder.isRunning = false;
		}

		class126.mouseRecorder = null; // L: 1214
		packetWriter.close(); // L: 1215
		if (MouseHandler.MouseHandler_instance != null) { // L: 1217
			synchronized(MouseHandler.MouseHandler_instance) { // L: 1218
				MouseHandler.MouseHandler_instance = null; // L: 1219
			} // L: 1220
		}

		class12.mouseWheel = null; // L: 1223
		if (class399.pcmPlayer0 != null) { // L: 1224
			class399.pcmPlayer0.shutdown();
		}

		class308.field3462.method6800(); // L: 1225
		class214.method4180(); // L: 1226
		if (FriendsChatManager.urlRequester != null) { // L: 1227
			FriendsChatManager.urlRequester.close(); // L: 1228
			FriendsChatManager.urlRequester = null; // L: 1229
		}

		class510.method8993(); // L: 1231
		this.field569.method173(); // L: 1232
	} // L: 1233

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1929688897"
	)
	protected final void vmethod1241() {
	} // L: 768

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "920896355"
	)
	boolean method1558() {
		return this.field574 == 1; // L: 940
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1597201922"
	)
	boolean method1246() {
		return class27.field144 != null && !class27.field144.trim().isEmpty() && class9.field40 != null && !class9.field40.trim().isEmpty(); // L: 980
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "106"
	)
	boolean method1428() {
		return class157.field1762 != null && !class157.field1762.trim().isEmpty() && Varcs.field1416 != null && !Varcs.field1416.trim().isEmpty(); // L: 984
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "13"
	)
	@Export("isOtlTokenRequesterInitialized")
	boolean isOtlTokenRequesterInitialized() {
		return this.field678 != null; // L: 988
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1881627729"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 992
		var2.put("grant_type", "refresh_token"); // L: 993
		var2.put("scope", "gamesso.token.create"); // L: 994
		var2.put("refresh_token", var1); // L: 995
		URL var3 = new URL(class510.field5094 + "shield/oauth/token" + (new class463(var2)).method8343()); // L: 996
		class419 var4 = new class419(); // L: 997
		if (this.method1558()) { // L: 998
			var4.method7720(field662); // L: 999
		} else {
			var4.method7720(field778); // L: 1002
		}

		var4.method7717("Host", (new URL(class510.field5094)).getHost()); // L: 1004
		var4.method7724(class460.field4772); // L: 1005
		class9 var5 = class9.field32; // L: 1006
		RefreshAccessTokenRequester var6 = this.field576; // L: 1007
		if (var6 != null) { // L: 1008
			this.field577 = var6.request(var5.method62(), var3, var4.method7716(), ""); // L: 1009
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field573); // L: 1012
			this.field575 = this.field569.method165(var7); // L: 1013
		}
	} // L: 1010 1014

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	void method1250(String var1) throws IOException {
		URL var2 = new URL(class510.field5094 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		class419 var3 = new class419();
		var3.method7756(var1);
		class9 var4 = class9.field31;
		OtlTokenRequester var5 = this.field678;
		if (var5 != null) { // L: 1022
			this.field572 = var5.request(var4.method62(), var2, var3.method7716(), "");
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field573);
			this.field648 = this.field569.method165(var6); // L: 1027
		}
	} // L: 1028

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1347426796"
	)
	void method1416(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class510.field5094 + "game-session/v1/tokens"); // L: 1031
		class10 var4 = new class10(var3, class9.field32, this.field573); // L: 1032
		var4.method85().method7756(var1); // L: 1033
		var4.method85().method7724(class460.field4772); // L: 1034
		JSONObject var5 = new JSONObject(); // L: 1035
		var5.put("accountId", var2); // L: 1036
		var4.method78(new class462(var5)); // L: 1037
		this.field648 = this.field569.method165(var4); // L: 1038
	} // L: 1039

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "286321361"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1378
			boolean var1 = class308.field3462.method6797(); // L: 1379
			if (!var1) { // L: 1380
				this.method1410();
			}

		}
	} // L: 1381

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "375037576"
	)
	void method1410() {
		if (class308.field3462.field4300 >= 4) { // L: 1384
			this.error("js5crc"); // L: 1385
			class317.method6014(1000); // L: 1386
		} else {
			if (class308.field3462.field4323 >= 4) { // L: 1389
				if (gameState <= 5) { // L: 1390
					this.error("js5io"); // L: 1391
					class317.method6014(1000); // L: 1392
					return; // L: 1393
				}

				field560 = 3000; // L: 1396
				class308.field3462.field4323 = 3; // L: 1397
			}

			if (--field560 + 1 <= 0) { // L: 1400
				try {
					if (js5ConnectState == 0) { // L: 1402
						class126.js5SocketTask = GameEngine.taskHandler.newSocketTask(class292.worldHost, class4.currentPort); // L: 1403
						++js5ConnectState; // L: 1404
					}

					if (js5ConnectState == 1) { // L: 1406
						if (class126.js5SocketTask.status == 2) { // L: 1407
							this.js5Error(-1); // L: 1408
							return; // L: 1409
						}

						if (class126.js5SocketTask.status == 1) { // L: 1411
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1413
						Socket var2 = (Socket)class126.js5SocketTask.result; // L: 1415
						BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000); // L: 1417
						class59.js5Socket = var1; // L: 1419
						Buffer var3 = new Buffer(5); // L: 1420
						var3.writeByte(15); // L: 1421
						var3.writeInt(216); // L: 1422
						class59.js5Socket.write(var3.array, 0, 5); // L: 1423
						++js5ConnectState; // L: 1424
						class270.field3042 = GameEngine.method661(); // L: 1425
					}

					if (js5ConnectState == 3) { // L: 1427
						if (class59.js5Socket.available() > 0) { // L: 1428
							int var4 = class59.js5Socket.readUnsignedByte(); // L: 1429
							if (var4 != 0) { // L: 1430
								this.js5Error(var4); // L: 1431
								return; // L: 1432
							}

							++js5ConnectState; // L: 1434
						} else if (GameEngine.method661() - class270.field3042 > 30000L) { // L: 1437
							this.js5Error(-2); // L: 1438
							return; // L: 1439
						}
					}

					if (js5ConnectState == 4) { // L: 1443
						class308.field3462.method6792(class59.js5Socket, gameState > 20); // L: 1444
						class126.js5SocketTask = null; // L: 1445
						class59.js5Socket = null; // L: 1446
						js5ConnectState = 0; // L: 1447
						js5Errors = 0; // L: 1448
					}
				} catch (IOException var5) { // L: 1451
					this.js5Error(-3); // L: 1452
				}

			}
		}
	} // L: 1387 1454

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "17"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class126.js5SocketTask = null; // L: 1457
		class59.js5Socket = null; // L: 1458
		js5ConnectState = 0; // L: 1459
		if (class4.currentPort == class480.worldPort) { // L: 1460
			class4.currentPort = class129.js5Port;
		} else {
			class4.currentPort = class480.worldPort; // L: 1461
		}

		++js5Errors; // L: 1462
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1463
			if (gameState <= 5) { // L: 1464
				this.error("js5connect_full"); // L: 1465
				class317.method6014(1000); // L: 1466
			} else {
				field560 = 3000; // L: 1468
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1470
			this.error("js5connect_outofdate"); // L: 1471
			class317.method6014(1000); // L: 1472
		} else if (js5Errors >= 4) { // L: 1474
			if (gameState <= 5) { // L: 1475
				this.error("js5connect"); // L: 1476
				class317.method6014(1000); // L: 1477
			} else {
				field560 = 3000; // L: 1479
			}
		}

	} // L: 1481

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "70"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 1992
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 1993

		try {
			if (loginState == 0) { // L: 1995
				if (GraphicsObject.secureRandom == null && (secureRandomFuture.isDone() || field541 > 250)) { // L: 1996
					GraphicsObject.secureRandom = secureRandomFuture.get(); // L: 1997
					secureRandomFuture.shutdown(); // L: 1998
					secureRandomFuture = null; // L: 1999
				}

				if (GraphicsObject.secureRandom != null) { // L: 2001
					if (var1 != null) { // L: 2002
						((AbstractSocket)var1).close(); // L: 2003
						var1 = null; // L: 2004
					}

					VarcInt.socketTask = null; // L: 2006
					hadNetworkError = false; // L: 2007
					field541 = 0; // L: 2008
					if (field571.method9339()) { // L: 2009
						if (this.method1246()) { // L: 2010
							try {
								this.requestOtlToken(class9.field40); // L: 2012
								class316.method6012(21); // L: 2013
							} catch (Throwable var25) { // L: 2015
								Messages.RunException_sendStackTrace((String)null, var25); // L: 2016
								class387.getLoginError(65); // L: 2017
								return; // L: 2018
							}
						} else {
							if (!this.method1428()) { // L: 2021
								class387.getLoginError(65); // L: 2033
								return; // L: 2034
							}

							try {
								this.method1416(class157.field1762, Varcs.field1416); // L: 2023
								class316.method6012(20); // L: 2024
							} catch (Exception var24) { // L: 2026
								Messages.RunException_sendStackTrace((String)null, var24); // L: 2027
								class387.getLoginError(65); // L: 2028
								return; // L: 2029
							}
						}
					} else {
						class316.method6012(1); // L: 2038
					}
				}
			}

			class20 var27;
			if (loginState == 21) { // L: 2042
				if (this.field577 != null) { // L: 2043
					if (!this.field577.isDone()) { // L: 2044
						return; // L: 2045
					}

					if (this.field577.isCancelled()) { // L: 2047
						class387.getLoginError(65); // L: 2048
						this.field577 = null; // L: 2049
						return; // L: 2050
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field577.get(); // L: 2053
						if (!var3.isSuccess()) { // L: 2054
							class387.getLoginError(65); // L: 2055
							this.field577 = null; // L: 2056
							return; // L: 2057
						}

						class27.field144 = var3.getAccessToken(); // L: 2059
						class9.field40 = var3.getRefreshToken(); // L: 2060
						this.field577 = null; // L: 2061
					} catch (Exception var23) { // L: 2063
						Messages.RunException_sendStackTrace((String)null, var23); // L: 2064
						class387.getLoginError(65); // L: 2065
						this.field577 = null; // L: 2066
						return; // L: 2067
					}
				} else {
					if (this.field575 == null) { // L: 2070
						class387.getLoginError(65); // L: 2100
						return; // L: 2101
					}

					if (!this.field575.method271()) { // L: 2071
						return; // L: 2072
					}

					if (this.field575.method276()) { // L: 2074
						Messages.RunException_sendStackTrace(this.field575.method286(), (Throwable)null); // L: 2075
						class387.getLoginError(65); // L: 2076
						this.field575 = null; // L: 2077
						return; // L: 2078
					}

					var27 = this.field575.method281(); // L: 2080
					if (var27.method296() != 200) { // L: 2081
						class387.getLoginError(65); // L: 2082
						this.field575 = null; // L: 2083
						return; // L: 2084
					}

					field541 = 0; // L: 2086
					class462 var4 = new class462(var27.method299()); // L: 2087

					try {
						class27.field144 = var4.method8332().getString("access_token"); // L: 2089
						class9.field40 = var4.method8332().getString("refresh_token"); // L: 2090
					} catch (Exception var22) { // L: 2092
						Messages.RunException_sendStackTrace("Error parsing tokens", var22); // L: 2093
						class387.getLoginError(65); // L: 2094
						this.field575 = null; // L: 2095
						return; // L: 2096
					}
				}

				this.method1250(class27.field144); // L: 2103
				class316.method6012(20); // L: 2104
			}

			if (loginState == 20) { // L: 2106
				if (this.field572 != null) { // L: 2107
					if (!this.field572.isDone()) { // L: 2108
						return; // L: 2109
					}

					if (this.field572.isCancelled()) { // L: 2111
						class387.getLoginError(65); // L: 2112
						this.field572 = null; // L: 2113
						return; // L: 2114
					}

					try {
						OtlTokenResponse var28 = (OtlTokenResponse)this.field572.get(); // L: 2117
						if (!var28.isSuccess()) { // L: 2118
							class387.getLoginError(65); // L: 2119
							this.field572 = null; // L: 2120
							return; // L: 2121
						}

						this.field568 = var28.getToken(); // L: 2123
						this.field572 = null; // L: 2124
					} catch (Exception var21) { // L: 2126
						Messages.RunException_sendStackTrace((String)null, var21); // L: 2127
						class387.getLoginError(65); // L: 2128
						this.field572 = null; // L: 2129
						return; // L: 2130
					}
				} else {
					if (this.field648 == null) { // L: 2133
						class387.getLoginError(65); // L: 2169
						return; // L: 2170
					}

					if (!this.field648.method271()) { // L: 2134
						return; // L: 2135
					}

					if (this.field648.method276()) { // L: 2137
						Messages.RunException_sendStackTrace(this.field648.method286(), (Throwable)null); // L: 2138
						class387.getLoginError(65); // L: 2139
						this.field648 = null; // L: 2140
						return; // L: 2141
					}

					var27 = this.field648.method281(); // L: 2143
					if (var27.method296() != 200) { // L: 2144
						Messages.RunException_sendStackTrace("Response code: " + var27.method296() + "Response body: " + var27.method299(), (Throwable)null); // L: 2145
						class387.getLoginError(65); // L: 2146
						this.field648 = null; // L: 2147
						return; // L: 2148
					}

					List var30 = (List)var27.method298().get("Content-Type"); // L: 2150
					if (var30 != null && var30.contains(class460.field4772.method8321())) { // L: 2151
						try {
							JSONObject var5 = new JSONObject(var27.method299()); // L: 2153
							this.field568 = var5.getString("token"); // L: 2154
						} catch (JSONException var20) { // L: 2156
							Messages.RunException_sendStackTrace((String)null, var20); // L: 2157
							class387.getLoginError(65); // L: 2158
							this.field648 = null; // L: 2159
							return; // L: 2160
						}
					} else {
						this.field568 = var27.method299(); // L: 2164
					}

					this.field648 = null; // L: 2166
				}

				field541 = 0; // L: 2172
				class316.method6012(1); // L: 2173
			}

			if (loginState == 1) { // L: 2175
				if (VarcInt.socketTask == null) { // L: 2176
					VarcInt.socketTask = GameEngine.taskHandler.newSocketTask(class292.worldHost, class4.currentPort); // L: 2177
				}

				if (VarcInt.socketTask.status == 2) { // L: 2179
					throw new IOException();
				}

				if (VarcInt.socketTask.status == 1) { // L: 2180
					Socket var31 = (Socket)VarcInt.socketTask.result; // L: 2182
					BufferedNetSocket var29 = new BufferedNetSocket(var31, 40000, 5000); // L: 2184
					var1 = var29; // L: 2186
					packetWriter.setSocket(var29); // L: 2187
					VarcInt.socketTask = null; // L: 2188
					class316.method6012(2); // L: 2189
				}
			}

			PacketBufferNode var33;
			if (loginState == 2) { // L: 2192
				packetWriter.clearBuffer(); // L: 2193
				var33 = class146.method3131(); // L: 2196
				var33.clientPacket = null; // L: 2197
				var33.clientPacketLength = 0; // L: 2198
				var33.packetBuffer = new PacketBuffer(5000); // L: 2199
				var33.packetBuffer.writeByte(LoginPacket.field3365.id); // L: 2203
				packetWriter.addNode(var33); // L: 2204
				packetWriter.flush(); // L: 2205
				var2.offset = 0; // L: 2206
				class316.method6012(3); // L: 2207
			}

			int var13;
			if (loginState == 3) { // L: 2209
				if (class399.pcmPlayer0 != null) { // L: 2210
					class399.pcmPlayer0.method804();
				}

				if (((AbstractSocket)var1).isAvailable(1)) { // L: 2211
					var13 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2212
					if (class399.pcmPlayer0 != null) { // L: 2213
						class399.pcmPlayer0.method804();
					}

					if (var13 != 0) { // L: 2214
						class387.getLoginError(var13); // L: 2215
						return; // L: 2216
					}

					var2.offset = 0; // L: 2218
					class316.method6012(4); // L: 2219
				}
			}

			if (loginState == 4) { // L: 2222
				if (var2.offset < 8) { // L: 2223
					var13 = ((AbstractSocket)var1).available(); // L: 2224
					if (var13 > 8 - var2.offset) { // L: 2225
						var13 = 8 - var2.offset;
					}

					if (var13 > 0) { // L: 2226
						((AbstractSocket)var1).read(var2.array, var2.offset, var13); // L: 2227
						var2.offset += var13; // L: 2228
					}
				}

				if (var2.offset == 8) { // L: 2231
					var2.offset = 0; // L: 2232
					class125.field1501 = var2.readLong(); // L: 2233
					class316.method6012(5); // L: 2234
				}
			}

			if (loginState == 5) { // L: 2237
				packetWriter.packetBuffer.offset = 0; // L: 2238
				packetWriter.clearBuffer(); // L: 2239
				PacketBuffer var32 = new PacketBuffer(500); // L: 2240
				int[] var35 = new int[]{GraphicsObject.secureRandom.nextInt(), GraphicsObject.secureRandom.nextInt(), GraphicsObject.secureRandom.nextInt(), GraphicsObject.secureRandom.nextInt()}; // L: 2241 2242 2243 2244 2245
				var32.offset = 0; // L: 2246
				var32.writeByte(1); // L: 2247
				var32.writeInt(var35[0]); // L: 2248
				var32.writeInt(var35[1]); // L: 2249
				var32.writeInt(var35[2]); // L: 2250
				var32.writeInt(var35[3]); // L: 2251
				var32.writeLong(class125.field1501); // L: 2252
				if (gameState == 40) { // L: 2253
					var32.writeInt(class194.field2029[0]); // L: 2254
					var32.writeInt(class194.field2029[1]); // L: 2255
					var32.writeInt(class194.field2029[2]); // L: 2256
					var32.writeInt(class194.field2029[3]); // L: 2257
				} else {
					if (gameState == 50) { // L: 2260
						var32.writeByte(class139.field1648.rsOrdinal()); // L: 2261
						var32.writeInt(class72.field906); // L: 2262
					} else {
						var32.writeByte(field776.rsOrdinal()); // L: 2265
						switch(field776.field1651) { // L: 2266
						case 0:
							var32.writeInt(class449.clientPreferences.method2506(Login.Login_username)); // L: 2269
						case 1:
						default:
							break;
						case 2:
						case 4:
							var32.writeMedium(class503.field5039); // L: 2275
							++var32.offset; // L: 2276
							break; // L: 2277
						case 3:
							var32.offset += 4; // L: 2281
						}
					}

					if (field571.method9339()) { // L: 2286
						var32.writeByte(class519.field5164.rsOrdinal()); // L: 2287
						var32.writeStringCp1252NullTerminated(this.field568); // L: 2288
					} else {
						var32.writeByte(class519.field5165.rsOrdinal()); // L: 2291
						var32.writeStringCp1252NullTerminated(Login.Login_password); // L: 2292
					}
				}

				var32.encryptRsa(class74.field925, class74.field928); // L: 2295
				class194.field2029 = var35; // L: 2296
				PacketBufferNode var6 = class146.method3131(); // L: 2299
				var6.clientPacket = null; // L: 2300
				var6.clientPacketLength = 0; // L: 2301
				var6.packetBuffer = new PacketBuffer(5000); // L: 2302
				var6.packetBuffer.offset = 0; // L: 2306
				if (gameState == 40) { // L: 2307
					var6.packetBuffer.writeByte(LoginPacket.field3360.id); // L: 2308
				} else {
					var6.packetBuffer.writeByte(LoginPacket.field3359.id); // L: 2311
				}

				var6.packetBuffer.writeShort(0); // L: 2313
				int var7 = var6.packetBuffer.offset; // L: 2314
				var6.packetBuffer.writeInt(216); // L: 2315
				var6.packetBuffer.writeInt(1); // L: 2316
				var6.packetBuffer.writeByte(clientType); // L: 2317
				var6.packetBuffer.writeByte(field544); // L: 2318
				byte var8 = 0; // L: 2319
				var6.packetBuffer.writeByte(var8); // L: 2320
				var6.packetBuffer.writeBytes(var32.array, 0, var32.offset); // L: 2321
				int var9 = var6.packetBuffer.offset; // L: 2322
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2323
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2324
				var6.packetBuffer.writeShort(class113.canvasWidth); // L: 2325
				var6.packetBuffer.writeShort(class177.canvasHeight); // L: 2326
				class177.method3495(var6.packetBuffer); // L: 2327
				var6.packetBuffer.writeStringCp1252NullTerminated(MusicPatchPcmStream.field3478); // L: 2328
				var6.packetBuffer.writeInt(WorldMapSectionType.field2996); // L: 2329
				if (field708 > 213) { // L: 2330
					var6.packetBuffer.writeByte(0); // L: 2331
				}

				Buffer var10 = new Buffer(class18.field92.size()); // L: 2333
				class18.field92.write(var10); // L: 2334
				var6.packetBuffer.writeBytes(var10.array, 0, var10.array.length); // L: 2335
				var6.packetBuffer.writeByte(clientType); // L: 2336
				var6.packetBuffer.writeInt(0); // L: 2337
				var6.packetBuffer.writeIntME(class499.archive6.hash); // L: 2338
				var6.packetBuffer.writeIntME(Tiles.field1038.hash); // L: 2339
				var6.packetBuffer.writeIntME(class106.field1371.hash); // L: 2340
				var6.packetBuffer.writeIntME(class147.archive10.hash); // L: 2341
				var6.packetBuffer.writeIntME(class388.field4435.hash); // L: 2342
				var6.packetBuffer.method9112(ObjectSound.archive4.hash); // L: 2343
				var6.packetBuffer.writeInt(class227.field2545.hash); // L: 2344
				var6.packetBuffer.method9111(KeyHandler.archive9.hash); // L: 2345
				var6.packetBuffer.writeInt(AttackOption.field1351.hash); // L: 2346
				var6.packetBuffer.writeIntME(class10.field46.hash); // L: 2347
				var6.packetBuffer.writeIntME(0); // L: 2348
				var6.packetBuffer.method9112(ClanChannelMember.field1676.hash); // L: 2349
				var6.packetBuffer.writeIntME(Player.archive13.hash); // L: 2350
				var6.packetBuffer.method9111(class141.field1665.hash); // L: 2351
				var6.packetBuffer.writeIntME(class1.archive2.hash); // L: 2352
				var6.packetBuffer.method9112(class318.archive7.hash); // L: 2353
				var6.packetBuffer.method9111(class385.archive11.hash); // L: 2354
				var6.packetBuffer.writeInt(WorldMapElement.field1964.hash); // L: 2355
				var6.packetBuffer.method9111(Message.archive8.hash); // L: 2356
				var6.packetBuffer.method9112(PcmPlayer.field304.hash); // L: 2357
				var6.packetBuffer.writeInt(GrandExchangeOffer.archive12.hash); // L: 2358
				var6.packetBuffer.xteaEncrypt(var35, var9, var6.packetBuffer.offset); // L: 2359
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var7); // L: 2360
				packetWriter.addNode(var6); // L: 2361
				packetWriter.flush(); // L: 2362
				packetWriter.isaacCipher = new IsaacCipher(var35); // L: 2363
				int[] var11 = new int[4]; // L: 2364

				for (int var12 = 0; var12 < 4; ++var12) { // L: 2365
					var11[var12] = var35[var12] + 50;
				}

				var2.newIsaacCipher(var11); // L: 2366
				class316.method6012(6); // L: 2367
			}

			int var14;
			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2369 2370
				var13 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2371
				if (var13 == 61) { // L: 2372
					var14 = ((AbstractSocket)var1).available(); // L: 2373
					ModeWhere.field4404 = var14 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2374
					class316.method6012(5); // L: 2375
				}

				if (var13 == 21 && gameState == 20) { // L: 2377
					class316.method6012(12); // L: 2378
				} else if (var13 == 2) { // L: 2380
					class316.method6012(14); // L: 2381
				} else if (var13 == 15 && gameState == 40) { // L: 2383
					packetWriter.serverPacketLength = -1; // L: 2384
					class316.method6012(19); // L: 2385
				} else if (var13 == 64) { // L: 2387
					class316.method6012(10); // L: 2388
				} else if (var13 == 23 && field592 < 1) { // L: 2390
					++field592; // L: 2391
					class316.method6012(0); // L: 2392
				} else if (var13 == 29) { // L: 2394
					class316.method6012(17); // L: 2395
				} else {
					if (var13 != 69) { // L: 2397
						class387.getLoginError(var13); // L: 2401
						return; // L: 2402
					}

					class316.method6012(7); // L: 2398
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2406 2407
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2408
				var2.offset = 0; // L: 2409
				class12.field58 = var2.readUnsignedShort(); // L: 2410
				class316.method6012(8); // L: 2411
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= class12.field58) { // L: 2414 2415
				var2.offset = 0; // L: 2416
				((AbstractSocket)var1).read(var2.array, var2.offset, class12.field58); // L: 2417
				class6 var34 = class303.method5741()[var2.readUnsignedByte()]; // L: 2418

				try {
					switch(var34.field18) { // L: 2422
					case 0:
						class0 var38 = new class0(); // L: 2425
						this.field583 = new class7(var2, var38); // L: 2435
						class316.method6012(9); // L: 2436
						break;
					default:
						throw new IllegalArgumentException(); // L: 2430
					}
				} catch (Exception var19) { // L: 2438
					class387.getLoginError(22); // L: 2439
					return; // L: 2440
				}
			}

			if (loginState == 9 && this.field583.method42()) { // L: 2444 2445
				this.field613 = this.field583.method41(); // L: 2446
				this.field583.method39(); // L: 2447
				this.field583 = null; // L: 2448
				if (this.field613 == null) { // L: 2449
					class387.getLoginError(22); // L: 2450
					return; // L: 2451
				}

				packetWriter.clearBuffer(); // L: 2453
				var33 = class146.method3131(); // L: 2456
				var33.clientPacket = null; // L: 2457
				var33.clientPacketLength = 0; // L: 2458
				var33.packetBuffer = new PacketBuffer(5000); // L: 2459
				var33.packetBuffer.writeByte(LoginPacket.field3361.id); // L: 2463
				var33.packetBuffer.writeShort(this.field613.offset); // L: 2464
				var33.packetBuffer.method9052(this.field613); // L: 2465
				packetWriter.addNode(var33); // L: 2466
				packetWriter.flush(); // L: 2467
				this.field613 = null; // L: 2468
				class316.method6012(6); // L: 2469
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2472 2473
				class25.field123 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2474
				class316.method6012(11); // L: 2475
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class25.field123) { // L: 2478 2479
				((AbstractSocket)var1).read(var2.array, 0, class25.field123); // L: 2480
				var2.offset = 0; // L: 2481
				class316.method6012(6); // L: 2482
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2485 2486
				field664 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2487
				class316.method6012(13); // L: 2488
			}

			if (loginState == 13) { // L: 2491
				field541 = 0; // L: 2492
				class318.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field664 / 60 + " seconds."); // L: 2493
				if (--field664 <= 0) { // L: 2494
					class316.method6012(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2497 2498
					class398.field4505 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2499
					class316.method6012(15); // L: 2500
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= class398.field4505) { // L: 2503 2504
					boolean var44 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2505
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2506
					var2.offset = 0; // L: 2507
					boolean var43 = false; // L: 2508
					if (var44) { // L: 2509
						var14 = var2.readByteIsaac() << 24; // L: 2510
						var14 |= var2.readByteIsaac() << 16; // L: 2511
						var14 |= var2.readByteIsaac() << 8; // L: 2512
						var14 |= var2.readByteIsaac(); // L: 2513
						class449.clientPreferences.method2471(Login.Login_username, var14); // L: 2514
					}

					if (Login_isUsernameRemembered) { // L: 2516
						class449.clientPreferences.method2465(Login.Login_username); // L: 2517
					} else {
						class449.clientPreferences.method2465((String)null); // L: 2520
					}

					class338.savePreferences(); // L: 2522
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2523
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2524
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2525
					localPlayerIndex <<= 8; // L: 2526
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2527
					field655 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2528
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2529
					var2.offset = 0; // L: 2530
					this.accountHash = var2.readLong(); // L: 2531
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2532
					var2.offset = 0; // L: 2533
					field656 = var2.readLong(); // L: 2534
					if (field708 >= 214) { // L: 2535
						((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2536
						var2.offset = 0; // L: 2537
						var2.readLong(); // L: 2538
					}

					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2540
					var2.offset = 0; // L: 2541
					ServerPacket[] var36 = class176.method3492(); // L: 2542
					int var15 = var2.readSmartByteShortIsaac(); // L: 2543
					if (var15 < 0 || var15 >= var36.length) { // L: 2544
						throw new IOException(var15 + " " + var2.offset);
					}

					packetWriter.serverPacket = var36[var15]; // L: 2545
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2546
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2547
					var2.offset = 0; // L: 2548
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2549

					try {
						Client var16 = class219.client; // L: 2551
						JSObject.getWindow(var16).call("zap", (Object[])null); // L: 2554
					} catch (Throwable var18) { // L: 2557
					}

					class316.method6012(16); // L: 2558
				}

				if (loginState != 16) { // L: 2561
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2664 2665
						var2.offset = 0; // L: 2666
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2667
						var2.offset = 0; // L: 2668
						class342.field3862 = var2.readUnsignedShort(); // L: 2669
						class316.method6012(18); // L: 2670
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= class342.field3862) { // L: 2673 2674
						var2.offset = 0; // L: 2675
						((AbstractSocket)var1).read(var2.array, 0, class342.field3862); // L: 2676
						var2.offset = 0; // L: 2677
						String var40 = var2.readStringCp1252NullTerminated(); // L: 2678
						String var42 = var2.readStringCp1252NullTerminated(); // L: 2679
						String var39 = var2.readStringCp1252NullTerminated(); // L: 2680
						class318.setLoginResponseString(var40, var42, var39); // L: 2681
						class317.method6014(10); // L: 2682
						if (field571.method9339()) { // L: 2683
							PcmPlayer.method838(9); // L: 2684
						}
					}

					if (loginState == 19) { // L: 2688
						if (packetWriter.serverPacketLength == -1) { // L: 2689
							if (((AbstractSocket)var1).available() < 2) { // L: 2690
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2691
							var2.offset = 0; // L: 2692
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2693
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2695
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2696
							var2.offset = 0; // L: 2697
							var13 = packetWriter.serverPacketLength; // L: 2698
							timer.method7682(); // L: 2699
							class105.method2689(); // L: 2700
							Actor.updatePlayer(var2); // L: 2701
							if (var13 != var2.offset) { // L: 2702
								throw new RuntimeException(); // L: 2703
							}
						}
					} else {
						++field541; // L: 2707
						if (field541 > 2000) { // L: 2708
							if (field592 < 1) { // L: 2709
								if (class480.worldPort == class4.currentPort) { // L: 2710
									class4.currentPort = class129.js5Port;
								} else {
									class4.currentPort = class480.worldPort; // L: 2711
								}

								++field592; // L: 2712
								class316.method6012(0); // L: 2713
							} else {
								class387.getLoginError(-3); // L: 2716
							}
						}
					}
				} else {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2562
						var2.offset = 0; // L: 2563
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2564
						timer.method7686(); // L: 2565
						mouseLastLastPressedTimeMillis = -1L; // L: 2568
						class126.mouseRecorder.index = 0; // L: 2569
						class370.hasFocus = true; // L: 2570
						hadFocus = true; // L: 2571
						field769 = -1L; // L: 2572
						GrandExchangeOfferTotalQuantityComparator.method6833(); // L: 2573
						packetWriter.clearBuffer(); // L: 2574
						packetWriter.packetBuffer.offset = 0; // L: 2575
						packetWriter.serverPacket = null; // L: 2576
						packetWriter.field1430 = null; // L: 2577
						packetWriter.field1436 = null; // L: 2578
						packetWriter.field1437 = null; // L: 2579
						packetWriter.serverPacketLength = 0; // L: 2580
						packetWriter.field1435 = 0; // L: 2581
						rebootTimer = 0; // L: 2582
						logoutTimer = 0; // L: 2583
						hintArrowType = 0; // L: 2584
						Frames.method4718(); // L: 2585
						class20.method301(0); // L: 2586
						ChatChannel.method2199(); // L: 2587
						isItemSelected = 0; // L: 2588
						isSpellSelected = false; // L: 2589
						soundEffectCount = 0; // L: 2590
						camAngleY = 0; // L: 2591
						oculusOrbState = 0; // L: 2592
						class390.field4441 = null; // L: 2593
						minimapState = 0; // L: 2594
						field772 = -1; // L: 2595
						destinationX = 0; // L: 2596
						destinationY = 0; // L: 2597
						playerAttackOption = AttackOption.AttackOption_hidden; // L: 2598
						npcAttackOption = AttackOption.AttackOption_hidden; // L: 2599
						npcCount = 0; // L: 2600
						Players.Players_count = 0; // L: 2602

						for (var13 = 0; var13 < 2048; ++var13) { // L: 2603
							Players.field1388[var13] = null; // L: 2604
							Players.field1377[var13] = class217.field2410; // L: 2605
						}

						for (var13 = 0; var13 < 2048; ++var13) { // L: 2608
							players[var13] = null;
						}

						for (var13 = 0; var13 < 65536; ++var13) { // L: 2609
							npcs[var13] = null;
						}

						combatTargetPlayerIndex = -1; // L: 2610
						projectiles.clear(); // L: 2611
						graphicsObjects.clear(); // L: 2612

						for (var13 = 0; var13 < 4; ++var13) { // L: 2613
							for (var14 = 0; var14 < 104; ++var14) { // L: 2614
								for (int var17 = 0; var17 < 104; ++var17) { // L: 2615
									groundItems[var13][var14][var17] = null; // L: 2616
								}
							}
						}

						pendingSpawns = new NodeDeque(); // L: 2620
						class299.friendSystem.clear(); // L: 2621

						for (var13 = 0; var13 < VarpDefinition.field1933; ++var13) { // L: 2622
							VarpDefinition var41 = ApproximateRouteStrategy.VarpDefinition_get(var13); // L: 2623
							if (var41 != null) { // L: 2624
								Varps.Varps_temp[var13] = 0; // L: 2625
								Varps.Varps_main[var13] = 0; // L: 2626
							}
						}

						class25.varcs.clearTransient(); // L: 2629
						followerIndex = -1; // L: 2630
						if (rootInterface != -1) { // L: 2631
							Skeleton.method4523(rootInterface);
						}

						for (InterfaceParent var37 = (InterfaceParent)interfaceParents.first(); var37 != null; var37 = (InterfaceParent)interfaceParents.next()) { // L: 2632
							class92.closeInterface(var37, true); // L: 2633
						}

						rootInterface = -1; // L: 2635
						interfaceParents = new NodeHashTable(8); // L: 2636
						meslayerContinueWidget = null; // L: 2637
						Frames.method4718(); // L: 2638
						playerAppearance.method6080((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1); // L: 2639

						for (var13 = 0; var13 < 8; ++var13) { // L: 2640
							playerMenuActions[var13] = null; // L: 2641
							playerOptionsPriorities[var13] = false; // L: 2642
						}

						LoginPacket.method5710(); // L: 2644
						field539 = true; // L: 2645

						for (var13 = 0; var13 < 100; ++var13) { // L: 2646
							field536[var13] = true;
						}

						Message.method1217(); // L: 2647
						ReflectionCheck.friendsChatManager = null; // L: 2648
						Players.guestClanSettings = null; // L: 2649
						Arrays.fill(currentClanSettings, (Object)null); // L: 2650
						VerticalAlignment.guestClanChannel = null; // L: 2651
						Arrays.fill(currentClanChannels, (Object)null); // L: 2652

						for (var13 = 0; var13 < 8; ++var13) { // L: 2653
							grandExchangeOffers[var13] = new GrandExchangeOffer();
						}

						class392.grandExchangeEvents = null; // L: 2654
						field537 = false; // L: 2655
						Actor.updatePlayer(var2); // L: 2657
						Tiles.field1037 = -1; // L: 2658
						WorldMapID.loadRegions(false, var2); // L: 2659
						packetWriter.serverPacket = null; // L: 2660
					}

				}
			}
		} catch (IOException var26) { // L: 2720
			if (field592 < 1) { // L: 2721
				if (class480.worldPort == class4.currentPort) { // L: 2722
					class4.currentPort = class129.js5Port;
				} else {
					class4.currentPort = class480.worldPort; // L: 2723
				}

				++field592; // L: 2724
				class316.method6012(0); // L: 2725
			} else {
				class387.getLoginError(-2); // L: 2728
			}
		}
	} // L: 2495 2662 2705 2714 2717 2726 2729 2731

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1704146678"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3015
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3016
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3017
			hadNetworkError = false; // L: 3018
			Renderable.method4709(); // L: 3019
		} else {
			if (!isMenuOpen) { // L: 3022
				class349.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1267(packetWriter); ++var1) { // L: 3023 3024
			}

			if (gameState == 30) { // L: 3026
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 3030
					boolean var29;
					if (var2 == null) { // L: 3031
						var29 = false; // L: 3032
					} else {
						var29 = true; // L: 3035
					}

					int var3;
					PacketBufferNode var30;
					if (!var29) { // L: 3037
						PacketBufferNode var14;
						int var15;
						if (timer.field4568) { // L: 3045
							var14 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3119, packetWriter.isaacCipher); // L: 3047
							var14.packetBuffer.writeByte(0); // L: 3048
							var15 = var14.packetBuffer.offset; // L: 3049
							timer.write(var14.packetBuffer); // L: 3050
							var14.packetBuffer.method9055(var14.packetBuffer.offset - var15); // L: 3051
							packetWriter.addNode(var14); // L: 3052
							timer.method7687(); // L: 3053
						}

						int var4;
						int var5;
						synchronized(class126.mouseRecorder.lock) { // L: 3056
							if (!field566) { // L: 3057
								class126.mouseRecorder.index = 0; // L: 3143
							} else if (MouseHandler.MouseHandler_lastButton != 0 || class126.mouseRecorder.index >= 40) { // L: 3058
								var30 = null; // L: 3060
								var3 = 0; // L: 3061
								var4 = 0; // L: 3062
								var5 = 0; // L: 3063
								int var6 = 0; // L: 3064

								int var7;
								for (var7 = 0; var7 < class126.mouseRecorder.index && (var30 == null || var30.packetBuffer.offset - var3 < 246); ++var7) { // L: 3065 3066
									var4 = var7; // L: 3067
									int var8 = class126.mouseRecorder.ys[var7]; // L: 3068
									if (var8 < -1) { // L: 3069
										var8 = -1;
									} else if (var8 > 65534) { // L: 3070
										var8 = 65534;
									}

									int var9 = class126.mouseRecorder.xs[var7]; // L: 3071
									if (var9 < -1) { // L: 3072
										var9 = -1;
									} else if (var9 > 65534) { // L: 3073
										var9 = 65534;
									}

									if (var9 != field542 || var8 != field543) { // L: 3074
										if (var30 == null) { // L: 3077
											var30 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3179, packetWriter.isaacCipher); // L: 3078
											var30.packetBuffer.writeByte(0); // L: 3079
											var3 = var30.packetBuffer.offset; // L: 3080
											PacketBuffer var10000 = var30.packetBuffer; // L: 3081
											var10000.offset += 2;
											var5 = 0; // L: 3082
											var6 = 0; // L: 3083
										}

										int var10;
										int var11;
										int var12;
										if (field669 != -1L) { // L: 3088
											var10 = var9 - field542; // L: 3089
											var11 = var8 - field543; // L: 3090
											var12 = (int)((class126.mouseRecorder.millis[var7] - field669) / 20L); // L: 3091
											var5 = (int)((long)var5 + (class126.mouseRecorder.millis[var7] - field669) % 20L); // L: 3092
										} else {
											var10 = var9; // L: 3095
											var11 = var8; // L: 3096
											var12 = Integer.MAX_VALUE; // L: 3097
										}

										field542 = var9; // L: 3099
										field543 = var8; // L: 3100
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3101
											var10 += 32; // L: 3102
											var11 += 32; // L: 3103
											var30.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3104
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3106
											var10 += 128; // L: 3107
											var11 += 128; // L: 3108
											var30.packetBuffer.writeByte(var12 + 128); // L: 3109
											var30.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3110
										} else if (var12 < 32) { // L: 3112
											var30.packetBuffer.writeByte(var12 + 192); // L: 3113
											if (var9 != -1 && var8 != -1) { // L: 3114
												var30.packetBuffer.writeInt(var9 | var8 << 16); // L: 3115
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var30.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3118
											if (var9 != -1 && var8 != -1) { // L: 3119
												var30.packetBuffer.writeInt(var9 | var8 << 16); // L: 3120
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6; // L: 3122
										field669 = class126.mouseRecorder.millis[var7]; // L: 3123
									}
								}

								if (var30 != null) { // L: 3125
									var30.packetBuffer.method9055(var30.packetBuffer.offset - var3); // L: 3126
									var7 = var30.packetBuffer.offset; // L: 3127
									var30.packetBuffer.offset = var3; // L: 3128
									var30.packetBuffer.writeByte(var5 / var6); // L: 3129
									var30.packetBuffer.writeByte(var5 % var6); // L: 3130
									var30.packetBuffer.offset = var7; // L: 3131
									packetWriter.addNode(var30); // L: 3132
								}

								if (var4 >= class126.mouseRecorder.index) { // L: 3134
									class126.mouseRecorder.index = 0;
								} else {
									MouseRecorder var43 = class126.mouseRecorder; // L: 3136
									var43.index -= var4;
									System.arraycopy(class126.mouseRecorder.xs, var4, class126.mouseRecorder.xs, 0, class126.mouseRecorder.index); // L: 3137
									System.arraycopy(class126.mouseRecorder.ys, var4, class126.mouseRecorder.ys, 0, class126.mouseRecorder.index); // L: 3138
									System.arraycopy(class126.mouseRecorder.millis, var4, class126.mouseRecorder.millis, 0, class126.mouseRecorder.index); // L: 3139
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !class183.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3145
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 3146
							if (var16 > 32767L) { // L: 3147
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 3148
							var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3149
							if (var3 < 0) { // L: 3150
								var3 = 0;
							} else if (var3 > class177.canvasHeight) { // L: 3151
								var3 = class177.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3152
							if (var4 < 0) { // L: 3153
								var4 = 0;
							} else if (var4 > class113.canvasWidth) { // L: 3154
								var4 = class113.canvasWidth;
							}

							var5 = (int)var16; // L: 3155
							var18 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3145, packetWriter.isaacCipher); // L: 3156
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 3157
							var18.packetBuffer.writeShort(var4); // L: 3158
							var18.packetBuffer.writeShort(var3); // L: 3159
							packetWriter.addNode(var18); // L: 3160
						}

						if (mouseWheelRotation != 0) { // L: 3162
							var14 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3193, packetWriter.isaacCipher); // L: 3163
							var14.packetBuffer.writeShort(mouseWheelRotation); // L: 3164
							packetWriter.addNode(var14); // L: 3165
						}

						if (field674.field2359 > 0) { // L: 3167
							var14 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3107, packetWriter.isaacCipher); // L: 3168
							var14.packetBuffer.writeShort(0); // L: 3169
							var15 = var14.packetBuffer.offset; // L: 3170
							long var19 = GameEngine.method661(); // L: 3171

							for (var5 = 0; var5 < field674.field2359; ++var5) { // L: 3172
								long var21 = var19 - field769; // L: 3173
								if (var21 > 16777215L) { // L: 3174
									var21 = 16777215L;
								}

								field769 = var19; // L: 3175
								var14.packetBuffer.method9291(field674.field2358[var5]); // L: 3176
								var14.packetBuffer.method9105((int)var21); // L: 3177
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15); // L: 3179
							packetWriter.addNode(var14); // L: 3180
						}

						if (field628 > 0) { // L: 3182
							--field628;
						}

						if (field674.method4120(96) || field674.method4120(97) || field674.method4120(98) || field674.method4120(99)) { // L: 3183
							field629 = true; // L: 3184
						}

						if (field629 && field628 <= 0) { // L: 3186
							field628 = 20; // L: 3187
							field629 = false; // L: 3188
							var14 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3130, packetWriter.isaacCipher); // L: 3190
							var14.packetBuffer.writeShort(camAngleY); // L: 3191
							var14.packetBuffer.method9098(camAngleX); // L: 3192
							packetWriter.addNode(var14); // L: 3193
						}

						if (class370.hasFocus && !hadFocus) { // L: 3195
							hadFocus = true; // L: 3196
							var14 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3159, packetWriter.isaacCipher); // L: 3198
							var14.packetBuffer.writeByte(1); // L: 3199
							packetWriter.addNode(var14); // L: 3200
						}

						if (!class370.hasFocus && hadFocus) { // L: 3202
							hadFocus = false; // L: 3203
							var14 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3159, packetWriter.isaacCipher); // L: 3205
							var14.packetBuffer.writeByte(0); // L: 3206
							packetWriter.addNode(var14); // L: 3207
						}

						if (Canvas.worldMap != null) { // L: 3210
							Canvas.worldMap.method8498();
						}

						if (SpotAnimationDefinition.FriendsChatManager_inFriendsChat) { // L: 3212
							if (ReflectionCheck.friendsChatManager != null) { // L: 3213
								ReflectionCheck.friendsChatManager.sort(); // L: 3214
							}

							for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3217
								Player var31 = players[Players.Players_indices[var1]]; // L: 3218
								var31.method2309(); // L: 3219
							}

							SpotAnimationDefinition.FriendsChatManager_inFriendsChat = false; // L: 3222
						}

						class399.method7574(); // L: 3225
						class164.method3324(); // L: 3226
						if (gameState != 30) { // L: 3227
							return;
						}

						Ignored.method7992(); // L: 3228
						Canvas.method324(); // L: 3229
						++packetWriter.field1435; // L: 3230
						if (packetWriter.field1435 > 750) { // L: 3231
							Renderable.method4709(); // L: 3232
							return; // L: 3233
						}

						var1 = Players.Players_count; // L: 3236
						int[] var32 = Players.Players_indices; // L: 3237

						for (var3 = 0; var3 < var1; ++var3) { // L: 3238
							Player var23 = players[var32[var3]]; // L: 3239
							if (var23 != null) { // L: 3240
								class318.updateActorSequence(var23, 1); // L: 3241
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 3246
							var15 = npcIndices[var1]; // L: 3247
							NPC var24 = npcs[var15]; // L: 3248
							if (var24 != null) { // L: 3249
								class318.updateActorSequence(var24, var24.definition.size); // L: 3250
							}
						}

						WorldMapManager.method5342(); // L: 3254
						++field605; // L: 3255
						if (mouseCrossColor != 0) { // L: 3256
							mouseCrossState = mouseCrossState * 400 + 20; // L: 3257
							if (mouseCrossState * 400 >= 400) { // L: 3258
								mouseCrossColor = 0;
							}
						}

						Widget var35 = class146.mousedOverWidgetIf1; // L: 3260
						Widget var33 = class343.field3868; // L: 3261
						class146.mousedOverWidgetIf1 = null; // L: 3262
						class343.field3868 = null; // L: 3263
						draggedOnWidget = null; // L: 3264
						field762 = false; // L: 3265
						field715 = false; // L: 3266
						field766 = 0; // L: 3267

						while (field674.method4124() && field766 < 128) { // L: 3268
							if (staffModLevel >= 2 && field674.method4120(82) && field674.field2369 == 66) { // L: 3269
								StringBuilder var38 = new StringBuilder(); // L: 3272

								Message var36;
								for (Iterator var25 = Messages.Messages_hashTable.iterator(); var25.hasNext(); var38.append(var36.text).append('\n')) { // L: 3273 3279
									var36 = (Message)var25.next(); // L: 3274
									if (var36.sender != null && !var36.sender.isEmpty()) { // L: 3276
										var38.append(var36.sender).append(':'); // L: 3277
									}
								}

								String var40 = var38.toString(); // L: 3282
								class219.client.method498(var40); // L: 3285
							} else if (oculusOrbState != 1 || field674.field2356 <= 0) { // L: 3288
								field768[field766] = field674.field2369; // L: 3291
								field767[field766] = field674.field2356; // L: 3292
								++field766; // L: 3293
							}
						}

						boolean var34 = staffModLevel >= 2; // L: 3297
						if (var34 && field674.method4120(82) && field674.method4120(81) && mouseWheelRotation != 0) { // L: 3299
							var4 = VarbitComposition.localPlayer.plane - mouseWheelRotation; // L: 3300
							if (var4 < 0) { // L: 3301
								var4 = 0;
							} else if (var4 > 3) { // L: 3302
								var4 = 3;
							}

							if (var4 != VarbitComposition.localPlayer.plane) { // L: 3303
								NPC.method2637(VarbitComposition.localPlayer.pathX[0] + UrlRequester.baseX * 64, VarbitComposition.localPlayer.pathY[0] + class47.baseY * 64, var4, false); // L: 3304
							}

							mouseWheelRotation = 0; // L: 3306
						}

						if (MouseHandler.MouseHandler_lastButton == 1) { // L: 3308
							field765.method4092(); // L: 3309
						}

						if (rootInterface != -1) { // L: 3311
							LoginScreenAnimation.updateRootInterface(rootInterface, 0, 0, class113.canvasWidth, class177.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3312

						while (true) {
							Widget var37;
							ScriptEvent var39;
							Widget var42;
							do {
								var39 = (ScriptEvent)field727.removeLast(); // L: 3314
								if (var39 == null) { // L: 3315
									while (true) {
										do {
											var39 = (ScriptEvent)field743.removeLast(); // L: 3326
											if (var39 == null) { // L: 3327
												while (true) {
													do {
														var39 = (ScriptEvent)scriptEvents.removeLast(); // L: 3338
														if (var39 == null) { // L: 3339
															while (true) {
																class211 var41 = (class211)field780.removeLast(); // L: 3350
																if (var41 == null) { // L: 3351
																	this.menu(); // L: 3354
																	WorldMapRectangle.method5478(); // L: 3355
																	if (clickedWidget != null) { // L: 3356
																		this.method1273();
																	}

																	if (Scene.shouldSendWalk()) { // L: 3357
																		var4 = Scene.Scene_selectedX; // L: 3358
																		var5 = Scene.Scene_selectedY; // L: 3359
																		var18 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3113, packetWriter.isaacCipher); // L: 3361
																		var18.packetBuffer.writeByte(5); // L: 3362
																		var18.packetBuffer.method9098(UrlRequester.baseX * 64 + var4); // L: 3363
																		var18.packetBuffer.method9213(class47.baseY * 64 + var5); // L: 3364
																		var18.packetBuffer.method9110(field674.method4120(82) ? (field674.method4120(81) ? 2 : 1) : 0); // L: 3365
																		packetWriter.addNode(var18); // L: 3366
																		Scene.method4666(); // L: 3367
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3368
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3369
																		mouseCrossColor = 1; // L: 3370
																		mouseCrossState = 0; // L: 3371
																		destinationX = var4; // L: 3372
																		destinationY = var5; // L: 3373
																	}

																	if (var35 != class146.mousedOverWidgetIf1) { // L: 3375
																		if (var35 != null) { // L: 3376
																			class218.invalidateWidget(var35);
																		}

																		if (class146.mousedOverWidgetIf1 != null) { // L: 3377
																			class218.invalidateWidget(class146.mousedOverWidgetIf1);
																		}
																	}

																	if (var33 != class343.field3868 && field689 == field690) { // L: 3379
																		if (var33 != null) { // L: 3380
																			class218.invalidateWidget(var33);
																		}

																		if (class343.field3868 != null) { // L: 3381
																			class218.invalidateWidget(class343.field3868);
																		}
																	}

																	if (class343.field3868 != null) { // L: 3383
																		if (field689 < field690) { // L: 3384
																			++field689; // L: 3385
																			if (field689 == field690) { // L: 3386
																				class218.invalidateWidget(class343.field3868);
																			}
																		}
																	} else if (field689 > 0) { // L: 3389
																		--field689;
																	}

																	class415.load(); // L: 3390
																	if (field794) { // L: 3391
																		class126.method2942(FontName.field4962, class25.field124, class31.field173); // L: 3392
																		class416.method7711(UserComparator4.field1459, VertexNormal.field2800); // L: 3393
																		if (NPCComposition.cameraX == FontName.field4962 && class133.cameraY == class25.field124 && class139.cameraZ == class31.field173 && class129.cameraPitch == UserComparator4.field1459 && UserComparator10.cameraYaw == VertexNormal.field2800) { // L: 3394
																			field794 = false; // L: 3395
																			isCameraLocked = false; // L: 3396
																			field788 = false; // L: 3397
																			field789 = false; // L: 3398
																			PendingSpawn.field1182 = 0; // L: 3399
																			VarbitComposition.field2127 = 0; // L: 3400
																			MusicPatchNode2.field3397 = 0; // L: 3401
																			class33.field188 = 0; // L: 3402
																			WorldMapElement.field1963 = 0; // L: 3403
																			MouseHandler.field252 = 0; // L: 3404
																			class344.field3874 = 0; // L: 3405
																			Players.field1374 = 0; // L: 3406
																			class33.field180 = 0; // L: 3407
																			VarpDefinition.field1937 = 0; // L: 3408
																			field791 = null; // L: 3409
																			field608 = null; // L: 3410
																			field582 = null; // L: 3411
																		}
																	} else if (isCameraLocked) { // L: 3414
																		class140.method3093();
																	}

																	for (var4 = 0; var4 < 5; ++var4) { // L: 3415
																		int var10002 = field744[var4]++;
																	}

																	class25.varcs.tryWrite(); // L: 3416
																	var4 = MusicPatchPcmStream.method5994(); // L: 3417
																	var5 = GameEngine.field228.method345(); // L: 3420
																	PacketBufferNode var26;
																	if (var4 > 15000 && var5 > 15000) { // L: 3423
																		logoutTimer = 250; // L: 3424
																		class20.method301(14500); // L: 3425
																		var26 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3131, packetWriter.isaacCipher); // L: 3427
																		packetWriter.addNode(var26); // L: 3428
																	}

																	class299.friendSystem.processFriendUpdates(); // L: 3430
																	FileSystem.method3491(); // L: 3431
																	++packetWriter.pendingWrites; // L: 3432
																	if (packetWriter.pendingWrites > 50) { // L: 3433
																		var26 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3147, packetWriter.isaacCipher); // L: 3435
																		packetWriter.addNode(var26); // L: 3436
																	}

																	try {
																		packetWriter.flush(); // L: 3439
																	} catch (IOException var27) { // L: 3441
																		Renderable.method4709(); // L: 3442
																	}

																	return; // L: 3444
																}

																ClanChannel.method3321(var41); // L: 3352
															}
														}

														var42 = var39.widget; // L: 3340
														if (var42.childIndex < 0) { // L: 3341
															break;
														}

														var37 = class92.getWidget(var42.parentId); // L: 3342
													} while(var37 == null || var37.children == null || var42.childIndex >= var37.children.length || var42 != var37.children[var42.childIndex]); // L: 3343

													WorldMapSection1.runScriptEvent(var39); // L: 3347
												}
											}

											var42 = var39.widget; // L: 3328
											if (var42.childIndex < 0) { // L: 3329
												break;
											}

											var37 = class92.getWidget(var42.parentId); // L: 3330
										} while(var37 == null || var37.children == null || var42.childIndex >= var37.children.length || var42 != var37.children[var42.childIndex]); // L: 3331

										WorldMapSection1.runScriptEvent(var39); // L: 3335
									}
								}

								var42 = var39.widget; // L: 3316
								if (var42.childIndex < 0) { // L: 3317
									break;
								}

								var37 = class92.getWidget(var42.parentId); // L: 3318
							} while(var37 == null || var37.children == null || var42.childIndex >= var37.children.length || var42 != var37.children[var42.childIndex]); // L: 3319

							WorldMapSection1.runScriptEvent(var39); // L: 3323
						}
					}

					var30 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3111, packetWriter.isaacCipher); // L: 3038
					var30.packetBuffer.writeByte(0); // L: 3039
					var3 = var30.packetBuffer.offset; // L: 3040
					SceneTilePaint.performReflectionCheck(var30.packetBuffer); // L: 3041
					var30.packetBuffer.method9055(var30.packetBuffer.offset - var3); // L: 3042
					packetWriter.addNode(var30); // L: 3043
				}
			}
		}
	} // L: 3020

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-9429"
	)
	public void vmethod5967(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) { // L: 3648
			if (var1 > -1 && class449.clientPreferences.method2451() > 0 && !playingJingle) { // L: 3649
				PacketBufferNode var3 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3200, packetWriter.isaacCipher); // L: 3650
				var3.packetBuffer.writeInt(var1); // L: 3651
				packetWriter.addNode(var3); // L: 3652
			}

		}
	} // L: 3654

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "347895574"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class113.canvasWidth; // L: 4480
		int var2 = class177.canvasHeight; // L: 4481
		if (super.contentWidth < var1) { // L: 4482
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4483
		}

		if (class449.clientPreferences != null) { // L: 4484
			try {
				class26.method381(class219.client, "resize", new Object[]{class218.getWindowedMode()}); // L: 4486
			} catch (Throwable var4) { // L: 4488
			}
		}

	} // L: 4490

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) { // L: 4493
			class316.method6011(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4494
			if (field536[var1]) { // L: 4495
				field749[var1] = true;
			}

			field750[var1] = field536[var1]; // L: 4496
			field536[var1] = false; // L: 4497
		}

		field747 = cycle; // L: 4499
		viewportX = -1; // L: 4500
		viewportY = -1; // L: 4501
		if (rootInterface != -1) { // L: 4502
			rootWidgetCount = 0; // L: 4503
			class36.drawWidgets(rootInterface, 0, 0, class113.canvasWidth, class177.canvasHeight, 0, 0, -1); // L: 4504
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4506
		if (showMouseCross) { // L: 4507
			if (mouseCrossColor == 1) { // L: 4508
				class152.field1717[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4509
			}

			if (mouseCrossColor == 2) { // L: 4511
				class152.field1717[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4512
			}
		}

		int var2;
		int var3;
		if (!isMenuOpen) { // L: 4515
			if (viewportX != -1) { // L: 4516
				var1 = viewportX; // L: 4517
				var2 = viewportY; // L: 4518
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) { // L: 4520 4521
					var3 = menuOptionsCount - 1; // L: 4524
					String var13;
					if (isItemSelected == 1 && menuOptionsCount < 2) { // L: 4528
						var13 = "Use" + " " + field692 + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) { // L: 4529
						var13 = field709 + " " + field720 + " " + "->";
					} else {
						var13 = class181.method3532(var3); // L: 4530
					}

					if (menuOptionsCount > 2) { // L: 4531
						var13 = var13 + class217.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					class59.fontBold12.drawRandomAlphaAndSpacing(var13, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000); // L: 4532
				}
			}
		} else {
			var1 = class12.menuX; // L: 4537
			var2 = class419.menuY; // L: 4538
			var3 = class316.menuWidth; // L: 4539
			int var4 = Occluder.menuHeight; // L: 4540
			int var5 = 6116423; // L: 4541
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5); // L: 4542
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0); // L: 4543
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0); // L: 4544
			class59.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1); // L: 4545
			int var6 = MouseHandler.MouseHandler_x; // L: 4546
			int var7 = MouseHandler.MouseHandler_y; // L: 4547

			int var8;
			int var9;
			int var10;
			for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 4548
				var9 = var2 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 4549
				var10 = 16777215; // L: 4550
				if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) { // L: 4551
					var10 = 16776960;
				}

				class59.fontBold12.draw(class181.method3532(var8), var1 + 3, var9, var10, 0); // L: 4552
			}

			var8 = class12.menuX; // L: 4554
			var9 = class419.menuY; // L: 4555
			var10 = class316.menuWidth; // L: 4556
			int var11 = Occluder.menuHeight; // L: 4557

			for (int var12 = 0; var12 < rootWidgetCount; ++var12) { // L: 4559
				if (rootWidgetXs[var12] + rootWidgetWidths[var12] > var8 && rootWidgetXs[var12] < var8 + var10 && rootWidgetYs[var12] + rootWidgetHeights[var12] > var9 && rootWidgetYs[var12] < var9 + var11) { // L: 4560
					field749[var12] = true;
				}
			}
		}

		if (field755 == 3) { // L: 4564
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4565
				if (field750[var1]) { // L: 4566
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4567
				} else if (field749[var1]) { // L: 4569
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4570
				}
			}
		}

		class131.method3031(HealthBar.Client_plane, VarbitComposition.localPlayer.x, VarbitComposition.localPlayer.y, field605); // L: 4574
		field605 = 0; // L: 4575
	} // L: 4576

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Ler;II)Z",
		garbageValue = "692591213"
	)
	boolean method1617(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 6310
			ReflectionCheck.friendsChatManager = null; // L: 6311
		} else {
			if (ReflectionCheck.friendsChatManager == null) { // L: 6314
				ReflectionCheck.friendsChatManager = new FriendsChatManager(Language.loginType, class219.client); // L: 6315
			}

			ReflectionCheck.friendsChatManager.method7837(var1.packetBuffer, var2); // L: 6317
		}

		field733 = cycleCntr; // L: 6320
		SpotAnimationDefinition.FriendsChatManager_inFriendsChat = true; // L: 6321
		var1.serverPacket = null; // L: 6323
		return true; // L: 6324
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Ler;I)Z",
		garbageValue = "-1865308830"
	)
	boolean method1266(PacketWriter var1) {
		if (ReflectionCheck.friendsChatManager != null) { // L: 6328
			ReflectionCheck.friendsChatManager.method7838(var1.packetBuffer); // L: 6329
		}

		field733 = cycleCntr; // L: 6332
		SpotAnimationDefinition.FriendsChatManager_inFriendsChat = true; // L: 6333
		var1.serverPacket = null; // L: 6335
		return true; // L: 6336
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Ler;I)Z",
		garbageValue = "-1722622027"
	)
	final boolean method1267(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6341
		PacketBuffer var3 = var1.packetBuffer; // L: 6342
		if (var2 == null) { // L: 6343
			return false;
		} else {
			int var6;
			String var21;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6345
					if (var1.field1432) { // L: 6346
						if (!var2.isAvailable(1)) { // L: 6347
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6348
						var1.field1435 = 0; // L: 6349
						var1.field1432 = false; // L: 6350
					}

					var3.offset = 0; // L: 6352
					if (var3.method9001()) { // L: 6353
						if (!var2.isAvailable(1)) { // L: 6354
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6355
						var1.field1435 = 0; // L: 6356
					}

					var1.field1432 = true; // L: 6358
					ServerPacket[] var4 = class176.method3492(); // L: 6359
					var5 = var3.readSmartByteShortIsaac(); // L: 6360
					if (var5 < 0 || var5 >= var4.length) { // L: 6361
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6362
					var1.serverPacketLength = var1.serverPacket.length; // L: 6363
				}

				if (var1.serverPacketLength == -1) { // L: 6365
					if (!var2.isAvailable(1)) { // L: 6366
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6367
					var1.serverPacketLength = var3.array[0] & 255; // L: 6368
				}

				if (var1.serverPacketLength == -2) { // L: 6370
					if (!var2.isAvailable(2)) { // L: 6371
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6372
					var3.offset = 0; // L: 6373
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6374
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6376
					return false;
				}

				var3.offset = 0; // L: 6377
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6378
				var1.field1435 = 0; // L: 6379
				timer.method7683(); // L: 6380
				var1.field1437 = var1.field1436; // L: 6381
				var1.field1436 = var1.field1430; // L: 6382
				var1.field1430 = var1.serverPacket; // L: 6383
				if (ServerPacket.field3293 == var1.serverPacket) { // L: 6384
					class128.privateChatMode = DevicePcmPlayerProvider.method317(var3.readUnsignedByte()); // L: 6385
					var1.serverPacket = null; // L: 6386
					return true; // L: 6387
				}

				int var7;
				int var8;
				int var9;
				int var10;
				int var13;
				int var15;
				int var56;
				int var59;
				int var68;
				if (ServerPacket.field3316 == var1.serverPacket) { // L: 6389
					var6 = var3.method9226(); // L: 6400
					var68 = var6 >> 16; // L: 6401
					var5 = var6 >> 8 & 255; // L: 6402
					var7 = var68 + (var6 >> 4 & 7); // L: 6403
					var8 = var5 + (var6 & 7); // L: 6404
					var9 = var3.method9093(); // L: 6405
					var10 = var9 >> 2; // L: 6406
					var56 = var9 & 3; // L: 6407
					var59 = field711[var10]; // L: 6408
					var13 = var3.readUnsignedShort(); // L: 6409
					if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) { // L: 6410
						if (var59 == 0) { // L: 6411
							WallObject var67 = class130.scene.method4547(HealthBar.Client_plane, var7, var8); // L: 6412
							if (var67 != null) { // L: 6413
								var15 = InvDefinition.Entity_unpackID(var67.tag); // L: 6414
								if (var10 == 2) { // L: 6415
									var67.renderable1 = new DynamicObject(var15, 2, var56 + 4, HealthBar.Client_plane, var7, var8, var13, false, var67.renderable1); // L: 6416
									var67.renderable2 = new DynamicObject(var15, 2, var56 + 1 & 3, HealthBar.Client_plane, var7, var8, var13, false, var67.renderable2); // L: 6417
								} else {
									var67.renderable1 = new DynamicObject(var15, var10, var56, HealthBar.Client_plane, var7, var8, var13, false, var67.renderable1); // L: 6419
								}
							}
						} else if (var59 == 1) { // L: 6422
							DecorativeObject var66 = class130.scene.method4548(HealthBar.Client_plane, var7, var8); // L: 6423
							if (var66 != null) { // L: 6424
								var15 = InvDefinition.Entity_unpackID(var66.tag); // L: 6425
								if (var10 != 4 && var10 != 5) { // L: 6426
									if (var10 == 6) { // L: 6429
										var66.renderable1 = new DynamicObject(var15, 4, var56 + 4, HealthBar.Client_plane, var7, var8, var13, false, var66.renderable1); // L: 6430
									} else if (var10 == 7) { // L: 6432
										var66.renderable1 = new DynamicObject(var15, 4, (var56 + 2 & 3) + 4, HealthBar.Client_plane, var7, var8, var13, false, var66.renderable1); // L: 6433
									} else if (var10 == 8) { // L: 6435
										var66.renderable1 = new DynamicObject(var15, 4, var56 + 4, HealthBar.Client_plane, var7, var8, var13, false, var66.renderable1); // L: 6436
										var66.renderable2 = new DynamicObject(var15, 4, (var56 + 2 & 3) + 4, HealthBar.Client_plane, var7, var8, var13, false, var66.renderable2); // L: 6437
									}
								} else {
									var66.renderable1 = new DynamicObject(var15, 4, var56, HealthBar.Client_plane, var7, var8, var13, false, var66.renderable1); // L: 6427
								}
							}
						} else if (var59 == 2) { // L: 6441
							GameObject var64 = class130.scene.getGameObject(HealthBar.Client_plane, var7, var8); // L: 6442
							if (var10 == 11) { // L: 6443
								var10 = 10; // L: 6444
							}

							if (var64 != null) { // L: 6446
								var64.renderable = new DynamicObject(InvDefinition.Entity_unpackID(var64.tag), var10, var56, HealthBar.Client_plane, var7, var8, var13, false, var64.renderable); // L: 6447
							}
						} else if (var59 == 3) { // L: 6450
							GroundObject var65 = class130.scene.getGroundObject(HealthBar.Client_plane, var7, var8); // L: 6451
							if (var65 != null) { // L: 6452
								var65.renderable = new DynamicObject(InvDefinition.Entity_unpackID(var65.tag), 22, var56, HealthBar.Client_plane, var7, var8, var13, false, var65.renderable); // L: 6453
							}
						}
					}

					var1.serverPacket = null; // L: 6457
					return true; // L: 6458
				}

				Widget var76;
				if (ServerPacket.field3290 == var1.serverPacket) { // L: 6460
					var68 = var3.readInt(); // L: 6461
					var76 = class92.getWidget(var68); // L: 6462
					var76.modelType = 3; // L: 6463
					var76.modelId = VarbitComposition.localPlayer.appearance.getChatHeadId(); // L: 6464
					class218.invalidateWidget(var76); // L: 6465
					var1.serverPacket = null; // L: 6466
					return true; // L: 6467
				}

				if (ServerPacket.field3352 == var1.serverPacket) { // L: 6469
					field794 = false; // L: 6470
					isCameraLocked = false; // L: 6471
					field788 = false; // L: 6472
					field789 = false; // L: 6473
					PendingSpawn.field1182 = 0; // L: 6474
					VarbitComposition.field2127 = 0; // L: 6475
					MusicPatchNode2.field3397 = 0; // L: 6476
					field790 = false; // L: 6477
					class33.field188 = 0; // L: 6478
					WorldMapElement.field1963 = 0; // L: 6479
					MouseHandler.field252 = 0; // L: 6480
					class344.field3874 = 0; // L: 6481
					Players.field1374 = 0; // L: 6482
					class33.field180 = 0; // L: 6483
					VarpDefinition.field1937 = 0; // L: 6484
					field791 = null; // L: 6485
					field608 = null; // L: 6486
					field582 = null; // L: 6487

					for (var68 = 0; var68 < 5; ++var68) { // L: 6488
						field795[var68] = false; // L: 6489
					}

					var1.serverPacket = null; // L: 6491
					return true; // L: 6492
				}

				if (ServerPacket.field3284 == var1.serverPacket) { // L: 6494
					class139.field1654 = null; // L: 6495
					var1.serverPacket = null; // L: 6496
					return true; // L: 6497
				}

				if (ServerPacket.field3317 == var1.serverPacket) { // L: 6499
					var68 = var3.readInt(); // L: 6500
					var5 = var3.readInt(); // L: 6501
					var6 = WorldMapManager.getGcDuration(); // L: 6502
					PacketBufferNode var79 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3189, packetWriter.isaacCipher); // L: 6504
					var79.packetBuffer.writeByte(GameEngine.fps); // L: 6505
					var79.packetBuffer.writeIntME(var68); // L: 6506
					var79.packetBuffer.method9112(var5); // L: 6507
					var79.packetBuffer.method9088(var6); // L: 6508
					packetWriter.addNode(var79); // L: 6509
					var1.serverPacket = null; // L: 6510
					return true; // L: 6511
				}

				if (ServerPacket.field3253 == var1.serverPacket) { // L: 6513
					class113.method2843(); // L: 6514
					weight = var3.readShort(); // L: 6515
					field578 = cycleCntr; // L: 6516
					var1.serverPacket = null; // L: 6517
					return true; // L: 6518
				}

				if (ServerPacket.field3303 == var1.serverPacket) { // L: 6520
					World.method1806(class295.field3208); // L: 6521
					var1.serverPacket = null; // L: 6522
					return true; // L: 6523
				}

				if (ServerPacket.field3239 == var1.serverPacket) { // L: 6525
					var68 = var3.method9100(); // L: 6526
					class25.method376(var68); // L: 6527
					field725[++field726 - 1 & 31] = var68 & 32767; // L: 6528
					var1.serverPacket = null; // L: 6529
					return true; // L: 6530
				}

				if (ServerPacket.field3345 == var1.serverPacket) { // L: 6532
					World.method1806(class295.field3212); // L: 6533
					var1.serverPacket = null; // L: 6534
					return true; // L: 6535
				}

				boolean var11;
				byte var20;
				long var23;
				long var25;
				long var27;
				String var30;
				int var85;
				if (ServerPacket.field3333 == var1.serverPacket) { // L: 6537
					var20 = var3.readByte(); // L: 6538
					var23 = (long)var3.readUnsignedShort(); // L: 6539
					var25 = (long)var3.readMedium(); // L: 6540
					var27 = (var23 << 32) + var25; // L: 6541
					var11 = false; // L: 6542
					ClanChannel var81 = var20 >= 0 ? currentClanChannels[var20] : VerticalAlignment.guestClanChannel; // L: 6543
					if (var81 == null) { // L: 6544
						var11 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 6546
							if (field672[var13] == var27) { // L: 6547
								var11 = true; // L: 6548
								break; // L: 6549
							}
						}
					}

					if (!var11) { // L: 6553
						field672[field534] = var27; // L: 6554
						field534 = (field534 + 1) % 100; // L: 6555
						var30 = DirectByteArrayCopier.method6579(var3); // L: 6556
						var85 = var20 >= 0 ? 43 : 46; // L: 6557
						class416.addChatMessage(var85, "", var30, var81.name); // L: 6558
					}

					var1.serverPacket = null; // L: 6560
					return true; // L: 6561
				}

				if (ServerPacket.field3263 == var1.serverPacket) { // L: 6563
					UserComparator8.updatePlayers(var3, var1.serverPacketLength); // L: 6564
					class383.method7144(); // L: 6565
					var1.serverPacket = null; // L: 6566
					return true; // L: 6567
				}

				if (ServerPacket.field3276 == var1.serverPacket) { // L: 6569
					isCameraLocked = true; // L: 6570
					field794 = false; // L: 6571
					field789 = true; // L: 6572
					PendingSpawn.field1182 = var3.readUnsignedByte() * 128; // L: 6573
					VarbitComposition.field2127 = var3.readUnsignedByte() * 16384; // L: 6574
					MusicPatchNode2.field3397 = var3.readUnsignedShort(); // L: 6575
					var68 = var3.readUnsignedShort(); // L: 6576
					var5 = var3.readUnsignedByte(); // L: 6577
					var6 = PendingSpawn.field1182 * 16384 + 64; // L: 6578
					var7 = VarbitComposition.field2127 * 128 + 64; // L: 6579
					var8 = class18.getTileHeight(var6, var7, HealthBar.Client_plane) - MusicPatchNode2.field3397; // L: 6580
					var9 = var6 - NPCComposition.cameraX; // L: 6581
					var10 = var8 - class133.cameraY; // L: 6582
					var56 = var7 - class139.cameraZ; // L: 6583
					double var84 = Math.sqrt((double)(var56 * var56 + var9 * var9)); // L: 6584
					var85 = UserComparator8.method2875((int)(Math.atan2((double)var10, var84) * 325.9490051269531D) & 2047); // L: 6585
					var15 = class7.method53((int)(Math.atan2((double)var9, (double)var56) * -325.9490051269531D) & 2047); // L: 6586
					field608 = new class478(class129.cameraPitch, var85, var68, var5); // L: 6587
					field582 = new class478(UserComparator10.cameraYaw, var15, var68, var5); // L: 6588
					var1.serverPacket = null; // L: 6589
					return true; // L: 6590
				}

				long var32;
				InterfaceParent var74;
				if (ServerPacket.field3325 == var1.serverPacket) { // L: 6592
					var68 = var3.offset + var1.serverPacketLength; // L: 6593
					var5 = var3.readUnsignedShort(); // L: 6594
					if (var5 == 65535) { // L: 6595
						var5 = -1;
					}

					var6 = var3.readUnsignedShort(); // L: 6596
					if (var5 != rootInterface) { // L: 6597
						rootInterface = var5; // L: 6598
						this.resizeRoot(false); // L: 6599
						class19.Widget_resetModelFrames(rootInterface); // L: 6600
						class217.runWidgetOnLoadListener(rootInterface); // L: 6601

						for (var7 = 0; var7 < 100; ++var7) { // L: 6602
							field536[var7] = true;
						}
					}

					InterfaceParent var88;
					for (; var6-- > 0; var88.field1081 = true) { // L: 6604 6614
						var7 = var3.readInt(); // L: 6605
						var8 = var3.readUnsignedShort(); // L: 6606
						var9 = var3.readUnsignedByte(); // L: 6607
						var88 = (InterfaceParent)interfaceParents.get((long)var7); // L: 6608
						if (var88 != null && var8 != var88.group) { // L: 6609
							class92.closeInterface(var88, true); // L: 6610
							var88 = null; // L: 6611
						}

						if (var88 == null) { // L: 6613
							var88 = class339.method6591(var7, var8, var9);
						}
					}

					for (var74 = (InterfaceParent)interfaceParents.first(); var74 != null; var74 = (InterfaceParent)interfaceParents.next()) { // L: 6616
						if (var74.field1081) { // L: 6617
							var74.field1081 = false;
						} else {
							class92.closeInterface(var74, true); // L: 6619
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6622

					while (var3.offset < var68) { // L: 6623
						var7 = var3.readInt(); // L: 6624
						var8 = var3.readUnsignedShort(); // L: 6625
						var9 = var3.readUnsignedShort(); // L: 6626
						var10 = var3.readInt(); // L: 6627

						for (var56 = var8; var56 <= var9; ++var56) { // L: 6628
							var32 = ((long)var7 << 32) + (long)var56; // L: 6629
							widgetFlags.put(new IntegerNode(var10), var32); // L: 6630
						}
					}

					var1.serverPacket = null; // L: 6633
					return true; // L: 6634
				}

				Widget var93;
				if (ServerPacket.field3342 == var1.serverPacket) { // L: 6636
					var68 = var3.readInt(); // L: 6637
					var5 = var3.method9188(); // L: 6638
					InterfaceParent var97 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6639
					var74 = (InterfaceParent)interfaceParents.get((long)var68); // L: 6640
					if (var74 != null) { // L: 6641
						class92.closeInterface(var74, var97 == null || var74.group != var97.group);
					}

					if (var97 != null) { // L: 6642
						var97.remove(); // L: 6643
						interfaceParents.put(var97, (long)var68); // L: 6644
					}

					var93 = class92.getWidget(var5); // L: 6646
					if (var93 != null) { // L: 6647
						class218.invalidateWidget(var93);
					}

					var93 = class92.getWidget(var68); // L: 6648
					if (var93 != null) { // L: 6649
						class218.invalidateWidget(var93); // L: 6650
						Login.revalidateWidgetScroll(PacketBufferNode.Widget_interfaceComponents[var93.id >>> 16], var93, true); // L: 6651
					}

					if (rootInterface != -1) { // L: 6653
						class385.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 6654
					return true; // L: 6655
				}

				if (ServerPacket.field3297 == var1.serverPacket) { // L: 6657
					WorldMapSection2.method5103(); // L: 6658
					var20 = var3.readByte(); // L: 6659
					if (var1.serverPacketLength == 1) { // L: 6660
						if (var20 >= 0) { // L: 6661
							currentClanSettings[var20] = null;
						} else {
							Players.guestClanSettings = null; // L: 6662
						}

						var1.serverPacket = null; // L: 6663
						return true; // L: 6664
					}

					if (var20 >= 0) { // L: 6666
						currentClanSettings[var20] = new ClanSettings(var3); // L: 6667
					} else {
						Players.guestClanSettings = new ClanSettings(var3); // L: 6670
					}

					var1.serverPacket = null; // L: 6672
					return true; // L: 6673
				}

				if (ServerPacket.field3310 == var1.serverPacket) { // L: 6675
					var68 = var3.readInt(); // L: 6676
					InterfaceParent var78 = (InterfaceParent)interfaceParents.get((long)var68); // L: 6677
					if (var78 != null) { // L: 6678
						class92.closeInterface(var78, true);
					}

					if (meslayerContinueWidget != null) { // L: 6679
						class218.invalidateWidget(meslayerContinueWidget); // L: 6680
						meslayerContinueWidget = null; // L: 6681
					}

					var1.serverPacket = null; // L: 6683
					return true; // L: 6684
				}

				if (ServerPacket.field3332 == var1.serverPacket) { // L: 6686
					var9 = var3.readUnsignedShort(); // L: 6695
					var6 = var3.method9226(); // L: 6696
					var68 = var6 >> 16; // L: 6697
					var5 = var6 >> 8 & 255; // L: 6698
					var7 = var68 + (var6 >> 4 & 7); // L: 6699
					var8 = var5 + (var6 & 7); // L: 6700
					var10 = var3.method9091(); // L: 6701
					var56 = var3.method9101(); // L: 6702
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 6703
						var7 = var7 * 128 + 64; // L: 6704
						var8 = var8 * 128 + 64; // L: 6705
						GraphicsObject var29 = new GraphicsObject(var9, HealthBar.Client_plane, var7, var8, class18.getTileHeight(var7, var8, HealthBar.Client_plane) - var10, var56, cycle); // L: 6706
						graphicsObjects.addFirst(var29); // L: 6707
					}

					var1.serverPacket = null; // L: 6709
					return true; // L: 6710
				}

				if (ServerPacket.field3329 == var1.serverPacket) { // L: 6712
					field735 = cycleCntr; // L: 6713
					var20 = var3.readByte(); // L: 6714
					if (var1.serverPacketLength == 1) { // L: 6715
						if (var20 >= 0) { // L: 6716
							currentClanChannels[var20] = null;
						} else {
							VerticalAlignment.guestClanChannel = null; // L: 6717
						}

						var1.serverPacket = null; // L: 6718
						return true; // L: 6719
					}

					if (var20 >= 0) { // L: 6721
						currentClanChannels[var20] = new ClanChannel(var3); // L: 6722
					} else {
						VerticalAlignment.guestClanChannel = new ClanChannel(var3); // L: 6725
					}

					var1.serverPacket = null; // L: 6727
					return true; // L: 6728
				}

				if (ServerPacket.field3244 == var1.serverPacket) { // L: 6730
					World.method1806(class295.field3217); // L: 6731
					var1.serverPacket = null; // L: 6732
					return true; // L: 6733
				}

				if (ServerPacket.field3340 == var1.serverPacket) { // L: 6735
					World.method1806(class295.field3218); // L: 6736
					var1.serverPacket = null; // L: 6737
					return true; // L: 6738
				}

				if (ServerPacket.field3348 == var1.serverPacket) { // L: 6740
					var68 = var3.method9100(); // L: 6741
					var5 = var3.method9093(); // L: 6742
					if (var68 == 65535) { // L: 6743
						var68 = -1; // L: 6744
					}

					LoginType.performPlayerAnimation(VarbitComposition.localPlayer, var68, var5); // L: 6746
					var1.serverPacket = null; // L: 6747
					return true; // L: 6748
				}

				if (ServerPacket.field3353 == var1.serverPacket) { // L: 6750
					WorldMapID.loadRegions(true, var1.packetBuffer); // L: 6751
					var1.serverPacket = null; // L: 6752
					return true; // L: 6753
				}

				if (ServerPacket.field3273 == var1.serverPacket) { // L: 6755
					if (rootInterface != -1) { // L: 6756
						class385.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6757
					return true; // L: 6758
				}

				Widget var71;
				if (ServerPacket.field3265 == var1.serverPacket) { // L: 6760
					var68 = var3.method9115(); // L: 6761
					var5 = var3.method9102(); // L: 6762
					var6 = var3.method9101(); // L: 6763
					var71 = class92.getWidget(var68); // L: 6764
					var71.field3741 = var6 + (var5 << 16); // L: 6765
					var1.serverPacket = null; // L: 6766
					return true; // L: 6767
				}

				if (ServerPacket.field3322 == var1.serverPacket) { // L: 6769
					minimapState = var3.readUnsignedByte(); // L: 6770
					var1.serverPacket = null; // L: 6771
					return true; // L: 6772
				}

				int var16;
				String var43;
				if (ServerPacket.field3334 == var1.serverPacket) { // L: 6774
					var20 = var3.readByte(); // L: 6775
					var21 = var3.readStringCp1252NullTerminated(); // L: 6776
					long var37 = (long)var3.readUnsignedShort(); // L: 6777
					long var39 = (long)var3.readMedium(); // L: 6778
					PlayerType var87 = (PlayerType)class25.findEnumerated(MidiPcmStream.PlayerType_values(), var3.readUnsignedByte()); // L: 6779
					long var41 = (var37 << 32) + var39; // L: 6780
					boolean var63 = false; // L: 6781
					ClanChannel var14 = null; // L: 6782
					var14 = var20 >= 0 ? currentClanChannels[var20] : VerticalAlignment.guestClanChannel; // L: 6784
					if (var14 == null) { // L: 6785
						var63 = true; // L: 6786
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var87.isUser && class299.friendSystem.isIgnored(new Username(var21, Language.loginType))) { // L: 6795 6796
									var63 = true;
								}
								break;
							}

							if (field672[var15] == var41) { // L: 6790
								var63 = true; // L: 6791
								break; // L: 6792
							}

							++var15; // L: 6789
						}
					}

					if (!var63) { // L: 6799
						field672[field534] = var41; // L: 6800
						field534 = (field534 + 1) % 100; // L: 6801
						var43 = AbstractFont.escapeBrackets(DirectByteArrayCopier.method6579(var3)); // L: 6802
						var16 = var20 >= 0 ? 41 : 44; // L: 6803
						if (var87.modIcon != -1) { // L: 6804
							class416.addChatMessage(var16, Tile.method4373(var87.modIcon) + var21, var43, var14.name);
						} else {
							class416.addChatMessage(var16, var21, var43, var14.name); // L: 6805
						}
					}

					var1.serverPacket = null; // L: 6807
					return true; // L: 6808
				}

				if (ServerPacket.field3315 == var1.serverPacket) { // L: 6810
					var3.offset += 28; // L: 6811
					if (var3.checkCrc()) { // L: 6812
						class27.method423(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 6813
					return true; // L: 6814
				}

				String var51;
				if (ServerPacket.field3328 == var1.serverPacket) { // L: 6816
					var51 = var3.readStringCp1252NullTerminated(); // L: 6817
					var5 = var3.method9091(); // L: 6818
					var6 = var3.method9093(); // L: 6819
					if (var6 >= 1 && var6 <= 8) { // L: 6820
						if (var51.equalsIgnoreCase("null")) { // L: 6821
							var51 = null;
						}

						playerMenuActions[var6 - 1] = var51; // L: 6822
						playerOptionsPriorities[var6 - 1] = var5 == 0; // L: 6823
					}

					var1.serverPacket = null; // L: 6825
					return true; // L: 6826
				}

				if (ServerPacket.field3281 == var1.serverPacket) { // L: 6828
					var68 = var3.readUnsignedShort(); // L: 6829
					if (var68 == 65535) { // L: 6830
						var68 = -1;
					}

					WorldMapSection1.playSong(var68); // L: 6831
					var1.serverPacket = null; // L: 6832
					return true; // L: 6833
				}

				if (ServerPacket.field3313 == var1.serverPacket) { // L: 6835
					var68 = var3.method9102(); // L: 6836
					if (var68 == 65535) { // L: 6837
						var68 = -1;
					}

					var5 = var3.method9216(); // L: 6838
					Login.method2136(var68, var5); // L: 6839
					var1.serverPacket = null; // L: 6840
					return true; // L: 6841
				}

				if (ServerPacket.field3236 == var1.serverPacket) { // L: 6843
					ArchiveDisk.logOut(); // L: 6844
					var1.serverPacket = null; // L: 6845
					return false; // L: 6846
				}

				if (ServerPacket.field3327 == var1.serverPacket) { // L: 6848
					var68 = var3.method9114(); // L: 6849
					var5 = var3.method9093(); // L: 6850
					var6 = var3.method9102(); // L: 6851
					var74 = (InterfaceParent)interfaceParents.get((long)var68); // L: 6852
					if (var74 != null) { // L: 6853
						class92.closeInterface(var74, var6 != var74.group);
					}

					class339.method6591(var68, var6, var5); // L: 6854
					var1.serverPacket = null; // L: 6855
					return true; // L: 6856
				}

				boolean var80;
				Widget var89;
				if (ServerPacket.field3305 == var1.serverPacket) { // L: 6858
					var80 = var3.method9256() == 1; // L: 6859
					var5 = var3.readInt(); // L: 6860
					var89 = class92.getWidget(var5); // L: 6861
					if (var80 != var89.isHidden) { // L: 6862
						var89.isHidden = var80; // L: 6863
						class218.invalidateWidget(var89); // L: 6864
					}

					var1.serverPacket = null; // L: 6866
					return true; // L: 6867
				}

				if (ServerPacket.field3237 == var1.serverPacket) { // L: 6869
					var68 = var3.method9102(); // L: 6870
					var5 = var3.readUnsignedShort(); // L: 6871
					var6 = var3.method9115(); // L: 6872
					var7 = var3.readUnsignedShort(); // L: 6873
					var93 = class92.getWidget(var6); // L: 6874
					if (var7 != var93.modelAngleX || var68 != var93.modelAngleY || var5 != var93.modelZoom) { // L: 6875
						var93.modelAngleX = var7; // L: 6876
						var93.modelAngleY = var68; // L: 6877
						var93.modelZoom = var5; // L: 6878
						class218.invalidateWidget(var93); // L: 6879
					}

					var1.serverPacket = null; // L: 6881
					return true; // L: 6882
				}

				if (ServerPacket.field3238 == var1.serverPacket) { // L: 6884
					var68 = var3.method9101(); // L: 6885
					var5 = var3.method9114(); // L: 6886
					var89 = class92.getWidget(var5); // L: 6887
					if (var89.modelType != 1 || var68 != var89.modelId) { // L: 6888
						var89.modelType = 1; // L: 6889
						var89.modelId = var68; // L: 6890
						class218.invalidateWidget(var89); // L: 6891
					}

					var1.serverPacket = null; // L: 6893
					return true; // L: 6894
				}

				if (ServerPacket.field3233 == var1.serverPacket) { // L: 6896
					World.method1806(class295.field3214); // L: 6897
					var1.serverPacket = null; // L: 6898
					return true; // L: 6899
				}

				if (ServerPacket.field3278 == var1.serverPacket) { // L: 6901
					var8 = var3.method9101(); // L: 6907
					var6 = var3.method9100(); // L: 6908
					var7 = var3.method9100(); // L: 6909
					var68 = var3.method9102(); // L: 6910
					var5 = var3.method9102(); // L: 6911
					if (var68 == 65535) { // L: 6912
						var68 = -1; // L: 6913
					}

					ArrayList var98 = new ArrayList(); // L: 6915
					var98.add(var68); // L: 6916
					class157.method3261(var98, var5, var6, var7, var8); // L: 6917
					var1.serverPacket = null; // L: 6918
					return true; // L: 6919
				}

				if (ServerPacket.field3254 == var1.serverPacket) { // L: 6921
					World.method1806(class295.field3207); // L: 6922
					var1.serverPacket = null; // L: 6923
					return true; // L: 6924
				}

				if (ServerPacket.field3252 == var1.serverPacket) { // L: 6926
					class299.friendSystem.method1856(); // L: 6927
					field732 = cycleCntr; // L: 6928
					var1.serverPacket = null; // L: 6929
					return true; // L: 6930
				}

				String var94;
				if (ServerPacket.field3283 == var1.serverPacket) { // L: 6932
					byte[] var54 = new byte[var1.serverPacketLength]; // L: 6933
					var3.method9002(var54, 0, var54.length); // L: 6934
					Buffer var77 = new Buffer(var54); // L: 6935
					var94 = var77.readStringCp1252NullTerminated(); // L: 6936
					class30.openURL(var94, true, false); // L: 6937
					var1.serverPacket = null; // L: 6938
					return true; // L: 6939
				}

				if (ServerPacket.field3312 == var1.serverPacket) { // L: 6941
					World var53 = new World(); // L: 6942
					var53.host = var3.readStringCp1252NullTerminated(); // L: 6943
					var53.id = var3.readUnsignedShort(); // L: 6944
					var5 = var3.readInt(); // L: 6945
					var53.properties = var5; // L: 6946
					if (var53.isDeadman()) { // L: 6947
						var53.field847 = "beta"; // L: 6948
					}

					class317.method6014(45); // L: 6950
					var2.close(); // L: 6951
					var2 = null; // L: 6952
					ModeWhere.changeWorld(var53); // L: 6953
					var1.serverPacket = null; // L: 6954
					return false; // L: 6955
				}

				if (ServerPacket.field3298 == var1.serverPacket) { // L: 6957
					rebootTimer = var3.method9101() * 30; // L: 6958
					field578 = cycleCntr; // L: 6959
					var1.serverPacket = null; // L: 6960
					return true; // L: 6961
				}

				if (ServerPacket.field3240 == var1.serverPacket) { // L: 6963
					var68 = var3.readUnsignedShort(); // L: 6964
					if (var68 == 65535) { // L: 6965
						var68 = -1;
					}

					rootInterface = var68; // L: 6966
					this.resizeRoot(false); // L: 6967
					class19.Widget_resetModelFrames(var68); // L: 6968
					class217.runWidgetOnLoadListener(rootInterface); // L: 6969

					for (var5 = 0; var5 < 100; ++var5) { // L: 6970
						field536[var5] = true;
					}

					var1.serverPacket = null; // L: 6971
					return true; // L: 6972
				}

				if (ServerPacket.field3339 == var1.serverPacket) { // L: 6974
					isCameraLocked = true; // L: 6975
					field794 = false; // L: 6976
					field788 = true; // L: 6977
					Players.field1374 = var3.readUnsignedByte() * 16384; // L: 6978
					class33.field180 = var3.readUnsignedByte() * 16384; // L: 6979
					var68 = var3.readUnsignedShort(); // L: 6980
					var5 = var3.readUnsignedShort(); // L: 6981
					field790 = var3.readBoolean(); // L: 6982
					var6 = var3.readUnsignedByte(); // L: 6983
					var7 = Players.field1374 * 128 + 64; // L: 6984
					var8 = class33.field180 * 128 + 64; // L: 6985
					boolean var62 = false; // L: 6986
					boolean var61 = false; // L: 6987
					if (field790) { // L: 6988
						var9 = class133.cameraY; // L: 6989
						var10 = class18.getTileHeight(var7, var8, HealthBar.Client_plane) - var68; // L: 6990
					} else {
						var9 = class18.getTileHeight(NPCComposition.cameraX, class139.cameraZ, HealthBar.Client_plane) - class133.cameraY; // L: 6993
						var10 = var68; // L: 6994
					}

					field791 = new class477(NPCComposition.cameraX, class139.cameraZ, var9, var7, var8, var10, var5, var6); // L: 6996
					var1.serverPacket = null; // L: 6997
					return true; // L: 6998
				}

				if (ServerPacket.field3299 == var1.serverPacket) { // L: 7000
					WorldMapID.loadRegions(false, var1.packetBuffer); // L: 7001
					var1.serverPacket = null; // L: 7002
					return true; // L: 7003
				}

				if (ServerPacket.field3338 == var1.serverPacket) { // L: 7005
					var68 = var3.method9188(); // L: 7006
					var76 = class92.getWidget(var68); // L: 7007

					for (var6 = 0; var6 < var76.itemIds.length; ++var6) { // L: 7008
						var76.itemIds[var6] = -1; // L: 7009
						var76.itemIds[var6] = 0; // L: 7010
					}

					class218.invalidateWidget(var76); // L: 7012
					var1.serverPacket = null; // L: 7013
					return true; // L: 7014
				}

				if (ServerPacket.field3306 == var1.serverPacket) { // L: 7016
					var68 = var3.method9100(); // L: 7017
					var5 = var3.method9188(); // L: 7018
					var89 = class92.getWidget(var5); // L: 7019
					if (var89 != null && var89.type == 0) { // L: 7020
						if (var68 > var89.scrollHeight - var89.height) { // L: 7021
							var68 = var89.scrollHeight - var89.height;
						}

						if (var68 < 0) { // L: 7022
							var68 = 0;
						}

						if (var68 != var89.scrollY) { // L: 7023
							var89.scrollY = var68; // L: 7024
							class218.invalidateWidget(var89); // L: 7025
						}
					}

					var1.serverPacket = null; // L: 7028
					return true; // L: 7029
				}

				if (ServerPacket.field3326 == var1.serverPacket) { // L: 7031
					tradeChatMode = var3.readUnsignedByte(); // L: 7032
					publicChatMode = var3.method9091(); // L: 7033
					var1.serverPacket = null; // L: 7034
					return true; // L: 7035
				}

				if (ServerPacket.field3320 == var1.serverPacket) { // L: 7037
					isCameraLocked = true; // L: 7038
					field794 = false; // L: 7039
					field789 = false; // L: 7040
					PendingSpawn.field1182 = var3.readUnsignedByte() * 128; // L: 7041
					VarbitComposition.field2127 = var3.readUnsignedByte() * 16384; // L: 7042
					MusicPatchNode2.field3397 = var3.readUnsignedShort(); // L: 7043
					class33.field188 = var3.readUnsignedByte(); // L: 7044
					WorldMapElement.field1963 = var3.readUnsignedByte(); // L: 7045
					if (WorldMapElement.field1963 >= 100) { // L: 7046
						var68 = PendingSpawn.field1182 * 16384 + 64; // L: 7047
						var5 = VarbitComposition.field2127 * 128 + 64; // L: 7048
						var6 = class18.getTileHeight(var68, var5, HealthBar.Client_plane) - MusicPatchNode2.field3397; // L: 7049
						var7 = var68 - NPCComposition.cameraX; // L: 7050
						var8 = var6 - class133.cameraY; // L: 7051
						var9 = var5 - class139.cameraZ; // L: 7052
						var10 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7)); // L: 7053
						class129.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047; // L: 7054
						UserComparator10.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047; // L: 7055
						if (class129.cameraPitch < 128) { // L: 7056
							class129.cameraPitch = 128;
						}

						if (class129.cameraPitch > 383) { // L: 7057
							class129.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 7059
					return true; // L: 7060
				}

				if (ServerPacket.field3282 == var1.serverPacket) { // L: 7062
					return this.method1617(var1, 1); // L: 7063
				}

				if (ServerPacket.field3291 == var1.serverPacket) { // L: 7065
					hintArrowType = var3.readUnsignedByte(); // L: 7066
					if (hintArrowType == 1) { // L: 7067
						field548 = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 7068
						if (hintArrowType == 2) { // L: 7069
							field713 = 4096; // L: 7070
							field746 = 4096; // L: 7071
						}

						if (hintArrowType == 3) { // L: 7073
							field713 = 0; // L: 7074
							field746 = 4096; // L: 7075
						}

						if (hintArrowType == 4) { // L: 7077
							field713 = 8192; // L: 7078
							field746 = 4096; // L: 7079
						}

						if (hintArrowType == 5) { // L: 7081
							field713 = 4096; // L: 7082
							field746 = 0; // L: 7083
						}

						if (hintArrowType == 6) { // L: 7085
							field713 = 4096; // L: 7086
							field746 = 8192; // L: 7087
						}

						hintArrowType = 2; // L: 7089
						field550 = var3.readUnsignedShort(); // L: 7090
						field693 = var3.readUnsignedShort(); // L: 7091
						field557 = var3.readUnsignedByte() * 2; // L: 7092
					}

					if (hintArrowType == 10) { // L: 7094
						field567 = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 7095
					return true; // L: 7096
				}

				if (ServerPacket.field3249 == var1.serverPacket) { // L: 7098
					WorldMapSection2.method5103(); // L: 7099
					var20 = var3.readByte(); // L: 7100
					class146 var75 = new class146(var3); // L: 7101
					ClanSettings var96;
					if (var20 >= 0) { // L: 7103
						var96 = currentClanSettings[var20];
					} else {
						var96 = Players.guestClanSettings; // L: 7104
					}

					if (var96 == null) { // L: 7105
						this.method1276(var20); // L: 7106
						var1.serverPacket = null; // L: 7107
						return true; // L: 7108
					}

					if (var75.field1682 > var96.field1745) { // L: 7110
						this.method1276(var20); // L: 7111
						var1.serverPacket = null; // L: 7112
						return true; // L: 7113
					}

					if (var75.field1682 < var96.field1745) { // L: 7115
						var1.serverPacket = null; // L: 7116
						return true; // L: 7117
					}

					var75.method3124(var96); // L: 7119
					var1.serverPacket = null; // L: 7120
					return true; // L: 7121
				}

				if (ServerPacket.field3344 == var1.serverPacket) { // L: 7123
					World.method1806(class295.field3213); // L: 7124
					var1.serverPacket = null; // L: 7125
					return true; // L: 7126
				}

				if (ServerPacket.field3268 == var1.serverPacket) { // L: 7128
					var68 = var3.method9063(); // L: 7129
					var5 = var3.readInt(); // L: 7130
					var6 = var3.readShort(); // L: 7131
					var71 = class92.getWidget(var5); // L: 7132
					if (var6 != var71.rawX || var68 != var71.rawY || var71.xAlignment != 0 || var71.yAlignment != 0) { // L: 7133
						var71.rawX = var6; // L: 7134
						var71.rawY = var68; // L: 7135
						var71.xAlignment = 0; // L: 7136
						var71.yAlignment = 0; // L: 7137
						class218.invalidateWidget(var71); // L: 7138
						this.alignWidget(var71); // L: 7139
						if (var71.type == 0) { // L: 7140
							Login.revalidateWidgetScroll(PacketBufferNode.Widget_interfaceComponents[var5 >> 16], var71, false);
						}
					}

					var1.serverPacket = null; // L: 7142
					return true; // L: 7143
				}

				if (ServerPacket.field3343 == var1.serverPacket) { // L: 7145
					var68 = var3.method9115(); // L: 7146
					var5 = var3.method9114(); // L: 7147
					var89 = class92.getWidget(var5); // L: 7148
					ReflectionCheck.method710(var89, var68); // L: 7149
					class218.invalidateWidget(var89); // L: 7150
					var1.serverPacket = null; // L: 7151
					return true; // L: 7152
				}

				if (ServerPacket.field3309 == var1.serverPacket) { // L: 7154
					var68 = var3.readUnsignedShort(); // L: 7155
					var5 = var3.method9188(); // L: 7156
					var89 = class92.getWidget(var5); // L: 7157
					if (var89.modelType != 6 || var68 != var89.modelId) { // L: 7158
						var89.modelType = 6; // L: 7159
						var89.modelId = var68; // L: 7160
						class218.invalidateWidget(var89); // L: 7161
					}

					var1.serverPacket = null; // L: 7163
					return true; // L: 7164
				}

				if (ServerPacket.field3235 == var1.serverPacket) { // L: 7166
					byte var58 = var3.method9078(); // L: 7182
					var85 = var3.method9256() * 4; // L: 7183
					byte var57 = var3.method9078(); // L: 7184
					var59 = var3.method9101(); // L: 7185
					var56 = var3.method9192(); // L: 7186
					var16 = var3.method9100(); // L: 7187
					var13 = var3.method9091() * 4; // L: 7188
					var15 = var3.method9102(); // L: 7189
					var6 = var3.method9226(); // L: 7190
					var68 = var6 >> 16; // L: 7191
					var5 = var6 >> 8 & 255; // L: 7192
					var7 = var68 + (var6 >> 4 & 7); // L: 7193
					var8 = var5 + (var6 & 7); // L: 7194
					int var18 = var3.readUnsignedByte(); // L: 7195
					int var17 = var3.method9093(); // L: 7196
					var9 = var58 + var7; // L: 7197
					var10 = var57 + var8; // L: 7198
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var59 != 65535) { // L: 7199
						var7 = var7 * 128 + 64; // L: 7200
						var8 = var8 * 128 + 64; // L: 7201
						var9 = var9 * 128 + 64; // L: 7202
						var10 = var10 * 128 + 64; // L: 7203
						Projectile var19 = new Projectile(var59, HealthBar.Client_plane, var7, var8, class18.getTileHeight(var7, var8, HealthBar.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var56, var85); // L: 7204
						var19.setDestination(var9, var10, class18.getTileHeight(var9, var10, HealthBar.Client_plane) - var85, var15 + cycle); // L: 7205
						projectiles.addFirst(var19); // L: 7206
					}

					var1.serverPacket = null; // L: 7208
					return true; // L: 7209
				}

				if (ServerPacket.field3318 == var1.serverPacket) { // L: 7211
					class139.field1654 = new class454(class400.Ignored_cached); // L: 7212
					var1.serverPacket = null; // L: 7213
					return true; // L: 7214
				}

				if (ServerPacket.field3289 == var1.serverPacket) { // L: 7216
					ObjectSound.field855 = var3.method9256(); // L: 7217
					class125.field1499 = var3.method9093(); // L: 7218
					var1.serverPacket = null; // L: 7219
					return true; // L: 7220
				}

				if (ServerPacket.field3351 == var1.serverPacket) { // L: 7222
					for (var68 = 0; var68 < players.length; ++var68) { // L: 7223
						if (players[var68] != null) { // L: 7224
							players[var68].sequence = -1;
						}
					}

					for (var68 = 0; var68 < npcs.length; ++var68) { // L: 7226
						if (npcs[var68] != null) { // L: 7227
							npcs[var68].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 7229
					return true; // L: 7230
				}

				if (ServerPacket.field3277 == var1.serverPacket) { // L: 7232
					Frames.updateNpcs(false, var3); // L: 7233
					var1.serverPacket = null; // L: 7234
					return true; // L: 7235
				}

				if (ServerPacket.field3270 == var1.serverPacket) { // L: 7237
					NPCComposition.readReflectionCheck(var3, var1.serverPacketLength); // L: 7238
					var1.serverPacket = null; // L: 7239
					return true; // L: 7240
				}

				if (ServerPacket.field3245 == var1.serverPacket) { // L: 7242
					Frames.updateNpcs(true, var3); // L: 7243
					var1.serverPacket = null; // L: 7244
					return true; // L: 7245
				}

				if (ServerPacket.field3271 == var1.serverPacket) { // L: 7247
					var68 = var3.method9091(); // L: 7248
					var5 = var3.method9091(); // L: 7249
					var6 = var3.method9188(); // L: 7250
					var71 = class92.getWidget(var6); // L: 7251
					Tiles.method2242(var71, var5, var68); // L: 7252
					class218.invalidateWidget(var71); // L: 7253
					var1.serverPacket = null; // L: 7254
					return true; // L: 7255
				}

				if (ServerPacket.field3287 == var1.serverPacket) { // L: 7257
					var5 = var3.readUnsignedShort(); // L: 7260
					var68 = var3.method9100(); // L: 7261
					Script.method2180(var68, var5); // L: 7262
					var1.serverPacket = null; // L: 7263
					return true; // L: 7264
				}

				if (ServerPacket.field3336 == var1.serverPacket) { // L: 7266
					var80 = var3.readBoolean(); // L: 7267
					if (var80) { // L: 7268
						if (class390.field4441 == null) { // L: 7269
							class390.field4441 = new class369();
						}
					} else {
						class390.field4441 = null; // L: 7271
					}

					var1.serverPacket = null; // L: 7272
					return true; // L: 7273
				}

				if (ServerPacket.field3307 == var1.serverPacket) { // L: 7275
					isCameraLocked = true; // L: 7276
					field794 = false; // L: 7277
					field789 = true; // L: 7278
					var68 = class7.method53(var3.readShort() & 2027); // L: 7279
					var5 = UserComparator8.method2875(var3.readShort() & 2027); // L: 7280
					var6 = var3.readUnsignedShort(); // L: 7281
					var7 = var3.readUnsignedByte(); // L: 7282
					field608 = new class478(class129.cameraPitch, var5, var6, var7); // L: 7283
					field582 = new class478(UserComparator10.cameraYaw, var68, var6, var7); // L: 7284
					var1.serverPacket = null; // L: 7285
					return true; // L: 7286
				}

				if (ServerPacket.field3269 == var1.serverPacket) { // L: 7288
					return this.method1266(var1); // L: 7289
				}

				if (ServerPacket.field3248 == var1.serverPacket) { // L: 7291
					World.method1806(class295.field3209); // L: 7292
					var1.serverPacket = null; // L: 7293
					return true; // L: 7294
				}

				if (ServerPacket.field3258 == var1.serverPacket) { // L: 7296
					var68 = var3.method9114(); // L: 7297
					var5 = var3.readUnsignedShort(); // L: 7298
					if (var5 == 65535) { // L: 7299
						var5 = -1;
					}

					var6 = var3.method9115(); // L: 7300
					var7 = var3.method9102(); // L: 7301
					if (var7 == 65535) { // L: 7302
						var7 = -1;
					}

					for (var8 = var7; var8 <= var5; ++var8) { // L: 7303
						var27 = ((long)var6 << 32) + (long)var8; // L: 7304
						Node var99 = widgetFlags.get(var27); // L: 7305
						if (var99 != null) { // L: 7306
							var99.remove();
						}

						widgetFlags.put(new IntegerNode(var68), var27); // L: 7307
					}

					var1.serverPacket = null; // L: 7309
					return true; // L: 7310
				}

				if (ServerPacket.field3274 == var1.serverPacket) { // L: 7312
					var7 = var3.method9101(); // L: 7319
					var5 = var3.method9102(); // L: 7320
					if (var5 == 65535) { // L: 7321
						var5 = -1; // L: 7322
					}

					var8 = var3.method9102(); // L: 7324
					var6 = var3.method9100(); // L: 7325
					var9 = var3.method9100(); // L: 7326
					var68 = var3.method9101(); // L: 7327
					if (var68 == 65535) { // L: 7328
						var68 = -1; // L: 7329
					}

					ArrayList var86 = new ArrayList(); // L: 7331
					var86.add(var68); // L: 7332
					var86.add(var5); // L: 7333
					class157.method3261(var86, var6, var7, var8, var9); // L: 7334
					var1.serverPacket = null; // L: 7335
					return true; // L: 7336
				}

				if (ServerPacket.field3279 == var1.serverPacket) { // L: 7338
					class113.method2843(); // L: 7339
					var68 = var3.method9093(); // L: 7340
					var5 = var3.method9091(); // L: 7341
					var6 = var3.method9188(); // L: 7342
					experience[var5] = var6; // L: 7343
					currentLevels[var5] = var68; // L: 7344
					levels[var5] = 1; // L: 7345

					for (var7 = 0; var7 < 98; ++var7) { // L: 7346
						if (var6 >= Skills.Skills_experienceTable[var7]) {
							levels[var5] = var7 + 2;
						}
					}

					field650[++field728 - 1 & 31] = var5; // L: 7347
					var1.serverPacket = null; // L: 7348
					return true; // L: 7349
				}

				if (ServerPacket.field3341 == var1.serverPacket) { // L: 7351
					var68 = var3.readUnsignedShort(); // L: 7352
					var5 = var3.readUnsignedByte(); // L: 7353
					var6 = var3.readUnsignedShort(); // L: 7354
					class27.queueSoundEffect(var68, var5, var6); // L: 7355
					var1.serverPacket = null; // L: 7356
					return true; // L: 7357
				}

				if (ServerPacket.field3295 == var1.serverPacket) { // L: 7359
					var68 = var3.readUnsignedByte(); // L: 7360
					var5 = var3.method9115(); // L: 7361
					var89 = class92.getWidget(var5); // L: 7362
					class135.method3052(var89, VarbitComposition.localPlayer.appearance.field3572, var68); // L: 7363
					class218.invalidateWidget(var89); // L: 7364
					var1.serverPacket = null; // L: 7365
					return true; // L: 7366
				}

				if (ServerPacket.field3264 == var1.serverPacket) { // L: 7368
					var68 = var3.method9115(); // L: 7369
					var5 = var3.readUnsignedShort(); // L: 7370
					var89 = class92.getWidget(var68); // L: 7371
					if (var89.modelType != 2 || var5 != var89.modelId) { // L: 7372
						var89.modelType = 2; // L: 7373
						var89.modelId = var5; // L: 7374
						class218.invalidateWidget(var89); // L: 7375
					}

					var1.serverPacket = null; // L: 7377
					return true; // L: 7378
				}

				if (ServerPacket.field3234 == var1.serverPacket) { // L: 7380
					var68 = var3.readUnsignedByte(); // L: 7381
					Script.forceDisconnect(var68); // L: 7382
					var1.serverPacket = null; // L: 7383
					return false; // L: 7384
				}

				if (ServerPacket.field3250 == var1.serverPacket) { // L: 7386
					class113.method2843(); // L: 7387
					field643 = var3.readUnsignedShort(); // L: 7388
					field578 = cycleCntr; // L: 7389
					var1.serverPacket = null; // L: 7390
					return true; // L: 7391
				}

				boolean var60;
				if (ServerPacket.field3346 == var1.serverPacket) { // L: 7393
					var68 = var3.method9115(); // L: 7394
					var60 = var3.readUnsignedByte() == 1; // L: 7395
					var89 = class92.getWidget(var68); // L: 7396
					class160.method3278(var89, VarbitComposition.localPlayer.appearance, var60); // L: 7397
					class218.invalidateWidget(var89); // L: 7398
					var1.serverPacket = null; // L: 7399
					return true; // L: 7400
				}

				if (ServerPacket.field3275 == var1.serverPacket) { // L: 7402
					var20 = var3.method9095(); // L: 7403
					var5 = var3.method9101(); // L: 7404
					Varps.Varps_temp[var5] = var20; // L: 7405
					if (Varps.Varps_main[var5] != var20) { // L: 7406
						Varps.Varps_main[var5] = var20; // L: 7407
					}

					WorldMapDecoration.changeGameOptions(var5); // L: 7409
					field723[++field724 - 1 & 31] = var5; // L: 7410
					var1.serverPacket = null; // L: 7411
					return true; // L: 7412
				}

				boolean var12;
				if (ServerPacket.field3256 == var1.serverPacket) { // L: 7414
					var51 = var3.readStringCp1252NullTerminated(); // L: 7415
					var23 = (long)var3.readUnsignedShort(); // L: 7416
					var25 = (long)var3.readMedium(); // L: 7417
					PlayerType var44 = (PlayerType)class25.findEnumerated(MidiPcmStream.PlayerType_values(), var3.readUnsignedByte()); // L: 7418
					long var46 = (var23 << 32) + var25; // L: 7419
					var12 = false; // L: 7420

					for (var13 = 0; var13 < 100; ++var13) { // L: 7421
						if (var46 == field672[var13]) { // L: 7422
							var12 = true; // L: 7423
							break; // L: 7424
						}
					}

					if (class299.friendSystem.isIgnored(new Username(var51, Language.loginType))) { // L: 7427
						var12 = true;
					}

					if (!var12 && field651 == 0) { // L: 7428
						field672[field534] = var46; // L: 7429
						field534 = (field534 + 1) % 100; // L: 7430
						var30 = AbstractFont.escapeBrackets(World.method1830(DirectByteArrayCopier.method6579(var3))); // L: 7431
						byte var83;
						if (var44.isPrivileged) { // L: 7433
							var83 = 7;
						} else {
							var83 = 3; // L: 7434
						}

						if (var44.modIcon != -1) { // L: 7435
							MouseHandler.addGameMessage(var83, Tile.method4373(var44.modIcon) + var51, var30);
						} else {
							MouseHandler.addGameMessage(var83, var51, var30); // L: 7436
						}
					}

					var1.serverPacket = null; // L: 7438
					return true; // L: 7439
				}

				if (ServerPacket.field3280 == var1.serverPacket) { // L: 7441
					if (class139.field1654 == null) { // L: 7442
						class139.field1654 = new class454(class400.Ignored_cached);
					}

					class523 var52 = class400.Ignored_cached.method8294(var3); // L: 7443
					class139.field1654.field4768.vmethod8779(var52.field5178, var52.field5177); // L: 7444
					field793[++field657 - 1 & 31] = var52.field5178; // L: 7445
					var1.serverPacket = null; // L: 7446
					return true; // L: 7447
				}

				if (ServerPacket.field3294 == var1.serverPacket) { // L: 7449
					var1.serverPacket = null; // L: 7450
					return true; // L: 7451
				}

				NPC var91;
				if (ServerPacket.field3259 == var1.serverPacket) { // L: 7453
					short var82 = (short)var3.method9063(); // L: 7454
					var5 = var3.readUnsignedByte(); // L: 7455
					var6 = var3.readUnsignedShort(); // L: 7456
					var7 = var3.method9114(); // L: 7457
					var91 = npcs[var6]; // L: 7458
					if (var91 != null) { // L: 7459
						var91.method2623(var5, var7, var82); // L: 7460
					}

					var1.serverPacket = null; // L: 7462
					return true; // L: 7463
				}

				if (ServerPacket.field3272 == var1.serverPacket) { // L: 7465
					var68 = var3.readInt(); // L: 7466
					if (var68 != field626) { // L: 7467
						field626 = var68; // L: 7468
						WorldMapSection2.method5107(); // L: 7469
					}

					var1.serverPacket = null; // L: 7471
					return true; // L: 7472
				}

				if (ServerPacket.field3304 == var1.serverPacket) { // L: 7474
					for (var68 = 0; var68 < VarpDefinition.field1933; ++var68) { // L: 7475
						VarpDefinition var73 = ApproximateRouteStrategy.VarpDefinition_get(var68); // L: 7476
						if (var73 != null) { // L: 7477
							Varps.Varps_temp[var68] = 0; // L: 7478
							Varps.Varps_main[var68] = 0; // L: 7479
						}
					}

					class113.method2843(); // L: 7482
					field724 += 32; // L: 7483
					var1.serverPacket = null; // L: 7484
					return true; // L: 7485
				}

				if (ServerPacket.field3323 == var1.serverPacket) { // L: 7487
					var51 = var3.readStringCp1252NullTerminated(); // L: 7488
					Object[] var72 = new Object[var51.length() + 1]; // L: 7489

					for (var6 = var51.length() - 1; var6 >= 0; --var6) { // L: 7490
						if (var51.charAt(var6) == 's') { // L: 7491
							var72[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var72[var6 + 1] = new Integer(var3.readInt()); // L: 7492
						}
					}

					var72[0] = new Integer(var3.readInt()); // L: 7494
					ScriptEvent var95 = new ScriptEvent(); // L: 7495
					var95.args = var72; // L: 7496
					WorldMapSection1.runScriptEvent(var95); // L: 7497
					var1.serverPacket = null; // L: 7498
					return true; // L: 7499
				}

				if (ServerPacket.field3311 == var1.serverPacket) { // L: 7501
					var51 = var3.readStringCp1252NullTerminated(); // L: 7502
					var21 = AbstractFont.escapeBrackets(World.method1830(DirectByteArrayCopier.method6579(var3))); // L: 7503
					MouseHandler.addGameMessage(6, var51, var21); // L: 7504
					var1.serverPacket = null; // L: 7505
					return true; // L: 7506
				}

				if (ServerPacket.field3232 == var1.serverPacket) { // L: 7508
					class299.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 7509
					AbstractSocket.FriendSystem_invalidateIgnoreds(); // L: 7510
					field732 = cycleCntr; // L: 7511
					var1.serverPacket = null; // L: 7512
					return true; // L: 7513
				}

				if (ServerPacket.field3255 == var1.serverPacket) { // L: 7515
					var68 = var3.readUShortSmart(); // L: 7516
					var60 = var3.readUnsignedByte() == 1; // L: 7517
					var94 = ""; // L: 7518
					boolean var55 = false; // L: 7519
					if (var60) { // L: 7520
						var94 = var3.readStringCp1252NullTerminated(); // L: 7521
						if (class299.friendSystem.isIgnored(new Username(var94, Language.loginType))) { // L: 7522
							var55 = true;
						}
					}

					String var92 = var3.readStringCp1252NullTerminated(); // L: 7524
					if (!var55) { // L: 7525
						MouseHandler.addGameMessage(var68, var94, var92);
					}

					var1.serverPacket = null; // L: 7526
					return true; // L: 7527
				}

				if (ServerPacket.field3314 == var1.serverPacket) { // L: 7529
					var80 = var3.readUnsignedByte() == 1; // L: 7530
					if (var80) { // L: 7531
						class132.field1605 = GameEngine.method661() - var3.readLong(); // L: 7532
						class392.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 7533
					} else {
						class392.grandExchangeEvents = null; // L: 7535
					}

					field597 = cycleCntr; // L: 7536
					var1.serverPacket = null; // L: 7537
					return true; // L: 7538
				}

				if (ServerPacket.field3292 == var1.serverPacket) { // L: 7540
					var68 = var3.method9101(); // L: 7546
					var91 = npcs[var68]; // L: 7547
					var7 = var3.method9091(); // L: 7548
					var6 = var3.method9101(); // L: 7549
					var5 = var3.method9114(); // L: 7550
					if (var91 != null) { // L: 7551
						var91.method2376(var7, var6, var5 >> 16, var5 & 65535); // L: 7552
					}

					var1.serverPacket = null; // L: 7554
					return true; // L: 7555
				}

				if (ServerPacket.field3296 == var1.serverPacket) { // L: 7557
					var68 = var3.method9100(); // L: 7558
					if (var68 == 65535) { // L: 7559
						var68 = -1;
					}

					var5 = var3.readInt(); // L: 7560
					var6 = var3.method9115(); // L: 7561
					var71 = class92.getWidget(var5); // L: 7562
					ItemComposition var90;
					if (!var71.isIf3) { // L: 7563
						if (var68 == -1) { // L: 7564
							var71.modelType = 0; // L: 7565
							var1.serverPacket = null; // L: 7566
							return true; // L: 7567
						}

						var90 = InvDefinition.ItemComposition_get(var68).getCountObj(var6); // L: 7569
						var71.modelType = 4; // L: 7570
						var71.modelId = var68; // L: 7571
						var71.modelAngleX = var90.xan2d; // L: 7572
						var71.modelAngleY = var90.yan2d; // L: 7573
						var71.modelZoom = var90.zoom2d * 100 / var6; // L: 7574
						class218.invalidateWidget(var71); // L: 7575
					} else {
						var71.itemId = var68; // L: 7578
						var71.itemQuantity = var6; // L: 7579
						var90 = InvDefinition.ItemComposition_get(var68).getCountObj(var6); // L: 7580
						var71.modelAngleX = var90.xan2d; // L: 7581
						var71.modelAngleY = var90.yan2d; // L: 7582
						var71.modelAngleZ = var90.zan2d; // L: 7583
						var71.modelOffsetX = var90.offsetX2d; // L: 7584
						var71.modelOffsetY = var90.offsetY2d; // L: 7585
						var71.modelZoom = var90.zoom2d; // L: 7586
						if (var90.isStackable == 1) { // L: 7587
							var71.itemQuantityMode = 1;
						} else {
							var71.itemQuantityMode = 2; // L: 7588
						}

						if (var71.field3702 > 0) { // L: 7589
							var71.modelZoom = var71.modelZoom * 32 / var71.field3702;
						} else if (var71.rawWidth > 0) { // L: 7590
							var71.modelZoom = var71.modelZoom * 32 / var71.rawWidth;
						}

						class218.invalidateWidget(var71); // L: 7591
					}

					var1.serverPacket = null; // L: 7593
					return true; // L: 7594
				}

				if (ServerPacket.field3267 == var1.serverPacket) { // L: 7596
					var5 = var3.method9102(); // L: 7600
					var6 = var3.method9091(); // L: 7601
					var68 = var3.method9100(); // L: 7602
					if (var5 == 65535) { // L: 7603
						var5 = -1; // L: 7604
					}

					NPC var22 = npcs[var68]; // L: 7606
					if (var22 != null) { // L: 7607
						if (var5 == var22.sequence && var5 != -1) { // L: 7608
							var8 = EnumComposition.SequenceDefinition_get(var5).field2327; // L: 7609
							if (var8 == 1) { // L: 7610
								var22.sequenceFrame = 0; // L: 7611
								var22.sequenceFrameCycle = 0; // L: 7612
								var22.sequenceDelay = var6; // L: 7613
								var22.field1224 = 0; // L: 7614
							} else if (var8 == 2) { // L: 7616
								var22.field1224 = 0; // L: 7617
							}
						} else if (var5 == -1 || var22.sequence == -1 || EnumComposition.SequenceDefinition_get(var5).field2320 >= EnumComposition.SequenceDefinition_get(var22.sequence).field2320) { // L: 7620
							var22.sequence = var5; // L: 7621
							var22.sequenceFrame = 0; // L: 7622
							var22.sequenceFrameCycle = 0; // L: 7623
							var22.sequenceDelay = var6; // L: 7624
							var22.field1224 = 0; // L: 7625
							var22.field1261 = var22.pathLength; // L: 7626
						}
					}

					var1.serverPacket = null; // L: 7630
					return true; // L: 7631
				}

				if (ServerPacket.field3246 == var1.serverPacket) { // L: 7633
					var51 = var3.readStringCp1252NullTerminated(); // L: 7634
					var23 = var3.readLong(); // L: 7635
					var25 = (long)var3.readUnsignedShort(); // L: 7636
					var27 = (long)var3.readMedium(); // L: 7637
					PlayerType var45 = (PlayerType)class25.findEnumerated(MidiPcmStream.PlayerType_values(), var3.readUnsignedByte()); // L: 7638
					var32 = var27 + (var25 << 32); // L: 7639
					boolean var31 = false; // L: 7640

					for (var15 = 0; var15 < 100; ++var15) { // L: 7641
						if (field672[var15] == var32) { // L: 7642
							var31 = true; // L: 7643
							break; // L: 7644
						}
					}

					if (var45.isUser && class299.friendSystem.isIgnored(new Username(var51, Language.loginType))) { // L: 7647 7648
						var31 = true;
					}

					if (!var31 && field651 == 0) { // L: 7650
						field672[field534] = var32; // L: 7651
						field534 = (field534 + 1) % 100; // L: 7652
						var43 = AbstractFont.escapeBrackets(World.method1830(DirectByteArrayCopier.method6579(var3))); // L: 7653
						if (var45.modIcon != -1) { // L: 7654
							class416.addChatMessage(9, Tile.method4373(var45.modIcon) + var51, var43, class211.base37DecodeLong(var23));
						} else {
							class416.addChatMessage(9, var51, var43, class211.base37DecodeLong(var23)); // L: 7655
						}
					}

					var1.serverPacket = null; // L: 7657
					return true; // L: 7658
				}

				if (ServerPacket.field3301 == var1.serverPacket) { // L: 7660
					var68 = var3.readUnsignedByte(); // L: 7661
					MusicPatchNode2.method5742(var68); // L: 7662
					var1.serverPacket = null; // L: 7663
					return true; // L: 7664
				}

				if (ServerPacket.field3262 == var1.serverPacket) { // L: 7666
					var68 = var3.readUnsignedByte(); // L: 7667
					var5 = var3.readUnsignedByte(); // L: 7668
					var6 = var3.readUnsignedByte(); // L: 7669
					var7 = var3.readUnsignedByte(); // L: 7670
					field795[var68] = true; // L: 7671
					field588[var68] = var5; // L: 7672
					field748[var68] = var6; // L: 7673
					field658[var68] = var7; // L: 7674
					field744[var68] = 0; // L: 7675
					var1.serverPacket = null; // L: 7676
					return true; // L: 7677
				}

				if (ServerPacket.field3285 == var1.serverPacket) { // L: 7679
					var68 = var3.readInt(); // L: 7680
					var5 = var3.readUnsignedShort(); // L: 7681
					if (var68 < -70000) { // L: 7682
						var5 += 32768;
					}

					if (var68 >= 0) { // L: 7684
						var89 = class92.getWidget(var68);
					} else {
						var89 = null; // L: 7685
					}

					for (; var3.offset < var1.serverPacketLength; FriendsChatManager.itemContainerSetItem(var5, var7, var8 - 1, var9)) { // L: 7686 7700
						var7 = var3.readUShortSmart(); // L: 7687
						var8 = var3.readUnsignedShort(); // L: 7688
						var9 = 0; // L: 7689
						if (var8 != 0) { // L: 7690
							var9 = var3.readUnsignedByte(); // L: 7691
							if (var9 == 255) { // L: 7692
								var9 = var3.readInt();
							}
						}

						if (var89 != null && var7 >= 0 && var7 < var89.itemIds.length) { // L: 7694 7695
							var89.itemIds[var7] = var8; // L: 7696
							var89.field3778[var7] = var9; // L: 7697
						}
					}

					if (var89 != null) { // L: 7702
						class218.invalidateWidget(var89);
					}

					class113.method2843(); // L: 7703
					field725[++field726 - 1 & 31] = var5 & 32767; // L: 7704
					var1.serverPacket = null; // L: 7705
					return true; // L: 7706
				}

				if (ServerPacket.field3241 == var1.serverPacket) { // L: 7708
					isCameraLocked = true; // L: 7709
					field794 = false; // L: 7710
					field789 = true; // L: 7711
					var68 = var3.readShort(); // L: 7712
					var5 = var3.readShort(); // L: 7713
					var6 = UserComparator8.method2875(var5 + class129.cameraPitch & 2027); // L: 7714
					var7 = var68 + UserComparator10.cameraYaw; // L: 7715
					var8 = var3.readUnsignedShort(); // L: 7716
					var9 = var3.readUnsignedByte(); // L: 7717
					field608 = new class478(class129.cameraPitch, var6, var8, var9); // L: 7718
					field582 = new class478(UserComparator10.cameraYaw, var7, var8, var9); // L: 7719
					var1.serverPacket = null; // L: 7720
					return true; // L: 7721
				}

				if (ServerPacket.field3347 == var1.serverPacket) { // L: 7723
					var7 = var3.method9091(); // L: 7729
					var6 = var3.method9114(); // L: 7730
					var5 = var3.readUnsignedShort(); // L: 7731
					var68 = var3.method9100(); // L: 7732
					Player var36;
					if (var68 == localPlayerIndex) { // L: 7733
						var36 = VarbitComposition.localPlayer; // L: 7734
					} else {
						var36 = players[var68]; // L: 7737
					}

					if (var36 != null) { // L: 7739
						var36.method2376(var7, var5, var6 >> 16, var6 & 65535); // L: 7740
					}

					var1.serverPacket = null; // L: 7742
					return true; // L: 7743
				}

				if (ServerPacket.field3319 == var1.serverPacket) { // L: 7745
					for (var68 = 0; var68 < Varps.Varps_main.length; ++var68) { // L: 7746
						if (Varps.Varps_main[var68] != Varps.Varps_temp[var68]) { // L: 7747
							Varps.Varps_main[var68] = Varps.Varps_temp[var68]; // L: 7748
							WorldMapDecoration.changeGameOptions(var68); // L: 7749
							field723[++field724 - 1 & 31] = var68; // L: 7750
						}
					}

					var1.serverPacket = null; // L: 7753
					return true; // L: 7754
				}

				if (ServerPacket.field3251 == var1.serverPacket) { // L: 7756
					Interpreter.method2070(var3.readStringCp1252NullTerminated()); // L: 7757
					var1.serverPacket = null; // L: 7758
					return true; // L: 7759
				}

				if (ServerPacket.field3331 == var1.serverPacket) { // L: 7761
					var68 = var3.method9115(); // L: 7762
					var5 = var3.method9104(); // L: 7763
					var89 = class92.getWidget(var68); // L: 7764
					if (var5 != var89.sequenceId || var5 == -1) { // L: 7765
						var89.sequenceId = var5; // L: 7766
						var89.modelFrame = 0; // L: 7767
						var89.modelFrameCycle = 0; // L: 7768
						class218.invalidateWidget(var89); // L: 7769
					}

					var1.serverPacket = null; // L: 7771
					return true; // L: 7772
				}

				if (ServerPacket.field3300 == var1.serverPacket) { // L: 7774
					ObjectSound.field855 = var3.readUnsignedByte(); // L: 7775
					class125.field1499 = var3.method9093(); // L: 7776

					while (var3.offset < var1.serverPacketLength) { // L: 7777
						var68 = var3.readUnsignedByte(); // L: 7778
						class295 var70 = WorldMapSection0.method5424()[var68]; // L: 7779
						World.method1806(var70); // L: 7780
					}

					var1.serverPacket = null; // L: 7782
					return true; // L: 7783
				}

				if (ServerPacket.field3286 == var1.serverPacket) { // L: 7785
					var68 = var3.method9101(); // L: 7790
					var5 = var3.method9102(); // L: 7791
					var7 = var3.method9102(); // L: 7792
					var6 = var3.method9100(); // L: 7793
					PacketWriter.method2806(var68, var5, var6, var7); // L: 7794
					var1.serverPacket = null; // L: 7795
					return true; // L: 7796
				}

				if (ServerPacket.field3302 == var1.serverPacket) { // L: 7798
					isCameraLocked = true; // L: 7799
					field794 = false; // L: 7800
					field788 = true; // L: 7801
					Players.field1374 = var3.readUnsignedByte() * 16384; // L: 7802
					class33.field180 = var3.readUnsignedByte() * 16384; // L: 7803
					var68 = var3.readUnsignedShort(); // L: 7804
					var5 = var3.readUnsignedByte() * 128 + 64; // L: 7805
					var6 = var3.readUnsignedByte() * 128 + 64; // L: 7806
					var7 = var3.readUnsignedShort(); // L: 7807
					field790 = var3.readBoolean(); // L: 7808
					var8 = var3.readUnsignedByte(); // L: 7809
					var9 = Players.field1374 * 128 + 64; // L: 7810
					var10 = class33.field180 * 128 + 64; // L: 7811
					var11 = false; // L: 7812
					var12 = false; // L: 7813
					if (field790) { // L: 7814
						var56 = class133.cameraY; // L: 7815
						var59 = class18.getTileHeight(var9, var10, HealthBar.Client_plane) - var68; // L: 7816
					} else {
						var56 = class18.getTileHeight(NPCComposition.cameraX, class139.cameraZ, HealthBar.Client_plane) - class133.cameraY; // L: 7819
						var59 = var68; // L: 7820
					}

					field791 = new class476(NPCComposition.cameraX, class139.cameraZ, var56, var9, var10, var59, var5, var6, var7, var8); // L: 7822
					var1.serverPacket = null; // L: 7823
					return true; // L: 7824
				}

				if (ServerPacket.field3242 == var1.serverPacket) { // L: 7826
					class299.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 7827
					field732 = cycleCntr; // L: 7828
					var1.serverPacket = null; // L: 7829
					return true; // L: 7830
				}

				if (ServerPacket.field3308 == var1.serverPacket) { // L: 7832
					isCameraLocked = true; // L: 7833
					field794 = false; // L: 7834
					field788 = false; // L: 7835
					Players.field1374 = var3.readUnsignedByte() * 16384; // L: 7836
					class33.field180 = var3.readUnsignedByte() * 16384; // L: 7837
					VarpDefinition.field1937 = var3.readUnsignedShort(); // L: 7838
					class344.field3874 = var3.readUnsignedByte(); // L: 7839
					MouseHandler.field252 = var3.readUnsignedByte(); // L: 7840
					if (MouseHandler.field252 >= 100) { // L: 7841
						NPCComposition.cameraX = Players.field1374 * 128 + 64; // L: 7842
						class139.cameraZ = class33.field180 * 128 + 64; // L: 7843
						class133.cameraY = class18.getTileHeight(NPCComposition.cameraX, class139.cameraZ, HealthBar.Client_plane) - VarpDefinition.field1937; // L: 7844
					}

					var1.serverPacket = null; // L: 7846
					return true; // L: 7847
				}

				if (ServerPacket.field3324 == var1.serverPacket) { // L: 7849
					var68 = var3.method9115(); // L: 7850
					var5 = var3.method9101(); // L: 7851
					var6 = var5 >> 10 & 31; // L: 7852
					var7 = var5 >> 5 & 31; // L: 7853
					var8 = var5 & 31; // L: 7854
					var9 = (var7 << 11) + (var6 << 19) + (var8 << 3); // L: 7855
					Widget var34 = class92.getWidget(var68); // L: 7856
					if (var9 != var34.color) { // L: 7857
						var34.color = var9; // L: 7858
						class218.invalidateWidget(var34); // L: 7859
					}

					var1.serverPacket = null; // L: 7861
					return true; // L: 7862
				}

				if (ServerPacket.field3288 == var1.serverPacket) { // L: 7864
					var51 = var3.readStringCp1252NullTerminated(); // L: 7865
					var5 = var3.method9188(); // L: 7866
					var89 = class92.getWidget(var5); // L: 7867
					if (!var51.equals(var89.text)) { // L: 7868
						var89.text = var51; // L: 7869
						class218.invalidateWidget(var89); // L: 7870
					}

					var1.serverPacket = null; // L: 7872
					return true; // L: 7873
				}

				if (ServerPacket.field3337 == var1.serverPacket) { // L: 7875
					var68 = var3.readInt(); // L: 7876
					var5 = var3.readUnsignedShort(); // L: 7877
					if (var68 < -70000) { // L: 7878
						var5 += 32768;
					}

					if (var68 >= 0) { // L: 7880
						var89 = class92.getWidget(var68);
					} else {
						var89 = null; // L: 7881
					}

					if (var89 != null) { // L: 7882
						for (var7 = 0; var7 < var89.itemIds.length; ++var7) { // L: 7883
							var89.itemIds[var7] = 0; // L: 7884
							var89.field3778[var7] = 0; // L: 7885
						}
					}

					SoundCache.clearItemContainer(var5); // L: 7888
					var7 = var3.readUnsignedShort(); // L: 7889

					for (var8 = 0; var8 < var7; ++var8) { // L: 7890
						var9 = var3.readUnsignedShort(); // L: 7891
						var10 = var3.method9093(); // L: 7892
						if (var10 == 255) { // L: 7893
							var10 = var3.method9188();
						}

						if (var89 != null && var8 < var89.itemIds.length) { // L: 7894 7895
							var89.itemIds[var8] = var9; // L: 7896
							var89.field3778[var8] = var10; // L: 7897
						}

						FriendsChatManager.itemContainerSetItem(var5, var8, var9 - 1, var10); // L: 7900
					}

					if (var89 != null) { // L: 7902
						class218.invalidateWidget(var89);
					}

					class113.method2843(); // L: 7903
					field725[++field726 - 1 & 31] = var5 & 32767; // L: 7904
					var1.serverPacket = null; // L: 7905
					return true; // L: 7906
				}

				if (ServerPacket.field3257 == var1.serverPacket) { // L: 7908
					var68 = var3.method9100(); // L: 7909
					var5 = var3.method9188(); // L: 7910
					Varps.Varps_temp[var68] = var5; // L: 7911
					if (Varps.Varps_main[var68] != var5) { // L: 7912
						Varps.Varps_main[var68] = var5; // L: 7913
					}

					WorldMapDecoration.changeGameOptions(var68); // L: 7915
					field723[++field724 - 1 & 31] = var68; // L: 7916
					var1.serverPacket = null; // L: 7917
					return true; // L: 7918
				}

				if (ServerPacket.field3261 == var1.serverPacket) { // L: 7920
					World.method1806(class295.field3210); // L: 7921
					var1.serverPacket = null; // L: 7922
					return true; // L: 7923
				}

				if (ServerPacket.field3349 == var1.serverPacket) { // L: 7925
					World.method1806(class295.field3216); // L: 7926
					var1.serverPacket = null; // L: 7927
					return true; // L: 7928
				}

				if (ServerPacket.field3321 == var1.serverPacket) { // L: 7930
					World.method1806(class295.field3215); // L: 7931
					var1.serverPacket = null; // L: 7932
					return true; // L: 7933
				}

				if (ServerPacket.field3330 == var1.serverPacket) { // L: 7935
					var68 = var3.readUnsignedByte(); // L: 7936
					if (var3.readUnsignedByte() == 0) { // L: 7937
						grandExchangeOffers[var68] = new GrandExchangeOffer(); // L: 7938
						var3.offset += 18; // L: 7939
					} else {
						--var3.offset; // L: 7942
						grandExchangeOffers[var68] = new GrandExchangeOffer(var3, false); // L: 7943
					}

					field736 = cycleCntr; // L: 7945
					var1.serverPacket = null; // L: 7946
					return true; // L: 7947
				}

				if (ServerPacket.field3247 == var1.serverPacket && isCameraLocked) { // L: 7949 7950
					field794 = true; // L: 7951
					field789 = false; // L: 7952
					field788 = false; // L: 7953

					for (var68 = 0; var68 < 5; ++var68) { // L: 7954
						field795[var68] = false; // L: 7955
					}

					var1.serverPacket = null; // L: 7957
					return true; // L: 7958
				}

				if (ServerPacket.field3243 == var1.serverPacket) { // L: 7961
					ObjectSound.field855 = var3.method9256(); // L: 7962
					class125.field1499 = var3.method9093(); // L: 7963

					for (var68 = ObjectSound.field855; var68 < ObjectSound.field855 + 8; ++var68) { // L: 7964
						for (var5 = class125.field1499; var5 < class125.field1499 + 8; ++var5) { // L: 7965
							if (groundItems[HealthBar.Client_plane][var68][var5] != null) { // L: 7966
								groundItems[HealthBar.Client_plane][var68][var5] = null; // L: 7967
								class135.updateItemPile(var68, var5); // L: 7968
							}
						}
					}

					for (PendingSpawn var50 = (PendingSpawn)pendingSpawns.last(); var50 != null; var50 = (PendingSpawn)pendingSpawns.previous()) { // L: 7972 7973 7975
						if (var50.x >= ObjectSound.field855 && var50.x < ObjectSound.field855 + 8 && var50.y >= class125.field1499 && var50.y < class125.field1499 + 8 && var50.plane == HealthBar.Client_plane) { // L: 7974
							var50.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 7977
					return true; // L: 7978
				}

				if (ServerPacket.field3266 == var1.serverPacket) { // L: 7980
					return this.method1617(var1, 2); // L: 7981
				}

				if (ServerPacket.field3335 == var1.serverPacket) { // L: 7983
					destinationX = var3.readUnsignedByte(); // L: 7984
					if (destinationX == 255) { // L: 7985
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 7986
					if (destinationY == 255) { // L: 7987
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 7988
					return true; // L: 7989
				}

				if (ServerPacket.field3260 == var1.serverPacket) { // L: 7991
					field735 = cycleCntr; // L: 7992
					var20 = var3.readByte(); // L: 7993
					class160 var69 = new class160(var3); // L: 7994
					ClanChannel var35;
					if (var20 >= 0) { // L: 7996
						var35 = currentClanChannels[var20];
					} else {
						var35 = VerticalAlignment.guestClanChannel; // L: 7997
					}

					if (var35 == null) { // L: 7998
						this.method1540(var20); // L: 7999
						var1.serverPacket = null; // L: 8000
						return true; // L: 8001
					}

					if (var69.field1781 > var35.field1808) { // L: 8003
						this.method1540(var20); // L: 8004
						var1.serverPacket = null; // L: 8005
						return true; // L: 8006
					}

					if (var69.field1781 < var35.field1808) { // L: 8008
						var1.serverPacket = null; // L: 8009
						return true; // L: 8010
					}

					var69.method3275(var35); // L: 8012
					var1.serverPacket = null; // L: 8013
					return true; // L: 8014
				}

				if (ServerPacket.field3354 == var1.serverPacket) { // L: 8016
					World.method1806(class295.field3211); // L: 8017
					var1.serverPacket = null; // L: 8018
					return true; // L: 8019
				}

				Messages.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1436 != null ? var1.field1436.id : -1) + "," + (var1.field1437 != null ? var1.field1437.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 8021
				ArchiveDisk.logOut(); // L: 8022
			} catch (IOException var48) { // L: 8024
				Renderable.method4709(); // L: 8025
			} catch (Exception var49) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1436 != null ? var1.field1436.id : -1) + "," + (var1.field1437 != null ? var1.field1437.id : -1) + "," + var1.serverPacketLength + "," + (VarbitComposition.localPlayer.pathX[0] + UrlRequester.baseX * 64) + "," + (VarbitComposition.localPlayer.pathY[0] + class47.baseY * 64) + ","; // L: 8028

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 8029
					var21 = var21 + var3.array[var6] + ",";
				}

				Messages.RunException_sendStackTrace(var21, var49); // L: 8030
				ArchiveDisk.logOut(); // L: 8031
			}

			return true; // L: 8033
		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-90"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false; // L: 9222

		int var2;
		int var5;
		while (!var1) { // L: 9223
			var1 = true; // L: 9224

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) { // L: 9225
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) { // L: 9226
					String var17 = menuTargets[var2]; // L: 9227
					menuTargets[var2] = menuTargets[var2 + 1]; // L: 9228
					menuTargets[var2 + 1] = var17; // L: 9229
					String var18 = menuActions[var2]; // L: 9230
					menuActions[var2] = menuActions[var2 + 1]; // L: 9231
					menuActions[var2 + 1] = var18; // L: 9232
					var5 = menuOpcodes[var2]; // L: 9233
					menuOpcodes[var2] = menuOpcodes[var2 + 1]; // L: 9234
					menuOpcodes[var2 + 1] = var5; // L: 9235
					var5 = menuArguments1[var2]; // L: 9236
					menuArguments1[var2] = menuArguments1[var2 + 1]; // L: 9237
					menuArguments1[var2 + 1] = var5; // L: 9238
					var5 = menuArguments2[var2]; // L: 9239
					menuArguments2[var2] = menuArguments2[var2 + 1]; // L: 9240
					menuArguments2[var2 + 1] = var5; // L: 9241
					var5 = menuIdentifiers[var2]; // L: 9242
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1]; // L: 9243
					menuIdentifiers[var2 + 1] = var5; // L: 9244
					var5 = field680[var2]; // L: 9245
					field680[var2] = field680[var2 + 1]; // L: 9246
					field680[var2 + 1] = var5; // L: 9247
					boolean var6 = menuShiftClick[var2]; // L: 9248
					menuShiftClick[var2] = menuShiftClick[var2 + 1]; // L: 9249
					menuShiftClick[var2 + 1] = var6; // L: 9250
					var1 = false; // L: 9251
				}
			}
		}

		if (clickedWidget == null) { // L: 9256
			int var19 = MouseHandler.MouseHandler_lastButton; // L: 9257
			int var4;
			int var7;
			int var8;
			int var20;
			if (isMenuOpen) { // L: 9258
				int var3;
				if (var19 != 1 && (class183.mouseCam || var19 != 4)) { // L: 9259
					var2 = MouseHandler.MouseHandler_x; // L: 9260
					var3 = MouseHandler.MouseHandler_y; // L: 9261
					if (var2 < class12.menuX - 10 || var2 > class12.menuX + class316.menuWidth + 10 || var3 < class419.menuY - 10 || var3 > class419.menuY + Occluder.menuHeight + 10) { // L: 9262
						isMenuOpen = false; // L: 9263
						var4 = class12.menuX; // L: 9264
						var5 = class419.menuY; // L: 9265
						var20 = class316.menuWidth; // L: 9266
						var7 = Occluder.menuHeight; // L: 9267

						for (var8 = 0; var8 < rootWidgetCount; ++var8) { // L: 9269
							if (rootWidgetWidths[var8] + rootWidgetXs[var8] > var4 && rootWidgetXs[var8] < var4 + var20 && rootWidgetYs[var8] + rootWidgetHeights[var8] > var5 && rootWidgetYs[var8] < var5 + var7) { // L: 9270
								field536[var8] = true;
							}
						}
					}
				}

				if (var19 == 1 || !class183.mouseCam && var19 == 4) { // L: 9275
					var2 = class12.menuX; // L: 9276
					var3 = class419.menuY; // L: 9277
					var4 = class316.menuWidth; // L: 9278
					var5 = MouseHandler.MouseHandler_lastPressedX; // L: 9279
					var20 = MouseHandler.MouseHandler_lastPressedY; // L: 9280
					var7 = -1; // L: 9281

					int var15;
					for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 9282
						var15 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31; // L: 9283
						if (var5 > var2 && var5 < var4 + var2 && var20 > var15 - 13 && var20 < var15 + 3) { // L: 9284
							var7 = var8;
						}
					}

					int var11;
					int var12;
					int var16;
					if (var7 != -1 && var7 >= 0) { // L: 9286 9287
						var8 = menuArguments1[var7]; // L: 9288
						var15 = menuArguments2[var7]; // L: 9289
						var16 = menuOpcodes[var7]; // L: 9290
						var11 = menuIdentifiers[var7]; // L: 9291
						var12 = field680[var7]; // L: 9292
						String var13 = menuActions[var7]; // L: 9293
						String var14 = menuTargets[var7]; // L: 9294
						IgnoreList.method7814(var8, var15, var16, var11, var12, var13, var14, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 9295
					}

					isMenuOpen = false; // L: 9297
					var8 = class12.menuX; // L: 9298
					var15 = class419.menuY; // L: 9299
					var16 = class316.menuWidth; // L: 9300
					var11 = Occluder.menuHeight; // L: 9301

					for (var12 = 0; var12 < rootWidgetCount; ++var12) { // L: 9303
						if (rootWidgetWidths[var12] + rootWidgetXs[var12] > var8 && rootWidgetXs[var12] < var8 + var16 && rootWidgetHeights[var12] + rootWidgetYs[var12] > var15 && rootWidgetYs[var12] < var15 + var11) { // L: 9304
							field536[var12] = true;
						}
					}
				}
			} else {
				var2 = menuOptionsCount - 1; // L: 9312
				if ((var19 == 1 || !class183.mouseCam && var19 == 4) && this.shouldLeftClickOpenMenu()) { // L: 9315 9316
					var19 = 2; // L: 9317
				}

				if ((var19 == 1 || !class183.mouseCam && var19 == 4) && menuOptionsCount > 0 && var2 >= 0) { // L: 9320 9322
					var4 = menuArguments1[var2]; // L: 9323
					var5 = menuArguments2[var2]; // L: 9324
					var20 = menuOpcodes[var2]; // L: 9325
					var7 = menuIdentifiers[var2]; // L: 9326
					var8 = field680[var2]; // L: 9327
					String var9 = menuActions[var2]; // L: 9328
					String var10 = menuTargets[var2]; // L: 9329
					IgnoreList.method7814(var4, var5, var20, var7, var8, var9, var10, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 9330
				}

				if (var19 == 2 && menuOptionsCount > 0) { // L: 9333
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	} // L: 9335

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-84"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1; // L: 9340
		return (field673 && menuOptionsCount > 2 || class53.method1093(var1)) && !menuShiftClick[var1]; // L: 9343
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1301595463"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		class342.method6603(var1, var2); // L: 9347
		var1 -= viewportOffsetX; // L: 9348
		var2 -= viewportOffsetY; // L: 9349
		class130.scene.menuOpen(HealthBar.Client_plane, var1, var2, false); // L: 9350
		isMenuOpen = true; // L: 9351
	} // L: 9352

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "571828087"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface; // L: 11028
		int var3 = class113.canvasWidth; // L: 11029
		int var4 = class177.canvasHeight; // L: 11030
		if (ModeWhere.loadInterface(var2)) { // L: 11032
			PcmPlayer.resizeInterface(PacketBufferNode.Widget_interfaceComponents[var2], -1, var3, var4, var1); // L: 11033
		}

	} // L: 11035

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Lmi;I)V",
		garbageValue = "649704501"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class92.getWidget(var1.parentId); // L: 11038
		int var3;
		int var4;
		if (var2 == null) { // L: 11041
			var3 = class113.canvasWidth; // L: 11042
			var4 = class177.canvasHeight; // L: 11043
		} else {
			var3 = var2.width; // L: 11046
			var4 = var2.height; // L: 11047
		}

		class369.alignWidgetSize(var1, var3, var4, false); // L: 11049
		WorldMapArea.alignWidgetPosition(var1, var3, var4); // L: 11050
	} // L: 11051

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-332488970"
	)
	final void method1273() {
		class218.invalidateWidget(clickedWidget); // L: 12006
		++class159.widgetDragDuration; // L: 12007
		int var1;
		int var2;
		if (field762 && field715) { // L: 12008
			var1 = MouseHandler.MouseHandler_x; // L: 12027
			var2 = MouseHandler.MouseHandler_y; // L: 12028
			var1 -= widgetClickX; // L: 12029
			var2 -= widgetClickY; // L: 12030
			if (var1 < field716) { // L: 12031
				var1 = field716;
			}

			if (var1 + clickedWidget.width > field716 + clickedWidgetParent.width) { // L: 12032
				var1 = field716 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field717) { // L: 12033
				var2 = field717;
			}

			if (var2 + clickedWidget.height > field717 + clickedWidgetParent.height) { // L: 12034
				var2 = field717 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field564; // L: 12035
			int var4 = var2 - field636; // L: 12036
			int var5 = clickedWidget.dragZoneSize; // L: 12037
			if (class159.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 12038 12039
				isDraggingWidget = true; // L: 12040
			}

			int var6 = var1 - field716 + clickedWidgetParent.scrollX; // L: 12043
			int var7 = var2 - field717 + clickedWidgetParent.scrollY; // L: 12044
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 12045
				var8 = new ScriptEvent(); // L: 12046
				var8.widget = clickedWidget; // L: 12047
				var8.mouseX = var6; // L: 12048
				var8.mouseY = var7; // L: 12049
				var8.args = clickedWidget.onDrag; // L: 12050
				WorldMapSection1.runScriptEvent(var8); // L: 12051
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 12053
				if (isDraggingWidget) { // L: 12054
					if (clickedWidget.onDragComplete != null) { // L: 12055
						var8 = new ScriptEvent(); // L: 12056
						var8.widget = clickedWidget; // L: 12057
						var8.mouseX = var6; // L: 12058
						var8.mouseY = var7; // L: 12059
						var8.dragTarget = draggedOnWidget; // L: 12060
						var8.args = clickedWidget.onDragComplete; // L: 12061
						WorldMapSection1.runScriptEvent(var8); // L: 12062
					}

					if (draggedOnWidget != null && BuddyRankComparator.method2916(clickedWidget) != null) { // L: 12064
						PacketBufferNode var10 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3137, packetWriter.isaacCipher); // L: 12066
						var10.packetBuffer.method9111(clickedWidget.id); // L: 12067
						var10.packetBuffer.writeIntME(draggedOnWidget.id); // L: 12068
						var10.packetBuffer.writeShort(clickedWidget.childIndex); // L: 12069
						var10.packetBuffer.writeShort(draggedOnWidget.itemId); // L: 12070
						var10.packetBuffer.method9213(draggedOnWidget.childIndex); // L: 12071
						var10.packetBuffer.method9213(clickedWidget.itemId); // L: 12072
						packetWriter.addNode(var10); // L: 12073
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 12077
					this.openMenu(field564 + widgetClickX, field636 + widgetClickY); // L: 12078
				} else if (menuOptionsCount > 0) { // L: 12080
					method1801(widgetClickX + field564, widgetClickY + field636); // L: 12081
				}

				clickedWidget = null; // L: 12084
			}

		} else {
			if (class159.widgetDragDuration > 1) { // L: 12009
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 12010
					var1 = widgetClickX + field564; // L: 12011
					var2 = widgetClickY + field636; // L: 12012
					MenuAction var9 = class9.tempMenuAction; // L: 12014
					if (var9 != null) { // L: 12016
						IgnoreList.method7814(var9.param0, var9.param1, var9.opcode, var9.identifier, var9.field916, var9.field921, var9.field922, var1, var2); // L: 12017
					}

					class9.tempMenuAction = null; // L: 12020
				}

				clickedWidget = null; // L: 12023
			}

		}
	} // L: 12025 12086

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(S)Luc;",
		garbageValue = "-775"
	)
	@Export("username")
	public Username username() {
		return VarbitComposition.localPlayer != null ? VarbitComposition.localPlayer.username : null; // L: 12820
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "516"
	)
	void method1540(int var1) {
		if (field708 >= 216) { // L: 12949
			PacketBufferNode var2 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3203, packetWriter.isaacCipher); // L: 12950
			var2.packetBuffer.writeByte(var1); // L: 12951
			packetWriter.addNode(var2); // L: 12952
		}

	} // L: 12954

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1345860990"
	)
	void method1276(int var1) {
		if (field708 >= 216) { // L: 12957
			PacketBufferNode var2 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3204, packetWriter.isaacCipher); // L: 12958
			var2.packetBuffer.writeByte(var1); // L: 12959
			packetWriter.addNode(var2); // L: 12960
		}

	} // L: 12962

	protected void finalize() throws Throwable {
		HorizontalAlignment.method3678(this); // L: 927
		super.finalize(); // L: 928
	} // L: 929

	public void setClient(int var1) {
		this.field574 = var1; // L: 946
	} // L: 947

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 952
			this.field678 = var1; // L: 955
			PcmPlayer.method838(10); // L: 956
		}
	} // L: 953 957

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 962
			this.field576 = var1; // L: 965
		}
	} // L: 963 966

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 971
	}

	public long getAccountHash() {
		return this.accountHash; // L: 976
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 774
				for (int var1 = 0; var1 <= 28; ++var1) { // L: 775
					String var2 = this.getParameter(Integer.toString(var1)); // L: 776
					if (var2 != null) { // L: 777
						switch(var1) { // L: 778
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 836
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 837
							}
							break;
						case 4:
							if (clientType == -1) { // L: 781
								clientType = Integer.parseInt(var2); // L: 782
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 831
							break; // L: 832
						case 6:
							ClanChannelMember.clientLanguage = Language.method6938(Integer.parseInt(var2)); // L: 880
							break; // L: 881
						case 7:
							int var4 = Integer.parseInt(var2); // L: 789
							GameBuild[] var5 = UrlRequest.method2855(); // L: 792
							int var6 = 0;

							GameBuild var13;
							while (true) {
								if (var6 >= var5.length) {
									var13 = null; // L: 803
									break;
								}

								GameBuild var7 = var5[var6]; // L: 794
								if (var4 == var7.buildId) { // L: 796
									var13 = var7; // L: 797
									break; // L: 798
								}

								++var6; // L: 793
							}

							WorldMapLabelSize.field2882 = var13; // L: 805
							break; // L: 806
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 820
							}
							break;
						case 9:
							MusicPatchPcmStream.field3478 = var2; // L: 842
							break; // L: 843
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.stellardawn, StudioGame.game5, StudioGame.game4, StudioGame.runescape, StudioGame.game3, StudioGame.oldscape}; // L: 861
							WorldMapSectionType.field2997 = (StudioGame)class25.findEnumerated(var3, Integer.parseInt(var2)); // L: 863
							if (StudioGame.oldscape == WorldMapSectionType.field2997) { // L: 864
								Language.loginType = LoginType.oldscape;
							} else {
								Language.loginType = LoginType.field4998; // L: 865
							}
							break;
						case 11:
							class510.field5094 = var2; // L: 885
							break;
						case 12:
							worldId = Integer.parseInt(var2); // L: 815
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
							WorldMapSectionType.field2996 = Integer.parseInt(var2); // L: 810
							break; // L: 811
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 826
							break; // L: 827
						case 17:
							class200.field2121 = var2; // L: 875
							break; // L: 876
						case 21:
							field531 = Integer.parseInt(var2); // L: 870
							break; // L: 871
						case 25:
							int var8 = var2.indexOf("."); // L: 847
							if (var8 == -1) { // L: 848
								field708 = Integer.parseInt(var2); // L: 849
							} else {
								field708 = Integer.parseInt(var2.substring(0, var8)); // L: 852
								Integer.parseInt(var2.substring(var8 + 1)); // L: 853
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 892
				isLowDetail = false; // L: 893
				class292.worldHost = this.getCodeBase().getHost(); // L: 895
				class308.field3462 = new class359(); // L: 896
				String var9 = WorldMapLabelSize.field2882.name; // L: 897
				byte var10 = 0; // L: 898
				if ((worldProperties & class510.field5077.rsOrdinal()) != 0) { // L: 899
					class30.field166 = "beta"; // L: 900
				}

				try {
					SecureRandomCallable.method2246("oldschool", class30.field166, var9, var10, 22); // L: 903
				} catch (Exception var11) { // L: 905
					Messages.RunException_sendStackTrace((String)null, var11); // L: 906
				}

				class219.client = this; // L: 908
				RunException.field5267 = clientType; // L: 909
				class18.method288(); // L: 910
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) { // L: 911
					this.field573 = true; // L: 912
				}

				if (field544 == -1) { // L: 914
					if (!this.method1246() && !this.method1428()) { // L: 915
						field544 = 0; // L: 919
					} else {
						field544 = 5; // L: 916
					}
				}

				this.startThread(765, 503, 216, 1); // L: 922
			}
		} catch (RuntimeException var12) {
			throw SecureRandomFuture.newRunException(var12, "client.init(" + ')');
		}
	} // L: 923

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "24"
	)
	static final int method1800(int var0, int var1) {
		if (var0 == -2) { // L: 1017
			return 12345678;
		} else if (var0 == -1) { // L: 1018
			if (var1 < 2) { // L: 1019
				var1 = 2;
			} else if (var1 > 126) { // L: 1020
				var1 = 126;
			}

			return var1; // L: 1021
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1023
			if (var1 < 2) { // L: 1024
				var1 = 2;
			} else if (var1 > 126) { // L: 1025
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1026
		}
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "18"
	)
	static void method1801(int var0, int var1) {
		MenuAction var2 = class9.tempMenuAction; // L: 12089
		if (var2 != null) { // L: 12091
			IgnoreList.method7814(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.field916, var2.field921, var2.field922, var0, var1); // L: 12092
		}

		class9.tempMenuAction = null; // L: 12095
	} // L: 12096
}
