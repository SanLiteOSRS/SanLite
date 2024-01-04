import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("af")
	public static boolean field3656;
	@ObfuscatedName("be")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 898987495
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 355251343
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bi")
	String field3660;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1298751483
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -2064124347
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1851395507
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1934194921
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 899689359
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 370805007
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1183031285
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1753351321
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 521192617
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 831337041
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -528779911
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 461131859
	)
	@Export("x")
	public int x;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -83475937
	)
	@Export("y")
	public int y;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1042121905
	)
	@Export("width")
	public int width;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 809475179
	)
	@Export("height")
	public int height;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1694415347
	)
	public int field3770;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1759456687
	)
	public int field3677;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1196232189
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bb")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -560807423
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1577224389
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1314049341
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -306771027
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1059264411
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1657416623
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1526854807
	)
	public int field3686;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1045698937
	)
	public int field3687;
	@ObfuscatedName("ce")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("fillMode")
	public class538 fillMode;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1522209559
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 307051135
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 87841347
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cl")
	public boolean field3693;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1780213167
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1029572693
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cm")
	public String field3696;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1687935341
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cr")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1017653403
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1616413733
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("cc")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("cu")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -893635797
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 428396117
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1794426991
	)
	int field3705;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -827309595
	)
	int field3652;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 630720109
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1869130737
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 688173561
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 1145081837
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 1017197481
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -99225189
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1181837059
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -91805539
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 335565589
	)
	public int field3684;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -1825252653
	)
	public int field3716;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	public PlayerComposition field3717;
	@ObfuscatedName("do")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("db")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -126179905
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 670283109
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("ds")
	@Export("text")
	public String text;
	@ObfuscatedName("da")
	public String field3723;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 1443424643
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 498505029
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1443148029
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("dv")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	class208 field3678;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1977513085
	)
	int field3729;
	@ObfuscatedName("de")
	HashMap field3730;
	@ObfuscatedName("dn")
	HashMap field3661;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	class339 field3732;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1749722981
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("ec")
	public boolean field3734;
	@ObfuscatedName("ew")
	public byte[][] field3735;
	@ObfuscatedName("ex")
	public byte[][] field3704;
	@ObfuscatedName("ev")
	public int[] field3672;
	@ObfuscatedName("ek")
	public int[] field3756;
	@ObfuscatedName("es")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ea")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 1621194617
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1891288423
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("et")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("er")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("ez")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("eu")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("eg")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ey")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("eb")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("ed")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("eq")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ee")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ej")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ep")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fd")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fm")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fa")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fq")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fe")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("ff")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fb")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fr")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fi")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fo")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fw")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fj")
	public Object[] field3648;
	@ObfuscatedName("fh")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fg")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fl")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fs")
	public Object[] field3771;
	@ObfuscatedName("ft")
	public Object[] field3772;
	@ObfuscatedName("fv")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fp")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fk")
	public Object[] field3676;
	@ObfuscatedName("fz")
	public Object[] field3776;
	@ObfuscatedName("fx")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fu")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fy")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fn")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fc")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gm")
	public Object[] field3782;
	@ObfuscatedName("gw")
	public Object[] field3783;
	@ObfuscatedName("gl")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("ge")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gs")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = -2125883859
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gp")
	public String field3788;
	@ObfuscatedName("gq")
	public String field3789;
	@ObfuscatedName("gn")
	public int[] field3790;
	@ObfuscatedName("gb")
	public int[] field3791;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 1760219883
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 756629683
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 1041568375
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 1736395543
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "[Lnn;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gt")
	public boolean field3797;
	@ObfuscatedName("gg")
	public boolean field3798;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = -907772875
	)
	public int field3799;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = -841827367
	)
	public int field3800;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 951832917
	)
	public int field3801;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 518710051
	)
	public int field3763;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = -1856912927
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 960398105
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("go")
	public int[] field3805;
	@ObfuscatedName("gh")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gd")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hb")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3656 = false; // L: 50
	}

	public Widget() {
		this.isIf3 = false; // L: 51
		this.id = -1; // L: 52
		this.childIndex = -1; // L: 53
		this.buttonType = 0; // L: 56
		this.contentType = 0; // L: 57
		this.xAlignment = 0; // L: 58
		this.yAlignment = 0; // L: 59
		this.widthAlignment = 0; // L: 60
		this.heightAlignment = 0; // L: 61
		this.rawX = 0; // L: 62
		this.rawY = 0; // L: 63
		this.rawWidth = 0; // L: 64
		this.rawHeight = 0; // L: 65
		this.x = 0; // L: 66
		this.y = 0; // L: 67
		this.width = 0; // L: 68
		this.height = 0; // L: 69
		this.field3770 = 1; // L: 70
		this.field3677 = 1; // L: 71
		this.parentId = -1; // L: 72
		this.isHidden = false; // L: 73
		this.scrollX = 0; // L: 74
		this.scrollY = 0; // L: 75
		this.scrollWidth = 0; // L: 76
		this.scrollHeight = 0; // L: 77
		this.color = 0; // L: 78
		this.color2 = 0; // L: 79
		this.field3686 = 0; // L: 80
		this.field3687 = 0; // L: 81
		this.fill = false; // L: 82
		this.fillMode = class538.SOLID; // L: 83
		this.transparencyTop = 0; // L: 84
		this.transparencyBot = 0; // L: 85
		this.lineWid = 1; // L: 86
		this.field3693 = false; // L: 87
		this.spriteId2 = -1; // L: 88
		this.spriteId = -1; // L: 89
		this.spriteAngle = 0; // L: 91
		this.spriteTiling = false; // L: 92
		this.outline = 0; // L: 93
		this.spriteShadow = 0; // L: 94
		this.modelType = 1; // L: 97
		this.modelId = -1; // L: 98
		this.field3705 = 1; // L: 99
		this.field3652 = -1; // L: 100
		this.sequenceId = -1; // L: 101
		this.sequenceId2 = -1; // L: 102
		this.modelOffsetX = 0; // L: 103
		this.modelOffsetY = 0; // L: 104
		this.modelAngleX = 0; // L: 105
		this.modelAngleY = 0; // L: 106
		this.modelAngleZ = 0; // L: 107
		this.modelZoom = 100; // L: 108
		this.field3684 = 0; // L: 109
		this.field3716 = 0; // L: 110
		this.modelOrthog = false; // L: 112
		this.modelTransparency = false; // L: 113
		this.itemQuantityMode = 2; // L: 114
		this.fontId = -1; // L: 115
		this.text = ""; // L: 116
		this.field3723 = ""; // L: 117
		this.textLineHeight = 0; // L: 118
		this.textXAlignment = 0; // L: 119
		this.textYAlignment = 0; // L: 120
		this.textShadowed = false; // L: 121
		this.field3729 = -1; // L: 123
		this.flags = 0; // L: 128
		this.field3734 = false; // L: 129
		this.dataText = ""; // L: 138
		this.parent = null; // L: 140
		this.dragZoneSize = 0; // L: 141
		this.dragThreshold = 0; // L: 142
		this.isScrollBar = false; // L: 143
		this.spellActionName = ""; // L: 144
		this.hasListener = false; // L: 145
		this.mouseOverRedirect = -1; // L: 186
		this.field3788 = ""; // L: 187
		this.field3789 = "Ok"; // L: 188
		this.itemId = -1; // L: 191
		this.itemQuantity = 0; // L: 192
		this.modelFrame = 0; // L: 193
		this.modelFrameCycle = 0; // L: 194
		this.field3797 = false; // L: 196
		this.field3798 = false; // L: 197
		this.field3799 = -1; // L: 198
		this.field3800 = 0; // L: 199
		this.field3801 = 0; // L: 200
		this.field3763 = 0; // L: 201
		this.rootIndex = -1; // L: 202
		this.cycle = -1; // L: 203
		this.noClickThrough = false; // L: 205
		this.noScrollThrough = false; // L: 206
		this.prioritizeMenuEntry = false; // L: 207
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "1076912273"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 210
		this.type = var1.readUnsignedByte(); // L: 211
		this.buttonType = var1.readUnsignedByte(); // L: 212
		this.contentType = var1.readUnsignedShort(); // L: 213
		this.rawX = var1.readShort(); // L: 214
		this.rawY = var1.readShort(); // L: 215
		this.rawWidth = var1.readUnsignedShort(); // L: 216
		this.rawHeight = var1.readUnsignedShort(); // L: 217
		this.transparencyTop = var1.readUnsignedByte(); // L: 218
		this.parentId = var1.readUnsignedShort(); // L: 219
		if (this.parentId == 65535) { // L: 220
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 221
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 222
		if (this.mouseOverRedirect == 65535) { // L: 223
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 224
		int var3;
		if (var2 > 0) { // L: 225
			this.cs1Comparisons = new int[var2]; // L: 226
			this.cs1ComparisonValues = new int[var2]; // L: 227

			for (var3 = 0; var3 < var2; ++var3) { // L: 228
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 229
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 230
			}
		}

		var3 = var1.readUnsignedByte(); // L: 233
		int var4;
		if (var3 > 0) { // L: 234
			this.cs1Instructions = new int[var3][]; // L: 235

			for (var4 = 0; var4 < var3; ++var4) { // L: 236
				int var5 = var1.readUnsignedShort(); // L: 237
				this.cs1Instructions[var4] = new int[var5]; // L: 238

				for (int var6 = 0; var6 < var5; ++var6) { // L: 239
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 240
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 241
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 245
			this.scrollHeight = var1.readUnsignedShort(); // L: 246
			this.isHidden = var1.readUnsignedByte() == 1; // L: 247
		}

		if (this.type == 1) { // L: 249
			var1.readUnsignedShort(); // L: 250
			var1.readUnsignedByte(); // L: 251
		}

		if (this.type == 3) { // L: 253
			this.fill = var1.readUnsignedByte() == 1; // L: 254
		}

		if (this.type == 4 || this.type == 1) { // L: 256
			this.textXAlignment = var1.readUnsignedByte(); // L: 257
			this.textYAlignment = var1.readUnsignedByte(); // L: 258
			this.textLineHeight = var1.readUnsignedByte(); // L: 259
			this.fontId = var1.readUnsignedShort(); // L: 260
			if (this.fontId == 65535) { // L: 261
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 262
		}

		if (this.type == 4) { // L: 264
			this.text = var1.readStringCp1252NullTerminated(); // L: 265
			this.field3723 = var1.readStringCp1252NullTerminated(); // L: 266
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 268
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 269
			this.color2 = var1.readInt(); // L: 270
			this.field3686 = var1.readInt(); // L: 271
			this.field3687 = var1.readInt(); // L: 272
		}

		if (this.type == 5) { // L: 274
			this.spriteId2 = var1.readInt(); // L: 275
			this.spriteId = var1.readInt(); // L: 276
		}

		if (this.type == 6) { // L: 278
			this.modelType = 1; // L: 279
			this.modelId = var1.readUnsignedShort(); // L: 280
			if (this.modelId == 65535) { // L: 281
				this.modelId = -1;
			}

			this.field3705 = 1; // L: 282
			this.field3652 = var1.readUnsignedShort(); // L: 283
			if (this.field3652 == 65535) { // L: 284
				this.field3652 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 285
			if (this.sequenceId == 65535) { // L: 286
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 287
			if (this.sequenceId2 == 65535) { // L: 288
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 289
			this.modelAngleX = var1.readUnsignedShort(); // L: 290
			this.modelAngleY = var1.readUnsignedShort(); // L: 291
		}

		if (this.type == 8) { // L: 293
			this.text = var1.readStringCp1252NullTerminated(); // L: 294
		}

		if (this.buttonType == 2) { // L: 296
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 297
			this.field3788 = var1.readStringCp1252NullTerminated(); // L: 298
			var4 = var1.readUnsignedShort() & 63; // L: 299
			this.flags |= var4 << 11; // L: 300
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 302
			this.field3789 = var1.readStringCp1252NullTerminated(); // L: 303
			if (this.field3789.length() == 0) { // L: 304
				if (this.buttonType == 1) { // L: 305
					this.field3789 = "Ok";
				}

				if (this.buttonType == 4) { // L: 306
					this.field3789 = "Select";
				}

				if (this.buttonType == 5) { // L: 307
					this.field3789 = "Select";
				}

				if (this.buttonType == 6) { // L: 308
					this.field3789 = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 311
			this.flags |= 4194304; // L: 312
		}

		if (this.buttonType == 6) { // L: 314
			this.flags |= 1; // L: 315
		}

	} // L: 317

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "167197032"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 320
		this.isIf3 = true; // L: 321
		this.type = var1.readUnsignedByte(); // L: 322
		this.contentType = var1.readUnsignedShort(); // L: 323
		this.rawX = var1.readShort(); // L: 324
		this.rawY = var1.readShort(); // L: 325
		this.rawWidth = var1.readUnsignedShort(); // L: 326
		if (this.type == 9) { // L: 327
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 328
		}

		this.widthAlignment = var1.readByte(); // L: 329
		this.heightAlignment = var1.readByte(); // L: 330
		this.xAlignment = var1.readByte(); // L: 331
		this.yAlignment = var1.readByte(); // L: 332
		this.parentId = var1.readUnsignedShort(); // L: 333
		if (this.parentId == 65535) { // L: 334
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 335
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 336
		if (this.type == 0) { // L: 337
			this.scrollWidth = var1.readUnsignedShort(); // L: 338
			this.scrollHeight = var1.readUnsignedShort(); // L: 339
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 340
		}

		if (this.type == 5) { // L: 342
			this.spriteId2 = var1.readInt(); // L: 343
			this.spriteAngle = var1.readUnsignedShort(); // L: 344
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 345
			this.transparencyTop = var1.readUnsignedByte(); // L: 346
			this.outline = var1.readUnsignedByte(); // L: 347
			this.spriteShadow = var1.readInt(); // L: 348
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 349
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 350
		}

		if (this.type == 6) { // L: 352
			this.modelType = 1; // L: 353
			this.modelId = var1.readUnsignedShort(); // L: 354
			if (this.modelId == 65535) { // L: 355
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 356
			this.modelOffsetY = var1.readShort(); // L: 357
			this.modelAngleX = var1.readUnsignedShort(); // L: 358
			this.modelAngleY = var1.readUnsignedShort(); // L: 359
			this.modelAngleZ = var1.readUnsignedShort(); // L: 360
			this.modelZoom = var1.readUnsignedShort(); // L: 361
			this.sequenceId = var1.readUnsignedShort(); // L: 362
			if (this.sequenceId == 65535) { // L: 363
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 364
			var1.readUnsignedShort(); // L: 365
			if (this.widthAlignment != 0) { // L: 366
				this.field3684 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 367
				var1.readUnsignedShort(); // L: 368
			}
		}

		if (this.type == 4) { // L: 371
			this.fontId = var1.readUnsignedShort(); // L: 372
			if (this.fontId == 65535) { // L: 373
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 374
			this.textLineHeight = var1.readUnsignedByte(); // L: 375
			this.textXAlignment = var1.readUnsignedByte(); // L: 376
			this.textYAlignment = var1.readUnsignedByte(); // L: 377
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 378
			this.color = var1.readInt(); // L: 379
		}

		if (this.type == 3) { // L: 381
			this.color = var1.readInt(); // L: 382
			this.fill = var1.readUnsignedByte() == 1; // L: 383
			this.transparencyTop = var1.readUnsignedByte(); // L: 384
		}

		if (this.type == 9) { // L: 386
			this.lineWid = var1.readUnsignedByte(); // L: 387
			this.color = var1.readInt(); // L: 388
			this.field3693 = var1.readUnsignedByte() == 1; // L: 389
		}

		this.flags = var1.readMedium(); // L: 391
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 392
		int var2 = var1.readUnsignedByte(); // L: 393
		if (var2 > 0) { // L: 394
			this.actions = new String[var2]; // L: 395

			for (int var3 = 0; var3 < var2; ++var3) { // L: 396
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 398
		this.dragThreshold = var1.readUnsignedByte(); // L: 399
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 400
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 401
		this.onLoad = this.readListener(var1); // L: 402
		this.onMouseOver = this.readListener(var1); // L: 403
		this.onMouseLeave = this.readListener(var1); // L: 404
		this.onTargetLeave = this.readListener(var1); // L: 405
		this.onTargetEnter = this.readListener(var1); // L: 406
		this.onVarTransmit = this.readListener(var1); // L: 407
		this.onInvTransmit = this.readListener(var1); // L: 408
		this.onStatTransmit = this.readListener(var1); // L: 409
		this.onTimer = this.readListener(var1); // L: 410
		this.onOp = this.readListener(var1); // L: 411
		this.onMouseRepeat = this.readListener(var1); // L: 412
		this.onClick = this.readListener(var1); // L: 413
		this.onClickRepeat = this.readListener(var1); // L: 414
		this.onRelease = this.readListener(var1); // L: 415
		this.onHold = this.readListener(var1); // L: 416
		this.onDrag = this.readListener(var1); // L: 417
		this.onDragComplete = this.readListener(var1); // L: 418
		this.onScroll = this.readListener(var1); // L: 419
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 420
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 421
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 422
	} // L: 423

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "361710485"
	)
	void method6766(Buffer var1) {
		this.field3660 = var1.readStringCp1252NullTerminated(); // L: 426
	} // L: 427

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)[Ljava/lang/Object;",
		garbageValue = "-1864963770"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 430
		if (var2 == 0) { // L: 431
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 432

			for (int var4 = 0; var4 < var2; ++var4) { // L: 433
				int var5 = var1.readUnsignedByte(); // L: 434
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 435
				} else if (var5 == 1) { // L: 436
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 438
			return var3; // L: 439
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)[I",
		garbageValue = "1916026116"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 443
		if (var2 == 0) { // L: 444
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 445

			for (int var4 = 0; var4 < var2; ++var4) { // L: 446
				var3[var4] = var1.readInt(); // L: 447
			}

			return var3; // L: 449
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lmr;ZLel;I)Luz;",
		garbageValue = "-1408001366"
	)
	public SpritePixels method6661(class335 var1, boolean var2, UrlRequester var3) {
		field3656 = false; // L: 453
		if (this.field3696 != null) { // L: 454
			SpritePixels var4 = this.method6662(var1, var3); // L: 455
			if (var4 != null) { // L: 456
				return var4; // L: 457
			}
		}

		int var8;
		if (var2) { // L: 461
			var8 = this.spriteId;
		} else {
			var8 = this.spriteId2; // L: 462
		}

		if (var8 == -1) { // L: 463
			return null;
		} else {
			long var5 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var8; // L: 464
			SpritePixels var7 = (SpritePixels)var1.field3571.get(var5); // L: 465
			if (var7 != null) { // L: 466
				return var7;
			} else {
				var7 = IgnoreList.SpriteBuffer_getSprite(var1.field3575, var8, 0); // L: 467
				if (var7 == null) { // L: 468
					field3656 = true; // L: 469
					return null; // L: 470
				} else {
					this.method6665(var7); // L: 472
					var1.field3571.put(var7, var5); // L: 473
					return var7; // L: 474
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lmr;Lel;I)Luz;",
		garbageValue = "243499919"
	)
	SpritePixels method6662(class335 var1, UrlRequester var2) {
		if (!this.method6664()) { // L: 478
			return this.method6663(var1, var2); // L: 479
		} else {
			String var3 = this.field3696 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 481
			SpritePixels var4 = (SpritePixels)var1.field3576.method8022(var3); // L: 482
			if (var4 == null) { // L: 483
				SpritePixels var5 = this.method6663(var1, var2); // L: 484
				if (var5 != null) { // L: 485
					var4 = var5.method9737(); // L: 486
					this.method6665(var4); // L: 487
					var1.field3576.method8037(var3, var4); // L: 488
				}
			}

			return var4; // L: 491
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lmr;Lel;I)Luz;",
		garbageValue = "769156512"
	)
	SpritePixels method6663(class335 var1, UrlRequester var2) {
		if (this.field3696 != null && var2 != null) { // L: 495
			class338 var3 = (class338)var1.field3567.method8022(this.field3696); // L: 496
			if (var3 == null) { // L: 497
				var3 = new class338(this.field3696, var2); // L: 498
				var1.field3567.method8037(this.field3696, var3); // L: 499
			}

			return var3.method6307(); // L: 501
		} else {
			return null; // L: 503
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "623493870"
	)
	boolean method6664() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 507
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Luz;I)V",
		garbageValue = "-891883391"
	)
	void method6665(SpritePixels var1) {
		if (this.spriteFlipV) { // L: 511
			var1.flipVertically();
		}

		if (this.spriteFlipH) { // L: 512
			var1.flipHorizontally();
		}

		if (this.outline > 0) { // L: 513
			var1.pad(this.outline);
		}

		if (this.outline >= 1) { // L: 514
			var1.outline(1);
		}

		if (this.outline >= 2) {
			var1.outline(16777215); // L: 515
		}

		if (this.spriteShadow != 0) { // L: 516
			var1.shadow(this.spriteShadow);
		}

	} // L: 517

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lmr;I)Lpf;",
		garbageValue = "1649883355"
	)
	public Font method6666(class335 var1) {
		field3656 = false; // L: 520
		if (this.fontId == -1) { // L: 521
			return null;
		} else {
			Font var2 = (Font)var1.field3573.get((long)this.fontId); // L: 522
			if (var2 != null) { // L: 523
				return var2;
			} else {
				AbstractArchive var4 = var1.field3575; // L: 525
				AbstractArchive var5 = var1.field3563; // L: 526
				int var6 = this.fontId; // L: 527
				byte[] var8 = var4.takeFile(var6, 0); // L: 531
				boolean var7;
				if (var8 == null) { // L: 532
					var7 = false; // L: 533
				} else {
					class162.SpriteBuffer_decode(var8); // L: 536
					var7 = true; // L: 537
				}

				Font var3;
				if (!var7) { // L: 539
					var3 = null; // L: 540
				} else {
					var3 = WorldMapArea.method4590(var5.takeFile(var6, 0)); // L: 543
				}

				if (var3 != null) {
					var1.field3573.put(var3, (long)this.fontId); // L: 546
				} else {
					field3656 = true; // L: 547
				}

				return var3; // L: 548
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lmr;Lhx;IZLnb;Lhw;Lhf;B)Lka;",
		garbageValue = "52"
	)
	public Model method6667(class335 var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, class187 var7) {
		field3656 = false; // L: 552
		int var8;
		int var9;
		if (var4) { // L: 555
			var8 = this.field3705; // L: 556
			var9 = this.field3652; // L: 557
		} else {
			var8 = this.modelType; // L: 560
			var9 = this.modelId; // L: 561
		}

		if (var8 == 6) { // L: 563
			if (var6 == null) { // L: 564
				return null;
			}

			var9 = var6.id; // L: 565
		}

		if (var8 == 0) { // L: 567
			return null;
		} else if (var8 == 1 && var9 == -1) { // L: 568
			return null;
		} else {
			if (var7 != null && var7.field1914 && var8 == 6) { // L: 569
				var8 = 3; // L: 570
			}

			long var10 = (long)(var9 + (var8 << 16)); // L: 572
			if (var7 != null) { // L: 573
				var10 |= var7.field1917 << 20;
			}

			Model var12 = (Model)var1.field3570.get(var10); // L: 574
			if (var12 == null) { // L: 575
				ModelData var13 = null; // L: 576
				int var14 = 64; // L: 577
				int var15 = 768; // L: 578
				switch(var8) { // L: 579
				case 1:
					var13 = ModelData.ModelData_get(var1.field3565, var9, 0); // L: 596
					break;
				case 2:
					var13 = VerticalAlignment.getNpcDefinition(var9).method3696((class187)null); // L: 593
					break; // L: 594
				case 3:
					var13 = var5 != null ? var5.getModelData() : null; // L: 590
					break; // L: 591
				case 4:
					ItemComposition var16 = class214.ItemComposition_get(var9); // L: 581
					var13 = var16.getModelData(10); // L: 582
					var14 += var16.field2173; // L: 583
					var15 += var16.field2179; // L: 584
				case 5:
				default:
					break;
				case 6:
					var13 = VerticalAlignment.getNpcDefinition(var9).method3696(var7); // L: 587
				}

				if (var13 == null) { // L: 599
					field3656 = true; // L: 600
					return null; // L: 601
				}

				var12 = var13.toModel(var14, var15, -50, -10, -50); // L: 603
				var1.field3570.put(var12, var10); // L: 604
			}

			if (var2 != null) { // L: 606
				var12 = var2.transformWidgetModel(var12, var3); // L: 607
			}

			return var12; // L: 609
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lmr;ZB)Lme;",
		garbageValue = "4"
	)
	public SpriteMask method6668(class335 var1, boolean var2) {
		if (this.spriteId == -1) { // L: 613
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2; // L: 614
		if (var3 == -1) { // L: 615
			return null;
		} else {
			long var4 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var3 + ((long)this.outline << 36) + ((long)this.spriteShadow << 40); // L: 616
			SpriteMask var6 = (SpriteMask)var1.field3574.get(var4); // L: 617
			if (var6 != null) { // L: 618
				return var6;
			} else {
				SpritePixels var7 = this.method6661(var1, var2, (UrlRequester)null); // L: 619
				if (var7 == null) { // L: 620
					return null;
				} else {
					SpritePixels var8 = var7.copyNormalized(); // L: 621
					int[] var9 = new int[var8.subHeight]; // L: 622
					int[] var10 = new int[var8.subHeight]; // L: 623

					for (int var11 = 0; var11 < var8.subHeight; ++var11) { // L: 624
						int var12 = 0; // L: 625
						int var13 = var8.subWidth; // L: 626

						int var14;
						for (var14 = 0; var14 < var8.subWidth; ++var14) { // L: 627
							if (var8.pixels[var14 + var11 * var8.subWidth] == 0) { // L: 628
								var12 = var14; // L: 629
								break;
							}
						}

						for (var14 = var8.subWidth - 1; var14 >= var12; --var14) { // L: 633
							if (var8.pixels[var14 + var11 * var8.subWidth] == 0) { // L: 634
								var13 = var14 + 1; // L: 635
								break;
							}
						}

						var9[var11] = var12; // L: 639
						var10[var11] = var13 - var12; // L: 640
					}

					var6 = new SpriteMask(var8.subWidth, var8.subHeight, var10, var9, var3); // L: 642
					var1.field3574.put(var6, var4); // L: 643
					return var6; // L: 644
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-73"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 648
			String[] var3 = new String[var1 + 1]; // L: 649
			if (this.actions != null) { // L: 650
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 651
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 653
		}

		this.actions[var1] = var2; // L: 655
	} // L: 656

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "101495939"
	)
	public boolean method6708() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12; // L: 659
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "54"
	)
	public boolean method6771() {
		return this.type == 11 || this.type == 12; // L: 663
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;J)V"
	)
	public void method6672(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && -1L != var3) { // L: 667
			var1 = var1.replaceAll("%userid%", Long.toString(var3)); // L: 668
			this.field3678 = new class208(); // L: 669
			if (!this.field3678.method4161(var1, var2)) { // L: 670
				this.field3678 = null; // L: 671
			} else {
				if (this.field3730 == null || this.field3661 == null) { // L: 674
					this.method6676(); // L: 675
				}

			}
		}
	} // L: 672 677

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;I)V",
		garbageValue = "-1255401092"
	)
	public void method6673(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) { // L: 680
			this.field3678 = new class208(); // L: 681
			this.field3678.method4132(var1, var2); // L: 682
		}
	} // L: 683

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1944060082"
	)
	void method6676() {
		this.field3730 = new HashMap(); // L: 686
		this.field3661 = new HashMap(); // L: 687
	} // L: 688

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "105"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		if (this.type == 11) { // L: 691
			if (this.field3730 == null) { // L: 692
				this.method6676();
			}

			this.field3730.put(var1, var2); // L: 693
		}
	} // L: 694

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "40"
	)
	public void method6781(String var1, int var2) {
		if (this.type == 11) { // L: 697
			if (this.field3661 == null) { // L: 698
				this.method6676();
			}

			this.field3661.put(var1, var2); // L: 699
		}
	} // L: 700

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-1885191377"
	)
	public boolean method6723(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3678 != null && this.method6682()) { // L: 703
			var1 -= var3; // L: 704
			var2 -= var4; // L: 705
			int var5 = (int)(this.field3678.method4183()[0] * (float)this.width); // L: 706
			int var6 = (int)(this.field3678.method4183()[1] * (float)this.height); // L: 707
			int var7 = var5 + (int)(this.field3678.method4183()[2] * (float)this.width); // L: 708
			int var8 = var6 + (int)(this.field3678.method4183()[3] * (float)this.height); // L: 709
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8; // L: 710
		} else {
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "29"
	)
	public boolean method6682() {
		return this.field3729 == 2; // L: 714
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-720840753"
	)
	public int method6677(String var1) {
		return this.type == 11 && this.field3678 != null && this.method6682() ? this.field3678.method4114(var1) : -1; // L: 718 719 721
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1149651075"
	)
	public String method6765(String var1) {
		return this.type == 11 && this.field3678 != null && this.method6682() ? this.field3678.method4118(var1) : null; // L: 725 726
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2095276271"
	)
	public int method6681() {
		return this.field3661 != null && this.field3661.size() > 0 ? 1 : 0; // L: 730
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1126201283"
	)
	public int method6689() {
		if (this.type == 11 && this.field3678 != null && this.field3661 != null && !this.field3661.isEmpty()) { // L: 734
			String var1 = this.field3678.method4121(); // L: 735
			return var1 != null && this.field3661.containsKey(this.field3678.method4121()) ? (Integer)this.field3661.get(var1) : -1; // L: 736 737 739
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "81"
	)
	public String method6683() {
		if (this.type == 11 && this.field3678 != null) { // L: 743
			String var1 = this.field3678.method4121(); // L: 744
			Iterator var2 = this.field3678.method4123().iterator(); // L: 745

			while (var2.hasNext()) {
				class219 var3 = (class219)var2.next(); // L: 746
				String var4 = String.format("%%%S%%", var3.method4251()); // L: 748
				if (var3.vmethod4266() == 0) { // L: 749
					var1.replaceAll(var4, Integer.toString(var3.vmethod4255())); // L: 750
				} else {
					var1.replaceAll(var4, var3.vmethod4250()); // L: 753
				}
			}

			return var1; // L: 757
		} else {
			return null; // L: 756
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-61"
	)
	public int[] method6684() {
		if (this.type == 11 && this.field3678 != null) { // L: 761
			int[] var1 = new int[3]; // L: 762
			int var2 = 0; // L: 763
			Iterator var3 = this.field3678.method4123().iterator(); // L: 764

			while (var3.hasNext()) {
				class219 var4 = (class219)var3.next(); // L: 765
				if (!var4.method4251().equals("user_id")) { // L: 767
					if (var4.vmethod4266() != 0) { // L: 768
						return null; // L: 775
					}

					var1[var2++] = var4.vmethod4255(); // L: 769
					if (var2 > 3) { // L: 770
						return null; // L: 771
					}
				}
			}

			return var1; // L: 780
		} else {
			return null;
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lmr;Lel;I)Z",
		garbageValue = "1588534614"
	)
	public boolean method6675(class335 var1, UrlRequester var2) {
		if (this.type == 11 && this.field3678 != null) { // L: 784
			this.field3678.method4115(var2); // L: 785
			if (this.field3678.method4124() != this.field3729) { // L: 786
				this.field3729 = this.field3678.method4124(); // L: 787
				if (this.field3729 >= 100) { // L: 788
					return true; // L: 789
				}

				if (this.field3729 == 2) { // L: 791
					this.method6686(var1); // L: 792
					return true; // L: 793
				}
			}

			return false; // L: 796
		} else {
			return false;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lmr;I)V",
		garbageValue = "1425941595"
	)
	void method6686(class335 var1) {
		this.noClickThrough = true; // L: 817
		ArrayList var2 = this.field3678.method4119(); // L: 818
		ArrayList var3 = this.field3678.method4120(); // L: 819
		int var4 = var2.size() + var3.size(); // L: 820
		this.children = new Widget[var4]; // L: 821
		int var5 = 0; // L: 822

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) { // L: 823 830
			class214 var7 = (class214)var6.next(); // L: 824
			var8 = class160.method3433(5, this, var5, 0, 0, 0, 0, var7.field2300); // L: 826
			var8.field3696 = var7.field2303.method2928(); // L: 827
			class338 var9 = new class338(var7.field2303); // L: 828
			var1.field3567.method8037(var8.field3696, var9); // L: 829
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) { // L: 833 841
			class215 var10 = (class215)var6.next(); // L: 834
			var8 = class160.method3433(4, this, var5, 0, 0, 0, 0, var10.field2306); // L: 836
			var8.text = var10.field2312; // L: 837
			var8.fontId = (Integer)this.field3730.get(var10.field2310); // L: 838
			var8.textXAlignment = var10.field2308; // L: 839
			var8.textYAlignment = var10.field2309; // L: 840
		}

	} // L: 844

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1475013178"
	)
	public void method6687() {
		this.field3732 = new class339(); // L: 847

		for (int var1 = 1; var1 <= 12; ++var1) { // L: 848
			this.field3732.field3594.method404(var1, 0); // L: 849
		}

		for (char var2 = 0; var2 < ' '; ++var2) { // L: 851
			this.field3732.field3594.method406(var2, 0); // L: 852
		}

		this.field3732.field3594.method406('\u0080', 0); // L: 854
		this.field3732.field3594.method404(82, 2); // L: 855
		this.field3732.field3594.method404(81, 2); // L: 856
		this.field3732.field3594.method404(86, 2); // L: 857
	} // L: 858

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Lni;",
		garbageValue = "-2105376256"
	)
	public class341 method6688() {
		return this.field3732 != null ? this.field3732.field3593 : null; // L: 861
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)Lmp;",
		garbageValue = "-116"
	)
	public class336 method6724() {
		return this.field3732 != null ? this.field3732.field3589 : null; // L: 865
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Lbd;",
		garbageValue = "-35642997"
	)
	public class27 method6690() {
		return this.field3732 != null ? this.field3732.field3594 : null; // L: 869
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Lnq;",
		garbageValue = "1933652600"
	)
	public class339 method6767() {
		return this.field3732; // L: 873
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lni;I)Z",
		garbageValue = "588474161"
	)
	boolean method6692(class341 var1) {
		boolean var2 = false; // L: 877
		String var5;
		String var6;
		StringBuilder var7;
		int var8;
		int var9;
		int var10;
		char var11;
		String var12;
		if (this.text != null && !this.text.isEmpty()) { // L: 878
			var6 = this.text; // L: 882
			var7 = new StringBuilder(var6.length()); // L: 884
			var8 = 0; // L: 885
			var9 = -1; // L: 886

			for (var10 = 0; var10 < var6.length(); ++var10) { // L: 887
				var11 = var6.charAt(var10); // L: 888
				if (var11 == '<') { // L: 889
					var7.append(var6.substring(var8, var10)); // L: 890
					var9 = var10; // L: 891
				} else if (var11 == '>' && var9 != -1) { // L: 894
					var12 = var6.substring(var9 + 1, var10); // L: 895
					var9 = -1; // L: 896
					if (var12.equals("lt")) { // L: 897
						var7.append("<"); // L: 898
					} else if (var12.equals("gt")) { // L: 900
						var7.append(">"); // L: 901
					} else if (var12.equals("br")) { // L: 903
						var7.append("\n"); // L: 904
					}

					var8 = var10 + 1; // L: 906
				}
			}

			if (var8 < var6.length()) { // L: 909
				var7.append(var6.substring(var8, var6.length())); // L: 910
			}

			var5 = var7.toString(); // L: 912
			var2 |= var1.method6363(var5); // L: 914
			this.text = ""; // L: 915
		}

		if (this.field3723 != null && !this.field3723.isEmpty()) { // L: 917
			var6 = this.field3723; // L: 921
			var7 = new StringBuilder(var6.length()); // L: 923
			var8 = 0; // L: 924
			var9 = -1; // L: 925

			for (var10 = 0; var10 < var6.length(); ++var10) { // L: 926
				var11 = var6.charAt(var10); // L: 927
				if (var11 == '<') { // L: 928
					var7.append(var6.substring(var8, var10)); // L: 929
					var9 = var10; // L: 930
				} else if (var11 == '>' && var9 != -1) { // L: 933
					var12 = var6.substring(var9 + 1, var10); // L: 934
					var9 = -1; // L: 935
					if (var12.equals("lt")) { // L: 936
						var7.append("<"); // L: 937
					} else if (var12.equals("gt")) { // L: 939
						var7.append(">"); // L: 940
					} else if (var12.equals("br")) { // L: 942
						var7.append("\n"); // L: 943
					}

					var8 = var10 + 1; // L: 945
				}
			}

			if (var8 < var6.length()) { // L: 948
				var7.append(var6.substring(var8, var6.length())); // L: 949
			}

			var5 = var7.toString(); // L: 951
			var2 |= var1.method6364(var5); // L: 953
			this.field3723 = ""; // L: 954
		}

		return var2; // L: 956
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lmr;B)Z",
		garbageValue = "16"
	)
	public boolean method6693(class335 var1) {
		class341 var2 = this.method6688(); // L: 960
		if (var2 == null) { // L: 961
			return false;
		} else {
			boolean var3 = false; // L: 962
			if (!var2.method6394() && this.fontId != -1) { // L: 963
				int var4 = var2.method6418(); // L: 964
				int var5 = var2.method6419(); // L: 965
				int var6 = var2.method6416(); // L: 966
				int var7 = var2.method6415(); // L: 967
				Font var8 = this.method6666(var1); // L: 968
				if (var8 != null) { // L: 969
					var3 |= var2.method6431(var8); // L: 970
					var3 |= this.method6692(var2); // L: 971
					var3 |= var2.method6370(var4, var5); // L: 972
					var3 |= var2.method6385(var6, var7); // L: 973
				}
			} else if (var2.method6394()) { // L: 976
				var3 |= this.method6692(var2); // L: 977
			}

			var2.method6360(); // L: 979
			return var3; // L: 980
		}
	}
}
