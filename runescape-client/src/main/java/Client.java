import com.jagex.oldscape.pub.OtlTokenRequester;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
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
	@ObfuscatedName("vk")
	@ObfuscatedGetter(
		intValue = -1732549567
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("va")
	@ObfuscatedGetter(
		intValue = 1294513815
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("wq")
	@ObfuscatedGetter(
		intValue = 1840205411
	)
	public static int field574;
	@ObfuscatedName("tt")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final ApproximateRouteStrategy field571;
	@ObfuscatedName("tc")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("uq")
	static boolean field737;
	@ObfuscatedName("wi")
	static int[] field542;
	@ObfuscatedName("wy")
	static int[] field773;
	@ObfuscatedName("ve")
	@ObfuscatedGetter(
		intValue = -1846454579
	)
	static int field756;
	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = -305966553
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("tx")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("vv")
	@ObfuscatedGetter(
		intValue = -131617713
	)
	static int field718;
	@ObfuscatedName("ta")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("tq")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "[Lbt;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("to")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("wk")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wn")
	@ObfuscatedGetter(
		intValue = 443468111
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("uz")
	static boolean[] field738;
	@ObfuscatedName("vt")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("vp")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("archive5")
	static class394 archive5;
	@ObfuscatedName("ur")
	static int[] field739;
	@ObfuscatedName("um")
	static int[] field680;
	@ObfuscatedName("ux")
	static int[] field741;
	@ObfuscatedName("up")
	static int[] field566;
	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "[Lnd;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("un")
	static short field544;
	@ObfuscatedName("ud")
	static short field744;
	@ObfuscatedName("vg")
	static short field749;
	@ObfuscatedName("vd")
	static short field750;
	@ObfuscatedName("vh")
	static short field748;
	@ObfuscatedName("tf")
	@ObfuscatedGetter(
		intValue = -1797839359
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("vb")
	@ObfuscatedGetter(
		intValue = 858349147
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vl")
	static short field747;
	@ObfuscatedName("vq")
	@ObfuscatedGetter(
		intValue = 83246885
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("we")
	@ObfuscatedGetter(
		intValue = 280209169
	)
	static int field715;
	@ObfuscatedName("vm")
	@ObfuscatedGetter(
		intValue = 133193101
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("ut")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("ui")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "Lck;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wf")
	@ObfuscatedGetter(
		intValue = 1754062913
	)
	static int field765;
	@ObfuscatedName("wl")
	static List field745;
	@ObfuscatedName("bf")
	static boolean field480;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1239493743
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 704671857
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -160706203
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cj")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cn")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -1882712249
	)
	static int field486;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1597109709
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 86585189
	)
	static int field488;
	@ObfuscatedName("cg")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1643853917
	)
	static int field557;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -2124451829
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dn")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 1940108065
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		longValue = 8798868725760291405L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = 1324416435
	)
	static int field515;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = -1774993997
	)
	static int field496;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		longValue = -7563188290475486249L
	)
	static long field497;
	@ObfuscatedName("eb")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = -1010329251
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = 1601373129
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = 582875797
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = -1164164871
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = 999832987
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = -101508831
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = 526038926
	)
	static int field505;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = -64569664
	)
	static int field506;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = -600534921
	)
	static int field669;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = -784948615
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("fe")
	@ObfuscatedGetter(
		intValue = 1611983557
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("fl")
	@ObfuscatedGetter(
		intValue = -1726871617
	)
	static int field512;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -1567330501
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = 1806142215
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = -1056649217
	)
	static int field549;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = -1530752341
	)
	static int field516;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = 2117126047
	)
	static int field487;
	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	static class136 field518;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	static class482 field519;
	@ObfuscatedName("hv")
	static final String field499;
	@ObfuscatedName("hq")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("hz")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "[Ldz;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 1679964095
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("is")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = -812139027
	)
	static int field539;
	@ObfuscatedName("ij")
	static int[] field662;
	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = -2063226693
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ih")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("iw")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("it")
	static String field640;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = -1806595179
	)
	static int field627;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 2078178879
	)
	static int field479;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = 1551575329
	)
	static int field548;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = -1458258409
	)
	static int field775;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = 46285923
	)
	static int field501;
	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "[Liz;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("jq")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jh")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("jy")
	static final int[] field554;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 888042879
	)
	static int field631;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = -465899253
	)
	static int field556;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = 964912341
	)
	static int field555;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = 887107107
	)
	static int field558;
	@ObfuscatedName("kf")
	@ObfuscatedGetter(
		intValue = 1243290591
	)
	static int field559;
	@ObfuscatedName("kw")
	static boolean field560;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = -1791444461
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 1394082153
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 1027452777
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = -829530353
	)
	static int field564;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -1287210405
	)
	static int field546;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = 719527801
	)
	static int field691;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = 1381924855
	)
	static int field567;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 819645621
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("ke")
	@ObfuscatedGetter(
		intValue = -804166653
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = -1672453785
	)
	static int field570;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = 1785909097
	)
	static int field740;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 776539313
	)
	static int field599;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = 1001880197
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = -711638791
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = -1978635877
	)
	static int field575;
	@ObfuscatedName("lb")
	static boolean field553;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = -1625953571
	)
	static int field577;
	@ObfuscatedName("lh")
	static boolean field578;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = 1213218601
	)
	static int field500;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 2020862949
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = 1270165343
	)
	static int field581;
	@ObfuscatedName("li")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("lt")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ll")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("le")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("lu")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("ls")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("la")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("lc")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("lo")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = -209298997
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = 709631145
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = 50695989
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -1594351991
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = -1933203361
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = 745575289
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = -1435919357
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("mo")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = -83285091
	)
	static int field667;
	@ObfuscatedName("ms")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "[Ldh;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = 1045966863
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = -320174999
	)
	static int field603;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		longValue = 3740577499301829319L
	)
	static long field671;
	@ObfuscatedName("mc")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = 1859570443
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = -354872623
	)
	static int field607;
	@ObfuscatedName("mp")
	static int[] field608;
	@ObfuscatedName("ns")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ne")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("nk")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("nz")
	static int[] field612;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = -781597715
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "[[[Lnj;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("nv")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nd")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("no")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nb")
	static boolean field621;
	@ObfuscatedName("nu")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = -638635143
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("nj")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("nc")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("ni")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("ny")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("nn")
	static int[] field628;
	@ObfuscatedName("nh")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("om")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("oa")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("ok")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ov")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("og")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = -203153139
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = -582123169
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = 1543695569
	)
	static int field536;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = -1106497607
	)
	static int field550;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = 1216314019
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("on")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = -434988193
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = 829764683
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("os")
	static String field711;
	@ObfuscatedName("ox")
	static String field645;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = -1481437049
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = 281694929
	)
	static int field648;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = 1342292641
	)
	static int field763;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 360881141
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = 633577609
	)
	static int field652;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = 1614327295
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = 863173745
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = 1037229811
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pk")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = -1658137385
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = -1525842885
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pt")
	static boolean field663;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = 1602569321
	)
	static int field664;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = 1694095059
	)
	static int field597;
	@ObfuscatedName("pr")
	static boolean field771;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 1838487771
	)
	static int field572;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = 48842723
	)
	static int field668;
	@ObfuscatedName("pv")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = 495285343
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qt")
	static int[] field579;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = 851598891
	)
	static int field672;
	@ObfuscatedName("qo")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = 257135263
	)
	static int field666;
	@ObfuscatedName("qv")
	static int[] field675;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = -1272683167
	)
	static int field676;
	@ObfuscatedName("qf")
	static int[] field677;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = 212048049
	)
	static int field678;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = 274438877
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = 237918075
	)
	static int field701;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = 1649389357
	)
	static int field525;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = 2026078347
	)
	static int field682;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = -731591385
	)
	static int field482;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = 759595907
	)
	static int field643;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = -1829225
	)
	static int field685;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = 1247791327
	)
	static int field686;
	@ObfuscatedName("rx")
	@ObfuscatedGetter(
		intValue = -818502501
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	static class495 field688;
	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	static NodeDeque field690;
	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	static NodeDeque field529;
	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	static NodeDeque field692;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = -1159416189
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = 707915123
	)
	static int field695;
	@ObfuscatedName("rp")
	static boolean[] field722;
	@ObfuscatedName("rz")
	static boolean[] field697;
	@ObfuscatedName("rh")
	static boolean[] field698;
	@ObfuscatedName("ri")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("rn")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("rm")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("rl")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = -762937085
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		longValue = -534961974875285193L
	)
	static long field696;
	@ObfuscatedName("rr")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sd")
	static int[] field706;
	@ObfuscatedName("sv")
	@ObfuscatedGetter(
		intValue = -1103514873
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("st")
	@ObfuscatedGetter(
		intValue = 87475353
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sh")
	static String field637;
	@ObfuscatedName("si")
	static long[] field710;
	@ObfuscatedName("se")
	@ObfuscatedGetter(
		intValue = -2087955713
	)
	static int field752;
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static class208 field712;
	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	static class206 field713;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = -1814462933
	)
	static int field714;
	@ObfuscatedName("sw")
	static int[] field641;
	@ObfuscatedName("so")
	static int[] field716;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		longValue = -8710460316201288843L
	)
	static long field622;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "[Lfi;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "[Lgn;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = -1042588199
	)
	static int field720;
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = -1011636969
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("sa")
	static int[] field709;
	@ObfuscatedName("sr")
	static int[] field723;
	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "[Lsn;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tl")
	@ObfuscatedGetter(
		intValue = 1681066915
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("tg")
	@ObfuscatedGetter(
		intValue = 1663774571
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tw")
	@ObfuscatedGetter(
		intValue = -178662269
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("gf")
	String field520;
	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	class14 field521;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	class18 field522;
	@ObfuscatedName("gv")
	@Export("otlTokenRequester")
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("gt")
	Future field524;
	@ObfuscatedName("hb")
	boolean field606;
	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	class18 field526;
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field527;
	@ObfuscatedName("hr")
	@Export("otlTokenRequest")
	Future otlTokenRequest;
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	Buffer field634;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	class7 field658;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		longValue = -1510702780732422111L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field480 = true; // L: 157
		worldId = 1; // L: 158
		worldProperties = 0; // L: 159
		gameBuild = 0; // L: 161
		isMembersWorld = false; // L: 164
		isLowDetail = false; // L: 165
		field486 = -1; // L: 170
		clientType = -1; // L: 171
		field488 = -1; // L: 172
		onMobile = false; // L: 173
		field557 = 212; // L: 174
		gameState = 0; // L: 186
		isLoading = true; // L: 210
		cycle = 0; // L: 211
		mouseLastLastPressedTimeMillis = -1L; // L: 212
		field515 = -1; // L: 214
		field496 = -1; // L: 215
		field497 = -1L; // L: 216
		hadFocus = true; // L: 217
		rebootTimer = 0; // L: 218
		hintArrowType = 0; // L: 219
		hintArrowNpcIndex = 0; // L: 220
		hintArrowPlayerIndex = 0; // L: 221
		hintArrowX = 0; // L: 222
		hintArrowY = 0; // L: 223
		field505 = 0; // L: 224
		field506 = 0; // L: 225
		field669 = 0; // L: 226
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 228
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 229
		titleLoadingStage = 0; // L: 238
		js5ConnectState = 0; // L: 241
		field512 = 0; // L: 242
		js5Errors = 0; // L: 265
		loginState = 0; // L: 267
		field549 = 0; // L: 268
		field516 = 0; // L: 269
		field487 = 0; // L: 270
		field518 = class136.field1595; // L: 271
		field519 = class482.field4962; // L: 272
		int var1 = "com_jagex_auth_desktop_osrs:public".length(); // L: 299
		byte[] var2 = new byte[var1]; // L: 300

		for (int var3 = 0; var3 < var1; ++var3) { // L: 301
			char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3); // L: 302
			if (var4 > 127) { // L: 303
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 304
			}
		}

		field499 = GrandExchangeEvents.method6539(var2); // L: 308
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null; // L: 328
		npcs = new NPC[65536]; // L: 332
		npcCount = 0; // L: 333
		npcIndices = new int[65536]; // L: 334
		field539 = 0; // L: 335
		field662 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0; // L: 341
		hadNetworkError = false; // L: 342
		timer = new Timer(); // L: 343
		fontsMap = new HashMap(); // L: 349
		field627 = 0; // L: 356
		field479 = 1; // L: 357
		field548 = 0; // L: 358
		field775 = 1; // L: 359
		field501 = 0; // L: 360
		collisionMaps = new CollisionMap[4]; // L: 368
		isInInstance = false; // L: 369
		instanceChunkTemplates = new int[4][13][13]; // L: 370
		field554 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 371
		field631 = 0; // L: 374
		field556 = 2301979; // L: 386
		field555 = 5063219; // L: 387
		field558 = 3353893; // L: 388
		field559 = 7759444; // L: 389
		field560 = false; // L: 390
		alternativeScrollbarWidth = 0; // L: 391
		camAngleX = 128; // L: 399
		camAngleY = 0; // L: 400
		field564 = 0; // L: 401
		field546 = 0; // L: 402
		field691 = 0; // L: 403
		field567 = 0; // L: 404
		oculusOrbState = 0; // L: 405
		camFollowHeight = 50; // L: 406
		field570 = 0; // L: 410
		field740 = 0; // L: 411
		field599 = 0; // L: 412
		oculusOrbNormalSpeed = 12; // L: 414
		oculusOrbSlowedSpeed = 6; // L: 415
		field575 = 0; // L: 416
		field553 = false; // L: 417
		field577 = 0; // L: 418
		field578 = false; // L: 419
		field500 = 0; // L: 420
		overheadTextCount = 0; // L: 421
		field581 = 50; // L: 422
		overheadTextXs = new int[field581]; // L: 423
		overheadTextYs = new int[field581]; // L: 424
		overheadTextAscents = new int[field581]; // L: 425
		overheadTextXOffsets = new int[field581]; // L: 426
		overheadTextColors = new int[field581]; // L: 427
		overheadTextEffects = new int[field581]; // L: 428
		overheadTextCyclesRemaining = new int[field581]; // L: 429
		overheadText = new String[field581]; // L: 430
		tileLastDrawnActor = new int[104][104]; // L: 431
		viewportDrawCount = 0; // L: 432
		viewportTempX = -1; // L: 433
		viewportTempY = -1; // L: 434
		mouseCrossX = 0; // L: 435
		mouseCrossY = 0; // L: 436
		mouseCrossState = 0; // L: 437
		mouseCrossColor = 0; // L: 438
		showMouseCross = true; // L: 439
		field667 = 0; // L: 440
		showLoadingMessages = true; // L: 442
		players = new Player[2048]; // L: 444
		localPlayerIndex = -1; // L: 446
		field603 = 0; // L: 447
		field671 = -1L; // L: 448
		renderSelf = true; // L: 450
		drawPlayerNames = 0; // L: 455
		field607 = 0; // L: 456
		field608 = new int[1000]; // L: 457
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 459
		playerMenuActions = new String[8]; // L: 460
		playerOptionsPriorities = new boolean[8]; // L: 461
		field612 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 462
		combatTargetPlayerIndex = -1; // L: 463
		groundItems = new NodeDeque[4][104][104]; // L: 464
		pendingSpawns = new NodeDeque(); // L: 465
		projectiles = new NodeDeque(); // L: 466
		graphicsObjects = new NodeDeque(); // L: 467
		currentLevels = new int[25]; // L: 468
		levels = new int[25]; // L: 469
		experience = new int[25]; // L: 470
		field621 = false; // L: 471
		isMenuOpen = false; // L: 472
		menuOptionsCount = 0; // L: 478
		menuArguments1 = new int[500]; // L: 479
		menuArguments2 = new int[500]; // L: 480
		menuOpcodes = new int[500]; // L: 481
		menuIdentifiers = new int[500]; // L: 482
		field628 = new int[500]; // L: 483
		menuActions = new String[500]; // L: 484
		menuTargets = new String[500]; // L: 485
		menuShiftClick = new boolean[500]; // L: 486
		followerOpsLowPriority = false; // L: 487
		tapToDrop = false; // L: 489
		showMouseOverText = true; // L: 490
		viewportX = -1; // L: 491
		viewportY = -1; // L: 492
		field536 = 0; // L: 496
		field550 = 50; // L: 497
		isItemSelected = 0; // L: 498
		field640 = null; // L: 502
		isSpellSelected = false; // L: 503
		selectedSpellChildIndex = -1; // L: 505
		selectedSpellItemId = -1; // L: 506
		field711 = null; // L: 508
		field645 = null; // L: 509
		rootInterface = -1; // L: 510
		interfaceParents = new NodeHashTable(8); // L: 511
		field648 = 0; // L: 516
		field763 = -1; // L: 517
		chatEffects = 0; // L: 518
		meslayerContinueWidget = null; // L: 519
		field652 = 0; // L: 520
		weight = 0; // L: 521
		staffModLevel = 0; // L: 522
		followerIndex = -1; // L: 523
		playerMod = false; // L: 524
		viewportWidget = null; // L: 525
		clickedWidget = null; // L: 526
		clickedWidgetParent = null; // L: 527
		widgetClickX = 0; // L: 528
		widgetClickY = 0; // L: 529
		draggedOnWidget = null; // L: 530
		field663 = false; // L: 531
		field664 = -1; // L: 532
		field597 = -1; // L: 533
		field771 = false; // L: 534
		field572 = -1; // L: 535
		field668 = -1; // L: 536
		isDraggingWidget = false; // L: 537
		cycleCntr = 1; // L: 542
		field579 = new int[32]; // L: 545
		field672 = 0; // L: 546
		changedItemContainers = new int[32]; // L: 547
		field666 = 0; // L: 548
		field675 = new int[32]; // L: 549
		field676 = 0; // L: 550
		field677 = new int[32]; // L: 551
		field678 = 0; // L: 552
		chatCycle = 0; // L: 553
		field701 = 0; // L: 554
		field525 = 0; // L: 555
		field682 = 0; // L: 556
		field482 = 0; // L: 557
		field643 = 0; // L: 558
		field685 = 0; // L: 559
		field686 = 0; // L: 560
		mouseWheelRotation = 0; // L: 566
		field688 = new class495(); // L: 567
		scriptEvents = new NodeDeque(); // L: 568
		field690 = new NodeDeque(); // L: 569
		field529 = new NodeDeque(); // L: 570
		field692 = new NodeDeque(); // L: 571
		widgetFlags = new NodeHashTable(512); // L: 572
		rootWidgetCount = 0; // L: 574
		field695 = -2; // L: 575
		field722 = new boolean[100]; // L: 576
		field697 = new boolean[100]; // L: 577
		field698 = new boolean[100]; // L: 578
		rootWidgetXs = new int[100]; // L: 579
		rootWidgetYs = new int[100]; // L: 580
		rootWidgetWidths = new int[100]; // L: 581
		rootWidgetHeights = new int[100]; // L: 582
		gameDrawingMode = 0; // L: 583
		field696 = 0L; // L: 584
		isResizable = true; // L: 585
		field706 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 592
		publicChatMode = 0; // L: 593
		tradeChatMode = 0; // L: 595
		field637 = ""; // L: 596
		field710 = new long[100]; // L: 598
		field752 = 0; // L: 599
		field712 = new class208(); // L: 600
		field713 = new class206(); // L: 601
		field714 = 0; // L: 603
		field641 = new int[128]; // L: 604
		field716 = new int[128]; // L: 605
		field622 = -1L; // L: 606
		currentClanSettings = new ClanSettings[4]; // L: 610
		currentClanChannels = new ClanChannel[4]; // L: 612
		field720 = -1; // L: 614
		mapIconCount = 0; // L: 615
		field709 = new int[1000]; // L: 616
		field723 = new int[1000]; // L: 617
		mapIcons = new SpritePixels[1000]; // L: 618
		destinationX = 0; // L: 619
		destinationY = 0; // L: 620
		minimapState = 0; // L: 627
		currentTrackGroupId = -1; // L: 628
		playingJingle = false; // L: 629
		soundEffectCount = 0; // L: 635
		soundEffectIds = new int[50]; // L: 636
		queuedSoundEffectLoops = new int[50]; // L: 637
		queuedSoundEffectDelays = new int[50]; // L: 638
		soundLocations = new int[50]; // L: 639
		soundEffects = new SoundEffect[50]; // L: 640
		isCameraLocked = false; // L: 642
		field737 = false; // L: 653
		field738 = new boolean[5]; // L: 661
		field739 = new int[5]; // L: 662
		field680 = new int[5]; // L: 663
		field741 = new int[5]; // L: 664
		field566 = new int[5]; // L: 665
		field544 = 256; // L: 666
		field744 = 205; // L: 667
		zoomHeight = 256; // L: 668
		zoomWidth = 320; // L: 669
		field747 = 1; // L: 670
		field748 = 32767; // L: 671
		field749 = 1; // L: 672
		field750 = 32767; // L: 673
		viewportOffsetX = 0; // L: 674
		viewportOffsetY = 0; // L: 675
		viewportWidth = 0; // L: 676
		viewportHeight = 0; // L: 677
		viewportZoom = 0; // L: 678
		playerAppearance = new PlayerComposition(); // L: 680
		field756 = -1; // L: 681
		field718 = -1; // L: 682
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 684
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 686
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 689
		archive5 = new class394(8, class392.field4475); // L: 691
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 692
		Widget_cachedFonts = new EvictingDualNodeHashTable(64); // L: 693
		field765 = -1; // L: 696
		field574 = -1; // L: 702
		field745 = new ArrayList(); // L: 703
		archiveLoaders = new ArrayList(10); // L: 704
		archiveLoadersDone = 0; // L: 705
		field715 = 0; // L: 706
		field571 = new ApproximateRouteStrategy(); // L: 715
		field542 = new int[50]; // L: 716
		field773 = new int[50]; // L: 717
	}

	public Client() {
		this.field606 = false; // L: 290
		this.accountHash = -1L;
	} // L: 327

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1315269031"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field696 = WorldMapSection2.method4844() + 500L; // L: 4340
		this.resizeJS(); // L: 4341
		if (rootInterface != -1) { // L: 4342
			this.resizeRoot(true);
		}

	} // L: 4343

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1812622075"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000}; // L: 965
		int[] var2 = new int[]{1000, 100, 500}; // L: 966
		if (var1 != null && var2 != null) { // L: 968
			class212.ByteArrayPool_alternativeSizes = var1; // L: 975
			SoundSystem.ByteArrayPool_altSizeArrayCounts = new int[var1.length]; // L: 976
			InterfaceParent.ByteArrayPool_arrays = new byte[var1.length][][]; // L: 977

			for (int var3 = 0; var3 < class212.ByteArrayPool_alternativeSizes.length; ++var3) { // L: 978
				InterfaceParent.ByteArrayPool_arrays[var3] = new byte[var2[var3]][]; // L: 979
				ByteArrayPool.field4424.add(var1[var3]); // L: 980
			}

			Collections.sort(ByteArrayPool.field4424); // L: 982
		} else {
			class212.ByteArrayPool_alternativeSizes = null; // L: 969
			SoundSystem.ByteArrayPool_altSizeArrayCounts = null; // L: 970
			InterfaceParent.ByteArrayPool_arrays = null; // L: 971
			SpriteMask.method5743(); // L: 972
		}

		class290.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 984
		Calendar.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 985
		ClanSettings.currentPort = class290.worldPort; // L: 986
		class308.field3457 = class311.field3505; // L: 987
		CollisionMap.field2315 = class311.field3503; // L: 988
		class128.field1529 = class311.field3507; // L: 989
		class126.field1495 = class311.field3502; // L: 990
		class345.urlRequester = new class110(this.field606, 212); // L: 991
		this.setUpKeyboard(); // L: 992
		this.method486(); // L: 993
		class7.mouseWheel = this.mouseWheel(); // L: 994
		this.method476(field713, 0); // L: 995
		this.method476(field712, 1); // L: 996
		MidiPcmStream.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 997
		AccessFile var4 = null; // L: 1000
		ClientPreferences var5 = new ClientPreferences(); // L: 1001

		try {
			var4 = class350.getPreferencesFile("", class470.field4870.name, false); // L: 1003
			byte[] var6 = new byte[(int)var4.length()]; // L: 1004

			int var8;
			for (int var7 = 0; var7 < var6.length; var7 += var8) { // L: 1005 1006 1009
				var8 = var4.read(var6, var7, var6.length - var7); // L: 1007
				if (var8 == -1) { // L: 1008
					throw new IOException();
				}
			}

			var5 = new ClientPreferences(new Buffer(var6)); // L: 1011
		} catch (Exception var11) { // L: 1013
		}

		try {
			if (var4 != null) { // L: 1015
				var4.close(); // L: 1016
			}
		} catch (Exception var10) { // L: 1019
		}

		WorldMapSectionType.clientPreferences = var5; // L: 1022
		this.setUpClipboard(); // L: 1023
		String var12 = UserComparator3.field1424; // L: 1025
		class31.field166 = this; // L: 1027
		if (var12 != null) { // L: 1028
			class31.field161 = var12;
		}

		NPC.setWindowedMode(WorldMapSectionType.clientPreferences.method2450()); // L: 1030
		class6.friendSystem = new FriendSystem(Occluder.loginType); // L: 1031
		this.field521 = new class14("tokenRequest", 1, 1); // L: 1032
	} // L: 1033

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1041
		this.doCycleJs5(); // L: 1042
		VerticalAlignment.method3716(); // L: 1043

		int var1;
		try {
			if (class293.musicPlayerStatus == 1) { // L: 1046
				var1 = class293.midiPcmStream.method5526(); // L: 1047
				if (var1 > 0 && class293.midiPcmStream.isReady()) { // L: 1048
					var1 -= AbstractRasterProvider.pcmSampleLength; // L: 1049
					if (var1 < 0) { // L: 1050
						var1 = 0;
					}

					class293.midiPcmStream.setPcmStreamVolume(var1); // L: 1051
				} else {
					class293.midiPcmStream.clear(); // L: 1054
					class293.midiPcmStream.removeAll(); // L: 1055
					if (class364.musicTrackArchive != null) { // L: 1056
						class293.musicPlayerStatus = 2;
					} else {
						class293.musicPlayerStatus = 0; // L: 1057
					}

					BufferedNetSocket.musicTrack = null; // L: 1058
					class293.soundCache = null; // L: 1059
				}
			}
		} catch (Exception var5) { // L: 1062
			var5.printStackTrace(); // L: 1063
			class293.midiPcmStream.clear(); // L: 1064
			class293.musicPlayerStatus = 0; // L: 1065
			BufferedNetSocket.musicTrack = null; // L: 1066
			class293.soundCache = null; // L: 1067
			class364.musicTrackArchive = null; // L: 1068
		}

		EnumComposition.playPcmPlayers(); // L: 1071
		field712.method4085(); // L: 1072
		this.method484(); // L: 1073
		synchronized(MouseHandler.KeyHandler_instance) { // L: 1075
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 1076
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 1077
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 1078
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 1079
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 1080
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 1081
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 1082
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 1083
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 1084
		} // L: 1085

		if (class7.mouseWheel != null) { // L: 1087
			var1 = class7.mouseWheel.useRotation(); // L: 1088
			mouseWheelRotation = var1; // L: 1089
		}

		if (gameState == 0) { // L: 1091
			GrandExchangeOfferOwnWorldComparator.load(); // L: 1092
			class332.method6352(); // L: 1093
		} else if (gameState == 5) { // L: 1095
			class288.method5481(this, Calendar.fontPlain11, class420.fontPlain12); // L: 1096
			GrandExchangeOfferOwnWorldComparator.load(); // L: 1097
			class332.method6352(); // L: 1098
		} else if (gameState != 10 && gameState != 11) { // L: 1100
			if (gameState == 20) { // L: 1101
				class288.method5481(this, Calendar.fontPlain11, class420.fontPlain12); // L: 1102
				this.doCycleLoggedOut(); // L: 1103
			} else if (gameState == 50) { // L: 1105
				class288.method5481(this, Calendar.fontPlain11, class420.fontPlain12); // L: 1106
				this.doCycleLoggedOut(); // L: 1107
			} else if (gameState == 25) { // L: 1109
				SoundSystem.method834();
			}
		} else {
			class288.method5481(this, Calendar.fontPlain11, class420.fontPlain12);
		}

		if (gameState == 30) { // L: 1110
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) { // L: 1111
			this.doCycleLoggedOut();
		}

	} // L: 1112

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "28303"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = MusicPatchNode.method5737(); // L: 1116
		if (var2 && playingJingle && Interpreter.pcmPlayer0 != null) { // L: 1117 1118
			Interpreter.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field696 && WorldMapSection2.method4844() > field696) { // L: 1120 1121
			NPC.setWindowedMode(class7.getWindowedMode()); // L: 1122
		}

		int var3;
		if (var1) { // L: 1125
			for (var3 = 0; var3 < 100; ++var3) { // L: 1126
				field722[var3] = true;
			}
		}

		if (gameState == 0) { // L: 1128
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1129
			class141.drawTitle(class7.fontBold12, Calendar.fontPlain11, class420.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1130
			if (gameState == 20) { // L: 1131
				class141.drawTitle(class7.fontBold12, Calendar.fontPlain11, class420.fontPlain12);
			} else if (gameState == 50) { // L: 1132
				class141.drawTitle(class7.fontBold12, Calendar.fontPlain11, class420.fontPlain12);
			} else if (gameState == 25) { // L: 1133
				if (field501 == 1) { // L: 1134
					if (field627 > field479) { // L: 1135
						field479 = field627;
					}

					var3 = (field479 * 50 - field627 * 50) / field479; // L: 1136
					class16.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1137
				} else if (field501 == 2) { // L: 1139
					if (field548 > field775) { // L: 1140
						field775 = field548;
					}

					var3 = (field775 * 50 - field548 * 50) / field775 + 50; // L: 1141
					class16.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1142
				} else {
					class16.drawLoadingMessage("Loading - please wait.", false); // L: 1144
				}
			} else if (gameState == 30) { // L: 1146
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1147
				class16.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1148
				class16.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class141.drawTitle(class7.fontBold12, Calendar.fontPlain11, class420.fontPlain12); // L: 1138
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1149
			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1150
				if (field697[var3]) { // L: 1151
					StudioGame.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]); // L: 1152
					field697[var3] = false; // L: 1153
				}
			}
		} else if (gameState > 0) { // L: 1157
			StudioGame.rasterProvider.drawFull(0, 0); // L: 1158

			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1159
				field697[var3] = false;
			}
		}

	} // L: 1161

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-78"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class248.varcs.hasUnwrittenChanges()) { // L: 1164
			class248.varcs.write();
		}

		if (class212.mouseRecorder != null) { // L: 1165
			class212.mouseRecorder.isRunning = false;
		}

		class212.mouseRecorder = null; // L: 1166
		packetWriter.close(); // L: 1167
		if (MouseHandler.KeyHandler_instance != null) { // L: 1169
			synchronized(MouseHandler.KeyHandler_instance) { // L: 1170
				MouseHandler.KeyHandler_instance = null; // L: 1171
			} // L: 1172
		}

		class7.mouseWheel = null; // L: 1175
		if (Interpreter.pcmPlayer0 != null) { // L: 1176
			Interpreter.pcmPlayer0.shutdown();
		}

		if (ViewportMouse.pcmPlayer1 != null) { // L: 1177
			ViewportMouse.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) { // L: 1179
			NetCache.NetCache_socket.close();
		}

		TaskHandler.method3460(); // L: 1181
		if (class345.urlRequester != null) { // L: 1182
			class345.urlRequester.close(); // L: 1183
			class345.urlRequester = null; // L: 1184
		}

		class248.method5126(); // L: 1186
		this.field521.method176(); // L: 1187
	} // L: 1188

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-87"
	)
	protected final void vmethod1617() {
	} // L: 724

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-16"
	)
	boolean method1222() {
		return class308.field3460 != null && !class308.field3460.trim().isEmpty() && class12.field63 != null && !class12.field63.trim().isEmpty(); // L: 907
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1703203662"
	)
	boolean method1223() {
		return class90.field1120 != null && !class90.field1120.trim().isEmpty() && class433.field4642 != null && !class433.field4642.trim().isEmpty(); // L: 911
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "25"
	)
	@Export("isOtlTokenRequesterInitialized")
	boolean isOtlTokenRequesterInitialized() {
		return this.otlTokenRequester != null; // L: 915
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "3"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 919
		var2.put("grant_type", "refresh_token"); // L: 920
		var2.put("scope", "gamesso.token.create"); // L: 921
		var2.put("refresh_token", var1); // L: 922
		URL var3 = new URL(class211.field2334 + "shield/oauth/token" + (new class434(var2)).method7995()); // L: 923
		class390 var4 = new class390(); // L: 924
		var4.method7360(field499); // L: 925
		var4.method7359("Host", (new URL(class211.field2334)).getHost()); // L: 926
		var4.method7364(class431.field4639); // L: 927
		class9 var5 = class9.field37; // L: 928
		RefreshAccessTokenRequester var6 = this.field527; // L: 929
		if (var6 != null) { // L: 930
			this.otlTokenRequest = var6.request(var5.method63(), var3, var4.method7356(), ""); // L: 931
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field606); // L: 934
			this.field526 = this.field521.method165(var7); // L: 935
		}
	} // L: 932 936

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "193540774"
	)
	void method1384(String var1) throws IOException {
		URL var2 = new URL(class211.field2334 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 939
		class390 var3 = new class390(); // L: 940
		var3.method7357(var1); // L: 941
		class9 var4 = class9.field33; // L: 942
		OtlTokenRequester var5 = this.otlTokenRequester; // L: 943
		if (var5 != null) { // L: 944
			this.field524 = var5.request(var4.method63(), var2, var3.method7356(), ""); // L: 945
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field606); // L: 948
			this.field522 = this.field521.method165(var6); // L: 949
		}
	} // L: 946 950

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-195209311"
	)
	void method1227(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class211.field2334 + "/game-session/v1/tokens"); // L: 953
		class10 var4 = new class10(var3, class9.field37, this.field606); // L: 954
		var4.method78().method7357(var1); // L: 955
		var4.method78().method7364(class431.field4639); // L: 956
		JSONObject var5 = new JSONObject(); // L: 957
		var5.put("accountId", var2); // L: 958
		var4.method79(new class433(var5)); // L: 959
		this.field522 = this.field521.method165(var4); // L: 960
	} // L: 961

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1071068400"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1240
			long var2 = WorldMapSection2.method4844(); // L: 1243
			int var4 = (int)(var2 - NetCache.field4204); // L: 1244
			NetCache.field4204 = var2; // L: 1245
			if (var4 > 200) { // L: 1246
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4; // L: 1247
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) { // L: 1248
				var1 = true; // L: 1249
			} else if (NetCache.NetCache_socket == null) { // L: 1252
				var1 = false; // L: 1253
			} else {
				try {
					label250: {
						if (NetCache.NetCache_loadTime > 30000) { // L: 1257
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) { // L: 1258
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first(); // L: 1259
							var6 = new Buffer(4); // L: 1260
							var6.writeByte(1); // L: 1261
							var6.writeMedium((int)var5.key); // L: 1262
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1263
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key); // L: 1264
							--NetCache.NetCache_pendingPriorityWritesCount; // L: 1265
							++NetCache.NetCache_pendingPriorityResponsesCount; // L: 1266
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) { // L: 1268
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast(); // L: 1269
							var6 = new Buffer(4); // L: 1270
							var6.writeByte(0); // L: 1271
							var6.writeMedium((int)var5.key); // L: 1272
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1273
							var5.removeDual(); // L: 1274
							NetCache.NetCache_pendingResponses.put(var5, var5.key); // L: 1275
							--NetCache.NetCache_pendingWritesCount; // L: 1276
							++NetCache.NetCache_pendingResponsesCount; // L: 1277
						}

						for (int var17 = 0; var17 < 100; ++var17) { // L: 1279
							int var18 = NetCache.NetCache_socket.available(); // L: 1280
							if (var18 < 0) { // L: 1281
								throw new IOException();
							}

							if (var18 == 0) { // L: 1282
								break;
							}

							NetCache.NetCache_loadTime = 0; // L: 1283
							byte var7 = 0; // L: 1284
							if (class133.NetCache_currentResponse == null) { // L: 1285
								var7 = 8;
							} else if (NetCache.field4216 == 0) { // L: 1286
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							int var12;
							byte[] var10000;
							int var10001;
							Buffer var25;
							if (var7 > 0) { // L: 1287
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset; // L: 1288
								if (var8 > var18) { // L: 1289
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8); // L: 1290
								if (NetCache.field4213 != 0) { // L: 1291
									for (var9 = 0; var9 < var8; ++var9) { // L: 1292
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = NetCache.NetCache_responseHeaderBuffer.offset + var9;
										var10000[var10001] ^= NetCache.field4213;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer; // L: 1294
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) { // L: 1295
									break;
								}

								if (class133.NetCache_currentResponse == null) { // L: 1296
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1297
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1298
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 1299
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1300
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 1301
									long var13 = (long)(var10 + (var9 << 16)); // L: 1302
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13); // L: 1303
									VarpDefinition.field1891 = true; // L: 1304
									if (var15 == null) { // L: 1305
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13); // L: 1306
										VarpDefinition.field1891 = false; // L: 1307
									}

									if (var15 == null) { // L: 1309
										throw new IOException(); // L: 1310
									}

									int var16 = var11 == 0 ? 5 : 9; // L: 1312
									class133.NetCache_currentResponse = var15; // L: 1313
									NetCache.NetCache_responseArchiveBuffer = new Buffer(var16 + var12 + class133.NetCache_currentResponse.padding); // L: 1314
									NetCache.NetCache_responseArchiveBuffer.writeByte(var11); // L: 1315
									NetCache.NetCache_responseArchiveBuffer.writeInt(var12); // L: 1316
									NetCache.field4216 = 8; // L: 1317
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1318
								} else if (NetCache.field4216 == 0) { // L: 1321
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 1322
										NetCache.field4216 = 1; // L: 1323
										NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1324
									} else {
										class133.NetCache_currentResponse = null; // L: 1328
									}
								}
							} else {
								var8 = NetCache.NetCache_responseArchiveBuffer.array.length - class133.NetCache_currentResponse.padding; // L: 1334
								var9 = 512 - NetCache.field4216; // L: 1335
								if (var9 > var8 - NetCache.NetCache_responseArchiveBuffer.offset) { // L: 1336
									var9 = var8 - NetCache.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) { // L: 1337
									var9 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseArchiveBuffer.array, NetCache.NetCache_responseArchiveBuffer.offset, var9); // L: 1338
								if (NetCache.field4213 != 0) { // L: 1339
									for (var10 = 0; var10 < var9; ++var10) { // L: 1340
										var10000 = NetCache.NetCache_responseArchiveBuffer.array;
										var10001 = NetCache.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field4213;
									}
								}

								var25 = NetCache.NetCache_responseArchiveBuffer; // L: 1342
								var25.offset += var9;
								NetCache.field4216 += var9; // L: 1343
								if (var8 == NetCache.NetCache_responseArchiveBuffer.offset) { // L: 1344
									if (16711935L == class133.NetCache_currentResponse.key) { // L: 1345
										HealthBarUpdate.field1223 = NetCache.NetCache_responseArchiveBuffer; // L: 1346

										for (var10 = 0; var10 < 256; ++var10) { // L: 1347
											Archive var19 = NetCache.NetCache_archives[var10]; // L: 1348
											if (var19 != null) { // L: 1349
												HealthBarUpdate.field1223.offset = var10 * 8 + 5; // L: 1351
												if (HealthBarUpdate.field1223.offset >= HealthBarUpdate.field1223.array.length) { // L: 1352
													if (!var19.field4179) { // L: 1353
														throw new RuntimeException(""); // L: 1357
													}

													var19.method6386(); // L: 1354
												} else {
													var12 = HealthBarUpdate.field1223.readInt(); // L: 1359
													int var20 = HealthBarUpdate.field1223.readInt(); // L: 1360
													var19.loadIndex(var12, var20); // L: 1361
												}
											}
										}
									} else {
										NetCache.NetCache_crc.reset(); // L: 1367
										NetCache.NetCache_crc.update(NetCache.NetCache_responseArchiveBuffer.array, 0, var8); // L: 1368
										var10 = (int)NetCache.NetCache_crc.getValue(); // L: 1369
										if (var10 != class133.NetCache_currentResponse.crc) { // L: 1370
											try {
												NetCache.NetCache_socket.close(); // L: 1372
											} catch (Exception var23) { // L: 1374
											}

											++NetCache.NetCache_crcMismatches; // L: 1375
											NetCache.NetCache_socket = null; // L: 1376
											NetCache.field4213 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 1377
											var1 = false; // L: 1378
											break label250;
										}

										NetCache.NetCache_crcMismatches = 0; // L: 1381
										NetCache.NetCache_ioExceptions = 0; // L: 1382
										class133.NetCache_currentResponse.archive.write((int)(class133.NetCache_currentResponse.key & 65535L), NetCache.NetCache_responseArchiveBuffer.array, (class133.NetCache_currentResponse.key & 16711680L) == 16711680L, VarpDefinition.field1891); // L: 1383
									}

									class133.NetCache_currentResponse.remove(); // L: 1385
									if (VarpDefinition.field1891) { // L: 1386
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount; // L: 1387
									}

									NetCache.field4216 = 0; // L: 1388
									class133.NetCache_currentResponse = null; // L: 1389
									NetCache.NetCache_responseArchiveBuffer = null; // L: 1390
								} else {
									if (NetCache.field4216 != 512) { // L: 1392
										break;
									}

									NetCache.field4216 = 0;
								}
							}
						}

						var1 = true; // L: 1396
					}
				} catch (IOException var24) {
					try {
						NetCache.NetCache_socket.close(); // L: 1400
					} catch (Exception var22) { // L: 1402
					}

					++NetCache.NetCache_ioExceptions; // L: 1403
					NetCache.NetCache_socket = null; // L: 1404
					var1 = false; // L: 1405
				}
			}

			if (!var1) { // L: 1409
				this.doCycleJs5Connect();
			}

		}
	} // L: 1410

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "8388607"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1413
			this.error("js5crc"); // L: 1414
			class19.method280(1000); // L: 1415
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1418
				if (gameState <= 5) { // L: 1419
					this.error("js5io"); // L: 1420
					class19.method280(1000); // L: 1421
					return; // L: 1422
				}

				field512 = 3000; // L: 1425
				NetCache.NetCache_ioExceptions = 3; // L: 1426
			}

			if (--field512 + 1 <= 0) { // L: 1429
				try {
					if (js5ConnectState == 0) { // L: 1431
						SequenceDefinition.js5SocketTask = GameEngine.taskHandler.newSocketTask(class188.worldHost, ClanSettings.currentPort); // L: 1432
						++js5ConnectState; // L: 1433
					}

					if (js5ConnectState == 1) { // L: 1435
						if (SequenceDefinition.js5SocketTask.status == 2) { // L: 1436
							this.js5Error(-1); // L: 1437
							return; // L: 1438
						}

						if (SequenceDefinition.js5SocketTask.status == 1) { // L: 1440
							++js5ConnectState;
						}
					}

					Buffer var3;
					if (js5ConnectState == 2) { // L: 1442
						Socket var2 = (Socket)SequenceDefinition.js5SocketTask.result; // L: 1444
						BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000); // L: 1446
						PcmPlayer.js5Socket = var1; // L: 1448
						var3 = new Buffer(5); // L: 1449
						var3.writeByte(15); // L: 1450
						var3.writeInt(212); // L: 1451
						PcmPlayer.js5Socket.write(var3.array, 0, 5); // L: 1452
						++js5ConnectState; // L: 1453
						class305.field3439 = WorldMapSection2.method4844(); // L: 1454
					}

					if (js5ConnectState == 3) { // L: 1456
						if (PcmPlayer.js5Socket.available() > 0) { // L: 1457
							int var5 = PcmPlayer.js5Socket.readUnsignedByte(); // L: 1458
							if (var5 != 0) { // L: 1459
								this.js5Error(var5); // L: 1460
								return; // L: 1461
							}

							++js5ConnectState; // L: 1463
						} else if (WorldMapSection2.method4844() - class305.field3439 > 30000L) { // L: 1466
							this.js5Error(-2); // L: 1467
							return; // L: 1468
						}
					}

					if (js5ConnectState == 4) { // L: 1472
						AbstractSocket var11 = PcmPlayer.js5Socket; // L: 1473
						boolean var6 = gameState > 20; // L: 1474
						if (NetCache.NetCache_socket != null) { // L: 1476
							try {
								NetCache.NetCache_socket.close(); // L: 1478
							} catch (Exception var9) { // L: 1480
							}

							NetCache.NetCache_socket = null; // L: 1481
						}

						NetCache.NetCache_socket = var11; // L: 1483
						class166.method3383(var6); // L: 1484
						NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1485
						class133.NetCache_currentResponse = null; // L: 1486
						NetCache.NetCache_responseArchiveBuffer = null; // L: 1487
						NetCache.field4216 = 0; // L: 1488

						while (true) {
							NetFileRequest var12 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 1490
							if (var12 == null) { // L: 1491
								while (true) {
									var12 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 1497
									if (var12 == null) { // L: 1498
										if (NetCache.field4213 != 0) { // L: 1504
											try {
												var3 = new Buffer(4); // L: 1506
												var3.writeByte(4); // L: 1507
												var3.writeByte(NetCache.field4213); // L: 1508
												var3.writeShort(0); // L: 1509
												NetCache.NetCache_socket.write(var3.array, 0, 4); // L: 1510
											} catch (IOException var8) {
												try {
													NetCache.NetCache_socket.close(); // L: 1514
												} catch (Exception var7) { // L: 1516
												}

												++NetCache.NetCache_ioExceptions; // L: 1517
												NetCache.NetCache_socket = null; // L: 1518
											}
										}

										NetCache.NetCache_loadTime = 0; // L: 1521
										NetCache.field4204 = WorldMapSection2.method4844(); // L: 1522
										SequenceDefinition.js5SocketTask = null; // L: 1524
										PcmPlayer.js5Socket = null; // L: 1525
										js5ConnectState = 0; // L: 1526
										js5Errors = 0; // L: 1527
										return; // L: 1533
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var12); // L: 1499
									NetCache.NetCache_pendingWrites.put(var12, var12.key); // L: 1500
									++NetCache.NetCache_pendingWritesCount; // L: 1501
									--NetCache.NetCache_pendingResponsesCount; // L: 1502
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var12, var12.key); // L: 1492
							++NetCache.NetCache_pendingPriorityWritesCount; // L: 1493
							--NetCache.NetCache_pendingPriorityResponsesCount; // L: 1494
						}
					}
				} catch (IOException var10) { // L: 1530
					this.js5Error(-3); // L: 1531
				}

			}
		}
	} // L: 1416

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-605463704"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		SequenceDefinition.js5SocketTask = null; // L: 1536
		PcmPlayer.js5Socket = null; // L: 1537
		js5ConnectState = 0; // L: 1538
		if (ClanSettings.currentPort == class290.worldPort) { // L: 1539
			ClanSettings.currentPort = Calendar.js5Port;
		} else {
			ClanSettings.currentPort = class290.worldPort; // L: 1540
		}

		++js5Errors; // L: 1541
		if (js5Errors < 2 || var1 != 7 && var1 != 9) { // L: 1542
			if (js5Errors >= 2 && var1 == 6) { // L: 1549
				this.error("js5connect_outofdate"); // L: 1550
				class19.method280(1000); // L: 1551
			} else if (js5Errors >= 4) { // L: 1553
				if (gameState <= 5) { // L: 1554
					this.error("js5connect"); // L: 1555
					class19.method280(1000); // L: 1556
				} else {
					field512 = 3000; // L: 1558
				}
			}
		} else if (gameState <= 5) { // L: 1543
			this.error("js5connect_full"); // L: 1544
			class19.method280(1000); // L: 1545
		} else {
			field512 = 3000; // L: 1547
		}

	} // L: 1560

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-44"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 1972
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 1973

		try {
			if (loginState == 0) { // L: 1975
				if (class133.secureRandom == null && (secureRandomFuture.isDone() || field549 > 250)) { // L: 1976
					class133.secureRandom = secureRandomFuture.get(); // L: 1977
					secureRandomFuture.shutdown(); // L: 1978
					secureRandomFuture = null; // L: 1979
				}

				if (class133.secureRandom != null) { // L: 1981
					if (var1 != null) { // L: 1982
						((AbstractSocket)var1).close(); // L: 1983
						var1 = null; // L: 1984
					}

					UserComparator3.socketTask = null; // L: 1986
					hadNetworkError = false; // L: 1987
					field549 = 0; // L: 1988
					if (field519.method8928()) { // L: 1989
						if (this.method1222()) { // L: 1990
							try {
								this.requestOtlToken(class12.field63); // L: 1992
								class60.method1155(21); // L: 1993
							} catch (Throwable var26) { // L: 1995
								class364.RunException_sendStackTrace((String)null, var26); // L: 1996
								class11.getLoginError(65); // L: 1997
								return; // L: 1998
							}
						} else {
							if (!this.method1223()) { // L: 2001
								class11.getLoginError(65); // L: 2013
								return; // L: 2014
							}

							try {
								this.method1227(class90.field1120, class433.field4642); // L: 2003
								class60.method1155(20); // L: 2004
							} catch (Exception var25) { // L: 2006
								class364.RunException_sendStackTrace((String)null, var25); // L: 2007
								class11.getLoginError(65); // L: 2008
								return; // L: 2009
							}
						}
					} else {
						class60.method1155(1); // L: 2018
					}
				}
			}

			class20 var29;
			if (loginState == 21) { // L: 2022
				if (this.otlTokenRequest != null) { // L: 2023
					if (!this.otlTokenRequest.isDone()) { // L: 2024
						return; // L: 2025
					}

					if (this.otlTokenRequest.isCancelled()) { // L: 2027
						class11.getLoginError(65); // L: 2028
						this.otlTokenRequest = null; // L: 2029
						return; // L: 2030
					}

					try {
						OtlTokenResponse var3 = (OtlTokenResponse)this.otlTokenRequest.get(); // L: 2033
						if (!var3.isSuccess()) { // L: 2034
							class11.getLoginError(65); // L: 2035
							this.otlTokenRequest = null; // L: 2036
							return; // L: 2037
						}

						class308.field3460 = var3.getAccessToken(); // L: 2039
						class12.field63 = var3.getRefreshToken(); // L: 2040
						this.otlTokenRequest = null; // L: 2041
					} catch (Exception var24) { // L: 2043
						class364.RunException_sendStackTrace((String)null, var24); // L: 2044
						class11.getLoginError(65); // L: 2045
						this.otlTokenRequest = null; // L: 2046
						return; // L: 2047
					}
				} else {
					if (this.field526 == null) { // L: 2050
						class11.getLoginError(65); // L: 2080
						return; // L: 2081
					}

					if (!this.field526.method264()) { // L: 2051
						return; // L: 2052
					}

					if (this.field526.method272()) { // L: 2054
						class364.RunException_sendStackTrace(this.field526.method269(), (Throwable)null); // L: 2055
						class11.getLoginError(65); // L: 2056
						this.field526 = null; // L: 2057
						return; // L: 2058
					}

					var29 = this.field526.method265(); // L: 2060
					if (var29.method285() != 200) { // L: 2061
						class11.getLoginError(65); // L: 2062
						this.field526 = null; // L: 2063
						return; // L: 2064
					}

					field549 = 0; // L: 2066
					class433 var4 = new class433(var29.method286()); // L: 2067

					try {
						class308.field3460 = var4.method7980().getString("access_token"); // L: 2069
						class12.field63 = var4.method7980().getString("refresh_token"); // L: 2070
					} catch (Exception var23) { // L: 2072
						class364.RunException_sendStackTrace("Error parsing tokens", var23); // L: 2073
						class11.getLoginError(65); // L: 2074
						this.field526 = null; // L: 2075
						return; // L: 2076
					}
				}

				this.method1384(class308.field3460); // L: 2083
				class60.method1155(20); // L: 2084
			}

			if (loginState == 20) { // L: 2086
				if (this.field524 != null) { // L: 2087
					if (!this.field524.isDone()) { // L: 2088
						return; // L: 2089
					}

					if (this.field524.isCancelled()) { // L: 2091
						class11.getLoginError(65); // L: 2092
						this.field524 = null; // L: 2093
						return; // L: 2094
					}

					try {
						com.jagex.oldscape.pub.OtlTokenResponse var30 = (com.jagex.oldscape.pub.OtlTokenResponse)this.field524.get(); // L: 2097
						if (!var30.isSuccess()) { // L: 2098
							class11.getLoginError(65); // L: 2099
							this.field524 = null; // L: 2100
							return; // L: 2101
						}

						this.field520 = var30.getToken(); // L: 2103
						this.field524 = null; // L: 2104
					} catch (Exception var22) { // L: 2106
						class364.RunException_sendStackTrace((String)null, var22); // L: 2107
						class11.getLoginError(65); // L: 2108
						this.field524 = null; // L: 2109
						return; // L: 2110
					}
				} else {
					if (this.field522 == null) { // L: 2113
						class11.getLoginError(65); // L: 2149
						return; // L: 2150
					}

					if (!this.field522.method264()) { // L: 2114
						return; // L: 2115
					}

					if (this.field522.method272()) { // L: 2117
						class364.RunException_sendStackTrace(this.field522.method269(), (Throwable)null); // L: 2118
						class11.getLoginError(65); // L: 2119
						this.field522 = null; // L: 2120
						return; // L: 2121
					}

					var29 = this.field522.method265(); // L: 2123
					if (var29.method285() != 200) { // L: 2124
						class364.RunException_sendStackTrace("Response code: " + var29.method285() + "Response body: " + var29.method286(), (Throwable)null); // L: 2125
						class11.getLoginError(65); // L: 2126
						this.field522 = null; // L: 2127
						return; // L: 2128
					}

					List var32 = (List)var29.method283().get("Content-Type"); // L: 2130
					if (var32 != null && var32.contains(class431.field4639.method7965())) { // L: 2131
						try {
							JSONObject var5 = new JSONObject(var29.method286()); // L: 2133
							this.field520 = var5.getString("token"); // L: 2134
						} catch (JSONException var21) { // L: 2136
							class364.RunException_sendStackTrace((String)null, var21); // L: 2137
							class11.getLoginError(65); // L: 2138
							this.field522 = null; // L: 2139
							return; // L: 2140
						}
					} else {
						this.field520 = var29.method286(); // L: 2144
					}

					this.field522 = null; // L: 2146
				}

				field549 = 0; // L: 2152
				class60.method1155(1); // L: 2153
			}

			if (loginState == 1) { // L: 2155
				if (UserComparator3.socketTask == null) { // L: 2156
					UserComparator3.socketTask = GameEngine.taskHandler.newSocketTask(class188.worldHost, ClanSettings.currentPort); // L: 2157
				}

				if (UserComparator3.socketTask.status == 2) { // L: 2159
					throw new IOException();
				}

				if (UserComparator3.socketTask.status == 1) { // L: 2160
					Socket var34 = (Socket)UserComparator3.socketTask.result; // L: 2162
					BufferedNetSocket var31 = new BufferedNetSocket(var34, 40000, 5000); // L: 2164
					var1 = var31; // L: 2166
					packetWriter.setSocket(var31); // L: 2167
					UserComparator3.socketTask = null; // L: 2168
					class60.method1155(2); // L: 2169
				}
			}

			PacketBufferNode var33;
			if (loginState == 2) { // L: 2172
				packetWriter.clearBuffer(); // L: 2173
				var33 = ViewportMouse.method4751(); // L: 2174
				var33.packetBuffer.writeByte(LoginPacket.field3290.id); // L: 2175
				packetWriter.addNode(var33); // L: 2176
				packetWriter.flush(); // L: 2177
				var2.offset = 0; // L: 2178
				class60.method1155(3); // L: 2179
			}

			int var14;
			if (loginState == 3) { // L: 2181
				if (Interpreter.pcmPlayer0 != null) { // L: 2182
					Interpreter.pcmPlayer0.method817();
				}

				if (ViewportMouse.pcmPlayer1 != null) { // L: 2183
					ViewportMouse.pcmPlayer1.method817();
				}

				if (((AbstractSocket)var1).isAvailable(1)) { // L: 2184
					var14 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2185
					if (Interpreter.pcmPlayer0 != null) { // L: 2186
						Interpreter.pcmPlayer0.method817();
					}

					if (ViewportMouse.pcmPlayer1 != null) { // L: 2187
						ViewportMouse.pcmPlayer1.method817();
					}

					if (var14 != 0) { // L: 2188
						class11.getLoginError(var14); // L: 2189
						return; // L: 2190
					}

					var2.offset = 0; // L: 2192
					class60.method1155(4); // L: 2193
				}
			}

			if (loginState == 4) { // L: 2196
				if (var2.offset < 8) { // L: 2197
					var14 = ((AbstractSocket)var1).available(); // L: 2198
					if (var14 > 8 - var2.offset) { // L: 2199
						var14 = 8 - var2.offset;
					}

					if (var14 > 0) { // L: 2200
						((AbstractSocket)var1).read(var2.array, var2.offset, var14); // L: 2201
						var2.offset += var14; // L: 2202
					}
				}

				if (var2.offset == 8) { // L: 2205
					var2.offset = 0; // L: 2206
					Bounds.field4584 = var2.readLong();
					class60.method1155(5);
				}
			}

			int var6;
			if (loginState == 5) { // L: 2211
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer(); // L: 2213
				PacketBuffer var35 = new PacketBuffer(500); // L: 2214
				int[] var36 = new int[]{class133.secureRandom.nextInt(), class133.secureRandom.nextInt(), class133.secureRandom.nextInt(), class133.secureRandom.nextInt()}; // L: 2215 2216 2217 2218 2219
				var35.offset = 0; // L: 2220
				var35.writeByte(1); // L: 2221
				var35.writeInt(var36[0]); // L: 2222
				var35.writeInt(var36[1]); // L: 2223
				var35.writeInt(var36[2]); // L: 2224
				var35.writeInt(var36[3]); // L: 2225
				var35.writeLong(Bounds.field4584); // L: 2226
				if (gameState == 40) { // L: 2227
					var35.writeInt(class18.field95[0]); // L: 2228
					var35.writeInt(class18.field95[1]); // L: 2229
					var35.writeInt(class18.field95[2]); // L: 2230
					var35.writeInt(class18.field95[3]); // L: 2231
				} else {
					if (gameState == 50) { // L: 2234
						var35.writeByte(class136.field1597.rsOrdinal()); // L: 2235
						var35.writeInt(class31.field167); // L: 2236
					} else {
						var35.writeByte(field518.rsOrdinal()); // L: 2239
						switch(field518.field1600) { // L: 2240
						case 0:
						case 3:
							var35.writeMedium(FriendSystem.field800); // L: 2244
							++var35.offset; // L: 2245
							break; // L: 2246
						case 1:
							var35.writeInt(WorldMapSectionType.clientPreferences.method2453(Login.Login_username)); // L: 2255
							break;
						case 2:
							var35.offset += 4; // L: 2250
						}
					}

					if (field519.method8928()) { // L: 2260
						var35.writeByte(class482.field4956.rsOrdinal()); // L: 2261
						var35.writeStringCp1252NullTerminated(this.field520); // L: 2262
					} else {
						var35.writeByte(class482.field4962.rsOrdinal()); // L: 2265
						var35.writeStringCp1252NullTerminated(Login.Login_password); // L: 2266
					}
				}

				var35.encryptRsa(class72.field883, class72.field881); // L: 2269
				class18.field95 = var36; // L: 2270
				PacketBufferNode var37 = ViewportMouse.method4751(); // L: 2271
				var37.packetBuffer.offset = 0; // L: 2272
				if (gameState == 40) { // L: 2273
					var37.packetBuffer.writeByte(LoginPacket.field3286.id); // L: 2274
				} else {
					var37.packetBuffer.writeByte(LoginPacket.field3288.id); // L: 2277
				}

				var37.packetBuffer.writeShort(0); // L: 2279
				var6 = var37.packetBuffer.offset; // L: 2280
				var37.packetBuffer.writeInt(212); // L: 2281
				var37.packetBuffer.writeInt(1); // L: 2282
				var37.packetBuffer.writeByte(clientType); // L: 2283
				var37.packetBuffer.writeByte(field488); // L: 2284
				byte var7 = 0; // L: 2285
				var37.packetBuffer.writeByte(var7); // L: 2286
				var37.packetBuffer.writeBytes(var35.array, 0, var35.offset); // L: 2287
				int var8 = var37.packetBuffer.offset; // L: 2288
				var37.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2289
				var37.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2290
				var37.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 2291
				var37.packetBuffer.writeShort(class143.canvasHeight); // L: 2292
				PacketBuffer var9 = var37.packetBuffer; // L: 2293
				int var12;
				if (randomDatData != null) { // L: 2295
					var9.writeBytes(randomDatData, 0, randomDatData.length); // L: 2296
				} else {
					byte[] var11 = new byte[24]; // L: 2301

					try {
						JagexCache.JagexCache_randomDat.seek(0L); // L: 2303
						JagexCache.JagexCache_randomDat.readFully(var11); // L: 2304

						for (var12 = 0; var12 < 24 && var11[var12] == 0; ++var12) { // L: 2305 2306 2307
						}

						if (var12 >= 24) { // L: 2309
							throw new IOException();
						}
					} catch (Exception var27) {
						for (int var13 = 0; var13 < 24; ++var13) { // L: 2312
							var11[var13] = -1;
						}
					}

					var9.writeBytes(var11, 0, var11.length); // L: 2317
				}

				var37.packetBuffer.writeStringCp1252NullTerminated(FontName.field4790); // L: 2319
				var37.packetBuffer.writeInt(RouteStrategy.field2330); // L: 2320
				Buffer var10 = new Buffer(HealthBarUpdate.platformInfo.size()); // L: 2321
				HealthBarUpdate.platformInfo.write(var10); // L: 2322
				var37.packetBuffer.writeBytes(var10.array, 0, var10.array.length); // L: 2323
				var37.packetBuffer.writeByte(clientType); // L: 2324
				var37.packetBuffer.writeInt(0); // L: 2325
				var37.packetBuffer.method8671(class20.archive10.hash); // L: 2326
				var37.packetBuffer.method8719(class475.archive20.hash); // L: 2327
				var37.packetBuffer.method8671(class127.archive17.hash); // L: 2328
				var37.packetBuffer.method8671(class223.field2581.hash); // L: 2329
				var37.packetBuffer.method8671(TextureProvider.archive13.hash); // L: 2330
				var37.packetBuffer.method8671(class308.archive6.hash); // L: 2331
				var37.packetBuffer.method8671(class167.archive12.hash); // L: 2332
				var37.packetBuffer.writeInt(class376.archive18.hash); // L: 2333
				var37.packetBuffer.method8719(class36.field239.hash); // L: 2334
				var37.packetBuffer.method8671(ClientPreferences.field1265.hash); // L: 2335
				var37.packetBuffer.method8719(class135.archive4.hash); // L: 2336
				var37.packetBuffer.writeInt(class175.archive9.hash); // L: 2337
				var37.packetBuffer.method8670(UserComparator5.field1419.hash); // L: 2338
				var37.packetBuffer.method8670(class258.archive2.hash); // L: 2339
				var37.packetBuffer.method8719(0); // L: 2340
				var37.packetBuffer.method8670(class90.archive14.hash); // L: 2341
				var37.packetBuffer.method8719(MusicPatchPcmStream.archive15.hash); // L: 2342
				var37.packetBuffer.method8719(MusicPatchNode.archive19.hash); // L: 2343
				var37.packetBuffer.method8671(class143.archive8.hash); // L: 2344
				var37.packetBuffer.method8671(class290.archive7.hash); // L: 2345
				var37.packetBuffer.writeInt(Clock.archive11.hash); // L: 2346
				var37.packetBuffer.xteaEncrypt(var36, var8, var37.packetBuffer.offset); // L: 2347
				var37.packetBuffer.writeLengthShort(var37.packetBuffer.offset - var6); // L: 2348
				packetWriter.addNode(var37); // L: 2349
				packetWriter.flush(); // L: 2350
				packetWriter.isaacCipher = new IsaacCipher(var36); // L: 2351
				int[] var45 = new int[4]; // L: 2352

				for (var12 = 0; var12 < 4; ++var12) { // L: 2353
					var45[var12] = var36[var12] + 50;
				}

				var2.newIsaacCipher(var45); // L: 2354
				class60.method1155(6); // L: 2355
			}

			int var16;
			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2357 2358
				var14 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2359
				if (var14 == 61) { // L: 2360
					var16 = ((AbstractSocket)var1).available(); // L: 2361
					class157.field1742 = var16 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2362
					class60.method1155(5); // L: 2363
				}

				if (var14 == 21 && gameState == 20) { // L: 2365
					class60.method1155(12); // L: 2366
				} else if (var14 == 2) { // L: 2368
					class60.method1155(14); // L: 2369
				} else if (var14 == 15 && gameState == 40) { // L: 2371
					packetWriter.serverPacketLength = -1; // L: 2372
					class60.method1155(19); // L: 2373
				} else if (var14 == 64) { // L: 2375
					class60.method1155(10); // L: 2376
				} else if (var14 == 23 && field516 < 1) { // L: 2378
					++field516; // L: 2379
					class60.method1155(0); // L: 2380
				} else if (var14 == 29) { // L: 2382
					class60.method1155(17); // L: 2383
				} else {
					if (var14 != 69) { // L: 2385
						class11.getLoginError(var14); // L: 2389
						return; // L: 2390
					}

					class60.method1155(7); // L: 2386
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2394 2395
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2396
				var2.offset = 0; // L: 2397
				ReflectionCheck.field257 = var2.readUnsignedShort(); // L: 2398
				class60.method1155(8); // L: 2399
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= ReflectionCheck.field257) { // L: 2402 2403
				var2.offset = 0; // L: 2404
				((AbstractSocket)var1).read(var2.array, var2.offset, ReflectionCheck.field257); // L: 2405
				class6[] var38 = new class6[]{class6.field17}; // L: 2408
				class6 var39 = var38[var2.readUnsignedByte()]; // L: 2410

				try {
					switch(var39.field12) { // L: 2414
					case 0:
						class0 var40 = new class0(); // L: 2421
						this.field658 = new class7(var2, var40); // L: 2427
						class60.method1155(9); // L: 2428
						break;
					default:
						throw new IllegalArgumentException(); // L: 2417
					}
				} catch (Exception var20) { // L: 2430
					class11.getLoginError(22); // L: 2431
					return; // L: 2432
				}
			}

			if (loginState == 9 && this.field658.method50()) { // L: 2436 2437
				this.field634 = this.field658.method39(); // L: 2438
				this.field658.method48(); // L: 2439
				this.field658 = null; // L: 2440
				if (this.field634 == null) { // L: 2441
					class11.getLoginError(22); // L: 2442
					return; // L: 2443
				}

				packetWriter.clearBuffer(); // L: 2445
				var33 = ViewportMouse.method4751(); // L: 2446
				var33.packetBuffer.writeByte(LoginPacket.field3289.id); // L: 2447
				var33.packetBuffer.writeShort(this.field634.offset); // L: 2448
				var33.packetBuffer.method8613(this.field634); // L: 2449
				packetWriter.addNode(var33); // L: 2450
				packetWriter.flush(); // L: 2451
				this.field634 = null; // L: 2452
				class60.method1155(6); // L: 2453
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2456 2457
				class10.field53 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2458
				class60.method1155(11); // L: 2459
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class10.field53) { // L: 2462 2463
				((AbstractSocket)var1).read(var2.array, 0, class10.field53); // L: 2464
				var2.offset = 0; // L: 2465
				class60.method1155(6); // L: 2466
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2469 2470
				field487 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2471
				class60.method1155(13); // L: 2472
			}

			if (loginState == 13) { // L: 2475
				field549 = 0; // L: 2476
				Tile.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field487 / 60 + " seconds."); // L: 2477
				if (--field487 <= 0) { // L: 2478
					class60.method1155(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2481 2482
					Messages.field1375 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2483
					class60.method1155(15); // L: 2484
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= Messages.field1375) { // L: 2487 2488
					boolean var46 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2489
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2490
					var2.offset = 0; // L: 2491
					boolean var47 = false; // L: 2492
					if (var46) { // L: 2493
						var16 = var2.readByteIsaac() << 24; // L: 2494
						var16 |= var2.readByteIsaac() << 16; // L: 2495
						var16 |= var2.readByteIsaac() << 8; // L: 2496
						var16 |= var2.readByteIsaac(); // L: 2497
						WorldMapSectionType.clientPreferences.method2488(Login.Login_username, var16); // L: 2498
					}

					if (Login_isUsernameRemembered) { // L: 2500
						WorldMapSectionType.clientPreferences.method2439(Login.Login_username); // L: 2501
					} else {
						WorldMapSectionType.clientPreferences.method2439((String)null); // L: 2504
					}

					class146.savePreferences(); // L: 2506
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2507
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2508
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2509
					localPlayerIndex <<= 8; // L: 2510
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2511
					field603 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2512
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2513
					var2.offset = 0; // L: 2514
					this.accountHash = var2.readLong(); // L: 2515
					if (Messages.field1375 >= 29) { // L: 2516
						((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2517
						var2.offset = 0; // L: 2518
						field671 = var2.readLong(); // L: 2519
					}

					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2521
					var2.offset = 0; // L: 2522
					ServerPacket[] var43 = class258.ServerPacket_values(); // L: 2523
					var6 = var2.readSmartByteShortIsaac(); // L: 2524
					if (var6 < 0 || var6 >= var43.length) { // L: 2525
						throw new IOException(var6 + " " + var2.offset);
					}

					packetWriter.serverPacket = var43[var6]; // L: 2526
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2527
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2528
					var2.offset = 0; // L: 2529
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2530

					try {
						class26.method374(class392.client, "zap"); // L: 2532
					} catch (Throwable var19) { // L: 2534
					}

					class60.method1155(16); // L: 2535
				}

				if (loginState == 16) { // L: 2538
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2539
						var2.offset = 0; // L: 2540
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2541
						timer.method7335(); // L: 2542
						class395.method7439(); // L: 2543
						DirectByteArrayCopier.updatePlayer(var2); // L: 2544
						class124.field1471 = -1; // L: 2545
						Skeleton.loadRegions(false, var2); // L: 2546
						packetWriter.serverPacket = null; // L: 2547
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2551 2552
						var2.offset = 0; // L: 2553
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2554
						var2.offset = 0; // L: 2555
						class495.field5036 = var2.readUnsignedShort(); // L: 2556
						class60.method1155(18); // L: 2557
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= class495.field5036) { // L: 2560 2561
						var2.offset = 0; // L: 2562
						((AbstractSocket)var1).read(var2.array, 0, class495.field5036); // L: 2563
						var2.offset = 0; // L: 2564
						String var42 = var2.readStringCp1252NullTerminated(); // L: 2565
						String var41 = var2.readStringCp1252NullTerminated(); // L: 2566
						String var44 = var2.readStringCp1252NullTerminated(); // L: 2567
						Tile.setLoginResponseString(var42, var41, var44); // L: 2568
						class19.method280(10); // L: 2569
						if (field519.method8928()) { // L: 2570
							class14.method173(9); // L: 2571
						}
					}

					if (loginState == 19) { // L: 2575
						if (packetWriter.serverPacketLength == -1) { // L: 2576
							if (((AbstractSocket)var1).available() < 2) { // L: 2577
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2578
							var2.offset = 0; // L: 2579
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2580
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2582
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2583
							var2.offset = 0; // L: 2584
							var14 = packetWriter.serverPacketLength; // L: 2585
							timer.method7325(); // L: 2586
							StudioGame.method6344(); // L: 2587
							DirectByteArrayCopier.updatePlayer(var2); // L: 2588
							if (var14 != var2.offset) { // L: 2589
								throw new RuntimeException(); // L: 2590
							}
						}
					} else {
						++field549; // L: 2594
						if (field549 > 2000) { // L: 2595
							if (field516 < 1) { // L: 2596
								if (class290.worldPort == ClanSettings.currentPort) { // L: 2597
									ClanSettings.currentPort = Calendar.js5Port;
								} else {
									ClanSettings.currentPort = class290.worldPort; // L: 2598
								}

								++field516; // L: 2599
								class60.method1155(0); // L: 2600
							} else {
								class11.getLoginError(-3); // L: 2603
							}
						}
					}
				}
			}
		} catch (IOException var28) { // L: 2607
			if (field516 < 1) { // L: 2608
				if (ClanSettings.currentPort == class290.worldPort) { // L: 2609
					ClanSettings.currentPort = Calendar.js5Port;
				} else {
					ClanSettings.currentPort = class290.worldPort; // L: 2610
				}

				++field516; // L: 2611
				class60.method1155(0); // L: 2612
			} else {
				class11.getLoginError(-2); // L: 2615
			}
		}
	} // L: 2479 2549 2592 2601 2604 2613 2616 2618

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-78458791"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3013
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3014
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3015
			hadNetworkError = false; // L: 3016
			PendingSpawn.method2350(); // L: 3017
		} else {
			if (!isMenuOpen) { // L: 3020
				FriendsChatMember.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1652(packetWriter); ++var1) { // L: 3021 3022
			}

			if (gameState == 30) { // L: 3024
				int var2;
				PacketBufferNode var14;
				while (WorldMapCacheName.method5296()) { // L: 3025
					var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3107, packetWriter.isaacCipher); // L: 3026
					var14.packetBuffer.writeByte(0); // L: 3027
					var2 = var14.packetBuffer.offset; // L: 3028
					AttackOption.performReflectionCheck(var14.packetBuffer); // L: 3029
					var14.packetBuffer.method8642(var14.packetBuffer.offset - var2); // L: 3030
					packetWriter.addNode(var14); // L: 3031
				}

				if (timer.field4434) { // L: 3033
					var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3122, packetWriter.isaacCipher); // L: 3035
					var14.packetBuffer.writeByte(0); // L: 3036
					var2 = var14.packetBuffer.offset; // L: 3037
					timer.write(var14.packetBuffer); // L: 3038
					var14.packetBuffer.method8642(var14.packetBuffer.offset - var2); // L: 3039
					packetWriter.addNode(var14); // L: 3040
					timer.method7324(); // L: 3041
				}

				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				synchronized(class212.mouseRecorder.lock) { // L: 3044
					if (!field480) { // L: 3045
						class212.mouseRecorder.index = 0; // L: 3131
					} else if (MouseHandler.MouseHandler_lastButton != 0 || class212.mouseRecorder.index >= 40) { // L: 3046
						PacketBufferNode var15 = null; // L: 3048
						var3 = 0; // L: 3049
						var4 = 0; // L: 3050
						var5 = 0; // L: 3051
						var6 = 0; // L: 3052

						for (var7 = 0; var7 < class212.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) { // L: 3053 3054
							var4 = var7; // L: 3055
							var8 = class212.mouseRecorder.ys[var7]; // L: 3056
							if (var8 < -1) { // L: 3057
								var8 = -1;
							} else if (var8 > 65534) { // L: 3058
								var8 = 65534;
							}

							var9 = class212.mouseRecorder.xs[var7]; // L: 3059
							if (var9 < -1) { // L: 3060
								var9 = -1;
							} else if (var9 > 65534) { // L: 3061
								var9 = 65534;
							}

							if (var9 != field515 || var8 != field496) { // L: 3062
								if (var15 == null) { // L: 3065
									var15 = UserComparator9.getPacketBufferNode(ClientPacket.field3060, packetWriter.isaacCipher); // L: 3066
									var15.packetBuffer.writeByte(0); // L: 3067
									var3 = var15.packetBuffer.offset; // L: 3068
									PacketBuffer var10000 = var15.packetBuffer; // L: 3069
									var10000.offset += 2;
									var5 = 0; // L: 3070
									var6 = 0; // L: 3071
								}

								if (-1L != field497) { // L: 3076
									var10 = var9 - field515; // L: 3077
									var11 = var8 - field496; // L: 3078
									var12 = (int)((class212.mouseRecorder.millis[var7] - field497) / 20L); // L: 3079
									var5 = (int)((long)var5 + (class212.mouseRecorder.millis[var7] - field497) % 20L); // L: 3080
								} else {
									var10 = var9; // L: 3083
									var11 = var8; // L: 3084
									var12 = Integer.MAX_VALUE; // L: 3085
								}

								field515 = var9; // L: 3087
								field496 = var8; // L: 3088
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3089
									var10 += 32; // L: 3090
									var11 += 32; // L: 3091
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3092
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3094
									var10 += 128; // L: 3095
									var11 += 128; // L: 3096
									var15.packetBuffer.writeByte(var12 + 128); // L: 3097
									var15.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3098
								} else if (var12 < 32) { // L: 3100
									var15.packetBuffer.writeByte(var12 + 192); // L: 3101
									if (var9 != -1 && var8 != -1) { // L: 3102
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3103
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3106
									if (var9 != -1 && var8 != -1) { // L: 3107
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3108
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6; // L: 3110
								field497 = class212.mouseRecorder.millis[var7]; // L: 3111
							}
						}

						if (var15 != null) { // L: 3113
							var15.packetBuffer.method8642(var15.packetBuffer.offset - var3); // L: 3114
							var7 = var15.packetBuffer.offset; // L: 3115
							var15.packetBuffer.offset = var3; // L: 3116
							var15.packetBuffer.writeByte(var5 / var6); // L: 3117
							var15.packetBuffer.writeByte(var5 % var6); // L: 3118
							var15.packetBuffer.offset = var7; // L: 3119
							packetWriter.addNode(var15); // L: 3120
						}

						if (var4 >= class212.mouseRecorder.index) { // L: 3122
							class212.mouseRecorder.index = 0;
						} else {
							MouseRecorder var40 = class212.mouseRecorder; // L: 3124
							var40.index -= var4;
							System.arraycopy(class212.mouseRecorder.xs, var4, class212.mouseRecorder.xs, 0, class212.mouseRecorder.index); // L: 3125
							System.arraycopy(class212.mouseRecorder.ys, var4, class212.mouseRecorder.ys, 0, class212.mouseRecorder.index); // L: 3126
							System.arraycopy(class212.mouseRecorder.millis, var4, class212.mouseRecorder.millis, 0, class212.mouseRecorder.index); // L: 3127
						}
					}
				}

				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !class319.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3133
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 3134
					if (var16 > 32767L) { // L: 3135
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 3136
					var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3137
					if (var3 < 0) { // L: 3138
						var3 = 0;
					} else if (var3 > class143.canvasHeight) { // L: 3139
						var3 = class143.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3140
					if (var4 < 0) { // L: 3141
						var4 = 0;
					} else if (var4 > GameEngine.canvasWidth) { // L: 3142
						var4 = GameEngine.canvasWidth;
					}

					var5 = (int)var16; // L: 3143
					var18 = UserComparator9.getPacketBufferNode(ClientPacket.field3125, packetWriter.isaacCipher); // L: 3144
					var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 3145
					var18.packetBuffer.writeShort(var4); // L: 3146
					var18.packetBuffer.writeShort(var3); // L: 3147
					packetWriter.addNode(var18); // L: 3148
				}

				if (field712.field2291 > 0) { // L: 3150
					var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3064, packetWriter.isaacCipher); // L: 3151
					var14.packetBuffer.writeShort(0); // L: 3152
					var2 = var14.packetBuffer.offset; // L: 3153
					long var19 = WorldMapSection2.method4844(); // L: 3154

					for (var5 = 0; var5 < field712.field2291; ++var5) { // L: 3155
						long var21 = var19 - field622; // L: 3156
						if (var21 > 16777215L) { // L: 3157
							var21 = 16777215L;
						}

						field622 = var19; // L: 3158
						var14.packetBuffer.method8782(field712.field2290[var5]); // L: 3159
						var14.packetBuffer.method8801((int)var21); // L: 3160
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2); // L: 3162
					packetWriter.addNode(var14); // L: 3163
				}

				if (field577 > 0) { // L: 3165
					--field577;
				}

				if (field712.method4074(96) || field712.method4074(97) || field712.method4074(98) || field712.method4074(99)) { // L: 3166
					field578 = true; // L: 3167
				}

				if (field578 && field577 <= 0) { // L: 3169
					field577 = 20; // L: 3170
					field578 = false; // L: 3171
					var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3121, packetWriter.isaacCipher); // L: 3173
					var14.packetBuffer.method8659(camAngleY); // L: 3174
					var14.packetBuffer.writeShort(camAngleX); // L: 3175
					packetWriter.addNode(var14); // L: 3176
				}

				if (Varps.hasFocus && !hadFocus) { // L: 3178
					hadFocus = true; // L: 3179
					var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3081, packetWriter.isaacCipher); // L: 3181
					var14.packetBuffer.writeByte(1); // L: 3182
					packetWriter.addNode(var14); // L: 3183
				}

				if (!Varps.hasFocus && hadFocus) { // L: 3185
					hadFocus = false; // L: 3186
					var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3081, packetWriter.isaacCipher); // L: 3188
					var14.packetBuffer.writeByte(0); // L: 3189
					packetWriter.addNode(var14); // L: 3190
				}

				if (WorldMapData_1.worldMap != null) { // L: 3193
					WorldMapData_1.worldMap.method8068();
				}

				class133.method3038(); // L: 3194
				Decimator.method1120(); // L: 3195
				int[] var33;
				if (field720 != TaskHandler.Client_plane) { // L: 3197
					field720 = TaskHandler.Client_plane; // L: 3198
					var1 = TaskHandler.Client_plane; // L: 3199
					var33 = class188.sceneMinimapSprite.pixels; // L: 3201
					var3 = var33.length; // L: 3202

					for (var4 = 0; var4 < var3; ++var4) { // L: 3203
						var33[var4] = 0;
					}

					for (var4 = 1; var4 < 103; ++var4) { // L: 3204
						var5 = (103 - var4) * 2048 + 24628; // L: 3205

						for (var6 = 1; var6 < 103; ++var6) { // L: 3206
							if ((Tiles.Tiles_renderFlags[var1][var6][var4] & 24) == 0) { // L: 3207
								class1.scene.drawTileMinimap(var33, var5, 512, var1, var6, var4);
							}

							if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var6][var4] & 8) != 0) { // L: 3208
								class1.scene.drawTileMinimap(var33, var5, 512, var1 + 1, var6, var4);
							}

							var5 += 4; // L: 3209
						}
					}

					var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 3212
					var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 3213
					class188.sceneMinimapSprite.setRaster(); // L: 3214

					for (var6 = 1; var6 < 103; ++var6) { // L: 3215
						for (var7 = 1; var7 < 103; ++var7) { // L: 3216
							if ((Tiles.Tiles_renderFlags[var1][var7][var6] & 24) == 0) { // L: 3217
								class16.drawObject(var1, var7, var6, var4, var5);
							}

							if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var7][var6] & 8) != 0) { // L: 3218
								class16.drawObject(var1 + 1, var7, var6, var4, var5);
							}
						}
					}

					mapIconCount = 0; // L: 3221

					for (var6 = 0; var6 < 104; ++var6) { // L: 3222
						for (var7 = 0; var7 < 104; ++var7) { // L: 3223
							long var23 = class1.scene.getGroundObjectTag(TaskHandler.Client_plane, var6, var7); // L: 3224
							if (0L != var23) { // L: 3225
								var10 = class279.Entity_unpackID(var23); // L: 3226
								var11 = DecorativeObject.getObjectDefinition(var10).mapIconId; // L: 3227
								if (var11 >= 0 && class123.WorldMapElement_get(var11).field1918) { // L: 3228 3229
									mapIcons[mapIconCount] = class123.WorldMapElement_get(var11).getSpriteBool(false); // L: 3232
									field709[mapIconCount] = var6; // L: 3233
									field723[mapIconCount] = var7; // L: 3234
									++mapIconCount; // L: 3235
								}
							}
						}
					}

					StudioGame.rasterProvider.apply(); // L: 3240
				}

				if (gameState == 30) { // L: 3244
					class18.method276(); // L: 3245
					EnumComposition.method3652(); // L: 3246
					++packetWriter.field1383; // L: 3247
					if (packetWriter.field1383 > 750) { // L: 3248
						PendingSpawn.method2350(); // L: 3249
					} else {
						var1 = Players.Players_count; // L: 3253
						var33 = Players.Players_indices; // L: 3254

						for (var3 = 0; var3 < var1; ++var3) { // L: 3255
							Player var25 = players[var33[var3]]; // L: 3256
							if (var25 != null) { // L: 3257
								ScriptEvent.updateActorSequence(var25, 1); // L: 3258
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 3263
							var2 = npcIndices[var1]; // L: 3264
							NPC var26 = npcs[var2]; // L: 3265
							if (var26 != null) { // L: 3266
								ScriptEvent.updateActorSequence(var26, var26.definition.size); // L: 3267
							}
						}

						class129.method3025(); // L: 3271
						++field631; // L: 3272
						if (mouseCrossColor != 0) { // L: 3273
							mouseCrossState = mouseCrossState * 400 + 20; // L: 3274
							if (mouseCrossState * 400 >= 400) { // L: 3275
								mouseCrossColor = 0;
							}
						}

						Widget var32 = InvDefinition.mousedOverWidgetIf1; // L: 3277
						Widget var34 = Script.field975; // L: 3278
						InvDefinition.mousedOverWidgetIf1 = null; // L: 3279
						Script.field975 = null; // L: 3280
						draggedOnWidget = null; // L: 3281
						field771 = false; // L: 3282
						field663 = false; // L: 3283
						field714 = 0; // L: 3284

						while (field712.method4081() && field714 < 128) { // L: 3285
							if (staffModLevel >= 2 && field712.method4074(82) && field712.field2299 == 66) { // L: 3286
								String var36 = BuddyRankComparator.method2886(); // L: 3287
								class392.client.method481(var36); // L: 3288
							} else if (oculusOrbState != 1 || field712.field2300 <= 0) { // L: 3291
								field716[field714] = field712.field2299; // L: 3294
								field641[field714] = field712.field2300; // L: 3295
								++field714; // L: 3296
							}
						}

						if (class72.method2055() && field712.method4074(82) && field712.method4074(81) && mouseWheelRotation != 0) { // L: 3298
							var3 = BuddyRankComparator.localPlayer.plane - mouseWheelRotation; // L: 3299
							if (var3 < 0) { // L: 3300
								var3 = 0;
							} else if (var3 > 3) { // L: 3301
								var3 = 3;
							}

							if (var3 != BuddyRankComparator.localPlayer.plane) { // L: 3302
								class163.method3359(BuddyRankComparator.localPlayer.pathX[0] + GameEngine.baseX * 64, BuddyRankComparator.localPlayer.pathY[0] + class178.baseY * 64, var3, false); // L: 3303
							}

							mouseWheelRotation = 0; // L: 3305
						}

						if (MouseHandler.MouseHandler_lastButton == 1) { // L: 3307
							field713.method4070(); // L: 3308
						}

						if (rootInterface != -1) { // L: 3310
							AbstractWorldMapData.updateRootInterface(rootInterface, 0, 0, GameEngine.canvasWidth, class143.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3311

						while (true) {
							Widget var27;
							Widget var35;
							ScriptEvent var37;
							do {
								var37 = (ScriptEvent)field690.removeLast(); // L: 3313
								if (var37 == null) { // L: 3314
									while (true) {
										do {
											var37 = (ScriptEvent)field529.removeLast(); // L: 3325
											if (var37 == null) { // L: 3326
												while (true) {
													do {
														var37 = (ScriptEvent)scriptEvents.removeLast(); // L: 3337
														if (var37 == null) { // L: 3338
															while (true) {
																class207 var38 = (class207)field692.removeLast(); // L: 3349
																if (var38 == null) { // L: 3350
																	this.menu(); // L: 3353
																	if (WorldMapData_1.worldMap != null) { // L: 3355
																		WorldMapData_1.worldMap.method8078(TaskHandler.Client_plane, GameEngine.baseX * 64 + (BuddyRankComparator.localPlayer.x >> 7), class178.baseY * 64 + (BuddyRankComparator.localPlayer.y >> 7), false); // L: 3356
																		WorldMapData_1.worldMap.loadCache(); // L: 3357
																	}

																	if (clickedWidget != null) { // L: 3360
																		this.method1248();
																	}

																	if (Scene.shouldSendWalk()) { // L: 3361
																		var3 = Scene.Scene_selectedX; // L: 3362
																		var4 = Scene.Scene_selectedY; // L: 3363
																		PacketBufferNode var39 = UserComparator9.getPacketBufferNode(ClientPacket.field3133, packetWriter.isaacCipher); // L: 3365
																		var39.packetBuffer.writeByte(5); // L: 3366
																		var39.packetBuffer.method8658(class178.baseY * 64 + var4); // L: 3367
																		var39.packetBuffer.writeShort(GameEngine.baseX * 64 + var3); // L: 3368
																		var39.packetBuffer.method8873(field712.method4074(82) ? (field712.method4074(81) ? 2 : 1) : 0); // L: 3369
																		packetWriter.addNode(var39); // L: 3370
																		Scene.method4426(); // L: 3371
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3372
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3373
																		mouseCrossColor = 1; // L: 3374
																		mouseCrossState = 0; // L: 3375
																		destinationX = var3; // L: 3376
																		destinationY = var4; // L: 3377
																	}

																	if (var32 != InvDefinition.mousedOverWidgetIf1) { // L: 3379
																		if (var32 != null) { // L: 3380
																			class69.invalidateWidget(var32);
																		}

																		if (InvDefinition.mousedOverWidgetIf1 != null) { // L: 3381
																			class69.invalidateWidget(InvDefinition.mousedOverWidgetIf1);
																		}
																	}

																	if (var34 != Script.field975 && field536 == field550) { // L: 3383
																		if (var34 != null) { // L: 3384
																			class69.invalidateWidget(var34);
																		}

																		if (Script.field975 != null) { // L: 3385
																			class69.invalidateWidget(Script.field975);
																		}
																	}

																	if (Script.field975 != null) { // L: 3387
																		if (field536 < field550) { // L: 3388
																			++field536; // L: 3389
																			if (field550 == field536) { // L: 3390
																				class69.invalidateWidget(Script.field975);
																			}
																		}
																	} else if (field536 > 0) { // L: 3393
																		--field536;
																	}

																	if (oculusOrbState == 0) { // L: 3395
																		var3 = BuddyRankComparator.localPlayer.x; // L: 3396
																		var4 = BuddyRankComparator.localPlayer.y; // L: 3397
																		if (GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX - var3 < -500 || GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX - var3 > 500 || ReflectionCheck.oculusOrbFocalPointY - var4 < -500 || ReflectionCheck.oculusOrbFocalPointY - var4 > 500) { // L: 3398
																			GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX = var3; // L: 3399
																			ReflectionCheck.oculusOrbFocalPointY = var4; // L: 3400
																		}

																		if (var3 != GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX) { // L: 3402
																			GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX += (var3 - GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX) / 16;
																		}

																		if (var4 != ReflectionCheck.oculusOrbFocalPointY) { // L: 3403
																			ReflectionCheck.oculusOrbFocalPointY += (var4 - ReflectionCheck.oculusOrbFocalPointY) / 16;
																		}

																		var5 = GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX >> 7; // L: 3404
																		var6 = ReflectionCheck.oculusOrbFocalPointY >> 7; // L: 3405
																		var7 = WorldMapDecorationType.getTileHeight(GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX, ReflectionCheck.oculusOrbFocalPointY, TaskHandler.Client_plane); // L: 3406
																		var8 = 0; // L: 3407
																		if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) { // L: 3408
																			for (var9 = var5 - 4; var9 <= var5 + 4; ++var9) { // L: 3409
																				for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) { // L: 3410
																					var11 = TaskHandler.Client_plane; // L: 3411
																					if (var11 < 3 && (Tiles.Tiles_renderFlags[1][var9][var10] & 2) == 2) { // L: 3412
																						++var11;
																					}

																					var12 = var7 - Tiles.Tiles_heights[var11][var9][var10]; // L: 3413
																					if (var12 > var8) { // L: 3414
																						var8 = var12;
																					}
																				}
																			}
																		}

																		var9 = var8 * 192; // L: 3418
																		if (var9 > 98048) { // L: 3419
																			var9 = 98048;
																		}

																		if (var9 < 32768) { // L: 3420
																			var9 = 32768;
																		}

																		if (var9 > field500) { // L: 3421
																			field500 += (var9 - field500) / 24;
																		} else if (var9 < field500) { // L: 3422
																			field500 += (var9 - field500) / 80;
																		}

																		class128.field1533 = WorldMapDecorationType.getTileHeight(BuddyRankComparator.localPlayer.x, BuddyRankComparator.localPlayer.y, TaskHandler.Client_plane) - camFollowHeight; // L: 3423
																	} else if (oculusOrbState == 1) { // L: 3425
																		if (field553 && BuddyRankComparator.localPlayer != null) { // L: 3427
																			var3 = BuddyRankComparator.localPlayer.pathX[0]; // L: 3428
																			var4 = BuddyRankComparator.localPlayer.pathY[0]; // L: 3429
																			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 3430
																				GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX = BuddyRankComparator.localPlayer.x; // L: 3431
																				var5 = WorldMapDecorationType.getTileHeight(BuddyRankComparator.localPlayer.x, BuddyRankComparator.localPlayer.y, TaskHandler.Client_plane) - camFollowHeight; // L: 3432
																				if (var5 < class128.field1533) { // L: 3433
																					class128.field1533 = var5;
																				}

																				ReflectionCheck.oculusOrbFocalPointY = BuddyRankComparator.localPlayer.y; // L: 3434
																				field553 = false; // L: 3435
																			}
																		}

																		short var30 = -1; // L: 3438
																		if (field712.method4074(33)) { // L: 3439
																			var30 = 0;
																		} else if (field712.method4074(49)) { // L: 3440
																			var30 = 1024;
																		}

																		if (field712.method4074(48)) { // L: 3441
																			if (var30 == 0) { // L: 3442
																				var30 = 1792;
																			} else if (var30 == 1024) { // L: 3443
																				var30 = 1280;
																			} else {
																				var30 = 1536; // L: 3444
																			}
																		} else if (field712.method4074(50)) { // L: 3446
																			if (var30 == 0) { // L: 3447
																				var30 = 256;
																			} else if (var30 == 1024) { // L: 3448
																				var30 = 768;
																			} else {
																				var30 = 512; // L: 3449
																			}
																		}

																		byte var31 = 0; // L: 3451
																		if (field712.method4074(35)) { // L: 3452
																			var31 = -1;
																		} else if (field712.method4074(51)) { // L: 3453
																			var31 = 1;
																		}

																		var5 = 0; // L: 3454
																		if (var30 >= 0 || var31 != 0) { // L: 3455
																			var5 = field712.method4074(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed; // L: 3456
																			var5 *= 16; // L: 3457
																			field740 = var30; // L: 3458
																			field599 = var31; // L: 3459
																		}

																		if (field570 < var5) { // L: 3461
																			field570 += var5 / 8; // L: 3462
																			if (field570 > var5) { // L: 3463
																				field570 = var5;
																			}
																		} else if (field570 > var5) { // L: 3465
																			field570 = field570 * 9 / 10;
																		}

																		if (field570 > 0) { // L: 3466
																			var6 = field570 / 16; // L: 3467
																			if (field740 >= 0) { // L: 3468
																				var3 = field740 - class110.cameraYaw & 2047; // L: 3469
																				var7 = Rasterizer3D.Rasterizer3D_sine[var3]; // L: 3470
																				var8 = Rasterizer3D.Rasterizer3D_cosine[var3]; // L: 3471
																				GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX += var6 * var7 / 65536; // L: 3472
																				ReflectionCheck.oculusOrbFocalPointY += var8 * var6 / 65536; // L: 3473
																			}

																			if (field599 != 0) { // L: 3475
																				class128.field1533 += var6 * field599; // L: 3476
																				if (class128.field1533 > 0) { // L: 3477
																					class128.field1533 = 0;
																				}
																			}
																		} else {
																			field740 = -1; // L: 3481
																			field599 = -1; // L: 3482
																		}

																		if (field712.method4074(13)) { // L: 3484
																			ClanSettings.method3262(); // L: 3485
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && class319.mouseCam) { // L: 3488
																		var3 = MouseHandler.MouseHandler_y - field567; // L: 3489
																		field546 = var3 * 2; // L: 3490
																		field567 = var3 != -1 && var3 != 1 ? (field567 + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y; // L: 3491
																		var4 = field691 - MouseHandler.MouseHandler_x; // L: 3492
																		field564 = var4 * 2; // L: 3493
																		field691 = var4 != -1 && var4 != 1 ? (MouseHandler.MouseHandler_x + field691) / 2 : MouseHandler.MouseHandler_x; // L: 3494
																	} else {
																		if (field712.method4074(96)) { // L: 3497
																			field564 += (-24 - field564) / 2;
																		} else if (field712.method4074(97)) { // L: 3498
																			field564 += (24 - field564) / 2;
																		} else {
																			field564 /= 2; // L: 3499
																		}

																		if (field712.method4074(98)) { // L: 3500
																			field546 += (12 - field546) / 2;
																		} else if (field712.method4074(99)) { // L: 3501
																			field546 += (-12 - field546) / 2;
																		} else {
																			field546 /= 2; // L: 3502
																		}

																		field567 = MouseHandler.MouseHandler_y; // L: 3503
																		field691 = MouseHandler.MouseHandler_x; // L: 3504
																	}

																	camAngleY = field564 / 2 + camAngleY & 2047; // L: 3506
																	camAngleX += field546 / 2; // L: 3507
																	if (camAngleX < 128) { // L: 3508
																		camAngleX = 128;
																	}

																	if (camAngleX > 383) { // L: 3509
																		camAngleX = 383;
																	}

																	if (field737) { // L: 3511
																		class11.method98();
																	} else if (isCameraLocked) { // L: 3512
																		var3 = class4.field7 * 128 + 64; // L: 3513
																		var4 = WorldMapSectionType.field2937 * 16384 + 64; // L: 3514
																		var5 = WorldMapDecorationType.getTileHeight(var3, var4, TaskHandler.Client_plane) - class269.field3033; // L: 3515
																		PendingSpawn.method2351(var3, var5, var4); // L: 3516
																		var3 = class167.field1800 * 16384 + 64; // L: 3517
																		var4 = Canvas.field123 * 16384 + 64; // L: 3518
																		var5 = WorldMapDecorationType.getTileHeight(var3, var4, TaskHandler.Client_plane) - MidiPcmStream.field3361; // L: 3519
																		var6 = var3 - class381.cameraX; // L: 3520
																		var7 = var5 - class351.cameraY; // L: 3521
																		var8 = var4 - class471.cameraZ; // L: 3522
																		var9 = (int)Math.sqrt((double)(var8 * var8 + var6 * var6)); // L: 3523
																		var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.9490051269531D) & 2047; // L: 3524
																		var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.9490051269531D) & 2047; // L: 3525
																		class278.method5449(var10, var11); // L: 3526
																	}

																	for (var3 = 0; var3 < 5; ++var3) { // L: 3528
																		int var10002 = field566[var3]++;
																	}

																	class248.varcs.tryWrite(); // L: 3529
																	var3 = ModeWhere.method6668(); // L: 3530
																	var4 = GameEngine.field212.method343(); // L: 3533
																	if (var3 > 15000 && var4 > 15000) { // L: 3536
																		logoutTimer = 250; // L: 3537
																		MouseHandler.MouseHandler_idleCycles = 14500; // L: 3539
																		var18 = UserComparator9.getPacketBufferNode(ClientPacket.field3057, packetWriter.isaacCipher); // L: 3542
																		packetWriter.addNode(var18); // L: 3543
																	}

																	class6.friendSystem.processFriendUpdates(); // L: 3545
																	method1777(); // L: 3546
																	++packetWriter.pendingWrites; // L: 3547
																	if (packetWriter.pendingWrites > 50) { // L: 3548
																		var18 = UserComparator9.getPacketBufferNode(ClientPacket.field3092, packetWriter.isaacCipher); // L: 3550
																		packetWriter.addNode(var18); // L: 3551
																	}

																	try {
																		packetWriter.flush(); // L: 3554
																	} catch (IOException var28) { // L: 3556
																		PendingSpawn.method2350(); // L: 3557
																	}

																	return; // L: 3559
																}

																class16.method201(var38); // L: 3351
															}
														}

														var35 = var37.widget; // L: 3339
														if (var35.childIndex < 0) { // L: 3340
															break;
														}

														var27 = WorldMapSection1.getWidget(var35.parentId); // L: 3341
													} while(var27 == null || var27.children == null || var35.childIndex >= var27.children.length || var35 != var27.children[var35.childIndex]); // L: 3342

													class9.runScriptEvent(var37); // L: 3346
												}
											}

											var35 = var37.widget; // L: 3327
											if (var35.childIndex < 0) { // L: 3328
												break;
											}

											var27 = WorldMapSection1.getWidget(var35.parentId); // L: 3329
										} while(var27 == null || var27.children == null || var35.childIndex >= var27.children.length || var35 != var27.children[var35.childIndex]); // L: 3330

										class9.runScriptEvent(var37); // L: 3334
									}
								}

								var35 = var37.widget; // L: 3315
								if (var35.childIndex < 0) { // L: 3316
									break;
								}

								var27 = WorldMapSection1.getWidget(var35.parentId); // L: 3317
							} while(var27 == null || var27.children == null || var35.childIndex >= var27.children.length || var35 != var27.children[var35.childIndex]); // L: 3318

							class9.runScriptEvent(var37); // L: 3322
						}
					}
				}
			}
		}
	} // L: 3018 3250

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GameEngine.canvasWidth; // L: 4346
		int var2 = class143.canvasHeight; // L: 4347
		if (super.contentWidth < var1) { // L: 4348
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4349
		}

		if (WorldMapSectionType.clientPreferences != null) { // L: 4350
			try {
				class26.method377(class392.client, "resize", new Object[]{class7.getWindowedMode()}); // L: 4352
			} catch (Throwable var4) { // L: 4354
			}
		}

	} // L: 4356

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1404157217"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) { // L: 4359
			var1 = rootInterface; // L: 4360
			if (GrandExchangeEvent.loadInterface(var1)) { // L: 4362
				class31.drawModelComponents(class155.Widget_interfaceComponents[var1], -1); // L: 4363
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4366
			if (field722[var1]) { // L: 4367
				field697[var1] = true;
			}

			field698[var1] = field722[var1]; // L: 4368
			field722[var1] = false; // L: 4369
		}

		field695 = cycle; // L: 4371
		viewportX = -1; // L: 4372
		viewportY = -1; // L: 4373
		if (rootInterface != -1) { // L: 4374
			rootWidgetCount = 0; // L: 4375
			GrandExchangeOfferOwnWorldComparator.drawWidgets(rootInterface, 0, 0, GameEngine.canvasWidth, class143.canvasHeight, 0, 0, -1); // L: 4376
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4378
		if (showMouseCross) { // L: 4379
			if (mouseCrossColor == 1) { // L: 4380
				Friend.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4381
			}

			if (mouseCrossColor == 2) { // L: 4383
				Friend.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4384
			}
		}

		int var2;
		int var3;
		if (!isMenuOpen) { // L: 4387
			if (viewportX != -1) { // L: 4388
				var1 = viewportX; // L: 4389
				var2 = viewportY; // L: 4390
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) { // L: 4392 4393
					var3 = menuOptionsCount - 1; // L: 4396
					String var5;
					if (isItemSelected == 1 && menuOptionsCount < 2) { // L: 4400
						var5 = "Use" + " " + field640 + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) { // L: 4401
						var5 = field711 + " " + field645 + " " + "->";
					} else {
						var5 = SceneTilePaint.method4753(var3); // L: 4402
					}

					if (menuOptionsCount > 2) { // L: 4403
						var5 = var5 + Canvas.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					class7.fontBold12.drawRandomAlphaAndSpacing(var5, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000); // L: 4404
				}
			}
		} else {
			UserComparator2.method8945(); // L: 4408
		}

		if (gameDrawingMode == 3) { // L: 4409
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4410
				if (field698[var1]) { // L: 4411
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4412
				} else if (field697[var1]) { // L: 4414
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4415
				}
			}
		}

		var1 = TaskHandler.Client_plane; // L: 4419
		var2 = BuddyRankComparator.localPlayer.x; // L: 4420
		var3 = BuddyRankComparator.localPlayer.y; // L: 4421
		int var4 = field631; // L: 4422

		for (ObjectSound var13 = (ObjectSound)ObjectSound.objectSounds.last(); var13 != null; var13 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var13.soundEffectId != -1 || var13.soundEffectIds != null) {
				int var6 = 0; // L: 4426
				if (var2 > var13.maxX * 16384) {
					var6 += var2 - var13.maxX * 16384;
				} else if (var2 < var13.x * 16384) {
					var6 += var13.x * 16384 - var2;
				}

				if (var3 > var13.maxY * 128) {
					var6 += var3 - var13.maxY * 128;
				} else if (var3 < var13.y * 16384) {
					var6 += var13.y * 16384 - var3;
				}

				if (var6 - 64 <= var13.field812 && WorldMapSectionType.clientPreferences.method2463() != 0 && var1 == var13.plane) {
					var6 -= 64;
					if (var6 < 0) {
						var6 = 0;
					}

					int var7 = (var13.field812 - var6) * WorldMapSectionType.clientPreferences.method2463() / var13.field812; // L: 4444
					Object var10000;
					if (var13.stream1 == null) {
						if (var13.soundEffectId >= 0) { // L: 4446
							var10000 = null;
							SoundEffect var8 = SoundEffect.readSoundEffect(class175.archive9, var13.soundEffectId, 0);
							if (var8 != null) {
								RawSound var9 = var8.toRawSound().resample(TaskHandler.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7);
								var10.setNumLoops(-1);
								class323.pcmStreamMixer.addSubStream(var10);
								var13.stream1 = var10;
							}
						}
					} else {
						var13.stream1.method999(var7); // L: 4457
					}

					if (var13.stream2 == null) {
						if (var13.soundEffectIds != null && (var13.field818 -= var4) <= 0) {
							int var12 = (int)(Math.random() * (double)var13.soundEffectIds.length);
							var10000 = null;
							SoundEffect var14 = SoundEffect.readSoundEffect(class175.archive9, var13.soundEffectIds[var12], 0);
							if (var14 != null) {
								RawSound var15 = var14.toRawSound().resample(TaskHandler.decimator);
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var15, 100, var7); // L: 4464
								var11.setNumLoops(0);
								class323.pcmStreamMixer.addSubStream(var11); // L: 4466
								var13.stream2 = var11;
								var13.field818 = var13.field806 + (int)(Math.random() * (double)(var13.field808 - var13.field806));
							}
						}
					} else {
						var13.stream2.method999(var7); // L: 4473
						if (!var13.stream2.hasNext()) { // L: 4474
							var13.stream2 = null; // L: 4475
						}
					}
				} else {
					if (var13.stream1 != null) {
						class323.pcmStreamMixer.removeSubStream(var13.stream1);
						var13.stream1 = null;
					}

					if (var13.stream2 != null) { // L: 4436
						class323.pcmStreamMixer.removeSubStream(var13.stream2); // L: 4437
						var13.stream2 = null;
					}
				}
			}
		}

		field631 = 0;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Lep;II)Z",
		garbageValue = "-468698834"
	)
	boolean method1240(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 6083
			ReflectionCheck.friendsChatManager = null; // L: 6084
		} else {
			if (ReflectionCheck.friendsChatManager == null) { // L: 6087
				ReflectionCheck.friendsChatManager = new FriendsChatManager(Occluder.loginType, class392.client); // L: 6088
			}

			ReflectionCheck.friendsChatManager.method7479(var1.packetBuffer, var2); // L: 6090
		}

		class31.method445(); // L: 6092
		var1.serverPacket = null; // L: 6093
		return true; // L: 6094
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Lep;S)Z",
		garbageValue = "30632"
	)
	boolean method1241(PacketWriter var1) {
		if (ReflectionCheck.friendsChatManager != null) { // L: 6098
			ReflectionCheck.friendsChatManager.method7480(var1.packetBuffer); // L: 6099
		}

		class31.method445(); // L: 6101
		var1.serverPacket = null; // L: 6102
		return true; // L: 6103
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Lep;I)Z",
		garbageValue = "1828480042"
	)
	final boolean method1652(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6108
		PacketBuffer var3 = var1.packetBuffer; // L: 6109
		if (var2 == null) { // L: 6110
			return false;
		} else {
			int var21;
			String var24;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6112
					if (var1.field1385) { // L: 6113
						if (!var2.isAvailable(1)) { // L: 6114
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6115
						var1.field1383 = 0; // L: 6116
						var1.field1385 = false; // L: 6117
					}

					var3.offset = 0; // L: 6119
					if (var3.method8565()) { // L: 6120
						if (!var2.isAvailable(1)) { // L: 6121
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6122
						var1.field1383 = 0; // L: 6123
					}

					var1.field1385 = true; // L: 6125
					ServerPacket[] var4 = class258.ServerPacket_values(); // L: 6126
					var5 = var3.readSmartByteShortIsaac(); // L: 6127
					if (var5 < 0 || var5 >= var4.length) { // L: 6128
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6129
					var1.serverPacketLength = var1.serverPacket.length; // L: 6130
				}

				if (var1.serverPacketLength == -1) { // L: 6132
					if (!var2.isAvailable(1)) { // L: 6133
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6134
					var1.serverPacketLength = var3.array[0] & 255; // L: 6135
				}

				if (var1.serverPacketLength == -2) { // L: 6137
					if (!var2.isAvailable(2)) { // L: 6138
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6139
					var3.offset = 0; // L: 6140
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6141
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6143
					return false;
				}

				var3.offset = 0; // L: 6144
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6145
				var1.field1383 = 0; // L: 6146
				timer.method7336(); // L: 6147
				var1.field1390 = var1.field1389; // L: 6148
				var1.field1389 = var1.field1388; // L: 6149
				var1.field1388 = var1.serverPacket; // L: 6150
				if (ServerPacket.field3191 == var1.serverPacket) { // L: 6151
					class150.method3183(class283.field3156); // L: 6152
					var1.serverPacket = null; // L: 6153
					return true; // L: 6154
				}

				if (ServerPacket.field3201 == var1.serverPacket) { // L: 6156
					GrandExchangeOfferNameComparator.method6553(); // L: 6157
					weight = var3.readShort(); // L: 6158
					field686 = cycleCntr; // L: 6159
					var1.serverPacket = null; // L: 6160
					return true; // L: 6161
				}

				if (ServerPacket.field3181 == var1.serverPacket) { // L: 6163
					class150.method3183(class283.field3162); // L: 6164
					var1.serverPacket = null; // L: 6165
					return true; // L: 6166
				}

				Widget var6;
				int var20;
				if (ServerPacket.field3176 == var1.serverPacket) { // L: 6168
					var20 = var3.method8616(); // L: 6169
					var5 = var3.method8831(); // L: 6170
					var6 = WorldMapSection1.getWidget(var20); // L: 6171
					if (var6 != null && var6.type == 0) { // L: 6172
						if (var5 > var6.scrollHeight - var6.height) { // L: 6173
							var5 = var6.scrollHeight - var6.height;
						}

						if (var5 < 0) { // L: 6174
							var5 = 0;
						}

						if (var5 != var6.scrollY) { // L: 6175
							var6.scrollY = var5; // L: 6176
							class69.invalidateWidget(var6); // L: 6177
						}
					}

					var1.serverPacket = null; // L: 6180
					return true; // L: 6181
				}

				if (ServerPacket.field3261 == var1.serverPacket) { // L: 6183
					class150.method3183(class283.field3160); // L: 6184
					var1.serverPacket = null; // L: 6185
					return true; // L: 6186
				}

				if (ServerPacket.field3258 == var1.serverPacket) { // L: 6188
					class207.privateChatMode = class181.method3544(var3.readUnsignedByte()); // L: 6189
					var1.serverPacket = null; // L: 6190
					return true; // L: 6191
				}

				if (ServerPacket.field3250 == var1.serverPacket) { // L: 6193
					isCameraLocked = true; // L: 6194
					field737 = false; // L: 6195
					class4.field7 = var3.readUnsignedByte() * 16384; // L: 6196
					WorldMapSectionType.field2937 = var3.readUnsignedByte() * 128; // L: 6197
					class269.field3033 = var3.readUnsignedShort(); // L: 6198
					class19.field104 = var3.readUnsignedByte(); // L: 6199
					class313.field3676 = var3.readUnsignedByte(); // L: 6200
					if (class313.field3676 >= 100) { // L: 6201
						class381.cameraX = class4.field7 * 128 + 64; // L: 6202
						class471.cameraZ = WorldMapSectionType.field2937 * 16384 + 64; // L: 6203
						class351.cameraY = WorldMapDecorationType.getTileHeight(class381.cameraX, class471.cameraZ, TaskHandler.Client_plane) - class269.field3033; // L: 6204
					}

					var1.serverPacket = null; // L: 6206
					return true; // L: 6207
				}

				if (ServerPacket.field3275 == var1.serverPacket) { // L: 6209
					var20 = var3.readUnsignedShort(); // L: 6210
					rootInterface = var20; // L: 6211
					this.resizeRoot(false); // L: 6212
					ApproximateRouteStrategy.Widget_resetModelFrames(var20); // L: 6213
					WorldMapSection1.runWidgetOnLoadListener(rootInterface); // L: 6214

					for (var5 = 0; var5 < 100; ++var5) { // L: 6215
						field722[var5] = true;
					}

					var1.serverPacket = null; // L: 6216
					return true; // L: 6217
				}

				if (ServerPacket.field3222 == var1.serverPacket) { // L: 6219
					var20 = var3.readUnsignedByte(); // L: 6220
					Player.forceDisconnect(var20); // L: 6221
					var1.serverPacket = null; // L: 6222
					return false; // L: 6223
				}

				if (ServerPacket.field3265 == var1.serverPacket) { // L: 6225
					hintArrowType = var3.readUnsignedByte(); // L: 6226
					if (hintArrowType == 1) { // L: 6227
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 6228
						if (hintArrowType == 2) { // L: 6229
							field506 = 4096; // L: 6230
							field669 = 64; // L: 6231
						}

						if (hintArrowType == 3) { // L: 6233
							field506 = 0; // L: 6234
							field669 = 64; // L: 6235
						}

						if (hintArrowType == 4) { // L: 6237
							field506 = 8192; // L: 6238
							field669 = 64; // L: 6239
						}

						if (hintArrowType == 5) { // L: 6241
							field506 = 4096; // L: 6242
							field669 = 0; // L: 6243
						}

						if (hintArrowType == 6) { // L: 6245
							field506 = 4096; // L: 6246
							field669 = 128; // L: 6247
						}

						hintArrowType = 2; // L: 6249
						hintArrowX = var3.readUnsignedShort(); // L: 6250
						hintArrowY = var3.readUnsignedShort(); // L: 6251
						field505 = var3.readUnsignedByte() * 2; // L: 6252
					}

					if (hintArrowType == 10) { // L: 6254
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 6255
					return true; // L: 6256
				}

				int var8;
				NPC var59;
				if (ServerPacket.field3186 == var1.serverPacket) { // L: 6258
					var21 = var3.method8650(); // L: 6262
					var20 = var3.method8660(); // L: 6263
					var5 = var3.method8662(); // L: 6264
					if (var5 == 65535) { // L: 6265
						var5 = -1; // L: 6266
					}

					var59 = npcs[var20]; // L: 6268
					if (var59 != null) { // L: 6269
						if (var5 == var59.sequence && var5 != -1) { // L: 6270
							var8 = Coord.SequenceDefinition_get(var5).field2276; // L: 6271
							if (var8 == 1) { // L: 6272
								var59.sequenceFrame = 0; // L: 6273
								var59.sequenceFrameCycle = 0; // L: 6274
								var59.sequenceDelay = var21; // L: 6275
								var59.field1186 = 0; // L: 6276
							} else if (var8 == 2) { // L: 6278
								var59.field1186 = 0; // L: 6279
							}
						} else if (var5 == -1 || var59.sequence == -1 || Coord.SequenceDefinition_get(var5).field2269 >= Coord.SequenceDefinition_get(var59.sequence).field2269) { // L: 6282
							var59.sequence = var5; // L: 6283
							var59.sequenceFrame = 0; // L: 6284
							var59.sequenceFrameCycle = 0; // L: 6285
							var59.sequenceDelay = var21; // L: 6286
							var59.field1186 = 0; // L: 6287
							var59.field1215 = var59.pathLength; // L: 6288
						}
					}

					var1.serverPacket = null; // L: 6292
					return true; // L: 6293
				}

				if (ServerPacket.field3264 == var1.serverPacket) { // L: 6295
					class6.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 6296
					field701 = cycleCntr; // L: 6297
					var1.serverPacket = null; // L: 6298
					return true; // L: 6299
				}

				int var22;
				if (ServerPacket.field3252 == var1.serverPacket) { // L: 6301
					GrandExchangeOfferNameComparator.method6553(); // L: 6302
					var20 = var3.method8651(); // L: 6303
					var5 = var3.method8651(); // L: 6304
					var21 = var3.method8616(); // L: 6305
					experience[var20] = var21; // L: 6306
					currentLevels[var20] = var5; // L: 6307
					levels[var20] = 1; // L: 6308

					for (var22 = 0; var22 < 98; ++var22) { // L: 6309
						if (var21 >= Skills.Skills_experienceTable[var22]) {
							levels[var20] = var22 + 2;
						}
					}

					field675[++field676 - 1 & 31] = var20; // L: 6310
					var1.serverPacket = null; // L: 6311
					return true; // L: 6312
				}

				byte var84;
				if (ServerPacket.field3177 == var1.serverPacket) { // L: 6314
					field482 = cycleCntr; // L: 6315
					var84 = var3.readByte(); // L: 6316
					if (var1.serverPacketLength == 1) { // L: 6317
						if (var84 >= 0) { // L: 6318
							currentClanChannels[var84] = null;
						} else {
							class19.guestClanChannel = null; // L: 6319
						}

						var1.serverPacket = null; // L: 6320
						return true; // L: 6321
					}

					if (var84 >= 0) { // L: 6323
						currentClanChannels[var84] = new ClanChannel(var3); // L: 6324
					} else {
						class19.guestClanChannel = new ClanChannel(var3); // L: 6327
					}

					var1.serverPacket = null; // L: 6329
					return true; // L: 6330
				}

				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				if (ServerPacket.field3245 == var1.serverPacket) { // L: 6332
					var15 = var3.method8831(); // L: 6348
					var13 = var3.method8651() * 4; // L: 6349
					int var17 = var3.method8614(); // L: 6350
					byte var67 = var3.method8654(); // L: 6351
					byte var63 = var3.method8656(); // L: 6352
					var21 = var3.readMedium(); // L: 6353
					var20 = var21 >> 16; // L: 6354
					var5 = var21 >> 8 & 255; // L: 6355
					var22 = var20 + (var21 >> 4 & 7); // L: 6356
					var8 = var5 + (var21 & 7); // L: 6357
					var12 = var3.readUnsignedShort(); // L: 6358
					int var18 = var3.method8650(); // L: 6359
					var14 = var3.readUnsignedByte() * 4; // L: 6360
					var11 = var3.method8668(); // L: 6361
					var16 = var3.method8662(); // L: 6362
					var9 = var67 + var22; // L: 6363
					var10 = var63 + var8; // L: 6364
					if (var22 >= 0 && var8 >= 0 && var22 < 104 && var8 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var12 != 65535) { // L: 6365
						var22 = var22 * 128 + 64; // L: 6366
						var8 = var8 * 128 + 64; // L: 6367
						var9 = var9 * 128 + 64; // L: 6368
						var10 = var10 * 128 + 64; // L: 6369
						Projectile var19 = new Projectile(var12, TaskHandler.Client_plane, var22, var8, WorldMapDecorationType.getTileHeight(var22, var8, TaskHandler.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var14); // L: 6370
						var19.setDestination(var9, var10, WorldMapDecorationType.getTileHeight(var9, var10, TaskHandler.Client_plane) - var14, var15 + cycle); // L: 6371
						projectiles.addFirst(var19); // L: 6372
					}

					var1.serverPacket = null; // L: 6374
					return true; // L: 6375
				}

				if (ServerPacket.field3257 == var1.serverPacket) { // L: 6377
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) { // L: 6378
						if (Varps.Varps_main[var20] != Varps.Varps_temp[var20]) { // L: 6379
							Varps.Varps_main[var20] = Varps.Varps_temp[var20]; // L: 6380
							class159.changeGameOptions(var20); // L: 6381
							field579[++field672 - 1 & 31] = var20; // L: 6382
						}
					}

					var1.serverPacket = null; // L: 6385
					return true; // L: 6386
				}

				if (ServerPacket.field3254 == var1.serverPacket) { // L: 6388
					destinationX = var3.readUnsignedByte(); // L: 6389
					if (destinationX == 255) { // L: 6390
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6391
					if (destinationY == 255) { // L: 6392
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6393
					return true; // L: 6394
				}

				if (ServerPacket.field3277 == var1.serverPacket) { // L: 6396
					return this.method1241(var1); // L: 6397
				}

				if (ServerPacket.field3273 == var1.serverPacket) { // L: 6399
					var20 = var3.method8660(); // L: 6400
					var5 = var3.method8724(); // L: 6401
					var21 = var20 >> 10 & 31; // L: 6402
					var22 = var20 >> 5 & 31; // L: 6403
					var8 = var20 & 31; // L: 6404
					var9 = (var22 << 11) + (var21 << 19) + (var8 << 3); // L: 6405
					Widget var76 = WorldMapSection1.getWidget(var5); // L: 6406
					if (var9 != var76.color) { // L: 6407
						var76.color = var9; // L: 6408
						class69.invalidateWidget(var76); // L: 6409
					}

					var1.serverPacket = null; // L: 6411
					return true; // L: 6412
				}

				if (ServerPacket.field3208 == var1.serverPacket && isCameraLocked) { // L: 6414 6415
					field737 = true; // L: 6416
					class19.field104 = var3.readUnsignedByte(); // L: 6417
					class313.field3676 = var3.readUnsignedByte(); // L: 6418
					GrandExchangeOfferUnitPriceComparator.field4269 = var3.readUnsignedByte(); // L: 6419
					Skeleton.field2505 = var3.readUnsignedByte(); // L: 6420

					for (var20 = 0; var20 < 5; ++var20) { // L: 6421
						field738[var20] = false;
					}

					var1.serverPacket = null; // L: 6422
					return true; // L: 6423
				}

				if (ServerPacket.field3243 == var1.serverPacket) { // L: 6426
					for (var20 = 0; var20 < VarpDefinition.field1890; ++var20) { // L: 6427
						VarpDefinition var88 = GameEngine.VarpDefinition_get(var20); // L: 6428
						if (var88 != null) { // L: 6429
							Varps.Varps_temp[var20] = 0; // L: 6430
							Varps.Varps_main[var20] = 0; // L: 6431
						}
					}

					GrandExchangeOfferNameComparator.method6553(); // L: 6434
					field672 += 32; // L: 6435
					var1.serverPacket = null; // L: 6436
					return true; // L: 6437
				}

				if (ServerPacket.field3241 == var1.serverPacket) { // L: 6439
					var20 = var3.method8662(); // L: 6440
					var5 = var3.method8674(); // L: 6441
					Varps.Varps_temp[var20] = var5; // L: 6442
					if (Varps.Varps_main[var20] != var5) { // L: 6443
						Varps.Varps_main[var20] = var5; // L: 6444
					}

					class159.changeGameOptions(var20); // L: 6446
					field579[++field672 - 1 & 31] = var20; // L: 6447
					var1.serverPacket = null; // L: 6448
					return true; // L: 6449
				}

				Widget var80;
				if (ServerPacket.field3282 == var1.serverPacket) { // L: 6451
					var20 = var3.method8616(); // L: 6452
					var80 = WorldMapSection1.getWidget(var20); // L: 6453
					var80.modelType = 3; // L: 6454
					var80.modelId = BuddyRankComparator.localPlayer.appearance.getChatHeadId(); // L: 6455
					class69.invalidateWidget(var80); // L: 6456
					var1.serverPacket = null; // L: 6457
					return true; // L: 6458
				}

				String var62;
				if (ServerPacket.field3244 == var1.serverPacket) { // L: 6460
					byte[] var57 = new byte[var1.serverPacketLength]; // L: 6461
					var3.method8567(var57, 0, var57.length); // L: 6462
					Buffer var87 = new Buffer(var57); // L: 6463
					var62 = var87.readStringCp1252NullTerminated(); // L: 6464
					class25.openURL(var62, true, false); // L: 6465
					var1.serverPacket = null; // L: 6466
					return true; // L: 6467
				}

				Widget var79;
				if (ServerPacket.field3248 == var1.serverPacket) { // L: 6469
					var20 = var3.readUnsignedShort(); // L: 6470
					var5 = var3.readUnsignedShort(); // L: 6471
					var21 = var3.method8674(); // L: 6472
					var22 = var3.method8660(); // L: 6473
					var79 = WorldMapSection1.getWidget(var21); // L: 6474
					if (var20 != var79.modelAngleX || var22 != var79.modelAngleY || var5 != var79.modelZoom) { // L: 6475
						var79.modelAngleX = var20; // L: 6476
						var79.modelAngleY = var22; // L: 6477
						var79.modelZoom = var5; // L: 6478
						class69.invalidateWidget(var79); // L: 6479
					}

					var1.serverPacket = null; // L: 6481
					return true; // L: 6482
				}

				if (ServerPacket.field3218 == var1.serverPacket) { // L: 6484
					class279.method5453(); // L: 6485
					var84 = var3.readByte(); // L: 6486
					if (var1.serverPacketLength == 1) { // L: 6487
						if (var84 >= 0) { // L: 6488
							currentClanSettings[var84] = null;
						} else {
							WorldMapCacheName.guestClanSettings = null; // L: 6489
						}

						var1.serverPacket = null; // L: 6490
						return true; // L: 6491
					}

					if (var84 >= 0) { // L: 6493
						currentClanSettings[var84] = new ClanSettings(var3); // L: 6494
					} else {
						WorldMapCacheName.guestClanSettings = new ClanSettings(var3); // L: 6497
					}

					var1.serverPacket = null; // L: 6499
					return true; // L: 6500
				}

				if (ServerPacket.field3204 == var1.serverPacket) { // L: 6502
					class278.logOut(); // L: 6503
					var1.serverPacket = null; // L: 6504
					return false; // L: 6505
				}

				boolean var73;
				if (ServerPacket.field3280 == var1.serverPacket) { // L: 6507
					var73 = var3.method8651() == 1; // L: 6508
					var5 = var3.readInt(); // L: 6509
					var6 = WorldMapSection1.getWidget(var5); // L: 6510
					if (var73 != var6.isHidden) { // L: 6511
						var6.isHidden = var73; // L: 6512
						class69.invalidateWidget(var6); // L: 6513
					}

					var1.serverPacket = null; // L: 6515
					return true; // L: 6516
				}

				if (ServerPacket.field3179 == var1.serverPacket) { // L: 6518
					class150.method3183(class283.field3164); // L: 6519
					var1.serverPacket = null; // L: 6520
					return true; // L: 6521
				}

				if (ServerPacket.field3269 == var1.serverPacket) { // L: 6523
					var20 = var3.method8831(); // L: 6524
					byte var72 = var3.readByte(); // L: 6525
					Varps.Varps_temp[var20] = var72; // L: 6526
					if (Varps.Varps_main[var20] != var72) { // L: 6527
						Varps.Varps_main[var20] = var72; // L: 6528
					}

					class159.changeGameOptions(var20); // L: 6530
					field579[++field672 - 1 & 31] = var20; // L: 6531
					var1.serverPacket = null; // L: 6532
					return true; // L: 6533
				}

				String var52;
				if (ServerPacket.field3228 == var1.serverPacket) { // L: 6535
					var52 = var3.readStringCp1252NullTerminated(); // L: 6536
					var5 = var3.method8651(); // L: 6537
					var21 = var3.readUnsignedByte(); // L: 6538
					if (var5 >= 1 && var5 <= 8) { // L: 6539
						if (var52.equalsIgnoreCase("null")) { // L: 6540
							var52 = null;
						}

						playerMenuActions[var5 - 1] = var52; // L: 6541
						playerOptionsPriorities[var5 - 1] = var21 == 0; // L: 6542
					}

					var1.serverPacket = null; // L: 6544
					return true; // L: 6545
				}

				if (ServerPacket.field3234 == var1.serverPacket) { // L: 6547
					var20 = var3.readUnsignedShort(); // L: 6548
					class377.method7139(var20); // L: 6549
					changedItemContainers[++field666 - 1 & 31] = var20 & 32767; // L: 6550
					var1.serverPacket = null; // L: 6551
					return true; // L: 6552
				}

				long var26;
				long var28;
				long var30;
				long var33;
				String var35;
				if (ServerPacket.field3259 == var1.serverPacket) { // L: 6554
					var52 = var3.readStringCp1252NullTerminated(); // L: 6555
					var26 = var3.readLong(); // L: 6556
					var28 = (long)var3.readUnsignedShort(); // L: 6557
					var30 = (long)var3.readMedium(); // L: 6558
					PlayerType var90 = (PlayerType)SpriteMask.findEnumerated(class211.PlayerType_values(), var3.readUnsignedByte()); // L: 6559
					var33 = (var28 << 32) + var30; // L: 6560
					boolean var71 = false; // L: 6561

					for (var15 = 0; var15 < 100; ++var15) { // L: 6562
						if (field710[var15] == var33) { // L: 6563
							var71 = true; // L: 6564
							break; // L: 6565
						}
					}

					if (var90.isUser && class6.friendSystem.isIgnored(new Username(var52, Occluder.loginType))) { // L: 6568 6569
						var71 = true;
					}

					if (!var71 && field667 == 0) { // L: 6571
						field710[field752] = var33; // L: 6572
						field752 = (field752 + 1) % 100; // L: 6573
						var35 = AbstractFont.escapeBrackets(class33.method471(class279.method5452(var3))); // L: 6574
						if (var90.modIcon != -1) { // L: 6575
							class12.addChatMessage(9, class7.method53(var90.modIcon) + var52, var35, GrandExchangeOffer.base37DecodeLong(var26));
						} else {
							class12.addChatMessage(9, var52, var35, GrandExchangeOffer.base37DecodeLong(var26)); // L: 6576
						}
					}

					var1.serverPacket = null; // L: 6578
					return true; // L: 6579
				}

				if (ServerPacket.field3260 == var1.serverPacket) { // L: 6581
					var20 = var3.method8831(); // L: 6582
					var5 = var3.method8651(); // L: 6583
					var21 = var3.method8616(); // L: 6584
					short var89 = (short)var3.method8676(); // L: 6585
					NPC var85 = npcs[var20]; // L: 6586
					if (var85 != null) { // L: 6587
						var85.method2562(var5, var21, var89); // L: 6588
					}

					var1.serverPacket = null; // L: 6590
					return true; // L: 6591
				}

				if (ServerPacket.field3231 == var1.serverPacket) { // L: 6593
					var52 = var3.readStringCp1252NullTerminated(); // L: 6594
					var24 = AbstractFont.escapeBrackets(class33.method471(class279.method5452(var3))); // L: 6595
					MusicPatchNode.addGameMessage(6, var52, var24); // L: 6596
					var1.serverPacket = null; // L: 6597
					return true; // L: 6598
				}

				if (ServerPacket.field3266 == var1.serverPacket) { // L: 6600
					Skeleton.loadRegions(false, var1.packetBuffer); // L: 6601
					var1.serverPacket = null; // L: 6602
					return true; // L: 6603
				}

				GameObject var42;
				if (ServerPacket.field3246 == var1.serverPacket) { // L: 6605
					var84 = var3.readByte(); // L: 6606
					var24 = var3.readStringCp1252NullTerminated(); // L: 6607
					long var36 = (long)var3.readUnsignedShort(); // L: 6608
					long var38 = (long)var3.readMedium(); // L: 6609
					PlayerType var74 = (PlayerType)SpriteMask.findEnumerated(class211.PlayerType_values(), var3.readUnsignedByte()); // L: 6610
					long var40 = var38 + (var36 << 32); // L: 6611
					boolean var69 = false; // L: 6612
					var42 = null; // L: 6613
					ClanChannel var94 = var84 >= 0 ? currentClanChannels[var84] : class19.guestClanChannel; // L: 6615
					if (var94 == null) { // L: 6616
						var69 = true; // L: 6617
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var74.isUser && class6.friendSystem.isIgnored(new Username(var24, Occluder.loginType))) { // L: 6626 6627
									var69 = true;
								}
								break;
							}

							if (var40 == field710[var15]) { // L: 6621
								var69 = true; // L: 6622
								break; // L: 6623
							}

							++var15; // L: 6620
						}
					}

					if (!var69) { // L: 6630
						field710[field752] = var40; // L: 6631
						field752 = (field752 + 1) % 100; // L: 6632
						var35 = AbstractFont.escapeBrackets(class279.method5452(var3)); // L: 6633
						var16 = var84 >= 0 ? 41 : 44; // L: 6634
						if (var74.modIcon != -1) { // L: 6635
							class12.addChatMessage(var16, class7.method53(var74.modIcon) + var24, var35, var94.name);
						} else {
							class12.addChatMessage(var16, var24, var35, var94.name); // L: 6636
						}
					}

					var1.serverPacket = null; // L: 6638
					return true; // L: 6639
				}

				if (ServerPacket.field3237 == var1.serverPacket) { // L: 6641
					class279.method5453(); // L: 6642
					var84 = var3.readByte(); // L: 6643
					class143 var82 = new class143(var3); // L: 6644
					ClanSettings var66;
					if (var84 >= 0) { // L: 6646
						var66 = currentClanSettings[var84];
					} else {
						var66 = WorldMapCacheName.guestClanSettings; // L: 6647
					}

					var82.method3126(var66); // L: 6648
					var1.serverPacket = null; // L: 6649
					return true; // L: 6650
				}

				if (ServerPacket.field3225 == var1.serverPacket) { // L: 6652
					var20 = var3.readUnsignedByte(); // L: 6653
					var5 = var3.readUnsignedByte(); // L: 6654
					var21 = var3.readUnsignedByte(); // L: 6655
					var22 = var3.readUnsignedByte(); // L: 6656
					field738[var20] = true; // L: 6657
					field739[var20] = var5; // L: 6658
					field680[var20] = var21; // L: 6659
					field741[var20] = var22; // L: 6660
					field566[var20] = 0; // L: 6661
					var1.serverPacket = null; // L: 6662
					return true; // L: 6663
				}

				if (ServerPacket.field3267 == var1.serverPacket) { // L: 6665
					var20 = var3.readInt(); // L: 6666
					if (var20 != field575) { // L: 6667
						field575 = var20; // L: 6668
						Varcs.method2724(); // L: 6669
					}

					var1.serverPacket = null; // L: 6671
					return true; // L: 6672
				}

				if (ServerPacket.field3278 == var1.serverPacket) { // L: 6674
					class188.field1958 = null; // L: 6675
					var1.serverPacket = null; // L: 6676
					return true; // L: 6677
				}

				if (ServerPacket.field3182 == var1.serverPacket) { // L: 6679
					class6.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 6680
					Message.FriendSystem_invalidateIgnoreds(); // L: 6681
					field701 = cycleCntr; // L: 6682
					var1.serverPacket = null; // L: 6683
					return true; // L: 6684
				}

				if (ServerPacket.field3200 == var1.serverPacket) { // L: 6686
					minimapState = var3.readUnsignedByte(); // L: 6687
					var1.serverPacket = null; // L: 6688
					return true; // L: 6689
				}

				if (ServerPacket.field3238 == var1.serverPacket) { // L: 6691
					var20 = var3.readInt(); // L: 6692
					InterfaceParent var81 = (InterfaceParent)interfaceParents.get((long)var20); // L: 6693
					if (var81 != null) { // L: 6694
						class17.closeInterface(var81, true);
					}

					if (meslayerContinueWidget != null) { // L: 6695
						class69.invalidateWidget(meslayerContinueWidget); // L: 6696
						meslayerContinueWidget = null; // L: 6697
					}

					var1.serverPacket = null; // L: 6699
					return true; // L: 6700
				}

				if (ServerPacket.field3242 == var1.serverPacket) { // L: 6702
					var20 = var3.readUnsignedByte(); // L: 6703
					if (var3.readUnsignedByte() == 0) { // L: 6704
						grandExchangeOffers[var20] = new GrandExchangeOffer(); // L: 6705
						var3.offset += 18; // L: 6706
					} else {
						--var3.offset; // L: 6709
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false); // L: 6710
					}

					field643 = cycleCntr; // L: 6712
					var1.serverPacket = null; // L: 6713
					return true; // L: 6714
				}

				if (ServerPacket.field3194 == var1.serverPacket) { // L: 6716
					ApproximateRouteStrategy.method1202(var3.readStringCp1252NullTerminated()); // L: 6717
					var1.serverPacket = null; // L: 6718
					return true; // L: 6719
				}

				if (ServerPacket.field3253 == var1.serverPacket) { // L: 6721
					isCameraLocked = false; // L: 6722

					for (var20 = 0; var20 < 5; ++var20) { // L: 6723
						field738[var20] = false;
					}

					var1.serverPacket = null; // L: 6724
					return true; // L: 6725
				}

				if (ServerPacket.field3249 == var1.serverPacket) { // L: 6727
					var20 = var3.method8660(); // L: 6728
					var5 = var3.readInt(); // L: 6729
					var6 = WorldMapSection1.getWidget(var5); // L: 6730
					if (var6.modelType != 6 || var20 != var6.modelId) { // L: 6731
						var6.modelType = 6; // L: 6732
						var6.modelId = var20; // L: 6733
						class69.invalidateWidget(var6); // L: 6734
					}

					var1.serverPacket = null; // L: 6736
					return true; // L: 6737
				}

				if (ServerPacket.field3271 == var1.serverPacket) { // L: 6739
					var20 = var3.readInt(); // L: 6740
					var5 = var3.readInt(); // L: 6741
					var21 = class105.getGcDuration(); // L: 6742
					PacketBufferNode var60 = UserComparator9.getPacketBufferNode(ClientPacket.field3082, packetWriter.isaacCipher); // L: 6744
					var60.packetBuffer.method8671(var20); // L: 6745
					var60.packetBuffer.method8670(var5); // L: 6746
					var60.packetBuffer.writeByte(var21); // L: 6747
					var60.packetBuffer.method8620(GameEngine.fps); // L: 6748
					packetWriter.addNode(var60); // L: 6749
					var1.serverPacket = null; // L: 6750
					return true; // L: 6751
				}

				if (ServerPacket.field3185 == var1.serverPacket) { // L: 6753
					var1.serverPacket = null; // L: 6754
					return true; // L: 6755
				}

				if (ServerPacket.field3178 == var1.serverPacket) { // L: 6757
					rebootTimer = var3.method8662() * 30; // L: 6758
					field686 = cycleCntr; // L: 6759
					var1.serverPacket = null; // L: 6760
					return true; // L: 6761
				}

				if (ServerPacket.field3193 == var1.serverPacket) { // L: 6763
					var20 = var3.readInt(); // L: 6764
					var5 = var3.method8831(); // L: 6765
					var6 = WorldMapSection1.getWidget(var20); // L: 6766
					if (var6.modelType != 1 || var5 != var6.modelId) { // L: 6767
						var6.modelType = 1; // L: 6768
						var6.modelId = var5; // L: 6769
						class69.invalidateWidget(var6); // L: 6770
					}

					var1.serverPacket = null; // L: 6772
					return true; // L: 6773
				}

				if (ServerPacket.field3190 == var1.serverPacket) { // L: 6775
					var21 = var3.readUnsignedShort(); // L: 6780
					var5 = var3.method8674(); // L: 6781
					var20 = var3.method8831(); // L: 6782
					var59 = npcs[var20]; // L: 6783
					if (var59 != null) { // L: 6784
						var59.spotAnimation = var21; // L: 6785
						var59.field1191 = var5 >> 16; // L: 6786
						var59.field1190 = (var5 & 65535) + cycle; // L: 6787
						var59.spotAnimationFrame = 0; // L: 6788
						var59.field1175 = 0; // L: 6789
						if (var59.field1190 > cycle) { // L: 6790
							var59.spotAnimationFrame = -1; // L: 6791
						}

						if (var59.spotAnimation == 65535) { // L: 6793
							var59.spotAnimation = -1; // L: 6794
						}
					}

					var1.serverPacket = null; // L: 6797
					return true; // L: 6798
				}

				if (ServerPacket.field3227 == var1.serverPacket) { // L: 6800
					var20 = var3.readUShortSmart(); // L: 6801
					boolean var70 = var3.readUnsignedByte() == 1; // L: 6802
					var62 = ""; // L: 6803
					boolean var86 = false; // L: 6804
					if (var70) { // L: 6805
						var62 = var3.readStringCp1252NullTerminated(); // L: 6806
						if (class6.friendSystem.isIgnored(new Username(var62, Occluder.loginType))) { // L: 6807
							var86 = true;
						}
					}

					String var83 = var3.readStringCp1252NullTerminated(); // L: 6809
					if (!var86) { // L: 6810
						MusicPatchNode.addGameMessage(var20, var62, var83);
					}

					var1.serverPacket = null; // L: 6811
					return true; // L: 6812
				}

				if (ServerPacket.field3223 == var1.serverPacket) { // L: 6814
					class6.friendSystem.method1836(); // L: 6815
					field701 = cycleCntr; // L: 6816
					var1.serverPacket = null; // L: 6817
					return true; // L: 6818
				}

				if (ServerPacket.field3174 == var1.serverPacket) { // L: 6820
					if (class188.field1958 == null) { // L: 6821
						class188.field1958 = new class425(Messages.Ignored_cached);
					}

					class486 var53 = Messages.Ignored_cached.method7939(var3); // L: 6822
					class188.field1958.field4634.vmethod8322(var53.field4967, var53.field4966); // L: 6823
					field677[++field678 - 1 & 31] = var53.field4967; // L: 6824
					var1.serverPacket = null; // L: 6825
					return true; // L: 6826
				}

				InterfaceParent var56;
				if (ServerPacket.field3229 == var1.serverPacket) { // L: 6828
					var20 = var3.method8724(); // L: 6829
					var5 = var3.method8616(); // L: 6830
					InterfaceParent var61 = (InterfaceParent)interfaceParents.get((long)var20); // L: 6831
					var56 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6832
					if (var56 != null) { // L: 6833
						class17.closeInterface(var56, var61 == null || var61.group != var56.group);
					}

					if (var61 != null) { // L: 6834
						var61.remove(); // L: 6835
						interfaceParents.put(var61, (long)var5); // L: 6836
					}

					var79 = WorldMapSection1.getWidget(var20); // L: 6838
					if (var79 != null) { // L: 6839
						class69.invalidateWidget(var79);
					}

					var79 = WorldMapSection1.getWidget(var5); // L: 6840
					if (var79 != null) { // L: 6841
						class69.invalidateWidget(var79); // L: 6842
						class278.revalidateWidgetScroll(class155.Widget_interfaceComponents[var79.id >>> 16], var79, true); // L: 6843
					}

					if (rootInterface != -1) { // L: 6845
						NPCComposition.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 6846
					return true; // L: 6847
				}

				if (ServerPacket.field3198 == var1.serverPacket) { // L: 6849
					class148.updateNpcs(false, var3); // L: 6850
					var1.serverPacket = null; // L: 6851
					return true; // L: 6852
				}

				if (ServerPacket.field3199 == var1.serverPacket) { // L: 6854
					var20 = var3.readUnsignedByte(); // L: 6855
					StructComposition.method3815(var20); // L: 6856
					var1.serverPacket = null; // L: 6857
					return true; // L: 6858
				}

				String var46;
				if (ServerPacket.field3219 == var1.serverPacket) { // L: 6860
					var52 = var3.readStringCp1252NullTerminated(); // L: 6861
					var26 = (long)var3.readUnsignedShort(); // L: 6862
					var28 = (long)var3.readMedium(); // L: 6863
					PlayerType var43 = (PlayerType)SpriteMask.findEnumerated(class211.PlayerType_values(), var3.readUnsignedByte()); // L: 6864
					long var44 = var28 + (var26 << 32); // L: 6865
					boolean var64 = false; // L: 6866

					for (var13 = 0; var13 < 100; ++var13) { // L: 6867
						if (var44 == field710[var13]) { // L: 6868
							var64 = true; // L: 6869
							break; // L: 6870
						}
					}

					if (class6.friendSystem.isIgnored(new Username(var52, Occluder.loginType))) { // L: 6873
						var64 = true;
					}

					if (!var64 && field667 == 0) { // L: 6874
						field710[field752] = var44; // L: 6875
						field752 = (field752 + 1) % 100; // L: 6876
						var46 = AbstractFont.escapeBrackets(class33.method471(class279.method5452(var3))); // L: 6877
						byte var68;
						if (var43.isPrivileged) { // L: 6879
							var68 = 7;
						} else {
							var68 = 3; // L: 6880
						}

						if (var43.modIcon != -1) { // L: 6881
							MusicPatchNode.addGameMessage(var68, class7.method53(var43.modIcon) + var52, var46);
						} else {
							MusicPatchNode.addGameMessage(var68, var52, var46); // L: 6882
						}
					}

					var1.serverPacket = null; // L: 6884
					return true; // L: 6885
				}

				if (ServerPacket.field3184 == var1.serverPacket) { // L: 6887
					publicChatMode = var3.method8651(); // L: 6888
					tradeChatMode = var3.readUnsignedByte(); // L: 6889
					var1.serverPacket = null; // L: 6890
					return true; // L: 6891
				}

				if (ServerPacket.field3213 == var1.serverPacket) { // L: 6893
					if (rootInterface != -1) { // L: 6894
						NPCComposition.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6895
					return true; // L: 6896
				}

				if (ServerPacket.field3235 == var1.serverPacket) { // L: 6898
					WorldMapSprite.updatePlayers(var3, var1.serverPacketLength); // L: 6899
					class462.method8434(); // L: 6900
					var1.serverPacket = null; // L: 6901
					return true; // L: 6902
				}

				if (ServerPacket.field3215 == var1.serverPacket) { // L: 6904
					var20 = var3.readUnsignedShort(); // L: 6905
					var5 = var3.readUnsignedByte(); // L: 6906
					var21 = var3.readUnsignedShort(); // L: 6907
					Skills.queueSoundEffect(var20, var5, var21); // L: 6908
					var1.serverPacket = null; // L: 6909
					return true; // L: 6910
				}

				if (ServerPacket.field3207 == var1.serverPacket) { // L: 6912
					class148.updateNpcs(true, var3); // L: 6913
					var1.serverPacket = null; // L: 6914
					return true; // L: 6915
				}

				if (ServerPacket.field3221 == var1.serverPacket) { // L: 6917
					var20 = var3.readInt(); // L: 6918
					var5 = var3.method8724(); // L: 6919
					var21 = var3.method8831(); // L: 6920
					if (var21 == 65535) { // L: 6921
						var21 = -1;
					}

					var22 = var3.method8662(); // L: 6922
					if (var22 == 65535) { // L: 6923
						var22 = -1;
					}

					for (var8 = var21; var8 <= var22; ++var8) { // L: 6924
						var30 = ((long)var20 << 32) + (long)var8; // L: 6925
						Node var32 = widgetFlags.get(var30); // L: 6926
						if (var32 != null) { // L: 6927
							var32.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var30); // L: 6928
					}

					var1.serverPacket = null; // L: 6930
					return true; // L: 6931
				}

				if (ServerPacket.field3232 == var1.serverPacket) { // L: 6933
					class149.field1677 = var3.method8614(); // L: 6934
					class283.field3165 = var3.method8614(); // L: 6935
					var1.serverPacket = null; // L: 6936
					return true; // L: 6937
				}

				if (ServerPacket.field3226 == var1.serverPacket) { // L: 6939
					var3.offset += 28; // L: 6940
					if (var3.checkCrc()) { // L: 6941
						class17.method255(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 6942
					return true; // L: 6943
				}

				if (ServerPacket.field3210 == var1.serverPacket) { // L: 6945
					var20 = var3.readInt(); // L: 6946
					var5 = var3.readUnsignedShort(); // L: 6947
					if (var20 < -70000) { // L: 6948
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 6950
						var6 = WorldMapSection1.getWidget(var20);
					} else {
						var6 = null; // L: 6951
					}

					for (; var3.offset < var1.serverPacketLength; UserComparator3.itemContainerSetItem(var5, var22, var8 - 1, var9)) { // L: 6952 6966
						var22 = var3.readUShortSmart(); // L: 6953
						var8 = var3.readUnsignedShort(); // L: 6954
						var9 = 0; // L: 6955
						if (var8 != 0) { // L: 6956
							var9 = var3.readUnsignedByte(); // L: 6957
							if (var9 == 255) { // L: 6958
								var9 = var3.readInt();
							}
						}

						if (var6 != null && var22 >= 0 && var22 < var6.itemIds.length) { // L: 6960 6961
							var6.itemIds[var22] = var8; // L: 6962
							var6.itemQuantities[var22] = var9; // L: 6963
						}
					}

					if (var6 != null) { // L: 6968
						class69.invalidateWidget(var6);
					}

					GrandExchangeOfferNameComparator.method6553(); // L: 6969
					changedItemContainers[++field666 - 1 & 31] = var5 & 32767; // L: 6970
					var1.serverPacket = null; // L: 6971
					return true; // L: 6972
				}

				if (ServerPacket.field3212 == var1.serverPacket) { // L: 6974
					var20 = var3.method8616(); // L: 6975
					var80 = WorldMapSection1.getWidget(var20); // L: 6976

					for (var21 = 0; var21 < var80.itemIds.length; ++var21) { // L: 6977
						var80.itemIds[var21] = -1; // L: 6978
						var80.itemIds[var21] = 0; // L: 6979
					}

					class69.invalidateWidget(var80); // L: 6981
					var1.serverPacket = null; // L: 6982
					return true; // L: 6983
				}

				if (ServerPacket.field3255 == var1.serverPacket) { // L: 6985
					class150.method3183(class283.field3154); // L: 6986
					var1.serverPacket = null; // L: 6987
					return true; // L: 6988
				}

				if (ServerPacket.field3187 == var1.serverPacket) { // L: 6990
					var84 = var3.readByte(); // L: 6991
					var26 = (long)var3.readUnsignedShort(); // L: 6992
					var28 = (long)var3.readMedium(); // L: 6993
					var30 = var28 + (var26 << 32); // L: 6994
					boolean var65 = false; // L: 6995
					ClanChannel var95 = var84 >= 0 ? currentClanChannels[var84] : class19.guestClanChannel; // L: 6996
					if (var95 == null) { // L: 6997
						var65 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 6999
							if (field710[var13] == var30) { // L: 7000
								var65 = true; // L: 7001
								break; // L: 7002
							}
						}
					}

					if (!var65) { // L: 7006
						field710[field752] = var30; // L: 7007
						field752 = (field752 + 1) % 100; // L: 7008
						var46 = class279.method5452(var3); // L: 7009
						var14 = var84 >= 0 ? 43 : 46; // L: 7010
						class12.addChatMessage(var14, "", var46, var95.name); // L: 7011
					}

					var1.serverPacket = null; // L: 7013
					return true; // L: 7014
				}

				if (ServerPacket.field3180 == var1.serverPacket) { // L: 7016
					class150.method3183(class283.field3161); // L: 7017
					var1.serverPacket = null; // L: 7018
					return true; // L: 7019
				}

				if (ServerPacket.field3192 == var1.serverPacket) { // L: 7021
					return this.method1240(var1, 1); // L: 7022
				}

				if (ServerPacket.field3239 == var1.serverPacket) { // L: 7024
					var20 = var3.method8674(); // L: 7025
					var5 = var3.method8676(); // L: 7026
					var6 = WorldMapSection1.getWidget(var20); // L: 7027
					if (var5 != var6.sequenceId || var5 == -1) { // L: 7028
						var6.sequenceId = var5; // L: 7029
						var6.modelFrame = 0; // L: 7030
						var6.modelFrameCycle = 0; // L: 7031
						class69.invalidateWidget(var6); // L: 7032
					}

					var1.serverPacket = null; // L: 7034
					return true; // L: 7035
				}

				if (ServerPacket.field3262 == var1.serverPacket) { // L: 7037
					class150.method3183(class283.field3159); // L: 7038
					var1.serverPacket = null; // L: 7039
					return true; // L: 7040
				}

				if (ServerPacket.field3209 == var1.serverPacket) { // L: 7042
					class154.readReflectionCheck(var3, var1.serverPacketLength); // L: 7043
					var1.serverPacket = null; // L: 7044
					return true; // L: 7045
				}

				Widget var7;
				if (ServerPacket.field3279 == var1.serverPacket) { // L: 7047
					var20 = var3.method8616(); // L: 7048
					var5 = var3.method8674(); // L: 7049
					var21 = var3.readUnsignedShort(); // L: 7050
					if (var21 == 65535) { // L: 7051
						var21 = -1;
					}

					var7 = WorldMapSection1.getWidget(var20); // L: 7052
					ItemComposition var25;
					if (!var7.isIf3) { // L: 7053
						if (var21 == -1) { // L: 7054
							var7.modelType = 0; // L: 7055
							var1.serverPacket = null; // L: 7056
							return true; // L: 7057
						}

						var25 = ParamComposition.ItemComposition_get(var21); // L: 7059
						var7.modelType = 4; // L: 7060
						var7.modelId = var21; // L: 7061
						var7.modelAngleX = var25.xan2d; // L: 7062
						var7.modelAngleY = var25.yan2d; // L: 7063
						var7.modelZoom = var25.zoom2d * 100 / var5; // L: 7064
						class69.invalidateWidget(var7); // L: 7065
					} else {
						var7.itemId = var21; // L: 7068
						var7.itemQuantity = var5; // L: 7069
						var25 = ParamComposition.ItemComposition_get(var21); // L: 7070
						var7.modelAngleX = var25.xan2d; // L: 7071
						var7.modelAngleY = var25.yan2d; // L: 7072
						var7.modelAngleZ = var25.zan2d; // L: 7073
						var7.modelOffsetX = var25.offsetX2d; // L: 7074
						var7.modelOffsetY = var25.offsetY2d; // L: 7075
						var7.modelZoom = var25.zoom2d; // L: 7076
						if (var25.isStackable == 1) { // L: 7077
							var7.itemQuantityMode = 1;
						} else {
							var7.itemQuantityMode = 2; // L: 7078
						}

						if (var7.field3532 > 0) { // L: 7079
							var7.modelZoom = var7.modelZoom * 32 / var7.field3532;
						} else if (var7.rawWidth > 0) { // L: 7080
							var7.modelZoom = var7.modelZoom * 32 / var7.rawWidth;
						}

						class69.invalidateWidget(var7); // L: 7081
					}

					var1.serverPacket = null; // L: 7083
					return true; // L: 7084
				}

				if (ServerPacket.field3217 == var1.serverPacket) { // L: 7086
					var73 = var3.readUnsignedByte() == 1; // L: 7087
					if (var73) { // L: 7088
						GrandExchangeOfferWorldComparator.field4254 = WorldMapSection2.method4844() - var3.readLong(); // L: 7089
						Projectile.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 7090
					} else {
						Projectile.grandExchangeEvents = null; // L: 7092
					}

					field685 = cycleCntr; // L: 7093
					var1.serverPacket = null; // L: 7094
					return true; // L: 7095
				}

				if (ServerPacket.field3195 == var1.serverPacket) { // L: 7097
					var10 = var3.readUnsignedByte(); // L: 7106
					var11 = var3.method8660(); // L: 7107
					var21 = var3.readMedium(); // L: 7108
					var20 = var21 >> 16; // L: 7109
					var5 = var21 >> 8 & 255; // L: 7110
					var22 = var20 + (var21 >> 4 & 7); // L: 7111
					var8 = var5 + (var21 & 7); // L: 7112
					var9 = var3.method8660(); // L: 7113
					if (var22 >= 0 && var8 >= 0 && var22 < 104 && var8 < 104) { // L: 7114
						var22 = var22 * 128 + 64; // L: 7115
						var8 = var8 * 128 + 64; // L: 7116
						GraphicsObject var47 = new GraphicsObject(var9, TaskHandler.Client_plane, var22, var8, WorldMapDecorationType.getTileHeight(var22, var8, TaskHandler.Client_plane) - var10, var11, cycle); // L: 7117
						graphicsObjects.addFirst(var47); // L: 7118
					}

					var1.serverPacket = null; // L: 7120
					return true; // L: 7121
				}

				if (ServerPacket.field3240 == var1.serverPacket) { // L: 7123
					var20 = var3.method8662(); // L: 7124
					var5 = var3.method8616(); // L: 7125
					var6 = WorldMapSection1.getWidget(var5); // L: 7126
					if (var6.modelType != 2 || var20 != var6.modelId) { // L: 7127
						var6.modelType = 2; // L: 7128
						var6.modelId = var20; // L: 7129
						class69.invalidateWidget(var6); // L: 7130
					}

					var1.serverPacket = null; // L: 7132
					return true; // L: 7133
				}

				if (ServerPacket.field3206 == var1.serverPacket) { // L: 7135
					var20 = var3.method8650(); // L: 7136
					var5 = var3.readInt(); // L: 7137
					var21 = var3.method8660(); // L: 7138
					var56 = (InterfaceParent)interfaceParents.get((long)var5); // L: 7139
					if (var56 != null) { // L: 7140
						class17.closeInterface(var56, var21 != var56.group);
					}

					DynamicObject.method2142(var5, var21, var20); // L: 7141
					var1.serverPacket = null; // L: 7142
					return true; // L: 7143
				}

				if (ServerPacket.field3274 == var1.serverPacket) { // L: 7145
					field482 = cycleCntr; // L: 7146
					var84 = var3.readByte(); // L: 7147
					class157 var78 = new class157(var3); // L: 7148
					ClanChannel var55;
					if (var84 >= 0) { // L: 7150
						var55 = currentClanChannels[var84];
					} else {
						var55 = class19.guestClanChannel; // L: 7151
					}

					var78.method3303(var55); // L: 7152
					var1.serverPacket = null; // L: 7153
					return true; // L: 7154
				}

				if (ServerPacket.field3256 == var1.serverPacket) { // L: 7156
					var20 = var3.method8660(); // L: 7157
					if (var20 == 65535) { // L: 7158
						var20 = -1;
					}

					Language.playSong(var20); // L: 7159
					var1.serverPacket = null; // L: 7160
					return true; // L: 7161
				}

				if (ServerPacket.field3188 == var1.serverPacket) { // L: 7163
					var20 = var3.readMedium(); // L: 7164
					var5 = var3.method8660(); // L: 7165
					if (var5 == 65535) { // L: 7166
						var5 = -1;
					}

					class19.method278(var5, var20); // L: 7167
					var1.serverPacket = null; // L: 7168
					return true; // L: 7169
				}

				if (ServerPacket.field3247 == var1.serverPacket) { // L: 7171
					class283.field3165 = var3.method8650(); // L: 7172
					class149.field1677 = var3.readUnsignedByte(); // L: 7173

					while (var3.offset < var1.serverPacketLength) { // L: 7174
						var20 = var3.readUnsignedByte(); // L: 7175
						class283 var77 = class208.method4111()[var20]; // L: 7176
						class150.method3183(var77); // L: 7177
					}

					var1.serverPacket = null; // L: 7179
					return true; // L: 7180
				}

				if (ServerPacket.field3268 == var1.serverPacket) { // L: 7182
					var52 = var3.readStringCp1252NullTerminated(); // L: 7183
					Object[] var75 = new Object[var52.length() + 1]; // L: 7184

					for (var21 = var52.length() - 1; var21 >= 0; --var21) { // L: 7185
						if (var52.charAt(var21) == 's') { // L: 7186
							var75[var21 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var75[var21 + 1] = new Integer(var3.readInt()); // L: 7187
						}
					}

					var75[0] = new Integer(var3.readInt()); // L: 7189
					ScriptEvent var54 = new ScriptEvent(); // L: 7190
					var54.args = var75; // L: 7191
					class9.runScriptEvent(var54); // L: 7192
					var1.serverPacket = null; // L: 7193
					return true; // L: 7194
				}

				if (ServerPacket.field3197 == var1.serverPacket) { // L: 7196
					var20 = var3.method8831(); // L: 7201
					Player var58;
					if (var20 == localPlayerIndex) { // L: 7202
						var58 = BuddyRankComparator.localPlayer; // L: 7203
					} else {
						var58 = players[var20]; // L: 7206
					}

					var5 = var3.readUnsignedShort(); // L: 7208
					var21 = var3.method8724(); // L: 7209
					if (var58 != null) { // L: 7210
						var58.spotAnimation = var5; // L: 7211
						var58.field1191 = var21 >> 16; // L: 7212
						var58.field1190 = (var21 & 65535) + cycle; // L: 7213
						var58.spotAnimationFrame = 0; // L: 7214
						var58.field1175 = 0; // L: 7215
						if (var58.field1190 > cycle) { // L: 7216
							var58.spotAnimationFrame = -1; // L: 7217
						}

						if (var58.spotAnimation == 65535) { // L: 7219
							var58.spotAnimation = -1; // L: 7220
						}
					}

					var1.serverPacket = null; // L: 7223
					return true; // L: 7224
				}

				if (ServerPacket.field3189 == var1.serverPacket) { // L: 7226
					return this.method1240(var1, 2); // L: 7227
				}

				if (ServerPacket.field3196 == var1.serverPacket) { // L: 7229
					for (var20 = 0; var20 < players.length; ++var20) { // L: 7230
						if (players[var20] != null) { // L: 7231
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) { // L: 7233
						if (npcs[var20] != null) { // L: 7234
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 7236
					return true; // L: 7237
				}

				if (ServerPacket.field3236 == var1.serverPacket) { // L: 7239
					var20 = var3.readInt(); // L: 7240
					var5 = var3.readUnsignedShort(); // L: 7241
					if (var20 < -70000) { // L: 7242
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 7244
						var6 = WorldMapSection1.getWidget(var20);
					} else {
						var6 = null; // L: 7245
					}

					if (var6 != null) { // L: 7246
						for (var22 = 0; var22 < var6.itemIds.length; ++var22) { // L: 7247
							var6.itemIds[var22] = 0; // L: 7248
							var6.itemQuantities[var22] = 0; // L: 7249
						}
					}

					TileItem.clearItemContainer(var5); // L: 7252
					var22 = var3.readUnsignedShort(); // L: 7253

					for (var8 = 0; var8 < var22; ++var8) { // L: 7254
						var9 = var3.readUnsignedByte(); // L: 7255
						if (var9 == 255) { // L: 7256
							var9 = var3.method8724();
						}

						var10 = var3.method8660(); // L: 7257
						if (var6 != null && var8 < var6.itemIds.length) { // L: 7258 7259
							var6.itemIds[var8] = var10; // L: 7260
							var6.itemQuantities[var8] = var9; // L: 7261
						}

						UserComparator3.itemContainerSetItem(var5, var8, var10 - 1, var9); // L: 7264
					}

					if (var6 != null) { // L: 7266
						class69.invalidateWidget(var6);
					}

					GrandExchangeOfferNameComparator.method6553(); // L: 7267
					changedItemContainers[++field666 - 1 & 31] = var5 & 32767; // L: 7268
					var1.serverPacket = null; // L: 7269
					return true; // L: 7270
				}

				if (ServerPacket.field3224 == var1.serverPacket) { // L: 7272
					class150.method3183(class283.field3163); // L: 7273
					var1.serverPacket = null; // L: 7274
					return true; // L: 7275
				}

				if (ServerPacket.field3183 == var1.serverPacket) { // L: 7277
					var13 = var3.method8662(); // L: 7288
					var9 = var3.readUnsignedByte(); // L: 7289
					var10 = var9 >> 2; // L: 7290
					var11 = var9 & 3; // L: 7291
					var12 = field554[var10]; // L: 7292
					var21 = var3.method8629(); // L: 7293
					var20 = var21 >> 16; // L: 7294
					var5 = var21 >> 8 & 255; // L: 7295
					var22 = var20 + (var21 >> 4 & 7); // L: 7296
					var8 = var5 + (var21 & 7); // L: 7297
					if (var22 >= 0 && var8 >= 0 && var22 < 103 && var8 < 103) { // L: 7298
						if (var12 == 0) { // L: 7299
							WallObject var93 = class1.scene.method4408(TaskHandler.Client_plane, var22, var8); // L: 7300
							if (var93 != null) { // L: 7301
								var15 = class279.Entity_unpackID(var93.tag); // L: 7302
								if (var10 == 2) { // L: 7303
									var93.renderable1 = new DynamicObject(var15, 2, var11 + 4, TaskHandler.Client_plane, var22, var8, var13, false, var93.renderable1); // L: 7304
									var93.renderable2 = new DynamicObject(var15, 2, var11 + 1 & 3, TaskHandler.Client_plane, var22, var8, var13, false, var93.renderable2); // L: 7305
								} else {
									var93.renderable1 = new DynamicObject(var15, var10, var11, TaskHandler.Client_plane, var22, var8, var13, false, var93.renderable1); // L: 7307
								}
							}
						} else if (var12 == 1) { // L: 7310
							DecorativeObject var92 = class1.scene.method4409(TaskHandler.Client_plane, var22, var8); // L: 7311
							if (var92 != null) { // L: 7312
								var15 = class279.Entity_unpackID(var92.tag); // L: 7313
								if (var10 != 4 && var10 != 5) { // L: 7314
									if (var10 == 6) { // L: 7317
										var92.renderable1 = new DynamicObject(var15, 4, var11 + 4, TaskHandler.Client_plane, var22, var8, var13, false, var92.renderable1); // L: 7318
									} else if (var10 == 7) { // L: 7320
										var92.renderable1 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, TaskHandler.Client_plane, var22, var8, var13, false, var92.renderable1); // L: 7321
									} else if (var10 == 8) { // L: 7323
										var92.renderable1 = new DynamicObject(var15, 4, var11 + 4, TaskHandler.Client_plane, var22, var8, var13, false, var92.renderable1); // L: 7324
										var92.renderable2 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, TaskHandler.Client_plane, var22, var8, var13, false, var92.renderable2); // L: 7325
									}
								} else {
									var92.renderable1 = new DynamicObject(var15, 4, var11, TaskHandler.Client_plane, var22, var8, var13, false, var92.renderable1); // L: 7315
								}
							}
						} else if (var12 == 2) { // L: 7329
							var42 = class1.scene.getGameObject(TaskHandler.Client_plane, var22, var8); // L: 7330
							if (var10 == 11) { // L: 7331
								var10 = 10; // L: 7332
							}

							if (var42 != null) { // L: 7334
								var42.renderable = new DynamicObject(class279.Entity_unpackID(var42.tag), var10, var11, TaskHandler.Client_plane, var22, var8, var13, false, var42.renderable); // L: 7335
							}
						} else if (var12 == 3) { // L: 7338
							GroundObject var91 = class1.scene.getGroundObject(TaskHandler.Client_plane, var22, var8); // L: 7339
							if (var91 != null) { // L: 7340
								var91.renderable = new DynamicObject(class279.Entity_unpackID(var91.tag), 22, var11, TaskHandler.Client_plane, var22, var8, var13, false, var91.renderable); // L: 7341
							}
						}
					}

					var1.serverPacket = null; // L: 7345
					return true; // L: 7346
				}

				if (ServerPacket.field3175 == var1.serverPacket) { // L: 7348
					Skeleton.loadRegions(true, var1.packetBuffer); // L: 7349
					var1.serverPacket = null; // L: 7350
					return true; // L: 7351
				}

				if (ServerPacket.field3216 == var1.serverPacket) { // L: 7353
					var73 = var3.readBoolean(); // L: 7354
					if (var73) { // L: 7355
						if (Language.field4294 == null) { // L: 7356
							Language.field4294 = new class350();
						}
					} else {
						Language.field4294 = null; // L: 7358
					}

					var1.serverPacket = null; // L: 7359
					return true; // L: 7360
				}

				if (ServerPacket.field3230 == var1.serverPacket) { // L: 7362
					GrandExchangeOfferNameComparator.method6553(); // L: 7363
					field652 = var3.readUnsignedShort(); // L: 7364
					field686 = cycleCntr; // L: 7365
					var1.serverPacket = null; // L: 7366
					return true; // L: 7367
				}

				if (ServerPacket.field3272 == var1.serverPacket) { // L: 7369
					var52 = var3.readStringCp1252NullTerminated(); // L: 7370
					var5 = var3.method8616(); // L: 7371
					var6 = WorldMapSection1.getWidget(var5); // L: 7372
					if (!var52.equals(var6.text)) { // L: 7373
						var6.text = var52; // L: 7374
						class69.invalidateWidget(var6); // L: 7375
					}

					var1.serverPacket = null; // L: 7377
					return true; // L: 7378
				}

				if (ServerPacket.field3211 == var1.serverPacket) { // L: 7380
					var20 = var3.offset + var1.serverPacketLength; // L: 7381
					var5 = var3.readUnsignedShort(); // L: 7382
					var21 = var3.readUnsignedShort(); // L: 7383
					if (var5 != rootInterface) { // L: 7384
						rootInterface = var5; // L: 7385
						this.resizeRoot(false); // L: 7386
						ApproximateRouteStrategy.Widget_resetModelFrames(rootInterface); // L: 7387
						WorldMapSection1.runWidgetOnLoadListener(rootInterface); // L: 7388

						for (var22 = 0; var22 < 100; ++var22) { // L: 7389
							field722[var22] = true;
						}
					}

					InterfaceParent var23;
					for (; var21-- > 0; var23.field1042 = true) { // L: 7391 7401
						var22 = var3.readInt(); // L: 7392
						var8 = var3.readUnsignedShort(); // L: 7393
						var9 = var3.readUnsignedByte(); // L: 7394
						var23 = (InterfaceParent)interfaceParents.get((long)var22); // L: 7395
						if (var23 != null && var8 != var23.group) { // L: 7396
							class17.closeInterface(var23, true); // L: 7397
							var23 = null; // L: 7398
						}

						if (var23 == null) { // L: 7400
							var23 = DynamicObject.method2142(var22, var8, var9);
						}
					}

					for (var56 = (InterfaceParent)interfaceParents.first(); var56 != null; var56 = (InterfaceParent)interfaceParents.next()) { // L: 7403
						if (var56.field1042) { // L: 7404
							var56.field1042 = false;
						} else {
							class17.closeInterface(var56, true); // L: 7406
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 7409

					while (var3.offset < var20) { // L: 7410
						var22 = var3.readInt(); // L: 7411
						var8 = var3.readUnsignedShort(); // L: 7412
						var9 = var3.readUnsignedShort(); // L: 7413
						var10 = var3.readInt(); // L: 7414

						for (var11 = var8; var11 <= var9; ++var11) { // L: 7415
							var33 = (long)var11 + ((long)var22 << 32); // L: 7416
							widgetFlags.put(new IntegerNode(var10), var33); // L: 7417
						}
					}

					var1.serverPacket = null; // L: 7420
					return true; // L: 7421
				}

				if (ServerPacket.field3214 == var1.serverPacket) { // L: 7423
					class150.method3183(class283.field3158); // L: 7424
					var1.serverPacket = null; // L: 7425
					return true; // L: 7426
				}

				if (ServerPacket.field3276 == var1.serverPacket) { // L: 7428
					var20 = var3.method8724(); // L: 7429
					var5 = var3.method8664(); // L: 7430
					var21 = var3.readShort(); // L: 7431
					var7 = WorldMapSection1.getWidget(var20); // L: 7432
					if (var5 != var7.rawX || var21 != var7.rawY || var7.xAlignment != 0 || var7.yAlignment != 0) { // L: 7433
						var7.rawX = var5; // L: 7434
						var7.rawY = var21; // L: 7435
						var7.xAlignment = 0; // L: 7436
						var7.yAlignment = 0; // L: 7437
						class69.invalidateWidget(var7); // L: 7438
						this.alignWidget(var7); // L: 7439
						if (var7.type == 0) { // L: 7440
							class278.revalidateWidgetScroll(class155.Widget_interfaceComponents[var20 >> 16], var7, false);
						}
					}

					var1.serverPacket = null; // L: 7442
					return true; // L: 7443
				}

				if (ServerPacket.field3233 == var1.serverPacket) { // L: 7445
					class188.field1958 = new class425(Messages.Ignored_cached); // L: 7446
					var1.serverPacket = null; // L: 7447
					return true; // L: 7448
				}

				if (ServerPacket.field3203 == var1.serverPacket) { // L: 7450
					class150.method3183(class283.field3157); // L: 7451
					var1.serverPacket = null; // L: 7452
					return true; // L: 7453
				}

				if (ServerPacket.field3251 == var1.serverPacket) { // L: 7455
					World var51 = new World(); // L: 7456
					var51.host = var3.readStringCp1252NullTerminated(); // L: 7457
					var51.id = var3.readUnsignedShort(); // L: 7458
					var5 = var3.readInt(); // L: 7459
					var51.properties = var5; // L: 7460
					class19.method280(45); // L: 7461
					var2.close(); // L: 7462
					var2 = null; // L: 7463
					VarbitComposition.changeWorld(var51); // L: 7464
					var1.serverPacket = null; // L: 7465
					return false; // L: 7466
				}

				if (ServerPacket.field3263 == var1.serverPacket) { // L: 7468
					isCameraLocked = true; // L: 7469
					field737 = false; // L: 7470
					class167.field1800 = var3.readUnsignedByte() * 128; // L: 7471
					Canvas.field123 = var3.readUnsignedByte() * 128; // L: 7472
					MidiPcmStream.field3361 = var3.readUnsignedShort(); // L: 7473
					GrandExchangeOfferUnitPriceComparator.field4269 = var3.readUnsignedByte(); // L: 7474
					Skeleton.field2505 = var3.readUnsignedByte(); // L: 7475
					if (Skeleton.field2505 >= 100) { // L: 7476
						var20 = class167.field1800 * 16384 + 64; // L: 7477
						var5 = Canvas.field123 * 16384 + 64; // L: 7478
						var21 = WorldMapDecorationType.getTileHeight(var20, var5, TaskHandler.Client_plane) - MidiPcmStream.field3361; // L: 7479
						var22 = var20 - class381.cameraX; // L: 7480
						var8 = var21 - class351.cameraY; // L: 7481
						var9 = var5 - class471.cameraZ; // L: 7482
						var10 = (int)Math.sqrt((double)(var9 * var9 + var22 * var22)); // L: 7483
						class311.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047; // L: 7484
						class110.cameraYaw = (int)(Math.atan2((double)var22, (double)var9) * -325.9490051269531D) & 2047; // L: 7485
						if (class311.cameraPitch < 128) { // L: 7486
							class311.cameraPitch = 128;
						}

						if (class311.cameraPitch > 383) { // L: 7487
							class311.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 7489
					return true; // L: 7490
				}

				if (ServerPacket.field3270 == var1.serverPacket) { // L: 7492
					class150.method3183(class283.field3155); // L: 7493
					var1.serverPacket = null; // L: 7494
					return true; // L: 7495
				}

				if (ServerPacket.field3202 == var1.serverPacket) { // L: 7497
					class283.field3165 = var3.method8650(); // L: 7498
					class149.field1677 = var3.readUnsignedByte(); // L: 7499

					for (var20 = class283.field3165; var20 < class283.field3165 + 8; ++var20) { // L: 7500
						for (var5 = class149.field1677; var5 < class149.field1677 + 8; ++var5) { // L: 7501
							if (groundItems[TaskHandler.Client_plane][var20][var5] != null) { // L: 7502
								groundItems[TaskHandler.Client_plane][var20][var5] = null; // L: 7503
								class148.updateItemPile(var20, var5); // L: 7504
							}
						}
					}

					for (PendingSpawn var50 = (PendingSpawn)pendingSpawns.last(); var50 != null; var50 = (PendingSpawn)pendingSpawns.previous()) { // L: 7508 7509 7511
						if (var50.x >= class283.field3165 && var50.x < class283.field3165 + 8 && var50.y >= class149.field1677 && var50.y < class149.field1677 + 8 && var50.plane == TaskHandler.Client_plane) { // L: 7510
							var50.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 7513
					return true; // L: 7514
				}

				if (ServerPacket.field3205 == var1.serverPacket) { // L: 7516
					var20 = var3.method8660(); // L: 7517
					var5 = var3.method8831(); // L: 7518
					var21 = var3.readInt(); // L: 7519
					var7 = WorldMapSection1.getWidget(var21); // L: 7520
					var7.field3582 = var20 + (var5 << 16); // L: 7521
					var1.serverPacket = null; // L: 7522
					return true; // L: 7523
				}

				class364.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1389 != null ? var1.field1389.id : -1) + "," + (var1.field1390 != null ? var1.field1390.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 7525
				class278.logOut(); // L: 7526
			} catch (IOException var48) { // L: 7528
				PendingSpawn.method2350(); // L: 7529
			} catch (Exception var49) {
				var24 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1389 != null ? var1.field1389.id : -1) + "," + (var1.field1390 != null ? var1.field1390.id : -1) + "," + var1.serverPacketLength + "," + (BuddyRankComparator.localPlayer.pathX[0] + GameEngine.baseX * 64) + "," + (BuddyRankComparator.localPlayer.pathY[0] + class178.baseY * 64) + ","; // L: 7532

				for (var21 = 0; var21 < var1.serverPacketLength && var21 < 50; ++var21) { // L: 7533
					var24 = var24 + var3.array[var21] + ",";
				}

				class364.RunException_sendStackTrace(var24, var49); // L: 7534
				class278.logOut(); // L: 7535
			}

			return true; // L: 7537
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-88"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false; // L: 8721

		int var2;
		int var5;
		while (!var1) { // L: 8722
			var1 = true; // L: 8723

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) { // L: 8724
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) { // L: 8725
					String var10 = menuTargets[var2]; // L: 8726
					menuTargets[var2] = menuTargets[var2 + 1]; // L: 8727
					menuTargets[var2 + 1] = var10; // L: 8728
					String var11 = menuActions[var2]; // L: 8729
					menuActions[var2] = menuActions[var2 + 1]; // L: 8730
					menuActions[var2 + 1] = var11; // L: 8731
					var5 = menuOpcodes[var2]; // L: 8732
					menuOpcodes[var2] = menuOpcodes[var2 + 1]; // L: 8733
					menuOpcodes[var2 + 1] = var5; // L: 8734
					var5 = menuArguments1[var2]; // L: 8735
					menuArguments1[var2] = menuArguments1[var2 + 1]; // L: 8736
					menuArguments1[var2 + 1] = var5; // L: 8737
					var5 = menuArguments2[var2]; // L: 8738
					menuArguments2[var2] = menuArguments2[var2 + 1]; // L: 8739
					menuArguments2[var2 + 1] = var5; // L: 8740
					var5 = menuIdentifiers[var2]; // L: 8741
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1]; // L: 8742
					menuIdentifiers[var2 + 1] = var5; // L: 8743
					var5 = field628[var2]; // L: 8744
					field628[var2] = field628[var2 + 1]; // L: 8745
					field628[var2 + 1] = var5; // L: 8746
					boolean var6 = menuShiftClick[var2]; // L: 8747
					menuShiftClick[var2] = menuShiftClick[var2 + 1]; // L: 8748
					menuShiftClick[var2 + 1] = var6; // L: 8749
					var1 = false; // L: 8750
				}
			}
		}

		if (clickedWidget == null) { // L: 8755
			int var12 = MouseHandler.MouseHandler_lastButton; // L: 8756
			if (isMenuOpen) { // L: 8757
				int var3;
				if (var12 != 1 && (class319.mouseCam || var12 != 4)) { // L: 8758
					var2 = MouseHandler.MouseHandler_x; // L: 8759
					var3 = MouseHandler.MouseHandler_y; // L: 8760
					if (var2 < class20.menuX - 10 || var2 > PacketWriter.menuWidth + class20.menuX + 10 || var3 < Login.menuY - 10 || var3 > class30.menuHeight + Login.menuY + 10) { // L: 8761
						isMenuOpen = false; // L: 8762
						class167.method3445(class20.menuX, Login.menuY, PacketWriter.menuWidth, class30.menuHeight); // L: 8763
					}
				}

				if (var12 == 1 || !class319.mouseCam && var12 == 4) { // L: 8766
					var2 = class20.menuX; // L: 8767
					var3 = Login.menuY; // L: 8768
					int var4 = PacketWriter.menuWidth; // L: 8769
					var5 = MouseHandler.MouseHandler_lastPressedX; // L: 8770
					int var13 = MouseHandler.MouseHandler_lastPressedY; // L: 8771
					int var7 = -1; // L: 8772

					for (int var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 8773
						int var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 8774
						if (var5 > var2 && var5 < var2 + var4 && var13 > var9 - 13 && var13 < var9 + 3) { // L: 8775
							var7 = var8;
						}
					}

					if (var7 != -1) { // L: 8777
						ScriptFrame.method1153(var7);
					}

					isMenuOpen = false; // L: 8778
					class167.method3445(class20.menuX, Login.menuY, PacketWriter.menuWidth, class30.menuHeight); // L: 8779
				}
			} else {
				var2 = menuOptionsCount - 1; // L: 8785
				if ((var12 == 1 || !class319.mouseCam && var12 == 4) && this.shouldLeftClickOpenMenu()) { // L: 8788 8789
					var12 = 2; // L: 8790
				}

				if ((var12 == 1 || !class319.mouseCam && var12 == 4) && menuOptionsCount > 0) { // L: 8793
					ScriptFrame.method1153(var2); // L: 8794
				}

				if (var12 == 2 && menuOptionsCount > 0) { // L: 8796
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	} // L: 8798

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1492880114"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1; // L: 8803
		return (field621 && menuOptionsCount > 2 || WorldMapData_0.method4790(var1)) && !menuShiftClick[var1]; // L: 8806
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1260391802"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		class383.method7318(var1, var2); // L: 8810
		var1 -= viewportOffsetX; // L: 8811
		var2 -= viewportOffsetY; // L: 8812
		class1.scene.menuOpen(TaskHandler.Client_plane, var1, var2, false); // L: 8813
		isMenuOpen = true; // L: 8814
	} // L: 8815

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-849310357"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface; // L: 10515
		int var3 = GameEngine.canvasWidth; // L: 10516
		int var4 = class143.canvasHeight; // L: 10517
		if (GrandExchangeEvent.loadInterface(var2)) { // L: 10519
			Script.resizeInterface(class155.Widget_interfaceComponents[var2], -1, var3, var4, var1); // L: 10520
		}

	} // L: 10522

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Lmy;I)V",
		garbageValue = "1931780261"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : WorldMapSection1.getWidget(var1.parentId); // L: 10525
		int var3;
		int var4;
		if (var2 == null) { // L: 10528
			var3 = GameEngine.canvasWidth; // L: 10529
			var4 = class143.canvasHeight; // L: 10530
		} else {
			var3 = var2.width; // L: 10533
			var4 = var2.height; // L: 10534
		}

		PcmPlayer.alignWidgetSize(var1, var3, var4, false); // L: 10536
		Tiles.alignWidgetPosition(var1, var3, var4); // L: 10537
	} // L: 10538

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "109"
	)
	final void method1248() {
		class69.invalidateWidget(clickedWidget); // L: 11427
		++class371.widgetDragDuration; // L: 11428
		int var1;
		int var2;
		if (field771 && field663) { // L: 11429
			var1 = MouseHandler.MouseHandler_x; // L: 11443
			var2 = MouseHandler.MouseHandler_y; // L: 11444
			var1 -= widgetClickX; // L: 11445
			var2 -= widgetClickY; // L: 11446
			if (var1 < field664) { // L: 11447
				var1 = field664;
			}

			if (var1 + clickedWidget.width > field664 + clickedWidgetParent.width) { // L: 11448
				var1 = field664 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field597) { // L: 11449
				var2 = field597;
			}

			if (var2 + clickedWidget.height > field597 + clickedWidgetParent.height) { // L: 11450
				var2 = field597 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field572; // L: 11451
			int var4 = var2 - field668; // L: 11452
			int var5 = clickedWidget.dragZoneSize; // L: 11453
			if (class371.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 11454 11455
				isDraggingWidget = true; // L: 11456
			}

			int var6 = var1 - field664 + clickedWidgetParent.scrollX; // L: 11459
			int var7 = var2 - field597 + clickedWidgetParent.scrollY; // L: 11460
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 11461
				var8 = new ScriptEvent(); // L: 11462
				var8.widget = clickedWidget; // L: 11463
				var8.mouseX = var6; // L: 11464
				var8.mouseY = var7; // L: 11465
				var8.args = clickedWidget.onDrag; // L: 11466
				class9.runScriptEvent(var8); // L: 11467
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 11469
				if (isDraggingWidget) { // L: 11470
					if (clickedWidget.onDragComplete != null) { // L: 11471
						var8 = new ScriptEvent(); // L: 11472
						var8.widget = clickedWidget; // L: 11473
						var8.mouseX = var6; // L: 11474
						var8.mouseY = var7; // L: 11475
						var8.dragTarget = draggedOnWidget; // L: 11476
						var8.args = clickedWidget.onDragComplete; // L: 11477
						class9.runScriptEvent(var8); // L: 11478
					}

					if (draggedOnWidget != null && class287.method5477(clickedWidget) != null) { // L: 11480
						PacketBufferNode var11 = UserComparator9.getPacketBufferNode(ClientPacket.field3109, packetWriter.isaacCipher); // L: 11482
						var11.packetBuffer.method8719(draggedOnWidget.id); // L: 11483
						var11.packetBuffer.method8658(clickedWidget.itemId); // L: 11484
						var11.packetBuffer.method8719(clickedWidget.id); // L: 11485
						var11.packetBuffer.method8659(draggedOnWidget.childIndex); // L: 11486
						var11.packetBuffer.method8659(draggedOnWidget.itemId); // L: 11487
						var11.packetBuffer.writeIntME(clickedWidget.childIndex); // L: 11488
						packetWriter.addNode(var11); // L: 11489
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 11493
					this.openMenu(field572 + widgetClickX, widgetClickY + field668); // L: 11494
				} else if (menuOptionsCount > 0) { // L: 11496
					int var10 = widgetClickX + field572; // L: 11497
					int var9 = widgetClickY + field668; // L: 11498
					UserComparator7.method2851(ViewportMouse.tempMenuAction, var10, var9); // L: 11500
					ViewportMouse.tempMenuAction = null; // L: 11501
				}

				clickedWidget = null; // L: 11505
			}

		} else {
			if (class371.widgetDragDuration > 1) { // L: 11430
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 11431
					var1 = widgetClickX + field572; // L: 11432
					var2 = widgetClickY + field668; // L: 11433
					UserComparator7.method2851(ViewportMouse.tempMenuAction, var1, var2); // L: 11435
					ViewportMouse.tempMenuAction = null; // L: 11436
				}

				clickedWidget = null; // L: 11439
			}

		}
	} // L: 11441 11507

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(B)Ltj;",
		garbageValue = "-45"
	)
	@Export("username")
	public Username username() {
		return BuddyRankComparator.localPlayer != null ? BuddyRankComparator.localPlayer.username : null; // L: 12178
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 730
				for (int var1 = 0; var1 <= 28; ++var1) { // L: 731
					String var2 = this.getParameter(Integer.toString(var1)); // L: 732
					if (var2 != null) { // L: 733
						switch(var1) { // L: 734
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 790
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 791
							}
							break;
						case 4:
							if (clientType == -1) { // L: 768
								clientType = Integer.parseInt(var2); // L: 769
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 811
							break; // L: 812
						case 6:
							int var4 = Integer.parseInt(var2); // L: 750
							Language var3;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) { // L: 752
								var3 = Language.Language_valuesOrdered[var4]; // L: 756
							} else {
								var3 = null; // L: 753
							}

							class69.clientLanguage = var3; // L: 758
							break; // L: 759
						case 7:
							class326.field3765 = class162.method3350(Integer.parseInt(var2)); // L: 737
							break; // L: 738
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 828
							}
							break;
						case 9:
							FontName.field4790 = var2; // L: 780
							break; // L: 781
						case 10:
							class470.field4870 = (StudioGame)SpriteMask.findEnumerated(SecureRandomFuture.method2124(), Integer.parseInt(var2)); // L: 742
							if (StudioGame.oldscape == class470.field4870) { // L: 743
								Occluder.loginType = LoginType.oldscape;
							} else {
								Occluder.loginType = LoginType.field4820; // L: 744
							}
							break;
						case 11:
							class211.field2334 = var2; // L: 763
							break; // L: 764
						case 12:
							worldId = Integer.parseInt(var2); // L: 796
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
							RouteStrategy.field2330 = Integer.parseInt(var2); // L: 801
							break; // L: 802
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 785
							break; // L: 786
						case 17:
							class199.field2088 = var2; // L: 806
							break; // L: 807
						case 21:
							field486 = Integer.parseInt(var2); // L: 775
							break; // L: 776
						case 25:
							int var5 = var2.indexOf("."); // L: 816
							if (var5 == -1) { // L: 817
								field557 = Integer.parseInt(var2); // L: 818
							} else {
								field557 = Integer.parseInt(var2.substring(0, var5)); // L: 821
								Integer.parseInt(var2.substring(var5 + 1)); // L: 822
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 836
				isLowDetail = false; // L: 837
				class188.worldHost = this.getCodeBase().getHost(); // L: 839
				String var6 = class326.field3765.name; // L: 840
				byte var7 = 0; // L: 841

				try {
					class87.method2286("oldschool", var6, var7, 22); // L: 843
				} catch (Exception var8) { // L: 845
					class364.RunException_sendStackTrace((String)null, var8); // L: 846
				}

				class392.client = this; // L: 848
				class458.clientType = clientType; // L: 849
				ObjectComposition.method3878(); // L: 850
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) { // L: 851
					this.field606 = true; // L: 852
				}

				if (field488 == -1) { // L: 854
					if (!this.method1222() && !this.method1223()) { // L: 855
						field488 = 0; // L: 859
					} else {
						field488 = 5; // L: 856
					}
				}

				this.startThread(765, 503, 212, 1); // L: 862
			}
		} catch (RuntimeException var9) {
			throw class9.newRunException(var9, "client.init(" + ')');
		}
	} // L: 863

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 879
			this.otlTokenRequester = var1; // L: 882
			class14.method173(10); // L: 883
		}
	} // L: 880 884

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 898
	}

	public long getAccountHash() {
		return this.accountHash; // L: 903
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 889
			this.field527 = var1; // L: 892
		}
	} // L: 890 893

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-89"
	)
	public static int method1780(int var0, int var1) {
		int var2;
		if (var1 > var0) { // L: 26
			var2 = var0; // L: 27
			var0 = var1; // L: 28
			var1 = var2; // L: 29
		}

		while (var1 != 0) { // L: 31
			var2 = var0 % var1; // L: 32
			var0 = var1; // L: 33
			var1 = var2; // L: 34
		}

		return var0; // L: 36
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-557966076"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 76
		if (var0 < 0 || var0 >= 65536) { // L: 77
			var0 >>>= 16; // L: 78
			var1 += 16; // L: 79
		}

		if (var0 >= 256) { // L: 81
			var0 >>>= 8; // L: 82
			var1 += 8; // L: 83
		}

		if (var0 >= 16) { // L: 85
			var0 >>>= 4; // L: 86
			var1 += 4; // L: 87
		}

		if (var0 >= 4) { // L: 89
			var0 >>>= 2; // L: 90
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1; // L: 97
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([FI)V",
		garbageValue = "-743757040"
	)
	static void method1778(float[] var0) {
		if (class123.field1459 + var0[0] < 1.3333334F) { // L: 320
			float var1 = var0[0] - 2.0F; // L: 321
			float var2 = var0[0] - 1.0F; // L: 322
			float var3 = (float)Math.sqrt((double)(var1 * var1 - var2 * var2 * 4.0F)); // L: 323
			float var4 = 0.5F * (var3 + -var1); // L: 324
			if (var0[1] + class123.field1459 > var4) { // L: 325
				var0[1] = var4 - class123.field1459; // L: 326
			} else {
				var4 = (-var1 - var3) * 0.5F; // L: 329
				if (var0[1] < var4 + class123.field1459) { // L: 330
					var0[1] = var4 + class123.field1459; // L: 331
				}
			}
		} else {
			var0[0] = 1.3333334F - class123.field1459; // L: 336
			var0[1] = 0.33333334F - class123.field1459; // L: 337
		}

	} // L: 339

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "92"
	)
	public static final void method1276(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0; // L: 91
		ViewportMouse.ViewportMouse_y = var1; // L: 92
		ViewportMouse.ViewportMouse_isInViewport = true; // L: 93
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 94
		ViewportMouse.ViewportMouse_false0 = false; // L: 95
	} // L: 96

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1744336849"
	)
	static void method1774() {
		if (IgnoreList.loadWorlds()) { // L: 2207
			Login.worldSelectOpen = true; // L: 2208
			Login.worldSelectPage = 0; // L: 2209
			Login.worldSelectPagesCount = 0; // L: 2210
		}

	} // L: 2212

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "367768395"
	)
	static int method1324(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 4423
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = IgnoreList.loadWorlds() ? 1 : 0; // L: 4424
			return 1; // L: 4425
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 4427
				var9 = FontName.worldListStart(); // L: 4428
				if (var9 != null) { // L: 4429
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 4430
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 4431
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var9.activity; // L: 4432
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 4433
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 4434
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var9.host; // L: 4435
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4438
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4439
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4440
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4441
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4442
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4443
				}

				return 1; // L: 4445
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 4447
				var9 = class467.getNextWorldListWorld(); // L: 4448
				if (var9 != null) { // L: 4449
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 4450
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 4451
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var9.activity; // L: 4452
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 4453
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 4454
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var9.host; // L: 4455
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4458
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4459
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4460
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4461
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4462
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4463
				}

				return 1; // L: 4465
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 4467
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4468
					var7 = null; // L: 4469

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 4470
						if (var3 == class260.World_worlds[var8].id) { // L: 4471
							var7 = class260.World_worlds[var8]; // L: 4472
							break;
						}
					}

					if (var7 != null) { // L: 4476
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 4477
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 4478
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var7.activity; // L: 4479
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 4480
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 4481
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var7.host; // L: 4482
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4485
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4486
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4487
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4488
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4489
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4490
					}

					return 1; // L: 4492
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 4494
					Interpreter.Interpreter_intStackSize -= 4; // L: 4495
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4496
					boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4497
					var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4498
					boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1; // L: 4499
					UrlRequest.sortWorldList(var3, var10, var8, var6); // L: 4500
					return 1; // L: 4501
				} else if (var0 != 6511) { // L: 4503
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4524
						followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4525
						return 1; // L: 4526
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4528
							Interpreter.Interpreter_intStackSize -= 2; // L: 4529
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4530
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4531
							var5 = class153.getParamDefinition(var4); // L: 4532
							if (var5.isString()) { // L: 4533
								Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = class188.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4534
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class188.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4537
							}

							return 1; // L: 4539
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4541
							Interpreter.Interpreter_intStackSize -= 2; // L: 4542
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4543
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4544
							var5 = class153.getParamDefinition(var4); // L: 4545
							if (var5.isString()) { // L: 4546
								Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = DecorativeObject.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4547
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = DecorativeObject.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4550
							}

							return 1; // L: 4552
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4554
							Interpreter.Interpreter_intStackSize -= 2; // L: 4555
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4556
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4557
							var5 = class153.getParamDefinition(var4); // L: 4558
							if (var5.isString()) { // L: 4559
								Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ParamComposition.ItemComposition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4560
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ParamComposition.ItemComposition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4563
							}

							return 1; // L: 4565
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4567
							Interpreter.Interpreter_intStackSize -= 2; // L: 4568
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4569
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4570
							var5 = class153.getParamDefinition(var4); // L: 4571
							if (var5.isString()) { // L: 4572
								Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = class269.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4573
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class269.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4576
							}

							return 1; // L: 4578
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4580
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = onMobile ? 1 : 0; // L: 4581
							return 1; // L: 4582
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4584
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = clientType; // L: 4585
							return 1; // L: 4586
						} else if (var0 == 6520) { // L: 4588
							return 1; // L: 4589
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4591
							return 1; // L: 4592
						} else if (var0 == 6522) { // L: 4594
							--HealthBar.Interpreter_stringStackSize; // L: 4595
							--Interpreter.Interpreter_intStackSize; // L: 4596
							return 1; // L: 4597
						} else if (var0 == 6523) { // L: 4599
							--HealthBar.Interpreter_stringStackSize; // L: 4600
							--Interpreter.Interpreter_intStackSize; // L: 4601
							return 1; // L: 4602
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4604
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4605
							return 1; // L: 4606
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4608
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 4609
							return 1; // L: 4610
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4612
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 4613
							return 1; // L: 4614
						} else if (var0 == 6527) { // L: 4616
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = field488; // L: 4617
							return 1; // L: 4618
						} else {
							return 2; // L: 4620
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4504
					if (var3 >= 0 && var3 < World.World_count) { // L: 4505
						var7 = class260.World_worlds[var3]; // L: 4506
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 4507
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 4508
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var7.activity; // L: 4509
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 4510
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 4511
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var7.host; // L: 4512
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4515
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4516
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4517
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4518
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4519
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4520
					}

					return 1; // L: 4522
				}
			}
		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Lmy;I)V",
		garbageValue = "775964682"
	)
	static final void method1272(Widget var0) {
		if (var0.buttonType == 1) { // L: 10759
			class123.method2924(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId); // L: 10760
		}

		String var1;
		if (var0.buttonType == 2 && !isSpellSelected) { // L: 10763
			var1 = Archive.Widget_getSpellActionName(var0); // L: 10764
			if (var1 != null) { // L: 10765
				class123.method2924(var1, Canvas.colorStartTag(65280) + var0.field3653, 25, 0, -1, var0.id, var0.itemId); // L: 10766
			}
		}

		if (var0.buttonType == 3) { // L: 10770
			class110.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 10771
		}

		if (var0.buttonType == 4) { // L: 10774
			class110.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id); // L: 10775
		}

		if (var0.buttonType == 5) { // L: 10778
			class110.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id); // L: 10779
		}

		if (var0.buttonType == 6 && meslayerContinueWidget == null) { // L: 10782
			class110.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id); // L: 10783
		}

		if (var0.isIf3) { // L: 10786
			if (isSpellSelected) { // L: 10787
				if (Clock.method3534(ParamComposition.getWidgetFlags(var0)) && (class90.selectedSpellFlags & 32) == 32) { // L: 10788
					class123.method2924(field711, field645 + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId); // L: 10789
				}
			} else {
				for (int var4 = 9; var4 >= 5; --var4) { // L: 10794
					String var6 = WorldMapScaleHandler.method5373(var0, var4); // L: 10795
					if (var6 != null) { // L: 10796
						class123.method2924(var6, var0.dataText, 1007, var4 + 1, var0.childIndex, var0.id, var0.itemId); // L: 10797
					}
				}

				var1 = Archive.Widget_getSpellActionName(var0); // L: 10801
				if (var1 != null) { // L: 10802
					class123.method2924(var1, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId); // L: 10803
				}

				for (int var2 = 4; var2 >= 0; --var2) { // L: 10806
					String var5 = WorldMapScaleHandler.method5373(var0, var2); // L: 10807
					if (var5 != null) { // L: 10808
						class351.method6635(var5, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry); // L: 10809
					}
				}

				int var3 = ParamComposition.getWidgetFlags(var0); // L: 10814
				boolean var7 = (var3 & 1) != 0; // L: 10816
				if (var7) { // L: 10818
					class110.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 10819
				}
			}
		}

	} // L: 10824

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-665812054"
	)
	static void method1777() {
		for (int var0 = 0; var0 < field745.size(); ++var0) { // L: 12338
			int var2 = (Integer)field745.get(var0); // L: 12340
			class134 var4 = (class134)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var2); // L: 12344
			class134 var3;
			if (var4 != null) { // L: 12345
				var3 = var4; // L: 12346
			} else {
				AbstractArchive var6 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 12350
				AbstractArchive var7 = SequenceDefinition.SequenceDefinition_skeletonsArchive; // L: 12351
				boolean var8 = true; // L: 12353
				byte[] var9 = var6.getFile(var2 >> 16 & 65535, var2 & 65535); // L: 12354
				class134 var5;
				if (var9 == null) { // L: 12355
					var8 = false; // L: 12356
					var5 = null; // L: 12357
				} else {
					int var10 = (var9[1] & 255) << 8 | var9[2] & 255; // L: 12360
					byte[] var11 = var7.getFile(var10, 0); // L: 12363
					if (var11 == null) { // L: 12364
						var8 = false;
					}

					if (!var8) { // L: 12365
						var5 = null; // L: 12366
					} else {
						if (UserComparator7.field1413 == null) { // L: 12369
							class134.field1573 = Runtime.getRuntime().availableProcessors(); // L: 12370
							UserComparator7.field1413 = new ThreadPoolExecutor(0, class134.field1573, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class134.field1573 * 100 + 100), new class69()); // L: 12371
						}

						try {
							var5 = new class134(var6, var7, var2, false); // L: 12379
						} catch (Exception var13) { // L: 12381
							var5 = null; // L: 12382
						}
					}
				}

				if (var5 != null) { // L: 12386
					SequenceDefinition.SequenceDefinition_cachedModel.put(var5, (long)var2);
				}

				var3 = var5; // L: 12387
			}

			int var1;
			if (var3 == null) { // L: 12390
				var1 = 2; // L: 12391
			} else {
				var1 = var3.method3044() ? 0 : 1; // L: 12394
			}

			if (var1 != 2) { // L: 12396
				field745.remove(var0); // L: 12397
				--var0; // L: 12398
			}
		}

	} // L: 12401
}
