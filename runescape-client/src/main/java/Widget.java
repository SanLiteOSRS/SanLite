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
	@ObfuscatedName("to")
	@ObfuscatedGetter(
		intValue = -263620323
	)
	static int field3636;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[[Lkn;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static class381 field3472;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static class381 field3478;
	@ObfuscatedName("ad")
	public static boolean field3479;
	@ObfuscatedName("av")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1917711801
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 469376671
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -329832557
	)
	@Export("type")
	public int type;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1029610303
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1016623939
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1340008183
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1534861181
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1901095729
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 777525925
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1563685067
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -476345777
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1238423121
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1560710239
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -573894221
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 507755209
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1582083079
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1708008155
	)
	@Export("height")
	public int height;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 542051879
	)
	public int field3498;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1849756449
	)
	public int field3532;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1789533151
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bm")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1358065617
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -140001103
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -26574507
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1173980451
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1570572883
	)
	@Export("color")
	public int color;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1751496061
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1753359483
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1557818957
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("bv")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("fillMode")
	public class474 fillMode;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 147312651
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -71681053
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1058202869
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("by")
	public boolean field3515;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -784888237
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -455779275
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("bj")
	public String field3518;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -826185515
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("bn")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1819416611
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1004200007
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("bi")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("bs")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -166761659
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -546957309
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1504197233
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1675282901
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -718928581
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1330950589
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -681202429
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 445292289
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1905981411
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -2094300399
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1876738053
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 460318677
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -709248075
	)
	public int field3537;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 850745255
	)
	public int field3533;
	@ObfuscatedName("ch")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("ce")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1384011809
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -101600891
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("cr")
	@Export("text")
	public String text;
	@ObfuscatedName("ct")
	@Export("text2")
	public String text2;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -407538245
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -980152459
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -620947247
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("cv")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1480138033
	)
	@Export("paddingX")
	public int paddingX;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 882705129
	)
	@Export("paddingY")
	public int paddingY;
	@ObfuscatedName("ds")
	@Export("inventoryXOffsets")
	public int[] inventoryXOffsets;
	@ObfuscatedName("df")
	@Export("inventoryYOffsets")
	public int[] inventoryYOffsets;
	@ObfuscatedName("dc")
	@Export("inventorySprites")
	public int[] inventorySprites;
	@ObfuscatedName("dk")
	@Export("itemActions")
	public String[] itemActions;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	class162 field3481;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -761056275
	)
	int field3556;
	@ObfuscatedName("dt")
	HashMap field3553;
	@ObfuscatedName("da")
	HashMap field3629;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	class298 field3495;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -1005194465
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("dm")
	public boolean field3561;
	@ObfuscatedName("dg")
	public byte[][] field3562;
	@ObfuscatedName("dr")
	public byte[][] field3563;
	@ObfuscatedName("dl")
	public int[] field3611;
	@ObfuscatedName("dy")
	public int[] field3565;
	@ObfuscatedName("db")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("dv")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -776330119
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1349448159
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("dh")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("es")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("ek")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("en")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("eb")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ep")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ej")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("ew")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ec")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("el")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("eo")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("eh")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("et")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("ey")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("ef")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("ev")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("ea")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("er")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("ed")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("ez")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("eu")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("ei")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("eg")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("em")
	public Object[] field3594;
	@ObfuscatedName("ex")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("ee")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("eq")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fe")
	public Object[] field3598;
	@ObfuscatedName("fr")
	public Object[] field3599;
	@ObfuscatedName("fm")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fx")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fl")
	public Object[] field3602;
	@ObfuscatedName("fc")
	public Object[] field3473;
	@ObfuscatedName("ft")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fp")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fg")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fk")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fn")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("fh")
	public Object[] field3582;
	@ObfuscatedName("fi")
	public Object[] field3610;
	@ObfuscatedName("fo")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("fa")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("fy")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = 2025203217
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("fs")
	@Export("spellName")
	public String spellName;
	@ObfuscatedName("fw")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("fu")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("fv")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("fd")
	@ObfuscatedGetter(
		intValue = -1746692719
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("fq")
	@ObfuscatedGetter(
		intValue = -1244104309
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = -1876833185
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		intValue = 473577105
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "[Lkn;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gj")
	@Export("containsMouse")
	public boolean containsMouse;
	@ObfuscatedName("gl")
	public boolean field3512;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 925829199
	)
	public int field3626;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = -269973479
	)
	public int field3627;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = -1863725053
	)
	public int field3628;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = -1934618353
	)
	public int field3618;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = 1358939361
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = -511666151
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gk")
	public int[] field3564;
	@ObfuscatedName("ge")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gx")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("gm")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 56
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 57
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 58
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 59
		field3472 = new class381(10, class379.field4437); // L: 60
		field3478 = new class381(10, class379.field4437); // L: 61
		field3479 = false; // L: 62
	}

	public Widget() {
		this.isIf3 = false; // L: 63
		this.id = -1; // L: 64
		this.childIndex = -1; // L: 65
		this.buttonType = 0; // L: 67
		this.contentType = 0; // L: 68
		this.xAlignment = 0; // L: 69
		this.yAlignment = 0; // L: 70
		this.widthAlignment = 0; // L: 71
		this.heightAlignment = 0; // L: 72
		this.rawX = 0; // L: 73
		this.rawY = 0; // L: 74
		this.rawWidth = 0; // L: 75
		this.rawHeight = 0; // L: 76
		this.x = 0; // L: 77
		this.y = 0; // L: 78
		this.width = 0; // L: 79
		this.height = 0; // L: 80
		this.field3498 = 1; // L: 81
		this.field3532 = 1; // L: 82
		this.parentId = -1; // L: 83
		this.isHidden = false; // L: 84
		this.scrollX = 0; // L: 85
		this.scrollY = 0; // L: 86
		this.scrollWidth = 0; // L: 87
		this.scrollHeight = 0; // L: 88
		this.color = 0; // L: 89
		this.color2 = 0; // L: 90
		this.mouseOverColor = 0; // L: 91
		this.mouseOverColor2 = 0; // L: 92
		this.fill = false; // L: 93
		this.fillMode = class474.SOLID; // L: 94
		this.transparencyTop = 0; // L: 95
		this.transparencyBot = 0; // L: 96
		this.lineWid = 1; // L: 97
		this.field3515 = false; // L: 98
		this.spriteId2 = -1; // L: 99
		this.spriteId = -1; // L: 100
		this.spriteAngle = 0; // L: 102
		this.spriteTiling = false; // L: 103
		this.outline = 0; // L: 104
		this.spriteShadow = 0; // L: 105
		this.modelType = 1; // L: 108
		this.modelId = -1; // L: 109
		this.modelType2 = 1; // L: 110
		this.modelId2 = -1; // L: 111
		this.sequenceId = -1; // L: 112
		this.sequenceId2 = -1; // L: 113
		this.modelOffsetX = 0; // L: 114
		this.modelOffsetY = 0; // L: 115
		this.modelAngleX = 0; // L: 116
		this.modelAngleY = 0; // L: 117
		this.modelAngleZ = 0; // L: 118
		this.modelZoom = 100; // L: 119
		this.field3537 = 0; // L: 120
		this.field3533 = 0; // L: 121
		this.modelOrthog = false; // L: 122
		this.modelTransparency = false; // L: 123
		this.itemQuantityMode = 2; // L: 124
		this.fontId = -1; // L: 125
		this.text = ""; // L: 126
		this.text2 = ""; // L: 127
		this.textLineHeight = 0; // L: 128
		this.textXAlignment = 0; // L: 129
		this.textYAlignment = 0; // L: 130
		this.textShadowed = false; // L: 131
		this.paddingX = 0; // L: 132
		this.paddingY = 0; // L: 133
		this.field3556 = -1; // L: 139
		this.flags = 0; // L: 144
		this.field3561 = false; // L: 145
		this.dataText = ""; // L: 154
		this.parent = null; // L: 156
		this.dragZoneSize = 0; // L: 157
		this.dragThreshold = 0; // L: 158
		this.isScrollBar = false; // L: 159
		this.spellActionName = ""; // L: 160
		this.hasListener = false; // L: 161
		this.mouseOverRedirect = -1; // L: 202
		this.spellName = ""; // L: 203
		this.buttonText = "Ok"; // L: 204
		this.itemId = -1; // L: 207
		this.itemQuantity = 0; // L: 208
		this.modelFrame = 0; // L: 209
		this.modelFrameCycle = 0; // L: 210
		this.containsMouse = false; // L: 212
		this.field3512 = false; // L: 213
		this.field3626 = -1; // L: 214
		this.field3627 = 0; // L: 215
		this.field3628 = 0; // L: 216
		this.field3618 = 0; // L: 217
		this.rootIndex = -1; // L: 218
		this.cycle = -1; // L: 219
		this.noClickThrough = false; // L: 221
		this.noScrollThrough = false; // L: 222
		this.prioritizeMenuEntry = false; // L: 223
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "21"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 283
		this.type = var1.readUnsignedByte(); // L: 284
		this.buttonType = var1.readUnsignedByte(); // L: 285
		this.contentType = var1.readUnsignedShort(); // L: 286
		this.rawX = var1.readShort(); // L: 287
		this.rawY = var1.readShort(); // L: 288
		this.rawWidth = var1.readUnsignedShort(); // L: 289
		this.rawHeight = var1.readUnsignedShort(); // L: 290
		this.transparencyTop = var1.readUnsignedByte(); // L: 291
		this.parentId = var1.readUnsignedShort(); // L: 292
		if (this.parentId == 65535) { // L: 293
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 294
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 295
		if (this.mouseOverRedirect == 65535) { // L: 296
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 297
		int var3;
		if (var2 > 0) { // L: 298
			this.cs1Comparisons = new int[var2]; // L: 299
			this.cs1ComparisonValues = new int[var2]; // L: 300

			for (var3 = 0; var3 < var2; ++var3) { // L: 301
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 302
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 303
			}
		}

		var3 = var1.readUnsignedByte(); // L: 306
		int var4;
		int var5;
		int var6;
		if (var3 > 0) { // L: 307
			this.cs1Instructions = new int[var3][]; // L: 308

			for (var4 = 0; var4 < var3; ++var4) { // L: 309
				var5 = var1.readUnsignedShort(); // L: 310
				this.cs1Instructions[var4] = new int[var5]; // L: 311

				for (var6 = 0; var6 < var5; ++var6) { // L: 312
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 313
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 314
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 318
			this.scrollHeight = var1.readUnsignedShort(); // L: 319
			this.isHidden = var1.readUnsignedByte() == 1; // L: 320
		}

		if (this.type == 1) { // L: 322
			var1.readUnsignedShort(); // L: 323
			var1.readUnsignedByte(); // L: 324
		}

		if (this.type == 2) { // L: 326
			this.itemIds = new int[this.rawWidth * this.rawHeight]; // L: 327
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 328
			var4 = var1.readUnsignedByte(); // L: 329
			if (var4 == 1) { // L: 330
				this.flags |= 268435456;
			}

			var5 = var1.readUnsignedByte(); // L: 331
			if (var5 == 1) { // L: 332
				this.flags |= 1073741824;
			}

			var6 = var1.readUnsignedByte(); // L: 333
			if (var6 == 1) { // L: 334
				this.flags |= Integer.MIN_VALUE;
			}

			int var7 = var1.readUnsignedByte(); // L: 335
			if (var7 == 1) { // L: 336
				this.flags |= 536870912;
			}

			this.paddingX = var1.readUnsignedByte(); // L: 337
			this.paddingY = var1.readUnsignedByte(); // L: 338
			this.inventoryXOffsets = new int[20]; // L: 339
			this.inventoryYOffsets = new int[20]; // L: 340
			this.inventorySprites = new int[20]; // L: 341

			int var8;
			for (var8 = 0; var8 < 20; ++var8) { // L: 342
				int var11 = var1.readUnsignedByte(); // L: 343
				if (var11 == 1) { // L: 344
					this.inventoryXOffsets[var8] = var1.readShort(); // L: 345
					this.inventoryYOffsets[var8] = var1.readShort(); // L: 346
					this.inventorySprites[var8] = var1.readInt(); // L: 347
				} else {
					this.inventorySprites[var8] = -1; // L: 349
				}
			}

			this.itemActions = new String[5]; // L: 351

			for (var8 = 0; var8 < 5; ++var8) { // L: 352
				String var9 = var1.readStringCp1252NullTerminated(); // L: 353
				if (var9.length() > 0) { // L: 354
					this.itemActions[var8] = var9; // L: 355
					this.flags |= 1 << var8 + 23; // L: 356
				}
			}
		}

		if (this.type == 3) { // L: 360
			this.fill = var1.readUnsignedByte() == 1; // L: 361
		}

		if (this.type == 4 || this.type == 1) { // L: 363
			this.textXAlignment = var1.readUnsignedByte(); // L: 364
			this.textYAlignment = var1.readUnsignedByte(); // L: 365
			this.textLineHeight = var1.readUnsignedByte(); // L: 366
			this.fontId = var1.readUnsignedShort(); // L: 367
			if (this.fontId == 65535) { // L: 368
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 369
		}

		if (this.type == 4) { // L: 371
			this.text = var1.readStringCp1252NullTerminated(); // L: 372
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 373
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 375
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 376
			this.color2 = var1.readInt(); // L: 377
			this.mouseOverColor = var1.readInt(); // L: 378
			this.mouseOverColor2 = var1.readInt(); // L: 379
		}

		if (this.type == 5) { // L: 381
			this.spriteId2 = var1.readInt(); // L: 382
			this.spriteId = var1.readInt(); // L: 383
		}

		if (this.type == 6) { // L: 385
			this.modelType = 1; // L: 386
			this.modelId = var1.readUnsignedShort(); // L: 387
			if (this.modelId == 65535) { // L: 388
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 389
			this.modelId2 = var1.readUnsignedShort(); // L: 390
			if (this.modelId2 == 65535) { // L: 391
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 392
			if (this.sequenceId == 65535) { // L: 393
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 394
			if (this.sequenceId2 == 65535) { // L: 395
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 396
			this.modelAngleX = var1.readUnsignedShort(); // L: 397
			this.modelAngleY = var1.readUnsignedShort(); // L: 398
		}

		if (this.type == 7) { // L: 400
			this.itemIds = new int[this.rawHeight * this.rawWidth]; // L: 401
			this.itemQuantities = new int[this.rawHeight * this.rawWidth]; // L: 402
			this.textXAlignment = var1.readUnsignedByte(); // L: 403
			this.fontId = var1.readUnsignedShort(); // L: 404
			if (this.fontId == 65535) { // L: 405
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 406
			this.color = var1.readInt(); // L: 407
			this.paddingX = var1.readShort(); // L: 408
			this.paddingY = var1.readShort(); // L: 409
			var4 = var1.readUnsignedByte(); // L: 410
			if (var4 == 1) {
				this.flags |= 1073741824; // L: 411
			}

			this.itemActions = new String[5]; // L: 412

			for (var5 = 0; var5 < 5; ++var5) { // L: 413
				String var10 = var1.readStringCp1252NullTerminated(); // L: 414
				if (var10.length() > 0) { // L: 415
					this.itemActions[var5] = var10; // L: 416
					this.flags |= 1 << var5 + 23; // L: 417
				}
			}
		}

		if (this.type == 8) { // L: 421
			this.text = var1.readStringCp1252NullTerminated(); // L: 422
		}

		if (this.buttonType == 2 || this.type == 2) { // L: 424
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 425
			this.spellName = var1.readStringCp1252NullTerminated(); // L: 426
			var4 = var1.readUnsignedShort() & 63; // L: 427
			this.flags |= var4 << 11; // L: 428
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 430
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 431
			if (this.buttonText.length() == 0) { // L: 432
				if (this.buttonType == 1) { // L: 433
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 434
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 435
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 436
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 439
			this.flags |= 4194304; // L: 440
		}

		if (this.buttonType == 6) { // L: 442
			this.flags |= 1; // L: 443
		}

	} // L: 445

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1051480625"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 448
		this.isIf3 = true; // L: 449
		this.type = var1.readUnsignedByte(); // L: 450
		this.contentType = var1.readUnsignedShort(); // L: 451
		this.rawX = var1.readShort(); // L: 452
		this.rawY = var1.readShort(); // L: 453
		this.rawWidth = var1.readUnsignedShort(); // L: 454
		if (this.type == 9) { // L: 455
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 456
		}

		this.widthAlignment = var1.readByte(); // L: 457
		this.heightAlignment = var1.readByte(); // L: 458
		this.xAlignment = var1.readByte(); // L: 459
		this.yAlignment = var1.readByte(); // L: 460
		this.parentId = var1.readUnsignedShort(); // L: 461
		if (this.parentId == 65535) { // L: 462
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 463
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 464
		if (this.type == 0) { // L: 465
			this.scrollWidth = var1.readUnsignedShort(); // L: 466
			this.scrollHeight = var1.readUnsignedShort(); // L: 467
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 468
		}

		if (this.type == 5) { // L: 470
			this.spriteId2 = var1.readInt(); // L: 471
			this.spriteAngle = var1.readUnsignedShort(); // L: 472
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 473
			this.transparencyTop = var1.readUnsignedByte(); // L: 474
			this.outline = var1.readUnsignedByte(); // L: 475
			this.spriteShadow = var1.readInt(); // L: 476
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 477
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 478
		}

		if (this.type == 6) { // L: 480
			this.modelType = 1; // L: 481
			this.modelId = var1.readUnsignedShort(); // L: 482
			if (this.modelId == 65535) { // L: 483
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 484
			this.modelOffsetY = var1.readShort(); // L: 485
			this.modelAngleX = var1.readUnsignedShort(); // L: 486
			this.modelAngleY = var1.readUnsignedShort(); // L: 487
			this.modelAngleZ = var1.readUnsignedShort(); // L: 488
			this.modelZoom = var1.readUnsignedShort(); // L: 489
			this.sequenceId = var1.readUnsignedShort(); // L: 490
			if (this.sequenceId == 65535) { // L: 491
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 492
			var1.readUnsignedShort(); // L: 493
			if (this.widthAlignment != 0) { // L: 494
				this.field3537 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 495
				var1.readUnsignedShort(); // L: 496
			}
		}

		if (this.type == 4) { // L: 499
			this.fontId = var1.readUnsignedShort(); // L: 500
			if (this.fontId == 65535) { // L: 501
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 502
			this.textLineHeight = var1.readUnsignedByte(); // L: 503
			this.textXAlignment = var1.readUnsignedByte(); // L: 504
			this.textYAlignment = var1.readUnsignedByte(); // L: 505
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 506
			this.color = var1.readInt(); // L: 507
		}

		if (this.type == 3) { // L: 509
			this.color = var1.readInt(); // L: 510
			this.fill = var1.readUnsignedByte() == 1; // L: 511
			this.transparencyTop = var1.readUnsignedByte(); // L: 512
		}

		if (this.type == 9) { // L: 514
			this.lineWid = var1.readUnsignedByte(); // L: 515
			this.color = var1.readInt(); // L: 516
			this.field3515 = var1.readUnsignedByte() == 1; // L: 517
		}

		this.flags = var1.readMedium(); // L: 519
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 520
		int var2 = var1.readUnsignedByte(); // L: 521
		if (var2 > 0) { // L: 522
			this.actions = new String[var2]; // L: 523

			for (int var3 = 0; var3 < var2; ++var3) { // L: 524
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 526
		this.dragThreshold = var1.readUnsignedByte(); // L: 527
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 528
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 529
		this.onLoad = this.readListener(var1); // L: 530
		this.onMouseOver = this.readListener(var1); // L: 531
		this.onMouseLeave = this.readListener(var1); // L: 532
		this.onTargetLeave = this.readListener(var1); // L: 533
		this.onTargetEnter = this.readListener(var1); // L: 534
		this.onVarTransmit = this.readListener(var1); // L: 535
		this.onInvTransmit = this.readListener(var1); // L: 536
		this.onStatTransmit = this.readListener(var1); // L: 537
		this.onTimer = this.readListener(var1); // L: 538
		this.onOp = this.readListener(var1); // L: 539
		this.onMouseRepeat = this.readListener(var1); // L: 540
		this.onClick = this.readListener(var1); // L: 541
		this.onClickRepeat = this.readListener(var1); // L: 542
		this.onRelease = this.readListener(var1); // L: 543
		this.onHold = this.readListener(var1); // L: 544
		this.onDrag = this.readListener(var1); // L: 545
		this.onDragComplete = this.readListener(var1); // L: 546
		this.onScroll = this.readListener(var1); // L: 547
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 548
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 549
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 550
	} // L: 551

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)[Ljava/lang/Object;",
		garbageValue = "-938210783"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 554
		if (var2 == 0) { // L: 555
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 556

			for (int var4 = 0; var4 < var2; ++var4) { // L: 557
				int var5 = var1.readUnsignedByte(); // L: 558
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 559
				} else if (var5 == 1) { // L: 560
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 562
			return var3; // L: 563
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)[I",
		garbageValue = "860367589"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 567
		if (var2 == 0) { // L: 568
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 569

			for (int var4 = 0; var4 < var2; ++var4) { // L: 570
				var3[var4] = var1.readInt(); // L: 571
			}

			return var3; // L: 573
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		int var3 = this.itemIds[var2]; // L: 577
		this.itemIds[var2] = this.itemIds[var1]; // L: 578
		this.itemIds[var1] = var3; // L: 579
		var3 = this.itemQuantities[var2]; // L: 580
		this.itemQuantities[var2] = this.itemQuantities[var1]; // L: 581
		this.itemQuantities[var1] = var3; // L: 582
	} // L: 583

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZLdk;I)Lri;",
		garbageValue = "1242662266"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3479 = false; // L: 586
		if (this.field3518 != null) { // L: 587
			SpritePixels var3 = this.method6066(var2); // L: 588
			if (var3 != null) { // L: 589
				return var3; // L: 590
			}
		}

		int var7;
		if (var1) { // L: 594
			var7 = this.spriteId;
		} else {
			var7 = this.spriteId2; // L: 595
		}

		if (var7 == -1) { // L: 596
			return null;
		} else {
			long var4 = ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var7 + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40); // L: 597
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4); // L: 598
			if (var6 != null) { // L: 599
				return var6;
			} else {
				var6 = FriendsList.SpriteBuffer_getSprite(MusicPatchPcmStream.Widget_spritesArchive, var7, 0); // L: 600
				if (var6 == null) { // L: 601
					field3479 = true; // L: 602
					return null; // L: 603
				} else {
					this.method6054(var6); // L: 605
					Widget_cachedSprites.put(var6, var4); // L: 606
					return var6; // L: 607
				}
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)Lri;",
		garbageValue = "-1623738556"
	)
	SpritePixels method6066(UrlRequester var1) {
		if (!this.method6053()) { // L: 611
			return this.method6052(var1); // L: 612
		} else {
			String var2 = this.field3518 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 614
			SpritePixels var3 = (SpritePixels)field3478.method7208(var2); // L: 615
			if (var3 == null) { // L: 616
				SpritePixels var4 = this.method6052(var1); // L: 617
				if (var4 != null) { // L: 618
					var3 = var4.method8824(); // L: 619
					this.method6054(var3); // L: 620
					field3478.method7209(var2, var3); // L: 621
				}
			}

			return var3; // L: 624
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)Lri;",
		garbageValue = "86850697"
	)
	SpritePixels method6052(UrlRequester var1) {
		if (this.field3518 != null && var1 != null) { // L: 628
			class297 var2 = (class297)field3472.method7208(this.field3518); // L: 629
			if (var2 == null) { // L: 630
				var2 = new class297(this.field3518, var1); // L: 631
				field3472.method7209(this.field3518, var2); // L: 632
			}

			return var2.method5722(); // L: 634
		} else {
			return null; // L: 636
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "884213966"
	)
	boolean method6053() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 640
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lri;I)V",
		garbageValue = "332117803"
	)
	void method6054(SpritePixels var1) {
		if (this.spriteFlipV) { // L: 644
			var1.flipVertically();
		}

		if (this.spriteFlipH) { // L: 645
			var1.flipHorizontally();
		}

		if (this.outline > 0) { // L: 646
			var1.pad(this.outline);
		}

		if (this.outline >= 1) { // L: 647
			var1.outline(1);
		}

		if (this.outline >= 2) { // L: 648
			var1.outline(16777215);
		}

		if (this.spriteShadow != 0) { // L: 649
			var1.shadow(this.spriteShadow);
		}

	} // L: 650

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lnl;",
		garbageValue = "-576566163"
	)
	@Export("getFont")
	public Font getFont() {
		field3479 = false; // L: 653
		if (this.fontId == -1) { // L: 654
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 655
			if (var1 != null) { // L: 656
				return var1;
			} else {
				var1 = ByteArrayPool.method7165(MusicPatchPcmStream.Widget_spritesArchive, WorldMapManager.Widget_fontsArchive, this.fontId, 0); // L: 657
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId); // L: 658
				} else {
					field3479 = true; // L: 659
				}

				return var1; // L: 660
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IB)Lri;",
		garbageValue = "56"
	)
	@Export("getInventorySprite")
	public SpritePixels getInventorySprite(int var1) {
		field3479 = false; // L: 664
		if (var1 >= 0 && var1 < this.inventorySprites.length) { // L: 665
			int var2 = this.inventorySprites[var1]; // L: 666
			if (var2 == -1) { // L: 667
				return null;
			} else {
				SpritePixels var3 = (SpritePixels)Widget_cachedSprites.get((long)var2); // L: 668
				if (var3 != null) { // L: 669
					return var3;
				} else {
					var3 = FriendsList.SpriteBuffer_getSprite(MusicPatchPcmStream.Widget_spritesArchive, var2, 0); // L: 670
					if (var3 != null) { // L: 671
						Widget_cachedSprites.put(var3, (long)var2);
					} else {
						field3479 = true; // L: 672
					}

					return var3; // L: 673
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lgg;IZLks;I)Lha;",
		garbageValue = "-1838571698"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4) {
		field3479 = false; // L: 677
		int var5;
		int var6;
		if (var3) { // L: 680
			var5 = this.modelType2; // L: 681
			var6 = this.modelId2; // L: 682
		} else {
			var5 = this.modelType; // L: 685
			var6 = this.modelId; // L: 686
		}

		if (var5 == 0) { // L: 688
			return null;
		} else if (var5 == 1 && var6 == -1) { // L: 689
			return null;
		} else {
			Model var7 = (Model)Widget_cachedModels.get((long)(var6 + (var5 << 16))); // L: 690
			if (var7 == null) { // L: 691
				ModelData var8;
				if (var5 == 1) { // L: 693
					var8 = ModelData.ModelData_get(class188.Widget_modelsArchive, var6, 0); // L: 694
					if (var8 == null) { // L: 695
						field3479 = true; // L: 696
						return null; // L: 697
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 699
				}

				if (var5 == 2) { // L: 701
					var8 = HealthBarDefinition.getNpcDefinition(var6).getModelData(); // L: 702
					if (var8 == null) { // L: 703
						field3479 = true; // L: 704
						return null; // L: 705
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 707
				}

				if (var5 == 3) { // L: 709
					if (var4 == null) { // L: 710
						return null;
					}

					var8 = var4.getModelData(); // L: 711
					if (var8 == null) { // L: 712
						field3479 = true; // L: 713
						return null; // L: 714
					}

					var7 = var8.toModel(64, 768, -50, -10, -50); // L: 716
				}

				if (var5 == 4) { // L: 718
					ItemComposition var9 = MidiPcmStream.ItemComposition_get(var6); // L: 719
					var8 = var9.getModelData(10); // L: 720
					if (var8 == null) { // L: 721
						field3479 = true; // L: 722
						return null; // L: 723
					}

					var7 = var8.toModel(var9.field2171 + 64, var9.field2183 + 768, -50, -10, -50); // L: 725
				}

				Widget_cachedModels.put(var7, (long)(var6 + (var5 << 16))); // L: 727
			}

			if (var1 != null) { // L: 729
				var7 = var1.transformWidgetModel(var7, var2); // L: 730
			}

			return var7; // L: 732
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ZS)Lkl;",
		garbageValue = "-5853"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 736
			var1 = false;
		}

		int var2 = var1 ? this.spriteId : this.spriteId2; // L: 737
		if (var2 == -1) { // L: 738
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 739
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 740
			if (var5 != null) { // L: 741
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null); // L: 742
				if (var6 == null) { // L: 743
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 744
					int[] var8 = new int[var7.subHeight]; // L: 745
					int[] var9 = new int[var7.subHeight]; // L: 746

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 747
						int var11 = 0; // L: 748
						int var12 = var7.subWidth; // L: 749

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 750
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 751
								var11 = var13; // L: 752
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 756
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 757
								var12 = var13 + 1; // L: 758
								break;
							}
						}

						var8[var10] = var11; // L: 762
						var9[var10] = var12 - var11; // L: 763
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 765
					Widget_cachedSpriteMasks.put(var5, var3); // L: 766
					return var5; // L: 767
				}
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "262512640"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "736047854"
	)
	public boolean method6108() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12; // L: 789
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-421868624"
	)
	public boolean method6061() {
		return this.type == 11 || this.type == 12; // L: 793
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ldk;J)V"
	)
	public void method6062(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && -1L != var3) { // L: 797
			var1 = var1.replaceAll("%userid%", Long.toString(var3)); // L: 798
			this.field3481 = new class162(); // L: 799
			if (!this.field3481.method3271(var1, var2)) { // L: 800
				this.field3481 = null; // L: 801
			} else {
				if (this.field3553 == null || this.field3629 == null) { // L: 804
					this.method6185(); // L: 805
				}

			}
		}
	} // L: 802 807

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2014991260"
	)
	void method6185() {
		this.field3553 = new HashMap(); // L: 810
		this.field3629 = new HashMap(); // L: 811
	} // L: 812

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "49"
	)
	public void method6074(int var1, int var2) {
		if (this.type == 11) { // L: 815
			if (this.field3553 == null) {
				this.method6185(); // L: 816
			}

			this.field3553.put(var1, var2); // L: 817
		}
	} // L: 818

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "0"
	)
	public void method6065(String var1, int var2) {
		if (this.type == 11) { // L: 821
			if (this.field3629 == null) {
				this.method6185(); // L: 822
			}

			this.field3629.put(var1, var2); // L: 823
		}
	} // L: 824

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-858511397"
	)
	public boolean method6075() {
		return this.field3556 == 2; // L: 827
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-45"
	)
	public int method6067(String var1) {
		return this.type == 11 && this.field3481 != null && this.method6075() ? this.field3481.method3274(var1) : -1; // L: 831 832 834
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "0"
	)
	public String method6136(String var1) {
		return this.type == 11 && this.field3481 != null && this.method6075() ? this.field3481.method3275(var1) : null; // L: 838 839
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method6069() {
		return this.field3629 != null && this.field3629.size() > 0 ? 1 : 0; // L: 843
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "421171702"
	)
	public int method6070() {
		if (this.type == 11 && this.field3481 != null && this.field3629 != null && !this.field3629.isEmpty()) { // L: 847
			String var1 = this.field3481.method3278(); // L: 848
			return var1 != null && this.field3629.containsKey(this.field3481.method3278()) ? (Integer)this.field3629.get(var1) : -1; // L: 849 850 852
		} else {
			return -1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	public String method6071() {
		if (this.type == 11 && this.field3481 != null) { // L: 856
			String var1 = this.field3481.method3278(); // L: 857
			Iterator var2 = this.field3481.method3279().iterator(); // L: 858

			while (var2.hasNext()) {
				class172 var3 = (class172)var2.next(); // L: 859
				String var4 = String.format("%%%S%%", var3.method3385()); // L: 861
				if (var3.vmethod3379() == 0) { // L: 862
					var1.replaceAll(var4, Integer.toString(var3.vmethod3378())); // L: 863
				} else {
					var1.replaceAll(var4, var3.vmethod3380()); // L: 866
				}
			}

			return var1; // L: 870
		} else {
			return null; // L: 869
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1380976625"
	)
	public int[] method6132() {
		if (this.type == 11 && this.field3481 != null) { // L: 874
			int[] var1 = new int[3]; // L: 875
			int var2 = 0; // L: 876
			Iterator var3 = this.field3481.method3279().iterator(); // L: 877

			while (var3.hasNext()) {
				class172 var4 = (class172)var3.next(); // L: 878
				if (!var4.method3385().equals("user_id")) { // L: 880
					if (var4.vmethod3379() != 0) { // L: 881
						return null; // L: 888
					}

					var1[var2++] = var4.vmethod3378(); // L: 882
					if (var2 > 3) { // L: 883
						return null; // L: 884
					}
				}
			}

			return var1; // L: 893
		} else {
			return null;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)Z",
		garbageValue = "1170807425"
	)
	public boolean method6073(UrlRequester var1) {
		if (this.type == 11 && this.field3481 != null) { // L: 897
			this.field3481.method3272(var1); // L: 898
			if (this.field3481.method3310() != this.field3556) { // L: 899
				this.field3556 = this.field3481.method3310(); // L: 900
				if (this.field3556 >= 100) { // L: 901
					return true; // L: 902
				}

				if (this.field3556 == 2) { // L: 904
					this.method6130(); // L: 905
					return true; // L: 906
				}
			}

			return false; // L: 909
		} else {
			return false;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-584466588"
	)
	void method6130() {
		this.noClickThrough = true; // L: 930
		ArrayList var1 = this.field3481.method3276(); // L: 931
		ArrayList var2 = this.field3481.method3325(); // L: 932
		int var3 = var1.size() + var2.size(); // L: 933
		this.children = new Widget[var3]; // L: 934
		int var4 = 0; // L: 935

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 936 943
			class167 var6 = (class167)var5.next(); // L: 937
			var7 = ItemComposition.method3845(5, this, var4, 0, 0, 0, 0, var6.field1814); // L: 939
			var7.field3518 = var6.field1815.method2716(); // L: 940
			class297 var8 = new class297(var6.field1815); // L: 941
			field3472.method7209(var7.field3518, var8); // L: 942
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 946 954
			class168 var9 = (class168)var5.next(); // L: 947
			var7 = ItemComposition.method3845(4, this, var4, 0, 0, 0, 0, var9.field1816); // L: 949
			var7.text = var9.field1818; // L: 950
			var7.fontId = (Integer)this.field3553.get(var9.field1822); // L: 951
			var7.textXAlignment = var9.field1820; // L: 952
			var7.textYAlignment = var9.field1821; // L: 953
		}

	} // L: 957

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "905045375"
	)
	public void method6120() {
		this.field3495 = new class298(); // L: 960

		for (int var1 = 1; var1 <= 12; ++var1) { // L: 961
			this.field3495.field3411.method406(var1, 0); // L: 962
		}

		for (char var2 = 0; var2 < ' '; ++var2) { // L: 964
			this.field3495.field3411.method407(var2, 0); // L: 965
		}

		this.field3495.field3411.method407('\u0080', 0); // L: 967
		this.field3495.field3411.method406(82, 2); // L: 968
		this.field3495.field3411.method406(81, 2); // L: 969
		this.field3495.field3411.method406(86, 2); // L: 970
	} // L: 971

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lkk;",
		garbageValue = "-59"
	)
	public class300 method6076() {
		return this.field3495 != null ? this.field3495.field3419 : null; // L: 974
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Lkp;",
		garbageValue = "137"
	)
	public class295 method6153() {
		return this.field3495 != null ? this.field3495.field3410 : null; // L: 978
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lah;",
		garbageValue = "-1344349673"
	)
	public class28 method6078() {
		return this.field3495 != null ? this.field3495.field3411 : null; // L: 982
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lkx;",
		garbageValue = "986389984"
	)
	public class298 method6079() {
		return this.field3495; // L: 986
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lkk;I)Z",
		garbageValue = "-1888610169"
	)
	boolean method6092(class300 var1) {
		boolean var2 = false; // L: 990
		if (this.text != null && !this.text.isEmpty()) { // L: 991
			var2 |= var1.method5769(class82.method2229(this.text)); // L: 992
			this.text = ""; // L: 993
		}

		if (this.text2 != null && !this.text2.isEmpty()) { // L: 995
			var2 |= var1.method5790(class82.method2229(this.text2)); // L: 996
			this.text2 = ""; // L: 997
		}

		return var2; // L: 999
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2126650743"
	)
	public boolean method6125() {
		class300 var1 = this.method6076(); // L: 1003
		if (var1 == null) { // L: 1004
			return false;
		} else {
			boolean var2 = false; // L: 1005
			if (!var1.method5906() && this.fontId != -1) { // L: 1006
				int var3 = var1.method5824(); // L: 1007
				int var4 = var1.method5892(); // L: 1008
				int var5 = var1.method5898(); // L: 1009
				int var6 = var1.method5821(); // L: 1010
				Font var7 = this.getFont(); // L: 1011
				if (var7 != null) { // L: 1012
					var2 |= var1.method5771(var7); // L: 1013
					var2 |= this.method6092(var1); // L: 1014
					var2 |= var1.method5946(var3, var4); // L: 1015
					var2 |= var1.method5791(var5, var6); // L: 1016
				}
			} else if (var1.method5906()) { // L: 1019
				var2 |= this.method6092(var1); // L: 1020
			}

			var1.method5945(); // L: 1022
			return var2; // L: 1023
		}
	}
}
