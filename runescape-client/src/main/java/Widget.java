import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("ak")
	public static boolean field3740;
	@ObfuscatedName("bp")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -888813315
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1782099365
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bf")
	String field3744;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 569638281
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -530345339
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -753412249
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -548671023
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 613667167
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 404636535
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 461200417
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 901113805
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 844398083
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1702929111
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 427070681
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 421411335
	)
	@Export("x")
	public int x;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 429087407
	)
	@Export("y")
	public int y;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1338661573
	)
	@Export("width")
	public int width;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -209931135
	)
	@Export("height")
	public int height;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 634501139
	)
	public int field3760;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -554895785
	)
	public int field3831;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1666791179
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bm")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1331772307
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 913158007
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 698878245
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -967719995
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -849172079
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -937177559
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -233881151
	)
	public int field3827;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 611917449
	)
	public int field3771;
	@ObfuscatedName("cl")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	@Export("fillMode")
	public class546 fillMode;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -128184061
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 327229187
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -742972009
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cd")
	public boolean field3862;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 254488211
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1079992199
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("ce")
	public String field3780;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1910356439
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cu")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1736441479
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -822212819
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("cv")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("co")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 126214687
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -737689371
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -2146577519
	)
	int field3789;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1183479259
	)
	int field3813;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1723862129
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 559606053
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -1205990351
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 867186143
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1000844767
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1687962115
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -1548295757
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 631677637
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1832693377
	)
	public int field3799;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 300585447
	)
	public int field3737;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	public PlayerComposition field3801;
	@ObfuscatedName("dv")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dr")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -1138916521
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 115789025
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("db")
	@Export("text")
	public String text;
	@ObfuscatedName("di")
	public String field3807;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 758591793
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 396689765
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -512612643
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("de")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	class171 field3812;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 1130909643
	)
	int field3889;
	@ObfuscatedName("ds")
	HashMap field3798;
	@ObfuscatedName("dd")
	HashMap field3815;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	class345 field3810;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 298640377
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("ej")
	public boolean field3818;
	@ObfuscatedName("ew")
	public byte[][] field3836;
	@ObfuscatedName("en")
	public byte[][] field3820;
	@ObfuscatedName("eo")
	public int[] field3821;
	@ObfuscatedName("er")
	public int[] field3738;
	@ObfuscatedName("ea")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ef")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 1822648773
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = -433802207
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("eu")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("ex")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("ec")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("em")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("eq")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ep")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("eh")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("ez")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("eg")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ev")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ei")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ek")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("ff")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fm")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fd")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fe")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fc")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fb")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fi")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("ft")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fa")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fn")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fx")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fu")
	public Object[] field3851;
	@ObfuscatedName("fj")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fq")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fv")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fk")
	public Object[] field3855;
	@ObfuscatedName("fr")
	public Object[] field3856;
	@ObfuscatedName("fh")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fy")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fw")
	public Object[] field3859;
	@ObfuscatedName("fl")
	public Object[] field3860;
	@ObfuscatedName("fz")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fs")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fg")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fo")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fp")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gg")
	public Object[] field3866;
	@ObfuscatedName("gw")
	public Object[] field3867;
	@ObfuscatedName("gr")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gx")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gb")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = -1619914463
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gj")
	public String field3822;
	@ObfuscatedName("gn")
	public String field3877;
	@ObfuscatedName("gi")
	public int[] field3874;
	@ObfuscatedName("gc")
	public int[] field3875;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -599119121
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 1513720115
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 1261258799
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -1841662299
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "[Lnt;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gh")
	public boolean field3881;
	@ObfuscatedName("gy")
	public boolean field3882;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = 1957540313
	)
	public int field3883;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = -1511002233
	)
	public int field3884;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 203898851
	)
	public int field3847;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = -170096791
	)
	public int field3886;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 1733297855
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = 1220370851
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gz")
	public int[] field3766;
	@ObfuscatedName("gp")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gu")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hq")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3740 = false; // L: 51
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
		this.field3760 = 1; // L: 71
		this.field3831 = 1; // L: 72
		this.parentId = -1; // L: 73
		this.isHidden = false; // L: 74
		this.scrollX = 0; // L: 75
		this.scrollY = 0; // L: 76
		this.scrollWidth = 0; // L: 77
		this.scrollHeight = 0; // L: 78
		this.color = 0; // L: 79
		this.color2 = 0; // L: 80
		this.field3827 = 0; // L: 81
		this.field3771 = 0; // L: 82
		this.fill = false; // L: 83
		this.fillMode = class546.SOLID; // L: 84
		this.transparencyTop = 0; // L: 85
		this.transparencyBot = 0; // L: 86
		this.lineWid = 1; // L: 87
		this.field3862 = false; // L: 88
		this.spriteId2 = -1; // L: 89
		this.spriteId = -1; // L: 90
		this.spriteAngle = 0; // L: 92
		this.spriteTiling = false; // L: 93
		this.outline = 0; // L: 94
		this.spriteShadow = 0; // L: 95
		this.modelType = 1; // L: 98
		this.modelId = -1; // L: 99
		this.field3789 = 1; // L: 100
		this.field3813 = -1; // L: 101
		this.sequenceId = -1; // L: 102
		this.sequenceId2 = -1; // L: 103
		this.modelOffsetX = 0; // L: 104
		this.modelOffsetY = 0; // L: 105
		this.modelAngleX = 0; // L: 106
		this.modelAngleY = 0; // L: 107
		this.modelAngleZ = 0; // L: 108
		this.modelZoom = 100; // L: 109
		this.field3799 = 0; // L: 110
		this.field3737 = 0; // L: 111
		this.modelOrthog = false; // L: 113
		this.modelTransparency = false; // L: 114
		this.itemQuantityMode = 2; // L: 115
		this.fontId = -1; // L: 116
		this.text = ""; // L: 117
		this.field3807 = ""; // L: 118
		this.textLineHeight = 0; // L: 119
		this.textXAlignment = 0; // L: 120
		this.textYAlignment = 0; // L: 121
		this.textShadowed = false; // L: 122
		this.field3889 = -1; // L: 124
		this.flags = 0; // L: 129
		this.field3818 = false; // L: 130
		this.dataText = ""; // L: 139
		this.parent = null; // L: 141
		this.dragZoneSize = 0; // L: 142
		this.dragThreshold = 0; // L: 143
		this.isScrollBar = false; // L: 144
		this.spellActionName = ""; // L: 145
		this.hasListener = false; // L: 146
		this.mouseOverRedirect = -1; // L: 187
		this.field3822 = ""; // L: 188
		this.field3877 = "Ok"; // L: 189
		this.itemId = -1; // L: 192
		this.itemQuantity = 0; // L: 193
		this.modelFrame = 0; // L: 194
		this.modelFrameCycle = 0; // L: 195
		this.field3881 = false; // L: 197
		this.field3882 = false; // L: 198
		this.field3883 = -1; // L: 199
		this.field3884 = 0; // L: 200
		this.field3847 = 0; // L: 201
		this.field3886 = 0; // L: 202
		this.rootIndex = -1; // L: 203
		this.cycle = -1; // L: 204
		this.noClickThrough = false; // L: 206
		this.noScrollThrough = false; // L: 207
		this.prioritizeMenuEntry = false; // L: 208
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1281787803"
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
			this.field3807 = var1.readStringCp1252NullTerminated(); // L: 267
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 269
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 270
			this.color2 = var1.readInt(); // L: 271
			this.field3827 = var1.readInt(); // L: 272
			this.field3771 = var1.readInt(); // L: 273
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

			this.field3789 = 1; // L: 283
			this.field3813 = var1.readUnsignedShort(); // L: 284
			if (this.field3813 == 65535) { // L: 285
				this.field3813 = -1;
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
			this.field3822 = var1.readStringCp1252NullTerminated(); // L: 299
			var4 = var1.readUnsignedShort() & 63; // L: 300
			this.flags |= var4 << 11; // L: 301
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 303
			this.field3877 = var1.readStringCp1252NullTerminated(); // L: 304
			if (this.field3877.length() == 0) { // L: 305
				if (this.buttonType == 1) { // L: 306
					this.field3877 = "Ok";
				}

				if (this.buttonType == 4) { // L: 307
					this.field3877 = "Select";
				}

				if (this.buttonType == 5) { // L: 308
					this.field3877 = "Select";
				}

				if (this.buttonType == 6) { // L: 309
					this.field3877 = "Continue";
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "-789951372"
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
				this.field3799 = var1.readUnsignedShort();
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
			this.field3862 = var1.readUnsignedByte() == 1; // L: 390
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "-1582883219"
	)
	void method6648(Buffer var1) {
		this.field3744 = var1.readStringCp1252NullTerminated(); // L: 427
	} // L: 428

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)[Ljava/lang/Object;",
		garbageValue = "649606523"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)[I",
		garbageValue = "-853188511"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lnm;ZLea;B)Lvg;",
		garbageValue = "18"
	)
	public SpritePixels method6651(class340 var1, boolean var2, UrlRequester var3) {
		field3740 = false; // L: 454
		if (this.field3780 != null) { // L: 455
			SpritePixels var4 = this.method6704(var1, var3); // L: 456
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
			long var5 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var8 + ((long)this.outline << 36) + ((long)this.spriteShadow << 40); // L: 465
			SpritePixels var7 = (SpritePixels)var1.field3648.get(var5); // L: 466
			if (var7 != null) { // L: 467
				return var7;
			} else {
				var7 = GraphicsObject.SpriteBuffer_getSprite(var1.field3643, var8, 0); // L: 468
				if (var7 == null) { // L: 469
					field3740 = true; // L: 470
					return null; // L: 471
				} else {
					this.method6771(var7); // L: 473
					var1.field3648.put(var7, var5); // L: 474
					return var7; // L: 475
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lea;I)Lvg;",
		garbageValue = "678346128"
	)
	SpritePixels method6704(class340 var1, UrlRequester var2) {
		if (!this.method6654()) { // L: 479
			return this.method6649(var1, var2); // L: 480
		} else {
			String var3 = this.field3780 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 482
			SpritePixels var4 = (SpritePixels)var1.field3642.method8015(var3); // L: 483
			if (var4 == null) { // L: 484
				SpritePixels var5 = this.method6649(var1, var2); // L: 485
				if (var5 != null) { // L: 486
					var4 = var5.method9704(); // L: 487
					this.method6771(var4); // L: 488
					var1.field3642.method8008(var3, var4); // L: 489
				}
			}

			return var4; // L: 492
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lea;I)Lvg;",
		garbageValue = "-1194238140"
	)
	SpritePixels method6649(class340 var1, UrlRequester var2) {
		if (this.field3780 != null && var2 != null) { // L: 496
			class344 var3 = (class344)var1.field3652.method8015(this.field3780); // L: 497
			if (var3 == null) { // L: 498
				var3 = new class344(this.field3780, var2); // L: 499
				var1.field3652.method8008(this.field3780, var3); // L: 500
			}

			return var3.method6316(); // L: 502
		} else {
			return null; // L: 504
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-714250306"
	)
	boolean method6654() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 508
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lvg;B)V",
		garbageValue = "115"
	)
	void method6771(SpritePixels var1) {
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)Lpx;",
		garbageValue = "-21"
	)
	public Font method6656(class340 var1) {
		field3740 = false; // L: 521
		if (this.fontId == -1) { // L: 522
			return null;
		} else {
			Font var2 = (Font)var1.field3640.get((long)this.fontId); // L: 523
			if (var2 != null) { // L: 524
				return var2;
			} else {
				AbstractArchive var4 = var1.field3643; // L: 526
				AbstractArchive var5 = var1.field3649; // L: 527
				int var6 = this.fontId; // L: 528
				byte[] var8 = var4.takeFile(var6, 0); // L: 532
				boolean var7;
				if (var8 == null) { // L: 533
					var7 = false; // L: 534
				} else {
					class483.SpriteBuffer_decode(var8); // L: 537
					var7 = true; // L: 538
				}

				Font var3;
				if (!var7) { // L: 540
					var3 = null; // L: 541
				} else {
					byte[] var9 = var5.takeFile(var6, 0); // L: 545
					Font var11;
					if (var9 == null) { // L: 547
						var11 = null; // L: 548
					} else {
						Font var10 = new Font(var9, class549.SpriteBuffer_xOffsets, class549.SpriteBuffer_yOffsets, class549.SpriteBuffer_spriteWidths, Ignored.SpriteBuffer_spriteHeights, class126.SpriteBuffer_spritePalette, class549.SpriteBuffer_pixels); // L: 551
						SpotAnimationDefinition.method3949(); // L: 552
						var11 = var10; // L: 553
					}

					var3 = var11; // L: 555
				}

				if (var3 != null) { // L: 558
					var1.field3640.put(var3, (long)this.fontId);
				} else {
					field3740 = true; // L: 559
				}

				return var3; // L: 560
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lig;IZLnq;Lhg;I)Ljn;",
		garbageValue = "1914091918"
	)
	public Model method6657(class340 var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, class206 var6) {
		field3740 = false; // L: 564
		int var7;
		int var8;
		if (var4) { // L: 567
			var7 = this.field3789; // L: 568
			var8 = this.field3813; // L: 569
		} else {
			var7 = this.modelType; // L: 572
			var8 = this.modelId; // L: 573
		}

		if (var7 == 0) { // L: 575
			return null;
		} else if (var7 == 1 && var8 == -1) { // L: 576
			return null;
		} else {
			if (var6 != null && var6.field2096 && var7 == 6) { // L: 577
				var7 = 3; // L: 578
			}

			long var9 = (long)(var8 + (var7 << 16)); // L: 580
			if (var6 != null) { // L: 581
				var9 |= var6.field2101 << 20;
			}

			Model var11 = (Model)var1.field3644.get(var9); // L: 582
			if (var11 == null) { // L: 583
				ModelData var12 = null; // L: 584
				int var13 = 64; // L: 585
				int var14 = 768; // L: 586
				switch(var7) { // L: 587
				case 1:
					var12 = ModelData.ModelData_get(var1.field3653, var8, 0); // L: 595
					break; // L: 596
				case 2:
					var12 = UserComparator10.getNpcDefinition(var8).method3864((class206)null); // L: 589
					break;
				case 3:
					var12 = var5 != null ? var5.getModelData() : null; // L: 604
					break;
				case 4:
					ItemComposition var15 = class10.ItemComposition_get(var8); // L: 598
					var12 = var15.getModelData(10); // L: 599
					var13 += var15.field2350; // L: 600
					var14 += var15.field2337; // L: 601
				case 5:
				default:
					break;
				case 6:
					var12 = UserComparator10.getNpcDefinition(var8).method3864(var6); // L: 592
				}

				if (var12 == null) { // L: 607
					field3740 = true; // L: 608
					return null; // L: 609
				}

				var11 = var12.toModel(var13, var14, -50, -10, -50); // L: 611
				var1.field3644.put(var11, var9); // L: 612
			}

			if (var2 != null) { // L: 614
				var11 = var2.transformWidgetModel(var11, var3); // L: 615
			}

			return var11; // L: 617
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnm;ZB)Lmu;",
		garbageValue = "-109"
	)
	public SpriteMask method6658(class340 var1, boolean var2) {
		if (this.spriteId == -1) { // L: 621
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2; // L: 622
		if (var3 == -1) { // L: 623
			return null;
		} else {
			long var4 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.outline << 36) + (long)var3 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.spriteShadow << 40); // L: 624
			SpriteMask var6 = (SpriteMask)var1.field3651.get(var4); // L: 625
			if (var6 != null) { // L: 626
				return var6;
			} else {
				SpritePixels var7 = this.method6651(var1, var2, (UrlRequester)null); // L: 627
				if (var7 == null) { // L: 628
					return null;
				} else {
					SpritePixels var8 = var7.copyNormalized(); // L: 629
					int[] var9 = new int[var8.subHeight]; // L: 630
					int[] var10 = new int[var8.subHeight]; // L: 631

					for (int var11 = 0; var11 < var8.subHeight; ++var11) { // L: 632
						int var12 = 0; // L: 633
						int var13 = var8.subWidth; // L: 634

						int var14;
						for (var14 = 0; var14 < var8.subWidth; ++var14) { // L: 635
							if (var8.pixels[var14 + var11 * var8.subWidth] == 0) { // L: 636
								var12 = var14; // L: 637
								break;
							}
						}

						for (var14 = var8.subWidth - 1; var14 >= var12; --var14) { // L: 641
							if (var8.pixels[var14 + var11 * var8.subWidth] == 0) { // L: 642
								var13 = var14 + 1; // L: 643
								break;
							}
						}

						var9[var11] = var12; // L: 647
						var10[var11] = var13 - var12; // L: 648
					}

					var6 = new SpriteMask(var8.subWidth, var8.subHeight, var10, var9, var3); // L: 650
					var1.field3651.put(var6, var4); // L: 651
					return var6; // L: 652
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "6"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 656
			String[] var3 = new String[var1 + 1]; // L: 657
			if (this.actions != null) { // L: 658
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 659
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 661
		}

		this.actions[var1] = var2; // L: 663
	} // L: 664

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-416129584"
	)
	public boolean method6660() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12; // L: 667
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "910829820"
	)
	public boolean method6661() {
		return this.type == 11 || this.type == 12; // L: 671
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lea;J)V"
	)
	public void method6662(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && -1L != var4) { // L: 675
			var1 = var1.replaceAll("%userid%", Long.toString(var4)); // L: 676
			this.field3812 = new class171(); // L: 677
			if (!this.field3812.method3441(var1, var2, var3)) { // L: 678
				this.field3812 = null; // L: 679
			} else {
				if (this.field3798 == null || this.field3815 == null) { // L: 682
					this.method6676(); // L: 683
				}

			}
		}
	} // L: 680 685

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lea;B)V",
		garbageValue = "56"
	)
	public void method6663(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field3812 = new class171(); // L: 688
		if (!this.field3812.method3441(var1, var3, var6)) { // L: 689
			this.field3812 = null; // L: 690
		} else {
			if (this.field3798 == null || this.field3815 == null) { // L: 693
				this.method6676(); // L: 694
			}

			this.field3812.method3442(var2, var4, var5); // L: 696
		}
	} // L: 691 697

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;I)V",
		garbageValue = "-1765313760"
	)
	public void method6645(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) { // L: 700
			this.field3812 = new class171(); // L: 701
			this.field3812.method3459(var1, var2); // L: 702
		}
	} // L: 703

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	void method6676() {
		this.field3798 = new HashMap(); // L: 706
		this.field3815 = new HashMap(); // L: 707
	} // L: 708

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "8"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		if (this.type == 11) { // L: 711
			if (this.field3798 == null) { // L: 712
				this.method6676();
			}

			this.field3798.put(var1, var2); // L: 713
		}
	} // L: 714

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1078028621"
	)
	public void method6659(String var1, int var2) {
		if (this.type == 11) { // L: 717
			if (this.field3815 == null) { // L: 718
				this.method6676();
			}

			this.field3815.put(var1, var2); // L: 719
		}
	} // L: 720

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)Z",
		garbageValue = "1582"
	)
	public boolean method6767(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3812 != null && this.method6697()) { // L: 723
			var1 -= var3; // L: 724
			var2 -= var4; // L: 725
			int var5 = (int)(this.field3812.method3484()[0] * (float)this.width); // L: 726
			int var6 = (int)(this.field3812.method3484()[1] * (float)this.height); // L: 727
			int var7 = var5 + (int)(this.field3812.method3484()[2] * (float)this.width); // L: 728
			int var8 = var6 + (int)(this.field3812.method3484()[3] * (float)this.height); // L: 729
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8; // L: 730
		} else {
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1720194513"
	)
	public boolean method6697() {
		return this.field3889 == 2; // L: 734
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1949298531"
	)
	public int method6670(String var1) {
		return this.type == 11 && this.field3812 != null && this.method6697() ? this.field3812.method3455(var1) : -1; // L: 738 739 741
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1411491785"
	)
	public String method6770(String var1) {
		return this.type == 11 && this.field3812 != null && this.method6697() ? this.field3812.method3446(var1) : null; // L: 745 746
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2028733727"
	)
	public int method6672() {
		return this.field3815 != null && this.field3815.size() > 0 ? 1 : 0; // L: 750
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1851537995"
	)
	public int method6673() {
		if (this.type == 11 && this.field3812 != null && this.field3815 != null && !this.field3815.isEmpty()) { // L: 754
			String var1 = this.field3812.method3450(); // L: 755
			return var1 != null && this.field3815.containsKey(this.field3812.method3450()) ? (Integer)this.field3815.get(var1) : -1; // L: 756 757 759
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "124"
	)
	public String method6674() {
		if (this.type == 11 && this.field3812 != null) { // L: 763
			String var1 = this.field3812.method3450(); // L: 764
			Iterator var2 = this.field3812.method3449().iterator(); // L: 765

			while (var2.hasNext()) {
				class185 var3 = (class185)var2.next(); // L: 766
				String var4 = String.format("%%%S%%", var3.method3664()); // L: 768
				if (var3.vmethod3670() == 0) { // L: 769
					var1.replaceAll(var4, Integer.toString(var3.vmethod3671())); // L: 770
				} else {
					var1.replaceAll(var4, var3.vmethod3666()); // L: 773
				}
			}

			return var1; // L: 777
		} else {
			return null; // L: 776
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(S)[I",
		garbageValue = "-5698"
	)
	public int[] method6675() {
		if (this.type == 11 && this.field3812 != null) { // L: 781
			int[] var1 = new int[3]; // L: 782
			int var2 = 0; // L: 783
			Iterator var3 = this.field3812.method3449().iterator(); // L: 784

			while (var3.hasNext()) {
				class185 var4 = (class185)var3.next(); // L: 785
				if (!var4.method3664().equals("user_id")) { // L: 787
					if (var4.vmethod3670() != 0) { // L: 788
						return null; // L: 795
					}

					var1[var2++] = var4.vmethod3671(); // L: 789
					if (var2 > 3) { // L: 790
						return null; // L: 791
					}
				}
			}

			return var1; // L: 800
		} else {
			return null;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Lgh;",
		garbageValue = "2005455772"
	)
	public class171 method6769() {
		return this.field3812; // L: 804
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lea;B)Z",
		garbageValue = "95"
	)
	public boolean method6677(class340 var1, UrlRequester var2) {
		if (this.type == 11 && this.field3812 != null) { // L: 808
			this.field3812.method3481(var2); // L: 809
			if (this.field3812.method3444() != this.field3889) { // L: 810
				this.field3889 = this.field3812.method3444(); // L: 811
				if (this.field3889 >= 3) { // L: 812
					return true; // L: 813
				}

				if (this.field3889 == 2) { // L: 815
					this.method6772(var1); // L: 816
					return true; // L: 817
				}
			}

			return false; // L: 820
		} else {
			return false;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "-237416595"
	)
	void method6772(class340 var1) {
		this.noClickThrough = true; // L: 841
		ArrayList var2 = this.field3812.method3490(); // L: 842
		ArrayList var3 = this.field3812.method3448(); // L: 843
		int var4 = var2.size() + var3.size(); // L: 844
		this.children = new Widget[var4]; // L: 845
		int var5 = 0; // L: 846

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) { // L: 847 854
			class172 var7 = (class172)var6.next(); // L: 848
			var8 = class14.method184(5, this, var5, 0, 0, 0, 0, var7.field1857); // L: 850
			var8.field3780 = var7.field1859.method2857(); // L: 851
			class344 var9 = new class344(var7.field1859); // L: 852
			var1.field3652.method8008(var8.field3780, var9); // L: 853
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) { // L: 857 865
			class183 var10 = (class183)var6.next(); // L: 858
			var8 = class14.method184(4, this, var5, 0, 0, 0, 0, var10.field1938); // L: 860
			var8.text = var10.field1940; // L: 861
			var8.fontId = (Integer)this.field3798.get(var10.field1943); // L: 862
			var8.textXAlignment = var10.field1941; // L: 863
			var8.textYAlignment = var10.field1942; // L: 864
		}

	} // L: 868

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-75"
	)
	public void method6679() {
		this.field3810 = new class345(); // L: 871

		for (int var1 = 1; var1 <= 12; ++var1) { // L: 872
			this.field3810.field3678.method396(var1, 0); // L: 873
		}

		for (char var2 = 0; var2 < ' '; ++var2) { // L: 875
			this.field3810.field3678.method402(var2, 0); // L: 876
		}

		this.field3810.field3678.method402('\u0080', 0); // L: 878
		this.field3810.field3678.method396(82, 2); // L: 879
		this.field3810.field3678.method396(81, 2); // L: 880
		this.field3810.field3678.method396(86, 2); // L: 881
	} // L: 882

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Lnf;",
		garbageValue = "-473100937"
	)
	public class347 method6667() {
		return this.field3810 != null ? this.field3810.field3674 : null; // L: 885
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Lna;",
		garbageValue = "-1461503376"
	)
	public class341 method6699() {
		return this.field3810 != null ? this.field3810.field3672 : null; // L: 889
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)Lbz;",
		garbageValue = "-8"
	)
	public class27 method6682() {
		return this.field3810 != null ? this.field3810.field3678 : null; // L: 893
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Lny;",
		garbageValue = "-536890792"
	)
	public class345 method6683() {
		return this.field3810; // L: 897
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lnf;I)Z",
		garbageValue = "1875438902"
	)
	boolean method6684(class347 var1) {
		boolean var2 = false; // L: 901
		String var5;
		String var6;
		StringBuilder var7;
		int var8;
		int var9;
		int var10;
		char var11;
		String var12;
		if (this.text != null && !this.text.isEmpty()) { // L: 902
			var6 = this.text; // L: 906
			var7 = new StringBuilder(var6.length()); // L: 908
			var8 = 0; // L: 909
			var9 = -1; // L: 910

			for (var10 = 0; var10 < var6.length(); ++var10) { // L: 911
				var11 = var6.charAt(var10); // L: 912
				if (var11 == '<') { // L: 913
					var7.append(var6.substring(var8, var10)); // L: 914
					var9 = var10; // L: 915
				} else if (var11 == '>' && var9 != -1) { // L: 918
					var12 = var6.substring(var9 + 1, var10); // L: 919
					var9 = -1; // L: 920
					if (var12.equals("lt")) { // L: 921
						var7.append("<"); // L: 922
					} else if (var12.equals("gt")) { // L: 924
						var7.append(">"); // L: 925
					} else if (var12.equals("br")) { // L: 927
						var7.append("\n"); // L: 928
					}

					var8 = var10 + 1; // L: 930
				}
			}

			if (var8 < var6.length()) { // L: 933
				var7.append(var6.substring(var8, var6.length())); // L: 934
			}

			var5 = var7.toString(); // L: 936
			var2 |= var1.method6366(var5); // L: 938
			this.text = ""; // L: 939
		}

		if (this.field3807 != null && !this.field3807.isEmpty()) { // L: 941
			var6 = this.field3807; // L: 945
			var7 = new StringBuilder(var6.length()); // L: 947
			var8 = 0; // L: 948
			var9 = -1; // L: 949

			for (var10 = 0; var10 < var6.length(); ++var10) { // L: 950
				var11 = var6.charAt(var10); // L: 951
				if (var11 == '<') { // L: 952
					var7.append(var6.substring(var8, var10)); // L: 953
					var9 = var10; // L: 954
				} else if (var11 == '>' && var9 != -1) { // L: 957
					var12 = var6.substring(var9 + 1, var10); // L: 958
					var9 = -1; // L: 959
					if (var12.equals("lt")) { // L: 960
						var7.append("<"); // L: 961
					} else if (var12.equals("gt")) { // L: 963
						var7.append(">"); // L: 964
					} else if (var12.equals("br")) { // L: 966
						var7.append("\n"); // L: 967
					}

					var8 = var10 + 1; // L: 969
				}
			}

			if (var8 < var6.length()) { // L: 972
				var7.append(var6.substring(var8, var6.length())); // L: 973
			}

			var5 = var7.toString(); // L: 975
			var2 |= var1.method6367(var5); // L: 977
			this.field3807 = ""; // L: 978
		}

		return var2; // L: 980
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)Z",
		garbageValue = "2146102739"
	)
	public boolean method6685(class340 var1) {
		class347 var2 = this.method6667(); // L: 984
		if (var2 == null) { // L: 985
			return false;
		} else {
			boolean var3 = false; // L: 986
			if (!var2.method6513() && this.fontId != -1) { // L: 987
				int var4 = var2.method6473(); // L: 988
				int var5 = var2.method6422(); // L: 989
				int var6 = var2.method6559(); // L: 990
				int var7 = var2.method6510(); // L: 991
				Font var8 = this.method6656(var1); // L: 992
				if (var8 != null) { // L: 993
					var3 |= var2.method6368(var8); // L: 994
					var3 |= this.method6684(var2); // L: 995
					var3 |= var2.method6373(var4, var5); // L: 996
					var3 |= var2.method6388(var6, var7); // L: 997
				}
			} else if (var2.method6513()) { // L: 1000
				var3 |= this.method6684(var2); // L: 1001
			}

			var2.method6575(); // L: 1003
			return var3; // L: 1004
		}
	}
}
