import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("ap")
	public static boolean field3722;
	@ObfuscatedName("bu")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -917460645
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1764737119
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bi")
	String field3846;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 977562029
	)
	@Export("type")
	public int type;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -790461157
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 679311073
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -961347441
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1875804249
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -62312661
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1667328247
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -529355443
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -261089931
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1395939909
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -2122425781
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 717289299
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 205750255
	)
	@Export("y")
	public int y;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 671919047
	)
	@Export("width")
	public int width;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -119051865
	)
	@Export("height")
	public int height;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 261788723
	)
	public int field3843;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -839282761
	)
	public int field3732;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -573415813
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bs")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -2065058739
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 982634871
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 633921523
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 2008959905
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1900478447
	)
	@Export("color")
	public int color;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1577261457
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -156786775
	)
	public int field3752;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 250967983
	)
	public int field3743;
	@ObfuscatedName("cn")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("fillMode")
	public class545 fillMode;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1725480751
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1928836609
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1508698367
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cx")
	public boolean field3759;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 433678453
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -1227003229
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cu")
	public String field3762;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1383023963
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cv")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 168489719
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1074151339
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("ck")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("ca")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1247373077
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 888768295
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -465503493
	)
	int field3716;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1559029475
	)
	int field3839;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -2076594045
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 614571141
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 987320525
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -817061329
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1336385943
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -2105880485
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 39243971
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -149088277
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -1252270723
	)
	public int field3781;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 2061122223
	)
	public int field3782;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	public PlayerComposition field3774;
	@ObfuscatedName("dm")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("da")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1167605597
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1100838897
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("dh")
	@Export("text")
	public String text;
	@ObfuscatedName("dj")
	public String field3789;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 639261355
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -1319573525
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 745676467
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("dz")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	class210 field3794;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -82963177
	)
	int field3795;
	@ObfuscatedName("df")
	HashMap field3819;
	@ObfuscatedName("db")
	HashMap field3731;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	class345 field3798;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 962213457
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("ea")
	public boolean field3808;
	@ObfuscatedName("ej")
	public byte[][] field3739;
	@ObfuscatedName("ee")
	public byte[][] field3806;
	@ObfuscatedName("ei")
	public int[] field3820;
	@ObfuscatedName("ey")
	public int[] field3804;
	@ObfuscatedName("el")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("eg")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = 698813995
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = 900307939
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("er")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("eh")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("ep")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("es")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("et")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("en")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ed")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("em")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ew")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("eo")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("eq")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ez")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fh")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fi")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fr")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fv")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fj")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fa")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fq")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fk")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fn")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fd")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fc")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fm")
	public Object[] field3833;
	@ObfuscatedName("fy")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fx")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ft")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fu")
	public Object[] field3837;
	@ObfuscatedName("ff")
	public Object[] field3838;
	@ObfuscatedName("fe")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fg")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fs")
	public Object[] field3841;
	@ObfuscatedName("fw")
	public Object[] field3730;
	@ObfuscatedName("fb")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fo")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fz")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fp")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fl")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gt")
	public Object[] field3848;
	@ObfuscatedName("gd")
	public Object[] field3737;
	@ObfuscatedName("gb")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gw")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gh")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = 1442276213
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("ga")
	public String field3785;
	@ObfuscatedName("ge")
	public String field3855;
	@ObfuscatedName("gm")
	public int[] field3856;
	@ObfuscatedName("gg")
	public int[] field3857;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = 826933799
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = -1060107107
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = 1846968521
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = -2111617423
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "[Lng;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gk")
	public boolean field3863;
	@ObfuscatedName("gs")
	public boolean field3864;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = -1359127199
	)
	public int field3865;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = 581236711
	)
	public int field3866;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = -1836213837
	)
	public int field3867;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = -1679653655
	)
	public int field3831;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = -54820285
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 1721708423
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gu")
	public int[] field3871;
	@ObfuscatedName("gc")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gx")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hg")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3722 = false; // L: 51
	}

	public Widget() {
		this.isIf3 = false; // L: 52
		this.id = -1; // L: 53
		this.childIndex = -1; // L: 54
		this.buttonType = 0; // L: 57
		this.contentType = 0; // L: 58
		this.xAlignment = 0; // L: 59
		this.yAlignment = 0; // L: 60
		this.widthAlignment = 0; // L: 61
		this.heightAlignment = 0; // L: 62
		this.rawX = 0; // L: 63
		this.rawY = 0; // L: 64
		this.rawWidth = 0; // L: 65
		this.rawHeight = 0; // L: 66
		this.x = 0; // L: 67
		this.y = 0; // L: 68
		this.width = 0; // L: 69
		this.height = 0; // L: 70
		this.field3843 = 1; // L: 71
		this.field3732 = 1; // L: 72
		this.parentId = -1; // L: 73
		this.isHidden = false; // L: 74
		this.scrollX = 0; // L: 75
		this.scrollY = 0; // L: 76
		this.scrollWidth = 0; // L: 77
		this.scrollHeight = 0; // L: 78
		this.color = 0; // L: 79
		this.color2 = 0; // L: 80
		this.field3752 = 0; // L: 81
		this.field3743 = 0; // L: 82
		this.fill = false; // L: 83
		this.fillMode = class545.SOLID; // L: 84
		this.transparencyTop = 0; // L: 85
		this.transparencyBot = 0; // L: 86
		this.lineWid = 1; // L: 87
		this.field3759 = false; // L: 88
		this.spriteId2 = -1; // L: 89
		this.spriteId = -1; // L: 90
		this.spriteAngle = 0; // L: 92
		this.spriteTiling = false; // L: 93
		this.outline = 0; // L: 94
		this.spriteShadow = 0; // L: 95
		this.modelType = 1; // L: 98
		this.modelId = -1; // L: 99
		this.field3716 = 1; // L: 100
		this.field3839 = -1; // L: 101
		this.sequenceId = -1; // L: 102
		this.sequenceId2 = -1; // L: 103
		this.modelOffsetX = 0; // L: 104
		this.modelOffsetY = 0; // L: 105
		this.modelAngleX = 0; // L: 106
		this.modelAngleY = 0; // L: 107
		this.modelAngleZ = 0; // L: 108
		this.modelZoom = 100; // L: 109
		this.field3781 = 0; // L: 110
		this.field3782 = 0; // L: 111
		this.modelOrthog = false; // L: 113
		this.modelTransparency = false; // L: 114
		this.itemQuantityMode = 2; // L: 115
		this.fontId = -1; // L: 116
		this.text = ""; // L: 117
		this.field3789 = ""; // L: 118
		this.textLineHeight = 0; // L: 119
		this.textXAlignment = 0; // L: 120
		this.textYAlignment = 0; // L: 121
		this.textShadowed = false; // L: 122
		this.field3795 = -1; // L: 124
		this.flags = 0; // L: 129
		this.field3808 = false; // L: 130
		this.dataText = ""; // L: 139
		this.parent = null; // L: 141
		this.dragZoneSize = 0; // L: 142
		this.dragThreshold = 0; // L: 143
		this.isScrollBar = false; // L: 144
		this.spellActionName = ""; // L: 145
		this.hasListener = false; // L: 146
		this.mouseOverRedirect = -1; // L: 187
		this.field3785 = ""; // L: 188
		this.field3855 = "Ok"; // L: 189
		this.itemId = -1; // L: 192
		this.itemQuantity = 0; // L: 193
		this.modelFrame = 0; // L: 194
		this.modelFrameCycle = 0; // L: 195
		this.field3863 = false; // L: 197
		this.field3864 = false; // L: 198
		this.field3865 = -1; // L: 199
		this.field3866 = 0; // L: 200
		this.field3867 = 0; // L: 201
		this.field3831 = 0; // L: 202
		this.rootIndex = -1; // L: 203
		this.cycle = -1; // L: 204
		this.noClickThrough = false; // L: 206
		this.noScrollThrough = false; // L: 207
		this.prioritizeMenuEntry = false; // L: 208
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "310036603"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 211
		this.type = var1.readUnsignedByte(); // L: 212
		this.buttonType = var1.readUnsignedByte(); // L: 213
		this.contentType = var1.readUnsignedShort(); // L: 214
		this.rawX = var1.readShort(); // L: 215
		this.rawY = var1.readShort(); // L: 216
		this.rawWidth = var1.readUnsignedShort(); // L: 217
		this.rawHeight = var1.readUnsignedShort(); // L: 218
		this.transparencyTop = var1.readUnsignedByte(); // L: 219
		this.parentId = var1.readUnsignedShort(); // L: 220
		if (this.parentId == 65535) { // L: 221
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 222
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 223
		if (this.mouseOverRedirect == 65535) { // L: 224
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 225
		int var3;
		if (var2 > 0) { // L: 226
			this.cs1Comparisons = new int[var2]; // L: 227
			this.cs1ComparisonValues = new int[var2]; // L: 228

			for (var3 = 0; var3 < var2; ++var3) { // L: 229
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 230
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 231
			}
		}

		var3 = var1.readUnsignedByte(); // L: 234
		int var4;
		if (var3 > 0) { // L: 235
			this.cs1Instructions = new int[var3][]; // L: 236

			for (var4 = 0; var4 < var3; ++var4) { // L: 237
				int var5 = var1.readUnsignedShort(); // L: 238
				this.cs1Instructions[var4] = new int[var5]; // L: 239

				for (int var6 = 0; var6 < var5; ++var6) { // L: 240
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 241
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 242
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 246
			this.scrollHeight = var1.readUnsignedShort(); // L: 247
			this.isHidden = var1.readUnsignedByte() == 1; // L: 248
		}

		if (this.type == 1) { // L: 250
			var1.readUnsignedShort(); // L: 251
			var1.readUnsignedByte(); // L: 252
		}

		if (this.type == 3) { // L: 254
			this.fill = var1.readUnsignedByte() == 1; // L: 255
		}

		if (this.type == 4 || this.type == 1) { // L: 257
			this.textXAlignment = var1.readUnsignedByte(); // L: 258
			this.textYAlignment = var1.readUnsignedByte(); // L: 259
			this.textLineHeight = var1.readUnsignedByte(); // L: 260
			this.fontId = var1.readUnsignedShort(); // L: 261
			if (this.fontId == 65535) { // L: 262
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 263
		}

		if (this.type == 4) { // L: 265
			this.text = var1.readStringCp1252NullTerminated(); // L: 266
			this.field3789 = var1.readStringCp1252NullTerminated(); // L: 267
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 269
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 270
			this.color2 = var1.readInt(); // L: 271
			this.field3752 = var1.readInt(); // L: 272
			this.field3743 = var1.readInt(); // L: 273
		}

		if (this.type == 5) { // L: 275
			this.spriteId2 = var1.readInt(); // L: 276
			this.spriteId = var1.readInt(); // L: 277
		}

		if (this.type == 6) { // L: 279
			this.modelType = 1; // L: 280
			this.modelId = var1.readUnsignedShort(); // L: 281
			if (this.modelId == 65535) { // L: 282
				this.modelId = -1;
			}

			this.field3716 = 1; // L: 283
			this.field3839 = var1.readUnsignedShort(); // L: 284
			if (this.field3839 == 65535) { // L: 285
				this.field3839 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 286
			if (this.sequenceId == 65535) { // L: 287
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 288
			if (this.sequenceId2 == 65535) { // L: 289
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 290
			this.modelAngleX = var1.readUnsignedShort(); // L: 291
			this.modelAngleY = var1.readUnsignedShort(); // L: 292
		}

		if (this.type == 8) { // L: 294
			this.text = var1.readStringCp1252NullTerminated(); // L: 295
		}

		if (this.buttonType == 2) { // L: 297
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 298
			this.field3785 = var1.readStringCp1252NullTerminated(); // L: 299
			var4 = var1.readUnsignedShort() & 63; // L: 300
			this.flags |= var4 << 11; // L: 301
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 303
			this.field3855 = var1.readStringCp1252NullTerminated(); // L: 304
			if (this.field3855.length() == 0) { // L: 305
				if (this.buttonType == 1) { // L: 306
					this.field3855 = "Ok";
				}

				if (this.buttonType == 4) { // L: 307
					this.field3855 = "Select";
				}

				if (this.buttonType == 5) { // L: 308
					this.field3855 = "Select";
				}

				if (this.buttonType == 6) { // L: 309
					this.field3855 = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 312
			this.flags |= 4194304; // L: 313
		}

		if (this.buttonType == 6) { // L: 315
			this.flags |= 1; // L: 316
		}

	} // L: 318

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1102598991"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 321
		this.isIf3 = true; // L: 322
		this.type = var1.readUnsignedByte(); // L: 323
		this.contentType = var1.readUnsignedShort(); // L: 324
		this.rawX = var1.readShort(); // L: 325
		this.rawY = var1.readShort(); // L: 326
		this.rawWidth = var1.readUnsignedShort(); // L: 327
		if (this.type == 9) { // L: 328
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 329
		}

		this.widthAlignment = var1.readByte(); // L: 330
		this.heightAlignment = var1.readByte(); // L: 331
		this.xAlignment = var1.readByte(); // L: 332
		this.yAlignment = var1.readByte(); // L: 333
		this.parentId = var1.readUnsignedShort(); // L: 334
		if (this.parentId == 65535) { // L: 335
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 336
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 337
		if (this.type == 0) { // L: 338
			this.scrollWidth = var1.readUnsignedShort(); // L: 339
			this.scrollHeight = var1.readUnsignedShort(); // L: 340
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 341
		}

		if (this.type == 5) { // L: 343
			this.spriteId2 = var1.readInt(); // L: 344
			this.spriteAngle = var1.readUnsignedShort(); // L: 345
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 346
			this.transparencyTop = var1.readUnsignedByte(); // L: 347
			this.outline = var1.readUnsignedByte(); // L: 348
			this.spriteShadow = var1.readInt(); // L: 349
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 350
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 351
		}

		if (this.type == 6) { // L: 353
			this.modelType = 1; // L: 354
			this.modelId = var1.readUnsignedShort(); // L: 355
			if (this.modelId == 65535) { // L: 356
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 357
			this.modelOffsetY = var1.readShort(); // L: 358
			this.modelAngleX = var1.readUnsignedShort(); // L: 359
			this.modelAngleY = var1.readUnsignedShort(); // L: 360
			this.modelAngleZ = var1.readUnsignedShort(); // L: 361
			this.modelZoom = var1.readUnsignedShort(); // L: 362
			this.sequenceId = var1.readUnsignedShort(); // L: 363
			if (this.sequenceId == 65535) { // L: 364
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 365
			var1.readUnsignedShort(); // L: 366
			if (this.widthAlignment != 0) { // L: 367
				this.field3781 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 368
				var1.readUnsignedShort(); // L: 369
			}
		}

		if (this.type == 4) { // L: 372
			this.fontId = var1.readUnsignedShort(); // L: 373
			if (this.fontId == 65535) { // L: 374
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 375
			this.textLineHeight = var1.readUnsignedByte(); // L: 376
			this.textXAlignment = var1.readUnsignedByte(); // L: 377
			this.textYAlignment = var1.readUnsignedByte(); // L: 378
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 379
			this.color = var1.readInt(); // L: 380
		}

		if (this.type == 3) { // L: 382
			this.color = var1.readInt(); // L: 383
			this.fill = var1.readUnsignedByte() == 1; // L: 384
			this.transparencyTop = var1.readUnsignedByte(); // L: 385
		}

		if (this.type == 9) { // L: 387
			this.lineWid = var1.readUnsignedByte(); // L: 388
			this.color = var1.readInt(); // L: 389
			this.field3759 = var1.readUnsignedByte() == 1; // L: 390
		}

		this.flags = var1.readMedium(); // L: 392
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 393
		int var2 = var1.readUnsignedByte(); // L: 394
		if (var2 > 0) { // L: 395
			this.actions = new String[var2]; // L: 396

			for (int var3 = 0; var3 < var2; ++var3) { // L: 397
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 399
		this.dragThreshold = var1.readUnsignedByte(); // L: 400
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 401
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 402
		this.onLoad = this.readListener(var1); // L: 403
		this.onMouseOver = this.readListener(var1); // L: 404
		this.onMouseLeave = this.readListener(var1); // L: 405
		this.onTargetLeave = this.readListener(var1); // L: 406
		this.onTargetEnter = this.readListener(var1); // L: 407
		this.onVarTransmit = this.readListener(var1); // L: 408
		this.onInvTransmit = this.readListener(var1); // L: 409
		this.onStatTransmit = this.readListener(var1); // L: 410
		this.onTimer = this.readListener(var1); // L: 411
		this.onOp = this.readListener(var1); // L: 412
		this.onMouseRepeat = this.readListener(var1); // L: 413
		this.onClick = this.readListener(var1); // L: 414
		this.onClickRepeat = this.readListener(var1); // L: 415
		this.onRelease = this.readListener(var1); // L: 416
		this.onHold = this.readListener(var1); // L: 417
		this.onDrag = this.readListener(var1); // L: 418
		this.onDragComplete = this.readListener(var1); // L: 419
		this.onScroll = this.readListener(var1); // L: 420
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 421
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 422
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 423
	} // L: 424

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)V",
		garbageValue = "45"
	)
	void method6791(Buffer var1) {
		this.field3846 = var1.readStringCp1252NullTerminated(); // L: 427
	} // L: 428

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)[Ljava/lang/Object;",
		garbageValue = "1748550455"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 431
		if (var2 == 0) { // L: 432
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 433

			for (int var4 = 0; var4 < var2; ++var4) { // L: 434
				int var5 = var1.readUnsignedByte(); // L: 435
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 436
				} else if (var5 == 1) { // L: 437
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 439
			return var3; // L: 440
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)[I",
		garbageValue = "-443548333"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 444
		if (var2 == 0) { // L: 445
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 446

			for (int var4 = 0; var4 < var2; ++var4) { // L: 447
				var3[var4] = var1.readInt(); // L: 448
			}

			return var3; // L: 450
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnd;ZLel;I)Lvd;",
		garbageValue = "1021905382"
	)
	public SpritePixels method6916(class340 var1, boolean var2, UrlRequester var3) {
		field3722 = false; // L: 454
		if (this.field3762 != null) { // L: 455
			SpritePixels var4 = this.method6795(var1, var3); // L: 456
			if (var4 != null) { // L: 457
				return var4; // L: 458
			}
		}

		int var8;
		if (var2) { // L: 462
			var8 = this.spriteId;
		} else {
			var8 = this.spriteId2; // L: 463
		}

		if (var8 == -1) { // L: 464
			return null;
		} else {
			long var5 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var8 + ((long)this.outline << 36); // L: 465
			SpritePixels var7 = (SpritePixels)var1.field3624.get(var5); // L: 466
			if (var7 != null) { // L: 467
				return var7;
			} else {
				var7 = FileSystem.SpriteBuffer_getSprite(var1.field3632, var8, 0); // L: 468
				if (var7 == null) { // L: 469
					field3722 = true; // L: 470
					return null; // L: 471
				} else {
					this.method6798(var7); // L: 473
					var1.field3624.put(var7, var5); // L: 474
					return var7; // L: 475
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lel;I)Lvd;",
		garbageValue = "168489719"
	)
	SpritePixels method6795(class340 var1, UrlRequester var2) {
		if (!this.method6797()) { // L: 479
			return this.method6796(var1, var2); // L: 480
		} else {
			String var3 = this.field3762 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 482
			SpritePixels var4 = (SpritePixels)var1.field3636.method8198(var3); // L: 483
			if (var4 == null) { // L: 484
				SpritePixels var5 = this.method6796(var1, var2); // L: 485
				if (var5 != null) { // L: 486
					var4 = var5.method9900(); // L: 487
					this.method6798(var4); // L: 488
					var1.field3636.method8201(var3, var4); // L: 489
				}
			}

			return var4; // L: 492
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lel;I)Lvd;",
		garbageValue = "1911846999"
	)
	SpritePixels method6796(class340 var1, UrlRequester var2) {
		if (this.field3762 != null && var2 != null) { // L: 496
			class344 var3 = (class344)var1.field3635.method8198(this.field3762); // L: 497
			if (var3 == null) { // L: 498
				var3 = new class344(this.field3762, var2); // L: 499
				var1.field3635.method8201(this.field3762, var3); // L: 500
			}

			return var3.method6459(); // L: 502
		} else {
			return null; // L: 504
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1623659386"
	)
	boolean method6797() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 508
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvd;I)V",
		garbageValue = "871154866"
	)
	void method6798(SpritePixels var1) {
		if (this.spriteFlipV) { // L: 512
			var1.flipVertically();
		}

		if (this.spriteFlipH) { // L: 513
			var1.flipHorizontally();
		}

		if (this.outline > 0) { // L: 514
			var1.pad(this.outline);
		}

		if (this.outline >= 1) { // L: 515
			var1.outline(1);
		}

		if (this.outline >= 2) { // L: 516
			var1.outline(16777215);
		}

		if (this.spriteShadow != 0) { // L: 517
			var1.shadow(this.spriteShadow);
		}

	} // L: 518

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)Lpb;",
		garbageValue = "-2110854177"
	)
	public Font method6799(class340 var1) {
		field3722 = false; // L: 521
		if (this.fontId == -1) { // L: 522
			return null;
		} else {
			Font var2 = (Font)var1.field3637.get((long)this.fontId); // L: 523
			if (var2 != null) { // L: 524
				return var2;
			} else {
				AbstractArchive var4 = var1.field3632; // L: 526
				AbstractArchive var5 = var1.field3628; // L: 527
				int var6 = this.fontId; // L: 528
				Font var3;
				if (!class130.method3074(var4, var6, 0)) { // L: 530
					var3 = null; // L: 531
				} else {
					var3 = class529.method9417(var5.takeFile(var6, 0)); // L: 534
				}

				if (var3 != null) { // L: 537
					var1.field3637.put(var3, (long)this.fontId);
				} else {
					field3722 = true; // L: 538
				}

				return var3; // L: 539
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lhs;IZLnt;Lho;Lht;S)Lkz;",
		garbageValue = "-18976"
	)
	public Model method6800(class340 var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, class188 var7) {
		field3722 = false; // L: 543
		int var8;
		int var9;
		if (var4) { // L: 546
			var8 = this.field3716; // L: 547
			var9 = this.field3839; // L: 548
		} else {
			var8 = this.modelType; // L: 551
			var9 = this.modelId; // L: 552
		}

		if (var8 == 6) { // L: 554
			if (var6 == null) { // L: 555
				return null;
			}

			var9 = var6.id; // L: 556
		}

		if (var8 == 0) { // L: 558
			return null;
		} else if (var8 == 1 && var9 == -1) { // L: 559
			return null;
		} else {
			if (var7 != null && var7.field1956 && var8 == 6) { // L: 560
				var8 = 3; // L: 561
			}

			long var10 = (long)(var9 + (var8 << 16)); // L: 563
			if (var7 != null) { // L: 564
				var10 |= var7.field1960 << 20;
			}

			Model var12 = (Model)var1.field3627.get(var10); // L: 565
			if (var12 == null) { // L: 566
				ModelData var13 = null; // L: 567
				int var14 = 64; // L: 568
				int var15 = 768; // L: 569
				switch(var8) { // L: 570
				case 1:
					var13 = ModelData.ModelData_get(var1.field3626, var9, 0); // L: 584
					break; // L: 585
				case 2:
					var13 = VarcInt.getNpcDefinition(var9).method3702((class188)null); // L: 572
					break;
				case 3:
					var13 = var5 != null ? var5.getModelData() : null; // L: 581
					break; // L: 582
				case 4:
					ItemComposition var16 = ArchiveDiskActionHandler.ItemComposition_get(var9); // L: 575
					var13 = var16.getModelData(10); // L: 576
					var14 += var16.field2221; // L: 577
					var15 += var16.field2224; // L: 578
				case 5:
				default:
					break;
				case 6:
					var13 = VarcInt.getNpcDefinition(var9).method3702(var7); // L: 587
				}

				if (var13 == null) { // L: 590
					field3722 = true; // L: 591
					return null; // L: 592
				}

				var12 = var13.toModel(var14, var15, -50, -10, -50); // L: 594
				var1.field3627.put(var12, var10); // L: 595
			}

			if (var2 != null) { // L: 597
				var12 = var2.transformWidgetModel(var12, var3); // L: 598
			}

			return var12; // L: 600
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnd;ZI)Lmc;",
		garbageValue = "-2042427108"
	)
	public SpriteMask method6801(class340 var1, boolean var2) {
		if (this.spriteId == -1) { // L: 604
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2; // L: 605
		if (var3 == -1) { // L: 606
			return null;
		} else {
			long var4 = ((this.spriteFlipH ? 1L : 0L) << 39) + (long)var3 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.spriteShadow << 40); // L: 607
			SpriteMask var6 = (SpriteMask)var1.field3634.get(var4); // L: 608
			if (var6 != null) { // L: 609
				return var6;
			} else {
				SpritePixels var7 = this.method6916(var1, var2, (UrlRequester)null); // L: 610
				if (var7 == null) { // L: 611
					return null;
				} else {
					SpritePixels var8 = var7.copyNormalized(); // L: 612
					int[] var9 = new int[var8.subHeight]; // L: 613
					int[] var10 = new int[var8.subHeight]; // L: 614

					for (int var11 = 0; var11 < var8.subHeight; ++var11) { // L: 615
						int var12 = 0; // L: 616
						int var13 = var8.subWidth; // L: 617

						int var14;
						for (var14 = 0; var14 < var8.subWidth; ++var14) { // L: 618
							if (var8.pixels[var14 + var11 * var8.subWidth] == 0) { // L: 619
								var12 = var14; // L: 620
								break;
							}
						}

						for (var14 = var8.subWidth - 1; var14 >= var12; --var14) { // L: 624
							if (var8.pixels[var14 + var11 * var8.subWidth] == 0) { // L: 625
								var13 = var14 + 1; // L: 626
								break;
							}
						}

						var9[var11] = var12; // L: 630
						var10[var11] = var13 - var12; // L: 631
					}

					var6 = new SpriteMask(var8.subWidth, var8.subHeight, var10, var9, var3); // L: 633
					var1.field3634.put(var6, var4); // L: 634
					return var6; // L: 635
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1929901366"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 639
			String[] var3 = new String[var1 + 1]; // L: 640
			if (this.actions != null) { // L: 641
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 642
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 644
		}

		this.actions[var1] = var2; // L: 646
	} // L: 647

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1633146451"
	)
	public boolean method6803() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12; // L: 650
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "90"
	)
	public boolean method6831() {
		return this.type == 11 || this.type == 12; // L: 654
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lel;J)V"
	)
	public void method6874(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && -1L != var4) { // L: 658
			var1 = var1.replaceAll("%userid%", Long.toString(var4)); // L: 659
			this.field3794 = new class210(); // L: 660
			if (!this.field3794.method4174(var1, var2, var3)) { // L: 661
				this.field3794 = null; // L: 662
			} else {
				if (this.field3819 == null || this.field3731 == null) { // L: 665
					this.method6808(); // L: 666
				}

			}
		}
	} // L: 663 668

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lel;I)V",
		garbageValue = "2119717106"
	)
	public void method6788(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field3794 = new class210(); // L: 671
		if (!this.field3794.method4174(var1, var3, var6)) { // L: 672
			this.field3794 = null; // L: 673
		} else {
			if (this.field3819 == null || this.field3731 == null) { // L: 676
				this.method6808(); // L: 677
			}

			this.field3794.method4129(var2, var4, var5); // L: 679
		}
	} // L: 674 680

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;B)V",
		garbageValue = "22"
	)
	public void method6807(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) { // L: 683
			this.field3794 = new class210(); // L: 684
			this.field3794.method4145(var1, var2); // L: 685
		}
	} // L: 686

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-67"
	)
	void method6808() {
		this.field3819 = new HashMap(); // L: 689
		this.field3731 = new HashMap(); // L: 690
	} // L: 691

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-174817967"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		if (this.type == 11) { // L: 694
			if (this.field3819 == null) { // L: 695
				this.method6808();
			}

			this.field3819.put(var1, var2); // L: 696
		}
	} // L: 697

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-261500780"
	)
	public void method6810(String var1, int var2) {
		if (this.type == 11) { // L: 700
			if (this.field3731 == null) { // L: 701
				this.method6808();
			}

			this.field3731.put(var1, var2); // L: 702
		}
	} // L: 703

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "2143299562"
	)
	public boolean method6888(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3794 != null && this.method6895()) { // L: 706
			var1 -= var3; // L: 707
			var2 -= var4; // L: 708
			int var5 = (int)(this.field3794.method4140()[0] * (float)this.width); // L: 709
			int var6 = (int)(this.field3794.method4140()[1] * (float)this.height); // L: 710
			int var7 = var5 + (int)(this.field3794.method4140()[2] * (float)this.width); // L: 711
			int var8 = var6 + (int)(this.field3794.method4140()[3] * (float)this.height); // L: 712
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8; // L: 713
		} else {
			return false;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-106844895"
	)
	public boolean method6895() {
		return this.field3795 == 2; // L: 717
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1369768204"
	)
	public int method6813(String var1) {
		return this.type == 11 && this.field3794 != null && this.method6895() ? this.field3794.method4134(var1) : -1; // L: 721 722 724
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "220125130"
	)
	public String method6814(String var1) {
		return this.type == 11 && this.field3794 != null && this.method6895() ? this.field3794.method4135(var1) : null; // L: 728 729
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1652857613"
	)
	public int method6815() {
		return this.field3731 != null && this.field3731.size() > 0 ? 1 : 0; // L: 733
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "860239195"
	)
	public int method6816() {
		if (this.type == 11 && this.field3794 != null && this.field3731 != null && !this.field3731.isEmpty()) { // L: 737
			String var1 = this.field3794.method4139(); // L: 738
			return var1 != null && this.field3731.containsKey(this.field3794.method4139()) ? (Integer)this.field3731.get(var1) : -1; // L: 739 740 742
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2039365126"
	)
	public String method6817() {
		if (this.type == 11 && this.field3794 != null) { // L: 746
			String var1 = this.field3794.method4139(); // L: 747
			Iterator var2 = this.field3794.method4163().iterator(); // L: 748

			while (var2.hasNext()) {
				class224 var3 = (class224)var2.next(); // L: 749
				String var4 = String.format("%%%S%%", var3.method4365()); // L: 751
				if (var3.vmethod4366() == 0) { // L: 752
					var1.replaceAll(var4, Integer.toString(var3.vmethod4368())); // L: 753
				} else {
					var1.replaceAll(var4, var3.vmethod4367()); // L: 756
				}
			}

			return var1; // L: 760
		} else {
			return null; // L: 759
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1931923105"
	)
	public int[] method6824() {
		if (this.type == 11 && this.field3794 != null) { // L: 764
			int[] var1 = new int[3]; // L: 765
			int var2 = 0; // L: 766
			Iterator var3 = this.field3794.method4163().iterator(); // L: 767

			while (var3.hasNext()) {
				class224 var4 = (class224)var3.next(); // L: 768
				if (!var4.method4365().equals("user_id")) { // L: 770
					if (var4.vmethod4366() != 0) { // L: 771
						return null; // L: 778
					}

					var1[var2++] = var4.vmethod4368(); // L: 772
					if (var2 > 3) { // L: 773
						return null; // L: 774
					}
				}
			}

			return var1; // L: 783
		} else {
			return null;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Lil;",
		garbageValue = "2081980592"
	)
	public class210 method6819() {
		return this.field3794; // L: 787
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lel;I)Z",
		garbageValue = "-347360869"
	)
	public boolean method6820(class340 var1, UrlRequester var2) {
		if (this.type == 11 && this.field3794 != null) { // L: 791
			this.field3794.method4132(var2); // L: 792
			if (this.field3794.method4162() != this.field3795) { // L: 793
				this.field3795 = this.field3794.method4162(); // L: 794
				if (this.field3795 >= 3) { // L: 795
					return true; // L: 796
				}

				if (this.field3795 == 2) { // L: 798
					this.method6848(var1); // L: 799
					return true; // L: 800
				}
			}

			return false; // L: 803
		} else {
			return false;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)V",
		garbageValue = "23"
	)
	void method6848(class340 var1) {
		this.noClickThrough = true; // L: 824
		ArrayList var2 = this.field3794.method4136(); // L: 825
		ArrayList var3 = this.field3794.method4146(); // L: 826
		int var4 = var2.size() + var3.size(); // L: 827
		this.children = new Widget[var4]; // L: 828
		int var5 = 0; // L: 829

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) { // L: 830 837
			class211 var7 = (class211)var6.next(); // L: 831
			var8 = Skeleton.method5418(5, this, var5, 0, 0, 0, 0, var7.field2309); // L: 833
			var8.field3762 = var7.field2311.method2921(); // L: 834
			class344 var9 = new class344(var7.field2311); // L: 835
			var1.field3635.method8201(var8.field3762, var9); // L: 836
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) { // L: 840 848
			class222 var10 = (class222)var6.next(); // L: 841
			var8 = Skeleton.method5418(4, this, var5, 0, 0, 0, 0, var10.field2399); // L: 843
			var8.text = var10.field2394; // L: 844
			var8.fontId = (Integer)this.field3819.get(var10.field2397); // L: 845
			var8.textXAlignment = var10.field2395; // L: 846
			var8.textYAlignment = var10.field2396; // L: 847
		}

	} // L: 851

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	public void method6854() {
		this.field3798 = new class345(); // L: 854

		for (int var1 = 1; var1 <= 12; ++var1) { // L: 855
			this.field3798.field3657.method359(var1, 0); // L: 856
		}

		for (char var2 = 0; var2 < ' '; ++var2) { // L: 858
			this.field3798.field3657.method360(var2, 0); // L: 859
		}

		this.field3798.field3657.method360('\u0080', 0); // L: 861
		this.field3798.field3657.method359(82, 2); // L: 862
		this.field3798.field3657.method359(81, 2); // L: 863
		this.field3798.field3657.method359(86, 2); // L: 864
	} // L: 865

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Lnf;",
		garbageValue = "1032791719"
	)
	public class347 method6806() {
		return this.field3798 != null ? this.field3798.field3656 : null; // L: 868
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Lnv;",
		garbageValue = "-926941640"
	)
	public class341 method6823() {
		return this.field3798 != null ? this.field3798.field3655 : null; // L: 872
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Lbo;",
		garbageValue = "-2133258203"
	)
	public class27 method6825() {
		return this.field3798 != null ? this.field3798.field3657 : null; // L: 876
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)Lnn;",
		garbageValue = "15"
	)
	public class345 method6841() {
		return this.field3798; // L: 880
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lnf;I)Z",
		garbageValue = "-1645217279"
	)
	boolean method6827(class347 var1) {
		boolean var2 = false; // L: 884
		String var5;
		String var6;
		StringBuilder var7;
		int var8;
		int var9;
		int var10;
		char var11;
		String var12;
		if (this.text != null && !this.text.isEmpty()) { // L: 885
			var6 = this.text; // L: 889
			var7 = new StringBuilder(var6.length()); // L: 891
			var8 = 0; // L: 892
			var9 = -1; // L: 893

			for (var10 = 0; var10 < var6.length(); ++var10) { // L: 894
				var11 = var6.charAt(var10); // L: 895
				if (var11 == '<') { // L: 896
					var7.append(var6.substring(var8, var10)); // L: 897
					var9 = var10; // L: 898
				} else if (var11 == '>' && var9 != -1) { // L: 901
					var12 = var6.substring(var9 + 1, var10); // L: 902
					var9 = -1; // L: 903
					if (var12.equals("lt")) { // L: 904
						var7.append("<"); // L: 905
					} else if (var12.equals("gt")) { // L: 907
						var7.append(">"); // L: 908
					} else if (var12.equals("br")) { // L: 910
						var7.append("\n"); // L: 911
					}

					var8 = var10 + 1; // L: 913
				}
			}

			if (var8 < var6.length()) { // L: 916
				var7.append(var6.substring(var8, var6.length())); // L: 917
			}

			var5 = var7.toString(); // L: 919
			var2 |= var1.method6551(var5); // L: 921
			this.text = ""; // L: 922
		}

		if (this.field3789 != null && !this.field3789.isEmpty()) { // L: 924
			var6 = this.field3789; // L: 928
			var7 = new StringBuilder(var6.length()); // L: 930
			var8 = 0; // L: 931
			var9 = -1; // L: 932

			for (var10 = 0; var10 < var6.length(); ++var10) { // L: 933
				var11 = var6.charAt(var10); // L: 934
				if (var11 == '<') { // L: 935
					var7.append(var6.substring(var8, var10)); // L: 936
					var9 = var10; // L: 937
				} else if (var11 == '>' && var9 != -1) { // L: 940
					var12 = var6.substring(var9 + 1, var10); // L: 941
					var9 = -1; // L: 942
					if (var12.equals("lt")) { // L: 943
						var7.append("<"); // L: 944
					} else if (var12.equals("gt")) { // L: 946
						var7.append(">"); // L: 947
					} else if (var12.equals("br")) { // L: 949
						var7.append("\n"); // L: 950
					}

					var8 = var10 + 1; // L: 952
				}
			}

			if (var8 < var6.length()) { // L: 955
				var7.append(var6.substring(var8, var6.length())); // L: 956
			}

			var5 = var7.toString(); // L: 958
			var2 |= var1.method6510(var5); // L: 960
			this.field3789 = ""; // L: 961
		}

		return var2; // L: 963
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)Z",
		garbageValue = "-1516469261"
	)
	public boolean method6828(class340 var1) {
		class347 var2 = this.method6806(); // L: 967
		if (var2 == null) { // L: 968
			return false;
		} else {
			boolean var3 = false; // L: 969
			if (!var2.method6562() && this.fontId != -1) { // L: 970
				int var4 = var2.method6507(); // L: 971
				int var5 = var2.method6564(); // L: 972
				int var6 = var2.method6561(); // L: 973
				int var7 = var2.method6560(); // L: 974
				Font var8 = this.method6799(var1); // L: 975
				if (var8 != null) { // L: 976
					var3 |= var2.method6511(var8); // L: 977
					var3 |= this.method6827(var2); // L: 978
					var3 |= var2.method6516(var4, var5); // L: 979
					var3 |= var2.method6530(var6, var7); // L: 980
				}
			} else if (var2.method6562()) { // L: 983
				var3 |= this.method6827(var2); // L: 984
			}

			var2.method6681(); // L: 986
			return var3; // L: 987
		}
	}
}
