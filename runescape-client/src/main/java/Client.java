import com.jagex.oldscape.pub.OtlTokenRequester;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
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
import org.json.JSONException;
import org.json.JSONObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi {
	@ObfuscatedName("vd")
	@ObfuscatedGetter(
		intValue = -82629945
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vx")
	@ObfuscatedGetter(
		intValue = 1352043351
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("wn")
	@ObfuscatedGetter(
		intValue = -1680619819
	)
	public static int field781;
	@ObfuscatedName("xr")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	static final ApproximateRouteStrategy field786;
	@ObfuscatedName("xm")
	static int[] field787;
	@ObfuscatedName("xn")
	static int[] field788;
	@ObfuscatedName("vr")
	@ObfuscatedGetter(
		intValue = -1563612739
	)
	static int field772;
	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		intValue = -1618425081
	)
	static int field773;
	@ObfuscatedName("uj")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("uk")
	static boolean field731;
	@ObfuscatedName("ub")
	static boolean field673;
	@ObfuscatedName("we")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ww")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("wy")
	@ObfuscatedGetter(
		intValue = -397497277
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("ud")
	static boolean field748;
	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("archive5")
	static class398 archive5;
	@ObfuscatedName("vc")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("tg")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "[Lbs;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("ui")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	static class455 field667;
	@ObfuscatedName("tb")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("vs")
	@ObfuscatedSignature(
		descriptor = "[Lnb;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("vv")
	static short field758;
	@ObfuscatedName("va")
	static short field759;
	@ObfuscatedName("vo")
	static short field620;
	@ObfuscatedName("vk")
	static short field694;
	@ObfuscatedName("vn")
	static short field763;
	@ObfuscatedName("vi")
	@ObfuscatedGetter(
		intValue = -1114517553
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vm")
	static short field572;
	@ObfuscatedName("vp")
	@ObfuscatedGetter(
		intValue = 433849721
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vy")
	@ObfuscatedGetter(
		intValue = 2042096749
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("ue")
	static boolean[] field753;
	@ObfuscatedName("vq")
	static int[] field754;
	@ObfuscatedName("vw")
	static int[] field776;
	@ObfuscatedName("vf")
	static int[] field631;
	@ObfuscatedName("vg")
	static int[] field584;
	@ObfuscatedName("vl")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("ve")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("uc")
	static boolean field747;
	@ObfuscatedName("ws")
	@ObfuscatedGetter(
		intValue = 1240602605
	)
	static int field529;
	@ObfuscatedName("uz")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	static class454 field737;
	@ObfuscatedName("ua")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	static class454 field750;
	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wi")
	@ObfuscatedGetter(
		intValue = -1334952277
	)
	static int field746;
	@ObfuscatedName("wz")
	static List field782;
	@ObfuscatedName("bh")
	static boolean field603;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -453810525
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -205173751
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1274626977
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	static StudioGame field490;
	@ObfuscatedName("ca")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cu")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 976454555
	)
	static int field493;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -749752677
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 838232771
	)
	static int field495;
	@ObfuscatedName("cy")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1931866699
	)
	static int field497;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -1275976559
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("da")
	static boolean field499;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = -1886224337
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		longValue = -2243792022961482123L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -751176573
	)
	static int field502;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = -2076298705
	)
	static int field503;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		longValue = 8511124946921102523L
	)
	static long field604;
	@ObfuscatedName("ej")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = -1496573241
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = 633821975
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 920558921
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 561980131
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = -1178855237
	)
	static int field653;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = 796703205
	)
	static int field511;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = -1775632596
	)
	static int field546;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = 1919998784
	)
	static int field765;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = 1794412864
	)
	static int field704;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ex")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = -627796577
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -1348062367
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		intValue = -95141699
	)
	static int field520;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = -1027638623
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = 572310033
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = -1687986373
	)
	static int field523;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = -858790111
	)
	static int field524;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 1922908789
	)
	static int field525;
	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	static class135 field526;
	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	static class493 field527;
	@ObfuscatedName("hd")
	static final String field537;
	@ObfuscatedName("hb")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("hf")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "[Ldf;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = 265474485
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("iy")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = 606834121
	)
	static int field548;
	@ObfuscatedName("ih")
	static int[] field549;
	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = 1705142349
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ik")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("im")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("it")
	static String field496;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = -215929647
	)
	static int field559;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = 817023789
	)
	static int field725;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 1372828241
	)
	static int field557;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 1233759319
	)
	static int field558;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -2139010133
	)
	static int field621;
	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "[Lif;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("jv")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jh")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("jy")
	static final int[] field563;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = -1795081153
	)
	static int field564;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 40021093
	)
	static int field575;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = 992783339
	)
	static int field583;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = 1155936455
	)
	static int field567;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = 1881503647
	)
	static int field568;
	@ObfuscatedName("ki")
	static boolean field569;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = -1434295667
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = -954734641
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("kf")
	@ObfuscatedGetter(
		intValue = 704283033
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 1977625303
	)
	static int field703;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = 1441154731
	)
	static int field574;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = -1491948821
	)
	static int field579;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = 332197605
	)
	static int field680;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = 986256295
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 394960243
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = -1277774705
	)
	static int field777;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = 1382999863
	)
	static int field728;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = -168443219
	)
	static int field530;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = 1101365113
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = 519949591
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = 1263827259
	)
	public static int field576;
	@ObfuscatedName("ln")
	static boolean field585;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = -1504372859
	)
	static int field618;
	@ObfuscatedName("lz")
	static boolean field756;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = 205350563
	)
	static int field588;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 734988573
	)
	static int field589;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 1025553311
	)
	static int field590;
	@ObfuscatedName("lj")
	static int[] field591;
	@ObfuscatedName("ll")
	static int[] field592;
	@ObfuscatedName("le")
	static int[] field593;
	@ObfuscatedName("lb")
	static int[] field607;
	@ObfuscatedName("lx")
	static int[] field586;
	@ObfuscatedName("lo")
	static int[] field596;
	@ObfuscatedName("lw")
	static int[] field566;
	@ObfuscatedName("lr")
	static String[] field598;
	@ObfuscatedName("mt")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = 2041464667
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -1848743379
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = 318977283
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = -902574261
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = 682495699
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = 206698708
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = -1306273505
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("mx")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = 43311027
	)
	static int field608;
	@ObfuscatedName("mj")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "[Ldv;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -549033243
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = -1811511707
	)
	static int field612;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		longValue = -1749026863537138247L
	)
	static long field613;
	@ObfuscatedName("md")
	static boolean field614;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = -1387790283
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = 216061641
	)
	static int field616;
	@ObfuscatedName("nz")
	static int[] field617;
	@ObfuscatedName("ns")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("nd")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("no")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("nm")
	static int[] field693;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = -1565733637
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "[[[Lnh;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("ng")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("ny")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nu")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nb")
	static boolean field630;
	@ObfuscatedName("nt")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("ne")
	@ObfuscatedGetter(
		intValue = 730065501
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("nk")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("ni")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("nh")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("nq")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("oi")
	static int[] field637;
	@ObfuscatedName("og")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ok")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("ox")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("ov")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ol")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("oz")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = -2086038621
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = -870509993
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = 215597333
	)
	static int field646;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = 1239377975
	)
	static int field647;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -303899309
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("om")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = 145251849
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 616923277
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("oj")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("ob")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = -896157613
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = -1722511035
	)
	static int field595;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = -842617159
	)
	static int field658;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = 395188193
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -365416549
	)
	static int field624;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = -1940722149
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = 324465533
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = 2050107857
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("po")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -1789924433
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = 1902621241
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pq")
	static boolean field672;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = 1084046795
	)
	static int field627;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = -746723443
	)
	static int field674;
	@ObfuscatedName("px")
	static boolean field755;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = 565355253
	)
	static int field676;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = 1136091355
	)
	static int field677;
	@ObfuscatedName("pn")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = -1583613347
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qr")
	static int[] field739;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = -261310919
	)
	static int field513;
	@ObfuscatedName("qj")
	static int[] field719;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = -710491461
	)
	static int field683;
	@ObfuscatedName("qs")
	static int[] field684;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = -744210295
	)
	static int field685;
	@ObfuscatedName("qt")
	static int[] field686;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = 2106773395
	)
	static int field687;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = -620063003
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = -421621503
	)
	static int field689;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = -1685007587
	)
	static int field690;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = -1127640293
	)
	static int field691;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = 2059493293
	)
	static int field692;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = -1835030315
	)
	static int field762;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = -2057735521
	)
	static int field768;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = -440718331
	)
	static int field565;
	@ObfuscatedName("rd")
	@ObfuscatedGetter(
		intValue = -121753353
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	static class506 field697;
	@ObfuscatedName("rq")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	static NodeDeque field699;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	static NodeDeque field700;
	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	static NodeDeque field701;
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = -356793645
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rs")
	@ObfuscatedGetter(
		intValue = 207148199
	)
	static int field659;
	@ObfuscatedName("rf")
	static boolean[] field705;
	@ObfuscatedName("rm")
	static boolean[] field706;
	@ObfuscatedName("rw")
	static boolean[] field651;
	@ObfuscatedName("rh")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("rb")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("ra")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("ri")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = -1928160607
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("rj")
	@ObfuscatedGetter(
		longValue = -3223439394100928671L
	)
	static long field713;
	@ObfuscatedName("ro")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sy")
	static int[] field715;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = -1963411823
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("su")
	@ObfuscatedGetter(
		intValue = -839909513
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("ss")
	static String field718;
	@ObfuscatedName("st")
	static long[] field785;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = 1960529059
	)
	static int field720;
	@ObfuscatedName("sh")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	public static class207 field721;
	@ObfuscatedName("si")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	static class205 field722;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = -1685179677
	)
	static int field487;
	@ObfuscatedName("sk")
	static int[] field724;
	@ObfuscatedName("sz")
	static int[] field556;
	@ObfuscatedName("sc")
	@ObfuscatedGetter(
		longValue = 8736327498043665535L
	)
	static long field726;
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "[Lfj;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("so")
	@ObfuscatedSignature(
		descriptor = "[Lgj;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = -2000567333
	)
	static int field729;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = 1573101195
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tw")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("ty")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("ts")
	@ObfuscatedSignature(
		descriptor = "[Ltq;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = 1494100363
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("th")
	@ObfuscatedGetter(
		intValue = -1748014035
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = 1383336963
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = 1976903761
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("tf")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("tl")
	@ObfuscatedGetter(
		intValue = -297150195
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("tu")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("tr")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("gx")
	String field528;
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	class14 field661;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	class18 field522;
	@ObfuscatedName("hw")
	@Export("otlTokenRequester")
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("hi")
	Future field532;
	@ObfuscatedName("hj")
	boolean field533;
	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	class18 field542;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field551;
	@ObfuscatedName("hx")
	@Export("otlTokenRequest")
	Future otlTokenRequest;
	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	Buffer field541;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	class7 field553;
	@ObfuscatedName("he")
	@ObfuscatedGetter(
		longValue = -7932717541542796365L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field603 = true; // L: 163
		worldId = 1; // L: 164
		worldProperties = 0; // L: 165
		gameBuild = 0; // L: 167
		isMembersWorld = false; // L: 170
		isLowDetail = false; // L: 171
		field493 = -1; // L: 176
		clientType = -1; // L: 177
		field495 = -1; // L: 178
		onMobile = false; // L: 179
		field497 = 213; // L: 180
		gameState = 0; // L: 192
		field499 = true; // L: 216
		cycle = 0; // L: 217
		mouseLastLastPressedTimeMillis = 1L; // L: 218
		field502 = -1; // L: 220
		field503 = -1; // L: 221
		field604 = -1L; // L: 222
		hadFocus = true; // L: 223
		rebootTimer = 0; // L: 224
		hintArrowType = 0; // L: 225
		hintArrowNpcIndex = 0; // L: 226
		hintArrowPlayerIndex = 0; // L: 227
		field653 = 0; // L: 228
		field511 = 0; // L: 229
		field546 = 0; // L: 230
		field765 = 0; // L: 231
		field704 = 0; // L: 232
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 234
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 235
		renderSelf = false; // L: 236
		titleLoadingStage = 0; // L: 245
		js5ConnectState = 0; // L: 248
		field520 = 0; // L: 249
		js5Errors = 0; // L: 272
		loginState = 0; // L: 274
		field523 = 0; // L: 275
		field524 = 0; // L: 276
		field525 = 0; // L: 277
		field526 = class135.field1621; // L: 278
		field527 = class493.field5048; // L: 279
		field537 = WorldMapSectionType.method5427(PlayerComposition.method6083("com_jagex_auth_desktop_osrs:public")); // L: 301
		Login_isUsernameRemembered = false; // L: 312
		secureRandomFuture = new SecureRandomFuture(); // L: 313
		randomDatData = null; // L: 319
		npcs = new NPC[65536]; // L: 323
		npcCount = 0; // L: 324
		npcIndices = new int[65536]; // L: 325
		field548 = 0; // L: 326
		field549 = new int[250]; // L: 327
		packetWriter = new PacketWriter(); // L: 330
		logoutTimer = 0; // L: 332
		hadNetworkError = false; // L: 333
		timer = new Timer(); // L: 334
		fontsMap = new HashMap(); // L: 340
		field559 = 0; // L: 347
		field725 = 1; // L: 348
		field557 = 0; // L: 349
		field558 = 1; // L: 350
		field621 = 0; // L: 351
		collisionMaps = new CollisionMap[4]; // L: 359
		isInInstance = false; // L: 360
		instanceChunkTemplates = new int[4][13][13]; // L: 361
		field563 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 362
		field564 = 0; // L: 365
		field575 = 2301979; // L: 377
		field583 = 5063219; // L: 378
		field567 = 3353893; // L: 379
		field568 = 7759444; // L: 380
		field569 = false; // L: 381
		alternativeScrollbarWidth = 0; // L: 382
		camAngleX = 128; // L: 390
		camAngleY = 0; // L: 391
		field703 = 0; // L: 392
		field574 = 0; // L: 393
		field579 = 0; // L: 394
		field680 = 0; // L: 395
		oculusOrbState = 0; // L: 396
		camFollowHeight = 50; // L: 397
		field777 = 0; // L: 401
		field728 = 0; // L: 402
		field530 = 0; // L: 403
		oculusOrbNormalSpeed = 12; // L: 405
		oculusOrbSlowedSpeed = 6; // L: 406
		field576 = 0; // L: 407
		field585 = false; // L: 408
		field618 = 0; // L: 409
		field756 = false; // L: 410
		field588 = 0; // L: 411
		field589 = 0; // L: 412
		field590 = 50; // L: 413
		field591 = new int[field590]; // L: 414
		field592 = new int[field590]; // L: 415
		field593 = new int[field590]; // L: 416
		field607 = new int[field590]; // L: 417
		field586 = new int[field590]; // L: 418
		field596 = new int[field590]; // L: 419
		field566 = new int[field590]; // L: 420
		field598 = new String[field590]; // L: 421
		tileLastDrawnActor = new int[104][104]; // L: 422
		viewportDrawCount = 0; // L: 423
		viewportTempX = -1; // L: 424
		viewportTempY = -1; // L: 425
		mouseCrossX = 0; // L: 426
		mouseCrossY = 0; // L: 427
		mouseCrossState = 0; // L: 428
		mouseCrossColor = 0; // L: 429
		showMouseCross = true; // L: 430
		field608 = 0; // L: 431
		showLoadingMessages = true; // L: 433
		players = new Player[2048]; // L: 435
		localPlayerIndex = -1; // L: 437
		field612 = 0; // L: 438
		field613 = -1L; // L: 439
		field614 = true; // L: 441
		drawPlayerNames = 0; // L: 446
		field616 = 0; // L: 447
		field617 = new int[1000]; // L: 448
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 450
		playerMenuActions = new String[8]; // L: 451
		playerOptionsPriorities = new boolean[8]; // L: 452
		field693 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 453
		combatTargetPlayerIndex = -1; // L: 454
		groundItems = new NodeDeque[4][104][104]; // L: 455
		pendingSpawns = new NodeDeque(); // L: 456
		projectiles = new NodeDeque(); // L: 457
		graphicsObjects = new NodeDeque(); // L: 458
		currentLevels = new int[25]; // L: 459
		levels = new int[25]; // L: 460
		experience = new int[25]; // L: 461
		field630 = false; // L: 462
		isMenuOpen = false; // L: 463
		menuOptionsCount = 0; // L: 469
		menuArguments1 = new int[500]; // L: 470
		menuArguments2 = new int[500]; // L: 471
		menuOpcodes = new int[500]; // L: 472
		menuIdentifiers = new int[500]; // L: 473
		field637 = new int[500]; // L: 474
		menuActions = new String[500]; // L: 475
		menuTargets = new String[500]; // L: 476
		menuShiftClick = new boolean[500]; // L: 477
		followerOpsLowPriority = false; // L: 478
		tapToDrop = false; // L: 480
		showMouseOverText = true; // L: 481
		viewportX = -1; // L: 482
		viewportY = -1; // L: 483
		field646 = 0; // L: 487
		field647 = 50; // L: 488
		isItemSelected = 0; // L: 489
		field496 = null; // L: 493
		isSpellSelected = false; // L: 494
		selectedSpellChildIndex = -1; // L: 496
		selectedSpellItemId = -1; // L: 497
		selectedSpellActionName = null; // L: 499
		selectedSpellName = null; // L: 500
		rootInterface = -1; // L: 501
		interfaceParents = new NodeHashTable(8); // L: 502
		field595 = 0; // L: 507
		field658 = -1; // L: 508
		chatEffects = 0; // L: 509
		meslayerContinueWidget = null; // L: 510
		field624 = 0; // L: 511
		weight = 0; // L: 512
		staffModLevel = 0; // L: 513
		followerIndex = -1; // L: 514
		playerMod = false; // L: 515
		viewportWidget = null; // L: 516
		clickedWidget = null; // L: 517
		clickedWidgetParent = null; // L: 518
		widgetClickX = 0; // L: 519
		widgetClickY = 0; // L: 520
		draggedOnWidget = null; // L: 521
		field672 = false; // L: 522
		field627 = -1; // L: 523
		field674 = -1; // L: 524
		field755 = false; // L: 525
		field676 = -1; // L: 526
		field677 = -1; // L: 527
		isDraggingWidget = false; // L: 528
		cycleCntr = 1; // L: 533
		field739 = new int[32]; // L: 536
		field513 = 0; // L: 537
		field719 = new int[32]; // L: 538
		field683 = 0; // L: 539
		field684 = new int[32]; // L: 540
		field685 = 0; // L: 541
		field686 = new int[32]; // L: 542
		field687 = 0; // L: 543
		chatCycle = 0; // L: 544
		field689 = 0; // L: 545
		field690 = 0; // L: 546
		field691 = 0; // L: 547
		field692 = 0; // L: 548
		field762 = 0; // L: 549
		field768 = 0; // L: 550
		field565 = 0; // L: 551
		mouseWheelRotation = 0; // L: 557
		field697 = new class506(); // L: 558
		scriptEvents = new NodeDeque(); // L: 559
		field699 = new NodeDeque(); // L: 560
		field700 = new NodeDeque(); // L: 561
		field701 = new NodeDeque(); // L: 562
		widgetFlags = new NodeHashTable(512); // L: 563
		rootWidgetCount = 0; // L: 565
		field659 = -2; // L: 566
		field705 = new boolean[100]; // L: 567
		field706 = new boolean[100]; // L: 568
		field651 = new boolean[100]; // L: 569
		rootWidgetXs = new int[100]; // L: 570
		rootWidgetYs = new int[100]; // L: 571
		rootWidgetWidths = new int[100]; // L: 572
		rootWidgetHeights = new int[100]; // L: 573
		gameDrawingMode = 0; // L: 574
		field713 = 0L; // L: 575
		isResizable = true; // L: 576
		field715 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 583
		publicChatMode = 0; // L: 584
		tradeChatMode = 0; // L: 586
		field718 = ""; // L: 587
		field785 = new long[100]; // L: 589
		field720 = 0; // L: 590
		field721 = new class207(); // L: 591
		field722 = new class205(); // L: 592
		field487 = 0; // L: 594
		field724 = new int[128]; // L: 595
		field556 = new int[128]; // L: 596
		field726 = -1L; // L: 597
		currentClanSettings = new ClanSettings[4]; // L: 601
		currentClanChannels = new ClanChannel[4]; // L: 603
		field729 = -1; // L: 605
		mapIconCount = 0; // L: 606
		mapIconXs = new int[1000]; // L: 607
		mapIconYs = new int[1000]; // L: 608
		mapIcons = new SpritePixels[1000]; // L: 609
		destinationX = 0; // L: 610
		destinationY = 0; // L: 611
		minimapState = 0; // L: 618
		currentTrackGroupId = -1; // L: 619
		playingJingle = false; // L: 620
		soundEffectCount = 0; // L: 626
		soundEffectIds = new int[50]; // L: 627
		queuedSoundEffectLoops = new int[50]; // L: 628
		queuedSoundEffectDelays = new int[50]; // L: 629
		soundLocations = new int[50]; // L: 630
		soundEffects = new SoundEffect[50]; // L: 631
		isCameraLocked = false; // L: 633
		field673 = false; // L: 639
		field747 = false; // L: 640
		field748 = false; // L: 641
		field667 = null; // L: 647
		field750 = null; // L: 648
		field737 = null; // L: 649
		field731 = false; // L: 650
		field753 = new boolean[5]; // L: 658
		field754 = new int[5]; // L: 659
		field776 = new int[5]; // L: 660
		field631 = new int[5]; // L: 661
		field584 = new int[5]; // L: 662
		field758 = 256; // L: 663
		field759 = 205; // L: 664
		zoomHeight = 256; // L: 665
		zoomWidth = 320; // L: 666
		field572 = 1; // L: 667
		field763 = 32767; // L: 668
		field620 = 1; // L: 669
		field694 = 32767; // L: 670
		viewportOffsetX = 0; // L: 671
		viewportOffsetY = 0; // L: 672
		viewportWidth = 0; // L: 673
		viewportHeight = 0; // L: 674
		viewportZoom = 0; // L: 675
		playerAppearance = new PlayerComposition(); // L: 677
		field772 = -1; // L: 678
		field773 = -1; // L: 679
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 681
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 683
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 686
		archive5 = new class398(8, class396.field4532); // L: 688
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 689
		Widget_cachedFonts = new EvictingDualNodeHashTable(64); // L: 690
		field746 = -1; // L: 693
		field781 = -1; // L: 699
		field782 = new ArrayList(); // L: 700
		archiveLoaders = new ArrayList(10); // L: 701
		archiveLoadersDone = 0; // L: 702
		field529 = 0; // L: 703
		field786 = new ApproximateRouteStrategy(); // L: 712
		field787 = new int[50]; // L: 713
		field788 = new int[50]; // L: 714
	}

	public Client() {
		this.field533 = false; // L: 297
		this.accountHash = -1L;
	} // L: 318

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "79"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field713 = class96.method2634() + 500L; // L: 4281
		this.resizeJS(); // L: 4282
		if (rootInterface != -1) { // L: 4283
			this.resizeRoot(true);
		}

	} // L: 4284

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	@Export("setUp")
	protected final void setUp() {
		class134.method3181(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 1025
		FriendsChatManager.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 1026
		class127.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 1027
		ItemContainer.currentPort = FriendsChatManager.worldPort; // L: 1028
		PlayerComposition.field3517 = class315.field3550; // L: 1029
		PlayerComposition.field3507 = class315.field3549; // L: 1030
		WorldMapIcon_0.field2956 = class315.field3551; // L: 1031
		class437.field4707 = class315.field3552; // L: 1032
		class14.urlRequester = new class108(this.field533, 213); // L: 1033
		this.setUpKeyboard(); // L: 1034
		this.method649(); // L: 1035
		class123.mouseWheel = this.mouseWheel(); // L: 1036
		this.method523(field722, 0); // L: 1037
		this.method523(field721, 1); // L: 1038
		WorldMapID.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1039
		class20.clientPreferences = class205.method4204(); // L: 1040
		this.setUpClipboard(); // L: 1041
		String var2 = ReflectionCheck.field269; // L: 1043
		class31.field174 = this; // L: 1045
		if (var2 != null) { // L: 1046
			class31.field175 = var2;
		}

		Decimator.setWindowedMode(class20.clientPreferences.method2471()); // L: 1048
		World.friendSystem = new FriendSystem(class70.loginType); // L: 1049
		this.field661 = new class14("tokenRequest", 1, 1); // L: 1050
	} // L: 1051

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2106306379"
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
					if (class297.musicPlayerStatus == 1) { // L: 1069
						var5 = class475.midiPcmStream.method5867(); // L: 1070
						if (var5 > 0 && class475.midiPcmStream.isReady()) { // L: 1071
							var5 -= class162.pcmSampleLength; // L: 1072
							if (var5 < 0) { // L: 1073
								var5 = 0;
							}

							class475.midiPcmStream.setPcmStreamVolume(var5); // L: 1074
						} else {
							class475.midiPcmStream.clear(); // L: 1077
							class475.midiPcmStream.removeAll(); // L: 1078
							if (class297.musicTrackArchive != null) { // L: 1079
								class297.musicPlayerStatus = 2;
							} else {
								class297.musicPlayerStatus = 0; // L: 1080
							}

							RouteStrategy.musicTrack = null; // L: 1081
							class297.soundCache = null; // L: 1082
						}
					}
				} catch (Exception var8) { // L: 1085
					var8.printStackTrace(); // L: 1086
					class475.midiPcmStream.clear(); // L: 1087
					class297.musicPlayerStatus = 0; // L: 1088
					RouteStrategy.musicTrack = null; // L: 1089
					class297.soundCache = null; // L: 1090
					class297.musicTrackArchive = null; // L: 1091
				}

				class323.playPcmPlayers(); // L: 1094
				field721.method4212(); // L: 1095
				this.method540(); // L: 1096
				synchronized(MouseHandler.KeyHandler_instance) { // L: 1098
					MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 1099
					MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 1100
					MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 1101
					MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 1102
					MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 1103
					MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 1104
					MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 1105
					MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 1106
					MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 1107
				} // L: 1108

				if (class123.mouseWheel != null) { // L: 1110
					var5 = class123.mouseWheel.useRotation(); // L: 1111
					mouseWheelRotation = var5; // L: 1112
				}

				if (gameState == 0) { // L: 1114
					DevicePcmPlayerProvider.load(); // L: 1115
					NPC.method2628(); // L: 1116
				} else if (gameState == 5) { // L: 1118
					EnumComposition.method3752(this, Language.fontPlain11, DecorativeObject.fontPlain12); // L: 1119
					DevicePcmPlayerProvider.load(); // L: 1120
					NPC.method2628(); // L: 1121
				} else if (gameState != 10 && gameState != 11) { // L: 1123
					if (gameState == 20) { // L: 1124
						EnumComposition.method3752(this, Language.fontPlain11, DecorativeObject.fontPlain12); // L: 1125
						this.doCycleLoggedOut(); // L: 1126
					} else if (gameState == 50) { // L: 1128
						EnumComposition.method3752(this, Language.fontPlain11, DecorativeObject.fontPlain12); // L: 1129
						this.doCycleLoggedOut(); // L: 1130
					} else if (gameState == 25) { // L: 1132
						class27.method418();
					}
				} else {
					EnumComposition.method3752(this, Language.fontPlain11, DecorativeObject.fontPlain12);
				}

				if (gameState == 30) { // L: 1133
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) { // L: 1134
					this.doCycleLoggedOut();
				}

				return; // L: 1135
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false); // L: 1064
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "7737"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label175: {
			try {
				if (class297.musicPlayerStatus == 2) { // L: 1142
					if (RouteStrategy.musicTrack == null) { // L: 1143
						RouteStrategy.musicTrack = MusicTrack.readTrack(class297.musicTrackArchive, class379.musicTrackGroupId, VarpDefinition.musicTrackFileId); // L: 1144
						if (RouteStrategy.musicTrack == null) { // L: 1145
							var2 = false; // L: 1146
							break label175;
						}
					}

					if (class297.soundCache == null) { // L: 1150
						class297.soundCache = new SoundCache(class297.soundEffectsArchive, class297.musicSamplesArchive);
					}

					if (class475.midiPcmStream.loadMusicTrack(RouteStrategy.musicTrack, class297.musicPatchesArchive, class297.soundCache, 22050)) { // L: 1151
						class475.midiPcmStream.clearAll(); // L: 1152
						class475.midiPcmStream.setPcmStreamVolume(class100.musicTrackVolume); // L: 1153
						class475.midiPcmStream.setMusicTrack(RouteStrategy.musicTrack, class120.musicTrackBoolean); // L: 1154
						class297.musicPlayerStatus = 0; // L: 1155
						RouteStrategy.musicTrack = null; // L: 1156
						class297.soundCache = null; // L: 1157
						class297.musicTrackArchive = null; // L: 1158
						var2 = true; // L: 1159
						break label175;
					}
				}
			} catch (Exception var6) { // L: 1164
				var6.printStackTrace(); // L: 1165
				class475.midiPcmStream.clear(); // L: 1166
				class297.musicPlayerStatus = 0; // L: 1167
				RouteStrategy.musicTrack = null; // L: 1168
				class297.soundCache = null; // L: 1169
				class297.musicTrackArchive = null; // L: 1170
			}

			var2 = false; // L: 1172
		}

		if (var2 && playingJingle && KeyHandler.pcmPlayer0 != null) { // L: 1175 1176
			KeyHandler.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field713 != 0L && class96.method2634() > field713) { // L: 1178 1179
			Decimator.setWindowedMode(GrandExchangeOfferNameComparator.getWindowedMode()); // L: 1180
		}

		int var4;
		if (var1) { // L: 1183
			for (var4 = 0; var4 < 100; ++var4) { // L: 1184
				field705[var4] = true;
			}
		}

		if (gameState == 0) { // L: 1186
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1187
			class6.drawTitle(class137.fontBold12, Language.fontPlain11, DecorativeObject.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1188
			if (gameState == 20) { // L: 1189
				class6.drawTitle(class137.fontBold12, Language.fontPlain11, DecorativeObject.fontPlain12);
			} else if (gameState == 50) { // L: 1190
				class6.drawTitle(class137.fontBold12, Language.fontPlain11, DecorativeObject.fontPlain12);
			} else if (gameState == 25) { // L: 1191
				if (field621 == 1) { // L: 1192
					if (field559 > field725) { // L: 1193
						field725 = field559;
					}

					var4 = (field725 * 50 - field559 * 50) / field725; // L: 1194
					WorldMapDecoration.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1195
				} else if (field621 == 2) { // L: 1197
					if (field557 > field558) { // L: 1198
						field558 = field557;
					}

					var4 = (field558 * 50 - field557 * 50) / field558 + 50; // L: 1199
					WorldMapDecoration.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1200
				} else {
					WorldMapDecoration.drawLoadingMessage("Loading - please wait.", false); // L: 1202
				}
			} else if (gameState == 30) { // L: 1204
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1205
				WorldMapDecoration.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1206
				WorldMapDecoration.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class6.drawTitle(class137.fontBold12, Language.fontPlain11, DecorativeObject.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1207
			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1208
				if (field706[var4]) { // L: 1209
					RouteStrategy.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]); // L: 1210
					field706[var4] = false; // L: 1211
				}
			}
		} else if (gameState > 0) { // L: 1215
			RouteStrategy.rasterProvider.drawFull(0, 0); // L: 1216

			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1217
				field706[var4] = false;
			}
		}

	} // L: 1219

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-72974483"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class373.varcs.hasUnwrittenChanges()) { // L: 1222
			class373.varcs.write();
		}

		if (UserComparator6.mouseRecorder != null) { // L: 1223
			UserComparator6.mouseRecorder.isRunning = false;
		}

		UserComparator6.mouseRecorder = null; // L: 1224
		packetWriter.close(); // L: 1225
		GraphicsObject.method2025(); // L: 1226
		class123.mouseWheel = null; // L: 1227
		if (KeyHandler.pcmPlayer0 != null) { // L: 1228
			KeyHandler.pcmPlayer0.shutdown();
		}

		if (HorizontalAlignment.pcmPlayer1 != null) { // L: 1229
			HorizontalAlignment.pcmPlayer1.shutdown();
		}

		class295.method5745(); // L: 1230
		class144.method3252(); // L: 1231
		if (class14.urlRequester != null) { // L: 1232
			class14.urlRequester.close(); // L: 1233
			class14.urlRequester = null; // L: 1234
		}

		try {
			JagexCache.JagexCache_dat2File.close(); // L: 1238

			for (int var1 = 0; var1 < JagexCache.idxCount; ++var1) { // L: 1239
				class370.JagexCache_idxFiles[var1].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 1240
			JagexCache.JagexCache_randomDat.close(); // L: 1241
		} catch (Exception var3) { // L: 1243
		}

		this.field661.method181(); // L: 1245
	} // L: 1246

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1086551379"
	)
	protected final void vmethod1452() {
	} // L: 721

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-945273483"
	)
	boolean method1431() {
		return ModeWhere.field4347 != null && !ModeWhere.field4347.trim().isEmpty() && TileItem.field1318 != null && !TileItem.field1318.trim().isEmpty(); // L: 967
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "24"
	)
	boolean method1234() {
		return SpriteMask.field3475 != null && !SpriteMask.field3475.trim().isEmpty() && class121.field1471 != null && !class121.field1471.trim().isEmpty(); // L: 971
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-2"
	)
	@Export("isOtlTokenRequesterInitialized")
	boolean isOtlTokenRequesterInitialized() {
		return this.otlTokenRequester != null; // L: 975
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1706352658"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 979
		var2.put("grant_type", "refresh_token"); // L: 980
		var2.put("scope", "gamesso.token.create"); // L: 981
		var2.put("refresh_token", var1); // L: 982
		URL var3 = new URL(ViewportMouse.field2774 + "shield/oauth/token" + (new class438(var2)).method8348()); // L: 983
		class394 var4 = new class394(); // L: 984
		var4.method7645(field537); // L: 985
		var4.method7627("Host", (new URL(ViewportMouse.field2774)).getHost()); // L: 986
		var4.method7634(class435.field4703); // L: 987
		class9 var5 = class9.field45; // L: 988
		RefreshAccessTokenRequester var6 = this.field551; // L: 989
		if (var6 != null) { // L: 990
			this.otlTokenRequest = var6.request(var5.method71(), var3, var4.method7626(), ""); // L: 991
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field533); // L: 994
			this.field542 = this.field661.method179(var7); // L: 995
		}
	} // L: 992 996

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1446006608"
	)
	void method1638(String var1) throws IOException {
		URL var2 = new URL(ViewportMouse.field2774 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 999
		class394 var3 = new class394(); // L: 1000
		var3.method7631(var1); // L: 1001
		class9 var4 = class9.field39; // L: 1002
		OtlTokenRequester var5 = this.otlTokenRequester; // L: 1003
		if (var5 != null) { // L: 1004
			this.field532 = var5.request(var4.method71(), var2, var3.method7626(), ""); // L: 1005
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field533); // L: 1008
			this.field522 = this.field661.method179(var6); // L: 1009
		}
	} // L: 1006 1010

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1474733588"
	)
	void method1238(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(ViewportMouse.field2774 + "/game-session/v1/tokens"); // L: 1013
		class10 var4 = new class10(var3, class9.field45, this.field533); // L: 1014
		var4.method84().method7631(var1); // L: 1015
		var4.method84().method7634(class435.field4703); // L: 1016
		JSONObject var5 = new JSONObject(); // L: 1017
		var5.put("accountId", var2); // L: 1018
		var4.method97(new class437(var5)); // L: 1019
		this.field522 = this.field661.method179(var4); // L: 1020
	} // L: 1021

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-53"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1294
			boolean var1 = Tile.method4412(); // L: 1295
			if (!var1) { // L: 1296
				this.doCycleJs5Connect();
			}

		}
	} // L: 1297

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-121494842"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1300
			this.error("js5crc"); // L: 1301
			class138.method3208(1000); // L: 1302
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1305
				if (gameState <= 5) { // L: 1306
					this.error("js5io"); // L: 1307
					class138.method3208(1000); // L: 1308
					return; // L: 1309
				}

				field520 = 3000; // L: 1312
				NetCache.NetCache_ioExceptions = 3; // L: 1313
			}

			if (--field520 + 1 <= 0) { // L: 1316
				try {
					if (js5ConnectState == 0) { // L: 1318
						WorldMapSection0.js5SocketTask = GameEngine.taskHandler.newSocketTask(UserComparator8.worldHost, ItemContainer.currentPort); // L: 1319
						++js5ConnectState; // L: 1320
					}

					if (js5ConnectState == 1) { // L: 1322
						if (WorldMapSection0.js5SocketTask.status == 2) { // L: 1323
							this.js5Error(-1); // L: 1324
							return; // L: 1325
						}

						if (WorldMapSection0.js5SocketTask.status == 1) { // L: 1327
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1329
						KitDefinition.js5Socket = class186.method3731((Socket)WorldMapSection0.js5SocketTask.result, 40000, 5000); // L: 1330
						Buffer var1 = new Buffer(5); // L: 1331
						var1.writeByte(15); // L: 1332
						var1.writeInt(213); // L: 1333
						KitDefinition.js5Socket.write(var1.array, 0, 5); // L: 1334
						++js5ConnectState; // L: 1335
						class132.field1580 = class96.method2634(); // L: 1336
					}

					if (js5ConnectState == 3) { // L: 1338
						if (KitDefinition.js5Socket.available() > 0) { // L: 1339
							int var5 = KitDefinition.js5Socket.readUnsignedByte(); // L: 1340
							if (var5 != 0) { // L: 1341
								this.js5Error(var5); // L: 1342
								return; // L: 1343
							}

							++js5ConnectState; // L: 1345
						} else if (class96.method2634() - class132.field1580 > 30000L) { // L: 1348
							this.js5Error(-2); // L: 1349
							return; // L: 1350
						}
					}

					if (js5ConnectState == 4) { // L: 1354
						AbstractSocket var10 = KitDefinition.js5Socket; // L: 1355
						boolean var2 = gameState > 20; // L: 1356
						if (NetCache.NetCache_socket != null) { // L: 1358
							try {
								NetCache.NetCache_socket.close(); // L: 1360
							} catch (Exception var8) { // L: 1362
							}

							NetCache.NetCache_socket = null; // L: 1363
						}

						NetCache.NetCache_socket = var10; // L: 1365
						class177.method3617(var2); // L: 1366
						NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1367
						Script.NetCache_currentResponse = null; // L: 1368
						NetCache.NetCache_responseArchiveBuffer = null; // L: 1369
						NetCache.field4253 = 0; // L: 1370

						while (true) {
							NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 1372
							if (var3 == null) { // L: 1373
								while (true) {
									var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 1379
									if (var3 == null) { // L: 1380
										if (NetCache.field4255 != 0) { // L: 1386
											try {
												Buffer var11 = new Buffer(4); // L: 1388
												var11.writeByte(4); // L: 1389
												var11.writeByte(NetCache.field4255); // L: 1390
												var11.writeShort(0); // L: 1391
												NetCache.NetCache_socket.write(var11.array, 0, 4); // L: 1392
											} catch (IOException var7) {
												try {
													NetCache.NetCache_socket.close(); // L: 1396
												} catch (Exception var6) { // L: 1398
												}

												++NetCache.NetCache_ioExceptions; // L: 1399
												NetCache.NetCache_socket = null; // L: 1400
											}
										}

										NetCache.NetCache_loadTime = 0; // L: 1403
										NetCache.field4259 = class96.method2634(); // L: 1404
										WorldMapSection0.js5SocketTask = null; // L: 1406
										KitDefinition.js5Socket = null; // L: 1407
										js5ConnectState = 0; // L: 1408
										js5Errors = 0; // L: 1409
										return; // L: 1415
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var3); // L: 1381
									NetCache.NetCache_pendingWrites.put(var3, var3.key); // L: 1382
									++NetCache.NetCache_pendingWritesCount; // L: 1383
									--NetCache.NetCache_pendingResponsesCount; // L: 1384
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key); // L: 1374
							++NetCache.NetCache_pendingPriorityWritesCount; // L: 1375
							--NetCache.NetCache_pendingPriorityResponsesCount; // L: 1376
						}
					}
				} catch (IOException var9) { // L: 1412
					this.js5Error(-3); // L: 1413
				}

			}
		}
	} // L: 1303

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-19"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		WorldMapSection0.js5SocketTask = null; // L: 1418
		KitDefinition.js5Socket = null; // L: 1419
		js5ConnectState = 0; // L: 1420
		if (FriendsChatManager.worldPort == ItemContainer.currentPort) { // L: 1421
			ItemContainer.currentPort = class127.js5Port;
		} else {
			ItemContainer.currentPort = FriendsChatManager.worldPort; // L: 1422
		}

		++js5Errors; // L: 1423
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1424
			if (gameState <= 5) { // L: 1425
				this.error("js5connect_full"); // L: 1426
				class138.method3208(1000); // L: 1427
			} else {
				field520 = 3000; // L: 1429
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1431
			this.error("js5connect_outofdate"); // L: 1432
			class138.method3208(1000); // L: 1433
		} else if (js5Errors >= 4) { // L: 1435
			if (gameState <= 5) { // L: 1436
				this.error("js5connect"); // L: 1437
				class138.method3208(1000); // L: 1438
			} else {
				field520 = 3000; // L: 1440
			}
		}

	} // L: 1442

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-564344594"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket(); // L: 1860
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 1861

		try {
			if (loginState == 0) { // L: 1863
				if (class174.secureRandom == null && (secureRandomFuture.isDone() || field523 > 250)) { // L: 1864
					class174.secureRandom = secureRandomFuture.get(); // L: 1865
					secureRandomFuture.shutdown(); // L: 1866
					secureRandomFuture = null; // L: 1867
				}

				if (class174.secureRandom != null) { // L: 1869
					if (var1 != null) { // L: 1870
						var1.close(); // L: 1871
						var1 = null; // L: 1872
					}

					class1.socketTask = null; // L: 1874
					hadNetworkError = false; // L: 1875
					field523 = 0; // L: 1876
					if (field527.method9347()) { // L: 1877
						if (this.method1431()) { // L: 1878
							try {
								this.requestOtlToken(TileItem.field1318); // L: 1880
								class284.method5687(21); // L: 1881
							} catch (Throwable var23) { // L: 1883
								class387.RunException_sendStackTrace((String)null, var23); // L: 1884
								class315.getLoginError(65); // L: 1885
								return; // L: 1886
							}
						} else {
							if (!this.method1234()) { // L: 1889
								class315.getLoginError(65); // L: 1901
								return; // L: 1902
							}

							try {
								this.method1238(SpriteMask.field3475, class121.field1471); // L: 1891
								class284.method5687(20); // L: 1892
							} catch (Exception var22) { // L: 1894
								class387.RunException_sendStackTrace((String)null, var22); // L: 1895
								class315.getLoginError(65); // L: 1896
								return; // L: 1897
							}
						}
					} else {
						class284.method5687(1); // L: 1906
					}
				}
			}

			class20 var25;
			if (loginState == 21) { // L: 1910
				if (this.otlTokenRequest != null) { // L: 1911
					if (!this.otlTokenRequest.isDone()) { // L: 1912
						return; // L: 1913
					}

					if (this.otlTokenRequest.isCancelled()) { // L: 1915
						class315.getLoginError(65); // L: 1916
						this.otlTokenRequest = null; // L: 1917
						return; // L: 1918
					}

					try {
						OtlTokenResponse var3 = (OtlTokenResponse)this.otlTokenRequest.get(); // L: 1921
						if (!var3.isSuccess()) { // L: 1922
							class315.getLoginError(65); // L: 1923
							this.otlTokenRequest = null; // L: 1924
							return; // L: 1925
						}

						ModeWhere.field4347 = var3.getAccessToken(); // L: 1927
						TileItem.field1318 = var3.getRefreshToken(); // L: 1928
						this.otlTokenRequest = null; // L: 1929
					} catch (Exception var21) { // L: 1931
						class387.RunException_sendStackTrace((String)null, var21); // L: 1932
						class315.getLoginError(65); // L: 1933
						this.otlTokenRequest = null; // L: 1934
						return; // L: 1935
					}
				} else {
					if (this.field542 == null) { // L: 1938
						class315.getLoginError(65); // L: 1968
						return; // L: 1969
					}

					if (!this.field542.method269()) { // L: 1939
						return; // L: 1940
					}

					if (this.field542.method266()) { // L: 1942
						class387.RunException_sendStackTrace(this.field542.method268(), (Throwable)null); // L: 1943
						class315.getLoginError(65); // L: 1944
						this.field542 = null; // L: 1945
						return; // L: 1946
					}

					var25 = this.field542.method270(); // L: 1948
					if (var25.method296() != 200) { // L: 1949
						class315.getLoginError(65); // L: 1950
						this.field542 = null; // L: 1951
						return; // L: 1952
					}

					field523 = 0; // L: 1954
					class437 var4 = new class437(var25.method298()); // L: 1955

					try {
						ModeWhere.field4347 = var4.method8332().getString("access_token"); // L: 1957
						TileItem.field1318 = var4.method8332().getString("refresh_token"); // L: 1958
					} catch (Exception var20) { // L: 1960
						class387.RunException_sendStackTrace("Error parsing tokens", var20); // L: 1961
						class315.getLoginError(65); // L: 1962
						this.field542 = null; // L: 1963
						return; // L: 1964
					}
				}

				this.method1638(ModeWhere.field4347); // L: 1971
				class284.method5687(20); // L: 1972
			}

			if (loginState == 20) { // L: 1974
				if (this.field532 != null) { // L: 1975
					if (!this.field532.isDone()) { // L: 1976
						return; // L: 1977
					}

					if (this.field532.isCancelled()) { // L: 1979
						class315.getLoginError(65); // L: 1980
						this.field532 = null; // L: 1981
						return; // L: 1982
					}

					try {
						com.jagex.oldscape.pub.OtlTokenResponse var26 = (com.jagex.oldscape.pub.OtlTokenResponse)this.field532.get(); // L: 1985
						if (!var26.isSuccess()) { // L: 1986
							class315.getLoginError(65); // L: 1987
							this.field532 = null; // L: 1988
							return; // L: 1989
						}

						this.field528 = var26.getToken(); // L: 1991
						this.field532 = null; // L: 1992
					} catch (Exception var19) { // L: 1994
						class387.RunException_sendStackTrace((String)null, var19); // L: 1995
						class315.getLoginError(65); // L: 1996
						this.field532 = null; // L: 1997
						return; // L: 1998
					}
				} else {
					if (this.field522 == null) { // L: 2001
						class315.getLoginError(65); // L: 2037
						return; // L: 2038
					}

					if (!this.field522.method269()) { // L: 2002
						return; // L: 2003
					}

					if (this.field522.method266()) { // L: 2005
						class387.RunException_sendStackTrace(this.field522.method268(), (Throwable)null); // L: 2006
						class315.getLoginError(65); // L: 2007
						this.field522 = null; // L: 2008
						return; // L: 2009
					}

					var25 = this.field522.method270(); // L: 2011
					if (var25.method296() != 200) { // L: 2012
						class387.RunException_sendStackTrace("Response code: " + var25.method296() + "Response body: " + var25.method298(), (Throwable)null); // L: 2013
						class315.getLoginError(65); // L: 2014
						this.field522 = null; // L: 2015
						return; // L: 2016
					}

					List var28 = (List)var25.method297().get("Content-Type"); // L: 2018
					if (var28 != null && var28.contains(class435.field4703.method8319())) { // L: 2019
						try {
							JSONObject var5 = new JSONObject(var25.method298()); // L: 2021
							this.field528 = var5.getString("token"); // L: 2022
						} catch (JSONException var18) { // L: 2024
							class387.RunException_sendStackTrace((String)null, var18); // L: 2025
							class315.getLoginError(65); // L: 2026
							this.field522 = null; // L: 2027
							return; // L: 2028
						}
					} else {
						this.field528 = var25.method298(); // L: 2032
					}

					this.field522 = null; // L: 2034
				}

				field523 = 0; // L: 2040
				class284.method5687(1); // L: 2041
			}

			if (loginState == 1) { // L: 2043
				if (class1.socketTask == null) { // L: 2044
					class1.socketTask = GameEngine.taskHandler.newSocketTask(UserComparator8.worldHost, ItemContainer.currentPort); // L: 2045
				}

				if (class1.socketTask.status == 2) { // L: 2047
					throw new IOException();
				}

				if (class1.socketTask.status == 1) { // L: 2048
					var1 = class186.method3731((Socket)class1.socketTask.result, 40000, 5000); // L: 2049
					packetWriter.setSocket(var1); // L: 2050
					class1.socketTask = null; // L: 2051
					class284.method5687(2); // L: 2052
				}
			}

			PacketBufferNode var27;
			if (loginState == 2) { // L: 2055
				packetWriter.clearBuffer(); // L: 2056
				var27 = class478.method8886(); // L: 2057
				var27.packetBuffer.writeByte(LoginPacket.field3344.id); // L: 2058
				packetWriter.addNode(var27); // L: 2059
				packetWriter.flush(); // L: 2060
				var2.offset = 0; // L: 2061
				class284.method5687(3); // L: 2062
			}

			int var12;
			if (loginState == 3) { // L: 2064
				if (KeyHandler.pcmPlayer0 != null) { // L: 2065
					KeyHandler.pcmPlayer0.method814();
				}

				if (HorizontalAlignment.pcmPlayer1 != null) { // L: 2066
					HorizontalAlignment.pcmPlayer1.method814();
				}

				if (var1.isAvailable(1)) { // L: 2067
					var12 = var1.readUnsignedByte(); // L: 2068
					if (KeyHandler.pcmPlayer0 != null) { // L: 2069
						KeyHandler.pcmPlayer0.method814();
					}

					if (HorizontalAlignment.pcmPlayer1 != null) { // L: 2070
						HorizontalAlignment.pcmPlayer1.method814();
					}

					if (var12 != 0) { // L: 2071
						class315.getLoginError(var12); // L: 2072
						return; // L: 2073
					}

					var2.offset = 0; // L: 2075
					class284.method5687(4); // L: 2076
				}
			}

			if (loginState == 4) { // L: 2079
				if (var2.offset < 8) { // L: 2080
					var12 = var1.available(); // L: 2081
					if (var12 > 8 - var2.offset) { // L: 2082
						var12 = 8 - var2.offset;
					}

					if (var12 > 0) { // L: 2083
						var1.read(var2.array, var2.offset, var12); // L: 2084
						var2.offset += var12; // L: 2085
					}
				}

				if (var2.offset == 8) { // L: 2088
					var2.offset = 0; // L: 2089
					GrandExchangeEvent.field4287 = var2.readLong(); // L: 2090
					class284.method5687(5); // L: 2091
				}
			}

			int var6;
			if (loginState == 5) { // L: 2094
				packetWriter.packetBuffer.offset = 0; // L: 2095
				packetWriter.clearBuffer(); // L: 2096
				PacketBuffer var29 = new PacketBuffer(500); // L: 2097
				int[] var30 = new int[]{class174.secureRandom.nextInt(), class174.secureRandom.nextInt(), class174.secureRandom.nextInt(), class174.secureRandom.nextInt()}; // L: 2098 2099 2100 2101 2102
				var29.offset = 0; // L: 2103
				var29.writeByte(1); // L: 2104
				var29.writeInt(var30[0]); // L: 2105
				var29.writeInt(var30[1]); // L: 2106
				var29.writeInt(var30[2]); // L: 2107
				var29.writeInt(var30[3]); // L: 2108
				var29.writeLong(GrandExchangeEvent.field4287); // L: 2109
				if (gameState == 40) { // L: 2110
					var29.writeInt(Huffman.field3722[0]); // L: 2111
					var29.writeInt(Huffman.field3722[1]); // L: 2112
					var29.writeInt(Huffman.field3722[2]); // L: 2113
					var29.writeInt(Huffman.field3722[3]); // L: 2114
				} else {
					if (gameState == 50) { // L: 2117
						var29.writeByte(class135.field1619.rsOrdinal()); // L: 2118
						var29.writeInt(ByteArrayPool.field4478); // L: 2119
					} else {
						var29.writeByte(field526.rsOrdinal()); // L: 2122
						switch(field526.field1620) { // L: 2123
						case 0:
							var29.offset += 4; // L: 2133
							break; // L: 2134
						case 1:
						case 3:
							var29.writeMedium(class204.field2330); // L: 2127
							++var29.offset; // L: 2128
							break; // L: 2129
						case 2:
							var29.writeInt(class20.clientPreferences.method2474(Login.Login_username)); // L: 2138
						}
					}

					if (field527.method9347()) { // L: 2143
						var29.writeByte(class493.field5044.rsOrdinal()); // L: 2144
						var29.writeStringCp1252NullTerminated(this.field528); // L: 2145
					} else {
						var29.writeByte(class493.field5048.rsOrdinal()); // L: 2148
						var29.writeStringCp1252NullTerminated(Login.Login_password); // L: 2149
					}
				}

				var29.encryptRsa(class70.field885, class70.field887); // L: 2152
				Huffman.field3722 = var30; // L: 2153
				PacketBufferNode var33 = class478.method8886(); // L: 2154
				var33.packetBuffer.offset = 0; // L: 2155
				if (gameState == 40) { // L: 2156
					var33.packetBuffer.writeByte(LoginPacket.field3341.id); // L: 2157
				} else {
					var33.packetBuffer.writeByte(LoginPacket.field3342.id); // L: 2160
				}

				var33.packetBuffer.writeShort(0); // L: 2162
				var6 = var33.packetBuffer.offset; // L: 2163
				var33.packetBuffer.writeInt(213); // L: 2164
				var33.packetBuffer.writeInt(1); // L: 2165
				var33.packetBuffer.writeByte(clientType); // L: 2166
				var33.packetBuffer.writeByte(field495); // L: 2167
				byte var7 = 0; // L: 2168
				var33.packetBuffer.writeByte(var7); // L: 2169
				var33.packetBuffer.writeBytes(var29.array, 0, var29.offset); // L: 2170
				int var8 = var33.packetBuffer.offset; // L: 2171
				var33.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2172
				var33.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2173
				var33.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 2174
				var33.packetBuffer.writeShort(class262.canvasHeight); // L: 2175
				class383.method7541(var33.packetBuffer); // L: 2176
				var33.packetBuffer.writeStringCp1252NullTerminated(class108.field1403); // L: 2177
				var33.packetBuffer.writeInt(TriBool.field4600); // L: 2178
				Buffer var9 = new Buffer(UserComparator10.platformInfo.size()); // L: 2179
				UserComparator10.platformInfo.write(var9); // L: 2180
				var33.packetBuffer.writeBytes(var9.array, 0, var9.array.length); // L: 2181
				var33.packetBuffer.writeByte(clientType); // L: 2182
				var33.packetBuffer.writeInt(0); // L: 2183
				var33.packetBuffer.writeIntME(DevicePcmPlayerProvider.field117.hash); // L: 2184
				var33.packetBuffer.writeIntME(GrandExchangeOfferUnitPriceComparator.archive18.hash); // L: 2185
				var33.packetBuffer.method9043(GrandExchangeOfferTotalQuantityComparator.archive9.hash); // L: 2186
				var33.packetBuffer.method9107(class452.archive8.hash); // L: 2187
				var33.packetBuffer.method9043(class126.archive15.hash); // L: 2188
				var33.packetBuffer.method9107(NetFileRequest.archive10.hash); // L: 2189
				var33.packetBuffer.writeInt(class399.archive6.hash); // L: 2190
				var33.packetBuffer.method9107(class85.archive2.hash); // L: 2191
				var33.packetBuffer.method9107(class85.archive7.hash); // L: 2192
				var33.packetBuffer.method9043(KeyHandler.archive19.hash); // L: 2193
				var33.packetBuffer.method9107(class230.archive14.hash); // L: 2194
				var33.packetBuffer.writeIntME(class128.archive13.hash); // L: 2195
				var33.packetBuffer.writeIntME(WorldMapLabelSize.field2868.hash); // L: 2196
				var33.packetBuffer.method9107(FloorUnderlayDefinition.archive11.hash); // L: 2197
				var33.packetBuffer.method9043(class168.archive17.hash); // L: 2198
				var33.packetBuffer.method9107(class195.field2101.hash); // L: 2199
				var33.packetBuffer.method9107(GameBuild.field3803.hash); // L: 2200
				var33.packetBuffer.writeIntME(class205.archive20.hash); // L: 2201
				var33.packetBuffer.writeIntME(0); // L: 2202
				var33.packetBuffer.method9043(class426.archive4.hash); // L: 2203
				var33.packetBuffer.writeIntME(class126.archive12.hash); // L: 2204
				var33.packetBuffer.xteaEncrypt(var30, var8, var33.packetBuffer.offset); // L: 2205
				var33.packetBuffer.writeLengthShort(var33.packetBuffer.offset - var6); // L: 2206
				packetWriter.addNode(var33); // L: 2207
				packetWriter.flush(); // L: 2208
				packetWriter.isaacCipher = new IsaacCipher(var30); // L: 2209
				int[] var10 = new int[4]; // L: 2210

				for (int var11 = 0; var11 < 4; ++var11) { // L: 2211
					var10[var11] = var30[var11] + 50;
				}

				var2.newIsaacCipher(var10); // L: 2212
				class284.method5687(6); // L: 2213
			}

			int var13;
			if (loginState == 6 && var1.available() > 0) { // L: 2215 2216
				var12 = var1.readUnsignedByte(); // L: 2217
				if (var12 == 61) { // L: 2218
					var13 = var1.available(); // L: 2219
					WorldMapSectionType.field2983 = var13 == 1 && var1.readUnsignedByte() == 1; // L: 2220
					class284.method5687(5); // L: 2221
				}

				if (var12 == 21 && gameState == 20) { // L: 2223
					class284.method5687(12); // L: 2224
				} else if (var12 == 2) { // L: 2226
					class284.method5687(14); // L: 2227
				} else if (var12 == 15 && gameState == 40) { // L: 2229
					packetWriter.serverPacketLength = -1; // L: 2230
					class284.method5687(19); // L: 2231
				} else if (var12 == 64) { // L: 2233
					class284.method5687(10); // L: 2234
				} else if (var12 == 23 && field524 < 1) { // L: 2236
					++field524; // L: 2237
					class284.method5687(0); // L: 2238
				} else if (var12 == 29) { // L: 2240
					class284.method5687(17); // L: 2241
				} else {
					if (var12 != 69) { // L: 2243
						class315.getLoginError(var12); // L: 2247
						return; // L: 2248
					}

					class284.method5687(7); // L: 2244
				}
			}

			if (loginState == 7 && var1.available() >= 2) { // L: 2252 2253
				var1.read(var2.array, 0, 2); // L: 2254
				var2.offset = 0; // L: 2255
				class13.field71 = var2.readUnsignedShort(); // L: 2256
				class284.method5687(8); // L: 2257
			}

			if (loginState == 8 && var1.available() >= class13.field71) { // L: 2260 2261
				var2.offset = 0; // L: 2262
				var1.read(var2.array, var2.offset, class13.field71); // L: 2263
				class6[] var31 = new class6[]{class6.field17}; // L: 2266
				class6 var32 = var31[var2.readUnsignedByte()]; // L: 2268

				try {
					class3 var35 = UserComparator4.method2883(var32); // L: 2270
					this.field553 = new class7(var2, var35); // L: 2271
					class284.method5687(9); // L: 2272
				} catch (Exception var17) { // L: 2274
					class315.getLoginError(22); // L: 2275
					return; // L: 2276
				}
			}

			if (loginState == 9 && this.field553.method58()) { // L: 2280 2281
				this.field541 = this.field553.method50(); // L: 2282
				this.field553.method49(); // L: 2283
				this.field553 = null; // L: 2284
				if (this.field541 == null) { // L: 2285
					class315.getLoginError(22); // L: 2286
					return; // L: 2287
				}

				packetWriter.clearBuffer(); // L: 2289
				var27 = class478.method8886(); // L: 2290
				var27.packetBuffer.writeByte(LoginPacket.field3338.id); // L: 2291
				var27.packetBuffer.writeShort(this.field541.offset); // L: 2292
				var27.packetBuffer.method9050(this.field541); // L: 2293
				packetWriter.addNode(var27); // L: 2294
				packetWriter.flush(); // L: 2295
				this.field541 = null; // L: 2296
				class284.method5687(6); // L: 2297
			}

			if (loginState == 10 && var1.available() > 0) { // L: 2300 2301
				DevicePcmPlayerProvider.field118 = var1.readUnsignedByte(); // L: 2302
				class284.method5687(11); // L: 2303
			}

			if (loginState == 11 && var1.available() >= DevicePcmPlayerProvider.field118) { // L: 2306 2307
				var1.read(var2.array, 0, DevicePcmPlayerProvider.field118); // L: 2308
				var2.offset = 0; // L: 2309
				class284.method5687(6); // L: 2310
			}

			if (loginState == 12 && var1.available() > 0) { // L: 2313 2314
				field525 = (var1.readUnsignedByte() + 3) * 60; // L: 2315
				class284.method5687(13); // L: 2316
			}

			if (loginState == 13) { // L: 2319
				field523 = 0; // L: 2320
				class205.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field525 / 60 + " seconds."); // L: 2321
				if (--field525 <= 0) { // L: 2322
					class284.method5687(0);
				}

			} else {
				if (loginState == 14 && var1.available() >= 1) { // L: 2325 2326
					class7.field27 = var1.readUnsignedByte(); // L: 2327
					class284.method5687(15); // L: 2328
				}

				if (loginState == 15 && var1.available() >= class7.field27) { // L: 2331 2332
					boolean var42 = var1.readUnsignedByte() == 1; // L: 2333
					var1.read(var2.array, 0, 4); // L: 2334
					var2.offset = 0; // L: 2335
					boolean var41 = false; // L: 2336
					if (var42) { // L: 2337
						var13 = var2.readByteIsaac() << 24; // L: 2338
						var13 |= var2.readByteIsaac() << 16; // L: 2339
						var13 |= var2.readByteIsaac() << 8; // L: 2340
						var13 |= var2.readByteIsaac(); // L: 2341
						class20.clientPreferences.method2488(Login.Login_username, var13); // L: 2342
					}

					if (Login_isUsernameRemembered) { // L: 2344
						class20.clientPreferences.method2466(Login.Login_username); // L: 2345
					} else {
						class20.clientPreferences.method2466((String)null); // L: 2348
					}

					class100.savePreferences(); // L: 2350
					staffModLevel = var1.readUnsignedByte(); // L: 2351
					playerMod = var1.readUnsignedByte() == 1; // L: 2352
					localPlayerIndex = var1.readUnsignedByte(); // L: 2353
					localPlayerIndex <<= 8; // L: 2354
					localPlayerIndex += var1.readUnsignedByte(); // L: 2355
					field612 = var1.readUnsignedByte(); // L: 2356
					var1.read(var2.array, 0, 8); // L: 2357
					var2.offset = 0; // L: 2358
					this.accountHash = var2.readLong(); // L: 2359
					if (class7.field27 >= 29) { // L: 2360
						var1.read(var2.array, 0, 8); // L: 2361
						var2.offset = 0; // L: 2362
						field613 = var2.readLong(); // L: 2363
					}

					var1.read(var2.array, 0, 1); // L: 2365
					var2.offset = 0; // L: 2366
					ServerPacket[] var38 = PacketBufferNode.ServerPacket_values(); // L: 2367
					var6 = var2.readSmartByteShortIsaac(); // L: 2368
					if (var6 < 0 || var6 >= var38.length) { // L: 2369
						throw new IOException(var6 + " " + var2.offset);
					}

					packetWriter.serverPacket = var38[var6]; // L: 2370
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2371
					var1.read(var2.array, 0, 2); // L: 2372
					var2.offset = 0; // L: 2373
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2374

					try {
						class26.method393(ScriptFrame.client, "zap"); // L: 2376
					} catch (Throwable var16) { // L: 2378
					}

					class284.method5687(16); // L: 2379
				}

				if (loginState != 16) { // L: 2382
					if (loginState == 17 && var1.available() >= 2) { // L: 2511 2512
						var2.offset = 0; // L: 2513
						var1.read(var2.array, 0, 2); // L: 2514
						var2.offset = 0; // L: 2515
						class4.field12 = var2.readUnsignedShort(); // L: 2516
						class284.method5687(18); // L: 2517
					}

					if (loginState == 18 && var1.available() >= class4.field12) { // L: 2520 2521
						var2.offset = 0; // L: 2522
						var1.read(var2.array, 0, class4.field12); // L: 2523
						var2.offset = 0; // L: 2524
						String var39 = var2.readStringCp1252NullTerminated(); // L: 2525
						String var36 = var2.readStringCp1252NullTerminated(); // L: 2526
						String var40 = var2.readStringCp1252NullTerminated(); // L: 2527
						class205.setLoginResponseString(var39, var36, var40); // L: 2528
						class138.method3208(10); // L: 2529
						if (field527.method9347()) { // L: 2530
							class129.method3124(9); // L: 2531
						}
					}

					if (loginState == 19) { // L: 2535
						if (packetWriter.serverPacketLength == -1) { // L: 2536
							if (var1.available() < 2) { // L: 2537
								return;
							}

							var1.read(var2.array, 0, 2); // L: 2538
							var2.offset = 0; // L: 2539
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2540
						}

						if (var1.available() >= packetWriter.serverPacketLength) { // L: 2542
							var1.read(var2.array, 0, packetWriter.serverPacketLength); // L: 2543
							var2.offset = 0; // L: 2544
							var12 = packetWriter.serverPacketLength; // L: 2545
							timer.method7606(); // L: 2546
							class121.method2993(); // L: 2547
							class422.updatePlayer(var2); // L: 2548
							if (var12 != var2.offset) { // L: 2549
								throw new RuntimeException(); // L: 2550
							}
						}
					} else {
						++field523; // L: 2554
						if (field523 > 2000) { // L: 2555
							if (field524 < 1) { // L: 2556
								if (FriendsChatManager.worldPort == ItemContainer.currentPort) { // L: 2557
									ItemContainer.currentPort = class127.js5Port;
								} else {
									ItemContainer.currentPort = FriendsChatManager.worldPort; // L: 2558
								}

								++field524; // L: 2559
								class284.method5687(0); // L: 2560
							} else {
								class315.getLoginError(-3); // L: 2563
							}
						}
					}
				} else {
					if (var1.available() >= packetWriter.serverPacketLength) { // L: 2383
						var2.offset = 0; // L: 2384
						var1.read(var2.array, 0, packetWriter.serverPacketLength); // L: 2385
						timer.method7604(); // L: 2386
						mouseLastLastPressedTimeMillis = 1L; // L: 2389
						UserComparator6.mouseRecorder.index = 0; // L: 2390
						AbstractByteArrayCopier.hasFocus = true; // L: 2391
						hadFocus = true; // L: 2392
						field726 = -1L; // L: 2393
						class36.reflectionChecks = new IterableNodeDeque(); // L: 2395
						packetWriter.clearBuffer(); // L: 2397
						packetWriter.packetBuffer.offset = 0; // L: 2398
						packetWriter.serverPacket = null; // L: 2399
						packetWriter.field1391 = null; // L: 2400
						packetWriter.field1392 = null; // L: 2401
						packetWriter.field1386 = null; // L: 2402
						packetWriter.serverPacketLength = 0; // L: 2403
						packetWriter.field1389 = 0; // L: 2404
						rebootTimer = 0; // L: 2405
						logoutTimer = 0; // L: 2406
						hintArrowType = 0; // L: 2407
						menuOptionsCount = 0; // L: 2409
						isMenuOpen = false; // L: 2410
						MouseHandler.MouseHandler_idleCycles = 0; // L: 2413
						class162.method3456(); // L: 2415
						isItemSelected = 0; // L: 2416
						isSpellSelected = false; // L: 2417
						soundEffectCount = 0; // L: 2418
						camAngleY = 0; // L: 2419
						oculusOrbState = 0; // L: 2420
						class132.field1585 = null; // L: 2421
						minimapState = 0; // L: 2422
						field729 = -1; // L: 2423
						destinationX = 0; // L: 2424
						destinationY = 0; // L: 2425
						playerAttackOption = AttackOption.AttackOption_hidden; // L: 2426
						npcAttackOption = AttackOption.AttackOption_hidden; // L: 2427
						npcCount = 0; // L: 2428
						Players.Players_count = 0; // L: 2430

						for (var12 = 0; var12 < 2048; ++var12) { // L: 2431
							Players.field1333[var12] = null; // L: 2432
							Players.field1332[var12] = class210.field2389; // L: 2433
						}

						for (var12 = 0; var12 < 2048; ++var12) { // L: 2436
							players[var12] = null;
						}

						for (var12 = 0; var12 < 65536; ++var12) { // L: 2437
							npcs[var12] = null;
						}

						combatTargetPlayerIndex = -1; // L: 2438
						projectiles.clear(); // L: 2439
						graphicsObjects.clear(); // L: 2440

						for (var12 = 0; var12 < 4; ++var12) { // L: 2441
							for (var13 = 0; var13 < 104; ++var13) { // L: 2442
								for (int var15 = 0; var15 < 104; ++var15) { // L: 2443
									groundItems[var12][var13][var15] = null; // L: 2444
								}
							}
						}

						pendingSpawns = new NodeDeque(); // L: 2448
						World.friendSystem.clear(); // L: 2449

						for (var12 = 0; var12 < VarpDefinition.field1908; ++var12) { // L: 2450
							VarpDefinition var34 = GraphicsDefaults.VarpDefinition_get(var12); // L: 2451
							if (var34 != null) { // L: 2452
								Varps.Varps_temp[var12] = 0; // L: 2453
								Varps.Varps_main[var12] = 0; // L: 2454
							}
						}

						class373.varcs.clearTransient(); // L: 2457
						followerIndex = -1; // L: 2458
						if (rootInterface != -1) { // L: 2459
							var12 = rootInterface; // L: 2460
							if (var12 != -1 && class264.Widget_loadedInterfaces[var12]) { // L: 2462 2463
								UserComparator3.Widget_archive.clearFilesGroup(var12); // L: 2464
								if (VerticalAlignment.Widget_interfaceComponents[var12] != null) { // L: 2465
									for (var13 = 0; var13 < VerticalAlignment.Widget_interfaceComponents[var12].length; ++var13) { // L: 2466
										if (VerticalAlignment.Widget_interfaceComponents[var12][var13] != null) { // L: 2467
											VerticalAlignment.Widget_interfaceComponents[var12][var13] = null; // L: 2468
										}
									}

									VerticalAlignment.Widget_interfaceComponents[var12] = null; // L: 2471
									class264.Widget_loadedInterfaces[var12] = false; // L: 2472
								}
							}
						}

						for (InterfaceParent var37 = (InterfaceParent)interfaceParents.first(); var37 != null; var37 = (InterfaceParent)interfaceParents.next()) { // L: 2475
							class357.closeInterface(var37, true); // L: 2476
						}

						rootInterface = -1; // L: 2478
						interfaceParents = new NodeHashTable(8); // L: 2479
						meslayerContinueWidget = null; // L: 2480
						menuOptionsCount = 0; // L: 2482
						isMenuOpen = false; // L: 2483
						playerAppearance.method6038((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1); // L: 2485

						for (var12 = 0; var12 < 8; ++var12) { // L: 2486
							playerMenuActions[var12] = null; // L: 2487
							playerOptionsPriorities[var12] = false; // L: 2488
						}

						ItemContainer.itemContainers = new NodeHashTable(32); // L: 2491
						field499 = true; // L: 2493

						for (var12 = 0; var12 < 100; ++var12) { // L: 2494
							field705[var12] = true;
						}

						class1.method11(); // L: 2495
						UserComparator5.friendsChatManager = null; // L: 2496
						ItemComposition.guestClanSettings = null; // L: 2497
						Arrays.fill(currentClanSettings, (Object)null); // L: 2498
						MouseHandler.guestClanChannel = null; // L: 2499
						Arrays.fill(currentClanChannels, (Object)null); // L: 2500

						for (var12 = 0; var12 < 8; ++var12) { // L: 2501
							grandExchangeOffers[var12] = new GrandExchangeOffer();
						}

						class375.grandExchangeEvents = null; // L: 2502
						class422.updatePlayer(var2); // L: 2504
						KeyHandler.field164 = -1; // L: 2505
						class127.loadRegions(false, var2); // L: 2506
						packetWriter.serverPacket = null; // L: 2507
					}

				}
			}
		} catch (IOException var24) { // L: 2567
			if (field524 < 1) { // L: 2568
				if (FriendsChatManager.worldPort == ItemContainer.currentPort) { // L: 2569
					ItemContainer.currentPort = class127.js5Port;
				} else {
					ItemContainer.currentPort = FriendsChatManager.worldPort; // L: 2570
				}

				++field524; // L: 2571
				class284.method5687(0); // L: 2572
			} else {
				class315.getLoginError(-2); // L: 2575
			}
		}
	} // L: 2323 2509 2552 2561 2564 2573 2576 2578

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-67"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 2837
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 2838
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 2839
			hadNetworkError = false; // L: 2840
			class349.method6839(); // L: 2841
		} else {
			if (!isMenuOpen) { // L: 2844
				class156.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1349(packetWriter); ++var1) { // L: 2845 2846
			}

			if (gameState == 30) { // L: 2848
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 2852
					boolean var30;
					if (var2 == null) { // L: 2853
						var30 = false; // L: 2854
					} else {
						var30 = true; // L: 2857
					}

					int var3;
					PacketBufferNode var31;
					if (!var30) { // L: 2859
						PacketBufferNode var14;
						int var15;
						if (timer.field4483) { // L: 2867
							var14 = class330.getPacketBufferNode(ClientPacket.field3186, packetWriter.isaacCipher); // L: 2869
							var14.packetBuffer.writeByte(0); // L: 2870
							var15 = var14.packetBuffer.offset; // L: 2871
							timer.write(var14.packetBuffer); // L: 2872
							var14.packetBuffer.method9053(var14.packetBuffer.offset - var15); // L: 2873
							packetWriter.addNode(var14); // L: 2874
							timer.method7605(); // L: 2875
						}

						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						int var12;
						PacketBuffer var10000;
						synchronized(UserComparator6.mouseRecorder.lock) { // L: 2878
							if (!field603) { // L: 2879
								UserComparator6.mouseRecorder.index = 0; // L: 2965
							} else if (MouseHandler.MouseHandler_lastButton != 0 || UserComparator6.mouseRecorder.index >= 40) { // L: 2880
								var31 = null; // L: 2882
								var3 = 0; // L: 2883
								var4 = 0; // L: 2884
								var5 = 0; // L: 2885
								var6 = 0; // L: 2886

								for (var7 = 0; var7 < UserComparator6.mouseRecorder.index && (var31 == null || var31.packetBuffer.offset - var3 < 246); ++var7) { // L: 2887 2888
									var4 = var7; // L: 2889
									var8 = UserComparator6.mouseRecorder.ys[var7]; // L: 2890
									if (var8 < -1) { // L: 2891
										var8 = -1;
									} else if (var8 > 65534) { // L: 2892
										var8 = 65534;
									}

									var9 = UserComparator6.mouseRecorder.xs[var7]; // L: 2893
									if (var9 < -1) { // L: 2894
										var9 = -1;
									} else if (var9 > 65534) { // L: 2895
										var9 = 65534;
									}

									if (var9 != field502 || var8 != field503) { // L: 2896
										if (var31 == null) { // L: 2899
											var31 = class330.getPacketBufferNode(ClientPacket.field3193, packetWriter.isaacCipher); // L: 2900
											var31.packetBuffer.writeByte(0); // L: 2901
											var3 = var31.packetBuffer.offset; // L: 2902
											var10000 = var31.packetBuffer; // L: 2903
											var10000.offset += 2;
											var5 = 0; // L: 2904
											var6 = 0; // L: 2905
										}

										if (-1L != field604) { // L: 2910
											var10 = var9 - field502; // L: 2911
											var11 = var8 - field503; // L: 2912
											var12 = (int)((UserComparator6.mouseRecorder.millis[var7] - field604) / 20L); // L: 2913
											var5 = (int)((long)var5 + (UserComparator6.mouseRecorder.millis[var7] - field604) % 20L); // L: 2914
										} else {
											var10 = var9; // L: 2917
											var11 = var8; // L: 2918
											var12 = Integer.MAX_VALUE; // L: 2919
										}

										field502 = var9; // L: 2921
										field503 = var8; // L: 2922
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 2923
											var10 += 32; // L: 2924
											var11 += 32; // L: 2925
											var31.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 2926
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 2928
											var10 += 128; // L: 2929
											var11 += 128; // L: 2930
											var31.packetBuffer.writeByte(var12 + 128); // L: 2931
											var31.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 2932
										} else if (var12 < 32) { // L: 2934
											var31.packetBuffer.writeByte(var12 + 192); // L: 2935
											if (var9 != -1 && var8 != -1) { // L: 2936
												var31.packetBuffer.writeInt(var9 | var8 << 16); // L: 2937
											} else {
												var31.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var31.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 2940
											if (var9 != -1 && var8 != -1) { // L: 2941
												var31.packetBuffer.writeInt(var9 | var8 << 16); // L: 2942
											} else {
												var31.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6; // L: 2944
										field604 = UserComparator6.mouseRecorder.millis[var7]; // L: 2945
									}
								}

								if (var31 != null) { // L: 2947
									var31.packetBuffer.method9053(var31.packetBuffer.offset - var3); // L: 2948
									var7 = var31.packetBuffer.offset; // L: 2949
									var31.packetBuffer.offset = var3; // L: 2950
									var31.packetBuffer.writeByte(var5 / var6); // L: 2951
									var31.packetBuffer.writeByte(var5 % var6); // L: 2952
									var31.packetBuffer.offset = var7; // L: 2953
									packetWriter.addNode(var31); // L: 2954
								}

								if (var4 >= UserComparator6.mouseRecorder.index) { // L: 2956
									UserComparator6.mouseRecorder.index = 0;
								} else {
									MouseRecorder var49 = UserComparator6.mouseRecorder; // L: 2958
									var49.index -= var4;
									System.arraycopy(UserComparator6.mouseRecorder.xs, var4, UserComparator6.mouseRecorder.xs, 0, UserComparator6.mouseRecorder.index); // L: 2959
									System.arraycopy(UserComparator6.mouseRecorder.ys, var4, UserComparator6.mouseRecorder.ys, 0, UserComparator6.mouseRecorder.index); // L: 2960
									System.arraycopy(UserComparator6.mouseRecorder.millis, var4, UserComparator6.mouseRecorder.millis, 0, UserComparator6.mouseRecorder.index); // L: 2961
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !class473.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 2967
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L; // L: 2968
							if (var16 > 32767L) { // L: 2969
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L; // L: 2970
							var3 = MouseHandler.MouseHandler_lastPressedY; // L: 2971
							if (var3 < 0) { // L: 2972
								var3 = 0;
							} else if (var3 > class262.canvasHeight) { // L: 2973
								var3 = class262.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX; // L: 2974
							if (var4 < 0) { // L: 2975
								var4 = 0;
							} else if (var4 > GameEngine.canvasWidth) { // L: 2976
								var4 = GameEngine.canvasWidth;
							}

							var5 = (int)var16; // L: 2977
							var18 = class330.getPacketBufferNode(ClientPacket.field3111, packetWriter.isaacCipher); // L: 2978
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 2979
							var18.packetBuffer.writeShort(var4); // L: 2980
							var18.packetBuffer.writeShort(var3); // L: 2981
							packetWriter.addNode(var18); // L: 2982
						}

						if (field721.field2363 > 0) { // L: 2984
							var14 = class330.getPacketBufferNode(ClientPacket.field3103, packetWriter.isaacCipher); // L: 2985
							var14.packetBuffer.writeShort(0); // L: 2986
							var15 = var14.packetBuffer.offset; // L: 2987
							long var19 = class96.method2634(); // L: 2988

							for (var5 = 0; var5 < field721.field2363; ++var5) { // L: 2989
								long var21 = var19 - field726; // L: 2990
								if (var21 > 16777215L) { // L: 2991
									var21 = 16777215L;
								}

								field726 = var19; // L: 2992
								var14.packetBuffer.method9103((int)var21); // L: 2993
								var14.packetBuffer.writeByte(field721.field2349[var5]); // L: 2994
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15); // L: 2996
							packetWriter.addNode(var14); // L: 2997
						}

						if (field618 > 0) { // L: 2999
							--field618;
						}

						if (field721.method4229(96) || field721.method4229(97) || field721.method4229(98) || field721.method4229(99)) { // L: 3000
							field756 = true; // L: 3001
						}

						if (field756 && field618 <= 0) { // L: 3003
							field618 = 20; // L: 3004
							field756 = false; // L: 3005
							var14 = class330.getPacketBufferNode(ClientPacket.field3175, packetWriter.isaacCipher); // L: 3007
							var14.packetBuffer.writeShort(camAngleY); // L: 3008
							var14.packetBuffer.writeShort(camAngleX); // L: 3009
							packetWriter.addNode(var14); // L: 3010
						}

						if (AbstractByteArrayCopier.hasFocus && !hadFocus) { // L: 3012
							hadFocus = true; // L: 3013
							var14 = class330.getPacketBufferNode(ClientPacket.field3154, packetWriter.isaacCipher); // L: 3015
							var14.packetBuffer.writeByte(1); // L: 3016
							packetWriter.addNode(var14); // L: 3017
						}

						if (!AbstractByteArrayCopier.hasFocus && hadFocus) { // L: 3019
							hadFocus = false; // L: 3020
							var14 = class330.getPacketBufferNode(ClientPacket.field3154, packetWriter.isaacCipher); // L: 3022
							var14.packetBuffer.writeByte(0); // L: 3023
							packetWriter.addNode(var14); // L: 3024
						}

						if (class126.worldMap != null) { // L: 3027
							class126.worldMap.method8471();
						}

						Coord.method6022(); // L: 3028
						WorldMapElement.method3662(); // L: 3029
						UserComparator8.method2896(); // L: 3030
						if (gameState != 30) { // L: 3031
							return;
						}

						for (PendingSpawn var37 = (PendingSpawn)pendingSpawns.last(); var37 != null; var37 = (PendingSpawn)pendingSpawns.previous()) { // L: 3033 3034 3053
							if (var37.hitpoints > 0) { // L: 3035
								--var37.hitpoints;
							}

							if (var37.hitpoints == 0) { // L: 3036
								if (var37.objectId < 0 || class195.method3874(var37.objectId, var37.field1123)) { // L: 3037
									class81.method2248(var37.plane, var37.type, var37.x, var37.y, var37.objectId, var37.field1128, var37.field1123, var37.field1135); // L: 3038
									var37.remove(); // L: 3039
								}
							} else {
								if (var37.delay > 0) { // L: 3043
									--var37.delay;
								}

								if (var37.delay == 0 && var37.x >= 1 && var37.y >= 1 && var37.x <= 102 && var37.y <= 102 && (var37.field1127 < 0 || class195.method3874(var37.field1127, var37.field1124))) { // L: 3044 3045
									class81.method2248(var37.plane, var37.type, var37.x, var37.y, var37.field1127, var37.field1126, var37.field1124, var37.field1135); // L: 3046
									var37.delay = -1; // L: 3047
									if (var37.objectId == var37.field1127 && var37.objectId == -1) { // L: 3048
										var37.remove();
									} else if (var37.objectId == var37.field1127 && var37.field1128 == var37.field1126 && var37.field1124 == var37.field1123) { // L: 3049
										var37.remove();
									}
								}
							}
						}

						int var10002;
						for (var1 = 0; var1 < soundEffectCount; ++var1) { // L: 3057
							var10002 = queuedSoundEffectDelays[var1]--; // L: 3058
							if (queuedSoundEffectDelays[var1] >= -10) { // L: 3059
								SoundEffect var32 = soundEffects[var1]; // L: 3071
								if (var32 == null) { // L: 3072
									var10000 = null; // L: 3073
									var32 = SoundEffect.readSoundEffect(class426.archive4, soundEffectIds[var1], 0);
									if (var32 == null) { // L: 3074
										continue;
									}

									int[] var50 = queuedSoundEffectDelays; // L: 3075
									var50[var1] += var32.calculateDelay();
									soundEffects[var1] = var32; // L: 3076
								}

								if (queuedSoundEffectDelays[var1] < 0) { // L: 3082
									if (soundLocations[var1] != 0) { // L: 3084
										var4 = (soundLocations[var1] & 255) * 128; // L: 3085
										var5 = soundLocations[var1] >> 16 & 255; // L: 3086
										var6 = var5 * 128 + 64 - MusicPatchNode.localPlayer.x; // L: 3087
										if (var6 < 0) { // L: 3088
											var6 = -var6;
										}

										var7 = soundLocations[var1] >> 8 & 255; // L: 3089
										var8 = var7 * 128 + 64 - MusicPatchNode.localPlayer.y; // L: 3090
										if (var8 < 0) { // L: 3091
											var8 = -var8;
										}

										var9 = var6 + var8 - 128; // L: 3092
										if (var9 > var4) { // L: 3093
											queuedSoundEffectDelays[var1] = -100; // L: 3094
											continue; // L: 3095
										}

										if (var9 < 0) { // L: 3097
											var9 = 0;
										}

										var3 = (var4 - var9) * class20.clientPreferences.method2465() / var4; // L: 3098
									} else {
										var3 = class20.clientPreferences.method2463(); // L: 3100
									}

									if (var3 > 0) { // L: 3101
										RawSound var23 = var32.toRawSound().resample(WorldMapSectionType.decimator); // L: 3102
										RawPcmStream var24 = RawPcmStream.createRawPcmStream(var23, 100, var3); // L: 3103
										var24.setNumLoops(queuedSoundEffectLoops[var1] - 1); // L: 3104
										class130.pcmStreamMixer.addSubStream(var24); // L: 3105
									}

									queuedSoundEffectDelays[var1] = -100; // L: 3107
								}
							} else {
								--soundEffectCount; // L: 3060

								for (var15 = var1; var15 < soundEffectCount; ++var15) { // L: 3061
									soundEffectIds[var15] = soundEffectIds[var15 + 1]; // L: 3062
									soundEffects[var15] = soundEffects[var15 + 1]; // L: 3063
									queuedSoundEffectLoops[var15] = queuedSoundEffectLoops[var15 + 1]; // L: 3064
									queuedSoundEffectDelays[var15] = queuedSoundEffectDelays[var15 + 1]; // L: 3065
									soundLocations[var15] = soundLocations[var15 + 1]; // L: 3066
								}

								--var1; // L: 3068
							}
						}

						if (playingJingle && !class4.method18()) { // L: 3110
							if (class20.clientPreferences.method2461() != 0 && currentTrackGroupId != -1) { // L: 3111
								Message.method1201(class399.archive6, currentTrackGroupId, 0, class20.clientPreferences.method2461(), false);
							}

							playingJingle = false; // L: 3112
						}

						++packetWriter.field1389; // L: 3115
						if (packetWriter.field1389 > 750) { // L: 3116
							class349.method6839(); // L: 3117
							return; // L: 3118
						}

						class207.method4244(); // L: 3120
						EnumComposition.method3744(); // L: 3121
						int[] var38 = Players.Players_indices; // L: 3123

						for (var15 = 0; var15 < Players.Players_count; ++var15) { // L: 3124
							Player var25 = players[var38[var15]]; // L: 3125
							if (var25 != null && var25.field1160 > 0) { // L: 3126
								--var25.field1160; // L: 3127
								if (var25.field1160 == 0) { // L: 3128
									var25.field1148 = null;
								}
							}
						}

						for (var15 = 0; var15 < npcCount; ++var15) { // L: 3131
							var3 = npcIndices[var15]; // L: 3132
							NPC var42 = npcs[var3]; // L: 3133
							if (var42 != null && var42.field1160 > 0) { // L: 3134
								--var42.field1160; // L: 3135
								if (var42.field1160 == 0) { // L: 3136
									var42.field1148 = null;
								}
							}
						}

						++field564; // L: 3140
						if (mouseCrossColor != 0) { // L: 3141
							mouseCrossState = mouseCrossState * 400 + 400; // L: 3142
							if (mouseCrossState * 20 >= 400) { // L: 3143
								mouseCrossColor = 0;
							}
						}

						Widget var39 = MidiPcmStream.mousedOverWidgetIf1; // L: 3145
						Widget var33 = class130.field1574; // L: 3146
						MidiPcmStream.mousedOverWidgetIf1 = null; // L: 3147
						class130.field1574 = null; // L: 3148
						draggedOnWidget = null; // L: 3149
						field755 = false; // L: 3150
						field672 = false; // L: 3151
						field487 = 0; // L: 3152

						while (field721.method4215() && field487 < 128) { // L: 3153
							if (staffModLevel >= 2 && field721.method4229(82) && field721.field2362 == 66) { // L: 3154
								StringBuilder var43 = new StringBuilder(); // L: 3157

								Message var40;
								for (Iterator var45 = Messages.Messages_hashTable.iterator(); var45.hasNext(); var43.append(var40.text).append('\n')) { // L: 3158 3164
									var40 = (Message)var45.next(); // L: 3159
									if (var40.sender != null && !var40.sender.isEmpty()) { // L: 3161
										var43.append(var40.sender).append(':'); // L: 3162
									}
								}

								String var48 = var43.toString(); // L: 3167
								ScriptFrame.client.method555(var48); // L: 3170
							} else if (oculusOrbState != 1 || field721.field2361 <= 0) { // L: 3173
								field556[field487] = field721.field2362; // L: 3176
								field724[field487] = field721.field2361; // L: 3177
								++field487; // L: 3178
							}
						}

						boolean var34 = staffModLevel >= 2; // L: 3182
						PacketBufferNode var26;
						if (var34 && field721.method4229(82) && field721.method4229(81) && mouseWheelRotation != 0) { // L: 3184
							var4 = MusicPatchNode.localPlayer.plane - mouseWheelRotation; // L: 3185
							if (var4 < 0) { // L: 3186
								var4 = 0;
							} else if (var4 > 3) { // L: 3187
								var4 = 3;
							}

							if (var4 != MusicPatchNode.localPlayer.plane) { // L: 3188
								var5 = MusicPatchNode.localPlayer.pathX[0] + WorldMapData_0.baseX * 64; // L: 3189
								var6 = MusicPatchNode.localPlayer.pathY[0] + GameObject.baseY * 64; // L: 3190
								var26 = class330.getPacketBufferNode(ClientPacket.field3179, packetWriter.isaacCipher); // L: 3193
								var26.packetBuffer.method9043(0); // L: 3194
								var26.packetBuffer.method9096(var5); // L: 3195
								var26.packetBuffer.method9086(var4); // L: 3196
								var26.packetBuffer.method9257(var6); // L: 3197
								packetWriter.addNode(var26); // L: 3198
							}

							mouseWheelRotation = 0; // L: 3201
						}

						if (MouseHandler.MouseHandler_lastButton == 1) { // L: 3203
							field722.method4181(); // L: 3204
						}

						if (rootInterface != -1) { // L: 3206
							ReflectionCheck.updateRootInterface(rootInterface, 0, 0, GameEngine.canvasWidth, class262.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3207

						while (true) {
							Widget var41;
							ScriptEvent var44;
							Widget var46;
							do {
								var44 = (ScriptEvent)field699.removeLast(); // L: 3209
								if (var44 == null) { // L: 3210
									while (true) {
										do {
											var44 = (ScriptEvent)field700.removeLast(); // L: 3221
											if (var44 == null) { // L: 3222
												while (true) {
													do {
														var44 = (ScriptEvent)scriptEvents.removeLast(); // L: 3233
														if (var44 == null) { // L: 3234
															while (true) {
																class206 var47 = (class206)field701.removeLast(); // L: 3245
																if (var47 == null) { // L: 3246
																	this.menu(); // L: 3249
																	class36.method722(); // L: 3250
																	if (clickedWidget != null) { // L: 3251
																		this.method1259();
																	}

																	if (Scene.shouldSendWalk()) { // L: 3252
																		var4 = Scene.Scene_selectedX; // L: 3253
																		var5 = Scene.Scene_selectedY; // L: 3254
																		var18 = class330.getPacketBufferNode(ClientPacket.field3157, packetWriter.isaacCipher); // L: 3256
																		var18.packetBuffer.writeByte(5); // L: 3257
																		var18.packetBuffer.method9257(GameObject.baseY * 64 + var5); // L: 3258
																		var18.packetBuffer.method9132(WorldMapData_0.baseX * 64 + var4); // L: 3259
																		var18.packetBuffer.method9203(field721.method4229(82) ? (field721.method4229(81) ? 2 : 1) : 0); // L: 3260
																		packetWriter.addNode(var18); // L: 3261
																		Scene.method4562(); // L: 3262
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3263
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3264
																		mouseCrossColor = 1; // L: 3265
																		mouseCrossState = 0; // L: 3266
																		destinationX = var4; // L: 3267
																		destinationY = var5; // L: 3268
																	}

																	if (var39 != MidiPcmStream.mousedOverWidgetIf1) { // L: 3270
																		if (var39 != null) { // L: 3271
																			class144.invalidateWidget(var39);
																		}

																		if (MidiPcmStream.mousedOverWidgetIf1 != null) { // L: 3272
																			class144.invalidateWidget(MidiPcmStream.mousedOverWidgetIf1);
																		}
																	}

																	if (var33 != class130.field1574 && field647 == field646) { // L: 3274
																		if (var33 != null) { // L: 3275
																			class144.invalidateWidget(var33);
																		}

																		if (class130.field1574 != null) { // L: 3276
																			class144.invalidateWidget(class130.field1574);
																		}
																	}

																	if (class130.field1574 != null) { // L: 3278
																		if (field646 < field647) { // L: 3279
																			++field646; // L: 3280
																			if (field646 == field647) { // L: 3281
																				class144.invalidateWidget(class130.field1574);
																			}
																		}
																	} else if (field646 > 0) { // L: 3284
																		--field646;
																	}

																	if (oculusOrbState == 0) { // L: 3286
																		var4 = MusicPatchNode.localPlayer.x; // L: 3287
																		var5 = MusicPatchNode.localPlayer.y; // L: 3288
																		if (class33.oculusOrbFocalPointX - var4 < -500 || class33.oculusOrbFocalPointX - var4 > 500 || class144.oculusOrbFocalPointY - var5 < -500 || class144.oculusOrbFocalPointY - var5 > 500) { // L: 3289
																			class33.oculusOrbFocalPointX = var4; // L: 3290
																			class144.oculusOrbFocalPointY = var5; // L: 3291
																		}

																		if (var4 != class33.oculusOrbFocalPointX) { // L: 3293
																			class33.oculusOrbFocalPointX += (var4 - class33.oculusOrbFocalPointX) / 16;
																		}

																		if (var5 != class144.oculusOrbFocalPointY) { // L: 3294
																			class144.oculusOrbFocalPointY += (var5 - class144.oculusOrbFocalPointY) / 16;
																		}

																		var6 = class33.oculusOrbFocalPointX >> 7; // L: 3295
																		var7 = class144.oculusOrbFocalPointY >> 7; // L: 3296
																		var8 = class147.getTileHeight(class33.oculusOrbFocalPointX, class144.oculusOrbFocalPointY, GameEngine.Client_plane); // L: 3297
																		var9 = 0; // L: 3298
																		if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) { // L: 3299
																			for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) { // L: 3300
																				for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) { // L: 3301
																					var12 = GameEngine.Client_plane; // L: 3302
																					if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) { // L: 3303
																						++var12;
																					}

																					int var27 = var8 - Tiles.Tiles_heights[var12][var10][var11]; // L: 3304
																					if (var27 > var9) { // L: 3305
																						var9 = var27;
																					}
																				}
																			}
																		}

																		var10 = var9 * 192; // L: 3309
																		if (var10 > 98048) { // L: 3310
																			var10 = 98048;
																		}

																		if (var10 < 32768) { // L: 3311
																			var10 = 32768;
																		}

																		if (var10 > field588) { // L: 3312
																			field588 += (var10 - field588) / 24;
																		} else if (var10 < field588) { // L: 3313
																			field588 += (var10 - field588) / 80;
																		}

																		class96.field1296 = class147.getTileHeight(MusicPatchNode.localPlayer.x, MusicPatchNode.localPlayer.y, GameEngine.Client_plane) - camFollowHeight; // L: 3314
																	} else if (oculusOrbState == 1) { // L: 3316
																		class324.method6565(); // L: 3317
																		short var35 = -1; // L: 3318
																		if (field721.method4229(33)) { // L: 3319
																			var35 = 0;
																		} else if (field721.method4229(49)) { // L: 3320
																			var35 = 1024;
																		}

																		if (field721.method4229(48)) { // L: 3321
																			if (var35 == 0) { // L: 3322
																				var35 = 1792;
																			} else if (var35 == 1024) { // L: 3323
																				var35 = 1280;
																			} else {
																				var35 = 1536; // L: 3324
																			}
																		} else if (field721.method4229(50)) { // L: 3326
																			if (var35 == 0) { // L: 3327
																				var35 = 256;
																			} else if (var35 == 1024) { // L: 3328
																				var35 = 768;
																			} else {
																				var35 = 512; // L: 3329
																			}
																		}

																		byte var36 = 0; // L: 3331
																		if (field721.method4229(35)) { // L: 3332
																			var36 = -1;
																		} else if (field721.method4229(51)) { // L: 3333
																			var36 = 1;
																		}

																		var6 = 0; // L: 3334
																		if (var35 >= 0 || var36 != 0) { // L: 3335
																			var6 = field721.method4229(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed; // L: 3336
																			var6 *= 16; // L: 3337
																			field728 = var35; // L: 3338
																			field530 = var36; // L: 3339
																		}

																		if (field777 < var6) { // L: 3341
																			field777 += var6 / 8; // L: 3342
																			if (field777 > var6) { // L: 3343
																				field777 = var6;
																			}
																		} else if (field777 > var6) { // L: 3345
																			field777 = field777 * 9 / 10;
																		}

																		if (field777 > 0) { // L: 3346
																			var7 = field777 / 16; // L: 3347
																			if (field728 >= 0) { // L: 3348
																				var4 = field728 - class125.cameraYaw & 2047; // L: 3349
																				var8 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 3350
																				var9 = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 3351
																				class33.oculusOrbFocalPointX += var7 * var8 / 65536; // L: 3352
																				class144.oculusOrbFocalPointY += var9 * var7 / 65536; // L: 3353
																			}

																			if (field530 != 0) { // L: 3355
																				class96.field1296 += var7 * field530; // L: 3356
																				if (class96.field1296 > 0) { // L: 3357
																					class96.field1296 = 0;
																				}
																			}
																		} else {
																			field728 = -1; // L: 3361
																			field530 = -1; // L: 3362
																		}

																		if (field721.method4229(13)) { // L: 3364
																			Canvas.method332(); // L: 3365
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && class473.mouseCam) { // L: 3368
																		var4 = MouseHandler.MouseHandler_y - field680; // L: 3369
																		field574 = var4 * 2; // L: 3370
																		field680 = var4 != -1 && var4 != 1 ? (field680 + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y; // L: 3371
																		var5 = field579 - MouseHandler.MouseHandler_x; // L: 3372
																		field703 = var5 * 2; // L: 3373
																		field579 = var5 != -1 && var5 != 1 ? (field579 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x; // L: 3374
																	} else {
																		if (field721.method4229(96)) { // L: 3377
																			field703 += (-24 - field703) / 2;
																		} else if (field721.method4229(97)) { // L: 3378
																			field703 += (24 - field703) / 2;
																		} else {
																			field703 /= 2; // L: 3379
																		}

																		if (field721.method4229(98)) { // L: 3380
																			field574 += (12 - field574) / 2;
																		} else if (field721.method4229(99)) { // L: 3381
																			field574 += (-12 - field574) / 2;
																		} else {
																			field574 /= 2; // L: 3382
																		}

																		field680 = MouseHandler.MouseHandler_y; // L: 3383
																		field579 = MouseHandler.MouseHandler_x; // L: 3384
																	}

																	camAngleY = field703 / 2 + camAngleY & 2047; // L: 3386
																	camAngleX += field574 / 2; // L: 3387
																	if (camAngleX < 128) { // L: 3388
																		camAngleX = 128;
																	}

																	if (camAngleX > 383) { // L: 3389
																		camAngleX = 383;
																	}

																	if (field731) { // L: 3391
																		class1.method12();
																	} else if (isCameraLocked) { // L: 3392
																		if (!field673) { // L: 3393
																			var4 = class179.field1902 * 128 + 64; // L: 3394
																			var5 = class123.field1499 * 16384 + 64; // L: 3395
																			var6 = class147.getTileHeight(var4, var5, GameEngine.Client_plane) - class16.field90; // L: 3396
																			class133.method3165(var4, var6, var5); // L: 3397
																		} else if (field667 != null) { // L: 3399
																			class36.cameraX = field667.vmethod8438(); // L: 3400
																			class297.cameraZ = field667.vmethod8433(); // L: 3401
																			if (field748) { // L: 3402
																				class174.cameraY = field667.vmethod8434(); // L: 3403
																			} else {
																				class174.cameraY = class147.getTileHeight(class36.cameraX, class297.cameraZ, GameEngine.Client_plane) - field667.vmethod8434(); // L: 3406
																			}

																			field667.method8441(); // L: 3408
																		}

																		if (!field747) { // L: 3410
																			var4 = FontName.field4884 * 128 + 64; // L: 3411
																			var5 = MilliClock.field1871 * 16384 + 64; // L: 3412
																			var6 = class147.getTileHeight(var4, var5, GameEngine.Client_plane) - ScriptFrame.field469; // L: 3413
																			var7 = var4 - class36.cameraX; // L: 3414
																			var8 = var6 - class174.cameraY; // L: 3415
																			var9 = var5 - class297.cameraZ; // L: 3416
																			var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9)); // L: 3417
																			var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047; // L: 3418
																			var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047; // L: 3419
																			GraphicsObject.method2026(var11, var12); // L: 3420
																		} else {
																			if (field737 != null) { // L: 3423
																				WorldMapSectionType.cameraPitch = field737.method8427(); // L: 3424
																				WorldMapSectionType.cameraPitch = Math.min(Math.max(WorldMapSectionType.cameraPitch, 128), 383); // L: 3425
																				field737.method8441(); // L: 3426
																			}

																			if (field750 != null) { // L: 3428
																				class125.cameraYaw = field750.method8427() & 2047; // L: 3429
																				field750.method8441(); // L: 3430
																			}
																		}
																	}

																	for (var4 = 0; var4 < 5; ++var4) { // L: 3434
																		var10002 = field584[var4]++;
																	}

																	class373.varcs.tryWrite(); // L: 3435
																	var4 = SecureRandomFuture.method2128(); // L: 3436
																	var5 = GameEngine.field216.method354(); // L: 3439
																	if (var4 > 15000 && var5 > 15000) { // L: 3442
																		logoutTimer = 250; // L: 3443
																		MouseHandler.MouseHandler_idleCycles = 14500; // L: 3445
																		var26 = class330.getPacketBufferNode(ClientPacket.field3181, packetWriter.isaacCipher); // L: 3448
																		packetWriter.addNode(var26); // L: 3449
																	}

																	World.friendSystem.processFriendUpdates(); // L: 3451

																	for (var7 = 0; var7 < field782.size(); ++var7) { // L: 3453
																		if (class20.method304((Integer)field782.get(var7)) != 2) { // L: 3454
																			field782.remove(var7); // L: 3455
																			--var7; // L: 3456
																		}
																	}

																	++packetWriter.pendingWrites; // L: 3460
																	if (packetWriter.pendingWrites > 50) { // L: 3461
																		var26 = class330.getPacketBufferNode(ClientPacket.field3188, packetWriter.isaacCipher); // L: 3463
																		packetWriter.addNode(var26); // L: 3464
																	}

																	try {
																		packetWriter.flush(); // L: 3467
																	} catch (IOException var28) { // L: 3469
																		class349.method6839(); // L: 3470
																	}

																	return; // L: 3472
																}

																FriendsList.method7770(var47); // L: 3247
															}
														}

														var46 = var44.widget; // L: 3235
														if (var46.childIndex < 0) { // L: 3236
															break;
														}

														var41 = class165.getWidget(var46.parentId); // L: 3237
													} while(var41 == null || var41.children == null || var46.childIndex >= var41.children.length || var46 != var41.children[var46.childIndex]); // L: 3238

													HealthBarUpdate.runScriptEvent(var44); // L: 3242
												}
											}

											var46 = var44.widget; // L: 3223
											if (var46.childIndex < 0) { // L: 3224
												break;
											}

											var41 = class165.getWidget(var46.parentId); // L: 3225
										} while(var41 == null || var41.children == null || var46.childIndex >= var41.children.length || var46 != var41.children[var46.childIndex]); // L: 3226

										HealthBarUpdate.runScriptEvent(var44); // L: 3230
									}
								}

								var46 = var44.widget; // L: 3211
								if (var46.childIndex < 0) { // L: 3212
									break;
								}

								var41 = class165.getWidget(var46.parentId); // L: 3213
							} while(var41 == null || var41.children == null || var46.childIndex >= var41.children.length || var46 != var41.children[var46.childIndex]); // L: 3214

							HealthBarUpdate.runScriptEvent(var44); // L: 3218
						}
					}

					var31 = class330.getPacketBufferNode(ClientPacket.field3183, packetWriter.isaacCipher); // L: 2860
					var31.packetBuffer.writeByte(0); // L: 2861
					var3 = var31.packetBuffer.offset; // L: 2862
					class432.performReflectionCheck(var31.packetBuffer); // L: 2863
					var31.packetBuffer.method9053(var31.packetBuffer.offset - var3); // L: 2864
					packetWriter.addNode(var31); // L: 2865
				}
			}
		}
	} // L: 2842

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1447416501"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GameEngine.canvasWidth; // L: 4287
		int var2 = class262.canvasHeight; // L: 4288
		if (super.contentWidth < var1) { // L: 4289
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4290
		}

		if (class20.clientPreferences != null) { // L: 4291
			try {
				class26.method394(ScriptFrame.client, "resize", new Object[]{GrandExchangeOfferNameComparator.getWindowedMode()}); // L: 4293
			} catch (Throwable var4) { // L: 4295
			}
		}

	} // L: 4297

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1724186279"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) { // L: 4300
			var1 = rootInterface; // L: 4301
			if (SoundSystem.loadInterface(var1)) { // L: 4303
				TileItem.drawModelComponents(VerticalAlignment.Widget_interfaceComponents[var1], -1); // L: 4304
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4307
			if (field705[var1]) { // L: 4308
				field706[var1] = true;
			}

			field651[var1] = field705[var1]; // L: 4309
			field705[var1] = false; // L: 4310
		}

		field659 = cycle; // L: 4312
		viewportX = -1; // L: 4313
		viewportY = -1; // L: 4314
		if (rootInterface != -1) { // L: 4315
			rootWidgetCount = 0; // L: 4316
			class13.drawWidgets(rootInterface, 0, 0, GameEngine.canvasWidth, class262.canvasHeight, 0, 0, -1); // L: 4317
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4319
		if (showMouseCross) { // L: 4320
			if (mouseCrossColor == 1) { // L: 4321
				class173.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4322
			}

			if (mouseCrossColor == 2) { // L: 4324
				class173.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4325
			}
		}

		if (!isMenuOpen) { // L: 4328
			if (viewportX != -1) { // L: 4329
				class85.method2275(viewportX, viewportY);
			}
		} else {
			var1 = class192.menuX; // L: 4332
			int var2 = ArchiveLoader.menuY; // L: 4333
			int var3 = DesktopPlatformInfoProvider.menuWidth; // L: 4334
			int var4 = class147.menuHeight; // L: 4335
			int var5 = 6116423; // L: 4336
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5); // L: 4337
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0); // L: 4338
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0); // L: 4339
			class137.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1); // L: 4340
			int var6 = MouseHandler.MouseHandler_x; // L: 4341
			int var7 = MouseHandler.MouseHandler_y; // L: 4342

			for (int var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 4343
				int var9 = var2 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 4344
				int var10 = 16777215; // L: 4345
				if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) { // L: 4346
					var10 = 16776960;
				}

				class137.fontBold12.draw(Friend.method7814(var8), var1 + 3, var9, var10, 0); // L: 4347
			}

			FriendsChatManager.method7771(class192.menuX, ArchiveLoader.menuY, DesktopPlatformInfoProvider.menuWidth, class147.menuHeight); // L: 4349
		}

		if (gameDrawingMode == 3) { // L: 4351
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4352
				if (field651[var1]) { // L: 4353
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4354
				} else if (field706[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		class324.method6566(GameEngine.Client_plane, MusicPatchNode.localPlayer.x, MusicPatchNode.localPlayer.y, field564); // L: 4361
		field564 = 0; // L: 4362
	} // L: 4363

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Leq;II)Z",
		garbageValue = "-1339454052"
	)
	boolean method1251(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 6019
			UserComparator5.friendsChatManager = null; // L: 6020
		} else {
			if (UserComparator5.friendsChatManager == null) { // L: 6023
				UserComparator5.friendsChatManager = new FriendsChatManager(class70.loginType, ScriptFrame.client); // L: 6024
			}

			UserComparator5.friendsChatManager.method7776(var1.packetBuffer, var2); // L: 6026
		}

		field690 = cycleCntr; // L: 6029
		GraphicsObject.FriendsChatManager_inFriendsChat = true; // L: 6030
		var1.serverPacket = null; // L: 6032
		return true; // L: 6033
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Leq;B)Z",
		garbageValue = "-11"
	)
	boolean method1252(PacketWriter var1) {
		if (UserComparator5.friendsChatManager != null) { // L: 6037
			UserComparator5.friendsChatManager.method7780(var1.packetBuffer); // L: 6038
		}

		field690 = cycleCntr; // L: 6041
		GraphicsObject.FriendsChatManager_inFriendsChat = true; // L: 6042
		var1.serverPacket = null; // L: 6044
		return true; // L: 6045
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)Z",
		garbageValue = "-1910491091"
	)
	final boolean method1349(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6050
		PacketBuffer var3 = var1.packetBuffer; // L: 6051
		if (var2 == null) { // L: 6052
			return false;
		} else {
			int var6;
			String var31;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6054
					if (var1.field1388) { // L: 6055
						if (!var2.isAvailable(1)) { // L: 6056
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6057
						var1.field1389 = 0; // L: 6058
						var1.field1388 = false; // L: 6059
					}

					var3.offset = 0; // L: 6061
					if (var3.method9021()) { // L: 6062
						if (!var2.isAvailable(1)) { // L: 6063
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6064
						var1.field1389 = 0; // L: 6065
					}

					var1.field1388 = true; // L: 6067
					ServerPacket[] var4 = PacketBufferNode.ServerPacket_values(); // L: 6068
					var5 = var3.readSmartByteShortIsaac(); // L: 6069
					if (var5 < 0 || var5 >= var4.length) { // L: 6070
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6071
					var1.serverPacketLength = var1.serverPacket.length; // L: 6072
				}

				if (var1.serverPacketLength == -1) { // L: 6074
					if (!var2.isAvailable(1)) { // L: 6075
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6076
					var1.serverPacketLength = var3.array[0] & 255; // L: 6077
				}

				if (var1.serverPacketLength == -2) { // L: 6079
					if (!var2.isAvailable(2)) { // L: 6080
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6081
					var3.offset = 0; // L: 6082
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6083
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6085
					return false;
				}

				var3.offset = 0; // L: 6086
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6087
				var1.field1389 = 0; // L: 6088
				timer.method7602(); // L: 6089
				var1.field1386 = var1.field1392; // L: 6090
				var1.field1392 = var1.field1391; // L: 6091
				var1.field1391 = var1.serverPacket; // L: 6092
				int var20;
				if (ServerPacket.field3246 == var1.serverPacket) { // L: 6093
					var20 = var3.readInt(); // L: 6094
					var5 = var3.readInt(); // L: 6095
					var6 = NetCache.getGcDuration(); // L: 6096
					PacketBufferNode var57 = class330.getPacketBufferNode(ClientPacket.field3165, packetWriter.isaacCipher); // L: 6098
					var57.packetBuffer.method9086(GameEngine.fps); // L: 6099
					var57.packetBuffer.method9114(var6); // L: 6100
					var57.packetBuffer.writeIntME(var20); // L: 6101
					var57.packetBuffer.writeIntME(var5); // L: 6102
					packetWriter.addNode(var57); // L: 6103
					var1.serverPacket = null; // L: 6104
					return true; // L: 6105
				}

				long var9;
				int var13;
				long var21;
				long var23;
				String var25;
				boolean var58;
				int var65;
				byte var66;
				if (ServerPacket.field3237 == var1.serverPacket) { // L: 6107
					var66 = var3.readByte(); // L: 6108
					var21 = (long)var3.readUnsignedShort(); // L: 6109
					var23 = (long)var3.readMedium(); // L: 6110
					var9 = var23 + (var21 << 32); // L: 6111
					var58 = false; // L: 6112
					ClanChannel var59 = var66 >= 0 ? currentClanChannels[var66] : MouseHandler.guestClanChannel; // L: 6113
					if (var59 == null) { // L: 6114
						var58 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 6116
							if (field785[var13] == var9) { // L: 6117
								var58 = true; // L: 6118
								break; // L: 6119
							}
						}
					}

					if (!var58) { // L: 6123
						field785[field720] = var9; // L: 6124
						field720 = (field720 + 1) % 100; // L: 6125
						var25 = SceneTilePaint.method4911(var3); // L: 6126
						var65 = var66 >= 0 ? 43 : 46; // L: 6127
						class136.addChatMessage(var65, "", var25, var59.name); // L: 6128
					}

					var1.serverPacket = null; // L: 6130
					return true; // L: 6131
				}

				int var8;
				int var26;
				if (ServerPacket.field3218 == var1.serverPacket) { // L: 6133
					var20 = var3.method9111(); // L: 6134
					var5 = var3.method9112(); // L: 6135
					var6 = var3.method9099(); // L: 6136
					if (var6 == 65535) { // L: 6137
						var6 = -1;
					}

					var26 = var3.method9098(); // L: 6138
					if (var26 == 65535) { // L: 6139
						var26 = -1;
					}

					for (var8 = var26; var8 <= var6; ++var8) { // L: 6140
						var9 = ((long)var20 << 32) + (long)var8; // L: 6141
						Node var69 = widgetFlags.get(var9); // L: 6142
						if (var69 != null) { // L: 6143
							var69.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var9); // L: 6144
					}

					var1.serverPacket = null; // L: 6146
					return true; // L: 6147
				}

				Widget var54;
				if (ServerPacket.field3287 == var1.serverPacket) { // L: 6149
					var20 = var3.method9101(); // L: 6150
					var5 = var3.method9110(); // L: 6151
					var6 = var3.method9219(); // L: 6152
					var54 = class165.getWidget(var5); // L: 6153
					if (var20 != var54.rawX || var6 != var54.rawY || var54.xAlignment != 0 || var54.yAlignment != 0) { // L: 6154
						var54.rawX = var20; // L: 6155
						var54.rawY = var6; // L: 6156
						var54.xAlignment = 0; // L: 6157
						var54.yAlignment = 0; // L: 6158
						class144.invalidateWidget(var54); // L: 6159
						this.alignWidget(var54); // L: 6160
						if (var54.type == 0) { // L: 6161
							DecorativeObject.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[var5 >> 16], var54, false);
						}
					}

					var1.serverPacket = null; // L: 6163
					return true; // L: 6164
				}

				if (ServerPacket.field3308 == var1.serverPacket) { // L: 6166
					var20 = var3.method9089(); // L: 6167
					var5 = var3.method9090(); // L: 6168
					var6 = var3.readInt(); // L: 6169
					var54 = class165.getWidget(var6); // L: 6170
					ChatChannel.method2156(var54, var20, var5); // L: 6171
					class144.invalidateWidget(var54); // L: 6172
					var1.serverPacket = null; // L: 6173
					return true; // L: 6174
				}

				if (ServerPacket.field3286 == var1.serverPacket) { // L: 6176
					var20 = var3.readUnsignedByte(); // L: 6177
					class293.forceDisconnect(var20); // L: 6178
					var1.serverPacket = null; // L: 6179
					return false; // L: 6180
				}

				if (ServerPacket.field3284 == var1.serverPacket) { // L: 6182
					var20 = var3.method9099(); // L: 6183
					var5 = var3.readUnsignedShort(); // L: 6184
					var6 = var3.method9111(); // L: 6185
					var54 = class165.getWidget(var6); // L: 6186
					var54.field3626 = var5 + (var20 << 16); // L: 6187
					var1.serverPacket = null; // L: 6188
					return true; // L: 6189
				}

				NPC var55;
				if (ServerPacket.field3310 == var1.serverPacket) { // L: 6191
					var20 = var3.readUnsignedShort(); // L: 6196
					var55 = npcs[var20]; // L: 6197
					var6 = var3.readUnsignedShort(); // L: 6198
					var5 = var3.readInt(); // L: 6199
					if (var55 != null) { // L: 6200
						var55.method2375(0, var6, var5 >> 16, var5 & 65535); // L: 6201
					}

					var1.serverPacket = null; // L: 6203
					return true; // L: 6204
				}

				if (ServerPacket.field3272 == var1.serverPacket) { // L: 6206
					EnumComposition.method3751(class287.field3208); // L: 6207
					var1.serverPacket = null; // L: 6208
					return true; // L: 6209
				}

				if (ServerPacket.field3329 == var1.serverPacket) { // L: 6211
					var1.serverPacket = null; // L: 6212
					return true; // L: 6213
				}

				NPC var71;
				if (ServerPacket.field3318 == var1.serverPacket) { // L: 6215
					var20 = var3.method9110(); // L: 6216
					var5 = var3.method9098(); // L: 6217
					short var64 = (short)var3.method9219(); // L: 6218
					var26 = var3.method9090(); // L: 6219
					var71 = npcs[var5]; // L: 6220
					if (var71 != null) { // L: 6221
						var71.method2568(var26, var20, var64); // L: 6222
					}

					var1.serverPacket = null; // L: 6224
					return true; // L: 6225
				}

				if (ServerPacket.field3222 == var1.serverPacket) { // L: 6227
					var20 = var3.readUnsignedShort(); // L: 6232
					Player var56;
					if (var20 == localPlayerIndex) { // L: 6233
						var56 = MusicPatchNode.localPlayer; // L: 6234
					} else {
						var56 = players[var20]; // L: 6237
					}

					var5 = var3.readUnsignedShort(); // L: 6239
					var6 = var3.readInt(); // L: 6240
					if (var56 != null) { // L: 6241
						var56.method2375(0, var5, var6 >> 16, var6 & 65535); // L: 6242
					}

					var1.serverPacket = null; // L: 6244
					return true; // L: 6245
				}

				boolean var67;
				String var79;
				if (ServerPacket.field3261 == var1.serverPacket) { // L: 6247
					var20 = var3.readUShortSmart(); // L: 6248
					var67 = var3.readUnsignedByte() == 1; // L: 6249
					var79 = ""; // L: 6250
					boolean var82 = false; // L: 6251
					if (var67) { // L: 6252
						var79 = var3.readStringCp1252NullTerminated(); // L: 6253
						if (World.friendSystem.isIgnored(new Username(var79, class70.loginType))) { // L: 6254
							var82 = true;
						}
					}

					String var74 = var3.readStringCp1252NullTerminated(); // L: 6256
					if (!var82) { // L: 6257
						UserComparator5.addGameMessage(var20, var79, var74);
					}

					var1.serverPacket = null; // L: 6258
					return true; // L: 6259
				}

				Widget var29;
				if (ServerPacket.field3331 == var1.serverPacket) { // L: 6261
					var20 = var3.method9112(); // L: 6262
					var5 = var3.method9112(); // L: 6263
					var29 = class165.getWidget(var20); // L: 6264
					class282.method5683(var29, var5); // L: 6265
					class144.invalidateWidget(var29); // L: 6266
					var1.serverPacket = null; // L: 6267
					return true; // L: 6268
				}

				if (ServerPacket.field3239 == var1.serverPacket) { // L: 6270
					var20 = var3.readInt(); // L: 6271
					var67 = var3.method9039() == 1; // L: 6272
					var29 = class165.getWidget(var20); // L: 6273
					if (var67 != var29.isHidden) { // L: 6274
						var29.isHidden = var67; // L: 6275
						class144.invalidateWidget(var29); // L: 6276
					}

					var1.serverPacket = null; // L: 6278
					return true; // L: 6279
				}

				if (ServerPacket.field3279 == var1.serverPacket) { // L: 6281
					return this.method1252(var1); // L: 6282
				}

				if (ServerPacket.field3303 == var1.serverPacket) { // L: 6284
					EnumComposition.method3751(class287.field3202); // L: 6285
					var1.serverPacket = null; // L: 6286
					return true; // L: 6287
				}

				if (ServerPacket.field3257 == var1.serverPacket) { // L: 6289
					var20 = var3.method9110(); // L: 6290
					var5 = var3.readUnsignedShort(); // L: 6291
					var29 = class165.getWidget(var20); // L: 6292
					if (var29.modelType != 1 || var5 != var29.modelId) { // L: 6293
						var29.modelType = 1; // L: 6294
						var29.modelId = var5; // L: 6295
						class144.invalidateWidget(var29); // L: 6296
					}

					var1.serverPacket = null; // L: 6298
					return true; // L: 6299
				}

				int var10;
				int var30;
				if (ServerPacket.field3328 == var1.serverPacket) { // L: 6301
					isCameraLocked = true; // L: 6302
					field731 = false; // L: 6303
					field673 = true; // L: 6304
					class179.field1902 = var3.readUnsignedByte() * 16384; // L: 6305
					class123.field1499 = var3.readUnsignedByte() * 128; // L: 6306
					var20 = var3.readUnsignedShort(); // L: 6307
					var5 = var3.readUnsignedShort(); // L: 6308
					field748 = var3.readBoolean(); // L: 6309
					var6 = var3.readUnsignedByte(); // L: 6310
					var26 = class179.field1902 * 128 + 64; // L: 6311
					var8 = class123.field1499 * 16384 + 64; // L: 6312
					boolean var87 = false; // L: 6313
					boolean var62 = false; // L: 6314
					if (field748) { // L: 6315
						var30 = class174.cameraY; // L: 6316
						var10 = class147.getTileHeight(var26, var8, GameEngine.Client_plane) - var20; // L: 6317
					} else {
						var30 = class147.getTileHeight(class36.cameraX, class297.cameraZ, GameEngine.Client_plane) - class174.cameraY; // L: 6320
						var10 = var20; // L: 6321
					}

					field667 = new class453(class36.cameraX, class297.cameraZ, var30, var26, var8, var10, var5, var6); // L: 6323
					var1.serverPacket = null; // L: 6324
					return true; // L: 6325
				}

				if (ServerPacket.field3282 == var1.serverPacket) { // L: 6327
					return this.method1251(var1, 2); // L: 6328
				}

				if (ServerPacket.field3336 == var1.serverPacket) { // L: 6330
					FontName.field4882 = var3.method9090(); // L: 6331
					class9.field43 = var3.readUnsignedByte(); // L: 6332

					while (var3.offset < var1.serverPacketLength) { // L: 6333
						var20 = var3.readUnsignedByte(); // L: 6334
						class287 var88 = Varcs.method2720()[var20]; // L: 6335
						EnumComposition.method3751(var88); // L: 6336
					}

					var1.serverPacket = null; // L: 6338
					return true; // L: 6339
				}

				Widget var78;
				if (ServerPacket.field3219 == var1.serverPacket) { // L: 6341
					var20 = var3.method9110(); // L: 6342
					var78 = class165.getWidget(var20); // L: 6343
					var78.modelType = 3; // L: 6344
					var78.modelId = MusicPatchNode.localPlayer.appearance.getChatHeadId(); // L: 6345
					class144.invalidateWidget(var78); // L: 6346
					var1.serverPacket = null; // L: 6347
					return true; // L: 6348
				}

				if (ServerPacket.field3322 == var1.serverPacket) { // L: 6350
					var20 = var3.readUnsignedShort(); // L: 6351
					if (var20 == 65535) { // L: 6352
						var20 = -1;
					}

					rootInterface = var20; // L: 6353
					this.resizeRoot(false); // L: 6354
					class287.Widget_resetModelFrames(var20); // L: 6355
					class12.runWidgetOnLoadListener(rootInterface); // L: 6356

					for (var5 = 0; var5 < 100; ++var5) { // L: 6357
						field705[var5] = true;
					}

					var1.serverPacket = null; // L: 6358
					return true; // L: 6359
				}

				if (ServerPacket.field3307 == var1.serverPacket) { // L: 6361
					World.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 6362
					field689 = cycleCntr; // L: 6363
					var1.serverPacket = null; // L: 6364
					return true; // L: 6365
				}

				if (ServerPacket.field3264 == var1.serverPacket) { // L: 6367
					minimapState = var3.readUnsignedByte(); // L: 6368
					var1.serverPacket = null; // L: 6369
					return true; // L: 6370
				}

				if (ServerPacket.field3226 == var1.serverPacket) { // L: 6372
					EnumComposition.method3751(class287.field3206); // L: 6373
					var1.serverPacket = null; // L: 6374
					return true; // L: 6375
				}

				if (ServerPacket.field3333 == var1.serverPacket) { // L: 6377
					Players.field1339 = null; // L: 6378
					var1.serverPacket = null; // L: 6379
					return true; // L: 6380
				}

				if (ServerPacket.field3256 == var1.serverPacket) { // L: 6382
					EnumComposition.method3751(class287.field3205); // L: 6383
					var1.serverPacket = null; // L: 6384
					return true; // L: 6385
				}

				String var49;
				if (ServerPacket.field3230 == var1.serverPacket) { // L: 6387
					var49 = var3.readStringCp1252NullTerminated(); // L: 6388
					Object[] var86 = new Object[var49.length() + 1]; // L: 6389

					for (var6 = var49.length() - 1; var6 >= 0; --var6) { // L: 6390
						if (var49.charAt(var6) == 's') { // L: 6391
							var86[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var86[var6 + 1] = new Integer(var3.readInt()); // L: 6392
						}
					}

					var86[0] = new Integer(var3.readInt()); // L: 6394
					ScriptEvent var89 = new ScriptEvent(); // L: 6395
					var89.args = var86; // L: 6396
					HealthBarUpdate.runScriptEvent(var89); // L: 6397
					var1.serverPacket = null; // L: 6398
					return true; // L: 6399
				}

				if (ServerPacket.field3304 == var1.serverPacket) { // L: 6401
					GrandExchangeEvents.updatePlayers(var3, var1.serverPacketLength); // L: 6402
					class85.method2276(); // L: 6403
					var1.serverPacket = null; // L: 6404
					return true; // L: 6405
				}

				int var15;
				int var16;
				GameObject var39;
				String var40;
				if (ServerPacket.field3266 == var1.serverPacket) { // L: 6407
					var66 = var3.readByte(); // L: 6408
					var31 = var3.readStringCp1252NullTerminated(); // L: 6409
					long var32 = (long)var3.readUnsignedShort(); // L: 6410
					long var34 = (long)var3.readMedium(); // L: 6411
					PlayerType var91 = (PlayerType)StructComposition.findEnumerated(StudioGame.PlayerType_values(), var3.readUnsignedByte()); // L: 6412
					long var37 = var34 + (var32 << 32); // L: 6413
					boolean var61 = false; // L: 6414
					var39 = null; // L: 6415
					ClanChannel var95 = var66 >= 0 ? currentClanChannels[var66] : MouseHandler.guestClanChannel; // L: 6417
					if (var95 == null) { // L: 6418
						var61 = true; // L: 6419
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var91.isUser && World.friendSystem.isIgnored(new Username(var31, class70.loginType))) { // L: 6428 6429
									var61 = true;
								}
								break;
							}

							if (field785[var15] == var37) { // L: 6423
								var61 = true; // L: 6424
								break; // L: 6425
							}

							++var15; // L: 6422
						}
					}

					if (!var61) { // L: 6432
						field785[field720] = var37; // L: 6433
						field720 = (field720 + 1) % 100; // L: 6434
						var40 = AbstractFont.escapeBrackets(SceneTilePaint.method4911(var3)); // L: 6435
						var16 = var66 >= 0 ? 41 : 44; // L: 6436
						if (var91.modIcon != -1) { // L: 6437
							class136.addChatMessage(var16, ArchiveDiskActionHandler.method6619(var91.modIcon) + var31, var40, var95.name);
						} else {
							class136.addChatMessage(var16, var31, var40, var95.name); // L: 6438
						}
					}

					var1.serverPacket = null; // L: 6440
					return true; // L: 6441
				}

				if (ServerPacket.field3229 == var1.serverPacket) { // L: 6443
					var3.offset += 28; // L: 6444
					if (var3.checkCrc()) { // L: 6445
						UserComparator4.method2868(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 6446
					return true; // L: 6447
				}

				if (ServerPacket.field3260 == var1.serverPacket) { // L: 6449
					class127.loadRegions(false, var1.packetBuffer); // L: 6450
					var1.serverPacket = null; // L: 6451
					return true; // L: 6452
				}

				if (ServerPacket.field3221 == var1.serverPacket) { // L: 6454
					var20 = var3.readUnsignedByte(); // L: 6455
					if (var3.readUnsignedByte() == 0) { // L: 6456
						grandExchangeOffers[var20] = new GrandExchangeOffer(); // L: 6457
						var3.offset += 18; // L: 6458
					} else {
						--var3.offset; // L: 6461
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false); // L: 6462
					}

					field762 = cycleCntr; // L: 6464
					var1.serverPacket = null; // L: 6465
					return true; // L: 6466
				}

				if (ServerPacket.field3275 == var1.serverPacket) { // L: 6468
					var20 = var3.method9102(); // L: 6469
					var5 = var3.method9112(); // L: 6470
					var29 = class165.getWidget(var5); // L: 6471
					if (var20 != var29.sequenceId || var20 == -1) { // L: 6472
						var29.sequenceId = var20; // L: 6473
						var29.modelFrame = 0; // L: 6474
						var29.modelFrameCycle = 0; // L: 6475
						class144.invalidateWidget(var29); // L: 6476
					}

					var1.serverPacket = null; // L: 6478
					return true; // L: 6479
				}

				boolean var68;
				if (ServerPacket.field3330 == var1.serverPacket) { // L: 6481
					var68 = var3.readUnsignedByte() == 1; // L: 6482
					var5 = var3.readInt(); // L: 6483
					var29 = class165.getWidget(var5); // L: 6484
					SecureRandomCallable.method2223(var29, MusicPatchNode.localPlayer.appearance, var68); // L: 6485
					class144.invalidateWidget(var29); // L: 6486
					var1.serverPacket = null; // L: 6487
					return true; // L: 6488
				}

				if (ServerPacket.field3271 == var1.serverPacket) { // L: 6490
					var20 = var3.method9135(); // L: 6491
					var5 = var3.method9112(); // L: 6492
					var6 = var20 >> 10 & 31; // L: 6493
					var26 = var20 >> 5 & 31; // L: 6494
					var8 = var20 & 31; // L: 6495
					var30 = (var26 << 11) + (var6 << 19) + (var8 << 3); // L: 6496
					Widget var90 = class165.getWidget(var5); // L: 6497
					if (var30 != var90.color) { // L: 6498
						var90.color = var30; // L: 6499
						class144.invalidateWidget(var90); // L: 6500
					}

					var1.serverPacket = null; // L: 6502
					return true; // L: 6503
				}

				int var11;
				int var96;
				if (ServerPacket.field3247 == var1.serverPacket) { // L: 6505
					var15 = var3.readUnsignedShort(); // L: 6521
					var65 = var3.method9090() * 4; // L: 6522
					int var18 = var3.method9039(); // L: 6523
					byte var83 = var3.method9092(); // L: 6524
					var13 = var3.method9039() * 4; // L: 6525
					var96 = var3.readUnsignedShort(); // L: 6526
					var16 = var3.method9099(); // L: 6527
					var11 = var3.method9106(); // L: 6528
					int var17 = var3.readUnsignedByte(); // L: 6529
					var6 = var3.method9105(); // L: 6530
					var20 = var6 >> 16; // L: 6531
					var5 = var6 >> 8 & 255; // L: 6532
					var26 = var20 + (var6 >> 4 & 7); // L: 6533
					var8 = var5 + (var6 & 7); // L: 6534
					byte var60 = var3.readByte(); // L: 6535
					var30 = var83 + var26; // L: 6536
					var10 = var60 + var8; // L: 6537
					if (var26 >= 0 && var8 >= 0 && var26 < 104 && var8 < 104 && var30 >= 0 && var10 >= 0 && var30 < 104 && var10 < 104 && var96 != 65535) { // L: 6538
						var26 = var26 * 128 + 64; // L: 6539
						var8 = var8 * 128 + 64; // L: 6540
						var30 = var30 * 128 + 64; // L: 6541
						var10 = var10 * 128 + 64; // L: 6542
						Projectile var19 = new Projectile(var96, GameEngine.Client_plane, var26, var8, class147.getTileHeight(var26, var8, GameEngine.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var65); // L: 6543
						var19.setDestination(var30, var10, class147.getTileHeight(var30, var10, GameEngine.Client_plane) - var65, var15 + cycle); // L: 6544
						projectiles.addFirst(var19); // L: 6545
					}

					var1.serverPacket = null; // L: 6547
					return true; // L: 6548
				}

				if (ServerPacket.field3294 == var1.serverPacket) { // L: 6550
					EnumComposition.method3751(class287.field3199); // L: 6551
					var1.serverPacket = null; // L: 6552
					return true; // L: 6553
				}

				if (ServerPacket.field3325 == var1.serverPacket) { // L: 6555
					World.friendSystem.method1832(); // L: 6556
					field689 = cycleCntr; // L: 6557
					var1.serverPacket = null; // L: 6558
					return true; // L: 6559
				}

				InterfaceParent var7;
				long var42;
				if (ServerPacket.field3324 == var1.serverPacket) { // L: 6561
					var20 = var3.offset + var1.serverPacketLength; // L: 6562
					var5 = var3.readUnsignedShort(); // L: 6563
					if (var5 == 65535) { // L: 6564
						var5 = -1;
					}

					var6 = var3.readUnsignedShort(); // L: 6565
					if (var5 != rootInterface) { // L: 6566
						rootInterface = var5; // L: 6567
						this.resizeRoot(false); // L: 6568
						class287.Widget_resetModelFrames(rootInterface); // L: 6569
						class12.runWidgetOnLoadListener(rootInterface); // L: 6570

						for (var26 = 0; var26 < 100; ++var26) { // L: 6571
							field705[var26] = true;
						}
					}

					InterfaceParent var36;
					for (; var6-- > 0; var36.field1038 = true) { // L: 6573 6583
						var26 = var3.readInt(); // L: 6574
						var8 = var3.readUnsignedShort(); // L: 6575
						var30 = var3.readUnsignedByte(); // L: 6576
						var36 = (InterfaceParent)interfaceParents.get((long)var26); // L: 6577
						if (var36 != null && var8 != var36.group) { // L: 6578
							class357.closeInterface(var36, true); // L: 6579
							var36 = null; // L: 6580
						}

						if (var36 == null) { // L: 6582
							var36 = AttackOption.method2660(var26, var8, var30);
						}
					}

					for (var7 = (InterfaceParent)interfaceParents.first(); var7 != null; var7 = (InterfaceParent)interfaceParents.next()) { // L: 6585
						if (var7.field1038) { // L: 6586
							var7.field1038 = false;
						} else {
							class357.closeInterface(var7, true); // L: 6588
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6591

					while (var3.offset < var20) { // L: 6592
						var26 = var3.readInt(); // L: 6593
						var8 = var3.readUnsignedShort(); // L: 6594
						var30 = var3.readUnsignedShort(); // L: 6595
						var10 = var3.readInt(); // L: 6596

						for (var11 = var8; var11 <= var30; ++var11) { // L: 6597
							var42 = ((long)var26 << 32) + (long)var11; // L: 6598
							widgetFlags.put(new IntegerNode(var10), var42); // L: 6599
						}
					}

					var1.serverPacket = null; // L: 6602
					return true; // L: 6603
				}

				if (ServerPacket.field3288 == var1.serverPacket) { // L: 6605
					var20 = var3.readUnsignedByte(); // L: 6606
					var5 = var3.readUnsignedByte(); // L: 6607
					var6 = var3.readUnsignedByte(); // L: 6608
					var26 = var3.readUnsignedByte(); // L: 6609
					field753[var20] = true; // L: 6610
					field754[var20] = var5; // L: 6611
					field776[var20] = var6; // L: 6612
					field631[var20] = var26; // L: 6613
					field584[var20] = 0; // L: 6614
					var1.serverPacket = null; // L: 6615
					return true; // L: 6616
				}

				if (ServerPacket.field3306 == var1.serverPacket) { // L: 6618
					var20 = var3.method9098(); // L: 6622
					var6 = var3.method9089(); // L: 6623
					var5 = var3.method9098(); // L: 6624
					if (var5 == 65535) { // L: 6625
						var5 = -1; // L: 6626
					}

					var55 = npcs[var20]; // L: 6628
					if (var55 != null) { // L: 6629
						if (var5 == var55.sequence && var5 != -1) { // L: 6630
							var8 = ItemContainer.SequenceDefinition_get(var5).field2314; // L: 6631
							if (var8 == 1) { // L: 6632
								var55.sequenceFrame = 0; // L: 6633
								var55.sequenceFrameCycle = 0; // L: 6634
								var55.sequenceDelay = var6; // L: 6635
								var55.field1184 = 0; // L: 6636
							} else if (var8 == 2) { // L: 6638
								var55.field1184 = 0; // L: 6639
							}
						} else if (var5 == -1 || var55.sequence == -1 || ItemContainer.SequenceDefinition_get(var5).field2293 >= ItemContainer.SequenceDefinition_get(var55.sequence).field2293) { // L: 6642
							var55.sequence = var5; // L: 6643
							var55.sequenceFrame = 0; // L: 6644
							var55.sequenceFrameCycle = 0; // L: 6645
							var55.sequenceDelay = var6; // L: 6646
							var55.field1184 = 0; // L: 6647
							var55.field1210 = var55.pathLength; // L: 6648
						}
					}

					var1.serverPacket = null; // L: 6652
					return true; // L: 6653
				}

				if (ServerPacket.field3290 == var1.serverPacket) { // L: 6655
					UserComparator3.readReflectionCheck(var3, var1.serverPacketLength); // L: 6656
					var1.serverPacket = null; // L: 6657
					return true; // L: 6658
				}

				if (ServerPacket.field3270 == var1.serverPacket) { // L: 6660
					for (var20 = 0; var20 < players.length; ++var20) { // L: 6661
						if (players[var20] != null) { // L: 6662
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) { // L: 6664
						if (npcs[var20] != null) { // L: 6665
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 6667
					return true; // L: 6668
				}

				if (ServerPacket.field3243 == var1.serverPacket) { // L: 6670
					FontName.field4882 = var3.method9039(); // L: 6671
					class9.field43 = var3.method9090(); // L: 6672
					var1.serverPacket = null; // L: 6673
					return true; // L: 6674
				}

				if (ServerPacket.field3238 == var1.serverPacket) { // L: 6676
					EnumComposition.method3751(class287.field3203); // L: 6677
					var1.serverPacket = null; // L: 6678
					return true; // L: 6679
				}

				if (ServerPacket.field3268 == var1.serverPacket) { // L: 6681
					var68 = var3.readBoolean(); // L: 6682
					if (var68) { // L: 6683
						if (class132.field1585 == null) { // L: 6684
							class132.field1585 = new class354();
						}
					} else {
						class132.field1585 = null; // L: 6686
					}

					var1.serverPacket = null; // L: 6687
					return true; // L: 6688
				}

				if (ServerPacket.field3319 == var1.serverPacket) { // L: 6690
					field692 = cycleCntr; // L: 6691
					var66 = var3.readByte(); // L: 6692
					class156 var84 = new class156(var3); // L: 6693
					ClanChannel var85;
					if (var66 >= 0) { // L: 6695
						var85 = currentClanChannels[var66];
					} else {
						var85 = MouseHandler.guestClanChannel; // L: 6696
					}

					var84.method3396(var85); // L: 6697
					var1.serverPacket = null; // L: 6698
					return true; // L: 6699
				}

				if (ServerPacket.field3234 == var1.serverPacket) { // L: 6701
					var20 = var3.readInt(); // L: 6702
					var5 = var3.method9098(); // L: 6703
					Varps.Varps_temp[var5] = var20; // L: 6704
					if (Varps.Varps_main[var5] != var20) { // L: 6705
						Varps.Varps_main[var5] = var20; // L: 6706
					}

					class7.changeGameOptions(var5); // L: 6708
					field739[++field513 - 1 & 31] = var5; // L: 6709
					var1.serverPacket = null; // L: 6710
					return true; // L: 6711
				}

				if (ServerPacket.field3316 == var1.serverPacket) { // L: 6713
					var20 = var3.readInt(); // L: 6714
					var5 = var3.method9039(); // L: 6715
					var29 = class165.getWidget(var20); // L: 6716
					class162.method3452(var29, MusicPatchNode.localPlayer.appearance.field3521, var5); // L: 6717
					class144.invalidateWidget(var29); // L: 6718
					var1.serverPacket = null; // L: 6719
					return true; // L: 6720
				}

				if (ServerPacket.field3321 == var1.serverPacket) { // L: 6722
					field731 = false; // L: 6723
					isCameraLocked = false; // L: 6724
					field673 = false; // L: 6725
					field747 = false; // L: 6726
					FontName.field4884 = 0; // L: 6727
					MilliClock.field1871 = 0; // L: 6728
					ScriptFrame.field469 = 0; // L: 6729
					field748 = false; // L: 6730
					Archive.field4213 = 0; // L: 6731
					WorldMapElement.field1937 = 0; // L: 6732
					class138.field1637 = 0; // L: 6733
					class25.field137 = 0; // L: 6734
					class179.field1902 = 0; // L: 6735
					class123.field1499 = 0; // L: 6736
					class16.field90 = 0; // L: 6737
					field667 = null; // L: 6738
					field737 = null; // L: 6739
					field750 = null; // L: 6740

					for (var20 = 0; var20 < 5; ++var20) { // L: 6741
						field753[var20] = false; // L: 6742
					}

					var1.serverPacket = null; // L: 6744
					return true; // L: 6745
				}

				if (ServerPacket.field3267 == var1.serverPacket) { // L: 6747
					var20 = var3.method9135(); // L: 6748
					if (var20 == 65535) { // L: 6749
						var20 = -1;
					}

					class1.playSong(var20); // L: 6750
					var1.serverPacket = null; // L: 6751
					return true; // L: 6752
				}

				if (ServerPacket.field3297 == var1.serverPacket) { // L: 6754
					var20 = var3.readMedium(); // L: 6755
					var5 = var3.method9135(); // L: 6756
					if (var5 == 65535) { // L: 6757
						var5 = -1;
					}

					CollisionMap.method4272(var5, var20); // L: 6758
					var1.serverPacket = null; // L: 6759
					return true; // L: 6760
				}

				if (ServerPacket.field3314 == var1.serverPacket) { // L: 6762
					var20 = var3.method9112(); // L: 6763
					var5 = var3.method9110(); // L: 6764
					var6 = var3.method9099(); // L: 6765
					if (var6 == 65535) { // L: 6766
						var6 = -1;
					}

					var54 = class165.getWidget(var20); // L: 6767
					ItemComposition var72;
					if (!var54.isIf3) { // L: 6768
						if (var6 == -1) { // L: 6769
							var54.modelType = 0; // L: 6770
							var1.serverPacket = null; // L: 6771
							return true; // L: 6772
						}

						var72 = HealthBarUpdate.ItemComposition_get(var6); // L: 6774
						var54.modelType = 4; // L: 6775
						var54.modelId = var6; // L: 6776
						var54.modelAngleX = var72.xan2d; // L: 6777
						var54.modelAngleY = var72.yan2d; // L: 6778
						var54.modelZoom = var72.zoom2d * 100 / var5; // L: 6779
						class144.invalidateWidget(var54); // L: 6780
					} else {
						var54.itemId = var6; // L: 6783
						var54.itemQuantity = var5; // L: 6784
						var72 = HealthBarUpdate.ItemComposition_get(var6); // L: 6785
						var54.modelAngleX = var72.xan2d; // L: 6786
						var54.modelAngleY = var72.yan2d; // L: 6787
						var54.modelAngleZ = var72.zan2d; // L: 6788
						var54.modelOffsetX = var72.offsetX2d; // L: 6789
						var54.modelOffsetY = var72.offsetY2d; // L: 6790
						var54.modelZoom = var72.zoom2d; // L: 6791
						if (var72.isStackable == 1) { // L: 6792
							var54.itemQuantityMode = 1;
						} else {
							var54.itemQuantityMode = 2; // L: 6793
						}

						if (var54.field3625 > 0) { // L: 6794
							var54.modelZoom = var54.modelZoom * 32 / var54.field3625;
						} else if (var54.rawWidth > 0) { // L: 6795
							var54.modelZoom = var54.modelZoom * 32 / var54.rawWidth;
						}

						class144.invalidateWidget(var54); // L: 6796
					}

					var1.serverPacket = null; // L: 6798
					return true; // L: 6799
				}

				boolean var41;
				if (ServerPacket.field3269 == var1.serverPacket) { // L: 6801
					isCameraLocked = true; // L: 6802
					field731 = false; // L: 6803
					field673 = true; // L: 6804
					class179.field1902 = var3.readUnsignedByte() * 16384; // L: 6805
					class123.field1499 = var3.readUnsignedByte() * 128; // L: 6806
					var20 = var3.readUnsignedShort(); // L: 6807
					var5 = var3.readUnsignedByte() * 128 + 64; // L: 6808
					var6 = var3.readUnsignedByte() * 128 + 64; // L: 6809
					var26 = var3.readUnsignedShort(); // L: 6810
					field748 = var3.readBoolean(); // L: 6811
					var8 = var3.readUnsignedByte(); // L: 6812
					var30 = class179.field1902 * 128 + 64; // L: 6813
					var10 = class123.field1499 * 16384 + 64; // L: 6814
					var58 = false; // L: 6815
					var41 = false; // L: 6816
					if (field748) { // L: 6817
						var11 = class174.cameraY; // L: 6818
						var96 = class147.getTileHeight(var30, var10, GameEngine.Client_plane) - var20; // L: 6819
					} else {
						var11 = class147.getTileHeight(class36.cameraX, class297.cameraZ, GameEngine.Client_plane) - class174.cameraY; // L: 6822
						var96 = var20; // L: 6823
					}

					field667 = new class452(class36.cameraX, class297.cameraZ, var11, var30, var10, var96, var5, var6, var26, var8); // L: 6825
					var1.serverPacket = null; // L: 6826
					return true; // L: 6827
				}

				if (ServerPacket.field3300 == var1.serverPacket) { // L: 6829
					if (rootInterface != -1) { // L: 6830
						class127.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6831
					return true; // L: 6832
				}

				if (ServerPacket.field3292 == var1.serverPacket && isCameraLocked) { // L: 6834 6835
					field731 = true; // L: 6836
					field747 = false; // L: 6837
					field673 = false; // L: 6838

					for (var20 = 0; var20 < 5; ++var20) { // L: 6839
						field753[var20] = false; // L: 6840
					}

					var1.serverPacket = null; // L: 6842
					return true; // L: 6843
				}

				if (ServerPacket.field3242 == var1.serverPacket) { // L: 6846
					destinationX = var3.readUnsignedByte(); // L: 6847
					if (destinationX == 255) { // L: 6848
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6849
					if (destinationY == 255) { // L: 6850
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6851
					return true; // L: 6852
				}

				if (ServerPacket.field3293 == var1.serverPacket) { // L: 6854
					isCameraLocked = true; // L: 6855
					field731 = false; // L: 6856
					field747 = true; // L: 6857
					var20 = var3.readShort(); // L: 6858
					var5 = var3.readShort(); // L: 6859
					var6 = class18.method290(var5 + WorldMapSectionType.cameraPitch & 2027); // L: 6860
					var26 = var20 + class125.cameraYaw; // L: 6861
					var8 = var3.readUnsignedShort(); // L: 6862
					var30 = var3.readUnsignedByte(); // L: 6863
					field737 = new class454(WorldMapSectionType.cameraPitch, var6, var8, var30); // L: 6864
					field750 = new class454(class125.cameraYaw, var26, var8, var30); // L: 6865
					var1.serverPacket = null; // L: 6866
					return true; // L: 6867
				}

				if (ServerPacket.field3228 == var1.serverPacket) { // L: 6869
					Players.field1339 = new class429(MenuAction.Ignored_cached); // L: 6870
					var1.serverPacket = null; // L: 6871
					return true; // L: 6872
				}

				if (ServerPacket.field3277 == var1.serverPacket) { // L: 6874
					byte[] var53 = new byte[var1.serverPacketLength]; // L: 6875
					var3.method9003(var53, 0, var53.length); // L: 6876
					Buffer var81 = new Buffer(var53); // L: 6877
					var79 = var81.readStringCp1252NullTerminated(); // L: 6878
					Ignored.openURL(var79, true, false); // L: 6879
					var1.serverPacket = null; // L: 6880
					return true; // L: 6881
				}

				if (ServerPacket.field3252 == var1.serverPacket) { // L: 6883
					isCameraLocked = true; // L: 6884
					field731 = false; // L: 6885
					field673 = false; // L: 6886
					class179.field1902 = var3.readUnsignedByte() * 16384; // L: 6887
					class123.field1499 = var3.readUnsignedByte() * 128; // L: 6888
					class16.field90 = var3.readUnsignedShort(); // L: 6889
					class25.field137 = var3.readUnsignedByte(); // L: 6890
					class138.field1637 = var3.readUnsignedByte(); // L: 6891
					if (class138.field1637 >= 100) { // L: 6892
						class36.cameraX = class179.field1902 * 128 + 64; // L: 6893
						class297.cameraZ = class123.field1499 * 16384 + 64; // L: 6894
						class174.cameraY = class147.getTileHeight(class36.cameraX, class297.cameraZ, GameEngine.Client_plane) - class16.field90; // L: 6895
					}

					var1.serverPacket = null; // L: 6897
					return true; // L: 6898
				}

				if (ServerPacket.field3285 == var1.serverPacket) { // L: 6900
					class36.method723(); // L: 6901
					var66 = var3.readByte(); // L: 6902
					class142 var80 = new class142(var3); // L: 6903
					ClanSettings var75;
					if (var66 >= 0) { // L: 6905
						var75 = currentClanSettings[var66];
					} else {
						var75 = ItemComposition.guestClanSettings; // L: 6906
					}

					var80.method3225(var75); // L: 6907
					var1.serverPacket = null; // L: 6908
					return true; // L: 6909
				}

				if (ServerPacket.field3240 == var1.serverPacket) { // L: 6911
					var20 = var3.readUnsignedShort(); // L: 6912
					var5 = var3.readUnsignedByte(); // L: 6913
					var6 = var3.readUnsignedShort(); // L: 6914
					class133.queueSoundEffect(var20, var5, var6); // L: 6915
					var1.serverPacket = null; // L: 6916
					return true; // L: 6917
				}

				if (ServerPacket.field3258 == var1.serverPacket) { // L: 6919
					var20 = var3.readInt(); // L: 6920
					if (var20 != field576) { // L: 6921
						field576 = var20; // L: 6922
						class173.method3586(); // L: 6923
					}

					var1.serverPacket = null; // L: 6925
					return true; // L: 6926
				}

				if (ServerPacket.field3233 == var1.serverPacket) { // L: 6928
					ClientPacket.method5688(); // L: 6929
					field624 = var3.readUnsignedShort(); // L: 6930
					field565 = cycleCntr; // L: 6931
					var1.serverPacket = null; // L: 6932
					return true; // L: 6933
				}

				if (ServerPacket.field3273 == var1.serverPacket) { // L: 6935
					var20 = var3.method9112(); // L: 6936
					var5 = var3.method9099(); // L: 6937
					var29 = class165.getWidget(var20); // L: 6938
					if (var29 != null && var29.type == 0) { // L: 6939
						if (var5 > var29.scrollHeight - var29.height) { // L: 6940
							var5 = var29.scrollHeight - var29.height;
						}

						if (var5 < 0) { // L: 6941
							var5 = 0;
						}

						if (var5 != var29.scrollY) { // L: 6942
							var29.scrollY = var5; // L: 6943
							class144.invalidateWidget(var29); // L: 6944
						}
					}

					var1.serverPacket = null; // L: 6947
					return true; // L: 6948
				}

				if (ServerPacket.field3274 == var1.serverPacket) { // L: 6950
					var49 = var3.readStringCp1252NullTerminated(); // L: 6951
					var5 = var3.method9112(); // L: 6952
					var29 = class165.getWidget(var5); // L: 6953
					if (!var49.equals(var29.text)) { // L: 6954
						var29.text = var49; // L: 6955
						class144.invalidateWidget(var29); // L: 6956
					}

					var1.serverPacket = null; // L: 6958
					return true; // L: 6959
				}

				if (ServerPacket.field3311 == var1.serverPacket) { // L: 6961
					class36.method723(); // L: 6962
					var66 = var3.readByte(); // L: 6963
					if (var1.serverPacketLength == 1) { // L: 6964
						if (var66 >= 0) { // L: 6965
							currentClanSettings[var66] = null;
						} else {
							ItemComposition.guestClanSettings = null; // L: 6966
						}

						var1.serverPacket = null; // L: 6967
						return true; // L: 6968
					}

					if (var66 >= 0) { // L: 6970
						currentClanSettings[var66] = new ClanSettings(var3); // L: 6971
					} else {
						ItemComposition.guestClanSettings = new ClanSettings(var3); // L: 6974
					}

					var1.serverPacket = null; // L: 6976
					return true; // L: 6977
				}

				if (ServerPacket.field3334 == var1.serverPacket) { // L: 6979
					var26 = var3.readUnsignedByte(); // L: 6985
					var20 = var3.readUnsignedShort(); // L: 6986
					var71 = npcs[var20]; // L: 6987
					var6 = var3.readUnsignedShort(); // L: 6988
					var5 = var3.readInt(); // L: 6989
					if (var71 != null) { // L: 6990
						var71.method2375(var26, var6, var5 >> 16, var5 & 65535); // L: 6991
					}

					var1.serverPacket = null; // L: 6993
					return true; // L: 6994
				}

				if (ServerPacket.field3263 == var1.serverPacket) { // L: 6996
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) { // L: 6997
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) { // L: 6998
							Varps.Varps_main[var20] = Varps.Varps_temp[var20]; // L: 6999
							class7.changeGameOptions(var20); // L: 7000
							field739[++field513 - 1 & 31] = var20; // L: 7001
						}
					}

					var1.serverPacket = null; // L: 7004
					return true; // L: 7005
				}

				if (ServerPacket.field3295 == var1.serverPacket) { // L: 7007
					var20 = var3.readInt(); // L: 7008
					var5 = var3.readUnsignedShort(); // L: 7009
					if (var20 < -70000) { // L: 7010
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 7012
						var29 = class165.getWidget(var20);
					} else {
						var29 = null; // L: 7013
					}

					for (; var3.offset < var1.serverPacketLength; class373.itemContainerSetItem(var5, var26, var8 - 1, var30)) { // L: 7014 7028
						var26 = var3.readUShortSmart(); // L: 7015
						var8 = var3.readUnsignedShort(); // L: 7016
						var30 = 0; // L: 7017
						if (var8 != 0) { // L: 7018
							var30 = var3.readUnsignedByte(); // L: 7019
							if (var30 == 255) { // L: 7020
								var30 = var3.readInt();
							}
						}

						if (var29 != null && var26 >= 0 && var26 < var29.itemIds.length) { // L: 7022 7023
							var29.itemIds[var26] = var8; // L: 7024
							var29.field3701[var26] = var30; // L: 7025
						}
					}

					if (var29 != null) { // L: 7030
						class144.invalidateWidget(var29);
					}

					ClientPacket.method5688(); // L: 7031
					field719[++field683 - 1 & 31] = var5 & 32767; // L: 7032
					var1.serverPacket = null; // L: 7033
					return true; // L: 7034
				}

				if (ServerPacket.field3220 == var1.serverPacket) { // L: 7036
					class31.logOut(); // L: 7037
					var1.serverPacket = null; // L: 7038
					return false; // L: 7039
				}

				if (ServerPacket.field3280 == var1.serverPacket) { // L: 7041
					return this.method1251(var1, 1); // L: 7042
				}

				if (ServerPacket.field3327 == var1.serverPacket) { // L: 7044
					isCameraLocked = true; // L: 7045
					field731 = false; // L: 7046
					field747 = true; // L: 7047
					var20 = class425.method8242(var3.readShort() & 2027); // L: 7048
					var5 = class18.method290(var3.readShort() & 2027); // L: 7049
					var6 = var3.readUnsignedShort(); // L: 7050
					var26 = var3.readUnsignedByte(); // L: 7051
					field737 = new class454(WorldMapSectionType.cameraPitch, var5, var6, var26); // L: 7052
					field750 = new class454(class125.cameraYaw, var20, var6, var26); // L: 7053
					var1.serverPacket = null; // L: 7054
					return true; // L: 7055
				}

				if (ServerPacket.field3332 == var1.serverPacket) { // L: 7057
					ClientPacket.method5688(); // L: 7058
					weight = var3.readShort(); // L: 7059
					field565 = cycleCntr; // L: 7060
					var1.serverPacket = null; // L: 7061
					return true; // L: 7062
				}

				if (ServerPacket.field3255 == var1.serverPacket) { // L: 7064
					EnumComposition.method3751(class287.field3204); // L: 7065
					var1.serverPacket = null; // L: 7066
					return true; // L: 7067
				}

				if (ServerPacket.field3313 == var1.serverPacket) { // L: 7069
					FontName.field4882 = var3.readUnsignedByte(); // L: 7070
					class9.field43 = var3.method9089(); // L: 7071

					for (var20 = class9.field43; var20 < class9.field43 + 8; ++var20) { // L: 7072
						for (var5 = FontName.field4882; var5 < FontName.field4882 + 8; ++var5) { // L: 7073
							if (groundItems[GameEngine.Client_plane][var20][var5] != null) { // L: 7074
								groundItems[GameEngine.Client_plane][var20][var5] = null; // L: 7075
								class121.updateItemPile(var20, var5); // L: 7076
							}
						}
					}

					for (PendingSpawn var52 = (PendingSpawn)pendingSpawns.last(); var52 != null; var52 = (PendingSpawn)pendingSpawns.previous()) { // L: 7080 7081 7083
						if (var52.x >= class9.field43 && var52.x < class9.field43 + 8 && var52.y >= FontName.field4882 && var52.y < FontName.field4882 + 8 && var52.plane == GameEngine.Client_plane) { // L: 7082
							var52.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 7085
					return true; // L: 7086
				}

				Widget var28;
				if (ServerPacket.field3317 == var1.serverPacket) { // L: 7088
					var20 = var3.method9112(); // L: 7089
					var5 = var3.method9112(); // L: 7090
					InterfaceParent var73 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7091
					var7 = (InterfaceParent)interfaceParents.get((long)var5); // L: 7092
					if (var7 != null) { // L: 7093
						class357.closeInterface(var7, var73 == null || var7.group != var73.group);
					}

					if (var73 != null) { // L: 7094
						var73.remove(); // L: 7095
						interfaceParents.put(var73, (long)var5); // L: 7096
					}

					var28 = class165.getWidget(var20); // L: 7098
					if (var28 != null) { // L: 7099
						class144.invalidateWidget(var28);
					}

					var28 = class165.getWidget(var5); // L: 7100
					if (var28 != null) { // L: 7101
						class144.invalidateWidget(var28); // L: 7102
						DecorativeObject.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[var28.id >>> 16], var28, true); // L: 7103
					}

					if (rootInterface != -1) { // L: 7105
						class127.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 7106
					return true; // L: 7107
				}

				if (ServerPacket.field3315 == var1.serverPacket) { // L: 7109
					World var51 = new World(); // L: 7110
					var51.host = var3.readStringCp1252NullTerminated(); // L: 7111
					var51.id = var3.readUnsignedShort(); // L: 7112
					var5 = var3.readInt(); // L: 7113
					var51.properties = var5; // L: 7114
					class138.method3208(45); // L: 7115
					var2.close(); // L: 7116
					var2 = null; // L: 7117
					FloorOverlayDefinition.changeWorld(var51); // L: 7118
					var1.serverPacket = null; // L: 7119
					return false; // L: 7120
				}

				if (ServerPacket.field3278 == var1.serverPacket) { // L: 7122
					class146.updateNpcs(true, var3); // L: 7123
					var1.serverPacket = null; // L: 7124
					return true; // L: 7125
				}

				if (ServerPacket.field3223 == var1.serverPacket) { // L: 7127
					EnumComposition.method3751(class287.field3196); // L: 7128
					var1.serverPacket = null; // L: 7129
					return true; // L: 7130
				}

				if (ServerPacket.field3298 == var1.serverPacket) { // L: 7132
					var20 = var3.readInt(); // L: 7133
					var78 = class165.getWidget(var20); // L: 7134

					for (var6 = 0; var6 < var78.itemIds.length; ++var6) { // L: 7135
						var78.itemIds[var6] = -1; // L: 7136
						var78.itemIds[var6] = 0; // L: 7137
					}

					class144.invalidateWidget(var78); // L: 7139
					var1.serverPacket = null; // L: 7140
					return true; // L: 7141
				}

				if (ServerPacket.field3320 == var1.serverPacket) { // L: 7143
					isCameraLocked = true; // L: 7144
					field731 = false; // L: 7145
					field747 = false; // L: 7146
					FontName.field4884 = var3.readUnsignedByte() * 16384; // L: 7147
					MilliClock.field1871 = var3.readUnsignedByte() * 128; // L: 7148
					ScriptFrame.field469 = var3.readUnsignedShort(); // L: 7149
					Archive.field4213 = var3.readUnsignedByte(); // L: 7150
					WorldMapElement.field1937 = var3.readUnsignedByte(); // L: 7151
					if (WorldMapElement.field1937 >= 100) { // L: 7152
						var20 = FontName.field4884 * 128 + 64; // L: 7153
						var5 = MilliClock.field1871 * 16384 + 64; // L: 7154
						var6 = class147.getTileHeight(var20, var5, GameEngine.Client_plane) - ScriptFrame.field469; // L: 7155
						var26 = var20 - class36.cameraX; // L: 7156
						var8 = var6 - class174.cameraY; // L: 7157
						var30 = var5 - class297.cameraZ; // L: 7158
						var10 = (int)Math.sqrt((double)(var26 * var26 + var30 * var30)); // L: 7159
						WorldMapSectionType.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047; // L: 7160
						class125.cameraYaw = (int)(Math.atan2((double)var26, (double)var30) * -325.9490051269531D) & 2047; // L: 7161
						if (WorldMapSectionType.cameraPitch < 128) { // L: 7162
							WorldMapSectionType.cameraPitch = 128;
						}

						if (WorldMapSectionType.cameraPitch > 383) { // L: 7163
							WorldMapSectionType.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 7165
					return true; // L: 7166
				}

				if (ServerPacket.field3224 == var1.serverPacket) { // L: 7168
					ScriptFrame.method1166(var3.readStringCp1252NullTerminated()); // L: 7169
					var1.serverPacket = null; // L: 7170
					return true; // L: 7171
				}

				if (ServerPacket.field3335 == var1.serverPacket) { // L: 7173
					var26 = var3.readUnsignedByte(); // L: 7179
					var20 = var3.readUnsignedShort(); // L: 7180
					Player var70;
					if (var20 == localPlayerIndex) { // L: 7181
						var70 = MusicPatchNode.localPlayer; // L: 7182
					} else {
						var70 = players[var20]; // L: 7185
					}

					var5 = var3.readUnsignedShort(); // L: 7187
					var6 = var3.readInt(); // L: 7188
					if (var70 != null) { // L: 7189
						var70.method2375(var26, var5, var6 >> 16, var6 & 65535); // L: 7190
					}

					var1.serverPacket = null; // L: 7192
					return true; // L: 7193
				}

				if (ServerPacket.field3253 == var1.serverPacket) { // L: 7195
					EnumComposition.method3751(class287.field3200); // L: 7196
					var1.serverPacket = null; // L: 7197
					return true; // L: 7198
				}

				if (ServerPacket.field3231 == var1.serverPacket) { // L: 7200
					ClientPacket.method5688(); // L: 7201
					var20 = var3.method9039(); // L: 7202
					var5 = var3.method9039(); // L: 7203
					var6 = var3.method9110(); // L: 7204
					experience[var20] = var6; // L: 7205
					currentLevels[var20] = var5; // L: 7206
					levels[var20] = 1; // L: 7207

					for (var26 = 0; var26 < 98; ++var26) { // L: 7208
						if (var6 >= Skills.Skills_experienceTable[var26]) {
							levels[var20] = var26 + 2;
						}
					}

					field684[++field685 - 1 & 31] = var20; // L: 7209
					var1.serverPacket = null; // L: 7210
					return true; // L: 7211
				}

				if (ServerPacket.field3259 == var1.serverPacket) { // L: 7213
					class127.loadRegions(true, var1.packetBuffer); // L: 7214
					var1.serverPacket = null; // L: 7215
					return true; // L: 7216
				}

				if (ServerPacket.field3262 == var1.serverPacket) { // L: 7218
					var20 = var3.method9099(); // L: 7219
					var5 = var3.method9098(); // L: 7220
					var6 = var3.method9111(); // L: 7221
					var26 = var3.readUnsignedShort(); // L: 7222
					var28 = class165.getWidget(var6); // L: 7223
					if (var5 != var28.modelAngleX || var20 != var28.modelAngleY || var26 != var28.modelZoom) { // L: 7224
						var28.modelAngleX = var5; // L: 7225
						var28.modelAngleY = var20; // L: 7226
						var28.modelZoom = var26; // L: 7227
						class144.invalidateWidget(var28); // L: 7228
					}

					var1.serverPacket = null; // L: 7230
					return true; // L: 7231
				}

				if (ServerPacket.field3283 == var1.serverPacket) { // L: 7233
					var30 = var3.readUnsignedByte(); // L: 7244
					var10 = var30 >> 2; // L: 7245
					var11 = var30 & 3; // L: 7246
					var96 = field563[var10]; // L: 7247
					var6 = var3.method9084(); // L: 7248
					var20 = var6 >> 16; // L: 7249
					var5 = var6 >> 8 & 255; // L: 7250
					var26 = var20 + (var6 >> 4 & 7); // L: 7251
					var8 = var5 + (var6 & 7); // L: 7252
					var13 = var3.method9135(); // L: 7253
					if (var26 >= 0 && var8 >= 0 && var26 < 103 && var8 < 103) { // L: 7254
						if (var96 == 0) { // L: 7255
							WallObject var94 = class31.scene.method4544(GameEngine.Client_plane, var26, var8); // L: 7256
							if (var94 != null) { // L: 7257
								var15 = InterfaceParent.Entity_unpackID(var94.tag); // L: 7258
								if (var10 == 2) { // L: 7259
									var94.renderable1 = new DynamicObject(var15, 2, var11 + 4, GameEngine.Client_plane, var26, var8, var13, false, var94.renderable1); // L: 7260
									var94.renderable2 = new DynamicObject(var15, 2, var11 + 1 & 3, GameEngine.Client_plane, var26, var8, var13, false, var94.renderable2); // L: 7261
								} else {
									var94.renderable1 = new DynamicObject(var15, var10, var11, GameEngine.Client_plane, var26, var8, var13, false, var94.renderable1); // L: 7263
								}
							}
						} else if (var96 == 1) { // L: 7266
							DecorativeObject var93 = class31.scene.method4545(GameEngine.Client_plane, var26, var8); // L: 7267
							if (var93 != null) { // L: 7268
								var15 = InterfaceParent.Entity_unpackID(var93.tag); // L: 7269
								if (var10 != 4 && var10 != 5) { // L: 7270
									if (var10 == 6) { // L: 7273
										var93.renderable1 = new DynamicObject(var15, 4, var11 + 4, GameEngine.Client_plane, var26, var8, var13, false, var93.renderable1); // L: 7274
									} else if (var10 == 7) { // L: 7276
										var93.renderable1 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, GameEngine.Client_plane, var26, var8, var13, false, var93.renderable1); // L: 7277
									} else if (var10 == 8) { // L: 7279
										var93.renderable1 = new DynamicObject(var15, 4, var11 + 4, GameEngine.Client_plane, var26, var8, var13, false, var93.renderable1); // L: 7280
										var93.renderable2 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, GameEngine.Client_plane, var26, var8, var13, false, var93.renderable2); // L: 7281
									}
								} else {
									var93.renderable1 = new DynamicObject(var15, 4, var11, GameEngine.Client_plane, var26, var8, var13, false, var93.renderable1); // L: 7271
								}
							}
						} else if (var96 == 2) { // L: 7285
							var39 = class31.scene.getGameObject(GameEngine.Client_plane, var26, var8); // L: 7286
							if (var10 == 11) { // L: 7287
								var10 = 10; // L: 7288
							}

							if (var39 != null) { // L: 7290
								var39.renderable = new DynamicObject(InterfaceParent.Entity_unpackID(var39.tag), var10, var11, GameEngine.Client_plane, var26, var8, var13, false, var39.renderable); // L: 7291
							}
						} else if (var96 == 3) { // L: 7294
							GroundObject var92 = class31.scene.getGroundObject(GameEngine.Client_plane, var26, var8); // L: 7295
							if (var92 != null) { // L: 7296
								var92.renderable = new DynamicObject(InterfaceParent.Entity_unpackID(var92.tag), 22, var11, GameEngine.Client_plane, var26, var8, var13, false, var92.renderable); // L: 7297
							}
						}
					}

					var1.serverPacket = null; // L: 7301
					return true; // L: 7302
				}

				if (ServerPacket.field3251 == var1.serverPacket) { // L: 7304
					EnumComposition.method3751(class287.field3201); // L: 7305
					var1.serverPacket = null; // L: 7306
					return true; // L: 7307
				}

				if (ServerPacket.field3281 == var1.serverPacket) { // L: 7309
					var20 = var3.readUnsignedByte(); // L: 7310
					class244.method5044(var20); // L: 7311
					var1.serverPacket = null; // L: 7312
					return true; // L: 7313
				}

				if (ServerPacket.field3276 == var1.serverPacket) { // L: 7315
					var68 = var3.readUnsignedByte() == 1; // L: 7316
					if (var68) { // L: 7317
						class323.field3740 = class96.method2634() - var3.readLong(); // L: 7318
						class375.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 7319
					} else {
						class375.grandExchangeEvents = null; // L: 7321
					}

					field768 = cycleCntr; // L: 7322
					var1.serverPacket = null; // L: 7323
					return true; // L: 7324
				}

				if (ServerPacket.field3326 == var1.serverPacket) { // L: 7326
					isCameraLocked = true; // L: 7327
					field731 = false; // L: 7328
					field747 = true; // L: 7329
					FontName.field4884 = var3.readUnsignedByte() * 16384; // L: 7330
					MilliClock.field1871 = var3.readUnsignedByte() * 128; // L: 7331
					ScriptFrame.field469 = var3.readUnsignedShort(); // L: 7332
					var20 = var3.readUnsignedShort(); // L: 7333
					var5 = var3.readUnsignedByte(); // L: 7334
					var6 = FontName.field4884 * 128 + 64; // L: 7335
					var26 = MilliClock.field1871 * 16384 + 64; // L: 7336
					var8 = class147.getTileHeight(var6, var26, GameEngine.Client_plane) - ScriptFrame.field469; // L: 7337
					var30 = var6 - class36.cameraX; // L: 7338
					var10 = var8 - class174.cameraY; // L: 7339
					var11 = var26 - class297.cameraZ; // L: 7340
					double var97 = Math.sqrt((double)(var11 * var11 + var30 * var30)); // L: 7341
					var65 = class18.method290((int)(Math.atan2((double)var10, var97) * 325.9490051269531D) & 2047); // L: 7342
					var15 = class425.method8242((int)(Math.atan2((double)var30, (double)var11) * -325.9490051269531D) & 2047); // L: 7343
					field737 = new class454(WorldMapSectionType.cameraPitch, var65, var20, var5); // L: 7344
					field750 = new class454(class125.cameraYaw, var15, var20, var5); // L: 7345
					var1.serverPacket = null; // L: 7346
					return true; // L: 7347
				}

				if (ServerPacket.field3225 == var1.serverPacket) { // L: 7349
					FloorUnderlayDefinition.privateChatMode = class399.method7732(var3.readUnsignedByte()); // L: 7350
					var1.serverPacket = null; // L: 7351
					return true; // L: 7352
				}

				if (ServerPacket.field3291 == var1.serverPacket) { // L: 7354
					World.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 7355
					Login.FriendSystem_invalidateIgnoreds(); // L: 7356
					field689 = cycleCntr; // L: 7357
					var1.serverPacket = null; // L: 7358
					return true; // L: 7359
				}

				if (ServerPacket.field3254 == var1.serverPacket) { // L: 7361
					class146.updateNpcs(false, var3); // L: 7362
					var1.serverPacket = null; // L: 7363
					return true; // L: 7364
				}

				if (ServerPacket.field3244 == var1.serverPacket) { // L: 7366
					if (Players.field1339 == null) { // L: 7367
						Players.field1339 = new class429(MenuAction.Ignored_cached);
					}

					class497 var50 = MenuAction.Ignored_cached.method8285(var3); // L: 7368
					Players.field1339.field4697.vmethod8745(var50.field5058, var50.field5057); // L: 7369
					field686[++field687 - 1 & 31] = var50.field5058; // L: 7370
					var1.serverPacket = null; // L: 7371
					return true; // L: 7372
				}

				if (ServerPacket.field3302 == var1.serverPacket) { // L: 7374
					var66 = var3.method9232(); // L: 7375
					var5 = var3.readUnsignedShort(); // L: 7376
					Varps.Varps_temp[var5] = var66; // L: 7377
					if (Varps.Varps_main[var5] != var66) { // L: 7378
						Varps.Varps_main[var5] = var66; // L: 7379
					}

					class7.changeGameOptions(var5); // L: 7381
					field739[++field513 - 1 & 31] = var5; // L: 7382
					var1.serverPacket = null; // L: 7383
					return true; // L: 7384
				}

				if (ServerPacket.field3232 == var1.serverPacket) { // L: 7386
					var20 = var3.method9098(); // L: 7387
					Nameable.method7857(var20); // L: 7388
					field719[++field683 - 1 & 31] = var20 & 32767; // L: 7389
					var1.serverPacket = null; // L: 7390
					return true; // L: 7391
				}

				if (ServerPacket.field3250 == var1.serverPacket) { // L: 7393
					var20 = var3.method9099(); // L: 7394
					var5 = var3.method9110(); // L: 7395
					var29 = class165.getWidget(var5); // L: 7396
					if (var29.modelType != 6 || var20 != var29.modelId) { // L: 7397
						var29.modelType = 6; // L: 7398
						var29.modelId = var20; // L: 7399
						class144.invalidateWidget(var29); // L: 7400
					}

					var1.serverPacket = null; // L: 7402
					return true; // L: 7403
				}

				if (ServerPacket.field3245 == var1.serverPacket) { // L: 7405
					var49 = var3.readStringCp1252NullTerminated(); // L: 7406
					var21 = (long)var3.readUnsignedShort(); // L: 7407
					var23 = (long)var3.readMedium(); // L: 7408
					PlayerType var44 = (PlayerType)StructComposition.findEnumerated(StudioGame.PlayerType_values(), var3.readUnsignedByte()); // L: 7409
					long var45 = var23 + (var21 << 32); // L: 7410
					var41 = false; // L: 7411

					for (var13 = 0; var13 < 100; ++var13) { // L: 7412
						if (field785[var13] == var45) { // L: 7413
							var41 = true; // L: 7414
							break; // L: 7415
						}
					}

					if (World.friendSystem.isIgnored(new Username(var49, class70.loginType))) { // L: 7418
						var41 = true;
					}

					if (!var41 && field608 == 0) { // L: 7419
						field785[field720] = var45; // L: 7420
						field720 = (field720 + 1) % 100; // L: 7421
						var25 = AbstractFont.escapeBrackets(BuddyRankComparator.method2960(SceneTilePaint.method4911(var3))); // L: 7422
						byte var63;
						if (var44.isPrivileged) { // L: 7424
							var63 = 7;
						} else {
							var63 = 3; // L: 7425
						}

						if (var44.modIcon != -1) { // L: 7426
							UserComparator5.addGameMessage(var63, ArchiveDiskActionHandler.method6619(var44.modIcon) + var49, var25);
						} else {
							UserComparator5.addGameMessage(var63, var49, var25); // L: 7427
						}
					}

					var1.serverPacket = null; // L: 7429
					return true; // L: 7430
				}

				if (ServerPacket.field3265 == var1.serverPacket) { // L: 7432
					var20 = var3.method9099(); // L: 7433
					var5 = var3.method9111(); // L: 7434
					var29 = class165.getWidget(var5); // L: 7435
					if (var29.modelType != 2 || var20 != var29.modelId) { // L: 7436
						var29.modelType = 2; // L: 7437
						var29.modelId = var20; // L: 7438
						class144.invalidateWidget(var29); // L: 7439
					}

					var1.serverPacket = null; // L: 7441
					return true; // L: 7442
				}

				if (ServerPacket.field3296 == var1.serverPacket) { // L: 7444
					field692 = cycleCntr; // L: 7445
					var66 = var3.readByte(); // L: 7446
					if (var1.serverPacketLength == 1) { // L: 7447
						if (var66 >= 0) { // L: 7448
							currentClanChannels[var66] = null;
						} else {
							MouseHandler.guestClanChannel = null; // L: 7449
						}

						var1.serverPacket = null; // L: 7450
						return true; // L: 7451
					}

					if (var66 >= 0) { // L: 7453
						currentClanChannels[var66] = new ClanChannel(var3); // L: 7454
					} else {
						MouseHandler.guestClanChannel = new ClanChannel(var3); // L: 7457
					}

					var1.serverPacket = null; // L: 7459
					return true; // L: 7460
				}

				if (ServerPacket.field3309 == var1.serverPacket) { // L: 7462
					for (var20 = 0; var20 < VarpDefinition.field1908; ++var20) { // L: 7463
						VarpDefinition var77 = GraphicsDefaults.VarpDefinition_get(var20); // L: 7464
						if (var77 != null) { // L: 7465
							Varps.Varps_temp[var20] = 0; // L: 7466
							Varps.Varps_main[var20] = 0; // L: 7467
						}
					}

					ClientPacket.method5688(); // L: 7470
					field513 += 32; // L: 7471
					var1.serverPacket = null; // L: 7472
					return true; // L: 7473
				}

				if (ServerPacket.field3305 == var1.serverPacket) { // L: 7475
					var20 = var3.readInt(); // L: 7476
					InterfaceParent var76 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7477
					if (var76 != null) { // L: 7478
						class357.closeInterface(var76, true);
					}

					if (meslayerContinueWidget != null) { // L: 7479
						class144.invalidateWidget(meslayerContinueWidget); // L: 7480
						meslayerContinueWidget = null; // L: 7481
					}

					var1.serverPacket = null; // L: 7483
					return true; // L: 7484
				}

				if (ServerPacket.field3227 == var1.serverPacket) { // L: 7486
					var20 = var3.method9039(); // L: 7487
					var31 = var3.readStringCp1252NullTerminated(); // L: 7488
					var6 = var3.method9039(); // L: 7489
					if (var20 >= 1 && var20 <= 8) { // L: 7490
						if (var31.equalsIgnoreCase("null")) { // L: 7491
							var31 = null;
						}

						playerMenuActions[var20 - 1] = var31; // L: 7492
						playerOptionsPriorities[var20 - 1] = var6 == 0; // L: 7493
					}

					var1.serverPacket = null; // L: 7495
					return true; // L: 7496
				}

				if (ServerPacket.field3217 == var1.serverPacket) { // L: 7498
					var49 = var3.readStringCp1252NullTerminated(); // L: 7499
					var31 = AbstractFont.escapeBrackets(BuddyRankComparator.method2960(SceneTilePaint.method4911(var3))); // L: 7500
					UserComparator5.addGameMessage(6, var49, var31); // L: 7501
					var1.serverPacket = null; // L: 7502
					return true; // L: 7503
				}

				if (ServerPacket.field3235 == var1.serverPacket) { // L: 7505
					var49 = var3.readStringCp1252NullTerminated(); // L: 7506
					var21 = var3.readLong(); // L: 7507
					var23 = (long)var3.readUnsignedShort(); // L: 7508
					var9 = (long)var3.readMedium(); // L: 7509
					PlayerType var27 = (PlayerType)StructComposition.findEnumerated(StudioGame.PlayerType_values(), var3.readUnsignedByte()); // L: 7510
					var42 = var9 + (var23 << 32); // L: 7511
					boolean var14 = false; // L: 7512

					for (var15 = 0; var15 < 100; ++var15) { // L: 7513
						if (field785[var15] == var42) { // L: 7514
							var14 = true; // L: 7515
							break; // L: 7516
						}
					}

					if (var27.isUser && World.friendSystem.isIgnored(new Username(var49, class70.loginType))) { // L: 7519 7520
						var14 = true;
					}

					if (!var14 && field608 == 0) { // L: 7522
						field785[field720] = var42; // L: 7523
						field720 = (field720 + 1) % 100; // L: 7524
						var40 = AbstractFont.escapeBrackets(BuddyRankComparator.method2960(SceneTilePaint.method4911(var3))); // L: 7525
						if (var27.modIcon != -1) { // L: 7526
							class136.addChatMessage(9, ArchiveDiskActionHandler.method6619(var27.modIcon) + var49, var40, FloorUnderlayDefinition.base37DecodeLong(var21));
						} else {
							class136.addChatMessage(9, var49, var40, FloorUnderlayDefinition.base37DecodeLong(var21)); // L: 7527
						}
					}

					var1.serverPacket = null; // L: 7529
					return true; // L: 7530
				}

				if (ServerPacket.field3323 == var1.serverPacket) { // L: 7532
					var10 = var3.readUnsignedByte(); // L: 7541
					var11 = var3.method9099(); // L: 7542
					var6 = var3.method9084(); // L: 7543
					var20 = var6 >> 16; // L: 7544
					var5 = var6 >> 8 & 255; // L: 7545
					var26 = var20 + (var6 >> 4 & 7); // L: 7546
					var8 = var5 + (var6 & 7); // L: 7547
					var30 = var3.readUnsignedShort(); // L: 7548
					if (var26 >= 0 && var8 >= 0 && var26 < 104 && var8 < 104) { // L: 7549
						var26 = var26 * 128 + 64; // L: 7550
						var8 = var8 * 128 + 64; // L: 7551
						GraphicsObject var12 = new GraphicsObject(var30, GameEngine.Client_plane, var26, var8, class147.getTileHeight(var26, var8, GameEngine.Client_plane) - var10, var11, cycle); // L: 7552
						graphicsObjects.addFirst(var12); // L: 7553
					}

					var1.serverPacket = null; // L: 7555
					return true; // L: 7556
				}

				if (ServerPacket.field3301 == var1.serverPacket) { // L: 7558
					publicChatMode = var3.method9039(); // L: 7559
					tradeChatMode = var3.readUnsignedByte(); // L: 7560
					var1.serverPacket = null; // L: 7561
					return true; // L: 7562
				}

				if (ServerPacket.field3289 == var1.serverPacket) { // L: 7564
					rebootTimer = var3.method9135() * 30; // L: 7565
					field565 = cycleCntr; // L: 7566
					var1.serverPacket = null; // L: 7567
					return true; // L: 7568
				}

				if (ServerPacket.field3236 == var1.serverPacket) { // L: 7570
					hintArrowType = var3.readUnsignedByte(); // L: 7571
					if (hintArrowType == 1) { // L: 7572
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 7573
						if (hintArrowType == 2) { // L: 7574
							field765 = 4096; // L: 7575
							field704 = 4096; // L: 7576
						}

						if (hintArrowType == 3) { // L: 7578
							field765 = 0; // L: 7579
							field704 = 4096; // L: 7580
						}

						if (hintArrowType == 4) { // L: 7582
							field765 = 8192; // L: 7583
							field704 = 4096; // L: 7584
						}

						if (hintArrowType == 5) { // L: 7586
							field765 = 4096; // L: 7587
							field704 = 0; // L: 7588
						}

						if (hintArrowType == 6) { // L: 7590
							field765 = 4096; // L: 7591
							field704 = 8192; // L: 7592
						}

						hintArrowType = 2; // L: 7594
						field653 = var3.readUnsignedShort(); // L: 7595
						field511 = var3.readUnsignedShort(); // L: 7596
						field546 = var3.readUnsignedByte() * 4; // L: 7597
					}

					if (hintArrowType == 10) { // L: 7599
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 7600
					return true; // L: 7601
				}

				if (ServerPacket.field3248 == var1.serverPacket) { // L: 7603
					var20 = var3.method9090(); // L: 7604
					var5 = var3.method9135(); // L: 7605
					var6 = var3.method9111(); // L: 7606
					var7 = (InterfaceParent)interfaceParents.get((long)var6); // L: 7607
					if (var7 != null) { // L: 7608
						class357.closeInterface(var7, var5 != var7.group);
					}

					AttackOption.method2660(var6, var5, var20); // L: 7609
					var1.serverPacket = null; // L: 7610
					return true; // L: 7611
				}

				if (ServerPacket.field3249 == var1.serverPacket) { // L: 7613
					var20 = var3.readInt(); // L: 7614
					var5 = var3.readUnsignedShort(); // L: 7615
					if (var20 < -70000) { // L: 7616
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 7618
						var29 = class165.getWidget(var20);
					} else {
						var29 = null; // L: 7619
					}

					if (var29 != null) { // L: 7620
						for (var26 = 0; var26 < var29.itemIds.length; ++var26) { // L: 7621
							var29.itemIds[var26] = 0; // L: 7622
							var29.field3701[var26] = 0; // L: 7623
						}
					}

					WorldMapRegion.clearItemContainer(var5); // L: 7626
					var26 = var3.readUnsignedShort(); // L: 7627

					for (var8 = 0; var8 < var26; ++var8) { // L: 7628
						var30 = var3.method9135(); // L: 7629
						var10 = var3.method9039(); // L: 7630
						if (var10 == 255) { // L: 7631
							var10 = var3.method9111();
						}

						if (var29 != null && var8 < var29.itemIds.length) { // L: 7632 7633
							var29.itemIds[var8] = var30; // L: 7634
							var29.field3701[var8] = var10; // L: 7635
						}

						class373.itemContainerSetItem(var5, var8, var30 - 1, var10); // L: 7638
					}

					if (var29 != null) { // L: 7640
						class144.invalidateWidget(var29);
					}

					ClientPacket.method5688(); // L: 7641
					field719[++field683 - 1 & 31] = var5 & 32767; // L: 7642
					var1.serverPacket = null; // L: 7643
					return true; // L: 7644
				}

				if (ServerPacket.field3312 == var1.serverPacket) { // L: 7646
					EnumComposition.method3751(class287.field3197); // L: 7647
					var1.serverPacket = null; // L: 7648
					return true; // L: 7649
				}

				class387.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1392 != null ? var1.field1392.id : -1) + "," + (var1.field1386 != null ? var1.field1386.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 7651
				class31.logOut(); // L: 7652
			} catch (IOException var47) { // L: 7654
				class349.method6839(); // L: 7655
			} catch (Exception var48) {
				var31 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1392 != null ? var1.field1392.id : -1) + "," + (var1.field1386 != null ? var1.field1386.id : -1) + "," + var1.serverPacketLength + "," + (MusicPatchNode.localPlayer.pathX[0] + WorldMapData_0.baseX * 64) + "," + (MusicPatchNode.localPlayer.pathY[0] + GameObject.baseY * 64) + ","; // L: 7658

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 7659
					var31 = var31 + var3.array[var6] + ",";
				}

				class387.RunException_sendStackTrace(var31, var48); // L: 7660
				class31.logOut(); // L: 7661
			}

			return true; // L: 7663
		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-47"
	)
	@Export("menu")
	final void menu() {
		class425.method8244(); // L: 8633
		if (clickedWidget == null) { // L: 8634
			int var1 = MouseHandler.MouseHandler_lastButton; // L: 8635
			int var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (isMenuOpen) { // L: 8636
				int var15;
				if (var1 != 1 && (class473.mouseCam || var1 != 4)) { // L: 8637
					var2 = MouseHandler.MouseHandler_x; // L: 8638
					var3 = MouseHandler.MouseHandler_y; // L: 8639
					if (var2 < class192.menuX - 10 || var2 > DesktopPlatformInfoProvider.menuWidth + class192.menuX + 10 || var3 < ArchiveLoader.menuY - 10 || var3 > ArchiveLoader.menuY + class147.menuHeight + 10) { // L: 8640
						isMenuOpen = false; // L: 8641
						var4 = class192.menuX; // L: 8642
						var5 = ArchiveLoader.menuY; // L: 8643
						var6 = DesktopPlatformInfoProvider.menuWidth; // L: 8644
						var7 = class147.menuHeight; // L: 8645

						for (var15 = 0; var15 < rootWidgetCount; ++var15) { // L: 8647
							if (rootWidgetWidths[var15] + rootWidgetXs[var15] > var4 && rootWidgetXs[var15] < var4 + var6 && rootWidgetHeights[var15] + rootWidgetYs[var15] > var5 && rootWidgetYs[var15] < var7 + var5) { // L: 8648
								field705[var15] = true;
							}
						}
					}
				}

				if (var1 == 1 || !class473.mouseCam && var1 == 4) { // L: 8653
					var2 = class192.menuX; // L: 8654
					var3 = ArchiveLoader.menuY; // L: 8655
					var4 = DesktopPlatformInfoProvider.menuWidth; // L: 8656
					var5 = MouseHandler.MouseHandler_lastPressedX; // L: 8657
					var6 = MouseHandler.MouseHandler_lastPressedY; // L: 8658
					var7 = -1; // L: 8659

					int var16;
					for (var15 = 0; var15 < menuOptionsCount; ++var15) { // L: 8660
						var16 = (menuOptionsCount - 1 - var15) * 15 + var3 + 31; // L: 8661
						if (var5 > var2 && var5 < var2 + var4 && var6 > var16 - 13 && var6 < var16 + 3) { // L: 8662
							var7 = var15;
						}
					}

					int var10;
					int var11;
					int var12;
					if (var7 != -1 && var7 >= 0) { // L: 8664 8665
						var15 = menuArguments1[var7]; // L: 8666
						var16 = menuArguments2[var7]; // L: 8667
						var10 = menuOpcodes[var7]; // L: 8668
						var11 = menuIdentifiers[var7]; // L: 8669
						var12 = field637[var7]; // L: 8670
						String var13 = menuActions[var7]; // L: 8671
						String var14 = menuTargets[var7]; // L: 8672
						class17.method249(var15, var16, var10, var11, var12, var13, var14, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8673
					}

					isMenuOpen = false; // L: 8675
					var15 = class192.menuX; // L: 8676
					var16 = ArchiveLoader.menuY; // L: 8677
					var10 = DesktopPlatformInfoProvider.menuWidth; // L: 8678
					var11 = class147.menuHeight; // L: 8679

					for (var12 = 0; var12 < rootWidgetCount; ++var12) { // L: 8681
						if (rootWidgetWidths[var12] + rootWidgetXs[var12] > var15 && rootWidgetXs[var12] < var10 + var15 && rootWidgetYs[var12] + rootWidgetHeights[var12] > var16 && rootWidgetYs[var12] < var16 + var11) { // L: 8682
							field705[var12] = true;
						}
					}
				}
			} else {
				var2 = DynamicObject.method2142(); // L: 8688
				if ((var1 == 1 || !class473.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) { // L: 8689 8690
					var1 = 2; // L: 8691
				}

				if ((var1 == 1 || !class473.mouseCam && var1 == 4) && menuOptionsCount > 0 && var2 >= 0) { // L: 8694 8696
					var3 = menuArguments1[var2]; // L: 8697
					var4 = menuArguments2[var2]; // L: 8698
					var5 = menuOpcodes[var2]; // L: 8699
					var6 = menuIdentifiers[var2]; // L: 8700
					var7 = field637[var2]; // L: 8701
					String var8 = menuActions[var2]; // L: 8702
					String var9 = menuTargets[var2]; // L: 8703
					class17.method249(var3, var4, var5, var6, var7, var8, var9, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8704
				}

				if (var1 == 2 && menuOptionsCount > 0) { // L: 8707
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	} // L: 8709

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1679837219"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = DynamicObject.method2142(); // L: 8712
		boolean var2 = field630 && menuOptionsCount > 2; // L: 8713
		if (!var2) { // L: 8714
			boolean var3;
			if (var1 < 0) { // L: 8717
				var3 = false; // L: 8718
			} else {
				int var4 = menuOpcodes[var1]; // L: 8721
				if (var4 >= 2000) { // L: 8722
					var4 -= 2000;
				}

				if (var4 == 1007) { // L: 8723
					var3 = true; // L: 8724
				} else {
					var3 = false; // L: 8727
				}
			}

			var2 = var3; // L: 8729
		}

		return var2 && !menuShiftClick[var1]; // L: 8731
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1018516557"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		class431.method8299(var1, var2); // L: 8735
		var1 -= viewportOffsetX; // L: 8736
		var2 -= viewportOffsetY; // L: 8737
		class31.scene.menuOpen(GameEngine.Client_plane, var1, var2, false); // L: 8738
		isMenuOpen = true; // L: 8739
	} // L: 8740

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "36188245"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		SequenceDefinition.method4149(rootInterface, GameEngine.canvasWidth, class262.canvasHeight, var1); // L: 10456
	} // L: 10457

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Lmq;I)V",
		garbageValue = "-1113228420"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class165.getWidget(var1.parentId); // L: 10460
		int var3;
		int var4;
		if (var2 == null) { // L: 10463
			var3 = GameEngine.canvasWidth; // L: 10464
			var4 = class262.canvasHeight; // L: 10465
		} else {
			var3 = var2.width; // L: 10468
			var4 = var2.height; // L: 10469
		}

		class158.alignWidgetSize(var1, var3, var4, false); // L: 10471
		class192.alignWidgetPosition(var1, var3, var4); // L: 10472
	} // L: 10473

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-94"
	)
	final void method1259() {
		class144.invalidateWidget(clickedWidget); // L: 11430
		++class96.widgetDragDuration; // L: 11431
		if (field755 && field672) { // L: 11432
			int var1 = MouseHandler.MouseHandler_x; // L: 11441
			int var2 = MouseHandler.MouseHandler_y; // L: 11442
			var1 -= widgetClickX; // L: 11443
			var2 -= widgetClickY; // L: 11444
			if (var1 < field627) { // L: 11445
				var1 = field627;
			}

			if (var1 + clickedWidget.width > field627 + clickedWidgetParent.width) { // L: 11446
				var1 = field627 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field674) { // L: 11447
				var2 = field674;
			}

			if (var2 + clickedWidget.height > field674 + clickedWidgetParent.height) { // L: 11448
				var2 = field674 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field676; // L: 11449
			int var4 = var2 - field677; // L: 11450
			int var5 = clickedWidget.dragZoneSize; // L: 11451
			if (class96.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 11452 11453
				isDraggingWidget = true; // L: 11454
			}

			int var6 = var1 - field627 + clickedWidgetParent.scrollX; // L: 11457
			int var7 = var2 - field674 + clickedWidgetParent.scrollY; // L: 11458
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 11459
				var8 = new ScriptEvent(); // L: 11460
				var8.widget = clickedWidget; // L: 11461
				var8.mouseX = var6; // L: 11462
				var8.mouseY = var7; // L: 11463
				var8.args = clickedWidget.onDrag; // L: 11464
				HealthBarUpdate.runScriptEvent(var8); // L: 11465
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 11467
				if (isDraggingWidget) { // L: 11468
					if (clickedWidget.onDragComplete != null) { // L: 11469
						var8 = new ScriptEvent(); // L: 11470
						var8.widget = clickedWidget; // L: 11471
						var8.mouseX = var6; // L: 11472
						var8.mouseY = var7; // L: 11473
						var8.dragTarget = draggedOnWidget; // L: 11474
						var8.args = clickedWidget.onDragComplete; // L: 11475
						HealthBarUpdate.runScriptEvent(var8); // L: 11476
					}

					if (draggedOnWidget != null) { // L: 11478
						Widget var9 = clickedWidget; // L: 11480
						int var10 = StructComposition.method3940(class25.getWidgetFlags(var9)); // L: 11482
						Widget var13;
						if (var10 == 0) { // L: 11483
							var13 = null; // L: 11484
						} else {
							int var11 = 0;

							while (true) {
								if (var11 >= var10) {
									var13 = var9; // L: 11494
									break;
								}

								var9 = class165.getWidget(var9.parentId); // L: 11488
								if (var9 == null) { // L: 11489
									var13 = null; // L: 11490
									break; // L: 11491
								}

								++var11; // L: 11487
							}
						}

						if (var13 != null) { // L: 11496
							PacketBufferNode var12 = class330.getPacketBufferNode(ClientPacket.field3149, packetWriter.isaacCipher); // L: 11498
							var12.packetBuffer.method9096(draggedOnWidget.itemId); // L: 11499
							var12.packetBuffer.method9107(draggedOnWidget.id); // L: 11500
							var12.packetBuffer.method9096(draggedOnWidget.childIndex); // L: 11501
							var12.packetBuffer.method9096(clickedWidget.childIndex); // L: 11502
							var12.packetBuffer.writeIntME(clickedWidget.id); // L: 11503
							var12.packetBuffer.writeShort(clickedWidget.itemId); // L: 11504
							packetWriter.addNode(var12); // L: 11505
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 11510
					this.openMenu(field676 + widgetClickX, widgetClickY + field677); // L: 11511
				} else if (menuOptionsCount > 0) { // L: 11513
					class204.method4177(field676 + widgetClickX, field677 + widgetClickY); // L: 11514
				}

				clickedWidget = null; // L: 11517
			}

		} else {
			if (class96.widgetDragDuration > 1) { // L: 11433
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 11434
					class204.method4177(field676 + widgetClickX, field677 + widgetClickY); // L: 11435
				}

				clickedWidget = null; // L: 11437
			}

		}
	} // L: 11439 11519

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(I)Ltm;",
		garbageValue = "637501068"
	)
	@Export("username")
	public Username username() {
		return MusicPatchNode.localPlayer != null ? MusicPatchNode.localPlayer.username : null; // L: 12170
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 727
				int var3;
				for (int var1 = 0; var1 <= 28; ++var1) { // L: 728
					String var2 = this.getParameter(Integer.toString(var1)); // L: 729
					if (var2 != null) { // L: 730
						switch(var1) { // L: 731
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 786
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 787
							}
							break;
						case 4:
							if (clientType == -1) { // L: 759
								clientType = Integer.parseInt(var2); // L: 760
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 817
							break;
						case 6:
							ClanSettings.clientLanguage = Language.method6921(Integer.parseInt(var2)); // L: 749
							break; // L: 750
						case 7:
							class223.field2611 = class146.method3269(Integer.parseInt(var2)); // L: 734
							break; // L: 735
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 799
							}
							break;
						case 9:
							class108.field1403 = var2; // L: 766
							break; // L: 767
						case 10:
							field490 = (StudioGame)StructComposition.findEnumerated(TaskHandler.method3567(), Integer.parseInt(var2)); // L: 792
							if (field490 == StudioGame.oldscape) { // L: 793
								class70.loginType = LoginType.oldscape;
							} else {
								class70.loginType = LoginType.field4914; // L: 794
							}
							break;
						case 11:
							ViewportMouse.field2774 = var2; // L: 781
							break; // L: 782
						case 12:
							worldId = Integer.parseInt(var2); // L: 771
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
							TriBool.field4600 = Integer.parseInt(var2); // L: 754
							break; // L: 755
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 776
							break; // L: 777
						case 17:
							GrandExchangeOffer.field4294 = var2; // L: 739
							break; // L: 740
						case 21:
							field493 = Integer.parseInt(var2); // L: 744
							break; // L: 745
						case 25:
							var3 = var2.indexOf("."); // L: 805
							if (var3 == -1) { // L: 806
								field497 = Integer.parseInt(var2); // L: 807
							} else {
								field497 = Integer.parseInt(var2.substring(0, var3)); // L: 810
								Integer.parseInt(var2.substring(var3 + 1)); // L: 811
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 824
				isLowDetail = false; // L: 825
				UserComparator8.worldHost = this.getCodeBase().getHost(); // L: 827
				String var11 = class223.field2611.name; // L: 828
				byte var12 = 0; // L: 829

				try {
					JagexCache.idxCount = 22; // L: 832
					JagexCache.cacheGamebuild = var12; // L: 833

					try {
						ModeWhere.operatingSystemName = System.getProperty("os.name"); // L: 835
					} catch (Exception var18) { // L: 837
						ModeWhere.operatingSystemName = "Unknown"; // L: 838
					}

					WorldMapSectionType.formattedOperatingSystemName = ModeWhere.operatingSystemName.toLowerCase(); // L: 840

					try {
						HorizontalAlignment.userHomeDirectory = System.getProperty("user.home"); // L: 842
						if (HorizontalAlignment.userHomeDirectory != null) { // L: 843
							HorizontalAlignment.userHomeDirectory = HorizontalAlignment.userHomeDirectory + "/";
						}
					} catch (Exception var17) { // L: 845
					}

					try {
						if (WorldMapSectionType.formattedOperatingSystemName.startsWith("win")) { // L: 847
							if (HorizontalAlignment.userHomeDirectory == null) { // L: 848
								HorizontalAlignment.userHomeDirectory = System.getenv("USERPROFILE");
							}
						} else if (HorizontalAlignment.userHomeDirectory == null) { // L: 851
							HorizontalAlignment.userHomeDirectory = System.getenv("HOME");
						}

						if (HorizontalAlignment.userHomeDirectory != null) { // L: 853
							HorizontalAlignment.userHomeDirectory = HorizontalAlignment.userHomeDirectory + "/";
						}
					} catch (Exception var16) { // L: 855
					}

					if (HorizontalAlignment.userHomeDirectory == null) { // L: 856
						HorizontalAlignment.userHomeDirectory = "~/";
					}

					class130.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", HorizontalAlignment.userHomeDirectory, "/tmp/", ""}; // L: 857
					class96.cacheSubPaths = new String[]{".jagex_cache_" + JagexCache.cacheGamebuild, ".file_store_" + JagexCache.cacheGamebuild}; // L: 858

					label155:
					for (var3 = 0; var3 < 4; ++var3) { // L: 859
						class335.cacheDir = ClanSettings.method3356("oldschool", var11, var3); // L: 860
						if (!class335.cacheDir.exists()) { // L: 861
							class335.cacheDir.mkdirs();
						}

						File[] var4 = class335.cacheDir.listFiles(); // L: 862
						if (var4 == null) { // L: 863
							break;
						}

						File[] var5 = var4; // L: 865
						int var6 = 0;

						while (true) {
							if (var6 >= var5.length) {
								break label155;
							}

							File var7 = var5[var6]; // L: 867

							boolean var8;
							try {
								RandomAccessFile var9 = new RandomAccessFile(var7, "rw"); // L: 872
								int var10 = var9.read(); // L: 873
								var9.seek(0L); // L: 874
								var9.write(var10); // L: 875
								var9.seek(0L); // L: 876
								var9.close(); // L: 877
								var8 = true; // L: 879
							} catch (Exception var15) { // L: 881
								var8 = false; // L: 882
							}

							if (!var8) { // L: 885
								break;
							}

							++var6; // L: 866
						}
					}

					File var13 = class335.cacheDir; // L: 892
					class513.FileSystem_cacheDir = var13; // L: 894
					if (!class513.FileSystem_cacheDir.exists()) { // L: 895
						throw new RuntimeException("");
					}

					FileSystem.FileSystem_hasPermissions = true; // L: 896
					Tiles.method2222(); // L: 898
					JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class138.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 899
					JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class138.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 900
					class370.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount]; // L: 901

					for (int var14 = 0; var14 < JagexCache.idxCount; ++var14) { // L: 902
						class370.JagexCache_idxFiles[var14] = new BufferedFile(new AccessFile(class138.getFile("main_file_cache.idx" + var14), "rw", 1048576L), 6000, 0); // L: 903
					}
				} catch (Exception var19) { // L: 907
					class387.RunException_sendStackTrace((String)null, var19); // L: 908
				}

				ScriptFrame.client = this; // L: 910
				RunException.clientType = clientType; // L: 911
				ModeWhere.field4347 = System.getenv("JX_ACCESS_TOKEN"); // L: 913
				TileItem.field1318 = System.getenv("JX_REFRESH_TOKEN"); // L: 914
				SpriteMask.field3475 = System.getenv("JX_SESSION_ID"); // L: 915
				class121.field1471 = System.getenv("JX_CHARACTER_ID"); // L: 916
				String var21 = System.getenv("JX_DISPLAY_NAME"); // L: 917
				Login.field911 = class31.method469(var21); // L: 919
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) { // L: 922
					this.field533 = true; // L: 923
				}

				if (field495 == -1) { // L: 925
					if (!this.method1431() && !this.method1234()) { // L: 926
						field495 = 0; // L: 930
					} else {
						field495 = 5; // L: 927
					}
				}

				this.startThread(765, 503, 213, 1); // L: 933
			}
		} catch (RuntimeException var20) {
			throw HealthBar.newRunException(var20, "client.init(" + ')');
		}
	} // L: 934

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 939
			this.otlTokenRequester = var1; // L: 942
			class129.method3124(10); // L: 943
		}
	} // L: 940 944

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 949
			this.field551 = var1; // L: 952
		}
	} // L: 950 953

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 958
	}

	public long getAccountHash() {
		return this.accountHash; // L: 963
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;B)V",
		garbageValue = "-10"
	)
	public static void method1770(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0; // L: 29
		KitDefinition.KitDefinition_modelsArchive = var1; // L: 30
		KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 31
	} // L: 32

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "-668307175"
	)
	static int method1233(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 4356
			logoutTimer = 250; // L: 4357
			return 1; // L: 4358
		} else {
			return 2; // L: 4360
		}
	}
}
