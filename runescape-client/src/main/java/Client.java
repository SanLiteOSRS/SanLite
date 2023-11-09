import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
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
public final class Client extends GameEngine implements Usernamed, OAuthApi {
	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "[Leb;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("uh")
	@ObfuscatedGetter(
		intValue = -2007768733
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = -1310780451
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("vs")
	@ObfuscatedGetter(
		intValue = 1576656145
	)
	public static int field796;
	@ObfuscatedName("tu")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("wv")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	static final ApproximateRouteStrategy field544;
	@ObfuscatedName("sx")
	@ObfuscatedGetter(
		intValue = -913304205
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = -1656979995
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tc")
	@ObfuscatedGetter(
		intValue = -309516689
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("tl")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("tg")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("ws")
	static int[] field802;
	@ObfuscatedName("tj")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("wx")
	static int[] field785;
	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "[Lac;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("tz")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("ts")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("ul")
	static boolean field767;
	@ObfuscatedName("vu")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wd")
	@ObfuscatedGetter(
		intValue = -245177751
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("va")
	@ObfuscatedGetter(
		intValue = -354385425
	)
	static int field787;
	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("uf")
	static boolean[] field569;
	@ObfuscatedName("vw")
	@ObfuscatedGetter(
		intValue = 1995992149
	)
	static int field788;
	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("tm")
	@ObfuscatedGetter(
		intValue = 1487362307
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("vo")
	@ObfuscatedSignature(
		descriptor = "[Lmi;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = 1300699193
	)
	static int field749;
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "[Lfm;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("vd")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive5")
	static class391 archive5;
	@ObfuscatedName("us")
	static short field773;
	@ObfuscatedName("uv")
	static short field774;
	@ObfuscatedName("ut")
	static short field779;
	@ObfuscatedName("uj")
	static short field780;
	@ObfuscatedName("ua")
	static short field778;
	@ObfuscatedName("um")
	@ObfuscatedGetter(
		intValue = -1592045029
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("uw")
	static short field763;
	@ObfuscatedName("ug")
	@ObfuscatedGetter(
		intValue = -1052970327
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = 1037820387
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("uk")
	@ObfuscatedGetter(
		intValue = -1817754101
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("sc")
	@ObfuscatedGetter(
		intValue = -1092997549
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("sb")
	static int[] field607;
	@ObfuscatedName("sn")
	static int[] field591;
	@ObfuscatedName("su")
	@ObfuscatedSignature(
		descriptor = "[Lrs;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("wy")
	@ObfuscatedGetter(
		intValue = 1093744453
	)
	static int field800;
	@ObfuscatedName("ud")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("up")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("uz")
	static int[] field525;
	@ObfuscatedName("uc")
	static int[] field769;
	@ObfuscatedName("ub")
	static int[] field771;
	@ObfuscatedName("ue")
	static int[] field772;
	@ObfuscatedName("vk")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("ve")
	@ObfuscatedGetter(
		intValue = -386377411
	)
	static int field777;
	@ObfuscatedName("vb")
	static List field797;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lgv;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("bj")
	static boolean field534;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 986258055
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1447111149
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1449876163
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bl")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bq")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -459350759
	)
	static int field501;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 324376373
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1706614599
	)
	static int field503;
	@ObfuscatedName("bk")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 118366835
	)
	public static int field505;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1478828793
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dz")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -2058959797
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		longValue = 7466561445147549075L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -1933487065
	)
	static int field563;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 2050458131
	)
	static int field513;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		longValue = -8229270082617636071L
	)
	static long field685;
	@ObfuscatedName("df")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -1039033513
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 1437214935
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -935624133
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 2053177439
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1639532511
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 657459307
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1163477500
	)
	static int field522;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1932736064
	)
	static int field762;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1335659968
	)
	static int field703;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -1549890999
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 2027584875
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 1390906507
	)
	static int field529;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = -1374145211
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = 1173391779
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("fd")
	@ObfuscatedGetter(
		intValue = -635052675
	)
	static int field532;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = 53230041
	)
	static int field533;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = -1991936121
	)
	static int field646;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	static class135 field535;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	static class478 field536;
	@ObfuscatedName("gd")
	static final String field546;
	@ObfuscatedName("gg")
	static String field805;
	@ObfuscatedName("ge")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("hf")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "[Lcf;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = 1949198273
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("hy")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("hr")
	@ObfuscatedGetter(
		intValue = -148759513
	)
	static int field557;
	@ObfuscatedName("hk")
	static int[] field558;
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("hb")
	@ObfuscatedGetter(
		intValue = 464035559
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("hw")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("hc")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = -1421375125
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 887372899
	)
	static int field565;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = 942775227
	)
	static int field566;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = -541624079
	)
	static int field567;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = -1736609889
	)
	static int field568;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = -724139947
	)
	static int field744;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("ik")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("iy")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("il")
	static final int[] field573;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = -1316720395
	)
	static int field574;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = -1246854321
	)
	static int field575;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = -1127680155
	)
	static int field576;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -1168042169
	)
	static int field656;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = 938761909
	)
	static int field636;
	@ObfuscatedName("jc")
	static boolean field681;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -555172739
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = -1469577095
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = -1153086063
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 651770897
	)
	static int field583;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 542177225
	)
	static int field584;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = -1265674855
	)
	static int field585;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = -801588943
	)
	static int field547;
	@ObfuscatedName("kf")
	@ObfuscatedGetter(
		intValue = -1391828463
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = -286791049
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = -607018751
	)
	static int field589;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = 542125445
	)
	static int field590;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = -1062116963
	)
	static int field531;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -134546011
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = -237513411
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ke")
	@ObfuscatedGetter(
		intValue = 523373087
	)
	static int field594;
	@ObfuscatedName("ko")
	static boolean field595;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = -375417741
	)
	static int field697;
	@ObfuscatedName("kr")
	static boolean field597;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = 906965081
	)
	static int field598;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = 1986822487
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = 25500469
	)
	static int field571;
	@ObfuscatedName("ka")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("kp")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("kh")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("kz")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("kw")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("kg")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("lj")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("lh")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("lc")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 1296317463
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = -546788933
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = 1361406555
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = 118207711
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = -357153549
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = 1747207967
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = -576177311
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("lz")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -1029128259
	)
	static int field743;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = 119471555
	)
	static int field619;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = 2124097597
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 1500901181
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -110326507
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = 1863353709
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("lx")
	static boolean field624;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = -1016079739
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = -828403509
	)
	static int field626;
	@ObfuscatedName("ln")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "[Lcl;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -1049273929
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = -1817229421
	)
	static int field630;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		longValue = -3786105234876673669L
	)
	static long field631;
	@ObfuscatedName("mv")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = 732439465
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = -6020277
	)
	static int field634;
	@ObfuscatedName("mn")
	static int[] field635;
	@ObfuscatedName("ms")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("my")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("mo")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("mf")
	static int[] field623;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -2109267551
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "[[[Lmo;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("mh")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("mr")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nc")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("ni")
	static boolean field648;
	@ObfuscatedName("ne")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = 2120822081
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("nu")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("nq")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("nw")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("nm")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("nn")
	static int[] field655;
	@ObfuscatedName("na")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("no")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("ny")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("ns")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("nt")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("nj")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("nz")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = -1903721245
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = -846725849
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = -1594871497
	)
	static int field665;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = 199173531
	)
	static int field666;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = -72118161
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("oe")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = 85136151
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = -508590269
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("ow")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("ou")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = -1718458183
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = 1180321257
	)
	static int field798;
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = -190615213
	)
	static int field677;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = 304971839
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = 2141618577
	)
	static int field679;
	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = -1382263095
	)
	static int field496;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 123109427
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = -404548639
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = -1168259937
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pb")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = 917283277
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = -688456321
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pj")
	static boolean field692;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -183486423
	)
	static int field795;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 1075829493
	)
	static int field803;
	@ObfuscatedName("pf")
	static boolean field695;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = -117107249
	)
	static int field735;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = 509907309
	)
	static int field554;
	@ObfuscatedName("pt")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = 622694841
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pg")
	static int[] field700;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = -2069158649
	)
	static int field504;
	@ObfuscatedName("pc")
	static int[] field661;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = 1232857917
	)
	static int field524;
	@ObfuscatedName("qm")
	static int[] field704;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = -1953987119
	)
	static int field705;
	@ObfuscatedName("qf")
	static int[] field706;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = -2130298563
	)
	static int field698;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = -455061253
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = -2026923785
	)
	static int field709;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -1014085359
	)
	static int field637;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = -325839815
	)
	static int field694;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = -85968625
	)
	static int field693;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = -217901753
	)
	static int field713;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = -81166965
	)
	static int field804;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = 752041097
	)
	static int field761;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = 273082057
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "Lrj;"
	)
	static class491 field717;
	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	static NodeDeque field768;
	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	static NodeDeque field720;
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	static NodeDeque field721;
	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = 1758146877
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = -1609338923
	)
	static int field724;
	@ObfuscatedName("rr")
	static boolean[] field725;
	@ObfuscatedName("rf")
	static boolean[] field678;
	@ObfuscatedName("rl")
	static boolean[] field560;
	@ObfuscatedName("ru")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("rd")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("rx")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("ri")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("rb")
	@ObfuscatedGetter(
		intValue = 277858403
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		longValue = -8964237554665563941L
	)
	static long field733;
	@ObfuscatedName("ro")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("re")
	static int[] field758;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = -434515103
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = 1030846147
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("rw")
	static String field738;
	@ObfuscatedName("rj")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("ra")
	@ObfuscatedGetter(
		intValue = 1805212403
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	public static class205 field702;
	@ObfuscatedName("sp")
	@ObfuscatedSignature(
		descriptor = "Lgm;"
	)
	static class203 field752;
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = 836261777
	)
	static int field759;
	@ObfuscatedName("sd")
	static int[] field753;
	@ObfuscatedName("st")
	static int[] field745;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		longValue = 2579936191070244689L
	)
	static long field746;
	@ObfuscatedName("gk")
	String field523;
	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	class14 field538;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	class18 field680;
	@ObfuscatedName("gi")
	@Export("otlTokenRequester")
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("gx")
	Future field541;
	@ObfuscatedName("gq")
	boolean field542;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	class18 field543;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field613;
	@ObfuscatedName("go")
	@Export("otlTokenRequest")
	Future otlTokenRequest;
	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	Buffer field550;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	class7 field551;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		longValue = -674525235776955765L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field534 = true; // L: 156
		worldId = 1; // L: 157
		worldProperties = 0; // L: 158
		gameBuild = 0; // L: 160
		isMembersWorld = false; // L: 163
		isLowDetail = false; // L: 164
		field501 = -1; // L: 169
		clientType = -1; // L: 170
		field503 = -1; // L: 171
		onMobile = false; // L: 172
		field505 = 211; // L: 173
		gameState = 0; // L: 185
		isLoading = true; // L: 209
		cycle = 0; // L: 210
		mouseLastLastPressedTimeMillis = -1L; // L: 211
		field563 = -1; // L: 213
		field513 = -1; // L: 214
		field685 = -1L; // L: 215
		hadFocus = true; // L: 216
		rebootTimer = 0; // L: 217
		hintArrowType = 0; // L: 218
		hintArrowNpcIndex = 0; // L: 219
		hintArrowPlayerIndex = 0; // L: 220
		hintArrowX = 0; // L: 221
		hintArrowY = 0; // L: 222
		field522 = 0; // L: 223
		field762 = 0; // L: 224
		field703 = 0; // L: 225
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 227
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 228
		titleLoadingStage = 0; // L: 239
		js5ConnectState = 0; // L: 242
		field529 = 0; // L: 243
		js5Errors = 0; // L: 266
		loginState = 0; // L: 268
		field532 = 0; // L: 269
		field533 = 0; // L: 270
		field646 = 0; // L: 271
		field535 = class135.field1624; // L: 272
		field536 = class478.field4996; // L: 273
		byte[] var1 = NetCache.method6642("com_jagex_auth_desktop_osrs:public"); // L: 299
		int var3 = var1.length; // L: 302
		StringBuilder var4 = new StringBuilder(); // L: 304

		for (int var5 = 0; var5 < var3 + 0; var5 += 3) { // L: 305
			int var6 = var1[var5] & 255; // L: 306
			var4.append(class363.field4363[var6 >>> 2]); // L: 307
			if (var5 < var3 - 1) { // L: 308
				int var7 = var1[var5 + 1] & 255; // L: 309
				var4.append(class363.field4363[(var6 & 3) << 4 | var7 >>> 4]); // L: 310
				if (var5 < var3 - 2) { // L: 311
					int var8 = var1[var5 + 2] & 255; // L: 312
					var4.append(class363.field4363[(var7 & 15) << 2 | var8 >>> 6]).append(class363.field4363[var8 & 63]); // L: 313
				} else {
					var4.append(class363.field4363[(var7 & 15) << 2]).append("="); // L: 315
				}
			} else {
				var4.append(class363.field4363[(var6 & 3) << 4]).append("=="); // L: 317
			}
		}

		String var2 = var4.toString(); // L: 319
		field546 = var2; // L: 323
		Login_isUsernameRemembered = false; // L: 336
		secureRandomFuture = new SecureRandomFuture(); // L: 337
		randomDatData = null; // L: 343
		npcs = new NPC[65536]; // L: 347
		npcCount = 0; // L: 348
		npcIndices = new int[65536]; // L: 349
		field557 = 0; // L: 350
		field558 = new int[250]; // L: 351
		packetWriter = new PacketWriter(); // L: 354
		logoutTimer = 0; // L: 356
		hadNetworkError = false; // L: 357
		timer = new Timer(); // L: 358
		fontsMap = new HashMap(); // L: 364
		field565 = 0; // L: 371
		field566 = 1; // L: 372
		field567 = 0; // L: 373
		field568 = 1; // L: 374
		field744 = 0; // L: 375
		collisionMaps = new CollisionMap[4]; // L: 383
		isInInstance = false; // L: 384
		instanceChunkTemplates = new int[4][13][13]; // L: 385
		field573 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 386
		field574 = 0; // L: 389
		field575 = 2301979; // L: 401
		field576 = 5063219; // L: 402
		field656 = 3353893; // L: 403
		field636 = 7759444; // L: 404
		field681 = false; // L: 405
		alternativeScrollbarWidth = 0; // L: 406
		camAngleX = 128; // L: 414
		camAngleY = 0; // L: 415
		field583 = 0; // L: 416
		field584 = 0; // L: 417
		field585 = 0; // L: 418
		field547 = 0; // L: 419
		oculusOrbState = 0; // L: 420
		camFollowHeight = 50; // L: 421
		field589 = 0; // L: 425
		field590 = 0; // L: 426
		field531 = 0; // L: 427
		oculusOrbNormalSpeed = 12; // L: 429
		oculusOrbSlowedSpeed = 6; // L: 430
		field594 = 0; // L: 431
		field595 = false; // L: 432
		field697 = 0; // L: 433
		field597 = false; // L: 434
		field598 = 0; // L: 435
		overheadTextCount = 0; // L: 436
		field571 = 50; // L: 437
		overheadTextXs = new int[field571]; // L: 438
		overheadTextYs = new int[field571]; // L: 439
		overheadTextAscents = new int[field571]; // L: 440
		overheadTextXOffsets = new int[field571]; // L: 441
		overheadTextColors = new int[field571]; // L: 442
		overheadTextEffects = new int[field571]; // L: 443
		overheadTextCyclesRemaining = new int[field571]; // L: 444
		overheadText = new String[field571]; // L: 445
		tileLastDrawnActor = new int[104][104]; // L: 446
		viewportDrawCount = 0; // L: 447
		viewportTempX = -1; // L: 448
		viewportTempY = -1; // L: 449
		mouseCrossX = 0; // L: 450
		mouseCrossY = 0; // L: 451
		mouseCrossState = 0; // L: 452
		mouseCrossColor = 0; // L: 453
		showMouseCross = true; // L: 454
		field743 = 0; // L: 456
		field619 = 0; // L: 457
		dragItemSlotSource = 0; // L: 460
		draggedWidgetX = 0; // L: 461
		draggedWidgetY = 0; // L: 462
		dragItemSlotDestination = 0; // L: 463
		field624 = false; // L: 464
		itemDragDuration = 0; // L: 465
		field626 = 0; // L: 466
		showLoadingMessages = true; // L: 468
		players = new Player[2048]; // L: 470
		localPlayerIndex = -1; // L: 472
		field630 = 0; // L: 473
		field631 = -1L; // L: 474
		renderSelf = true; // L: 476
		drawPlayerNames = 0; // L: 481
		field634 = 0; // L: 482
		field635 = new int[1000]; // L: 483
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 485
		playerMenuActions = new String[8]; // L: 486
		playerOptionsPriorities = new boolean[8]; // L: 487
		field623 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 488
		combatTargetPlayerIndex = -1; // L: 489
		groundItems = new NodeDeque[4][104][104]; // L: 490
		pendingSpawns = new NodeDeque(); // L: 491
		projectiles = new NodeDeque(); // L: 492
		graphicsObjects = new NodeDeque(); // L: 493
		currentLevels = new int[25]; // L: 494
		levels = new int[25]; // L: 495
		experience = new int[25]; // L: 496
		field648 = false; // L: 497
		isMenuOpen = false; // L: 498
		menuOptionsCount = 0; // L: 504
		menuArguments1 = new int[500]; // L: 505
		menuArguments2 = new int[500]; // L: 506
		menuOpcodes = new int[500]; // L: 507
		menuIdentifiers = new int[500]; // L: 508
		field655 = new int[500]; // L: 509
		menuActions = new String[500]; // L: 510
		menuTargets = new String[500]; // L: 511
		menuShiftClick = new boolean[500]; // L: 512
		followerOpsLowPriority = false; // L: 513
		shiftClickDrop = false; // L: 515
		tapToDrop = false; // L: 516
		showMouseOverText = true; // L: 517
		viewportX = -1; // L: 518
		viewportY = -1; // L: 519
		field665 = 0; // L: 523
		field666 = 50; // L: 524
		isItemSelected = 0; // L: 525
		selectedItemName = null; // L: 529
		isSpellSelected = false; // L: 530
		selectedSpellChildIndex = -1; // L: 532
		selectedSpellItemId = -1; // L: 533
		selectedSpellActionName = null; // L: 535
		selectedSpellName = null; // L: 536
		rootInterface = -1; // L: 537
		interfaceParents = new NodeHashTable(8); // L: 538
		field798 = 0; // L: 543
		field677 = -1; // L: 544
		chatEffects = 0; // L: 545
		field679 = 0; // L: 546
		meslayerContinueWidget = null; // L: 547
		field496 = 0; // L: 548
		weight = 0; // L: 549
		staffModLevel = 0; // L: 550
		followerIndex = -1; // L: 551
		playerMod = false; // L: 552
		viewportWidget = null; // L: 553
		clickedWidget = null; // L: 554
		clickedWidgetParent = null; // L: 555
		widgetClickX = 0; // L: 556
		widgetClickY = 0; // L: 557
		draggedOnWidget = null; // L: 558
		field692 = false; // L: 559
		field795 = -1; // L: 560
		field803 = -1; // L: 561
		field695 = false; // L: 562
		field735 = -1; // L: 563
		field554 = -1; // L: 564
		isDraggingWidget = false; // L: 565
		cycleCntr = 1; // L: 570
		field700 = new int[32]; // L: 573
		field504 = 0; // L: 574
		field661 = new int[32]; // L: 575
		field524 = 0; // L: 576
		field704 = new int[32]; // L: 577
		field705 = 0; // L: 578
		field706 = new int[32]; // L: 579
		field698 = 0; // L: 580
		chatCycle = 0; // L: 581
		field709 = 0; // L: 582
		field637 = 0; // L: 583
		field694 = 0; // L: 584
		field693 = 0; // L: 585
		field713 = 0; // L: 586
		field804 = 0; // L: 587
		field761 = 0; // L: 588
		mouseWheelRotation = 0; // L: 594
		field717 = new class491(); // L: 595
		scriptEvents = new NodeDeque(); // L: 596
		field768 = new NodeDeque(); // L: 597
		field720 = new NodeDeque(); // L: 598
		field721 = new NodeDeque(); // L: 599
		widgetFlags = new NodeHashTable(512); // L: 600
		rootWidgetCount = 0; // L: 602
		field724 = -2; // L: 603
		field725 = new boolean[100]; // L: 604
		field678 = new boolean[100]; // L: 605
		field560 = new boolean[100]; // L: 606
		rootWidgetXs = new int[100]; // L: 607
		rootWidgetYs = new int[100]; // L: 608
		rootWidgetWidths = new int[100]; // L: 609
		rootWidgetHeights = new int[100]; // L: 610
		gameDrawingMode = 0; // L: 611
		field733 = 0L; // L: 612
		isResizable = true; // L: 613
		field758 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 620
		publicChatMode = 0; // L: 621
		tradeChatMode = 0; // L: 623
		field738 = ""; // L: 624
		crossWorldMessageIds = new long[100]; // L: 626
		crossWorldMessageIdsIndex = 0; // L: 627
		field702 = new class205(); // L: 628
		field752 = new class203(); // L: 629
		field759 = 0; // L: 631
		field753 = new int[128]; // L: 632
		field745 = new int[128]; // L: 633
		field746 = -1L; // L: 634
		currentClanSettings = new ClanSettings[4]; // L: 638
		currentClanChannels = new ClanChannel[4]; // L: 640
		field749 = -1; // L: 642
		mapIconCount = 0; // L: 643
		field607 = new int[1000]; // L: 644
		field591 = new int[1000]; // L: 645
		mapIcons = new SpritePixels[1000]; // L: 646
		destinationX = 0; // L: 647
		destinationY = 0; // L: 648
		minimapState = 0; // L: 655
		currentTrackGroupId = -1; // L: 656
		playingJingle = false; // L: 657
		soundEffectCount = 0; // L: 663
		soundEffectIds = new int[50]; // L: 664
		queuedSoundEffectLoops = new int[50]; // L: 665
		queuedSoundEffectDelays = new int[50]; // L: 666
		soundLocations = new int[50]; // L: 667
		soundEffects = new SoundEffect[50]; // L: 668
		isCameraLocked = false; // L: 670
		field767 = false; // L: 681
		field569 = new boolean[5]; // L: 689
		field769 = new int[5]; // L: 690
		field525 = new int[5]; // L: 691
		field771 = new int[5]; // L: 692
		field772 = new int[5]; // L: 693
		field773 = 256; // L: 694
		field774 = 205; // L: 695
		zoomHeight = 256; // L: 696
		zoomWidth = 320; // L: 697
		field763 = 1; // L: 698
		field778 = 32767; // L: 699
		field779 = 1; // L: 700
		field780 = 32767; // L: 701
		viewportOffsetX = 0; // L: 702
		viewportOffsetY = 0; // L: 703
		viewportWidth = 0; // L: 704
		viewportHeight = 0; // L: 705
		viewportZoom = 0; // L: 706
		playerAppearance = new PlayerComposition(); // L: 708
		field787 = -1; // L: 709
		field788 = -1; // L: 710
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 712
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 714
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 717
		archive5 = new class391(8, class389.field4516); // L: 719
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 720
		Widget_cachedFonts = new EvictingDualNodeHashTable(64); // L: 721
		field777 = -1; // L: 724
		field796 = -1; // L: 730
		field797 = new ArrayList(); // L: 731
		archiveLoaders = new ArrayList(10); // L: 732
		archiveLoadersDone = 0; // L: 733
		field800 = 0; // L: 734
		field544 = new ApproximateRouteStrategy(); // L: 743
		field802 = new int[50]; // L: 744
		field785 = new int[50]; // L: 745
	}

	public Client() {
		this.field542 = false; // L: 291
		this.accountHash = -1L;
	} // L: 342

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1977939270"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field733 = class153.method3317() + 500L; // L: 4656
		this.resizeJS(); // L: 4657
		if (rootInterface != -1) { // L: 4658
			this.resizeRoot(true);
		}

	} // L: 4659

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1082760075"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000}; // L: 1249
		int[] var2 = new int[]{1000, 100, 500}; // L: 1250
		if (var1 != null && var2 != null) { // L: 1252
			class172.ByteArrayPool_alternativeSizes = var1; // L: 1259
			class132.ByteArrayPool_altSizeArrayCounts = new int[var1.length]; // L: 1260
			class9.ByteArrayPool_arrays = new byte[var1.length][][]; // L: 1261

			for (int var3 = 0; var3 < class172.ByteArrayPool_alternativeSizes.length; ++var3) { // L: 1262
				class9.ByteArrayPool_arrays[var3] = new byte[var2[var3]][]; // L: 1263
				ByteArrayPool.field4443.add(var1[var3]); // L: 1264
			}

			Collections.sort(ByteArrayPool.field4443); // L: 1266
		} else {
			class172.ByteArrayPool_alternativeSizes = null; // L: 1253
			class132.ByteArrayPool_altSizeArrayCounts = null; // L: 1254
			class9.ByteArrayPool_arrays = null; // L: 1255
			class36.method694(); // L: 1256
		}

		class1.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 1268
		class10.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 1269
		Calendar.currentPort = class1.worldPort; // L: 1270
		class384.field4483 = class308.field3532; // L: 1271
		UserComparator8.field1435 = class308.field3533; // L: 1272
		ItemLayer.field2385 = class308.field3534; // L: 1273
		Varcs.field1379 = class308.field3535; // L: 1274
		class245.urlRequester = new class108(this.field542, 211); // L: 1275
		this.setUpKeyboard(); // L: 1276
		this.method506(); // L: 1277
		class326.mouseWheel = this.mouseWheel(); // L: 1278
		this.method505(field752, 0); // L: 1279
		this.method505(field702, 1); // L: 1280
		class12.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1281
		PacketWriter.clientPreferences = class138.method3150(); // L: 1282
		this.setUpClipboard(); // L: 1283
		Occluder.method4650(this, FriendsList.field4540); // L: 1284
		class160.setWindowedMode(PacketWriter.clientPreferences.method2505()); // L: 1285
		WorldMapElement.friendSystem = new FriendSystem(WorldMapCacheName.loginType); // L: 1286
		this.field538 = new class14("tokenRequest", 1, 1); // L: 1287
	} // L: 1288

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1127205702"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1292
		this.doCycleJs5(); // L: 1293
		WorldMapIcon_0.method5262(); // L: 1294

		int var1;
		try {
			if (class290.musicPlayerStatus == 1) { // L: 1297
				var1 = class290.midiPcmStream.method5615(); // L: 1298
				if (var1 > 0 && class290.midiPcmStream.isReady()) { // L: 1299
					var1 -= class203.pcmSampleLength; // L: 1300
					if (var1 < 0) { // L: 1301
						var1 = 0;
					}

					class290.midiPcmStream.setPcmStreamVolume(var1); // L: 1302
				} else {
					class290.midiPcmStream.clear(); // L: 1305
					class290.midiPcmStream.removeAll(); // L: 1306
					if (class6.musicTrackArchive != null) { // L: 1307
						class290.musicPlayerStatus = 2;
					} else {
						class290.musicPlayerStatus = 0; // L: 1308
					}

					class427.musicTrack = null; // L: 1309
					class154.soundCache = null; // L: 1310
				}
			}
		} catch (Exception var3) { // L: 1313
			var3.printStackTrace(); // L: 1314
			class290.midiPcmStream.clear(); // L: 1315
			class290.musicPlayerStatus = 0; // L: 1316
			class427.musicTrack = null; // L: 1317
			class154.soundCache = null; // L: 1318
			class6.musicTrackArchive = null; // L: 1319
		}

		HorizontalAlignment.playPcmPlayers(); // L: 1322
		field702.method4140(); // L: 1323
		this.method521(); // L: 1324
		class9.method93(); // L: 1325
		if (class326.mouseWheel != null) { // L: 1326
			var1 = class326.mouseWheel.useRotation(); // L: 1327
			mouseWheelRotation = var1; // L: 1328
		}

		if (gameState == 0) { // L: 1330
			class366.load(); // L: 1331
			class204.method4130(); // L: 1332
		} else if (gameState == 5) { // L: 1334
			PacketWriter.loginScreen(this, MenuAction.fontPlain12); // L: 1335
			class366.load(); // L: 1336
			class204.method4130(); // L: 1337
		} else if (gameState != 10 && gameState != 11) { // L: 1339
			if (gameState == 20) { // L: 1340
				PacketWriter.loginScreen(this, MenuAction.fontPlain12); // L: 1341
				this.doCycleLoggedOut(); // L: 1342
			} else if (gameState == 50) { // L: 1344
				PacketWriter.loginScreen(this, MenuAction.fontPlain12); // L: 1345
				this.doCycleLoggedOut(); // L: 1346
			} else if (gameState == 25) { // L: 1348
				class361.method6965();
			}
		} else {
			PacketWriter.loginScreen(this, MenuAction.fontPlain12);
		}

		if (gameState == 30) { // L: 1349
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) { // L: 1350
			this.doCycleLoggedOut();
		}

	} // L: 1351

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1484603297"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label170: {
			try {
				if (class290.musicPlayerStatus == 2) { // L: 1358
					if (class427.musicTrack == null) { // L: 1359
						class427.musicTrack = MusicTrack.readTrack(class6.musicTrackArchive, class20.musicTrackGroupId, class161.musicTrackFileId); // L: 1360
						if (class427.musicTrack == null) { // L: 1361
							var2 = false; // L: 1362
							break label170;
						}
					}

					if (class154.soundCache == null) { // L: 1366
						class154.soundCache = new SoundCache(class290.soundEffectsArchive, class290.musicSamplesArchive);
					}

					if (class290.midiPcmStream.loadMusicTrack(class427.musicTrack, class290.musicPatchesArchive, class154.soundCache, 22050)) { // L: 1367
						class290.midiPcmStream.clearAll(); // L: 1368
						class290.midiPcmStream.setPcmStreamVolume(class290.musicTrackVolume); // L: 1369
						class290.midiPcmStream.setMusicTrack(class427.musicTrack, class423.musicTrackBoolean); // L: 1370
						class290.musicPlayerStatus = 0; // L: 1371
						class427.musicTrack = null; // L: 1372
						class154.soundCache = null; // L: 1373
						class6.musicTrackArchive = null; // L: 1374
						var2 = true; // L: 1375
						break label170;
					}
				}
			} catch (Exception var6) { // L: 1380
				var6.printStackTrace(); // L: 1381
				class290.midiPcmStream.clear(); // L: 1382
				class290.musicPlayerStatus = 0; // L: 1383
				class427.musicTrack = null; // L: 1384
				class154.soundCache = null; // L: 1385
				class6.musicTrackArchive = null; // L: 1386
			}

			var2 = false; // L: 1388
		}

		if (var2 && playingJingle && SoundSystem.pcmPlayer0 != null) { // L: 1391 1392
			SoundSystem.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field733 != 0L && class153.method3317() > field733) { // L: 1394 1395
			class160.setWindowedMode(Message.getWindowedMode()); // L: 1396
		}

		int var4;
		if (var1) { // L: 1399
			for (var4 = 0; var4 < 100; ++var4) { // L: 1400
				field725[var4] = true;
			}
		}

		if (gameState == 0) { // L: 1402
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1403
			GrandExchangeOfferAgeComparator.drawTitle(class19.fontBold12, class276.fontPlain11, MenuAction.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1404
			if (gameState == 20) { // L: 1405
				GrandExchangeOfferAgeComparator.drawTitle(class19.fontBold12, class276.fontPlain11, MenuAction.fontPlain12);
			} else if (gameState == 50) { // L: 1406
				GrandExchangeOfferAgeComparator.drawTitle(class19.fontBold12, class276.fontPlain11, MenuAction.fontPlain12);
			} else if (gameState == 25) { // L: 1407
				if (field744 == 1) { // L: 1408
					if (field565 > field566) { // L: 1409
						field566 = field565;
					}

					var4 = (field566 * 50 - field565 * 50) / field566; // L: 1410
					class165.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1411
				} else if (field744 == 2) { // L: 1413
					if (field567 > field568) { // L: 1414
						field568 = field567;
					}

					var4 = (field568 * 50 - field567 * 50) / field568 + 50; // L: 1415
					class165.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false); // L: 1416
				} else {
					class165.drawLoadingMessage("Loading - please wait.", false); // L: 1418
				}
			} else if (gameState == 30) { // L: 1420
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1421
				class165.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1422
				class165.drawLoadingMessage("Please wait...", false);
			}
		} else {
			GrandExchangeOfferAgeComparator.drawTitle(class19.fontBold12, class276.fontPlain11, MenuAction.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1423
			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1424
				if (field678[var4]) { // L: 1425
					class25.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]); // L: 1426
					field678[var4] = false; // L: 1427
				}
			}
		} else if (gameState > 0) { // L: 1431
			class25.rasterProvider.drawFull(0, 0); // L: 1432

			for (var4 = 0; var4 < rootWidgetCount; ++var4) { // L: 1433
				field678[var4] = false;
			}
		}

	} // L: 1435

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1860938943"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class9.varcs.hasUnwrittenChanges()) { // L: 1438
			class9.varcs.write();
		}

		if (class36.mouseRecorder != null) { // L: 1439
			class36.mouseRecorder.isRunning = false;
		}

		class36.mouseRecorder = null; // L: 1440
		packetWriter.close(); // L: 1441
		if (MouseHandler.MouseHandler_instance != null) { // L: 1443
			synchronized(MouseHandler.MouseHandler_instance) { // L: 1444
				MouseHandler.MouseHandler_instance = null; // L: 1445
			} // L: 1446
		}

		class326.mouseWheel = null; // L: 1449
		if (SoundSystem.pcmPlayer0 != null) { // L: 1450
			SoundSystem.pcmPlayer0.shutdown();
		}

		if (WorldMapSectionType.pcmPlayer1 != null) { // L: 1451
			WorldMapSectionType.pcmPlayer1.shutdown();
		}

		CollisionMap.method4208(); // L: 1452
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 1454
			if (ArchiveDiskActionHandler.field4199 != 0) { // L: 1455
				ArchiveDiskActionHandler.field4199 = 1; // L: 1456

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 1458
				} catch (InterruptedException var4) { // L: 1460
				}
			}
		}

		if (class245.urlRequester != null) { // L: 1464
			class245.urlRequester.close(); // L: 1465
			class245.urlRequester = null; // L: 1466
		}

		Huffman.method6381(); // L: 1468
		this.field538.method183(); // L: 1469
	} // L: 1470

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1991813544"
	)
	protected final void vmethod1338() {
	} // L: 752

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1921365209"
	)
	boolean method1723() {
		return Frames.field2620 != null && !Frames.field2620.trim().isEmpty() && class152.field1755 != null && !class152.field1755.trim().isEmpty(); // L: 1191
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2126073648"
	)
	boolean method1217() {
		return MusicPatchNode.field3449 != null && !MusicPatchNode.field3449.trim().isEmpty() && VarcInt.field1962 != null && !VarcInt.field1962.trim().isEmpty(); // L: 1195
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "167"
	)
	@Export("isOtlTokenRequesterInitialized")
	boolean isOtlTokenRequesterInitialized() {
		return this.otlTokenRequester != null; // L: 1199
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1761087263"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 1203
		var2.put("grant_type", "refresh_token"); // L: 1204
		var2.put("scope", "gamesso.token.create"); // L: 1205
		var2.put("refresh_token", var1); // L: 1206
		URL var3 = new URL(field805 + "shield/oauth/token" + (new class430(var2)).method8060()); // L: 1207
		class387 var4 = new class387(); // L: 1208
		var4.method7442(field546); // L: 1209
		var4.method7453("Host", (new URL(field805)).getHost()); // L: 1210
		var4.method7424(class427.field4680); // L: 1211
		class9 var5 = class9.field31; // L: 1212
		RefreshAccessTokenRequester var6 = this.field613; // L: 1213
		if (var6 != null) { // L: 1214
			this.otlTokenRequest = var6.request(var5.method80(), var3, var4.method7416(), ""); // L: 1215
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field542); // L: 1218
			this.field543 = this.field538.method187(var7); // L: 1219
		}
	} // L: 1216 1220

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2143605223"
	)
	void method1564(String var1) throws IOException {
		URL var2 = new URL(field805 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 1223
		class387 var3 = new class387(); // L: 1224
		var3.method7445(var1); // L: 1225
		class9 var4 = class9.field32; // L: 1226
		OtlTokenRequester var5 = this.otlTokenRequester; // L: 1227
		if (var5 != null) { // L: 1228
			this.field541 = var5.request(var4.method80(), var2, var3.method7416(), ""); // L: 1229
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field542); // L: 1232
			this.field680 = this.field538.method187(var6); // L: 1233
		}
	} // L: 1230 1234

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-986853622"
	)
	void method1213(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(field805 + "/game-session/v1/tokens"); // L: 1237
		class10 var4 = new class10(var3, class9.field31, this.field542); // L: 1238
		var4.method100().method7445(var1); // L: 1239
		var4.method100().method7424(class427.field4680); // L: 1240
		JSONObject var5 = new JSONObject(); // L: 1241
		var5.put("accountId", var2); // L: 1242
		var4.method96(new class429(var5)); // L: 1243
		this.field680 = this.field538.method187(var4); // L: 1244
	} // L: 1245

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1902910944"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1554
			boolean var1 = class96.method2680(); // L: 1555
			if (!var1) { // L: 1556
				this.doCycleJs5Connect();
			}

		}
	} // L: 1557

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3134"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1560
			this.error("js5crc"); // L: 1561
			class246.method5251(1000); // L: 1562
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1565
				if (gameState <= 5) { // L: 1566
					this.error("js5io"); // L: 1567
					class246.method5251(1000); // L: 1568
					return; // L: 1569
				}

				field529 = 3000; // L: 1572
				NetCache.NetCache_ioExceptions = 3; // L: 1573
			}

			if (--field529 + 1 <= 0) { // L: 1576
				try {
					if (js5ConnectState == 0) { // L: 1578
						WorldMapManager.js5SocketTask = GameEngine.taskHandler.newSocketTask(NetCache.worldHost, Calendar.currentPort); // L: 1579
						++js5ConnectState; // L: 1580
					}

					if (js5ConnectState == 1) { // L: 1582
						if (WorldMapManager.js5SocketTask.status == 2) { // L: 1583
							this.js5Error(-1); // L: 1584
							return; // L: 1585
						}

						if (WorldMapManager.js5SocketTask.status == 1) { // L: 1587
							++js5ConnectState;
						}
					}

					Buffer var3;
					if (js5ConnectState == 2) { // L: 1589
						Socket var2 = (Socket)WorldMapManager.js5SocketTask.result; // L: 1591
						BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000); // L: 1593
						Decimator.js5Socket = var1; // L: 1595
						var3 = new Buffer(5); // L: 1596
						var3.writeByte(15); // L: 1597
						var3.writeInt(211); // L: 1598
						Decimator.js5Socket.write(var3.array, 0, 5); // L: 1599
						++js5ConnectState; // L: 1600
						HorizontalAlignment.field2016 = class153.method3317(); // L: 1601
					}

					if (js5ConnectState == 3) { // L: 1603
						if (Decimator.js5Socket.available() > 0) { // L: 1604
							int var5 = Decimator.js5Socket.readUnsignedByte(); // L: 1605
							if (var5 != 0) { // L: 1606
								this.js5Error(var5); // L: 1607
								return; // L: 1608
							}

							++js5ConnectState; // L: 1610
						} else if (class153.method3317() - HorizontalAlignment.field2016 > 30000L) { // L: 1613
							this.js5Error(-2); // L: 1614
							return; // L: 1615
						}
					}

					if (js5ConnectState == 4) { // L: 1619
						AbstractSocket var13 = Decimator.js5Socket; // L: 1620
						boolean var6 = gameState > 20; // L: 1621
						if (NetCache.NetCache_socket != null) { // L: 1623
							try {
								NetCache.NetCache_socket.close(); // L: 1625
							} catch (Exception var11) { // L: 1627
							}

							NetCache.NetCache_socket = null; // L: 1628
						}

						NetCache.NetCache_socket = var13; // L: 1630
						if (NetCache.NetCache_socket != null) { // L: 1632
							try {
								var3 = new Buffer(4); // L: 1634
								var3.writeByte(var6 ? 2 : 3); // L: 1635
								var3.writeMedium(0); // L: 1636
								NetCache.NetCache_socket.write(var3.array, 0, 4); // L: 1637
							} catch (IOException var10) {
								try {
									NetCache.NetCache_socket.close(); // L: 1641
								} catch (Exception var9) { // L: 1643
								}

								++NetCache.NetCache_ioExceptions; // L: 1644
								NetCache.NetCache_socket = null; // L: 1645
							}
						}

						NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1648
						WorldMapDecoration.NetCache_currentResponse = null; // L: 1649
						class14.NetCache_responseArchiveBuffer = null; // L: 1650
						NetCache.field4250 = 0; // L: 1651

						while (true) {
							NetFileRequest var14 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 1653
							if (var14 == null) { // L: 1654
								while (true) {
									var14 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 1660
									if (var14 == null) { // L: 1661
										if (NetCache.field4248 != 0) { // L: 1667
											try {
												var3 = new Buffer(4); // L: 1669
												var3.writeByte(4); // L: 1670
												var3.writeByte(NetCache.field4248); // L: 1671
												var3.writeShort(0); // L: 1672
												NetCache.NetCache_socket.write(var3.array, 0, 4); // L: 1673
											} catch (IOException var8) {
												try {
													NetCache.NetCache_socket.close(); // L: 1677
												} catch (Exception var7) { // L: 1679
												}

												++NetCache.NetCache_ioExceptions; // L: 1680
												NetCache.NetCache_socket = null; // L: 1681
											}
										}

										NetCache.NetCache_loadTime = 0; // L: 1684
										NetCache.field4252 = class153.method3317(); // L: 1685
										WorldMapManager.js5SocketTask = null; // L: 1687
										Decimator.js5Socket = null; // L: 1688
										js5ConnectState = 0; // L: 1689
										js5Errors = 0; // L: 1690
										return; // L: 1696
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var14); // L: 1662
									NetCache.NetCache_pendingWrites.put(var14, var14.key); // L: 1663
									++NetCache.NetCache_pendingWritesCount; // L: 1664
									--NetCache.NetCache_pendingResponsesCount; // L: 1665
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var14, var14.key); // L: 1655
							++NetCache.NetCache_pendingPriorityWritesCount; // L: 1656
							--NetCache.NetCache_pendingPriorityResponsesCount; // L: 1657
						}
					}
				} catch (IOException var12) { // L: 1693
					this.js5Error(-3); // L: 1694
				}

			}
		}
	} // L: 1563

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1698459928"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		WorldMapManager.js5SocketTask = null; // L: 1699
		Decimator.js5Socket = null; // L: 1700
		js5ConnectState = 0; // L: 1701
		if (Calendar.currentPort == class1.worldPort) { // L: 1702
			Calendar.currentPort = class10.js5Port;
		} else {
			Calendar.currentPort = class1.worldPort; // L: 1703
		}

		++js5Errors; // L: 1704
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1705
			if (gameState <= 5) { // L: 1706
				this.error("js5connect_full"); // L: 1707
				class246.method5251(1000); // L: 1708
			} else {
				field529 = 3000; // L: 1710
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1712
			this.error("js5connect_outofdate"); // L: 1713
			class246.method5251(1000); // L: 1714
		} else if (js5Errors >= 4) { // L: 1716
			if (gameState <= 5) { // L: 1717
				this.error("js5connect"); // L: 1718
				class246.method5251(1000); // L: 1719
			} else {
				field529 = 3000; // L: 1721
			}
		}

	} // L: 1723

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1895423785"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 2250
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 2251

		try {
			if (loginState == 0) { // L: 2253
				if (GrandExchangeOfferTotalQuantityComparator.secureRandom == null && (secureRandomFuture.isDone() || field532 > 250)) { // L: 2254
					GrandExchangeOfferTotalQuantityComparator.secureRandom = secureRandomFuture.get(); // L: 2255
					secureRandomFuture.shutdown(); // L: 2256
					secureRandomFuture = null; // L: 2257
				}

				if (GrandExchangeOfferTotalQuantityComparator.secureRandom != null) { // L: 2259
					if (var1 != null) { // L: 2260
						((AbstractSocket)var1).close(); // L: 2261
						var1 = null; // L: 2262
					}

					BufferedSource.socketTask = null; // L: 2264
					hadNetworkError = false; // L: 2265
					field532 = 0; // L: 2266
					if (field536.method8938()) { // L: 2267
						if (this.method1723()) { // L: 2268
							try {
								this.requestOtlToken(class152.field1755); // L: 2270
								ModeWhere.method6787(21); // L: 2271
							} catch (Throwable var23) { // L: 2273
								class121.RunException_sendStackTrace((String)null, var23); // L: 2274
								class33.getLoginError(65); // L: 2275
								return; // L: 2276
							}
						} else {
							if (!this.method1217()) { // L: 2279
								class33.getLoginError(65); // L: 2291
								return; // L: 2292
							}

							try {
								this.method1213(MusicPatchNode.field3449, VarcInt.field1962); // L: 2281
								ModeWhere.method6787(20); // L: 2282
							} catch (Exception var22) { // L: 2284
								class121.RunException_sendStackTrace((String)null, var22); // L: 2285
								class33.getLoginError(65); // L: 2286
								return; // L: 2287
							}
						}
					} else {
						ModeWhere.method6787(1); // L: 2296
					}
				}
			}

			class20 var25;
			if (loginState == 21) { // L: 2300
				if (this.otlTokenRequest != null) { // L: 2301
					if (!this.otlTokenRequest.isDone()) { // L: 2302
						return; // L: 2303
					}

					if (this.otlTokenRequest.isCancelled()) { // L: 2305
						class33.getLoginError(65); // L: 2306
						this.otlTokenRequest = null; // L: 2307
						return; // L: 2308
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.otlTokenRequest.get(); // L: 2311
						if (!var3.isSuccess()) { // L: 2312
							class33.getLoginError(65); // L: 2313
							this.otlTokenRequest = null; // L: 2314
							return; // L: 2315
						}

						Frames.field2620 = var3.getAccessToken(); // L: 2317
						class152.field1755 = var3.getRefreshToken(); // L: 2318
						this.otlTokenRequest = null; // L: 2319
					} catch (Exception var21) { // L: 2321
						class121.RunException_sendStackTrace((String)null, var21); // L: 2322
						class33.getLoginError(65); // L: 2323
						this.otlTokenRequest = null; // L: 2324
						return; // L: 2325
					}
				} else {
					if (this.field543 == null) { // L: 2328
						class33.getLoginError(65); // L: 2358
						return; // L: 2359
					}

					if (!this.field543.method279()) { // L: 2329
						return; // L: 2330
					}

					if (this.field543.method282()) { // L: 2332
						class121.RunException_sendStackTrace(this.field543.method277(), (Throwable)null); // L: 2333
						class33.getLoginError(65); // L: 2334
						this.field543 = null; // L: 2335
						return; // L: 2336
					}

					var25 = this.field543.method280(); // L: 2338
					if (var25.method300() != 200) { // L: 2339
						class33.getLoginError(65); // L: 2340
						this.field543 = null; // L: 2341
						return; // L: 2342
					}

					field532 = 0; // L: 2344
					class429 var4 = new class429(var25.method298()); // L: 2345

					try {
						Frames.field2620 = var4.method8045().getString("access_token"); // L: 2347
						class152.field1755 = var4.method8045().getString("refresh_token"); // L: 2348
					} catch (Exception var20) { // L: 2350
						class121.RunException_sendStackTrace("Error parsing tokens", var20); // L: 2351
						class33.getLoginError(65); // L: 2352
						this.field543 = null; // L: 2353
						return; // L: 2354
					}
				}

				this.method1564(Frames.field2620); // L: 2361
				ModeWhere.method6787(20); // L: 2362
			}

			if (loginState == 20) { // L: 2364
				if (this.field541 != null) { // L: 2365
					if (!this.field541.isDone()) { // L: 2366
						return; // L: 2367
					}

					if (this.field541.isCancelled()) { // L: 2369
						class33.getLoginError(65); // L: 2370
						this.field541 = null; // L: 2371
						return; // L: 2372
					}

					try {
						OtlTokenResponse var26 = (OtlTokenResponse)this.field541.get(); // L: 2375
						if (!var26.isSuccess()) { // L: 2376
							class33.getLoginError(65); // L: 2377
							this.field541 = null; // L: 2378
							return; // L: 2379
						}

						this.field523 = var26.getToken(); // L: 2381
						this.field541 = null; // L: 2382
					} catch (Exception var19) { // L: 2384
						class121.RunException_sendStackTrace((String)null, var19); // L: 2385
						class33.getLoginError(65); // L: 2386
						this.field541 = null; // L: 2387
						return; // L: 2388
					}
				} else {
					if (this.field680 == null) { // L: 2391
						class33.getLoginError(65); // L: 2427
						return; // L: 2428
					}

					if (!this.field680.method279()) { // L: 2392
						return; // L: 2393
					}

					if (this.field680.method282()) { // L: 2395
						class121.RunException_sendStackTrace(this.field680.method277(), (Throwable)null); // L: 2396
						class33.getLoginError(65); // L: 2397
						this.field680 = null; // L: 2398
						return; // L: 2399
					}

					var25 = this.field680.method280(); // L: 2401
					if (var25.method300() != 200) { // L: 2402
						class121.RunException_sendStackTrace("Response code: " + var25.method300() + "Response body: " + var25.method298(), (Throwable)null); // L: 2403
						class33.getLoginError(65); // L: 2404
						this.field680 = null; // L: 2405
						return; // L: 2406
					}

					List var28 = (List)var25.method297().get("Content-Type"); // L: 2408
					if (var28 != null && var28.contains(class427.field4680.method8031())) { // L: 2409
						try {
							JSONObject var5 = new JSONObject(var25.method298()); // L: 2411
							this.field523 = var5.getString("token"); // L: 2412
						} catch (JSONException var18) { // L: 2414
							class121.RunException_sendStackTrace((String)null, var18); // L: 2415
							class33.getLoginError(65); // L: 2416
							this.field680 = null; // L: 2417
							return; // L: 2418
						}
					} else {
						this.field523 = var25.method298(); // L: 2422
					}

					this.field680 = null; // L: 2424
				}

				field532 = 0; // L: 2430
				ModeWhere.method6787(1); // L: 2431
			}

			if (loginState == 1) { // L: 2433
				if (BufferedSource.socketTask == null) { // L: 2434
					BufferedSource.socketTask = GameEngine.taskHandler.newSocketTask(NetCache.worldHost, Calendar.currentPort); // L: 2435
				}

				if (BufferedSource.socketTask.status == 2) { // L: 2437
					throw new IOException();
				}

				if (BufferedSource.socketTask.status == 1) { // L: 2438
					Socket var30 = (Socket)BufferedSource.socketTask.result; // L: 2440
					BufferedNetSocket var27 = new BufferedNetSocket(var30, 40000, 5000); // L: 2442
					var1 = var27; // L: 2444
					packetWriter.setSocket(var27); // L: 2445
					BufferedSource.socketTask = null; // L: 2446
					ModeWhere.method6787(2); // L: 2447
				}
			}

			PacketBufferNode var29;
			if (loginState == 2) { // L: 2450
				packetWriter.clearBuffer(); // L: 2451
				var29 = ObjectComposition.method3922(); // L: 2452
				var29.packetBuffer.writeByte(LoginPacket.field3317.id); // L: 2453
				packetWriter.addNode(var29); // L: 2454
				packetWriter.flush(); // L: 2455
				var2.offset = 0; // L: 2456
				ModeWhere.method6787(3); // L: 2457
			}

			int var12;
			if (loginState == 3) { // L: 2459
				if (SoundSystem.pcmPlayer0 != null) { // L: 2460
					SoundSystem.pcmPlayer0.method783();
				}

				if (WorldMapSectionType.pcmPlayer1 != null) { // L: 2461
					WorldMapSectionType.pcmPlayer1.method783();
				}

				if (((AbstractSocket)var1).isAvailable(1)) { // L: 2462
					var12 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2463
					if (SoundSystem.pcmPlayer0 != null) { // L: 2464
						SoundSystem.pcmPlayer0.method783();
					}

					if (WorldMapSectionType.pcmPlayer1 != null) { // L: 2465
						WorldMapSectionType.pcmPlayer1.method783();
					}

					if (var12 != 0) { // L: 2466
						class33.getLoginError(var12); // L: 2467
						return; // L: 2468
					}

					var2.offset = 0; // L: 2470
					ModeWhere.method6787(4); // L: 2471
				}
			}

			if (loginState == 4) { // L: 2474
				if (var2.offset < 8) { // L: 2475
					var12 = ((AbstractSocket)var1).available(); // L: 2476
					if (var12 > 8 - var2.offset) { // L: 2477
						var12 = 8 - var2.offset;
					}

					if (var12 > 0) { // L: 2478
						((AbstractSocket)var1).read(var2.array, var2.offset, var12); // L: 2479
						var2.offset += var12; // L: 2480
					}
				}

				if (var2.offset == 8) { // L: 2483
					var2.offset = 0; // L: 2484
					class149.field1709 = var2.readLong(); // L: 2485
					ModeWhere.method6787(5); // L: 2486
				}
			}

			int var6;
			if (loginState == 5) { // L: 2489
				packetWriter.packetBuffer.offset = 0; // L: 2490
				packetWriter.clearBuffer(); // L: 2491
				PacketBuffer var31 = new PacketBuffer(500); // L: 2492
				int[] var32 = new int[]{GrandExchangeOfferTotalQuantityComparator.secureRandom.nextInt(), GrandExchangeOfferTotalQuantityComparator.secureRandom.nextInt(), GrandExchangeOfferTotalQuantityComparator.secureRandom.nextInt(), GrandExchangeOfferTotalQuantityComparator.secureRandom.nextInt()}; // L: 2493 2494 2495 2496 2497
				var31.offset = 0; // L: 2498
				var31.writeByte(1); // L: 2499
				var31.writeInt(var32[0]); // L: 2500
				var31.writeInt(var32[1]); // L: 2501
				var31.writeInt(var32[2]); // L: 2502
				var31.writeInt(var32[3]); // L: 2503
				var31.writeLong(class149.field1709); // L: 2504
				if (gameState == 40) { // L: 2505
					var31.writeInt(class18.field99[0]); // L: 2506
					var31.writeInt(class18.field99[1]); // L: 2507
					var31.writeInt(class18.field99[2]); // L: 2508
					var31.writeInt(class18.field99[3]); // L: 2509
				} else {
					if (gameState == 50) { // L: 2512
						var31.writeByte(class135.field1630.rsOrdinal()); // L: 2513
						var31.writeInt(MusicPatchNode2.field3356); // L: 2514
					} else {
						var31.writeByte(field535.rsOrdinal()); // L: 2517
						switch(field535.field1627) { // L: 2518
						case 0:
							var31.offset += 4; // L: 2533
						case 1:
						default:
							break;
						case 2:
							var31.writeInt(PacketWriter.clientPreferences.method2508(Login.Login_username)); // L: 2528
							break; // L: 2529
						case 3:
						case 4:
							var31.writeMedium(UserComparator4.field1429); // L: 2522
							++var31.offset; // L: 2523
						}
					}

					if (field536.method8938()) { // L: 2538
						var31.writeByte(class478.field4992.rsOrdinal()); // L: 2539
						var31.writeStringCp1252NullTerminated(this.field523); // L: 2540
					} else {
						var31.writeByte(class478.field4996.rsOrdinal()); // L: 2543
						var31.writeStringCp1252NullTerminated(Login.Login_password); // L: 2544
					}
				}

				var31.encryptRsa(class70.field899, class70.field896); // L: 2547
				class18.field99 = var32; // L: 2548
				PacketBufferNode var33 = ObjectComposition.method3922(); // L: 2549
				var33.packetBuffer.offset = 0; // L: 2550
				if (gameState == 40) { // L: 2551
					var33.packetBuffer.writeByte(LoginPacket.field3309.id); // L: 2552
				} else {
					var33.packetBuffer.writeByte(LoginPacket.field3310.id); // L: 2555
				}

				var33.packetBuffer.writeShort(0); // L: 2557
				var6 = var33.packetBuffer.offset; // L: 2558
				var33.packetBuffer.writeInt(211); // L: 2559
				var33.packetBuffer.writeInt(1); // L: 2560
				var33.packetBuffer.writeByte(clientType); // L: 2561
				var33.packetBuffer.writeByte(field503); // L: 2562
				byte var7 = 0; // L: 2563
				var33.packetBuffer.writeByte(var7); // L: 2564
				var33.packetBuffer.writeBytes(var31.array, 0, var31.offset); // L: 2565
				int var8 = var33.packetBuffer.offset; // L: 2566
				var33.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2567
				var33.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2568
				var33.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 2569
				var33.packetBuffer.writeShort(class127.canvasHeight); // L: 2570
				UserComparator3.method2941(var33.packetBuffer); // L: 2571
				var33.packetBuffer.writeStringCp1252NullTerminated(GraphicsDefaults.field4623); // L: 2572
				var33.packetBuffer.writeInt(Message.field486); // L: 2573
				Buffer var9 = new Buffer(UserComparator9.platformInfo.size()); // L: 2574
				UserComparator9.platformInfo.write(var9); // L: 2575
				var33.packetBuffer.writeBytes(var9.array, 0, var9.array.length); // L: 2576
				var33.packetBuffer.writeByte(clientType); // L: 2577
				var33.packetBuffer.writeInt(0); // L: 2578
				var33.packetBuffer.method8648(class12.archive12.hash); // L: 2579
				var33.packetBuffer.method8648(class372.archive2.hash); // L: 2580
				var33.packetBuffer.method8648(ApproximateRouteStrategy.field490.hash); // L: 2581
				var33.packetBuffer.method8846(MusicPatchNode.field3448.hash); // L: 2582
				var33.packetBuffer.method8696(NetCache.field4260.hash); // L: 2583
				var33.packetBuffer.method8846(0); // L: 2584
				var33.packetBuffer.method8846(class174.archive14.hash); // L: 2585
				var33.packetBuffer.writeInt(GameEngine.archive19.hash); // L: 2586
				var33.packetBuffer.method8696(class419.archive18.hash); // L: 2587
				var33.packetBuffer.writeInt(class27.archive20.hash); // L: 2588
				var33.packetBuffer.method8648(class13.field70.hash); // L: 2589
				var33.packetBuffer.method8846(class144.archive4.hash); // L: 2590
				var33.packetBuffer.method8696(WorldMapEvent.archive8.hash); // L: 2591
				var33.packetBuffer.writeInt(PendingSpawn.archive13.hash); // L: 2592
				var33.packetBuffer.method8696(class153.archive6.hash); // L: 2593
				var33.packetBuffer.method8696(class286.archive15.hash); // L: 2594
				var33.packetBuffer.method8648(class148.archive10.hash); // L: 2595
				var33.packetBuffer.method8648(class151.archive11.hash); // L: 2596
				var33.packetBuffer.method8846(CollisionMap.archive17.hash); // L: 2597
				var33.packetBuffer.writeInt(DynamicObject.archive9.hash); // L: 2598
				var33.packetBuffer.method8846(FriendsChatManager.archive7.hash); // L: 2599
				var33.packetBuffer.xteaEncrypt(var32, var8, var33.packetBuffer.offset); // L: 2600
				var33.packetBuffer.writeLengthShort(var33.packetBuffer.offset - var6); // L: 2601
				packetWriter.addNode(var33); // L: 2602
				packetWriter.flush(); // L: 2603
				packetWriter.isaacCipher = new IsaacCipher(var32); // L: 2604
				int[] var10 = new int[4]; // L: 2605

				for (int var11 = 0; var11 < 4; ++var11) { // L: 2606
					var10[var11] = var32[var11] + 50;
				}

				var2.newIsaacCipher(var10); // L: 2607
				ModeWhere.method6787(6); // L: 2608
			}

			int var13;
			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2610 2611
				var12 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2612
				if (var12 == 61) { // L: 2613
					var13 = ((AbstractSocket)var1).available(); // L: 2614
					class209.field2376 = var13 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2615
					ModeWhere.method6787(5); // L: 2616
				}

				if (var12 == 21 && gameState == 20) { // L: 2618
					ModeWhere.method6787(12); // L: 2619
				} else if (var12 == 2) { // L: 2621
					ModeWhere.method6787(14); // L: 2622
				} else if (var12 == 15 && gameState == 40) { // L: 2624
					packetWriter.serverPacketLength = -1; // L: 2625
					ModeWhere.method6787(19); // L: 2626
				} else if (var12 == 64) { // L: 2628
					ModeWhere.method6787(10); // L: 2629
				} else if (var12 == 23 && field533 < 1) { // L: 2631
					++field533; // L: 2632
					ModeWhere.method6787(0); // L: 2633
				} else if (var12 == 29) { // L: 2635
					ModeWhere.method6787(17); // L: 2636
				} else {
					if (var12 != 69) { // L: 2638
						class33.getLoginError(var12); // L: 2642
						return; // L: 2643
					}

					ModeWhere.method6787(7); // L: 2639
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2647 2648
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2649
				var2.offset = 0; // L: 2650
				MidiPcmStream.field3381 = var2.readUnsignedShort(); // L: 2651
				ModeWhere.method6787(8); // L: 2652
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= MidiPcmStream.field3381) { // L: 2655 2656
				var2.offset = 0; // L: 2657
				((AbstractSocket)var1).read(var2.array, var2.offset, MidiPcmStream.field3381); // L: 2658
				class6[] var34 = new class6[]{class6.field16}; // L: 2661
				class6 var35 = var34[var2.readUnsignedByte()]; // L: 2663

				try {
					class3 var36 = class70.method2090(var35); // L: 2665
					this.field551 = new class7(var2, var36); // L: 2666
					ModeWhere.method6787(9); // L: 2667
				} catch (Exception var17) { // L: 2669
					class33.getLoginError(22); // L: 2670
					return; // L: 2671
				}
			}

			if (loginState == 9 && this.field551.method54()) { // L: 2675 2676
				this.field550 = this.field551.method66(); // L: 2677
				this.field551.method55(); // L: 2678
				this.field551 = null; // L: 2679
				if (this.field550 == null) { // L: 2680
					class33.getLoginError(22); // L: 2681
					return; // L: 2682
				}

				packetWriter.clearBuffer(); // L: 2684
				var29 = ObjectComposition.method3922(); // L: 2685
				var29.packetBuffer.writeByte(LoginPacket.field3312.id); // L: 2686
				var29.packetBuffer.writeShort(this.field550.offset); // L: 2687
				var29.packetBuffer.method8877(this.field550); // L: 2688
				packetWriter.addNode(var29); // L: 2689
				packetWriter.flush(); // L: 2690
				this.field550 = null; // L: 2691
				ModeWhere.method6787(6); // L: 2692
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2695 2696
				class121.field1483 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2697
				ModeWhere.method6787(11); // L: 2698
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class121.field1483) { // L: 2701 2702
				((AbstractSocket)var1).read(var2.array, 0, class121.field1483); // L: 2703
				var2.offset = 0; // L: 2704
				ModeWhere.method6787(6); // L: 2705
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2708 2709
				field646 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2710
				ModeWhere.method6787(13); // L: 2711
			}

			if (loginState == 13) { // L: 2714
				field532 = 0; // L: 2715
				class70.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field646 / 60 + " seconds."); // L: 2716
				if (--field646 <= 0) { // L: 2717
					ModeWhere.method6787(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2720 2721
					TriBool.field4580 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2722
					ModeWhere.method6787(15); // L: 2723
				}

				boolean var43;
				if (loginState == 15 && ((AbstractSocket)var1).available() >= TriBool.field4580) { // L: 2726 2727
					boolean var44 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2728
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2729
					var2.offset = 0; // L: 2730
					var43 = false; // L: 2731
					if (var44) { // L: 2732
						var13 = var2.readByteIsaac() << 24; // L: 2733
						var13 |= var2.readByteIsaac() << 16; // L: 2734
						var13 |= var2.readByteIsaac() << 8; // L: 2735
						var13 |= var2.readByteIsaac(); // L: 2736
						PacketWriter.clientPreferences.method2589(Login.Login_username, var13); // L: 2737
					}

					if (Login_isUsernameRemembered) { // L: 2739
						PacketWriter.clientPreferences.method2500(Login.Login_username); // L: 2740
					} else {
						PacketWriter.clientPreferences.method2500((String)null); // L: 2743
					}

					SoundSystem.savePreferences(); // L: 2745
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2746
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2747
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2748
					localPlayerIndex <<= 8; // L: 2749
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2750
					field630 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2751
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2752
					var2.offset = 0; // L: 2753
					this.accountHash = var2.readLong(); // L: 2754
					if (TriBool.field4580 >= 29) { // L: 2755
						((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2756
						var2.offset = 0; // L: 2757
						field631 = var2.readLong(); // L: 2758
					}

					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2760
					var2.offset = 0; // L: 2761
					ServerPacket[] var39 = class179.ServerPacket_values(); // L: 2762
					var6 = var2.readSmartByteShortIsaac(); // L: 2763
					if (var6 < 0 || var6 >= var39.length) { // L: 2764
						throw new IOException(var6 + " " + var2.offset);
					}

					packetWriter.serverPacket = var39[var6]; // L: 2765
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2766
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2767
					var2.offset = 0; // L: 2768
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2769

					try {
						Client var14 = Decimator.client; // L: 2771
						JSObject.getWindow(var14).call("zap", (Object[])null); // L: 2774
					} catch (Throwable var16) { // L: 2777
					}

					ModeWhere.method6787(16); // L: 2778
				}

				if (loginState != 16) { // L: 2781
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2909 2910
						var2.offset = 0; // L: 2911
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2912
						var2.offset = 0; // L: 2913
						Canvas.field138 = var2.readUnsignedShort(); // L: 2914
						ModeWhere.method6787(18); // L: 2915
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= Canvas.field138) { // L: 2918 2919
						var2.offset = 0; // L: 2920
						((AbstractSocket)var1).read(var2.array, 0, Canvas.field138); // L: 2921
						var2.offset = 0; // L: 2922
						String var42 = var2.readStringCp1252NullTerminated(); // L: 2923
						String var38 = var2.readStringCp1252NullTerminated(); // L: 2924
						String var41 = var2.readStringCp1252NullTerminated(); // L: 2925
						class70.setLoginResponseString(var42, var38, var41); // L: 2926
						class246.method5251(10); // L: 2927
						if (field536.method8938()) { // L: 2928
							ReflectionCheck.method696(9); // L: 2929
						}
					}

					if (loginState == 19) { // L: 2933
						if (packetWriter.serverPacketLength == -1) { // L: 2934
							if (((AbstractSocket)var1).available() < 2) { // L: 2935
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2936
							var2.offset = 0; // L: 2937
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2938
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2940
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2941
							var2.offset = 0; // L: 2942
							var12 = packetWriter.serverPacketLength; // L: 2943
							timer.method7382(); // L: 2944
							class12.method169(); // L: 2945
							Login.updatePlayer(var2); // L: 2946
							if (var12 != var2.offset) { // L: 2947
								throw new RuntimeException(); // L: 2948
							}
						}
					} else {
						++field532; // L: 2952
						if (field532 > 2000) { // L: 2953
							if (field533 < 1) { // L: 2954
								if (Calendar.currentPort == class1.worldPort) { // L: 2955
									Calendar.currentPort = class10.js5Port;
								} else {
									Calendar.currentPort = class1.worldPort; // L: 2956
								}

								++field533; // L: 2957
								ModeWhere.method6787(0); // L: 2958
							} else {
								class33.getLoginError(-3); // L: 2961
							}
						}
					}
				} else {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2782
						var2.offset = 0; // L: 2783
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2784
						timer.method7380(); // L: 2785
						mouseLastLastPressedTimeMillis = -1L; // L: 2788
						class36.mouseRecorder.index = 0; // L: 2789
						GameEngine.hasFocus = true; // L: 2790
						hadFocus = true; // L: 2791
						field746 = -1L; // L: 2792
						class146.method3200(); // L: 2793
						packetWriter.clearBuffer(); // L: 2794
						packetWriter.packetBuffer.offset = 0; // L: 2795
						packetWriter.serverPacket = null; // L: 2796
						packetWriter.field1405 = null; // L: 2797
						packetWriter.field1401 = null; // L: 2798
						packetWriter.field1402 = null; // L: 2799
						packetWriter.serverPacketLength = 0; // L: 2800
						packetWriter.field1398 = 0; // L: 2801
						rebootTimer = 0; // L: 2802
						logoutTimer = 0; // L: 2803
						hintArrowType = 0; // L: 2804
						ScriptFrame.method1156(); // L: 2805
						MouseHandler.MouseHandler_idleCycles = 0; // L: 2807
						class140.method3164(); // L: 2809
						isItemSelected = 0; // L: 2810
						isSpellSelected = false; // L: 2811
						soundEffectCount = 0; // L: 2812
						camAngleY = 0; // L: 2813
						oculusOrbState = 0; // L: 2814
						class136.field1633 = null; // L: 2815
						minimapState = 0; // L: 2816
						field749 = -1; // L: 2817
						destinationX = 0; // L: 2818
						destinationY = 0; // L: 2819
						playerAttackOption = AttackOption.AttackOption_hidden; // L: 2820
						npcAttackOption = AttackOption.AttackOption_hidden; // L: 2821
						npcCount = 0; // L: 2822
						Players.Players_count = 0; // L: 2824

						for (var12 = 0; var12 < 2048; ++var12) { // L: 2825
							Players.field1341[var12] = null; // L: 2826
							Players.field1340[var12] = class208.field2360; // L: 2827
						}

						for (var12 = 0; var12 < 2048; ++var12) { // L: 2830
							players[var12] = null;
						}

						for (var12 = 0; var12 < 65536; ++var12) { // L: 2831
							npcs[var12] = null;
						}

						combatTargetPlayerIndex = -1; // L: 2832
						projectiles.clear(); // L: 2833
						graphicsObjects.clear(); // L: 2834

						int var15;
						for (var12 = 0; var12 < 4; ++var12) { // L: 2835
							for (var13 = 0; var13 < 104; ++var13) { // L: 2836
								for (var15 = 0; var15 < 104; ++var15) { // L: 2837
									groundItems[var12][var13][var15] = null; // L: 2838
								}
							}
						}

						pendingSpawns = new NodeDeque(); // L: 2842
						WorldMapElement.friendSystem.clear(); // L: 2843

						for (var12 = 0; var12 < VarpDefinition.field1927; ++var12) { // L: 2844
							VarpDefinition var37 = TaskHandler.VarpDefinition_get(var12); // L: 2845
							if (var37 != null) { // L: 2846
								Varps.Varps_temp[var12] = 0; // L: 2847
								Varps.Varps_main[var12] = 0; // L: 2848
							}
						}

						class9.varcs.clearTransient(); // L: 2851
						followerIndex = -1; // L: 2852
						if (rootInterface != -1) { // L: 2853
							var12 = rootInterface; // L: 2854
							if (var12 != -1 && class431.Widget_loadedInterfaces[var12]) { // L: 2856 2857
								UserComparator8.Widget_archive.clearFilesGroup(var12); // L: 2858
								if (WorldMapLabel.Widget_interfaceComponents[var12] != null) { // L: 2859
									var43 = true; // L: 2860

									for (var15 = 0; var15 < WorldMapLabel.Widget_interfaceComponents[var12].length; ++var15) { // L: 2861
										if (WorldMapLabel.Widget_interfaceComponents[var12][var15] != null) { // L: 2862
											if (WorldMapLabel.Widget_interfaceComponents[var12][var15].type != 2) { // L: 2863
												WorldMapLabel.Widget_interfaceComponents[var12][var15] = null;
											} else {
												var43 = false; // L: 2864
											}
										}
									}

									if (var43) { // L: 2867
										WorldMapLabel.Widget_interfaceComponents[var12] = null;
									}

									class431.Widget_loadedInterfaces[var12] = false; // L: 2868
								}
							}
						}

						for (InterfaceParent var40 = (InterfaceParent)interfaceParents.first(); var40 != null; var40 = (InterfaceParent)interfaceParents.next()) { // L: 2871
							class10.closeInterface(var40, true); // L: 2872
						}

						rootInterface = -1; // L: 2874
						interfaceParents = new NodeHashTable(8); // L: 2875
						meslayerContinueWidget = null; // L: 2876
						ScriptFrame.method1156(); // L: 2877
						playerAppearance.method5910((int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1); // L: 2878

						for (var12 = 0; var12 < 8; ++var12) { // L: 2879
							playerMenuActions[var12] = null; // L: 2880
							playerOptionsPriorities[var12] = false; // L: 2881
						}

						class320.method6429(); // L: 2883
						isLoading = true; // L: 2884

						for (var12 = 0; var12 < 100; ++var12) { // L: 2885
							field725[var12] = true;
						}

						var29 = Renderable.getPacketBufferNode(ClientPacket.field3126, packetWriter.isaacCipher); // L: 2888
						var29.packetBuffer.writeByte(Message.getWindowedMode()); // L: 2889
						var29.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 2890
						var29.packetBuffer.writeShort(class127.canvasHeight); // L: 2891
						packetWriter.addNode(var29); // L: 2892
						class463.friendsChatManager = null; // L: 2894
						DynamicObject.guestClanSettings = null; // L: 2895
						Arrays.fill(currentClanSettings, (Object)null); // L: 2896
						class482.guestClanChannel = null; // L: 2897
						Arrays.fill(currentClanChannels, (Object)null); // L: 2898

						for (var12 = 0; var12 < 8; ++var12) { // L: 2899
							grandExchangeOffers[var12] = new GrandExchangeOffer();
						}

						EnumComposition.grandExchangeEvents = null; // L: 2900
						Login.updatePlayer(var2); // L: 2902
						class303.field3472 = -1; // L: 2903
						class277.loadRegions(false, var2); // L: 2904
						packetWriter.serverPacket = null; // L: 2905
					}

				}
			}
		} catch (IOException var24) { // L: 2965
			if (field533 < 1) { // L: 2966
				if (class1.worldPort == Calendar.currentPort) { // L: 2967
					Calendar.currentPort = class10.js5Port;
				} else {
					Calendar.currentPort = class1.worldPort; // L: 2968
				}

				++field533; // L: 2969
				ModeWhere.method6787(0); // L: 2970
			} else {
				class33.getLoginError(-2); // L: 2973
			}
		}
	} // L: 2718 2907 2950 2959 2962 2971 2974 2976

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1825942383"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3252
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3253
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3254
			hadNetworkError = false; // L: 3255
			WorldMapManager.method5197(); // L: 3256
		} else {
			if (!isMenuOpen) { // L: 3259
				class174.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1621(packetWriter); ++var1) { // L: 3260 3261
			}

			if (gameState == 30) { // L: 3263
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 3267
					boolean var30;
					if (var2 == null) { // L: 3268
						var30 = false; // L: 3269
					} else {
						var30 = true; // L: 3272
					}

					int var3;
					PacketBufferNode var31;
					if (!var30) { // L: 3274
						PacketBufferNode var14;
						int var15;
						if (timer.field4471) { // L: 3282
							var14 = Renderable.getPacketBufferNode(ClientPacket.field3089, packetWriter.isaacCipher); // L: 3284
							var14.packetBuffer.writeByte(0); // L: 3285
							var15 = var14.packetBuffer.offset; // L: 3286
							timer.write(var14.packetBuffer); // L: 3287
							var14.packetBuffer.method8810(var14.packetBuffer.offset - var15); // L: 3288
							packetWriter.addNode(var14); // L: 3289
							timer.method7386(); // L: 3290
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
						synchronized(class36.mouseRecorder.lock) { // L: 3293
							if (!field534) { // L: 3294
								class36.mouseRecorder.index = 0; // L: 3380
							} else if (MouseHandler.MouseHandler_lastButton != 0 || class36.mouseRecorder.index >= 40) { // L: 3295
								var31 = null; // L: 3297
								var3 = 0; // L: 3298
								var4 = 0; // L: 3299
								var5 = 0; // L: 3300
								var6 = 0; // L: 3301

								for (var7 = 0; var7 < class36.mouseRecorder.index && (var31 == null || var31.packetBuffer.offset - var3 < 246); ++var7) { // L: 3302 3303
									var4 = var7; // L: 3304
									var8 = class36.mouseRecorder.ys[var7]; // L: 3305
									if (var8 < -1) { // L: 3306
										var8 = -1;
									} else if (var8 > 65534) { // L: 3307
										var8 = 65534;
									}

									var9 = class36.mouseRecorder.xs[var7]; // L: 3308
									if (var9 < -1) { // L: 3309
										var9 = -1;
									} else if (var9 > 65534) { // L: 3310
										var9 = 65534;
									}

									if (var9 != field563 || var8 != field513) { // L: 3311
										if (var31 == null) { // L: 3314
											var31 = Renderable.getPacketBufferNode(ClientPacket.field3166, packetWriter.isaacCipher); // L: 3315
											var31.packetBuffer.writeByte(0); // L: 3316
											var3 = var31.packetBuffer.offset; // L: 3317
											PacketBuffer var10000 = var31.packetBuffer; // L: 3318
											var10000.offset += 2;
											var5 = 0; // L: 3319
											var6 = 0; // L: 3320
										}

										if (-1L != field685) { // L: 3325
											var10 = var9 - field563; // L: 3326
											var11 = var8 - field513; // L: 3327
											var12 = (int)((class36.mouseRecorder.millis[var7] - field685) / 20L); // L: 3328
											var5 = (int)((long)var5 + (class36.mouseRecorder.millis[var7] - field685) % 20L); // L: 3329
										} else {
											var10 = var9; // L: 3332
											var11 = var8; // L: 3333
											var12 = Integer.MAX_VALUE; // L: 3334
										}

										field563 = var9; // L: 3336
										field513 = var8; // L: 3337
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3338
											var10 += 32; // L: 3339
											var11 += 32; // L: 3340
											var31.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3341
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3343
											var10 += 128; // L: 3344
											var11 += 128; // L: 3345
											var31.packetBuffer.writeByte(var12 + 128); // L: 3346
											var31.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3347
										} else if (var12 < 32) { // L: 3349
											var31.packetBuffer.writeByte(var12 + 192); // L: 3350
											if (var9 != -1 && var8 != -1) { // L: 3351
												var31.packetBuffer.writeInt(var9 | var8 << 16); // L: 3352
											} else {
												var31.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var31.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3355
											if (var9 != -1 && var8 != -1) { // L: 3356
												var31.packetBuffer.writeInt(var9 | var8 << 16); // L: 3357
											} else {
												var31.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6; // L: 3359
										field685 = class36.mouseRecorder.millis[var7]; // L: 3360
									}
								}

								if (var31 != null) { // L: 3362
									var31.packetBuffer.method8810(var31.packetBuffer.offset - var3); // L: 3363
									var7 = var31.packetBuffer.offset; // L: 3364
									var31.packetBuffer.offset = var3; // L: 3365
									var31.packetBuffer.writeByte(var5 / var6); // L: 3366
									var31.packetBuffer.writeByte(var5 % var6); // L: 3367
									var31.packetBuffer.offset = var7; // L: 3368
									packetWriter.addNode(var31); // L: 3369
								}

								if (var4 >= class36.mouseRecorder.index) { // L: 3371
									class36.mouseRecorder.index = 0;
								} else {
									MouseRecorder var47 = class36.mouseRecorder; // L: 3373
									var47.index -= var4;
									System.arraycopy(class36.mouseRecorder.xs, var4, class36.mouseRecorder.xs, 0, class36.mouseRecorder.index); // L: 3374
									System.arraycopy(class36.mouseRecorder.ys, var4, class36.mouseRecorder.ys, 0, class36.mouseRecorder.index); // L: 3375
									System.arraycopy(class36.mouseRecorder.millis, var4, class36.mouseRecorder.millis, 0, class36.mouseRecorder.index); // L: 3376
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !FriendsChatMember.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3382
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis; // L: 3383
							if (var16 > 32767L) { // L: 3384
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis; // L: 3385
							var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3386
							if (var3 < 0) { // L: 3387
								var3 = 0;
							} else if (var3 > class127.canvasHeight) { // L: 3388
								var3 = class127.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3389
							if (var4 < 0) { // L: 3390
								var4 = 0;
							} else if (var4 > GameEngine.canvasWidth) { // L: 3391
								var4 = GameEngine.canvasWidth;
							}

							var5 = (int)var16; // L: 3392
							var18 = Renderable.getPacketBufferNode(ClientPacket.field3064, packetWriter.isaacCipher); // L: 3393
							var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0)); // L: 3394
							var18.packetBuffer.writeShort(var4); // L: 3395
							var18.packetBuffer.writeShort(var3); // L: 3396
							packetWriter.addNode(var18); // L: 3397
						}

						if (field702.field2335 > 0) { // L: 3399
							var14 = Renderable.getPacketBufferNode(ClientPacket.field3154, packetWriter.isaacCipher); // L: 3400
							var14.packetBuffer.writeShort(0); // L: 3401
							var15 = var14.packetBuffer.offset; // L: 3402
							long var19 = class153.method3317(); // L: 3403

							for (var5 = 0; var5 < field702.field2335; ++var5) { // L: 3404
								long var21 = var19 - field746; // L: 3405
								if (var21 > 16777215L) { // L: 3406
									var21 = 16777215L;
								}

								field746 = var19; // L: 3407
								var14.packetBuffer.method8690((int)var21); // L: 3408
								var14.packetBuffer.method8674(field702.field2328[var5]); // L: 3409
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15); // L: 3411
							packetWriter.addNode(var14); // L: 3412
						}

						if (field697 > 0) { // L: 3414
							--field697;
						}

						if (field702.method4143(96) || field702.method4143(97) || field702.method4143(98) || field702.method4143(99)) { // L: 3415
							field597 = true; // L: 3416
						}

						if (field597 && field697 <= 0) { // L: 3418
							field697 = 20; // L: 3419
							field597 = false; // L: 3420
							var14 = Renderable.getPacketBufferNode(ClientPacket.field3146, packetWriter.isaacCipher); // L: 3422
							var14.packetBuffer.writeIntME(camAngleX); // L: 3423
							var14.packetBuffer.writeShort(camAngleY); // L: 3424
							packetWriter.addNode(var14); // L: 3425
						}

						if (GameEngine.hasFocus && !hadFocus) { // L: 3427
							hadFocus = true; // L: 3428
							var14 = Renderable.getPacketBufferNode(ClientPacket.field3100, packetWriter.isaacCipher); // L: 3430
							var14.packetBuffer.writeByte(1); // L: 3431
							packetWriter.addNode(var14); // L: 3432
						}

						if (!GameEngine.hasFocus && hadFocus) { // L: 3434
							hadFocus = false; // L: 3435
							var14 = Renderable.getPacketBufferNode(ClientPacket.field3100, packetWriter.isaacCipher); // L: 3437
							var14.packetBuffer.writeByte(0); // L: 3438
							packetWriter.addNode(var14); // L: 3439
						}

						if (GrandExchangeOfferUnitPriceComparator.worldMap != null) { // L: 3442
							GrandExchangeOfferUnitPriceComparator.worldMap.method8113();
						}

						class374.method7187(); // L: 3443
						if (VarbitComposition.field2116) { // L: 3445
							for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3447
								Player var32 = players[Players.Players_indices[var1]]; // L: 3448
								var32.method2359(); // L: 3449
							}

							VarbitComposition.field2116 = false; // L: 3452
						}

						if (field749 != class103.Client_plane) { // L: 3456
							field749 = class103.Client_plane; // L: 3457
							AttackOption.method2710(class103.Client_plane); // L: 3458
						}

						if (gameState != 30) { // L: 3461
							return;
						}

						for (PendingSpawn var38 = (PendingSpawn)pendingSpawns.last(); var38 != null; var38 = (PendingSpawn)pendingSpawns.previous()) { // L: 3463 3464 3507
							if (var38.hitpoints > 0) { // L: 3465
								--var38.hitpoints;
							}

							ObjectComposition var23;
							boolean var39;
							if (var38.hitpoints == 0) { // L: 3466
								if (var38.objectId >= 0) { // L: 3468
									var3 = var38.objectId; // L: 3470
									var4 = var38.field1149; // L: 3471
									var23 = class463.getObjectDefinition(var3); // L: 3473
									if (var4 == 11) { // L: 3474
										var4 = 10;
									}

									if (var4 >= 5 && var4 <= 8) { // L: 3475
										var4 = 4;
									}

									var39 = var23.method3907(var4); // L: 3476
									if (!var39) { // L: 3478
										continue;
									}
								}

								Skills.addPendingSpawnToScene(var38.plane, var38.type, var38.x, var38.y, var38.objectId, var38.field1148, var38.field1149); // L: 3480
								var38.remove(); // L: 3481
							} else {
								if (var38.delay > 0) { // L: 3485
									--var38.delay;
								}

								if (var38.delay == 0 && var38.x >= 1 && var38.y >= 1 && var38.x <= 102 && var38.y <= 102) { // L: 3486
									if (var38.field1150 >= 0) { // L: 3488
										var3 = var38.field1150; // L: 3490
										var4 = var38.field1152; // L: 3491
										var23 = class463.getObjectDefinition(var3); // L: 3493
										if (var4 == 11) { // L: 3494
											var4 = 10;
										}

										if (var4 >= 5 && var4 <= 8) { // L: 3495
											var4 = 4;
										}

										var39 = var23.method3907(var4); // L: 3496
										if (!var39) { // L: 3498
											continue;
										}
									}

									Skills.addPendingSpawnToScene(var38.plane, var38.type, var38.x, var38.y, var38.field1150, var38.field1151, var38.field1152); // L: 3500
									var38.delay = -1; // L: 3501
									if (var38.objectId == var38.field1150 && var38.objectId == -1) { // L: 3502
										var38.remove();
									} else if (var38.field1150 == var38.objectId && var38.field1151 == var38.field1148 && var38.field1149 == var38.field1152) { // L: 3503
										var38.remove();
									}
								}
							}
						}

						class7.method64(); // L: 3510
						++packetWriter.field1398; // L: 3511
						if (packetWriter.field1398 > 750) { // L: 3512
							WorldMapManager.method5197(); // L: 3513
							return; // L: 3514
						}

						MenuAction.method2082(); // L: 3516
						VarbitComposition.method3812(); // L: 3517
						class120.method2978(); // L: 3518
						++field574; // L: 3519
						if (mouseCrossColor != 0) { // L: 3520
							mouseCrossState = mouseCrossState * 400 + 20; // L: 3521
							if (mouseCrossState * 400 >= 400) { // L: 3522
								mouseCrossColor = 0;
							}
						}

						if (class378.field4437 != null) { // L: 3524
							++field743; // L: 3525
							if (field743 >= 15) { // L: 3526
								LoginScreenAnimation.invalidateWidget(class378.field4437); // L: 3527
								class378.field4437 = null; // L: 3528
							}
						}

						Widget var40 = class25.mousedOverWidgetIf1; // L: 3531
						Widget var33 = class18.field102; // L: 3532
						class25.mousedOverWidgetIf1 = null; // L: 3533
						class18.field102 = null; // L: 3534
						draggedOnWidget = null; // L: 3535
						field695 = false; // L: 3536
						field692 = false; // L: 3537
						field759 = 0; // L: 3538

						while (field702.method4141() && field759 < 128) { // L: 3539
							if (staffModLevel >= 2 && field702.method4143(82) && field702.field2339 == 66) { // L: 3540
								String var24 = class209.method4225(); // L: 3541
								Decimator.client.method501(var24); // L: 3542
							} else if (oculusOrbState != 1 || field702.field2333 <= 0) { // L: 3545
								field745[field759] = field702.field2339; // L: 3548
								field753[field759] = field702.field2333; // L: 3549
								++field759; // L: 3550
							}
						}

						boolean var34 = staffModLevel >= 2; // L: 3554
						if (var34 && field702.method4143(82) && field702.method4143(81) && mouseWheelRotation != 0) { // L: 3556
							var4 = class387.localPlayer.plane - mouseWheelRotation; // L: 3557
							if (var4 < 0) { // L: 3558
								var4 = 0;
							} else if (var4 > 3) { // L: 3559
								var4 = 3;
							}

							if (var4 != class387.localPlayer.plane) { // L: 3560
								class168.method3487(class387.localPlayer.pathX[0] + ParamComposition.baseX * 64, class387.localPlayer.pathY[0] + baseY * 64, var4, false); // L: 3561
							}

							mouseWheelRotation = 0; // L: 3563
						}

						if (MouseHandler.MouseHandler_lastButton == 1) { // L: 3565
							field752.method4097(); // L: 3566
						}

						if (rootInterface != -1) { // L: 3568
							class144.updateRootInterface(rootInterface, 0, 0, GameEngine.canvasWidth, class127.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3569

						while (true) {
							ScriptEvent var25;
							Widget var41;
							Widget var42;
							do {
								var25 = (ScriptEvent)field768.removeLast(); // L: 3571
								if (var25 == null) { // L: 3572
									while (true) {
										do {
											var25 = (ScriptEvent)field720.removeLast(); // L: 3583
											if (var25 == null) { // L: 3584
												while (true) {
													do {
														var25 = (ScriptEvent)scriptEvents.removeLast(); // L: 3595
														if (var25 == null) { // L: 3596
															while (true) {
																while (true) {
																	class204 var45;
																	do {
																		do {
																			do {
																				var45 = (class204)field721.removeLast(); // L: 3607
																				if (var45 == null) { // L: 3608
																					this.menu(); // L: 3656
																					if (GrandExchangeOfferUnitPriceComparator.worldMap != null) { // L: 3658
																						GrandExchangeOfferUnitPriceComparator.worldMap.method8306(class103.Client_plane, ParamComposition.baseX * 64 + (class387.localPlayer.x >> 7), baseY * 64 + (class387.localPlayer.y >> 7), false); // L: 3659
																						GrandExchangeOfferUnitPriceComparator.worldMap.loadCache(); // L: 3660
																					}

																					if (clickedWidget != null) { // L: 3663
																						this.method1730();
																					}

																					if (WorldMapLabelSize.dragInventoryWidget != null) { // L: 3664
																						LoginScreenAnimation.invalidateWidget(WorldMapLabelSize.dragInventoryWidget); // L: 3665
																						++itemDragDuration; // L: 3666
																						if (MouseHandler.MouseHandler_currentButton == 0) { // L: 3667
																							if (field624) { // L: 3668
																								if (WorldMapLabelSize.dragInventoryWidget == class157.hoveredItemContainer && dragItemSlotSource != dragItemSlotDestination) { // L: 3669
																									Widget var46 = WorldMapLabelSize.dragInventoryWidget; // L: 3670
																									byte var35 = 0; // L: 3671
																									if (field679 == 1 && var46.contentType == 206) { // L: 3672
																										var35 = 1;
																									}

																									if (var46.itemIds[dragItemSlotDestination] <= 0) { // L: 3673
																										var35 = 0;
																									}

																									if (class16.method216(class173.getWidgetFlags(var46))) { // L: 3674
																										var6 = dragItemSlotSource; // L: 3675
																										var7 = dragItemSlotDestination; // L: 3676
																										var46.itemIds[var7] = var46.itemIds[var6]; // L: 3677
																										var46.itemQuantities[var7] = var46.itemQuantities[var6]; // L: 3678
																										var46.itemIds[var6] = -1; // L: 3679
																										var46.itemQuantities[var6] = 0; // L: 3680
																									} else if (var35 == 1) { // L: 3682
																										var6 = dragItemSlotSource; // L: 3683
																										var7 = dragItemSlotDestination; // L: 3684

																										while (var6 != var7) { // L: 3685
																											if (var6 > var7) { // L: 3686
																												var46.swapItems(var6 - 1, var6); // L: 3687
																												--var6; // L: 3688
																											} else if (var6 < var7) { // L: 3690
																												var46.swapItems(var6 + 1, var6); // L: 3691
																												++var6; // L: 3692
																											}
																										}
																									} else {
																										var46.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3697
																									}

																									var18 = Renderable.getPacketBufferNode(ClientPacket.field3144, packetWriter.isaacCipher); // L: 3700
																									var18.packetBuffer.method8683(dragItemSlotSource); // L: 3701
																									var18.packetBuffer.method8682(dragItemSlotDestination); // L: 3702
																									var18.packetBuffer.method8673(var35); // L: 3703
																									var18.packetBuffer.method8648(WorldMapLabelSize.dragInventoryWidget.id); // L: 3704
																									packetWriter.addNode(var18); // L: 3705
																								}
																							} else if (this.shouldLeftClickOpenMenu()) { // L: 3709
																								this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3710
																							} else if (menuOptionsCount > 0) { // L: 3712
																								Skills.method6427(draggedWidgetX, draggedWidgetY); // L: 3713
																							}

																							field743 = 10; // L: 3716
																							MouseHandler.MouseHandler_lastButton = 0; // L: 3717
																							WorldMapLabelSize.dragInventoryWidget = null; // L: 3718
																						} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3721 3722
																							field624 = true; // L: 3723
																						}
																					}

																					if (Scene.shouldSendWalk()) { // L: 3728
																						var4 = Scene.Scene_selectedX; // L: 3729
																						var5 = Scene.Scene_selectedY; // L: 3730
																						var18 = Renderable.getPacketBufferNode(ClientPacket.field3158, packetWriter.isaacCipher); // L: 3732
																						var18.packetBuffer.writeByte(5); // L: 3733
																						var18.packetBuffer.writeShort(ParamComposition.baseX * 64 + var4); // L: 3734
																						var18.packetBuffer.method8765(field702.method4143(82) ? (field702.method4143(81) ? 2 : 1) : 0); // L: 3735
																						var18.packetBuffer.writeShort(baseY * 64 + var5); // L: 3736
																						packetWriter.addNode(var18); // L: 3737
																						Scene.method4510(); // L: 3738
																						mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3739
																						mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3740
																						mouseCrossColor = 1; // L: 3741
																						mouseCrossState = 0; // L: 3742
																						destinationX = var4; // L: 3743
																						destinationY = var5; // L: 3744
																					}

																					if (var40 != class25.mousedOverWidgetIf1) { // L: 3746
																						if (var40 != null) { // L: 3747
																							LoginScreenAnimation.invalidateWidget(var40);
																						}

																						if (class25.mousedOverWidgetIf1 != null) { // L: 3748
																							LoginScreenAnimation.invalidateWidget(class25.mousedOverWidgetIf1);
																						}
																					}

																					if (var33 != class18.field102 && field665 == field666) { // L: 3750
																						if (var33 != null) { // L: 3751
																							LoginScreenAnimation.invalidateWidget(var33);
																						}

																						if (class18.field102 != null) { // L: 3752
																							LoginScreenAnimation.invalidateWidget(class18.field102);
																						}
																					}

																					if (class18.field102 != null) { // L: 3754
																						if (field665 < field666) { // L: 3755
																							++field665; // L: 3756
																							if (field666 == field665) { // L: 3757
																								LoginScreenAnimation.invalidateWidget(class18.field102);
																							}
																						}
																					} else if (field665 > 0) { // L: 3760
																						--field665;
																					}

																					if (oculusOrbState == 0) { // L: 3762
																						var4 = class387.localPlayer.x; // L: 3763
																						var5 = class387.localPlayer.y; // L: 3764
																						if (class245.oculusOrbFocalPointX - var4 < -500 || class245.oculusOrbFocalPointX - var4 > 500 || UserComparator10.oculusOrbFocalPointY - var5 < -500 || UserComparator10.oculusOrbFocalPointY - var5 > 500) { // L: 3765
																							class245.oculusOrbFocalPointX = var4; // L: 3766
																							UserComparator10.oculusOrbFocalPointY = var5; // L: 3767
																						}

																						if (var4 != class245.oculusOrbFocalPointX) { // L: 3769
																							class245.oculusOrbFocalPointX += (var4 - class245.oculusOrbFocalPointX) / 16;
																						}

																						if (var5 != UserComparator10.oculusOrbFocalPointY) { // L: 3770
																							UserComparator10.oculusOrbFocalPointY += (var5 - UserComparator10.oculusOrbFocalPointY) / 16;
																						}

																						var6 = class245.oculusOrbFocalPointX >> 7; // L: 3771
																						var7 = UserComparator10.oculusOrbFocalPointY >> 7; // L: 3772
																						var8 = GrandExchangeOfferNameComparator.getTileHeight(class245.oculusOrbFocalPointX, UserComparator10.oculusOrbFocalPointY, class103.Client_plane); // L: 3773
																						var9 = 0; // L: 3774
																						if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) { // L: 3775
																							for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) { // L: 3776
																								for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) { // L: 3777
																									var12 = class103.Client_plane; // L: 3778
																									if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) { // L: 3779
																										++var12;
																									}

																									int var26 = var8 - Tiles.Tiles_heights[var12][var10][var11]; // L: 3780
																									if (var26 > var9) { // L: 3781
																										var9 = var26;
																									}
																								}
																							}
																						}

																						var10 = var9 * 192; // L: 3785
																						if (var10 > 98048) { // L: 3786
																							var10 = 98048;
																						}

																						if (var10 < 32768) { // L: 3787
																							var10 = 32768;
																						}

																						if (var10 > field598) { // L: 3788
																							field598 += (var10 - field598) / 24;
																						} else if (var10 < field598) { // L: 3789
																							field598 += (var10 - field598) / 80;
																						}

																						Ignored.field4573 = GrandExchangeOfferNameComparator.getTileHeight(class387.localPlayer.x, class387.localPlayer.y, class103.Client_plane) - camFollowHeight; // L: 3790
																					} else if (oculusOrbState == 1) { // L: 3792
																						GrandExchangeOfferOwnWorldComparator.method1210(); // L: 3793
																						short var37 = -1; // L: 3794
																						if (field702.method4143(33)) { // L: 3795
																							var37 = 0;
																						} else if (field702.method4143(49)) { // L: 3796
																							var37 = 1024;
																						}

																						if (field702.method4143(48)) { // L: 3797
																							if (var37 == 0) { // L: 3798
																								var37 = 1792;
																							} else if (var37 == 1024) { // L: 3799
																								var37 = 1280;
																							} else {
																								var37 = 1536; // L: 3800
																							}
																						} else if (field702.method4143(50)) { // L: 3802
																							if (var37 == 0) { // L: 3803
																								var37 = 256;
																							} else if (var37 == 1024) { // L: 3804
																								var37 = 768;
																							} else {
																								var37 = 512; // L: 3805
																							}
																						}

																						byte var36 = 0; // L: 3807
																						if (field702.method4143(35)) { // L: 3808
																							var36 = -1;
																						} else if (field702.method4143(51)) { // L: 3809
																							var36 = 1;
																						}

																						var6 = 0; // L: 3810
																						if (var37 >= 0 || var36 != 0) { // L: 3811
																							var6 = field702.method4143(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed; // L: 3812
																							var6 *= 16; // L: 3813
																							field590 = var37; // L: 3814
																							field531 = var36; // L: 3815
																						}

																						if (field589 < var6) { // L: 3817
																							field589 += var6 / 8; // L: 3818
																							if (field589 > var6) { // L: 3819
																								field589 = var6;
																							}
																						} else if (field589 > var6) { // L: 3821
																							field589 = field589 * 9 / 10;
																						}

																						if (field589 > 0) { // L: 3822
																							var7 = field589 / 16; // L: 3823
																							if (field590 >= 0) { // L: 3824
																								var4 = field590 - class285.cameraYaw & 2047; // L: 3825
																								var8 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 3826
																								var9 = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 3827
																								class245.oculusOrbFocalPointX += var8 * var7 / 65536; // L: 3828
																								UserComparator10.oculusOrbFocalPointY += var9 * var7 / 65536; // L: 3829
																							}

																							if (field531 != 0) { // L: 3831
																								Ignored.field4573 += var7 * field531; // L: 3832
																								if (Ignored.field4573 > 0) { // L: 3833
																									Ignored.field4573 = 0;
																								}
																							}
																						} else {
																							field590 = -1; // L: 3837
																							field531 = -1; // L: 3838
																						}

																						if (field702.method4143(13)) { // L: 3840
																							packetWriter.addNode(Renderable.getPacketBufferNode(ClientPacket.field3159, packetWriter.isaacCipher)); // L: 3842
																							oculusOrbState = 0; // L: 3843
																						}
																					}

																					if (MouseHandler.MouseHandler_currentButton == 4 && FriendsChatMember.mouseCam) { // L: 3847
																						var4 = MouseHandler.MouseHandler_y - field547; // L: 3848
																						field584 = var4 * 2; // L: 3849
																						field547 = var4 != -1 && var4 != 1 ? (field547 + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y; // L: 3850
																						var5 = field585 - MouseHandler.MouseHandler_x; // L: 3851
																						field583 = var5 * 2; // L: 3852
																						field585 = var5 != -1 && var5 != 1 ? (field585 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x; // L: 3853
																					} else {
																						if (field702.method4143(96)) { // L: 3856
																							field583 += (-24 - field583) / 2;
																						} else if (field702.method4143(97)) { // L: 3857
																							field583 += (24 - field583) / 2;
																						} else {
																							field583 /= 2; // L: 3858
																						}

																						if (field702.method4143(98)) { // L: 3859
																							field584 += (12 - field584) / 2;
																						} else if (field702.method4143(99)) { // L: 3860
																							field584 += (-12 - field584) / 2;
																						} else {
																							field584 /= 2; // L: 3861
																						}

																						field547 = MouseHandler.MouseHandler_y; // L: 3862
																						field585 = MouseHandler.MouseHandler_x; // L: 3863
																					}

																					camAngleY = field583 / 2 + camAngleY & 2047; // L: 3865
																					camAngleX += field584 / 2; // L: 3866
																					if (camAngleX < 128) { // L: 3867
																						camAngleX = 128;
																					}

																					if (camAngleX > 383) { // L: 3868
																						camAngleX = 383;
																					}

																					if (field767) { // L: 3870
																						WallObject.method4846();
																					} else if (isCameraLocked) { // L: 3871
																						var4 = Occluder.field2636 * 128 + 64; // L: 3872
																						var5 = class108.field1416 * 128 + 64; // L: 3873
																						var6 = GrandExchangeOfferNameComparator.getTileHeight(var4, var5, class103.Client_plane) - class10.field55; // L: 3874
																						class275.method5532(var4, var6, var5); // L: 3875
																						var4 = WorldMapData_0.field2806 * 16384 + 64; // L: 3876
																						var5 = Players.field1352 * 16384 + 64; // L: 3877
																						var6 = GrandExchangeOfferNameComparator.getTileHeight(var4, var5, class103.Client_plane) - FloorOverlayDefinition.field2266; // L: 3878
																						var7 = var4 - ClanSettings.cameraX; // L: 3879
																						var8 = var6 - UserComparator10.cameraY; // L: 3880
																						var9 = var5 - class366.cameraZ; // L: 3881
																						var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9)); // L: 3882
																						var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047; // L: 3883
																						var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047; // L: 3884
																						FloorOverlayDefinition.method4027(var11, var12); // L: 3885
																					}

																					for (var4 = 0; var4 < 5; ++var4) { // L: 3887
																						int var10002 = field772[var4]++;
																					}

																					class9.varcs.tryWrite(); // L: 3888
																					var4 = class133.method3119(); // L: 3889
																					var5 = GameEngine.field236.method353(); // L: 3892
																					PacketBufferNode var27;
																					if (var4 > 15000 && var5 > 15000) { // L: 3895
																						logoutTimer = 250; // L: 3896
																						MouseHandler.MouseHandler_idleCycles = 14500; // L: 3898
																						var27 = Renderable.getPacketBufferNode(ClientPacket.field3140, packetWriter.isaacCipher); // L: 3901
																						packetWriter.addNode(var27); // L: 3902
																					}

																					WorldMapElement.friendSystem.processFriendUpdates(); // L: 3904

																					for (var7 = 0; var7 < field797.size(); ++var7) { // L: 3906
																						if (class70.method2087((Integer)field797.get(var7)) != 2) { // L: 3907
																							field797.remove(var7); // L: 3908
																							--var7; // L: 3909
																						}
																					}

																					++packetWriter.pendingWrites; // L: 3913
																					if (packetWriter.pendingWrites > 50) { // L: 3914
																						var27 = Renderable.getPacketBufferNode(ClientPacket.field3098, packetWriter.isaacCipher); // L: 3916
																						packetWriter.addNode(var27); // L: 3917
																					}

																					try {
																						packetWriter.flush(); // L: 3920
																					} catch (IOException var28) { // L: 3922
																						WorldMapManager.method5197(); // L: 3923
																					}

																					return; // L: 3925
																				}
																			} while(var45 == null); // L: 3610
																		} while(var45.field2324 == null);

																		if (var45.field2324.childIndex < 0) { // L: 3611
																			break;
																		}

																		var42 = class133.getWidget(var45.field2324.parentId); // L: 3612
																	} while(var42 == null || var42.children == null || var42.children.length == 0 || var45.field2324.childIndex >= var42.children.length || var45.field2324 != var42.children[var45.field2324.childIndex]); // L: 3613

																	if (var45.field2324.type == 11 && var45.field2317 == 0) { // L: 3617
																		switch(var45.field2324.method6218()) { // L: 3618
																		case 0:
																			AttackOption.openURL(var45.field2324.method6229(), true, false); // L: 3635
																			break;
																		case 1:
																			if (class189.method3716(class173.getWidgetFlags(var45.field2324))) { // L: 3620
																				int[] var44 = var45.field2324.method6247(); // L: 3621
																				if (var44 != null) { // L: 3622
																					var18 = Renderable.getPacketBufferNode(ClientPacket.field3164, packetWriter.isaacCipher); // L: 3623
																					var18.packetBuffer.method8846(var44[2]); // L: 3624
																					var18.packetBuffer.method8696(var44[1]); // L: 3625
																					var18.packetBuffer.writeInt(var45.field2324.method6335()); // L: 3626
																					var18.packetBuffer.method8648(var45.field2324.id); // L: 3627
																					var18.packetBuffer.writeIntME(var45.field2324.childIndex); // L: 3628
																					var18.packetBuffer.method8696(var44[0]); // L: 3629
																					packetWriter.addNode(var18); // L: 3630
																				}
																			}
																		}
																	} else if (var45.field2324.type == 12) { // L: 3639
																		class307 var43 = var45.field2324.method6235(); // L: 3640
																		if (var43 != null && var43.method5954()) { // L: 3641
																			switch(var45.field2317) { // L: 3642
																			case 0:
																				field752.method4096(var45.field2324); // L: 3644
																				var43.method6057(true); // L: 3645
																				var43.method5962(var45.field2319, var45.field2322, field702.method4143(82), field702.method4143(81)); // L: 3646
																				break; // L: 3647
																			case 1:
																				var43.method6048(var45.field2319, var45.field2322); // L: 3649
																			}
																		}
																	}
																}
															}
														}

														var42 = var25.widget; // L: 3597
														if (var42.childIndex < 0) { // L: 3598
															break;
														}

														var41 = class133.getWidget(var42.parentId); // L: 3599
													} while(var41 == null || var41.children == null || var42.childIndex >= var41.children.length || var42 != var41.children[var42.childIndex]); // L: 3600

													WorldMapAreaData.runScriptEvent(var25); // L: 3604
												}
											}

											var42 = var25.widget; // L: 3585
											if (var42.childIndex < 0) { // L: 3586
												break;
											}

											var41 = class133.getWidget(var42.parentId); // L: 3587
										} while(var41 == null || var41.children == null || var42.childIndex >= var41.children.length || var42 != var41.children[var42.childIndex]); // L: 3588

										WorldMapAreaData.runScriptEvent(var25); // L: 3592
									}
								}

								var42 = var25.widget; // L: 3573
								if (var42.childIndex < 0) { // L: 3574
									break;
								}

								var41 = class133.getWidget(var42.parentId); // L: 3575
							} while(var41 == null || var41.children == null || var42.childIndex >= var41.children.length || var42 != var41.children[var42.childIndex]); // L: 3576

							WorldMapAreaData.runScriptEvent(var25); // L: 3580
						}
					}

					var31 = Renderable.getPacketBufferNode(ClientPacket.field3132, packetWriter.isaacCipher); // L: 3275
					var31.packetBuffer.writeByte(0); // L: 3276
					var3 = var31.packetBuffer.offset; // L: 3277
					ClanChannel.performReflectionCheck(var31.packetBuffer); // L: 3278
					var31.packetBuffer.method8810(var31.packetBuffer.offset - var3); // L: 3279
					packetWriter.addNode(var31); // L: 3280
				}
			}
		}
	} // L: 3257

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1406120481"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GameEngine.canvasWidth; // L: 4662
		int var2 = class127.canvasHeight; // L: 4663
		if (super.contentWidth < var1) { // L: 4664
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) { // L: 4665
			var2 = super.contentHeight;
		}

		if (PacketWriter.clientPreferences != null) { // L: 4666
			try {
				Client var3 = Decimator.client; // L: 4668
				Object[] var4 = new Object[]{Message.getWindowedMode()}; // L: 4669
				JSObject.getWindow(var3).call("resize", var4); // L: 4672
			} catch (Throwable var5) { // L: 4675
			}
		}

	} // L: 4677

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "551347183"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) { // L: 4680
			var1 = rootInterface; // L: 4681
			if (class153.loadInterface(var1)) { // L: 4683
				class390.drawModelComponents(WorldMapLabel.Widget_interfaceComponents[var1], -1); // L: 4684
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4687
			if (field725[var1]) { // L: 4688
				field678[var1] = true;
			}

			field560[var1] = field725[var1]; // L: 4689
			field725[var1] = false; // L: 4690
		}

		field724 = cycle; // L: 4692
		viewportX = -1; // L: 4693
		viewportY = -1; // L: 4694
		class157.hoveredItemContainer = null; // L: 4695
		if (rootInterface != -1) { // L: 4696
			rootWidgetCount = 0; // L: 4697
			class97.drawWidgets(rootInterface, 0, 0, GameEngine.canvasWidth, class127.canvasHeight, 0, 0, -1); // L: 4698
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4700
		if (showMouseCross) { // L: 4701
			if (mouseCrossColor == 1) { // L: 4702
				Calendar.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4703
			}

			if (mouseCrossColor == 2) { // L: 4705
				Calendar.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4706
			}
		}

		if (!isMenuOpen) { // L: 4709
			if (viewportX != -1) { // L: 4710
				var1 = viewportX; // L: 4711
				int var2 = viewportY; // L: 4712
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) { // L: 4714 4715
					int var3 = menuOptionsCount - 1; // L: 4718
					String var5;
					if (isItemSelected == 1 && menuOptionsCount < 2) { // L: 4722
						var5 = "Use" + " " + selectedItemName + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) { // L: 4723
						var5 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						var5 = TriBool.method7753(var3); // L: 4724
					}

					if (menuOptionsCount > 2) { // L: 4725
						var5 = var5 + class149.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					class19.fontBold12.drawRandomAlphaAndSpacing(var5, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000); // L: 4726
				}
			}
		} else {
			StructComposition.method3853(); // L: 4730
		}

		if (gameDrawingMode == 3) { // L: 4731
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4732
				if (field560[var1]) { // L: 4733
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4734
				} else if (field678[var1]) { // L: 4736
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4737
				}
			}
		}

		class12.method172(class103.Client_plane, class387.localPlayer.x, class387.localPlayer.y, field574); // L: 4741
		field574 = 0; // L: 4742
	} // L: 4743

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Ldb;IB)Z",
		garbageValue = "-1"
	)
	boolean method1770(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 6377
			class463.friendsChatManager = null; // L: 6378
		} else {
			if (class463.friendsChatManager == null) { // L: 6381
				class463.friendsChatManager = new FriendsChatManager(WorldMapCacheName.loginType, Decimator.client); // L: 6382
			}

			class463.friendsChatManager.method7554(var1.packetBuffer, var2); // L: 6384
		}

		class138.method3149(); // L: 6386
		var1.serverPacket = null; // L: 6387
		return true; // L: 6388
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Ldb;I)Z",
		garbageValue = "270594437"
	)
	boolean method1235(PacketWriter var1) {
		if (class463.friendsChatManager != null) { // L: 6392
			class463.friendsChatManager.method7550(var1.packetBuffer); // L: 6393
		}

		class138.method3149(); // L: 6395
		var1.serverPacket = null; // L: 6396
		return true; // L: 6397
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Ldb;I)Z",
		garbageValue = "897974344"
	)
	final boolean method1621(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6402
		PacketBuffer var3 = var1.packetBuffer; // L: 6403
		if (var2 == null) { // L: 6404
			return false;
		} else {
			int var21;
			String var24;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6406
					if (var1.field1397) { // L: 6407
						if (!var2.isAvailable(1)) { // L: 6408
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6409
						var1.field1398 = 0; // L: 6410
						var1.field1397 = false; // L: 6411
					}

					var3.offset = 0; // L: 6413
					if (var3.method8624()) { // L: 6414
						if (!var2.isAvailable(1)) { // L: 6415
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6416
						var1.field1398 = 0; // L: 6417
					}

					var1.field1397 = true; // L: 6419
					ServerPacket[] var4 = class179.ServerPacket_values(); // L: 6420
					var5 = var3.readSmartByteShortIsaac(); // L: 6421
					if (var5 < 0 || var5 >= var4.length) { // L: 6422
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6423
					var1.serverPacketLength = var1.serverPacket.length; // L: 6424
				}

				if (var1.serverPacketLength == -1) { // L: 6426
					if (!var2.isAvailable(1)) { // L: 6427
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6428
					var1.serverPacketLength = var3.array[0] & 255; // L: 6429
				}

				if (var1.serverPacketLength == -2) { // L: 6431
					if (!var2.isAvailable(2)) { // L: 6432
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6433
					var3.offset = 0; // L: 6434
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6435
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6437
					return false;
				}

				var3.offset = 0; // L: 6438
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6439
				var1.field1398 = 0; // L: 6440
				timer.method7381(); // L: 6441
				var1.field1402 = var1.field1401; // L: 6442
				var1.field1401 = var1.field1405; // L: 6443
				var1.field1405 = var1.serverPacket; // L: 6444
				if (ServerPacket.field3205 == var1.serverPacket) { // L: 6445
					class25.field147 = var3.method8677(); // L: 6446
					class373.field4406 = var3.readUnsignedByte(); // L: 6447
					var1.serverPacket = null; // L: 6448
					return true; // L: 6449
				}

				int var20;
				String var54;
				boolean var73;
				if (ServerPacket.field3224 == var1.serverPacket) { // L: 6451
					var20 = var3.readUShortSmart(); // L: 6452
					var73 = var3.readUnsignedByte() == 1; // L: 6453
					var54 = ""; // L: 6454
					boolean var69 = false; // L: 6455
					if (var73) { // L: 6456
						var54 = var3.readStringCp1252NullTerminated(); // L: 6457
						if (WorldMapElement.friendSystem.isIgnored(new Username(var54, WorldMapCacheName.loginType))) { // L: 6458
							var69 = true;
						}
					}

					String var60 = var3.readStringCp1252NullTerminated(); // L: 6460
					if (!var69) { // L: 6461
						class280.addGameMessage(var20, var54, var60);
					}

					var1.serverPacket = null; // L: 6462
					return true; // L: 6463
				}

				Widget var53;
				if (ServerPacket.field3288 == var1.serverPacket) { // L: 6465
					var20 = var3.readInt(); // L: 6466
					var73 = var3.method8676() == 1; // L: 6467
					var53 = class133.getWidget(var20); // L: 6468
					if (var73 != var53.isHidden) { // L: 6469
						var53.isHidden = var73; // L: 6470
						LoginScreenAnimation.invalidateWidget(var53); // L: 6471
					}

					var1.serverPacket = null; // L: 6473
					return true; // L: 6474
				}

				if (ServerPacket.field3306 == var1.serverPacket) { // L: 6476
					var20 = var3.readUnsignedShort(); // L: 6477
					var5 = var3.readUnsignedByte(); // L: 6478
					var21 = var3.readUnsignedShort(); // L: 6479
					class275.queueSoundEffect(var20, var5, var21); // L: 6480
					var1.serverPacket = null; // L: 6481
					return true; // L: 6482
				}

				if (ServerPacket.field3249 == var1.serverPacket) { // L: 6484
					destinationX = var3.readUnsignedByte(); // L: 6485
					if (destinationX == 255) { // L: 6486
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6487
					if (destinationY == 255) { // L: 6488
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6489
					return true; // L: 6490
				}

				Widget var76;
				if (ServerPacket.field3272 == var1.serverPacket) { // L: 6492
					var20 = var3.method8714(); // L: 6493
					var5 = var3.readUnsignedShort(); // L: 6494
					var21 = var3.method8698(); // L: 6495
					var76 = class133.getWidget(var21); // L: 6496
					var76.field3585 = var5 + (var20 << 16); // L: 6497
					var1.serverPacket = null; // L: 6498
					return true; // L: 6499
				}

				if (ServerPacket.field3294 == var1.serverPacket) { // L: 6501
					class277.loadRegions(false, var1.packetBuffer); // L: 6502
					var1.serverPacket = null; // L: 6503
					return true; // L: 6504
				}

				boolean var93;
				if (ServerPacket.field3259 == var1.serverPacket) { // L: 6506
					var93 = var3.readUnsignedByte() == 1; // L: 6507
					if (var93) { // L: 6508
						class361.field4359 = class153.method3317() - var3.readLong(); // L: 6509
						EnumComposition.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 6510
					} else {
						EnumComposition.grandExchangeEvents = null; // L: 6512
					}

					field804 = cycleCntr; // L: 6513
					var1.serverPacket = null; // L: 6514
					return true; // L: 6515
				}

				int var7;
				int var9;
				int var10;
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				Projectile var19;
				int var23;
				byte var62;
				int var64;
				byte var66;
				if (ServerPacket.field3298 == var1.serverPacket) { // L: 6517
					var62 = var3.method8786(); // L: 6533
					var14 = var3.method8676() * 4; // L: 6534
					var66 = var3.method8875(); // L: 6535
					var18 = var3.method8676(); // L: 6536
					var13 = var3.method8676() * 4; // L: 6537
					var15 = var3.readUnsignedShort(); // L: 6538
					var17 = var3.readUnsignedByte(); // L: 6539
					var12 = var3.method8719(); // L: 6540
					var16 = var3.method8719(); // L: 6541
					var21 = var3.method8692(); // L: 6542
					var20 = var21 >> 16; // L: 6543
					var5 = var21 >> 8 & 255; // L: 6544
					var7 = var20 + (var21 >> 4 & 7); // L: 6545
					var23 = var5 + (var21 & 7); // L: 6546
					var64 = var3.method8689(); // L: 6547
					var9 = var66 + var7; // L: 6548
					var10 = var62 + var23; // L: 6549
					if (var7 >= 0 && var23 >= 0 && var7 < 104 && var23 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var12 != 65535) { // L: 6550
						var7 = var7 * 128 + 64; // L: 6551
						var23 = var23 * 128 + 64; // L: 6552
						var9 = var9 * 128 + 64; // L: 6553
						var10 = var10 * 128 + 64; // L: 6554
						var19 = new Projectile(var12, class103.Client_plane, var7, var23, GrandExchangeOfferNameComparator.getTileHeight(var7, var23, class103.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var64, var14); // L: 6555
						var19.setDestination(var9, var10, GrandExchangeOfferNameComparator.getTileHeight(var9, var10, class103.Client_plane) - var14, var15 + cycle); // L: 6556
						projectiles.addFirst(var19); // L: 6557
					}

					var1.serverPacket = null; // L: 6559
					return true; // L: 6560
				}

				if (ServerPacket.field3227 == var1.serverPacket) { // L: 6562
					var66 = var3.method8875(); // L: 6578
					var18 = var3.method8677(); // L: 6579
					var15 = var3.method8714(); // L: 6580
					var12 = var3.readUnsignedShort(); // L: 6581
					var17 = var3.method8676(); // L: 6582
					var21 = var3.method8692(); // L: 6583
					var20 = var21 >> 16; // L: 6584
					var5 = var21 >> 8 & 255; // L: 6585
					var7 = var20 + (var21 >> 4 & 7); // L: 6586
					var23 = var5 + (var21 & 7); // L: 6587
					var64 = var3.method8710(); // L: 6588
					var13 = var3.method8677() * 4; // L: 6589
					var62 = var3.readByte(); // L: 6590
					var16 = var3.method8714(); // L: 6591
					var14 = var3.method8677() * 4; // L: 6592
					var9 = var66 + var7; // L: 6593
					var10 = var62 + var23; // L: 6594
					if (var7 >= 0 && var23 >= 0 && var7 < 104 && var23 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var12 != 65535) { // L: 6595
						var7 = var7 * 128 + 64; // L: 6596
						var23 = var23 * 128 + 64; // L: 6597
						var9 = var9 * 128 + 64; // L: 6598
						var10 = var10 * 128 + 64; // L: 6599
						var19 = new Projectile(var12, class103.Client_plane, var7, var23, GrandExchangeOfferNameComparator.getTileHeight(var7, var23, class103.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var64, var14); // L: 6600
						var19.setDestination(var9, var10, GrandExchangeOfferNameComparator.getTileHeight(var9, var10, class103.Client_plane) - var14, var15 + cycle); // L: 6601
						projectiles.addFirst(var19); // L: 6602
					}

					var1.serverPacket = null; // L: 6604
					return true; // L: 6605
				}

				if (ServerPacket.field3225 == var1.serverPacket) { // L: 6607
					if (class388.field4512 == null) { // L: 6608
						class388.field4512 = new class421(class208.Ignored_cached);
					}

					class482 var56 = class208.Ignored_cached.method8003(var3); // L: 6609
					class388.field4512.field4671.vmethod8378(var56.field5003, var56.field5004); // L: 6610
					field706[++field698 - 1 & 31] = var56.field5003; // L: 6611
					var1.serverPacket = null; // L: 6612
					return true; // L: 6613
				}

				if (ServerPacket.field3196 == var1.serverPacket) { // L: 6615
					isCameraLocked = true; // L: 6616
					field767 = false; // L: 6617
					Occluder.field2636 = var3.readUnsignedByte() * 16384; // L: 6618
					class108.field1416 = var3.readUnsignedByte() * 16384; // L: 6619
					class10.field55 = var3.readUnsignedShort(); // L: 6620
					ModeWhere.field4340 = var3.readUnsignedByte(); // L: 6621
					UserComparator7.field1444 = var3.readUnsignedByte(); // L: 6622
					if (UserComparator7.field1444 >= 100) { // L: 6623
						ClanSettings.cameraX = Occluder.field2636 * 128 + 64; // L: 6624
						class366.cameraZ = class108.field1416 * 128 + 64; // L: 6625
						UserComparator10.cameraY = GrandExchangeOfferNameComparator.getTileHeight(ClanSettings.cameraX, class366.cameraZ, class103.Client_plane) - class10.field55; // L: 6626
					}

					var1.serverPacket = null; // L: 6628
					return true; // L: 6629
				}

				if (ServerPacket.field3200 == var1.serverPacket) { // L: 6631
					class388.field4512 = null; // L: 6632
					var1.serverPacket = null; // L: 6633
					return true; // L: 6634
				}

				if (ServerPacket.field3211 == var1.serverPacket) { // L: 6636
					var20 = var3.method8719(); // L: 6637
					VarpDefinition.method3596(var20); // L: 6638
					field661[++field524 - 1 & 31] = var20 & 32767; // L: 6639
					var1.serverPacket = null; // L: 6640
					return true; // L: 6641
				}

				if (ServerPacket.field3256 == var1.serverPacket) { // L: 6643
					var20 = var3.readInt(); // L: 6644
					InterfaceParent var86 = (InterfaceParent)interfaceParents.get((long)var20); // L: 6645
					if (var86 != null) { // L: 6646
						class10.closeInterface(var86, true);
					}

					if (meslayerContinueWidget != null) { // L: 6647
						LoginScreenAnimation.invalidateWidget(meslayerContinueWidget); // L: 6648
						meslayerContinueWidget = null; // L: 6649
					}

					var1.serverPacket = null; // L: 6651
					return true; // L: 6652
				}

				if (ServerPacket.field3235 == var1.serverPacket) { // L: 6654
					var20 = var3.readInt(); // L: 6655
					if (var20 != field594) { // L: 6656
						field594 = var20; // L: 6657
						SoundSystem.method850(); // L: 6658
					}

					var1.serverPacket = null; // L: 6660
					return true; // L: 6661
				}

				if (ServerPacket.field3267 == var1.serverPacket) { // L: 6663
					isCameraLocked = false; // L: 6664

					for (var20 = 0; var20 < 5; ++var20) { // L: 6665
						field569[var20] = false;
					}

					var1.serverPacket = null; // L: 6666
					return true; // L: 6667
				}

				String var50;
				if (ServerPacket.field3210 == var1.serverPacket) { // L: 6669
					var50 = var3.readStringCp1252NullTerminated(); // L: 6670
					Object[] var85 = new Object[var50.length() + 1]; // L: 6671

					for (var21 = var50.length() - 1; var21 >= 0; --var21) { // L: 6672
						if (var50.charAt(var21) == 's') { // L: 6673
							var85[var21 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var85[var21 + 1] = new Integer(var3.readInt()); // L: 6674
						}
					}

					var85[0] = new Integer(var3.readInt()); // L: 6676
					ScriptEvent var65 = new ScriptEvent(); // L: 6677
					var65.args = var85; // L: 6678
					WorldMapAreaData.runScriptEvent(var65); // L: 6679
					var1.serverPacket = null; // L: 6680
					return true; // L: 6681
				}

				if (ServerPacket.field3239 == var1.serverPacket) { // L: 6683
					var20 = var3.method8719(); // L: 6684
					if (var20 == 65535) { // L: 6685
						var20 = -1;
					}

					var5 = var3.method8700(); // L: 6686
					var21 = var3.method8700(); // L: 6687
					var76 = class133.getWidget(var21); // L: 6688
					ItemComposition var59;
					if (!var76.isIf3) { // L: 6689
						if (var20 == -1) { // L: 6690
							var76.modelType = 0; // L: 6691
							var1.serverPacket = null; // L: 6692
							return true; // L: 6693
						}

						var59 = TileItem.ItemComposition_get(var20); // L: 6695
						var76.modelType = 4; // L: 6696
						var76.modelId = var20; // L: 6697
						var76.modelAngleX = var59.xan2d; // L: 6698
						var76.modelAngleY = var59.yan2d; // L: 6699
						var76.modelZoom = var59.zoom2d * 100 / var5; // L: 6700
						LoginScreenAnimation.invalidateWidget(var76); // L: 6701
					} else {
						var76.itemId = var20; // L: 6704
						var76.itemQuantity = var5; // L: 6705
						var59 = TileItem.ItemComposition_get(var20); // L: 6706
						var76.modelAngleX = var59.xan2d; // L: 6707
						var76.modelAngleY = var59.yan2d; // L: 6708
						var76.modelAngleZ = var59.zan2d; // L: 6709
						var76.modelOffsetX = var59.offsetX2d; // L: 6710
						var76.modelOffsetY = var59.offsetY2d; // L: 6711
						var76.modelZoom = var59.zoom2d; // L: 6712
						if (var59.isStackable == 1) { // L: 6713
							var76.itemQuantityMode = 1;
						} else {
							var76.itemQuantityMode = 2; // L: 6714
						}

						if (var76.field3616 > 0) { // L: 6715
							var76.modelZoom = var76.modelZoom * 32 / var76.field3616;
						} else if (var76.rawWidth > 0) { // L: 6716
							var76.modelZoom = var76.modelZoom * 32 / var76.rawWidth;
						}

						LoginScreenAnimation.invalidateWidget(var76); // L: 6717
					}

					var1.serverPacket = null; // L: 6719
					return true; // L: 6720
				}

				GameObject var32;
				String var33;
				byte var84;
				if (ServerPacket.field3232 == var1.serverPacket) { // L: 6722
					var84 = var3.readByte(); // L: 6723
					var24 = var3.readStringCp1252NullTerminated(); // L: 6724
					long var25 = (long)var3.readUnsignedShort(); // L: 6725
					long var27 = (long)var3.readMedium(); // L: 6726
					PlayerType var88 = (PlayerType)class4.findEnumerated(ArchiveLoader.PlayerType_values(), var3.readUnsignedByte()); // L: 6727
					long var30 = var27 + (var25 << 32); // L: 6728
					boolean var68 = false; // L: 6729
					var32 = null; // L: 6730
					ClanChannel var92 = var84 >= 0 ? currentClanChannels[var84] : class482.guestClanChannel; // L: 6732
					if (var92 == null) { // L: 6733
						var68 = true; // L: 6734
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var88.isUser && WorldMapElement.friendSystem.isIgnored(new Username(var24, WorldMapCacheName.loginType))) { // L: 6743 6744
									var68 = true;
								}
								break;
							}

							if (var30 == crossWorldMessageIds[var15]) { // L: 6738
								var68 = true; // L: 6739
								break; // L: 6740
							}

							++var15; // L: 6737
						}
					}

					if (!var68) { // L: 6747
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var30; // L: 6748
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6749
						var33 = AbstractFont.escapeBrackets(class163.method3398(var3)); // L: 6750
						var16 = var84 >= 0 ? 41 : 44; // L: 6751
						if (var88.modIcon != -1) { // L: 6752
							class134.addChatMessage(var16, ObjectSound.method1919(var88.modIcon) + var24, var33, var92.name);
						} else {
							class134.addChatMessage(var16, var24, var33, var92.name); // L: 6753
						}
					}

					var1.serverPacket = null; // L: 6755
					return true; // L: 6756
				}

				if (ServerPacket.field3291 == var1.serverPacket) { // L: 6758
					return this.method1770(var1, 1); // L: 6759
				}

				if (ServerPacket.field3301 == var1.serverPacket) { // L: 6761
					Decimator.method1123(class280.field3178); // L: 6762
					var1.serverPacket = null; // L: 6763
					return true; // L: 6764
				}

				if (ServerPacket.field3209 == var1.serverPacket) { // L: 6766
					var20 = var3.readUnsignedByte(); // L: 6767
					if (var3.readUnsignedByte() == 0) { // L: 6768
						grandExchangeOffers[var20] = new GrandExchangeOffer(); // L: 6769
						var3.offset += 18; // L: 6770
					} else {
						--var3.offset; // L: 6773
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false); // L: 6774
					}

					field713 = cycleCntr; // L: 6776
					var1.serverPacket = null; // L: 6777
					return true; // L: 6778
				}

				if (ServerPacket.field3286 == var1.serverPacket) { // L: 6780
					var5 = var3.method8714(); // L: 6785
					var20 = var3.method8730(); // L: 6786
					Player var77;
					if (var20 == localPlayerIndex) { // L: 6787
						var77 = class387.localPlayer; // L: 6788
					} else {
						var77 = players[var20]; // L: 6791
					}

					var21 = var3.method8700(); // L: 6793
					if (var77 != null) { // L: 6794
						var77.spotAnimation = var5; // L: 6795
						var77.field1210 = var21 >> 16; // L: 6796
						var77.field1207 = (var21 & 65535) + cycle; // L: 6797
						var77.spotAnimationFrame = 0; // L: 6798
						var77.field1208 = 0; // L: 6799
						if (var77.field1207 > cycle) { // L: 6800
							var77.spotAnimationFrame = -1; // L: 6801
						}

						if (var77.spotAnimation == 65535) { // L: 6803
							var77.spotAnimation = -1; // L: 6804
						}
					}

					var1.serverPacket = null; // L: 6807
					return true; // L: 6808
				}

				if (ServerPacket.field3230 == var1.serverPacket) { // L: 6810
					Decimator.method1123(class280.field3175); // L: 6811
					var1.serverPacket = null; // L: 6812
					return true; // L: 6813
				}

				if (ServerPacket.field3257 == var1.serverPacket) { // L: 6815
					var20 = var3.readInt(); // L: 6816
					var5 = var3.method8719(); // L: 6817
					var53 = class133.getWidget(var20); // L: 6818
					if (var53.modelType != 2 || var5 != var53.modelId) { // L: 6819
						var53.modelType = 2; // L: 6820
						var53.modelId = var5; // L: 6821
						LoginScreenAnimation.invalidateWidget(var53); // L: 6822
					}

					var1.serverPacket = null; // L: 6824
					return true; // L: 6825
				}

				if (ServerPacket.field3247 == var1.serverPacket) { // L: 6827
					Decimator.method1123(class280.field3182); // L: 6828
					var1.serverPacket = null; // L: 6829
					return true; // L: 6830
				}

				if (ServerPacket.field3228 == var1.serverPacket) { // L: 6832
					Decimator.method1123(class280.field3172); // L: 6833
					var1.serverPacket = null; // L: 6834
					return true; // L: 6835
				}

				long var34;
				InterfaceParent var74;
				if (ServerPacket.field3285 == var1.serverPacket) { // L: 6837
					var20 = var3.offset + var1.serverPacketLength; // L: 6838
					var5 = var3.readUnsignedShort(); // L: 6839
					var21 = var3.readUnsignedShort(); // L: 6840
					if (var5 != rootInterface) { // L: 6841
						rootInterface = var5; // L: 6842
						this.resizeRoot(false); // L: 6843
						class155.Widget_resetModelFrames(rootInterface); // L: 6844
						SoundCache.runWidgetOnLoadListener(rootInterface); // L: 6845

						for (var7 = 0; var7 < 100; ++var7) { // L: 6846
							field725[var7] = true;
						}
					}

					InterfaceParent var87;
					for (; var21-- > 0; var87.field1055 = true) { // L: 6848 6858
						var7 = var3.readInt(); // L: 6849
						var23 = var3.readUnsignedShort(); // L: 6850
						var9 = var3.readUnsignedByte(); // L: 6851
						var87 = (InterfaceParent)interfaceParents.get((long)var7); // L: 6852
						if (var87 != null && var23 != var87.group) { // L: 6853
							class10.closeInterface(var87, true); // L: 6854
							var87 = null; // L: 6855
						}

						if (var87 == null) { // L: 6857
							var87 = ModeWhere.method6788(var7, var23, var9);
						}
					}

					for (var74 = (InterfaceParent)interfaceParents.first(); var74 != null; var74 = (InterfaceParent)interfaceParents.next()) { // L: 6860
						if (var74.field1055) { // L: 6861
							var74.field1055 = false;
						} else {
							class10.closeInterface(var74, true); // L: 6863
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6866

					while (var3.offset < var20) { // L: 6867
						var7 = var3.readInt(); // L: 6868
						var23 = var3.readUnsignedShort(); // L: 6869
						var9 = var3.readUnsignedShort(); // L: 6870
						var10 = var3.readInt(); // L: 6871

						for (var64 = var23; var64 <= var9; ++var64) { // L: 6872
							var34 = ((long)var7 << 32) + (long)var64; // L: 6873
							widgetFlags.put(new IntegerNode(var10), var34); // L: 6874
						}
					}

					var1.serverPacket = null; // L: 6877
					return true; // L: 6878
				}

				NPC var75;
				if (ServerPacket.field3283 == var1.serverPacket) { // L: 6880
					var20 = var3.readUnsignedShort(); // L: 6884
					var5 = var3.method8730(); // L: 6885
					var21 = var3.readUnsignedByte(); // L: 6886
					if (var5 == 65535) { // L: 6887
						var5 = -1; // L: 6888
					}

					var75 = npcs[var20]; // L: 6890
					if (var75 != null) { // L: 6891
						if (var5 == var75.sequence && var5 != -1) { // L: 6892
							var23 = class85.SequenceDefinition_get(var5).field2308; // L: 6893
							if (var23 == 1) { // L: 6894
								var75.sequenceFrame = 0; // L: 6895
								var75.sequenceFrameCycle = 0; // L: 6896
								var75.sequenceDelay = var21; // L: 6897
								var75.field1205 = 0; // L: 6898
							} else if (var23 == 2) { // L: 6900
								var75.field1205 = 0; // L: 6901
							}
						} else if (var5 == -1 || var75.sequence == -1 || class85.SequenceDefinition_get(var5).field2292 >= class85.SequenceDefinition_get(var75.sequence).field2292) { // L: 6904
							var75.sequence = var5; // L: 6905
							var75.sequenceFrame = 0; // L: 6906
							var75.sequenceFrameCycle = 0; // L: 6907
							var75.sequenceDelay = var21; // L: 6908
							var75.field1205 = 0; // L: 6909
							var75.field1230 = var75.pathLength; // L: 6910
						}
					}

					var1.serverPacket = null; // L: 6914
					return true; // L: 6915
				}

				if (ServerPacket.field3251 == var1.serverPacket) { // L: 6917
					field693 = cycleCntr; // L: 6918
					var84 = var3.readByte(); // L: 6919
					class156 var83 = new class156(var3); // L: 6920
					ClanChannel var61;
					if (var84 >= 0) { // L: 6922
						var61 = currentClanChannels[var84];
					} else {
						var61 = class482.guestClanChannel; // L: 6923
					}

					var83.method3335(var61); // L: 6924
					var1.serverPacket = null; // L: 6925
					return true; // L: 6926
				}

				if (ServerPacket.field3287 == var1.serverPacket) { // L: 6928
					ClientPacket.updateNpcs(false, var3); // L: 6929
					var1.serverPacket = null; // L: 6930
					return true; // L: 6931
				}

				if (ServerPacket.field3264 == var1.serverPacket) { // L: 6933
					field693 = cycleCntr; // L: 6934
					var84 = var3.readByte(); // L: 6935
					if (var1.serverPacketLength == 1) { // L: 6936
						if (var84 >= 0) { // L: 6937
							currentClanChannels[var84] = null;
						} else {
							class482.guestClanChannel = null; // L: 6938
						}

						var1.serverPacket = null; // L: 6939
						return true; // L: 6940
					}

					if (var84 >= 0) { // L: 6942
						currentClanChannels[var84] = new ClanChannel(var3); // L: 6943
					} else {
						class482.guestClanChannel = new ClanChannel(var3); // L: 6946
					}

					var1.serverPacket = null; // L: 6948
					return true; // L: 6949
				}

				if (ServerPacket.field3303 == var1.serverPacket) { // L: 6951
					var64 = var3.readUnsignedShort(); // L: 6960
					var10 = var3.method8677(); // L: 6961
					var9 = var3.method8730(); // L: 6962
					var21 = var3.method8843(); // L: 6963
					var20 = var21 >> 16; // L: 6964
					var5 = var21 >> 8 & 255; // L: 6965
					var7 = var20 + (var21 >> 4 & 7); // L: 6966
					var23 = var5 + (var21 & 7); // L: 6967
					if (var7 >= 0 && var23 >= 0 && var7 < 104 && var23 < 104) { // L: 6968
						var7 = var7 * 128 + 64; // L: 6969
						var23 = var23 * 128 + 64; // L: 6970
						GraphicsObject var94 = new GraphicsObject(var9, class103.Client_plane, var7, var23, GrandExchangeOfferNameComparator.getTileHeight(var7, var23, class103.Client_plane) - var10, var64, cycle); // L: 6971
						graphicsObjects.addFirst(var94); // L: 6972
					}

					var1.serverPacket = null; // L: 6974
					return true; // L: 6975
				}

				if (ServerPacket.field3219 == var1.serverPacket) { // L: 6977
					return this.method1235(var1); // L: 6978
				}

				if (ServerPacket.field3284 == var1.serverPacket) { // L: 6980
					class310.updatePlayers(var3, var1.serverPacketLength); // L: 6981
					GameObject.method4866(); // L: 6982
					var1.serverPacket = null; // L: 6983
					return true; // L: 6984
				}

				if (ServerPacket.field3195 == var1.serverPacket) { // L: 6986
					class323.field3800 = true; // L: 6987
					class310.updatePlayers(var3, var1.serverPacketLength); // L: 6988
					GameObject.method4866(); // L: 6989
					var1.serverPacket = null; // L: 6990
					return true; // L: 6991
				}

				if (ServerPacket.field3199 == var1.serverPacket) { // L: 6993
					ClientPacket.updateNpcs(true, var3); // L: 6994
					var1.serverPacket = null; // L: 6995
					return true; // L: 6996
				}

				if (ServerPacket.field3231 == var1.serverPacket) { // L: 6998
					class288.privateChatMode = class189.method3719(var3.readUnsignedByte()); // L: 6999
					var1.serverPacket = null; // L: 7000
					return true; // L: 7001
				}

				if (ServerPacket.field3271 == var1.serverPacket) { // L: 7003
					var3.offset += 28; // L: 7004
					if (var3.checkCrc()) { // L: 7005
						class10.method95(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 7006
					return true; // L: 7007
				}

				if (ServerPacket.field3260 == var1.serverPacket) { // L: 7009
					World var55 = new World(); // L: 7010
					var55.host = var3.readStringCp1252NullTerminated(); // L: 7011
					var55.id = var3.readUnsignedShort(); // L: 7012
					var5 = var3.readInt(); // L: 7013
					var55.properties = var5; // L: 7014
					class246.method5251(45); // L: 7015
					var2.close(); // L: 7016
					var2 = null; // L: 7017
					VarbitComposition.changeWorld(var55); // L: 7018
					var1.serverPacket = null; // L: 7019
					return false; // L: 7020
				}

				if (ServerPacket.field3279 == var1.serverPacket) { // L: 7022
					var20 = var3.method8730(); // L: 7023
					var5 = var3.readInt(); // L: 7024
					var53 = class133.getWidget(var5); // L: 7025
					if (var53.modelType != 1 || var20 != var53.modelId) { // L: 7026
						var53.modelType = 1; // L: 7027
						var53.modelId = var20; // L: 7028
						LoginScreenAnimation.invalidateWidget(var53); // L: 7029
					}

					var1.serverPacket = null; // L: 7031
					return true; // L: 7032
				}

				if (ServerPacket.field3214 == var1.serverPacket) { // L: 7034
					HealthBarDefinition.logOut(); // L: 7035
					var1.serverPacket = null; // L: 7036
					return false; // L: 7037
				}

				if (ServerPacket.field3248 == var1.serverPacket) { // L: 7039
					var1.serverPacket = null; // L: 7040
					return true; // L: 7041
				}

				if (ServerPacket.field3297 == var1.serverPacket) { // L: 7043
					class25.field147 = var3.method8677(); // L: 7044
					class373.field4406 = var3.method8677(); // L: 7045

					while (var3.offset < var1.serverPacketLength) { // L: 7046
						var20 = var3.readUnsignedByte(); // L: 7047
						class280 var82 = class27.method424()[var20]; // L: 7048
						Decimator.method1123(var82); // L: 7049
					}

					var1.serverPacket = null; // L: 7051
					return true; // L: 7052
				}

				if (ServerPacket.field3220 == var1.serverPacket) { // L: 7054
					var20 = var3.method8730(); // L: 7055
					short var72 = (short)var3.method8688(); // L: 7056
					var21 = var3.method8677(); // L: 7057
					var7 = var3.method8700(); // L: 7058
					NPC var57 = npcs[var20]; // L: 7059
					if (var57 != null) { // L: 7060
						var57.method2623(var21, var7, var72); // L: 7061
					}

					var1.serverPacket = null; // L: 7063
					return true; // L: 7064
				}

				if (ServerPacket.field3237 == var1.serverPacket) { // L: 7066
					isCameraLocked = true; // L: 7067
					field767 = false; // L: 7068
					WorldMapData_0.field2806 = var3.readUnsignedByte() * 128; // L: 7069
					Players.field1352 = var3.readUnsignedByte() * 128; // L: 7070
					FloorOverlayDefinition.field2266 = var3.readUnsignedShort(); // L: 7071
					Message.field485 = var3.readUnsignedByte(); // L: 7072
					AttackOption.field1320 = var3.readUnsignedByte(); // L: 7073
					if (AttackOption.field1320 >= 100) { // L: 7074
						var20 = WorldMapData_0.field2806 * 16384 + 64; // L: 7075
						var5 = Players.field1352 * 16384 + 64; // L: 7076
						var21 = GrandExchangeOfferNameComparator.getTileHeight(var20, var5, class103.Client_plane) - FloorOverlayDefinition.field2266; // L: 7077
						var7 = var20 - ClanSettings.cameraX; // L: 7078
						var23 = var21 - UserComparator10.cameraY; // L: 7079
						var9 = var5 - class366.cameraZ; // L: 7080
						var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9)); // L: 7081
						class103.cameraPitch = (int)(Math.atan2((double)var23, (double)var10) * 325.9490051269531D) & 2047; // L: 7082
						class285.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047; // L: 7083
						if (class103.cameraPitch < 128) { // L: 7084
							class103.cameraPitch = 128;
						}

						if (class103.cameraPitch > 383) { // L: 7085
							class103.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 7087
					return true; // L: 7088
				}

				if (ServerPacket.field3244 == var1.serverPacket) { // L: 7090
					SoundCache.method861(); // L: 7091
					var84 = var3.readByte(); // L: 7092
					if (var1.serverPacketLength == 1) { // L: 7093
						if (var84 >= 0) { // L: 7094
							currentClanSettings[var84] = null;
						} else {
							DynamicObject.guestClanSettings = null; // L: 7095
						}

						var1.serverPacket = null; // L: 7096
						return true; // L: 7097
					}

					if (var84 >= 0) { // L: 7099
						currentClanSettings[var84] = new ClanSettings(var3); // L: 7100
					} else {
						DynamicObject.guestClanSettings = new ClanSettings(var3); // L: 7103
					}

					var1.serverPacket = null; // L: 7105
					return true; // L: 7106
				}

				if (ServerPacket.field3197 == var1.serverPacket) { // L: 7108
					class123.method3032(); // L: 7109
					weight = var3.readShort(); // L: 7110
					field761 = cycleCntr; // L: 7111
					var1.serverPacket = null; // L: 7112
					return true; // L: 7113
				}

				if (ServerPacket.field3281 == var1.serverPacket) { // L: 7115
					if (rootInterface != -1) { // L: 7116
						class147.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 7117
					return true; // L: 7118
				}

				if (ServerPacket.field3216 == var1.serverPacket) { // L: 7120
					var20 = var3.method8698(); // L: 7121
					var5 = var3.method8688(); // L: 7122
					var21 = var3.method8688(); // L: 7123
					var76 = class133.getWidget(var20); // L: 7124
					if (var5 != var76.rawX || var21 != var76.rawY || var76.xAlignment != 0 || var76.yAlignment != 0) { // L: 7125
						var76.rawX = var5; // L: 7126
						var76.rawY = var21; // L: 7127
						var76.xAlignment = 0; // L: 7128
						var76.yAlignment = 0; // L: 7129
						LoginScreenAnimation.invalidateWidget(var76); // L: 7130
						this.alignWidget(var76); // L: 7131
						if (var76.type == 0) { // L: 7132
							AbstractWorldMapData.revalidateWidgetScroll(WorldMapLabel.Widget_interfaceComponents[var20 >> 16], var76, false);
						}
					}

					var1.serverPacket = null; // L: 7134
					return true; // L: 7135
				}

				if (ServerPacket.field3213 == var1.serverPacket) { // L: 7137
					return this.method1770(var1, 2); // L: 7138
				}

				if (ServerPacket.field3276 == var1.serverPacket) { // L: 7140
					minimapState = var3.readUnsignedByte(); // L: 7141
					var1.serverPacket = null; // L: 7142
					return true; // L: 7143
				}

				if (ServerPacket.field3289 == var1.serverPacket) { // L: 7145
					var20 = var3.method8730(); // L: 7146
					byte var71 = var3.method8679(); // L: 7147
					Varps.Varps_temp[var20] = var71; // L: 7148
					if (Varps.Varps_main[var20] != var71) { // L: 7149
						Varps.Varps_main[var20] = var71; // L: 7150
					}

					ReflectionCheck.changeGameOptions(var20); // L: 7152
					field700[++field504 - 1 & 31] = var20; // L: 7153
					var1.serverPacket = null; // L: 7154
					return true; // L: 7155
				}

				if (ServerPacket.field3265 == var1.serverPacket) { // L: 7157
					WorldMapElement.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 7158
					field709 = cycleCntr; // L: 7159
					var1.serverPacket = null; // L: 7160
					return true; // L: 7161
				}

				if (ServerPacket.field3212 == var1.serverPacket) { // L: 7163
					class189.method3718(var3.readStringCp1252NullTerminated()); // L: 7164
					var1.serverPacket = null; // L: 7165
					return true; // L: 7166
				}

				if (ServerPacket.field3198 == var1.serverPacket) { // L: 7168
					Decimator.method1123(class280.field3183); // L: 7169
					var1.serverPacket = null; // L: 7170
					return true; // L: 7171
				}

				if (ServerPacket.field3278 == var1.serverPacket) { // L: 7173
					var50 = var3.readStringCp1252NullTerminated(); // L: 7174
					var24 = AbstractFont.escapeBrackets(ParamComposition.method3842(class163.method3398(var3))); // L: 7175
					class280.addGameMessage(6, var50, var24); // L: 7176
					var1.serverPacket = null; // L: 7177
					return true; // L: 7178
				}

				if (ServerPacket.field3241 == var1.serverPacket) { // L: 7180
					var20 = var3.readUnsignedByte(); // L: 7181
					UrlRequest.method2899(var20); // L: 7182
					var1.serverPacket = null; // L: 7183
					return true; // L: 7184
				}

				if (ServerPacket.field3277 == var1.serverPacket) { // L: 7186
					var93 = var3.readBoolean(); // L: 7187
					if (var93) { // L: 7188
						if (class136.field1633 == null) { // L: 7189
							class136.field1633 = new class347();
						}
					} else {
						class136.field1633 = null; // L: 7191
					}

					var1.serverPacket = null; // L: 7192
					return true; // L: 7193
				}

				if (ServerPacket.field3222 == var1.serverPacket) { // L: 7195
					class277.loadRegions(true, var1.packetBuffer); // L: 7196
					var1.serverPacket = null; // L: 7197
					return true; // L: 7198
				}

				if (ServerPacket.field3296 == var1.serverPacket) { // L: 7200
					var20 = var3.readUnsignedShort(); // L: 7201
					if (var20 == 65535) { // L: 7202
						var20 = -1;
					}

					SpriteMask.playSong(var20); // L: 7203
					var1.serverPacket = null; // L: 7204
					return true; // L: 7205
				}

				if (ServerPacket.field3242 == var1.serverPacket) { // L: 7207
					var20 = var3.readMedium(); // L: 7208
					var5 = var3.method8730(); // L: 7209
					if (var5 == 65535) { // L: 7210
						var5 = -1;
					}

					ScriptEvent.method2321(var5, var20); // L: 7211
					var1.serverPacket = null; // L: 7212
					return true; // L: 7213
				}

				long var37;
				long var39;
				String var44;
				if (ServerPacket.field3217 == var1.serverPacket) { // L: 7215
					var50 = var3.readStringCp1252NullTerminated(); // L: 7216
					var37 = (long)var3.readUnsignedShort(); // L: 7217
					var39 = (long)var3.readMedium(); // L: 7218
					PlayerType var41 = (PlayerType)class4.findEnumerated(ArchiveLoader.PlayerType_values(), var3.readUnsignedByte()); // L: 7219
					long var42 = var39 + (var37 << 32); // L: 7220
					boolean var63 = false; // L: 7221

					for (var13 = 0; var13 < 100; ++var13) { // L: 7222
						if (var42 == crossWorldMessageIds[var13]) { // L: 7223
							var63 = true; // L: 7224
							break; // L: 7225
						}
					}

					if (WorldMapElement.friendSystem.isIgnored(new Username(var50, WorldMapCacheName.loginType))) { // L: 7228
						var63 = true;
					}

					if (!var63 && field626 == 0) { // L: 7229
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var42; // L: 7230
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 7231
						var44 = AbstractFont.escapeBrackets(ParamComposition.method3842(class163.method3398(var3))); // L: 7232
						byte var70;
						if (var41.isPrivileged) { // L: 7234
							var70 = 7;
						} else {
							var70 = 3; // L: 7235
						}

						if (var41.modIcon != -1) { // L: 7236
							class280.addGameMessage(var70, ObjectSound.method1919(var41.modIcon) + var50, var44);
						} else {
							class280.addGameMessage(var70, var50, var44); // L: 7237
						}
					}

					var1.serverPacket = null; // L: 7239
					return true; // L: 7240
				}

				if (ServerPacket.field3254 == var1.serverPacket) { // L: 7242
					var20 = var3.readUnsignedShort(); // L: 7247
					var75 = npcs[var20]; // L: 7248
					var21 = var3.method8719(); // L: 7249
					var5 = var3.method8699(); // L: 7250
					if (var75 != null) { // L: 7251
						var75.spotAnimation = var21; // L: 7252
						var75.field1210 = var5 >> 16; // L: 7253
						var75.field1207 = (var5 & 65535) + cycle; // L: 7254
						var75.spotAnimationFrame = 0; // L: 7255
						var75.field1208 = 0; // L: 7256
						if (var75.field1207 > cycle) { // L: 7257
							var75.spotAnimationFrame = -1; // L: 7258
						}

						if (var75.spotAnimation == 65535) { // L: 7260
							var75.spotAnimation = -1; // L: 7261
						}
					}

					var1.serverPacket = null; // L: 7264
					return true; // L: 7265
				}

				if (ServerPacket.field3240 == var1.serverPacket) { // L: 7267
					var20 = var3.method8719(); // L: 7268
					rootInterface = var20; // L: 7269
					this.resizeRoot(false); // L: 7270
					class155.Widget_resetModelFrames(var20); // L: 7271
					SoundCache.runWidgetOnLoadListener(rootInterface); // L: 7272

					for (var5 = 0; var5 < 100; ++var5) { // L: 7273
						field725[var5] = true;
					}

					var1.serverPacket = null; // L: 7274
					return true; // L: 7275
				}

				if (ServerPacket.field3275 == var1.serverPacket) { // L: 7277
					var50 = var3.readStringCp1252NullTerminated(); // L: 7278
					var5 = var3.method8699(); // L: 7279
					var53 = class133.getWidget(var5); // L: 7280
					if (!var50.equals(var53.text)) { // L: 7281
						var53.text = var50; // L: 7282
						LoginScreenAnimation.invalidateWidget(var53); // L: 7283
					}

					var1.serverPacket = null; // L: 7285
					return true; // L: 7286
				}

				Widget var81;
				if (ServerPacket.field3246 == var1.serverPacket) { // L: 7288
					var20 = var3.method8699(); // L: 7289
					var81 = class133.getWidget(var20); // L: 7290

					for (var21 = 0; var21 < var81.itemIds.length; ++var21) { // L: 7291
						var81.itemIds[var21] = -1; // L: 7292
						var81.itemIds[var21] = 0; // L: 7293
					}

					LoginScreenAnimation.invalidateWidget(var81); // L: 7295
					var1.serverPacket = null; // L: 7296
					return true; // L: 7297
				}

				if (ServerPacket.field3193 == var1.serverPacket) { // L: 7299
					Decimator.method1123(class280.field3171); // L: 7300
					var1.serverPacket = null; // L: 7301
					return true; // L: 7302
				}

				if (ServerPacket.field3194 == var1.serverPacket) { // L: 7304
					var20 = var3.method8700(); // L: 7305
					var81 = class133.getWidget(var20); // L: 7306
					var81.modelType = 3; // L: 7307
					var81.modelId = class387.localPlayer.appearance.getChatHeadId(); // L: 7308
					LoginScreenAnimation.invalidateWidget(var81); // L: 7309
					var1.serverPacket = null; // L: 7310
					return true; // L: 7311
				}

				long var45;
				if (ServerPacket.field3262 == var1.serverPacket) { // L: 7313
					var50 = var3.readStringCp1252NullTerminated(); // L: 7314
					var37 = var3.readLong(); // L: 7315
					var39 = (long)var3.readUnsignedShort(); // L: 7316
					var45 = (long)var3.readMedium(); // L: 7317
					PlayerType var95 = (PlayerType)class4.findEnumerated(ArchiveLoader.PlayerType_values(), var3.readUnsignedByte()); // L: 7318
					var34 = var45 + (var39 << 32); // L: 7319
					boolean var67 = false; // L: 7320

					for (var15 = 0; var15 < 100; ++var15) { // L: 7321
						if (var34 == crossWorldMessageIds[var15]) { // L: 7322
							var67 = true; // L: 7323
							break; // L: 7324
						}
					}

					if (var95.isUser && WorldMapElement.friendSystem.isIgnored(new Username(var50, WorldMapCacheName.loginType))) { // L: 7327 7328
						var67 = true;
					}

					if (!var67 && field626 == 0) { // L: 7330
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var34; // L: 7331
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 7332
						var33 = AbstractFont.escapeBrackets(ParamComposition.method3842(class163.method3398(var3))); // L: 7333
						if (var95.modIcon != -1) { // L: 7334
							class134.addChatMessage(9, ObjectSound.method1919(var95.modIcon) + var50, var33, WorldMapSection1.base37DecodeLong(var37));
						} else {
							class134.addChatMessage(9, var50, var33, WorldMapSection1.base37DecodeLong(var37)); // L: 7335
						}
					}

					var1.serverPacket = null; // L: 7337
					return true; // L: 7338
				}

				if (ServerPacket.field3226 == var1.serverPacket) { // L: 7340
					var20 = var3.readUnsignedByte(); // L: 7341
					FaceNormal.forceDisconnect(var20); // L: 7342
					var1.serverPacket = null; // L: 7343
					return false; // L: 7344
				}

				if (ServerPacket.field3300 == var1.serverPacket) { // L: 7346
					WorldMapElement.friendSystem.method1856(); // L: 7347
					field709 = cycleCntr; // L: 7348
					var1.serverPacket = null; // L: 7349
					return true; // L: 7350
				}

				if (ServerPacket.field3215 == var1.serverPacket) { // L: 7352
					Decimator.method1123(class280.field3176); // L: 7353
					var1.serverPacket = null; // L: 7354
					return true; // L: 7355
				}

				Widget var8;
				if (ServerPacket.field3258 == var1.serverPacket) { // L: 7357
					var20 = var3.method8719(); // L: 7358
					var5 = var3.method8698(); // L: 7359
					var21 = var3.method8730(); // L: 7360
					var7 = var3.readUnsignedShort(); // L: 7361
					var8 = class133.getWidget(var5); // L: 7362
					if (var20 != var8.modelAngleX || var21 != var8.modelAngleY || var7 != var8.modelZoom) { // L: 7363
						var8.modelAngleX = var20; // L: 7364
						var8.modelAngleY = var21; // L: 7365
						var8.modelZoom = var7; // L: 7366
						LoginScreenAnimation.invalidateWidget(var8); // L: 7367
					}

					var1.serverPacket = null; // L: 7369
					return true; // L: 7370
				}

				if (ServerPacket.field3207 == var1.serverPacket) { // L: 7372
					class147.readReflectionCheck(var3, var1.serverPacketLength); // L: 7373
					var1.serverPacket = null; // L: 7374
					return true; // L: 7375
				}

				if (ServerPacket.field3255 == var1.serverPacket) { // L: 7377
					ServerPacket.field3307 = true; // L: 7378
					ClientPacket.updateNpcs(true, var3); // L: 7379
					var1.serverPacket = null; // L: 7380
					return true; // L: 7381
				}

				if (ServerPacket.field3229 == var1.serverPacket) { // L: 7383
					class123.method3032(); // L: 7384
					var20 = var3.method8678(); // L: 7385
					var5 = var3.method8678(); // L: 7386
					var21 = var3.method8700(); // L: 7387
					experience[var5] = var21; // L: 7388
					currentLevels[var5] = var20; // L: 7389
					levels[var5] = 1; // L: 7390

					for (var7 = 0; var7 < 98; ++var7) { // L: 7391
						if (var21 >= Skills.Skills_experienceTable[var7]) {
							levels[var5] = var7 + 2;
						}
					}

					field704[++field705 - 1 & 31] = var5; // L: 7392
					var1.serverPacket = null; // L: 7393
					return true; // L: 7394
				}

				if (ServerPacket.field3263 == var1.serverPacket) { // L: 7396
					var20 = var3.method8714(); // L: 7397
					var5 = var3.method8676(); // L: 7398
					var21 = var3.method8700(); // L: 7399
					var74 = (InterfaceParent)interfaceParents.get((long)var21); // L: 7400
					if (var74 != null) { // L: 7401
						class10.closeInterface(var74, var20 != var74.group);
					}

					ModeWhere.method6788(var21, var20, var5); // L: 7402
					var1.serverPacket = null; // L: 7403
					return true; // L: 7404
				}

				if (ServerPacket.field3218 == var1.serverPacket) { // L: 7406
					var20 = var3.readUnsignedShort(); // L: 7407
					var5 = var3.method8698(); // L: 7408
					Varps.Varps_temp[var20] = var5; // L: 7409
					if (Varps.Varps_main[var20] != var5) { // L: 7410
						Varps.Varps_main[var20] = var5; // L: 7411
					}

					ReflectionCheck.changeGameOptions(var20); // L: 7413
					field700[++field504 - 1 & 31] = var20; // L: 7414
					var1.serverPacket = null; // L: 7415
					return true; // L: 7416
				}

				if (ServerPacket.field3236 == var1.serverPacket) { // L: 7418
					var20 = var3.readInt(); // L: 7419
					var5 = var3.readUnsignedShort(); // L: 7420
					if (var20 < -70000) { // L: 7421
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 7423
						var53 = class133.getWidget(var20);
					} else {
						var53 = null; // L: 7424
					}

					if (var53 != null) { // L: 7425
						for (var7 = 0; var7 < var53.itemIds.length; ++var7) { // L: 7426
							var53.itemIds[var7] = 0; // L: 7427
							var53.itemQuantities[var7] = 0; // L: 7428
						}
					}

					GrandExchangeOfferTotalQuantityComparator.clearItemContainer(var5); // L: 7431
					var7 = var3.readUnsignedShort(); // L: 7432

					for (var23 = 0; var23 < var7; ++var23) { // L: 7433
						var9 = var3.readUnsignedByte(); // L: 7434
						if (var9 == 255) { // L: 7435
							var9 = var3.readInt();
						}

						var10 = var3.method8730(); // L: 7436
						if (var53 != null && var23 < var53.itemIds.length) { // L: 7437 7438
							var53.itemIds[var23] = var10; // L: 7439
							var53.itemQuantities[var23] = var9; // L: 7440
						}

						CollisionMap.itemContainerSetItem(var5, var23, var10 - 1, var9); // L: 7443
					}

					if (var53 != null) { // L: 7445
						LoginScreenAnimation.invalidateWidget(var53);
					}

					class123.method3032(); // L: 7446
					field661[++field524 - 1 & 31] = var5 & 32767; // L: 7447
					var1.serverPacket = null; // L: 7448
					return true; // L: 7449
				}

				if (ServerPacket.field3221 == var1.serverPacket) { // L: 7451
					SoundCache.method861(); // L: 7452
					var84 = var3.readByte(); // L: 7453
					class142 var80 = new class142(var3); // L: 7454
					ClanSettings var58;
					if (var84 >= 0) { // L: 7456
						var58 = currentClanSettings[var84];
					} else {
						var58 = DynamicObject.guestClanSettings; // L: 7457
					}

					var80.method3169(var58); // L: 7458
					var1.serverPacket = null; // L: 7459
					return true; // L: 7460
				}

				if (ServerPacket.field3233 == var1.serverPacket) { // L: 7462
					Decimator.method1123(class280.field3179); // L: 7463
					var1.serverPacket = null; // L: 7464
					return true; // L: 7465
				}

				if (ServerPacket.field3234 == var1.serverPacket) { // L: 7467
					var20 = var3.readInt(); // L: 7468
					var5 = var3.readUnsignedShort(); // L: 7469
					if (var20 < -70000) { // L: 7470
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 7472
						var53 = class133.getWidget(var20);
					} else {
						var53 = null; // L: 7473
					}

					for (; var3.offset < var1.serverPacketLength; CollisionMap.itemContainerSetItem(var5, var7, var23 - 1, var9)) { // L: 7474 7488
						var7 = var3.readUShortSmart(); // L: 7475
						var23 = var3.readUnsignedShort(); // L: 7476
						var9 = 0; // L: 7477
						if (var23 != 0) { // L: 7478
							var9 = var3.readUnsignedByte(); // L: 7479
							if (var9 == 255) { // L: 7480
								var9 = var3.readInt();
							}
						}

						if (var53 != null && var7 >= 0 && var7 < var53.itemIds.length) { // L: 7482 7483
							var53.itemIds[var7] = var23; // L: 7484
							var53.itemQuantities[var7] = var9; // L: 7485
						}
					}

					if (var53 != null) { // L: 7490
						LoginScreenAnimation.invalidateWidget(var53);
					}

					class123.method3032(); // L: 7491
					field661[++field524 - 1 & 31] = var5 & 32767; // L: 7492
					var1.serverPacket = null; // L: 7493
					return true; // L: 7494
				}

				if (ServerPacket.field3252 == var1.serverPacket) { // L: 7496
					class123.method3032(); // L: 7497
					field496 = var3.readUnsignedShort(); // L: 7498
					field761 = cycleCntr; // L: 7499
					var1.serverPacket = null; // L: 7500
					return true; // L: 7501
				}

				if (ServerPacket.field3238 == var1.serverPacket) { // L: 7503
					var20 = var3.method8699(); // L: 7504
					var5 = var3.readUnsignedShort(); // L: 7505
					if (var5 == 65535) { // L: 7506
						var5 = -1;
					}

					var21 = var3.readInt(); // L: 7507
					var7 = var3.method8714(); // L: 7508
					if (var7 == 65535) { // L: 7509
						var7 = -1;
					}

					for (var23 = var7; var23 <= var5; ++var23) { // L: 7510
						var45 = ((long)var20 << 32) + (long)var23; // L: 7511
						Node var47 = widgetFlags.get(var45); // L: 7512
						if (var47 != null) { // L: 7513
							var47.remove();
						}

						widgetFlags.put(new IntegerNode(var21), var45); // L: 7514
					}

					var1.serverPacket = null; // L: 7516
					return true; // L: 7517
				}

				if (ServerPacket.field3304 == var1.serverPacket) { // L: 7519
					Decimator.method1123(class280.field3177); // L: 7520
					var1.serverPacket = null; // L: 7521
					return true; // L: 7522
				}

				if (ServerPacket.field3202 == var1.serverPacket) { // L: 7524
					Decimator.method1123(class280.field3180); // L: 7525
					var1.serverPacket = null; // L: 7526
					return true; // L: 7527
				}

				if (ServerPacket.field3290 == var1.serverPacket) { // L: 7529
					var21 = var3.method8843(); // L: 7540
					var20 = var21 >> 16; // L: 7541
					var5 = var21 >> 8 & 255; // L: 7542
					var7 = var20 + (var21 >> 4 & 7); // L: 7543
					var23 = var5 + (var21 & 7); // L: 7544
					var9 = var3.method8676(); // L: 7545
					var10 = var9 >> 2; // L: 7546
					var64 = var9 & 3; // L: 7547
					var12 = field573[var10]; // L: 7548
					var13 = var3.method8714(); // L: 7549
					if (var7 >= 0 && var23 >= 0 && var7 < 103 && var23 < 103) { // L: 7550
						if (var12 == 0) { // L: 7551
							WallObject var91 = WorldMapAreaData.scene.method4478(class103.Client_plane, var7, var23); // L: 7552
							if (var91 != null) { // L: 7553
								var15 = class124.Entity_unpackID(var91.tag); // L: 7554
								if (var10 == 2) { // L: 7555
									var91.renderable1 = new DynamicObject(var15, 2, var64 + 4, class103.Client_plane, var7, var23, var13, false, var91.renderable1); // L: 7556
									var91.renderable2 = new DynamicObject(var15, 2, var64 + 1 & 3, class103.Client_plane, var7, var23, var13, false, var91.renderable2); // L: 7557
								} else {
									var91.renderable1 = new DynamicObject(var15, var10, var64, class103.Client_plane, var7, var23, var13, false, var91.renderable1); // L: 7559
								}
							}
						} else if (var12 == 1) { // L: 7562
							DecorativeObject var90 = WorldMapAreaData.scene.method4479(class103.Client_plane, var7, var23); // L: 7563
							if (var90 != null) { // L: 7564
								var15 = class124.Entity_unpackID(var90.tag); // L: 7565
								if (var10 != 4 && var10 != 5) { // L: 7566
									if (var10 == 6) { // L: 7569
										var90.renderable1 = new DynamicObject(var15, 4, var64 + 4, class103.Client_plane, var7, var23, var13, false, var90.renderable1); // L: 7570
									} else if (var10 == 7) { // L: 7572
										var90.renderable1 = new DynamicObject(var15, 4, (var64 + 2 & 3) + 4, class103.Client_plane, var7, var23, var13, false, var90.renderable1); // L: 7573
									} else if (var10 == 8) { // L: 7575
										var90.renderable1 = new DynamicObject(var15, 4, var64 + 4, class103.Client_plane, var7, var23, var13, false, var90.renderable1); // L: 7576
										var90.renderable2 = new DynamicObject(var15, 4, (var64 + 2 & 3) + 4, class103.Client_plane, var7, var23, var13, false, var90.renderable2); // L: 7577
									}
								} else {
									var90.renderable1 = new DynamicObject(var15, 4, var64, class103.Client_plane, var7, var23, var13, false, var90.renderable1); // L: 7567
								}
							}
						} else if (var12 == 2) { // L: 7581
							var32 = WorldMapAreaData.scene.getGameObject(class103.Client_plane, var7, var23); // L: 7582
							if (var10 == 11) { // L: 7583
								var10 = 10; // L: 7584
							}

							if (var32 != null) { // L: 7586
								var32.renderable = new DynamicObject(class124.Entity_unpackID(var32.tag), var10, var64, class103.Client_plane, var7, var23, var13, false, var32.renderable); // L: 7587
							}
						} else if (var12 == 3) { // L: 7590
							GroundObject var89 = WorldMapAreaData.scene.getGroundObject(class103.Client_plane, var7, var23); // L: 7591
							if (var89 != null) { // L: 7592
								var89.renderable = new DynamicObject(class124.Entity_unpackID(var89.tag), 22, var64, class103.Client_plane, var7, var23, var13, false, var89.renderable); // L: 7593
							}
						}
					}

					var1.serverPacket = null; // L: 7597
					return true; // L: 7598
				}

				if (ServerPacket.field3280 == var1.serverPacket) { // L: 7600
					var20 = var3.method8688(); // L: 7601
					var5 = var3.method8699(); // L: 7602
					var53 = class133.getWidget(var5); // L: 7603
					if (var20 != var53.sequenceId || var20 == -1) { // L: 7604
						var53.sequenceId = var20; // L: 7605
						var53.modelFrame = 0; // L: 7606
						var53.modelFrameCycle = 0; // L: 7607
						LoginScreenAnimation.invalidateWidget(var53); // L: 7608
					}

					var1.serverPacket = null; // L: 7610
					return true; // L: 7611
				}

				if (ServerPacket.field3266 == var1.serverPacket) { // L: 7613
					var84 = var3.readByte(); // L: 7614
					var37 = (long)var3.readUnsignedShort(); // L: 7615
					var39 = (long)var3.readMedium(); // L: 7616
					var45 = var39 + (var37 << 32); // L: 7617
					boolean var11 = false; // L: 7618
					ClanChannel var36 = var84 >= 0 ? currentClanChannels[var84] : class482.guestClanChannel; // L: 7619
					if (var36 == null) { // L: 7620
						var11 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 7622
							if (var45 == crossWorldMessageIds[var13]) { // L: 7623
								var11 = true; // L: 7624
								break; // L: 7625
							}
						}
					}

					if (!var11) { // L: 7629
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var45; // L: 7630
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 7631
						var44 = class163.method3398(var3); // L: 7632
						var14 = var84 >= 0 ? 43 : 46; // L: 7633
						class134.addChatMessage(var14, "", var44, var36.name); // L: 7634
					}

					var1.serverPacket = null; // L: 7636
					return true; // L: 7637
				}

				if (ServerPacket.field3250 == var1.serverPacket) { // L: 7639
					var20 = var3.method8700(); // L: 7640
					var5 = var3.method8714(); // L: 7641
					var21 = var5 >> 10 & 31; // L: 7642
					var7 = var5 >> 5 & 31; // L: 7643
					var23 = var5 & 31; // L: 7644
					var9 = (var7 << 11) + (var21 << 19) + (var23 << 3); // L: 7645
					Widget var29 = class133.getWidget(var20); // L: 7646
					if (var9 != var29.color) { // L: 7647
						var29.color = var9; // L: 7648
						LoginScreenAnimation.invalidateWidget(var29); // L: 7649
					}

					var1.serverPacket = null; // L: 7651
					return true; // L: 7652
				}

				if (ServerPacket.field3192 == var1.serverPacket) { // L: 7654
					WorldMapElement.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 7655
					FontName.FriendSystem_invalidateIgnoreds(); // L: 7656
					field709 = cycleCntr; // L: 7657
					var1.serverPacket = null; // L: 7658
					return true; // L: 7659
				}

				if (ServerPacket.field3292 == var1.serverPacket) { // L: 7661
					var20 = var3.method8714(); // L: 7662
					var5 = var3.method8700(); // L: 7663
					var53 = class133.getWidget(var5); // L: 7664
					if (var53 != null && var53.type == 0) { // L: 7665
						if (var20 > var53.scrollHeight - var53.height) { // L: 7666
							var20 = var53.scrollHeight - var53.height;
						}

						if (var20 < 0) { // L: 7667
							var20 = 0;
						}

						if (var20 != var53.scrollY) { // L: 7668
							var53.scrollY = var20; // L: 7669
							LoginScreenAnimation.invalidateWidget(var53); // L: 7670
						}
					}

					var1.serverPacket = null; // L: 7673
					return true; // L: 7674
				}

				if (ServerPacket.field3295 == var1.serverPacket && isCameraLocked) { // L: 7676 7677
					field767 = true; // L: 7678
					ModeWhere.field4340 = var3.readUnsignedByte(); // L: 7679
					UserComparator7.field1444 = var3.readUnsignedByte(); // L: 7680
					Message.field485 = var3.readUnsignedByte(); // L: 7681
					AttackOption.field1320 = var3.readUnsignedByte(); // L: 7682

					for (var20 = 0; var20 < 5; ++var20) { // L: 7683
						field569[var20] = false;
					}

					var1.serverPacket = null; // L: 7684
					return true; // L: 7685
				}

				if (ServerPacket.field3273 == var1.serverPacket) { // L: 7688
					class388.field4512 = new class421(class208.Ignored_cached); // L: 7689
					var1.serverPacket = null; // L: 7690
					return true; // L: 7691
				}

				if (ServerPacket.field3223 == var1.serverPacket) { // L: 7693
					Decimator.method1123(class280.field3181); // L: 7694
					var1.serverPacket = null; // L: 7695
					return true; // L: 7696
				}

				if (ServerPacket.field3282 == var1.serverPacket) { // L: 7698
					byte[] var52 = new byte[var1.serverPacketLength]; // L: 7699
					var3.method8595(var52, 0, var52.length); // L: 7700
					Buffer var79 = new Buffer(var52); // L: 7701
					var54 = var79.readStringCp1252NullTerminated(); // L: 7702
					AttackOption.openURL(var54, true, false); // L: 7703
					var1.serverPacket = null; // L: 7704
					return true; // L: 7705
				}

				if (ServerPacket.field3269 == var1.serverPacket) { // L: 7707
					var20 = var3.method8699(); // L: 7708
					var5 = var3.readUnsignedShort(); // L: 7709
					var53 = class133.getWidget(var20); // L: 7710
					if (var53.modelType != 6 || var5 != var53.modelId) { // L: 7711
						var53.modelType = 6; // L: 7712
						var53.modelId = var5; // L: 7713
						LoginScreenAnimation.invalidateWidget(var53); // L: 7714
					}

					var1.serverPacket = null; // L: 7716
					return true; // L: 7717
				}

				if (ServerPacket.field3302 == var1.serverPacket) { // L: 7719
					var20 = var3.method8700(); // L: 7720
					var5 = var3.method8699(); // L: 7721
					InterfaceParent var6 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7722
					var74 = (InterfaceParent)interfaceParents.get((long)var5); // L: 7723
					if (var74 != null) { // L: 7724
						class10.closeInterface(var74, var6 == null || var6.group != var74.group);
					}

					if (var6 != null) { // L: 7725
						var6.remove(); // L: 7726
						interfaceParents.put(var6, (long)var5); // L: 7727
					}

					var8 = class133.getWidget(var20); // L: 7729
					if (var8 != null) { // L: 7730
						LoginScreenAnimation.invalidateWidget(var8);
					}

					var8 = class133.getWidget(var5); // L: 7731
					if (var8 != null) { // L: 7732
						LoginScreenAnimation.invalidateWidget(var8); // L: 7733
						AbstractWorldMapData.revalidateWidgetScroll(WorldMapLabel.Widget_interfaceComponents[var8.id >>> 16], var8, true); // L: 7734
					}

					if (rootInterface != -1) { // L: 7736
						class147.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 7737
					return true; // L: 7738
				}

				if (ServerPacket.field3206 == var1.serverPacket) { // L: 7740
					Decimator.method1123(class280.field3174); // L: 7741
					var1.serverPacket = null; // L: 7742
					return true; // L: 7743
				}

				if (ServerPacket.field3274 == var1.serverPacket) { // L: 7745
					tradeChatMode = var3.method8676(); // L: 7746
					publicChatMode = var3.method8677(); // L: 7747
					var1.serverPacket = null; // L: 7748
					return true; // L: 7749
				}

				if (ServerPacket.field3201 == var1.serverPacket) { // L: 7751
					ServerPacket.field3307 = true; // L: 7752
					ClientPacket.updateNpcs(false, var3); // L: 7753
					var1.serverPacket = null; // L: 7754
					return true; // L: 7755
				}

				if (ServerPacket.field3243 == var1.serverPacket) { // L: 7757
					rebootTimer = var3.method8730() * 30; // L: 7758
					field761 = cycleCntr; // L: 7759
					var1.serverPacket = null; // L: 7760
					return true; // L: 7761
				}

				if (ServerPacket.field3245 == var1.serverPacket) { // L: 7763
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) { // L: 7764
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) { // L: 7765
							Varps.Varps_main[var20] = Varps.Varps_temp[var20]; // L: 7766
							ReflectionCheck.changeGameOptions(var20); // L: 7767
							field700[++field504 - 1 & 31] = var20; // L: 7768
						}
					}

					var1.serverPacket = null; // L: 7771
					return true; // L: 7772
				}

				if (ServerPacket.field3299 == var1.serverPacket) { // L: 7774
					Decimator.method1123(class280.field3173); // L: 7775
					var1.serverPacket = null; // L: 7776
					return true; // L: 7777
				}

				if (ServerPacket.field3204 == var1.serverPacket) { // L: 7779
					class373.field4406 = var3.method8676(); // L: 7780
					class25.field147 = var3.readUnsignedByte(); // L: 7781

					for (var20 = class373.field4406; var20 < class373.field4406 + 8; ++var20) { // L: 7782
						for (var5 = class25.field147; var5 < class25.field147 + 8; ++var5) { // L: 7783
							if (groundItems[class103.Client_plane][var20][var5] != null) { // L: 7784
								groundItems[class103.Client_plane][var20][var5] = null; // L: 7785
								ClientPacket.updateItemPile(var20, var5); // L: 7786
							}
						}
					}

					for (PendingSpawn var51 = (PendingSpawn)pendingSpawns.last(); var51 != null; var51 = (PendingSpawn)pendingSpawns.previous()) { // L: 7790 7791 7793
						if (var51.x >= class373.field4406 && var51.x < class373.field4406 + 8 && var51.y >= class25.field147 && var51.y < class25.field147 + 8 && var51.plane == class103.Client_plane) { // L: 7792
							var51.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 7795
					return true; // L: 7796
				}

				if (ServerPacket.field3305 == var1.serverPacket) { // L: 7798
					for (var20 = 0; var20 < VarpDefinition.field1927; ++var20) { // L: 7799
						VarpDefinition var78 = TaskHandler.VarpDefinition_get(var20); // L: 7800
						if (var78 != null) { // L: 7801
							Varps.Varps_temp[var20] = 0; // L: 7802
							Varps.Varps_main[var20] = 0; // L: 7803
						}
					}

					class123.method3032(); // L: 7806
					field504 += 32; // L: 7807
					var1.serverPacket = null; // L: 7808
					return true; // L: 7809
				}

				if (ServerPacket.field3208 == var1.serverPacket) { // L: 7811
					var20 = var3.readUnsignedByte(); // L: 7812
					var5 = var3.readUnsignedByte(); // L: 7813
					var21 = var3.readUnsignedByte(); // L: 7814
					var7 = var3.readUnsignedByte(); // L: 7815
					field569[var20] = true; // L: 7816
					field769[var20] = var5; // L: 7817
					field525[var20] = var21; // L: 7818
					field771[var20] = var7; // L: 7819
					field772[var20] = 0; // L: 7820
					var1.serverPacket = null; // L: 7821
					return true; // L: 7822
				}

				if (ServerPacket.field3270 == var1.serverPacket) { // L: 7824
					hintArrowType = var3.readUnsignedByte(); // L: 7825
					if (hintArrowType == 1) { // L: 7826
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 7827
						if (hintArrowType == 2) { // L: 7828
							field762 = 4096; // L: 7829
							field703 = 4096; // L: 7830
						}

						if (hintArrowType == 3) { // L: 7832
							field762 = 0; // L: 7833
							field703 = 4096; // L: 7834
						}

						if (hintArrowType == 4) { // L: 7836
							field762 = 8192; // L: 7837
							field703 = 4096; // L: 7838
						}

						if (hintArrowType == 5) { // L: 7840
							field762 = 4096; // L: 7841
							field703 = 0; // L: 7842
						}

						if (hintArrowType == 6) { // L: 7844
							field762 = 4096; // L: 7845
							field703 = 8192; // L: 7846
						}

						hintArrowType = 2; // L: 7848
						hintArrowX = var3.readUnsignedShort(); // L: 7849
						hintArrowY = var3.readUnsignedShort(); // L: 7850
						field522 = var3.readUnsignedByte() * 4; // L: 7851
					}

					if (hintArrowType == 10) { // L: 7853
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 7854
					return true; // L: 7855
				}

				if (ServerPacket.field3253 == var1.serverPacket) { // L: 7857
					var50 = var3.readStringCp1252NullTerminated(); // L: 7858
					var5 = var3.method8677(); // L: 7859
					var21 = var3.method8678(); // L: 7860
					if (var21 >= 1 && var21 <= 8) { // L: 7861
						if (var50.equalsIgnoreCase("null")) { // L: 7862
							var50 = null;
						}

						playerMenuActions[var21 - 1] = var50; // L: 7863
						playerOptionsPriorities[var21 - 1] = var5 == 0; // L: 7864
					}

					var1.serverPacket = null; // L: 7866
					return true; // L: 7867
				}

				if (ServerPacket.field3293 == var1.serverPacket) { // L: 7869
					for (var20 = 0; var20 < players.length; ++var20) { // L: 7870
						if (players[var20] != null) { // L: 7871
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) { // L: 7873
						if (npcs[var20] != null) { // L: 7874
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 7876
					return true; // L: 7877
				}

				if (ServerPacket.field3261 == var1.serverPacket) { // L: 7879
					var20 = var3.readInt(); // L: 7880
					var5 = var3.readInt(); // L: 7881
					var21 = class287.getGcDuration(); // L: 7882
					PacketBufferNode var22 = Renderable.getPacketBufferNode(ClientPacket.field3071, packetWriter.isaacCipher); // L: 7884
					var22.packetBuffer.method8696(var20); // L: 7885
					var22.packetBuffer.method8846(var5); // L: 7886
					var22.packetBuffer.method8765(GameEngine.fps); // L: 7887
					var22.packetBuffer.writeByte(var21); // L: 7888
					packetWriter.addNode(var22); // L: 7889
					var1.serverPacket = null; // L: 7890
					return true; // L: 7891
				}

				class121.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1401 != null ? var1.field1401.id : -1) + "," + (var1.field1402 != null ? var1.field1402.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 7893
				HealthBarDefinition.logOut(); // L: 7894
			} catch (IOException var48) { // L: 7896
				WorldMapManager.method5197(); // L: 7897
			} catch (Exception var49) {
				var24 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1401 != null ? var1.field1401.id : -1) + "," + (var1.field1402 != null ? var1.field1402.id : -1) + "," + var1.serverPacketLength + "," + (class387.localPlayer.pathX[0] + ParamComposition.baseX * 64) + "," + (class387.localPlayer.pathY[0] + baseY * 64) + ","; // L: 7900

				for (var21 = 0; var21 < var1.serverPacketLength && var21 < 50; ++var21) { // L: 7901
					var24 = var24 + var3.array[var21] + ",";
				}

				class121.RunException_sendStackTrace(var24, var49); // L: 7902
				HealthBarDefinition.logOut(); // L: 7903
			}

			return true; // L: 7905
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-124"
	)
	@Export("menu")
	final void menu() {
		class127.method3082(); // L: 9277
		if (WorldMapLabelSize.dragInventoryWidget == null) { // L: 9278
			if (clickedWidget == null) { // L: 9279
				int var1 = MouseHandler.MouseHandler_lastButton; // L: 9280
				int var2;
				int var4;
				int var5;
				int var6;
				if (isMenuOpen) { // L: 9281
					int var3;
					if (var1 != 1 && (FriendsChatMember.mouseCam || var1 != 4)) { // L: 9282
						var2 = MouseHandler.MouseHandler_x; // L: 9283
						var3 = MouseHandler.MouseHandler_y; // L: 9284
						if (var2 < class130.menuX - 10 || var2 > class130.menuX + class7.menuWidth + 10 || var3 < ModeWhere.menuY - 10 || var3 > PlayerType.menuHeight + ModeWhere.menuY + 10) { // L: 9285
							isMenuOpen = false; // L: 9286
							Language.method6779(class130.menuX, ModeWhere.menuY, class7.menuWidth, PlayerType.menuHeight); // L: 9287
						}
					}

					if (var1 == 1 || !FriendsChatMember.mouseCam && var1 == 4) { // L: 9290
						var2 = class130.menuX; // L: 9291
						var3 = ModeWhere.menuY; // L: 9292
						var4 = class7.menuWidth; // L: 9293
						var5 = MouseHandler.MouseHandler_lastPressedX; // L: 9294
						var6 = MouseHandler.MouseHandler_lastPressedY; // L: 9295
						int var10 = -1; // L: 9296

						for (int var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 9297
							int var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 9298
							if (var5 > var2 && var5 < var2 + var4 && var6 > var9 - 13 && var6 < var9 + 3) { // L: 9299
								var10 = var8;
							}
						}

						if (var10 != -1) { // L: 9301
							GroundObject.method4313(var10);
						}

						isMenuOpen = false; // L: 9302
						Language.method6779(class130.menuX, ModeWhere.menuY, class7.menuWidth, PlayerType.menuHeight); // L: 9303
					}
				} else {
					var2 = menuOptionsCount - 1; // L: 9309
					if ((var1 == 1 || !FriendsChatMember.mouseCam && var1 == 4) && var2 >= 0) { // L: 9312
						var4 = menuOpcodes[var2]; // L: 9313
						if (var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) { // L: 9314
							var5 = menuArguments1[var2]; // L: 9315
							var6 = menuArguments2[var2]; // L: 9316
							Widget var7 = class133.getWidget(var6); // L: 9317
							if (ViewportMouse.method4813(class173.getWidgetFlags(var7)) || class16.method216(class173.getWidgetFlags(var7))) { // L: 9318
								if (WorldMapLabelSize.dragInventoryWidget != null && !field624 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 9319 9320
									Skills.method6427(draggedWidgetX, draggedWidgetY); // L: 9321
								}

								field624 = false; // L: 9324
								itemDragDuration = 0; // L: 9325
								if (WorldMapLabelSize.dragInventoryWidget != null) { // L: 9326
									LoginScreenAnimation.invalidateWidget(WorldMapLabelSize.dragInventoryWidget);
								}

								WorldMapLabelSize.dragInventoryWidget = class133.getWidget(var6); // L: 9327
								dragItemSlotSource = var5; // L: 9328
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 9329
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 9330
								if (var2 >= 0) { // L: 9331
									class33.method492(var2);
								}

								LoginScreenAnimation.invalidateWidget(WorldMapLabelSize.dragInventoryWidget); // L: 9332
								return; // L: 9333
							}
						}
					}

					if ((var1 == 1 || !FriendsChatMember.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) { // L: 9337 9338
						var1 = 2; // L: 9339
					}

					if ((var1 == 1 || !FriendsChatMember.mouseCam && var1 == 4) && menuOptionsCount > 0) { // L: 9342
						GroundObject.method4313(var2); // L: 9343
					}

					if (var1 == 2 && menuOptionsCount > 0) { // L: 9345
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}

			}
		}
	} // L: 9347

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1730699476"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1; // L: 9352
		return (field648 && menuOptionsCount > 2 || ArchiveDisk.method7839(var1)) && !menuShiftClick[var1]; // L: 9355
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "3638"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		class275.method5531(var1, var2); // L: 9359
		var1 -= viewportOffsetX; // L: 9360
		var2 -= viewportOffsetY; // L: 9361
		WorldMapAreaData.scene.menuOpen(class103.Client_plane, var1, var2, false); // L: 9362
		isMenuOpen = true; // L: 9363
	} // L: 9364

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1196271761"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface; // L: 11411
		int var3 = GameEngine.canvasWidth; // L: 11412
		int var4 = class127.canvasHeight; // L: 11413
		if (class153.loadInterface(var2)) { // L: 11415
			class374.resizeInterface(WorldMapLabel.Widget_interfaceComponents[var2], -1, var3, var4, var1); // L: 11416
		}

	} // L: 11418

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)V",
		garbageValue = "-2114785008"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class133.getWidget(var1.parentId); // L: 11421
		int var3;
		int var4;
		if (var2 == null) { // L: 11424
			var3 = GameEngine.canvasWidth; // L: 11425
			var4 = class127.canvasHeight; // L: 11426
		} else {
			var3 = var2.width; // L: 11429
			var4 = var2.height; // L: 11430
		}

		alignWidgetSize(var1, var3, var4, false); // L: 11432
		alignWidgetPosition(var1, var3, var4); // L: 11433
	} // L: 11434

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "839046279"
	)
	final void method1730() {
		LoginScreenAnimation.invalidateWidget(clickedWidget); // L: 12474
		++class27.widgetDragDuration; // L: 12475
		if (field695 && field692) { // L: 12476
			int var1 = MouseHandler.MouseHandler_x; // L: 12485
			int var2 = MouseHandler.MouseHandler_y; // L: 12486
			var1 -= widgetClickX; // L: 12487
			var2 -= widgetClickY; // L: 12488
			if (var1 < field795) { // L: 12489
				var1 = field795;
			}

			if (var1 + clickedWidget.width > field795 + clickedWidgetParent.width) { // L: 12490
				var1 = field795 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field803) { // L: 12491
				var2 = field803;
			}

			if (var2 + clickedWidget.height > field803 + clickedWidgetParent.height) { // L: 12492
				var2 = field803 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field735; // L: 12493
			int var4 = var2 - field554; // L: 12494
			int var5 = clickedWidget.dragZoneSize; // L: 12495
			if (class27.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 12496 12497
				isDraggingWidget = true; // L: 12498
			}

			int var6 = var1 - field795 + clickedWidgetParent.scrollX; // L: 12501
			int var7 = var2 - field803 + clickedWidgetParent.scrollY; // L: 12502
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 12503
				var8 = new ScriptEvent(); // L: 12504
				var8.widget = clickedWidget; // L: 12505
				var8.mouseX = var6; // L: 12506
				var8.mouseY = var7; // L: 12507
				var8.args = clickedWidget.onDrag; // L: 12508
				WorldMapAreaData.runScriptEvent(var8); // L: 12509
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 12511
				if (isDraggingWidget) { // L: 12512
					if (clickedWidget.onDragComplete != null) { // L: 12513
						var8 = new ScriptEvent(); // L: 12514
						var8.widget = clickedWidget; // L: 12515
						var8.mouseX = var6; // L: 12516
						var8.mouseY = var7; // L: 12517
						var8.dragTarget = draggedOnWidget; // L: 12518
						var8.args = clickedWidget.onDragComplete; // L: 12519
						WorldMapAreaData.runScriptEvent(var8); // L: 12520
					}

					if (draggedOnWidget != null) { // L: 12522
						Widget var9 = clickedWidget; // L: 12524
						int var10 = ClanChannel.method3366(class173.getWidgetFlags(var9)); // L: 12526
						Widget var13;
						if (var10 == 0) { // L: 12527
							var13 = null; // L: 12528
						} else {
							int var11 = 0;

							while (true) {
								if (var11 >= var10) {
									var13 = var9; // L: 12538
									break;
								}

								var9 = class133.getWidget(var9.parentId); // L: 12532
								if (var9 == null) { // L: 12533
									var13 = null; // L: 12534
									break; // L: 12535
								}

								++var11; // L: 12531
							}
						}

						if (var13 != null) { // L: 12540
							PacketBufferNode var12 = Renderable.getPacketBufferNode(ClientPacket.field3119, packetWriter.isaacCipher); // L: 12542
							var12.packetBuffer.writeShort(clickedWidget.itemId); // L: 12543
							var12.packetBuffer.writeInt(draggedOnWidget.id); // L: 12544
							var12.packetBuffer.writeShort(draggedOnWidget.childIndex); // L: 12545
							var12.packetBuffer.writeIntME(draggedOnWidget.itemId); // L: 12546
							var12.packetBuffer.writeShort(clickedWidget.childIndex); // L: 12547
							var12.packetBuffer.method8648(clickedWidget.id); // L: 12548
							packetWriter.addNode(var12); // L: 12549
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 12554
					this.openMenu(widgetClickX + field735, widgetClickY + field554); // L: 12555
				} else if (menuOptionsCount > 0) { // L: 12557
					Skills.method6427(widgetClickX + field735, widgetClickY + field554); // L: 12558
				}

				clickedWidget = null; // L: 12561
			}

		} else {
			if (class27.widgetDragDuration > 1) { // L: 12477
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 12478
					Skills.method6427(widgetClickX + field735, widgetClickY + field554); // L: 12479
				}

				clickedWidget = null; // L: 12481
			}

		}
	} // L: 12483 12563

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(I)Lsi;",
		garbageValue = "-2141997640"
	)
	@Export("username")
	public Username username() {
		return class387.localPlayer != null ? class387.localPlayer.username : null; // L: 13308
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 758
				int var3;
				int var4;
				int var7;
				for (int var1 = 0; var1 <= 28; ++var1) { // L: 759
					String var2 = this.getParameter(Integer.toString(var1)); // L: 760
					if (var2 != null) { // L: 761
						switch(var1) { // L: 762
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 865
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 866
							}
							break;
						case 4:
							if (clientType == -1) { // L: 858
								clientType = Integer.parseInt(var2); // L: 859
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 842
							break; // L: 843
						case 6:
							var4 = Integer.parseInt(var2); // L: 819
							Language var54;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) { // L: 821
								var54 = Language.Language_valuesOrdered[var4]; // L: 825
							} else {
								var54 = null; // L: 822
							}

							class36.clientLanguage = var54; // L: 827
							break; // L: 828
						case 7:
							var4 = Integer.parseInt(var2); // L: 783
							GameBuild[] var5 = new GameBuild[]{GameBuild.WIP, GameBuild.RC, GameBuild.LIVE, GameBuild.BUILDLIVE}; // L: 788
							GameBuild[] var6 = var5; // L: 790
							var7 = 0;

							GameBuild var17;
							while (true) {
								if (var7 >= var6.length) {
									var17 = null; // L: 801
									break;
								}

								GameBuild var8 = var6[var7]; // L: 792
								if (var4 == var8.buildId) { // L: 794
									var17 = var8; // L: 795
									break; // L: 796
								}

								++var7; // L: 791
							}

							class147.field1700 = var17; // L: 803
							break; // L: 804
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 847
							}
							break;
						case 9:
							GraphicsDefaults.field4623 = var2; // L: 837
							break; // L: 838
						case 10:
							class134.field1606 = (StudioGame)class4.findEnumerated(WorldMapSection1.method5371(), Integer.parseInt(var2)); // L: 871
							if (class134.field1606 == StudioGame.oldscape) { // L: 872
								WorldMapCacheName.loginType = LoginType.oldscape;
							} else {
								WorldMapCacheName.loginType = LoginType.field4858; // L: 873
							}
							break;
						case 11:
							field805 = var2; // L: 853
							break; // L: 854
						case 12:
							worldId = Integer.parseInt(var2); // L: 808
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
							Message.field486 = Integer.parseInt(var2); // L: 813
							break; // L: 814
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 832
							break; // L: 833
						case 17:
							VerticalAlignment.field2070 = var2; // L: 878
							break;
						case 21:
							field501 = Integer.parseInt(var2); // L: 765
							break; // L: 766
						case 25:
							var3 = var2.indexOf("."); // L: 770
							if (var3 == -1) { // L: 771
								field505 = Integer.parseInt(var2); // L: 772
							} else {
								field505 = Integer.parseInt(var2.substring(0, var3)); // L: 775
								Integer.parseInt(var2.substring(var3 + 1)); // L: 776
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 885
				isLowDetail = false; // L: 886
				NetCache.worldHost = this.getCodeBase().getHost(); // L: 888
				String var18 = class147.field1700.name; // L: 889
				byte var19 = 0; // L: 890

				try {
					JagexCache.idxCount = 22; // L: 893
					class86.cacheGamebuild = var19; // L: 894

					try {
						class168.operatingSystemName = System.getProperty("os.name"); // L: 896
					} catch (Exception var36) { // L: 898
						class168.operatingSystemName = "Unknown"; // L: 899
					}

					SpotAnimationDefinition.formattedOperatingSystemName = class168.operatingSystemName.toLowerCase(); // L: 901

					try {
						UserComparator4.userHomeDirectory = System.getProperty("user.home"); // L: 903
						if (UserComparator4.userHomeDirectory != null) { // L: 904
							UserComparator4.userHomeDirectory = UserComparator4.userHomeDirectory + "/";
						}
					} catch (Exception var35) { // L: 906
					}

					try {
						if (SpotAnimationDefinition.formattedOperatingSystemName.startsWith("win")) { // L: 908
							if (UserComparator4.userHomeDirectory == null) { // L: 909
								UserComparator4.userHomeDirectory = System.getenv("USERPROFILE");
							}
						} else if (UserComparator4.userHomeDirectory == null) { // L: 912
							UserComparator4.userHomeDirectory = System.getenv("HOME");
						}

						if (UserComparator4.userHomeDirectory != null) { // L: 914
							UserComparator4.userHomeDirectory = UserComparator4.userHomeDirectory + "/";
						}
					} catch (Exception var34) { // L: 916
					}

					if (UserComparator4.userHomeDirectory == null) { // L: 917
						UserComparator4.userHomeDirectory = "~/";
					}

					class158.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", UserComparator4.userHomeDirectory, "/tmp/", ""}; // L: 918
					class130.cacheSubPaths = new String[]{".jagex_cache_" + class86.cacheGamebuild, ".file_store_" + class86.cacheGamebuild}; // L: 919
					var3 = 0;

					label344:
					while (var3 < 4) {
						String var42 = var3 == 0 ? "" : "" + var3; // L: 923
						UserComparator5.JagexCache_locationFile = new File(UserComparator4.userHomeDirectory, "jagex_cl_oldschool_" + var18 + var42 + ".dat"); // L: 924
						String var44 = null; // L: 925
						String var20 = null; // L: 926
						boolean var21 = false; // L: 927
						Buffer var10;
						int var11;
						int var13;
						File var47;
						if (UserComparator5.JagexCache_locationFile.exists()) { // L: 928
							try {
								AccessFile var9 = new AccessFile(UserComparator5.JagexCache_locationFile, "rw", 10000L); // L: 931

								for (var10 = new Buffer((int)var9.length()); var10.offset < var10.array.length; var10.offset += var11) { // L: 932 933 936
									var11 = var9.read(var10.array, var10.offset, var10.array.length - var10.offset); // L: 934
									if (var11 == -1) { // L: 935
										throw new IOException();
									}
								}

								var10.offset = 0; // L: 938
								var11 = var10.readUnsignedByte(); // L: 939
								if (var11 < 1 || var11 > 3) { // L: 940
									throw new IOException("" + var11);
								}

								int var12 = 0; // L: 941
								if (var11 > 1) { // L: 942
									var12 = var10.readUnsignedByte();
								}

								if (var11 <= 2) { // L: 943
									var44 = var10.readStringCp1252NullCircumfixed(); // L: 944
									if (var12 == 1) { // L: 945
										var20 = var10.readStringCp1252NullCircumfixed();
									}
								} else {
									var44 = var10.readCESU8(); // L: 948
									if (var12 == 1) { // L: 949
										var20 = var10.readCESU8();
									}
								}

								var9.close(); // L: 951
							} catch (IOException var39) { // L: 953
								var39.printStackTrace(); // L: 954
							}

							if (var44 != null) { // L: 956
								var47 = new File(var44); // L: 957
								if (!var47.exists()) { // L: 958
									var44 = null; // L: 959
								}
							}

							if (var44 != null) { // L: 962
								var47 = new File(var44, "test.dat"); // L: 963

								boolean var50;
								try {
									RandomAccessFile var22 = new RandomAccessFile(var47, "rw"); // L: 967
									var13 = var22.read(); // L: 968
									var22.seek(0L); // L: 969
									var22.write(var13); // L: 970
									var22.seek(0L); // L: 971
									var22.close(); // L: 972
									var47.delete(); // L: 973
									var50 = true; // L: 974
								} catch (Exception var33) { // L: 976
									var50 = false; // L: 977
								}

								if (!var50) { // L: 980
									var44 = null; // L: 981
								}
							}
						}

						if (var44 == null && var3 == 0) { // L: 985
							label320:
							for (int var23 = 0; var23 < class130.cacheSubPaths.length; ++var23) { // L: 986
								for (int var24 = 0; var24 < class158.cacheParentPaths.length; ++var24) { // L: 987
									File var25 = new File(class158.cacheParentPaths[var24] + class130.cacheSubPaths[var23] + File.separatorChar + "oldschool" + File.separatorChar); // L: 988
									if (var25.exists()) { // L: 989
										File var26 = new File(var25, "test.dat"); // L: 991

										boolean var52;
										try {
											RandomAccessFile var14 = new RandomAccessFile(var26, "rw"); // L: 994
											int var15 = var14.read(); // L: 995
											var14.seek(0L); // L: 996
											var14.write(var15); // L: 997
											var14.seek(0L); // L: 998
											var14.close(); // L: 999
											var26.delete(); // L: 1000
											var52 = true; // L: 1001
										} catch (Exception var32) { // L: 1003
											var52 = false; // L: 1004
										}

										if (var52) { // L: 1007
											var44 = var25.toString(); // L: 1008
											var21 = true; // L: 1009
											break label320; // L: 1010
										}
									}
								}
							}
						}

						if (var44 == null) { // L: 1016
							var44 = UserComparator4.userHomeDirectory + File.separatorChar + "jagexcache" + var42 + File.separatorChar + "oldschool" + File.separatorChar + var18 + File.separatorChar; // L: 1017
							var21 = true; // L: 1018
						}

						File var46;
						if (var20 != null) { // L: 1020
							var46 = new File(var20); // L: 1021
							var47 = new File(var44); // L: 1022

							try {
								File[] var59 = var46.listFiles(); // L: 1024
								File[] var56 = var59; // L: 1026

								for (var13 = 0; var13 < var56.length; ++var13) { // L: 1027
									File var53 = var56[var13]; // L: 1028
									File var27 = new File(var47, var53.getName()); // L: 1030
									boolean var16 = var53.renameTo(var27); // L: 1031
									if (!var16) { // L: 1032
										throw new IOException();
									}
								}
							} catch (Exception var38) { // L: 1037
								var38.printStackTrace(); // L: 1038
							}

							var21 = true; // L: 1040
						}

						if (var21) { // L: 1042
							var46 = new File(var44); // L: 1043
							var10 = null; // L: 1044

							try {
								AccessFile var60 = new AccessFile(UserComparator5.JagexCache_locationFile, "rw", 10000L); // L: 1048
								Buffer var57 = new Buffer(500); // L: 1049
								var57.writeByte(3); // L: 1050
								var57.writeByte(var10 != null ? 1 : 0); // L: 1051
								var57.writeCESU8(var46.getPath()); // L: 1052
								if (var10 != null) { // L: 1053
									var57.writeCESU8("");
								}

								var60.write(var57.array, 0, var57.offset); // L: 1054
								var60.close(); // L: 1055
							} catch (IOException var31) { // L: 1057
								var31.printStackTrace(); // L: 1058
							}
						}

						File var28 = new File(var44); // L: 1062
						Ignored.cacheDir = var28; // L: 1064
						if (!Ignored.cacheDir.exists()) { // L: 1065
							Ignored.cacheDir.mkdirs();
						}

						File[] var43 = Ignored.cacheDir.listFiles(); // L: 1066
						if (var43 == null) { // L: 1067
							break;
						}

						File[] var48 = var43; // L: 1069
						var7 = 0;

						while (true) {
							if (var7 >= var48.length) {
								break label344;
							}

							File var45 = var48[var7]; // L: 1071

							boolean var58;
							try {
								RandomAccessFile var51 = new RandomAccessFile(var45, "rw"); // L: 1076
								var11 = var51.read(); // L: 1077
								var51.seek(0L); // L: 1078
								var51.write(var11); // L: 1079
								var51.seek(0L); // L: 1080
								var51.close(); // L: 1081
								var58 = true; // L: 1083
							} catch (Exception var30) { // L: 1085
								var58 = false; // L: 1086
							}

							if (!var58) { // L: 1089
								++var3; // L: 920
								break;
							}

							++var7; // L: 1070
						}
					}

					PendingSpawn.method2421(Ignored.cacheDir); // L: 1096

					try {
						File var55 = new File(UserComparator4.userHomeDirectory, "random.dat"); // L: 1099
						int var29;
						if (var55.exists()) { // L: 1100
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var55, "rw", 25L), 24, 0); // L: 1101
						} else {
							label273:
							for (var4 = 0; var4 < class130.cacheSubPaths.length; ++var4) { // L: 1104
								for (var29 = 0; var29 < class158.cacheParentPaths.length; ++var29) { // L: 1105
									File var49 = new File(class158.cacheParentPaths[var29] + class130.cacheSubPaths[var4] + File.separatorChar + "random.dat"); // L: 1106
									if (var49.exists()) { // L: 1107
										JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var49, "rw", 25L), 24, 0); // L: 1108
										break label273; // L: 1109
									}
								}
							}
						}

						if (JagexCache.JagexCache_randomDat == null) { // L: 1114
							RandomAccessFile var61 = new RandomAccessFile(var55, "rw"); // L: 1115
							var29 = var61.read(); // L: 1116
							var61.seek(0L); // L: 1117
							var61.write(var29); // L: 1118
							var61.seek(0L); // L: 1119
							var61.close(); // L: 1120
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var55, "rw", 25L), 24, 0); // L: 1121
						}
					} catch (IOException var37) { // L: 1124
					}

					JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class372.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 1126
					JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class372.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 1127
					class18.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount]; // L: 1128

					for (var3 = 0; var3 < JagexCache.idxCount; ++var3) { // L: 1129
						class18.JagexCache_idxFiles[var3] = new BufferedFile(new AccessFile(class372.getFile("main_file_cache.idx" + var3), "rw", 1048576L), 6000, 0); // L: 1130
					}
				} catch (Exception var40) { // L: 1134
					class121.RunException_sendStackTrace((String)null, var40); // L: 1135
				}

				Decimator.client = this; // L: 1137
				RunException.clientType = clientType; // L: 1138
				Frames.field2620 = System.getenv("JX_ACCESS_TOKEN"); // L: 1140
				class152.field1755 = System.getenv("JX_REFRESH_TOKEN"); // L: 1141
				MusicPatchNode.field3449 = System.getenv("JX_SESSION_ID"); // L: 1142
				VarcInt.field1962 = System.getenv("JX_CHARACTER_ID"); // L: 1143
				Occluder.method4649(System.getenv("JX_DISPLAY_NAME")); // L: 1144
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) { // L: 1146
					this.field542 = true; // L: 1147
				}

				if (field503 == -1) { // L: 1149
					if (!this.method1723() && !this.method1217()) { // L: 1150
						field503 = 0; // L: 1154
					} else {
						field503 = 5; // L: 1151
					}
				}

				this.startThread(765, 503, 211, 1); // L: 1157
			}
		} catch (RuntimeException var41) {
			throw class320.newRunException(var41, "client.init(" + ')');
		}
	} // L: 1158

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 1163
			this.otlTokenRequester = var1; // L: 1166
			ReflectionCheck.method696(10); // L: 1167
		}
	} // L: 1164 1168

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 1173
			this.field613 = var1; // L: 1176
		}
	} // L: 1174 1177

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 1182
	}

	public long getAccountHash() {
		return this.accountHash; // L: 1187
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "-381999451"
	)
	static int method1634(int var0, Script var1, boolean var2) {
		return 2; // L: 4918
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-1698320506"
	)
	static Object method1773(int var0) {
		return FriendsList.method7543((class463)class4.findEnumerated(class463.method8503(), var0)); // L: 5144
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Lkz;IIZI)V",
		garbageValue = "1319818447"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 11468
		int var5 = var0.height; // L: 11469
		if (var0.widthAlignment == 0) { // L: 11470
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 11471
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 11472
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 11473
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 11474
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 11475
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 11476
			var0.width = var0.field3659 * var0.height / var0.field3569;
		}

		if (var0.heightAlignment == 4) { // L: 11477
			var0.height = var0.width * var0.field3569 / var0.field3659;
		}

		if (var0.contentType == 1337) { // L: 11478
			viewportWidget = var0;
		}

		if (var0.type == 12) { // L: 11479
			var0.method6235().method5928(var0.width, var0.height); // L: 11480
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 11482
			ScriptEvent var6 = new ScriptEvent(); // L: 11483
			var6.widget = var0; // L: 11484
			var6.args = var0.onResize; // L: 11485
			scriptEvents.addFirst(var6); // L: 11486
		}

	} // L: 11488

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Lkz;III)V",
		garbageValue = "1034721181"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 11491
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 11492
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 11493
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 11494
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 11495
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 11496
		}

		if (var0.yAlignment == 0) { // L: 11497
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 11498
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 11499
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 11500
		} else if (var0.yAlignment == 4) { // L: 11501
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 11502
		}

	} // L: 11503
}
