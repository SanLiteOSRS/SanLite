import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("b")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("Widget_cachedFonts")
	public static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	static class362 field3353;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	static class362 field3354;
	@ObfuscatedName("ab")
	public static boolean field3355;
	@ObfuscatedName("ak")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1692370233
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1985146419
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1201269859
	)
	@Export("type")
	public int type;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1098684151
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -869460521
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2080401453
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2086392833
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1449916075
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2042764293
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -339501621
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1265895161
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1872611649
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 574495541
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1173389335
	)
	@Export("x")
	public int x;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 328534653
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1791266795
	)
	@Export("width")
	public int width;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1514292503
	)
	@Export("height")
	public int height;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1396126225
	)
	public int field3350;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 588332801
	)
	public int field3375;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1386189839
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bn")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1283436399
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 948421307
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1006221665
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1738105285
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 206952531
	)
	@Export("color")
	public int color;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1487817857
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1831757597
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -422417861
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("by")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("fillMode")
	public class454 fillMode;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1862587825
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1671797363
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1441138687
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("bh")
	public boolean field3450;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1683946141
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 2075518097
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bp")
	public String field3373;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 169556581
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bo")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 825781849
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1083523037
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("be")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bk")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -842966883
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1197822757
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1418278355
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 316481687
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1955723579
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 263482215
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 940231021
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1122893609
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 530256893
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1932334201
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 65435751
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1157555055
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1081605869
	)
	public int field3413;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1514535987
	)
	public int field3414;
	@ObfuscatedName("ct")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("cp")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1966025381
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1166595023
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cy")
	@Export("text")
	public String text;
	@ObfuscatedName("cw")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 469641899
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1919179427
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -475467991
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("cu")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 962208849
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -883190129
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("ck")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("du")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("di")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("dw")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	class155 field3431;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 1875634429
	)
	int field3432;
	@ObfuscatedName("dd")
	HashMap field3433;
	@ObfuscatedName("dz")
	HashMap field3438;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -143869235
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("dr")
	public boolean field3436;
	@ObfuscatedName("dx")
	public byte[][] field3349;
	@ObfuscatedName("dp")
	public byte[][] field3497;
	@ObfuscatedName("dg")
	public int[] field3439;
	@ObfuscatedName("dj")
	public int[] field3410;
	@ObfuscatedName("dk")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("db")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1903319757
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 202583677
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dl")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("dh")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("dc")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ev")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("ei")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ek")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("el")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("ej")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("eb")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ea")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ef")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("es")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("eh")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("ep")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("ex")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("eq")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("ew")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("eg")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("et")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("ez")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("ee")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("ec")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("ey")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("ed")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("en")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("em")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("eo")
	public Object[] field3472;
	@ObfuscatedName("er")
	public Object[] field3493;
	@ObfuscatedName("eu")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fu")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fk")
	public Object[] field3476;
	@ObfuscatedName("fd")
	public Object[] field3369;
	@ObfuscatedName("ff")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("ft")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fc")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fp")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fb")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("fq")
	public Object[] field3441;
	@ObfuscatedName("fg")
	public Object[] field3364;
	@ObfuscatedName("fa")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("fx")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("fz")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("fw")
	@ObfuscatedGetter(
		intValue = 186793221
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("fy")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("fr")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("fv")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("fi")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("fe")
	@ObfuscatedGetter(
		intValue = 1646409911
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("fn")
	@ObfuscatedGetter(
		intValue = 948778825
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		intValue = 1038522613
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = -511764213
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "[Lkn;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("fh")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("fs")
	@Export("isClicked")
	public boolean isClicked;
	@ObfuscatedName("fm")
	@ObfuscatedGetter(
		intValue = -867044079
	)
	public int field3500;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = -1345565661
	)
	public int field3501;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = -61404705
	)
	public int field3502;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 1667459535
	)
	public int field3503;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 939629325
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = -1655892453
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gb")
	public int[] field3506;
	@ObfuscatedName("gj")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gh")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("gl")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 52
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 53
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 54
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 55
		field3353 = new class362(10, class360.field4257); // L: 56
		field3354 = new class362(10, class360.field4257); // L: 57
		field3355 = false; // L: 58
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
		this.field3350 = 1; // L: 77
		this.field3375 = 1; // L: 78
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
		this.field3450 = false; // L: 94
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
		this.field3413 = 0; // L: 116
		this.field3414 = 0; // L: 117
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
		this.field3432 = -1; // L: 135
		this.flags = 0; // L: 139
		this.field3436 = false; // L: 140
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
		this.field3500 = -1; // L: 208
		this.field3501 = 0; // L: 209
		this.field3502 = 0; // L: 210
		this.field3503 = 0; // L: 211
		this.rootIndex = -1; // L: 212
		this.cycle = -1; // L: 213
		this.noClickThrough = false; // L: 215
		this.noScrollThrough = false; // L: 216
		this.prioritizeMenuEntry = false; // L: 217
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "1982690339"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 261
		this.type = var1.readUnsignedByte(); // L: 262
		this.buttonType = var1.readUnsignedByte(); // L: 263
		this.contentType = var1.readUnsignedShort(); // L: 264
		this.rawX = var1.readShort(); // L: 265
		this.rawY = var1.readShort(); // L: 266
		this.rawWidth = var1.readUnsignedShort(); // L: 267
		this.rawHeight = var1.readUnsignedShort(); // L: 268
		this.transparencyTop = var1.readUnsignedByte(); // L: 269
		this.parentId = var1.readUnsignedShort(); // L: 270
		if (this.parentId == 65535) { // L: 271
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 272
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 273
		if (this.mouseOverRedirect == 65535) { // L: 274
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 275
		int var3;
		if (var2 > 0) { // L: 276
			this.cs1Comparisons = new int[var2]; // L: 277
			this.cs1ComparisonValues = new int[var2]; // L: 278

			for (var3 = 0; var3 < var2; ++var3) { // L: 279
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 280
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 281
			}
		}

		var3 = var1.readUnsignedByte(); // L: 284
		int var4;
		int var5;
		int var6;
		if (var3 > 0) { // L: 285
			this.cs1Instructions = new int[var3][]; // L: 286

			for (var4 = 0; var4 < var3; ++var4) { // L: 287
				var5 = var1.readUnsignedShort(); // L: 288
				this.cs1Instructions[var4] = new int[var5]; // L: 289

				for (var6 = 0; var6 < var5; ++var6) { // L: 290
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 291
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 292
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 296
			this.scrollHeight = var1.readUnsignedShort(); // L: 297
			this.isHidden = var1.readUnsignedByte() == 1; // L: 298
		}

		if (this.type == 1) { // L: 300
			var1.readUnsignedShort(); // L: 301
			var1.readUnsignedByte(); // L: 302
		}

		if (this.type == 2) { // L: 304
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 305
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 306
			var4 = var1.readUnsignedByte(); // L: 307
			if (var4 == 1) { // L: 308
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 309
			if (var5 == 1) { // L: 310
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 311
			if (var6 == 1) { // L: 312
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 313
			if (var7 == 1) { // L: 314
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte(); // L: 315
			this.paddingY = var1.readUnsignedByte(); // L: 316
			this.inventoryXOffsets = new int[20]; // L: 317
			this.inventoryYOffsets = new int[20]; // L: 318
			this.inventorySprites = new int[20]; // L: 319

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 320
				int var11 = var1.readUnsignedByte(); // L: 321
				if (var11 == 1) { // L: 322
					this.inventoryXOffsets[var8] = var1.readShort(); // L: 323
					this.inventoryYOffsets[var8] = var1.readShort(); // L: 324
					this.inventorySprites[var8] = var1.readInt(); // L: 325
				} else {
					this.inventorySprites[var8] = -1; // L: 327
				}
			}

			this.itemActions = new String[5]; // L: 329

			for (var8 = 0; var8 < 5; ++var8) { // L: 330
				String var9 = var1.readStringCp1252NullTerminated(); // L: 331
				if (var9.length() > 0) { // L: 332
					this.itemActions[var8] = var9; // L: 333
					this.flags |= 1 << var8 + 23; // L: 334
				}
			}
		}

		if (this.type == 3) { // L: 338
			this.fill = var1.readUnsignedByte() == 1; // L: 339
		}

		if (this.type == 4 || this.type == 1) { // L: 341
			this.textXAlignment = var1.readUnsignedByte(); // L: 342
			this.textYAlignment = var1.readUnsignedByte(); // L: 343
			this.textLineHeight = var1.readUnsignedByte(); // L: 344
			this.fontId = var1.readUnsignedShort(); // L: 345
			if (this.fontId == 65535) { // L: 346
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 347
		}

		if (this.type == 4) { // L: 349
			this.text = var1.readStringCp1252NullTerminated(); // L: 350
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 351
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 353
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 354
			this.color2 = var1.readInt(); // L: 355
			this.mouseOverColor = var1.readInt(); // L: 356
			this.mouseOverColor2 = var1.readInt(); // L: 357
		}

		if (this.type == 5) { // L: 359
			this.spriteId2 = var1.readInt(); // L: 360
			this.spriteId = var1.readInt(); // L: 361
		}

		if (this.type == 6) { // L: 363
			this.modelType = 1; // L: 364
			this.modelId = var1.readUnsignedShort(); // L: 365
			if (this.modelId == 65535) { // L: 366
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 367
			this.modelId2 = var1.readUnsignedShort(); // L: 368
			if (this.modelId2 == 65535) { // L: 369
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 370
			if (this.sequenceId == 65535) { // L: 371
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 372
			if (this.sequenceId2 == 65535) { // L: 373
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 374
			this.modelAngleX = var1.readUnsignedShort(); // L: 375
			this.modelAngleY = var1.readUnsignedShort(); // L: 376
		}

		if (this.type == 7) { // L: 378
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 379
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 380
			this.textXAlignment = var1.readUnsignedByte(); // L: 381
			this.fontId = var1.readUnsignedShort(); // L: 382
			if (this.fontId == 65535) { // L: 383
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 384
			this.color = var1.readInt(); // L: 385
			this.paddingX = var1.readShort(); // L: 386
			this.paddingY = var1.readShort(); // L: 387
			var4 = var1.readUnsignedByte(); // L: 388
			if (var4 == 1) {
				this.flags |= 1073741824; // L: 389
			}

			this.itemActions = new String[5]; // L: 390

			for (var5 = 0; var5 < 5; ++var5) { // L: 391
				String var10 = var1.readStringCp1252NullTerminated(); // L: 392
				if (var10.length() > 0) { // L: 393
					this.itemActions[var5] = var10; // L: 394
					this.flags |= 1 << var5 + 23; // L: 395
				}
			}
		}

		if (this.type == 8) { // L: 399
			this.text = var1.readStringCp1252NullTerminated(); // L: 400
		}

		if (this.buttonType == 2 || this.type == 2) { // L: 402
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 403
			this.spellName = var1.readStringCp1252NullTerminated(); // L: 404
			var4 = var1.readUnsignedShort() & 63; // L: 405
			this.flags |= var4 << 11; // L: 406
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 408
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 409
			if (this.buttonText.length() == 0) { // L: 410
				if (this.buttonType == 1) { // L: 411
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 412
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 413
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 414
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 417
			this.flags |= 4194304; // L: 418
		}

		if (this.buttonType == 6) { // L: 420
			this.flags |= 1; // L: 421
		}

	} // L: 423

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "1"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 426
		this.isIf3 = true; // L: 427
		this.type = var1.readUnsignedByte(); // L: 428
		this.contentType = var1.readUnsignedShort(); // L: 429
		this.rawX = var1.readShort(); // L: 430
		this.rawY = var1.readShort(); // L: 431
		this.rawWidth = var1.readUnsignedShort(); // L: 432
		if (this.type == 9) { // L: 433
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 434
		}

		this.widthAlignment = var1.readByte(); // L: 435
		this.heightAlignment = var1.readByte(); // L: 436
		this.xAlignment = var1.readByte(); // L: 437
		this.yAlignment = var1.readByte(); // L: 438
		this.parentId = var1.readUnsignedShort(); // L: 439
		if (this.parentId == 65535) { // L: 440
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 441
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 442
		if (this.type == 0) { // L: 443
			this.scrollWidth = var1.readUnsignedShort(); // L: 444
			this.scrollHeight = var1.readUnsignedShort(); // L: 445
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 446
		}

		if (this.type == 5) { // L: 448
			this.spriteId2 = var1.readInt(); // L: 449
			this.spriteAngle = var1.readUnsignedShort(); // L: 450
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 451
			this.transparencyTop = var1.readUnsignedByte(); // L: 452
			this.outline = var1.readUnsignedByte(); // L: 453
			this.spriteShadow = var1.readInt(); // L: 454
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 455
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 456
		}

		if (this.type == 6) { // L: 458
			this.modelType = 1; // L: 459
			this.modelId = var1.readUnsignedShort(); // L: 460
			if (this.modelId == 65535) { // L: 461
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 462
			this.modelOffsetY = var1.readShort(); // L: 463
			this.modelAngleX = var1.readUnsignedShort(); // L: 464
			this.modelAngleY = var1.readUnsignedShort(); // L: 465
			this.modelAngleZ = var1.readUnsignedShort(); // L: 466
			this.modelZoom = var1.readUnsignedShort(); // L: 467
			this.sequenceId = var1.readUnsignedShort(); // L: 468
			if (this.sequenceId == 65535) { // L: 469
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 470
			var1.readUnsignedShort(); // L: 471
			if (this.widthAlignment != 0) { // L: 472
				this.field3413 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 473
				var1.readUnsignedShort(); // L: 474
			}
		}

		if (this.type == 4) { // L: 477
			this.fontId = var1.readUnsignedShort(); // L: 478
			if (this.fontId == 65535) { // L: 479
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 480
			this.textLineHeight = var1.readUnsignedByte(); // L: 481
			this.textXAlignment = var1.readUnsignedByte(); // L: 482
			this.textYAlignment = var1.readUnsignedByte(); // L: 483
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 484
			this.color = var1.readInt(); // L: 485
		}

		if (this.type == 3) { // L: 487
			this.color = var1.readInt(); // L: 488
			this.fill = var1.readUnsignedByte() == 1; // L: 489
			this.transparencyTop = var1.readUnsignedByte(); // L: 490
		}

		if (this.type == 9) { // L: 492
			this.lineWid = var1.readUnsignedByte(); // L: 493
			this.color = var1.readInt(); // L: 494
			this.field3450 = var1.readUnsignedByte() == 1; // L: 495
		}

		this.flags = var1.readMedium(); // L: 497
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 498
		int var2 = var1.readUnsignedByte(); // L: 499
		if (var2 > 0) { // L: 500
			this.actions = new String[var2]; // L: 501

			for (int var3 = 0; var3 < var2; ++var3) { // L: 502
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 504
		this.dragThreshold = var1.readUnsignedByte(); // L: 505
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 506
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 507
		this.onLoad = this.readListener(var1); // L: 508
		this.onMouseOver = this.readListener(var1); // L: 509
		this.onMouseLeave = this.readListener(var1); // L: 510
		this.onTargetLeave = this.readListener(var1); // L: 511
		this.onTargetEnter = this.readListener(var1); // L: 512
		this.onVarTransmit = this.readListener(var1); // L: 513
		this.onInvTransmit = this.readListener(var1); // L: 514
		this.onStatTransmit = this.readListener(var1); // L: 515
		this.onTimer = this.readListener(var1); // L: 516
		this.onOp = this.readListener(var1); // L: 517
		this.onMouseRepeat = this.readListener(var1); // L: 518
		this.onClick = this.readListener(var1); // L: 519
		this.onClickRepeat = this.readListener(var1); // L: 520
		this.onRelease = this.readListener(var1); // L: 521
		this.onHold = this.readListener(var1); // L: 522
		this.onDrag = this.readListener(var1); // L: 523
		this.onDragComplete = this.readListener(var1); // L: 524
		this.onScroll = this.readListener(var1); // L: 525
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 526
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 527
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 528
	} // L: 529

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)[Ljava/lang/Object;",
		garbageValue = "79"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 532
		if (var2 == 0) { // L: 533
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 534

			for (int var4 = 0; var4 < var2; ++var4) { // L: 535
				int var5 = var1.readUnsignedByte(); // L: 536
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 537
				} else if (var5 == 1) { // L: 538
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 540
			return var3; // L: 541
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)[I",
		garbageValue = "-1033416563"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 545
		if (var2 == 0) { // L: 546
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 547

			for (int var4 = 0; var4 < var2; ++var4) { // L: 548
				var3[var4] = var1.readInt(); // L: 549
			}

			return var3; // L: 551
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1593898417"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2]; // L: 555
		this.itemIds[var2] = this.itemIds[var1]; // L: 556
		this.itemIds[var1] = var3; // L: 557
		var3 = this.itemQuantities[var2]; // L: 558
		this.itemQuantities[var2] = this.itemQuantities[var1]; // L: 559
		this.itemQuantities[var1] = var3; // L: 560
	} // L: 561

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZLcu;I)Lqn;",
		garbageValue = "-70180775"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3355 = false; // L: 564
		if (this.field3373 != null) { // L: 565
			SpritePixels var3 = this.method5536(var2); // L: 566
			if (var3 != null) { // L: 567
				return var3; // L: 568
			}
		}

		int var7;
		if (var1) { // L: 572
			var7 = this.spriteId;
		} else {
			var7 = this.spriteId2; // L: 573
		}

		if (var7 == -1) { // L: 574
			return null;
		} else {
			long var4 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var7; // L: 575
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4); // L: 576
			if (var6 != null) { // L: 577
				return var6;
			} else {
				var6 = WorldMapScaleHandler.SpriteBuffer_getSprite(WorldMapData_1.Widget_spritesArchive, var7, 0); // L: 578
				if (var6 == null) { // L: 579
					field3355 = true; // L: 580
					return null; // L: 581
				} else {
					this.method5549(var6); // L: 583
					Widget_cachedSprites.put(var6, var4); // L: 584
					return var6; // L: 585
				}
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lcu;B)Lqn;",
		garbageValue = "4"
	)
	SpritePixels method5536(UrlRequester var1) {
		if (!this.method5538()) { // L: 589
			return this.method5537(var1); // L: 590
		} else {
			String var2 = this.field3373 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 592
			SpritePixels var3 = (SpritePixels)field3354.method6498(var2); // L: 593
			if (var3 == null) { // L: 594
				SpritePixels var4 = this.method5537(var1); // L: 595
				if (var4 != null) { // L: 596
					var3 = var4.method8107(); // L: 597
					this.method5549(var3); // L: 598
					field3354.method6499(var2, var3); // L: 599
				}
			}

			return var3; // L: 602
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lcu;I)Lqn;",
		garbageValue = "-1200830767"
	)
	SpritePixels method5537(UrlRequester var1) {
		if (this.field3373 != null && var1 != null) { // L: 606
			class291 var2 = (class291)field3353.method6498(this.field3373); // L: 607
			if (var2 == null) { // L: 608
				var2 = new class291(this.field3373, var1); // L: 609
				field3353.method6499(this.field3373, var2); // L: 610
			}

			return var2.method5491(); // L: 612
		} else {
			return null; // L: 614
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1273422069"
	)
	boolean method5538() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 618
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lqn;I)V",
		garbageValue = "1935007287"
	)
	void method5549(SpritePixels var1) {
		if (this.spriteFlipV) { // L: 622
			var1.flipVertically();
		}

		if (this.spriteFlipH) { // L: 623
			var1.flipHorizontally();
		}

		if (this.outline > 0) { // L: 624
			var1.pad(this.outline);
		}

		if (this.outline >= 1) { // L: 625
			var1.outline(1);
		}

		if (this.outline >= 2) { // L: 626
			var1.outline(16777215);
		}

		if (this.spriteShadow != 0) { // L: 627
			var1.shadow(this.spriteShadow);
		}

	} // L: 628

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Lmg;",
		garbageValue = "-1963367798"
	)
	@Export("getFont")
	public Font getFont() {
		field3355 = false; // L: 631
		if (this.fontId == -1) { // L: 632
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 633
			if (var1 != null) { // L: 634
				return var1;
			} else {
				AbstractArchive var3 = WorldMapData_1.Widget_spritesArchive; // L: 636
				AbstractArchive var4 = SceneTilePaint.Widget_fontsArchive; // L: 637
				int var5 = this.fontId; // L: 638
				Font var2;
				if (!Tile.method3937(var3, var5, 0)) { // L: 640
					var2 = null; // L: 641
				} else {
					byte[] var7 = var4.takeFile(var5, 0); // L: 645
					Font var6;
					if (var7 == null) { // L: 647
						var6 = null; // L: 648
					} else {
						Font var8 = new Font(var7, class457.SpriteBuffer_xOffsets, InterfaceParent.SpriteBuffer_yOffsets, class457.SpriteBuffer_spriteWidths, SoundCache.SpriteBuffer_spriteHeights, class457.SpriteBuffer_spritePalette, class181.SpriteBuffer_pixels); // L: 651
						class457.SpriteBuffer_xOffsets = null; // L: 653
						InterfaceParent.SpriteBuffer_yOffsets = null; // L: 654
						class457.SpriteBuffer_spriteWidths = null; // L: 655
						SoundCache.SpriteBuffer_spriteHeights = null; // L: 656
						class457.SpriteBuffer_spritePalette = null; // L: 657
						class181.SpriteBuffer_pixels = null; // L: 658
						var6 = var8; // L: 660
					}

					var2 = var6; // L: 662
				}

				if (var2 != null) { // L: 665
					Widget_cachedFonts.put(var2, (long)this.fontId);
				} else {
					field3355 = true; // L: 666
				}

				return var2; // L: 667
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Lqn;",
		garbageValue = "2131002805"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3355 = false; // L: 671
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 672
			int var2 = this.inventorySprites[var1]; // L: 673
			if (var2 == -1) { // L: 674
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2); // L: 675
				if (var3 != null) { // L: 676
					return var3;
				} else {
					var3 = WorldMapScaleHandler.SpriteBuffer_getSprite(WorldMapData_1.Widget_spritesArchive, var2, 0); // L: 677
					if (var3 != null) { // L: 678
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field3355 = true; // L: 679
					}

					return var3; // L: 680
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lgh;IZLkk;I)Lhp;",
		garbageValue = "806847612"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3355 = false; // L: 684
		int var5;
		int var6;
		if (var3) { // L: 687
			var5 = this.modelType2; // L: 688
			var6 = this.modelId2; // L: 689
		} else {
			var5 = this.modelType; // L: 692
			var6 = this.modelId; // L: 693
		}

		if (var5 == 0) { // L: 695
			return null;
		} else if (var5 == 1 && var6 == -1) { // L: 696
			return null;
		} else {
			Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16))); // L: 697
			if (var7 == null) { // L: 698
				ModelData var8;
				if (var5 == 1) { // L: 700
					var8 = ModelData.ModelData_get(class193.Widget_modelsArchive, var6, 0); // L: 701
					if (var8 == null) { // L: 702
						field3355 = true; // L: 703
						return null; // L: 704
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 706
				}

				if (var5 == 2) { // L: 708
					var8 = class119.getNpcDefinition(var6).getModelData(); // L: 709
					if (var8 == null) { // L: 710
						field3355 = true; // L: 711
						return null; // L: 712
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 714
				}

				if (var5 == 3) { // L: 716
					if (var4 == null) { // L: 717
						return null;
					}

					var8 = var4.getModelData(); // L: 718
					if (var8 == null) { // L: 719
						field3355 = true; // L: 720
						return null; // L: 721
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 723
				}

				if (var5 == 4) { // L: 725
					ItemComposition var9 = AttackOption.ItemComposition_get(var6); // L: 726
					var8 = var9.getModelData(10); // L: 727
					if (var8 == null) { // L: 728
						field3355 = true; // L: 729
						return null; // L: 730
					}

					var7 = var8.toModel(var9.ambient + 64, var9.contrast + 768, -50, -10, -50); // L: 732
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16))); // L: 734
			}

			if (var1 != null) { // L: 736
				var7 = var1.transformWidgetModel(var7, var2); // L: 737
			}

			return var7; // L: 739
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lkl;",
		garbageValue = "-1731243939"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 743
			var1 = false;
		}

		int var2 = var1 ? this.spriteId : this.spriteId2; // L: 744
		if (var2 == -1) { // L: 745
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 746
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 747
			if (var5 != null) { // L: 748
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null); // L: 749
				if (var6 == null) { // L: 750
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 751
					int[] var8 = new int[var7.subHeight]; // L: 752
					int[] var9 = new int[var7.subHeight]; // L: 753

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 754
						int var11 = 0; // L: 755
						int var12 = var7.subWidth; // L: 756

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 757
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 758
								var11 = var13; // L: 759
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 763
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 764
								var12 = var13 + 1; // L: 765
								break;
							}
						}

						var8[var10] = var11; // L: 769
						var9[var10] = var12 - var11; // L: 770
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 772
					Widget_cachedSpriteMasks.put(var5, var3); // L: 773
					return var5; // L: 774
				}
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "1"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 778
			String[] var3 = new String[var1 + 1]; // L: 779
			if (this.actions != null) { // L: 780
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 781
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 783
		}

		this.actions[var1] = var2; // L: 785
	} // L: 786

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-639201758"
	)
	public boolean method5545() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338; // L: 789
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lcu;J)V"
	)
	public void method5539(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && -1L != var3) { // L: 793
			var1 = var1.replaceAll("%userid%", Long.toString(var3)); // L: 794
			this.field3431 = new class155(); // L: 795
			if (!this.field3431.method3163(var1, var2)) { // L: 796
				this.field3431 = null; // L: 797
			} else {
				if (this.field3433 == null || this.field3438 == null) { // L: 800
					this.method5547(); // L: 801
				}

			}
		}
	} // L: 798 803

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	void method5547() {
		this.field3433 = new HashMap(); // L: 806
		this.field3438 = new HashMap(); // L: 807
	} // L: 808

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2009455757"
	)
	public void method5548(int var1, int var2) {
		if (this.type == 11) { // L: 811
			if (this.field3433 == null) { // L: 812
				this.method5547();
			}

			this.field3433.put(var1, var2); // L: 813
		}
	} // L: 814

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "4210688"
	)
	public void method5533(String var1, int var2) {
		if (this.type == 11) { // L: 817
			if (this.field3438 == null) { // L: 818
				this.method5547();
			}

			this.field3438.put(var1, var2); // L: 819
		}
	} // L: 820

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Z",
		garbageValue = "90"
	)
	public boolean method5550(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3431 != null && this.method5562()) { // L: 823
			var1 -= var3; // L: 824
			var2 -= var4; // L: 825
			int var5 = (int)(this.field3431.method3114()[0] * (float)this.width); // L: 826
			int var6 = (int)(this.field3431.method3114()[1] * (float)this.height); // L: 827
			int var7 = var5 + (int)(this.field3431.method3114()[2] * (float)this.width); // L: 828
			int var8 = var6 + (int)(this.field3431.method3114()[3] * (float)this.height); // L: 829
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8; // L: 830
		} else {
			return false;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method5562() {
		return this.field3432 == 2; // L: 834
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "0"
	)
	public int method5552(String var1) {
		return this.type == 11 && this.field3431 != null && this.method5562() ? this.field3431.method3109(var1) : -1; // L: 838 839 841
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1172353469"
	)
	public String method5553(String var1) {
		return this.type == 11 && this.field3431 != null && this.method5562() ? this.field3431.method3110(var1) : null; // L: 845 846
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-648571099"
	)
	public int method5554() {
		return this.field3438 != null && this.field3438.size() > 0 ? 1 : 0; // L: 850
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-43"
	)
	public int method5555() {
		if (this.type == 11 && this.field3431 != null && this.field3438 != null && !this.field3438.isEmpty()) { // L: 854
			String var1 = this.field3431.method3113(); // L: 855
			return var1 != null && this.field3438.containsKey(this.field3431.method3113()) ? (Integer)this.field3438.get(var1) : -1; // L: 856 857 859
		} else {
			return -1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "64"
	)
	public String method5556() {
		if (this.type == 11 && this.field3431 != null) { // L: 863
			String var1 = this.field3431.method3113(); // L: 864
			Iterator var2 = this.field3431.method3115().iterator(); // L: 865

			while (var2.hasNext()) {
				class165 var3 = (class165)var2.next(); // L: 866
				String var4 = String.format("%%%S%%", var3.method3238()); // L: 868
				if (var3.vmethod3237() == 0) { // L: 869
					var1.replaceAll(var4, Integer.toString(var3.vmethod3239())); // L: 870
				} else {
					var1.replaceAll(var4, var3.vmethod3250()); // L: 873
				}
			}

			return var1; // L: 877
		} else {
			return null; // L: 876
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1611673564"
	)
	public int[] method5595() {
		if (this.type == 11 && this.field3431 != null) { // L: 881
			int[] var1 = new int[3]; // L: 882
			int var2 = 0; // L: 883
			Iterator var3 = this.field3431.method3115().iterator(); // L: 884

			while (var3.hasNext()) {
				class165 var4 = (class165)var3.next(); // L: 885
				if (!var4.method3238().equals("user_id")) { // L: 887
					if (var4.vmethod3237() != 0) { // L: 888
						return null; // L: 895
					}

					var1[var2++] = var4.vmethod3239(); // L: 889
					if (var2 > 3) { // L: 890
						return null; // L: 891
					}
				}
			}

			return var1; // L: 900
		} else {
			return null;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lcu;I)Z",
		garbageValue = "776569608"
	)
	public boolean method5610(UrlRequester var1) {
		if (this.type == 11 && this.field3431 != null) { // L: 904
			this.field3431.method3138(var1); // L: 905
			if (this.field3431.method3108() != this.field3432) { // L: 906
				this.field3432 = this.field3431.method3108(); // L: 907
				if (this.field3432 >= 100) { // L: 908
					return true; // L: 909
				}

				if (this.field3432 == 2) { // L: 911
					this.method5559(); // L: 912
					return true; // L: 913
				}
			}

			return false; // L: 916
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1888219962"
	)
	void method5559() {
		this.noClickThrough = true; // L: 937
		ArrayList var1 = this.field3431.method3142(); // L: 938
		ArrayList var2 = this.field3431.method3112(); // L: 939
		int var3 = var1.size() + var2.size(); // L: 940
		this.children = new Widget[var3]; // L: 941
		int var4 = 0; // L: 942

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 943 950
			class160 var6 = (class160)var5.next(); // L: 944
			var7 = InvDefinition.method3278(5, this, var4, 0, 0, 0, 0, var6.field1748); // L: 946
			var7.field3373 = var6.field1749.method2528(); // L: 947
			class291 var8 = new class291(var6.field1749); // L: 948
			field3353.method6499(var7.field3373, var8); // L: 949
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 953 961
			class161 var9 = (class161)var5.next(); // L: 954
			var7 = InvDefinition.method3278(4, this, var4, 0, 0, 0, 0, var9.field1752); // L: 956
			var7.text = var9.field1755; // L: 957
			var7.fontId = (Integer)this.field3433.get(var9.field1759); // L: 958
			var7.textXAlignment = var9.field1758; // L: 959
			var7.textYAlignment = var9.field1757; // L: 960
		}

	} // L: 964
}
