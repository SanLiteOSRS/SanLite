import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[[Lku;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("Widget_cachedFonts")
	public static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	static class362 field3519;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	static class362 field3515;
	@ObfuscatedName("as")
	public static boolean field3363;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = 173421621
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("ab")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -940779991
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 809492441
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 224165055
	)
	@Export("type")
	public int type;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1673595911
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 550569655
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -54816615
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 398955597
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1788232171
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 797662809
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1342397975
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1248159873
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1137463127
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2079384023
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 764674357
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1792986725
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1519131909
	)
	@Export("width")
	public int width;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -350307553
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 926940563
	)
	public int field3382;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -965777009
	)
	public int field3383;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1819057827
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bs")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -284902953
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 607496375
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 61033611
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1237899475
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 69752043
	)
	@Export("color")
	public int color;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 11937597
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -2108910317
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1166558025
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("bj")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("fillMode")
	public class454 fillMode;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1152643983
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -710952399
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1483236085
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bx")
	public boolean field3399;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1584437563
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -46900953
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bh")
	public String field3402;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -400682443
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bo")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1741927029
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1639578411
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bl")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bn")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1877064075
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -119680125
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -2126589789
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 282766663
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -40957173
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1671527253
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -877687815
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1674933423
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1525728983
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 191929345
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1090074793
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 574129965
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1530325059
	)
	public int field3421;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -620853285
	)
	public int field3422;
	@ObfuscatedName("co")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("cr")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1974347515
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -615121803
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cn")
	@Export("text")
	public String text;
	@ObfuscatedName("cu")
	@Export("text2")
	public String text2;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -495956447
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 160434047
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1979441939
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("cc")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 2143361225
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 796244305
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("cf")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("dz")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("dc")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("dh")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	class155 field3359;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -655137419
	)
	int field3440;
	@ObfuscatedName("dm")
	HashMap field3522;
	@ObfuscatedName("da")
	HashMap field3414;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 292209745
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("dd")
	public boolean field3444;
	@ObfuscatedName("du")
	public byte[][] field3445;
	@ObfuscatedName("do")
	public byte[][] field3446;
	@ObfuscatedName("dy")
	public int[] field3447;
	@ObfuscatedName("dp")
	public int[] field3448;
	@ObfuscatedName("dj")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("di")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -2107188713
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1698640057
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("ds")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dl")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("dn")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("em")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("ec")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ex")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("el")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("eb")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ek")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("eq")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("eo")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ew")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("ez")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("eu")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("ea")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("es")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("ev")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("er")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("et")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("ei")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("ep")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("ey")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("ee")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("en")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("eh")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ej")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("ed")
	public Object[] field3480;
	@ObfuscatedName("eg")
	public Object[] field3481;
	@ObfuscatedName("ef")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("ff")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fm")
	public Object[] field3484;
	@ObfuscatedName("ft")
	public Object[] field3485;
	@ObfuscatedName("fv")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fk")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fu")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fb")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fn")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("fz")
	public Object[] field3491;
	@ObfuscatedName("fo")
	public Object[] field3492;
	@ObfuscatedName("fl")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("fy")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("fw")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = 842844733
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("fe")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("fr")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("fj")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("fi")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = -178889975
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("fa")
	@ObfuscatedGetter(
		intValue = -1407479345
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("fq")
	@ObfuscatedGetter(
		intValue = -340147073
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("fx")
	@ObfuscatedGetter(
		intValue = -825168487
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "[Lku;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fs")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fh")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = 1763353511
	)
	public int field3508;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = 155706563
	)
	public int field3369;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = -1347962269
	)
	public int field3510;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = 722251365
	)
	public int field3486;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = -140611993
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 1575439991
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("ge")
	public int[] field3514;
	@ObfuscatedName("gs")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gc")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("gr")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 52
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 53
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 54
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 55
		field3519 = new class362(10, class360.field4278); // L: 56
		field3515 = new class362(10, class360.field4278); // L: 57
		field3363 = false; // L: 58
	}

	public Widget() {
		this.isIf3 = false; // L: 59
		this.id = -1; // L: 60
		this.childIndex = -1; // L: 61
		this.buttonType = 0; // L: 63
		this.contentType = 0; // L: 64
		this.xAlignment = 0; // L: 65
		this.yAlignment = 0; // L: 66
		this.widthAlignment = 0; // L: 67
		this.heightAlignment = 0; // L: 68
		this.rawX = 0; // L: 69
		this.rawY = 0; // L: 70
		this.rawWidth = 0; // L: 71
		this.rawHeight = 0; // L: 72
		this.x = 0; // L: 73
		this.y = 0; // L: 74
		this.width = 0; // L: 75
		this.height = 0; // L: 76
		this.field3382 = 1; // L: 77
		this.field3383 = 1; // L: 78
		this.parentId = -1; // L: 79
		this.isHidden = false; // L: 80
		this.scrollX = 0; // L: 81
		this.scrollY = 0; // L: 82
		this.scrollWidth = 0; // L: 83
		this.scrollHeight = 0; // L: 84
		this.color = 0; // L: 85
		this.color2 = 0; // L: 86
		this.mouseOverColor = 0; // L: 87
		this.mouseOverColor2 = 0; // L: 88
		this.fill = false; // L: 89
		this.fillMode = class454.SOLID; // L: 90
		this.transparencyTop = 0; // L: 91
		this.transparencyBot = 0; // L: 92
		this.lineWid = 1; // L: 93
		this.field3399 = false; // L: 94
		this.spriteId2 = -1; // L: 95
		this.spriteId = -1; // L: 96
		this.spriteAngle = 0; // L: 98
		this.spriteTiling = false; // L: 99
		this.outline = 0; // L: 100
		this.spriteShadow = 0; // L: 101
		this.modelType = 1; // L: 104
		this.modelId = -1; // L: 105
		this.modelType2 = 1; // L: 106
		this.modelId2 = -1; // L: 107
		this.sequenceId = -1; // L: 108
		this.sequenceId2 = -1; // L: 109
		this.modelOffsetX = 0; // L: 110
		this.modelOffsetY = 0; // L: 111
		this.modelAngleX = 0; // L: 112
		this.modelAngleY = 0; // L: 113
		this.modelAngleZ = 0; // L: 114
		this.modelZoom = 100; // L: 115
		this.field3421 = 0; // L: 116
		this.field3422 = 0; // L: 117
		this.modelOrthog = false; // L: 118
		this.modelTransparency = false; // L: 119
		this.itemQuantityMode = 2; // L: 120
		this.fontId = -1; // L: 121
		this.text = ""; // L: 122
		this.text2 = ""; // L: 123
		this.textLineHeight = 0; // L: 124
		this.textXAlignment = 0; // L: 125
		this.textYAlignment = 0; // L: 126
		this.textShadowed = false; // L: 127
		this.paddingX = 0; // L: 128
		this.paddingY = 0; // L: 129
		this.field3440 = -1; // L: 135
		this.flags = 0; // L: 139
		this.field3444 = false; // L: 140
		this.dataText = ""; // L: 149
		this.parent = null; // L: 151
		this.dragZoneSize = 0; // L: 152
		this.dragThreshold = 0; // L: 153
		this.isScrollBar = false; // L: 154
		this.spellActionName = ""; // L: 155
		this.hasListener = false; // L: 156
		this.mouseOverRedirect = -1; // L: 196
		this.spellName = ""; // L: 197
		this.buttonText = "Ok"; // L: 198
		this.itemId = -1; // L: 201
		this.itemQuantity = 0; // L: 202
		this.modelFrame = 0; // L: 203
		this.modelFrameCycle = 0; // L: 204
		this.containsMouse = false; // L: 206
		this.isClicked = false; // L: 207
		this.field3508 = -1; // L: 208
		this.field3369 = 0; // L: 209
		this.field3510 = 0; // L: 210
		this.field3486 = 0; // L: 211
		this.rootIndex = -1; // L: 212
		this.cycle = -1; // L: 213
		this.noClickThrough = false; // L: 215
		this.noScrollThrough = false; // L: 216
		this.prioritizeMenuEntry = false; // L: 217
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-585799123"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 277
		this.type = var1.readUnsignedByte(); // L: 278
		this.buttonType = var1.readUnsignedByte(); // L: 279
		this.contentType = var1.readUnsignedShort(); // L: 280
		this.rawX = var1.readShort(); // L: 281
		this.rawY = var1.readShort(); // L: 282
		this.rawWidth = var1.readUnsignedShort(); // L: 283
		this.rawHeight = var1.readUnsignedShort(); // L: 284
		this.transparencyTop = var1.readUnsignedByte(); // L: 285
		this.parentId = var1.readUnsignedShort(); // L: 286
		if (this.parentId == 65535) { // L: 287
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 288
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 289
		if (this.mouseOverRedirect == 65535) { // L: 290
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 291
		int var3;
		if (var2 > 0) { // L: 292
			this.cs1Comparisons = new int[var2]; // L: 293
			this.cs1ComparisonValues = new int[var2]; // L: 294

			for (var3 = 0; var3 < var2; ++var3) { // L: 295
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 296
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 297
			}
		}

		var3 = var1.readUnsignedByte(); // L: 300
		int var4;
		int var5;
		int var6;
		if (var3 > 0) { // L: 301
			this.cs1Instructions = new int[var3][]; // L: 302

			for (var4 = 0; var4 < var3; ++var4) { // L: 303
				var5 = var1.readUnsignedShort(); // L: 304
				this.cs1Instructions[var4] = new int[var5]; // L: 305

				for (var6 = 0; var6 < var5; ++var6) { // L: 306
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 307
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 308
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 312
			this.scrollHeight = var1.readUnsignedShort(); // L: 313
			this.isHidden = var1.readUnsignedByte() == 1; // L: 314
		}

		if (this.type == 1) { // L: 316
			var1.readUnsignedShort(); // L: 317
			var1.readUnsignedByte(); // L: 318
		}

		if (this.type == 2) { // L: 320
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 321
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 322
			var4 = var1.readUnsignedByte(); // L: 323
			if (var4 == 1) { // L: 324
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 325
			if (var5 == 1) { // L: 326
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 327
			if (var6 == 1) { // L: 328
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 329
			if (var7 == 1) { // L: 330
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte(); // L: 331
			this.paddingY = var1.readUnsignedByte(); // L: 332
			this.inventoryXOffsets = new int[20]; // L: 333
			this.inventoryYOffsets = new int[20]; // L: 334
			this.inventorySprites = new int[20]; // L: 335

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 336
				int var11 = var1.readUnsignedByte(); // L: 337
				if (var11 == 1) { // L: 338
					this.inventoryXOffsets[var8] = var1.readShort(); // L: 339
					this.inventoryYOffsets[var8] = var1.readShort(); // L: 340
					this.inventorySprites[var8] = var1.readInt(); // L: 341
				} else {
					this.inventorySprites[var8] = -1; // L: 343
				}
			}

			this.itemActions = new String[5]; // L: 345

			for (var8 = 0; var8 < 5; ++var8) { // L: 346
				String var9 = var1.readStringCp1252NullTerminated(); // L: 347
				if (var9.length() > 0) { // L: 348
					this.itemActions[var8] = var9; // L: 349
					this.flags |= 1 << var8 + 23; // L: 350
				}
			}
		}

		if (this.type == 3) { // L: 354
			this.fill = var1.readUnsignedByte() == 1; // L: 355
		}

		if (this.type == 4 || this.type == 1) { // L: 357
			this.textXAlignment = var1.readUnsignedByte(); // L: 358
			this.textYAlignment = var1.readUnsignedByte(); // L: 359
			this.textLineHeight = var1.readUnsignedByte(); // L: 360
			this.fontId = var1.readUnsignedShort(); // L: 361
			if (this.fontId == 65535) { // L: 362
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 363
		}

		if (this.type == 4) { // L: 365
			this.text = var1.readStringCp1252NullTerminated(); // L: 366
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 367
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 369
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 370
			this.color2 = var1.readInt(); // L: 371
			this.mouseOverColor = var1.readInt(); // L: 372
			this.mouseOverColor2 = var1.readInt(); // L: 373
		}

		if (this.type == 5) { // L: 375
			this.spriteId2 = var1.readInt(); // L: 376
			this.spriteId = var1.readInt(); // L: 377
		}

		if (this.type == 6) { // L: 379
			this.modelType = 1; // L: 380
			this.modelId = var1.readUnsignedShort(); // L: 381
			if (this.modelId == 65535) { // L: 382
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 383
			this.modelId2 = var1.readUnsignedShort(); // L: 384
			if (this.modelId2 == 65535) { // L: 385
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 386
			if (this.sequenceId == 65535) { // L: 387
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 388
			if (this.sequenceId2 == 65535) { // L: 389
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 390
			this.modelAngleX = var1.readUnsignedShort(); // L: 391
			this.modelAngleY = var1.readUnsignedShort(); // L: 392
		}

		if (this.type == 7) { // L: 394
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 395
			this.itemQuantities = new int[this.rawWidth * this.rawHeight]; // L: 396
			this.textXAlignment = var1.readUnsignedByte(); // L: 397
			this.fontId = var1.readUnsignedShort(); // L: 398
			if (this.fontId == 65535) { // L: 399
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 400
			this.color = var1.readInt(); // L: 401
			this.paddingX = var1.readShort(); // L: 402
			this.paddingY = var1.readShort(); // L: 403
			var4 = var1.readUnsignedByte(); // L: 404
			if (var4 == 1) {
				this.flags |= 1073741824; // L: 405
			}

			this.itemActions = new String[5]; // L: 406

			for (var5 = 0; var5 < 5; ++var5) { // L: 407
				String var10 = var1.readStringCp1252NullTerminated(); // L: 408
				if (var10.length() > 0) { // L: 409
					this.itemActions[var5] = var10; // L: 410
					this.flags |= 1 << var5 + 23; // L: 411
				}
			}
		}

		if (this.type == 8) { // L: 415
			this.text = var1.readStringCp1252NullTerminated(); // L: 416
		}

		if (this.buttonType == 2 || this.type == 2) { // L: 418
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 419
			this.spellName = var1.readStringCp1252NullTerminated(); // L: 420
			var4 = var1.readUnsignedShort() & 63; // L: 421
			this.flags |= var4 << 11; // L: 422
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 424
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 425
			if (this.buttonText.length() == 0) { // L: 426
				if (this.buttonType == 1) { // L: 427
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 428
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 429
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 430
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 433
			this.flags |= 4194304; // L: 434
		}

		if (this.buttonType == 6) { // L: 436
			this.flags |= 1; // L: 437
		}

	} // L: 439

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-601066442"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 442
		this.isIf3 = true; // L: 443
		this.type = var1.readUnsignedByte(); // L: 444
		this.contentType = var1.readUnsignedShort(); // L: 445
		this.rawX = var1.readShort(); // L: 446
		this.rawY = var1.readShort(); // L: 447
		this.rawWidth = var1.readUnsignedShort(); // L: 448
		if (this.type == 9) { // L: 449
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 450
		}

		this.widthAlignment = var1.readByte(); // L: 451
		this.heightAlignment = var1.readByte(); // L: 452
		this.xAlignment = var1.readByte(); // L: 453
		this.yAlignment = var1.readByte(); // L: 454
		this.parentId = var1.readUnsignedShort(); // L: 455
		if (this.parentId == 65535) { // L: 456
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 457
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 458
		if (this.type == 0) { // L: 459
			this.scrollWidth = var1.readUnsignedShort(); // L: 460
			this.scrollHeight = var1.readUnsignedShort(); // L: 461
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 462
		}

		if (this.type == 5) { // L: 464
			this.spriteId2 = var1.readInt(); // L: 465
			this.spriteAngle = var1.readUnsignedShort(); // L: 466
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 467
			this.transparencyTop = var1.readUnsignedByte(); // L: 468
			this.outline = var1.readUnsignedByte(); // L: 469
			this.spriteShadow = var1.readInt(); // L: 470
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 471
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 472
		}

		if (this.type == 6) { // L: 474
			this.modelType = 1; // L: 475
			this.modelId = var1.readUnsignedShort(); // L: 476
			if (this.modelId == 65535) { // L: 477
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 478
			this.modelOffsetY = var1.readShort(); // L: 479
			this.modelAngleX = var1.readUnsignedShort(); // L: 480
			this.modelAngleY = var1.readUnsignedShort(); // L: 481
			this.modelAngleZ = var1.readUnsignedShort(); // L: 482
			this.modelZoom = var1.readUnsignedShort(); // L: 483
			this.sequenceId = var1.readUnsignedShort(); // L: 484
			if (this.sequenceId == 65535) { // L: 485
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 486
			var1.readUnsignedShort(); // L: 487
			if (this.widthAlignment != 0) { // L: 488
				this.field3421 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 489
				var1.readUnsignedShort(); // L: 490
			}
		}

		if (this.type == 4) { // L: 493
			this.fontId = var1.readUnsignedShort(); // L: 494
			if (this.fontId == 65535) { // L: 495
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 496
			this.textLineHeight = var1.readUnsignedByte(); // L: 497
			this.textXAlignment = var1.readUnsignedByte(); // L: 498
			this.textYAlignment = var1.readUnsignedByte(); // L: 499
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 500
			this.color = var1.readInt(); // L: 501
		}

		if (this.type == 3) { // L: 503
			this.color = var1.readInt(); // L: 504
			this.fill = var1.readUnsignedByte() == 1; // L: 505
			this.transparencyTop = var1.readUnsignedByte(); // L: 506
		}

		if (this.type == 9) { // L: 508
			this.lineWid = var1.readUnsignedByte(); // L: 509
			this.color = var1.readInt(); // L: 510
			this.field3399 = var1.readUnsignedByte() == 1; // L: 511
		}

		this.flags = var1.readMedium(); // L: 513
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 514
		int var2 = var1.readUnsignedByte(); // L: 515
		if (var2 > 0) { // L: 516
			this.actions = new String[var2]; // L: 517

			for (int var3 = 0; var3 < var2; ++var3) { // L: 518
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 520
		this.dragThreshold = var1.readUnsignedByte(); // L: 521
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 522
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 523
		this.onLoad = this.readListener(var1); // L: 524
		this.onMouseOver = this.readListener(var1); // L: 525
		this.onMouseLeave = this.readListener(var1); // L: 526
		this.onTargetLeave = this.readListener(var1); // L: 527
		this.onTargetEnter = this.readListener(var1); // L: 528
		this.onVarTransmit = this.readListener(var1); // L: 529
		this.onInvTransmit = this.readListener(var1); // L: 530
		this.onStatTransmit = this.readListener(var1); // L: 531
		this.onTimer = this.readListener(var1); // L: 532
		this.onOp = this.readListener(var1); // L: 533
		this.onMouseRepeat = this.readListener(var1); // L: 534
		this.onClick = this.readListener(var1); // L: 535
		this.onClickRepeat = this.readListener(var1); // L: 536
		this.onRelease = this.readListener(var1); // L: 537
		this.onHold = this.readListener(var1); // L: 538
		this.onDrag = this.readListener(var1); // L: 539
		this.onDragComplete = this.readListener(var1); // L: 540
		this.onScroll = this.readListener(var1); // L: 541
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 542
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 543
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 544
	} // L: 545

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)[Ljava/lang/Object;",
		garbageValue = "-1889854744"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 548
		if (var2 == 0) { // L: 549
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 550

			for (int var4 = 0; var4 < var2; ++var4) { // L: 551
				int var5 = var1.readUnsignedByte(); // L: 552
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 553
				} else if (var5 == 1) { // L: 554
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 556
			return var3; // L: 557
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)[I",
		garbageValue = "967857934"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 561
		if (var2 == 0) { // L: 562
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 563

			for (int var4 = 0; var4 < var2; ++var4) { // L: 564
				var3[var4] = var1.readInt(); // L: 565
			}

			return var3; // L: 567
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-31"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2]; // L: 571
		this.itemIds[var2] = this.itemIds[var1]; // L: 572
		this.itemIds[var1] = var3; // L: 573
		var3 = this.itemQuantities[var2]; // L: 574
		this.itemQuantities[var2] = this.itemQuantities[var1]; // L: 575
		this.itemQuantities[var1] = var3; // L: 576
	} // L: 577

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ZLcc;B)Lqj;",
		garbageValue = "79"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3363 = false; // L: 580
		if (this.field3402 != null) { // L: 581
			SpritePixels var3 = this.method5675(var2); // L: 582
			if (var3 != null) { // L: 583
				return var3; // L: 584
			}
		}

		int var7;
		if (var1) { // L: 588
			var7 = this.spriteId;
		} else {
			var7 = this.spriteId2; // L: 589
		}

		if (var7 == -1) { // L: 590
			return null;
		} else {
			long var4 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var7 + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 591
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4); // L: 592
			if (var6 != null) { // L: 593
				return var6;
			} else {
				var6 = SoundSystem.SpriteBuffer_getSprite(class192.Widget_spritesArchive, var7, 0); // L: 594
				if (var6 == null) { // L: 595
					field3363 = true; // L: 596
					return null; // L: 597
				} else {
					this.method5628(var6); // L: 599
					Widget_cachedSprites.put(var6, var4); // L: 600
					return var6; // L: 601
				}
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lcc;B)Lqj;",
		garbageValue = "0"
	)
	SpritePixels method5675(UrlRequester var1) {
		if (!this.method5712()) { // L: 605
			return this.method5626(var1); // L: 606
		} else {
			String var2 = this.field3402 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 608
			SpritePixels var3 = (SpritePixels)field3515.method6594(var2); // L: 609
			if (var3 == null) { // L: 610
				SpritePixels var4 = this.method5626(var1); // L: 611
				if (var4 != null) { // L: 612
					var3 = var4.method8233(); // L: 613
					this.method5628(var3); // L: 614
					field3515.method6596(var2, var3); // L: 615
				}
			}

			return var3; // L: 618
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lcc;I)Lqj;",
		garbageValue = "-1999631288"
	)
	SpritePixels method5626(UrlRequester var1) {
		if (this.field3402 != null && var1 != null) { // L: 622
			class291 var2 = (class291)field3519.method6594(this.field3402); // L: 623
			if (var2 == null) { // L: 624
				var2 = new class291(this.field3402, var1); // L: 625
				field3519.method6596(this.field3402, var2); // L: 626
			}

			return var2.method5562(); // L: 628
		} else {
			return null; // L: 630
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2072627458"
	)
	boolean method5712() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 634
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lqj;I)V",
		garbageValue = "51334331"
	)
	void method5628(SpritePixels var1) {
		if (this.spriteFlipV) { // L: 638
			var1.flipVertically();
		}

		if (this.spriteFlipH) { // L: 639
			var1.flipHorizontally();
		}

		if (this.outline > 0) { // L: 640
			var1.pad(this.outline);
		}

		if (this.outline >= 1) { // L: 641
			var1.outline(1);
		}

		if (this.outline >= 2) {
			var1.outline(16777215); // L: 642
		}

		if (this.spriteShadow != 0) { // L: 643
			var1.shadow(this.spriteShadow);
		}

	} // L: 644

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Lmx;",
		garbageValue = "-1996881846"
	)
	@Export("getFont")
	public Font getFont() {
		field3363 = false; // L: 647
		if (this.fontId == -1) { // L: 648
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 649
			if (var1 != null) { // L: 650
				return var1;
			} else {
				AbstractArchive var3 = class192.Widget_spritesArchive; // L: 652
				AbstractArchive var4 = JagexCache.Widget_fontsArchive; // L: 653
				int var5 = this.fontId; // L: 654
				byte[] var7 = var3.takeFile(var5, 0); // L: 658
				boolean var6;
				if (var7 == null) { // L: 659
					var6 = false; // L: 660
				} else {
					class83.SpriteBuffer_decode(var7); // L: 663
					var6 = true; // L: 664
				}

				Font var2;
				if (!var6) { // L: 666
					var2 = null; // L: 667
				} else {
					var2 = class14.method182(var4.takeFile(var5, 0)); // L: 670
				}

				if (var2 != null) {
					Widget_cachedFonts.put(var2, (long)this.fontId); // L: 673
				} else {
					field3363 = true; // L: 674
				}

				return var2; // L: 675
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqj;",
		garbageValue = "-89"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3363 = false; // L: 679
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 680
			int var2 = this.inventorySprites[var1]; // L: 681
			if (var2 == -1) { // L: 682
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2); // L: 683
				if (var3 != null) { // L: 684
					return var3;
				} else {
					var3 = SoundSystem.SpriteBuffer_getSprite(class192.Widget_spritesArchive, var2, 0); // L: 685
					if (var3 != null) { // L: 686
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field3363 = true; // L: 687
					}

					return var3; // L: 688
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lgc;IZLko;I)Lhd;",
		garbageValue = "1052813178"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3363 = false; // L: 692
		int var5;
		int var6;
		if (var3) { // L: 695
			var5 = this.modelType2; // L: 696
			var6 = this.modelId2; // L: 697
		} else {
			var5 = this.modelType; // L: 700
			var6 = this.modelId; // L: 701
		}

		if (var5 == 0) { // L: 703
			return null;
		} else if (var5 == 1 && var6 == -1) { // L: 704
			return null;
		} else {
			Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16))); // L: 705
			if (var7 == null) { // L: 706
				ModelData var8;
				if (var5 == 1) { // L: 708
					var8 = ModelData.ModelData_get(class7.Widget_modelsArchive, var6, 0); // L: 709
					if (var8 == null) { // L: 710
						field3363 = true; // L: 711
						return null; // L: 712
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 714
				}

				if (var5 == 2) { // L: 716
					var8 = class125.getNpcDefinition(var6).getModelData(); // L: 717
					if (var8 == null) { // L: 718
						field3363 = true; // L: 719
						return null; // L: 720
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 722
				}

				if (var5 == 3) { // L: 724
					if (var4 == null) { // L: 725
						return null;
					}

					var8 = var4.getModelData(); // L: 726
					if (var8 == null) { // L: 727
						field3363 = true; // L: 728
						return null; // L: 729
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 731
				}

				if (var5 == 4) { // L: 733
					ItemComposition var9 = class258.ItemComposition_get(var6); // L: 734
					var8 = var9.getModelData(10); // L: 735
					if (var8 == null) { // L: 736
						field3363 = true; // L: 737
						return null; // L: 738
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast * 5 + 768, -50, -10, -50); // L: 740
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16))); // L: 742
			}

			if (var1 != null) { // L: 744
				var7 = var1.transformWidgetModel(var7, var2); // L: 745
			}

			return var7; // L: 747
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lkr;",
		garbageValue = "-1520814365"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 751
			var1 = false;
		}

		int var2 = var1 ? this.spriteId : this.spriteId2; // L: 752
		if (var2 == -1) { // L: 753
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38); // L: 754
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 755
			if (var5 != null) { // L: 756
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null); // L: 757
				if (var6 == null) { // L: 758
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 759
					int[] var8 = new int[var7.subHeight]; // L: 760
					int[] var9 = new int[var7.subHeight]; // L: 761

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 762
						int var11 = 0; // L: 763
						int var12 = var7.subWidth; // L: 764

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 765
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 766
								var11 = var13; // L: 767
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 771
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 772
								var12 = var13 + 1; // L: 773
								break;
							}
						}

						var8[var10] = var11; // L: 777
						var9[var10] = var12 - var11; // L: 778
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 780
					Widget_cachedSpriteMasks.put(var5, var3); // L: 781
					return var5; // L: 782
				}
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)V",
		garbageValue = "-6301"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 786
			String[] var3 = new String[var1 + 1]; // L: 787
			if (this.actions != null) { // L: 788
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 789
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 791
		}

		this.actions[var1] = var2; // L: 793
	} // L: 794

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1281585863"
	)
	public boolean method5634() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338; // L: 797
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lcc;J)V"
	)
	public void method5635(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && -1L != var3) { // L: 801
			var1 = var1.replaceAll("%userid%", Long.toString(var3)); // L: 802
			this.field3359 = new class155(); // L: 803
			if (!this.field3359.method3176(var1, var2)) { // L: 804
				this.field3359 = null; // L: 805
			} else {
				if (this.field3522 == null || this.field3414 == null) { // L: 808
					this.method5636(); // L: 809
				}

			}
		}
	} // L: 806 811

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	void method5636() {
		this.field3522 = new HashMap(); // L: 814
		this.field3414 = new HashMap(); // L: 815
	} // L: 816

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-5"
	)
	public void method5698(int var1, int var2) {
		if (this.type == 11) { // L: 819
			if (this.field3522 == null) { // L: 820
				this.method5636();
			}

			this.field3522.put(var1, var2); // L: 821
		}
	} // L: 822

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1727968969"
	)
	public void method5638(String var1, int var2) {
		if (this.type == 11) { // L: 825
			if (this.field3414 == null) { // L: 826
				this.method5636();
			}

			this.field3414.put(var1, var2); // L: 827
		}
	} // L: 828

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-1891820332"
	)
	public boolean method5720(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3359 != null && this.method5640()) { // L: 831
			var1 -= var3; // L: 832
			var2 -= var4; // L: 833
			int var5 = (int)(this.field3359.method3227()[0] * (float)this.width); // L: 834
			int var6 = (int)(this.field3359.method3227()[1] * (float)this.height); // L: 835
			int var7 = var5 + (int)(this.field3359.method3227()[2] * (float)this.width); // L: 836
			int var8 = var6 + (int)(this.field3359.method3227()[3] * (float)this.height); // L: 837
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8; // L: 838
		} else {
			return false;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-37"
	)
	public boolean method5640() {
		return this.field3440 == 2; // L: 842
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "2037722264"
	)
	public int method5641(String var1) {
		return this.type == 11 && this.field3359 != null && this.method5640() ? this.field3359.method3225(var1) : -1; // L: 846 847 849
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2077154837"
	)
	public String method5642(String var1) {
		return this.type == 11 && this.field3359 != null && this.method5640() ? this.field3359.method3179(var1) : null; // L: 853 854
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-54"
	)
	public int method5649() {
		return this.field3414 != null && this.field3414.size() > 0 ? 1 : 0; // L: 858
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	public int method5625() {
		if (this.type == 11 && this.field3359 != null && this.field3414 != null && !this.field3414.isEmpty()) { // L: 862
			String var1 = this.field3359.method3219(); // L: 863
			return var1 != null && this.field3414.containsKey(this.field3359.method3219()) ? (Integer)this.field3414.get(var1) : -1; // L: 864 865 867
		} else {
			return -1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "128"
	)
	public String method5668() {
		if (this.type == 11 && this.field3359 != null) { // L: 871
			String var1 = this.field3359.method3219(); // L: 872
			Iterator var2 = this.field3359.method3185().iterator(); // L: 873

			while (var2.hasNext()) {
				class165 var3 = (class165)var2.next(); // L: 874
				String var4 = String.format("%%%S%%", var3.method3295()); // L: 876
				if (var3.vmethod3296() == 0) { // L: 877
					var1.replaceAll(var4, Integer.toString(var3.vmethod3298())); // L: 878
				} else {
					var1.replaceAll(var4, var3.vmethod3297()); // L: 881
				}
			}

			return var1; // L: 885
		} else {
			return null; // L: 884
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "145703884"
	)
	public int[] method5646() {
		if (this.type == 11 && this.field3359 != null) { // L: 889
			int[] var1 = new int[3]; // L: 890
			int var2 = 0; // L: 891
			Iterator var3 = this.field3359.method3185().iterator(); // L: 892

			while (var3.hasNext()) { // L: 907
				class165 var4 = (class165)var3.next(); // L: 893
				if (!var4.method3295().equals("user_id")) { // L: 895
					if (var4.vmethod3296() != 0) { // L: 896
						return null; // L: 903
					}

					var1[var2++] = var4.vmethod3298(); // L: 897
					if (var2 > 3) { // L: 898
						return null; // L: 899
					}
				}
			}

			return var1; // L: 908
		} else {
			return null;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lcc;B)Z",
		garbageValue = "-19"
	)
	public boolean method5702(UrlRequester var1) {
		if (this.type == 11 && this.field3359 != null) { // L: 912
			this.field3359.method3233(var1); // L: 913
			if (this.field3359.method3178() != this.field3440) { // L: 914
				this.field3440 = this.field3359.method3178(); // L: 915
				if (this.field3440 >= 100) { // L: 916
					return true; // L: 917
				}

				if (this.field3440 == 2) { // L: 919
					this.method5711(); // L: 920
					return true; // L: 921
				}
			}

			return false; // L: 924
		} else {
			return false;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-45"
	)
	void method5711() {
		this.noClickThrough = true; // L: 945
		ArrayList var1 = this.field3359.method3181(); // L: 946
		ArrayList var2 = this.field3359.method3182(); // L: 947
		int var3 = var1.size() + var2.size(); // L: 948
		this.children = new Widget[var3]; // L: 949
		int var4 = 0; // L: 950

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 951 958
			class160 var6 = (class160)var5.next(); // L: 952
			var7 = WorldMapLabelSize.method4542(5, this, var4, 0, 0, 0, 0, var6.field1754); // L: 954
			var7.field3402 = var6.field1755.method2638(); // L: 955
			class291 var8 = new class291(var6.field1755); // L: 956
			field3519.method6596(var7.field3402, var8); // L: 957
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 961 969
			class161 var9 = (class161)var5.next(); // L: 962
			var7 = WorldMapLabelSize.method4542(4, this, var4, 0, 0, 0, 0, var9.field1764); // L: 964
			var7.text = var9.field1763; // L: 965
			var7.fontId = (Integer)this.field3522.get(var9.field1766); // L: 966
			var7.textXAlignment = var9.field1760; // L: 967
			var7.textYAlignment = var9.field1765; // L: 968
		}

	} // L: 972
}
