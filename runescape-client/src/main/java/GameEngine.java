import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 525436457
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 930466698196425201L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("an")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -59634989
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1656405161
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 558836179
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1058805367
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("as")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("am")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -237142695
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 177230237
	)
	static int field200;
	@ObfuscatedName("bu")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	protected static class25 field212;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		longValue = 6221199429883435377L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		longValue = -7755829023092509053L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = 1501514427
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("ao")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1818873547
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 789379165
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1753863005
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -703705607
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 686366177
	)
	int field215;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 164167003
	)
	int field198;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1378787843
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 160585329
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bo")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bs")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bg")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bk")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("br")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		longValue = -6601029033422362219L
	)
	volatile long field208;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bt")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("be")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null; // L: 41
		GameEngine_redundantStartThreadCount = 0; // L: 43
		stopTimeMs = 0L; // L: 44
		isKilled = false; // L: 45
		cycleDurationMillis = 20; // L: 48
		fiveOrOne = 1; // L: 49
		fps = 0; // L: 50
		graphicsTickTimes = new long[32]; // L: 53
		clientTickTimes = new long[32]; // L: 55
		field200 = 500; // L: 73
		volatileFocus = true; // L: 82
		field212 = new class25(); // L: 84
		garbageCollectorLastCollectionTime = -1L; // L: 86
		garbageCollectorLastCheckTimeMs = -1L; // L: 87
	}

	protected GameEngine() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.fullRedraw = true; // L: 71
		this.resizeCanvasNextFrame = false; // L: 74
		this.isCanvasInvalid = false; // L: 75
		this.field208 = 0L; // L: 76
		EventQueue var1 = null; // L: 90

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 92
		} catch (Throwable var3) { // L: 94
		}

		this.eventQueue = var1; // L: 95
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider(); // L: 96
		Script.pcmPlayerProvider = var2; // L: 98
	} // L: 100

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "2"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 103
			this.method547();
		}

		this.maxCanvasWidth = var1; // L: 104
		this.maxCanvasHeight = var2; // L: 105
	} // L: 106

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-2104196567"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 109
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 110
				Login.method2088(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 111
			}

		}
	} // L: 112

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lgc;",
		garbageValue = "-1701222724"
	)
	@Export("mouseWheel")
	protected class171 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 115
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 116
			this.mouseWheelHandler.addTo(this.canvas); // L: 117
		}

		return this.mouseWheelHandler; // L: 119
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1249824971"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 123
	} // L: 124

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1507261375"
	)
	protected void method481(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 127
	} // L: 128

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "-2020792172"
	)
	public Clipboard method482() {
		return this.clipboard; // L: 131
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "25"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 136
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 137
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 138
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 139
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 140
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 141
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 142
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 143
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 144
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 145
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 146
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 147
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 148
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 151
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 152
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 153
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 154
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 155
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 156
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 157
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 158
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 159
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 160
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 161
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 162
		}

		field212.method344(this.canvas); // L: 165
	} // L: 166

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "6427"
	)
	protected final void method484() {
		field212.method346(); // L: 169
	} // L: 170

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lbs;II)V",
		garbageValue = "-987446905"
	)
	protected void method476(class29 var1, int var2) {
		field212.method342(var1, var2); // L: 173
	} // L: 174

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	protected final void method486() {
		class223.method4546(this.canvas); // L: 177
	} // L: 178

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1946831285"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 181
		if (var1 != null) { // L: 182
			Bounds var2 = this.getFrameContentBounds(); // L: 183
			this.contentWidth = Math.max(var2.highX, this.field215); // L: 184
			this.contentHeight = Math.max(var2.highY, this.field198); // L: 185
			if (this.contentWidth <= 0) { // L: 186
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 187
				this.contentHeight = 1;
			}

			canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 188
			class143.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 189
			this.canvasX = (this.contentWidth - canvasWidth) / 2; // L: 190
			this.canvasY = 0; // L: 191
			this.canvas.setSize(canvasWidth, class143.canvasHeight); // L: 192
			StudioGame.rasterProvider = new RasterProvider(canvasWidth, class143.canvasHeight, this.canvas); // L: 193
			if (var1 == this.frame) { // L: 194
				Insets var3 = this.frame.getInsets(); // L: 195
				this.canvas.setLocation(this.canvasX + var3.left, var3.top + this.canvasY); // L: 196
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 198
			}

			this.fullRedraw = true; // L: 199
			this.resizeGame(); // L: 200
		}
	} // L: 201

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1315269031"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "11"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 206
		int var2 = this.canvasY; // L: 207
		int var3 = this.contentWidth - canvasWidth - var1; // L: 208
		int var4 = this.contentHeight - class143.canvasHeight - var2; // L: 209
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 210
			try {
				Container var5 = this.container(); // L: 212
				int var6 = 0; // L: 213
				int var7 = 0; // L: 214
				if (var5 == this.frame) { // L: 215
					Insets var8 = this.frame.getInsets(); // L: 216
					var6 = var8.left; // L: 217
					var7 = var8.top; // L: 218
				}

				Graphics var10 = var5.getGraphics(); // L: 220
				var10.setColor(Color.black); // L: 221
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 222
				}

				if (var2 > 0) { // L: 223
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 224
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 225
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 227
			}
		}

	} // L: 229

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "122"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		field212.method348(this.canvas); // L: 232
		InvDefinition.method3545(this.canvas); // L: 233
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method303(this.canvas); // L: 234
		}

		this.addCanvas(); // L: 235
		field212.method344(this.canvas); // L: 236
		class223.method4546(this.canvas); // L: 237
		if (this.mouseWheelHandler != null) { // L: 238
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method547(); // L: 239
	} // L: 240

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "131093465"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) { // L: 244
				++GameEngine_redundantStartThreadCount; // L: 245
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 246
					this.error("alreadyloaded"); // L: 247
					return; // L: 248
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 250
				return; // L: 251
			}

			gameEngine = this; // L: 253
			canvasWidth = var1; // L: 254
			class143.canvasHeight = var2; // L: 255
			RunException.RunException_revision = var3; // L: 256
			class199.field2093 = var4; // L: 257
			RunException.RunException_applet = this; // L: 258
			if (taskHandler == null) { // L: 259
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 260
		} catch (Exception var6) { // L: 262
			class364.RunException_sendStackTrace((String)null, var6); // L: 263
			this.error("crash"); // L: 264
		}

	} // L: 266

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1598805112"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 269
		if (this.canvas != null) { // L: 270
			this.canvas.removeFocusListener(this); // L: 271
			var1.remove(this.canvas); // L: 272
		}

		canvasWidth = Math.max(var1.getWidth(), this.field215); // L: 274
		class143.canvasHeight = Math.max(var1.getHeight(), this.field198); // L: 275
		Insets var2;
		if (this.frame != null) { // L: 276
			var2 = this.frame.getInsets(); // L: 277
			canvasWidth -= var2.right + var2.left; // L: 278
			class143.canvasHeight -= var2.top + var2.bottom; // L: 279
		}

		this.canvas = new Canvas(this); // L: 281
		var1.setBackground(Color.BLACK); // L: 282
		var1.setLayout((LayoutManager)null); // L: 283
		var1.add(this.canvas); // L: 284
		this.canvas.setSize(canvasWidth, class143.canvasHeight); // L: 285
		this.canvas.setVisible(true); // L: 286
		this.canvas.setBackground(Color.BLACK); // L: 287
		if (var1 == this.frame) { // L: 288
			var2 = this.frame.getInsets(); // L: 289
			this.canvas.setLocation(var2.left + this.canvasX, this.canvasY + var2.top); // L: 290
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 292
		}

		this.canvas.addFocusListener(this); // L: 293
		this.canvas.requestFocus(); // L: 294
		this.fullRedraw = true; // L: 295
		if (StudioGame.rasterProvider != null && canvasWidth == StudioGame.rasterProvider.width && class143.canvasHeight == StudioGame.rasterProvider.height) { // L: 296
			((RasterProvider)StudioGame.rasterProvider).setComponent(this.canvas); // L: 297
			StudioGame.rasterProvider.drawFull(0, 0); // L: 298
		} else {
			StudioGame.rasterProvider = new RasterProvider(canvasWidth, class143.canvasHeight, this.canvas); // L: 301
		}

		this.isCanvasInvalid = false; // L: 303
		this.field208 = WorldMapSection2.method4844(); // L: 304
	} // L: 305

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2146736962"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 308
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 309
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 310
				if (var1.endsWith("127.0.0.1")) { // L: 311
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 312
					}

					if (var1.endsWith("192.168.1.")) { // L: 313
						return true;
					} else {
						this.error("invalidhost"); // L: 314
						return false; // L: 315
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-433695714"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = WorldMapSection2.method4844(); // L: 359
		long var3 = clientTickTimes[VarpDefinition.field1894]; // L: 360
		clientTickTimes[VarpDefinition.field1894] = var1; // L: 361
		VarpDefinition.field1894 = VarpDefinition.field1894 + 1 & 31; // L: 362
		if (var3 != 0L && var1 > var3) { // L: 363
		}

		synchronized(this) { // L: 364
			Varps.hasFocus = volatileFocus; // L: 365
		} // L: 366

		this.doCycle(); // L: 367
	} // L: 368

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1700389398"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 371
		long var2 = WorldMapSection2.method4844(); // L: 372
		long var4 = graphicsTickTimes[class212.field2347]; // L: 373
		graphicsTickTimes[class212.field2347] = var2; // L: 374
		class212.field2347 = class212.field2347 + 1 & 31; // L: 375
		if (0L != var4 && var2 > var4) { // L: 376
			int var6 = (int)(var2 - var4); // L: 377
			fps = ((var6 >> 1) + 32000) / var6; // L: 378
		}

		if (++field200 - 1 > 50) { // L: 380
			field200 -= 50; // L: 381
			this.fullRedraw = true; // L: 382
			this.canvas.setSize(canvasWidth, class143.canvasHeight); // L: 383
			this.canvas.setVisible(true); // L: 384
			if (var1 == this.frame) { // L: 385
				Insets var7 = this.frame.getInsets(); // L: 386
				this.canvas.setLocation(this.canvasX + var7.left, var7.top + this.canvasY); // L: 387
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 389
			}
		}

		if (this.isCanvasInvalid) { // L: 391
			this.replaceCanvas();
		}

		this.method489(); // L: 392
		this.draw(this.fullRedraw); // L: 393
		if (this.fullRedraw) { // L: 394
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 395
	} // L: 396

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-237818236"
	)
	final void method489() {
		Bounds var1 = this.getFrameContentBounds(); // L: 399
		if (this.contentWidth != var1.highX || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 400
			this.resizeCanvas(); // L: 401
			this.resizeCanvasNextFrame = false; // L: 402
		}

	} // L: 404

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1502888715"
	)
	final void method547() {
		this.resizeCanvasNextFrame = true; // L: 407
	} // L: 408

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 411
			isKilled = true; // L: 412

			try {
				this.canvas.removeFocusListener(this); // L: 414
			} catch (Exception var5) { // L: 416
			}

			try {
				this.kill0(); // L: 418
			} catch (Exception var4) { // L: 420
			}

			if (this.frame != null) { // L: 421
				try {
					System.exit(0); // L: 423
				} catch (Throwable var3) { // L: 425
				}
			}

			if (taskHandler != null) { // L: 427
				try {
					taskHandler.close(); // L: 429
				} catch (Exception var2) { // L: 431
				}
			}

			this.vmethod1617(); // L: 433
		}
	} // L: 434

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1812622075"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "28303"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-78"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZS)V",
		garbageValue = "1501"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 520
			if (class306.fontHelvetica13 == null) { // L: 521
				class306.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 522
				class139.loginScreenFontMetrics = this.canvas.getFontMetrics(class306.fontHelvetica13); // L: 523
			}

			if (var3) { // L: 525
				var4.setColor(Color.black); // L: 526
				var4.fillRect(0, 0, canvasWidth, class143.canvasHeight); // L: 527
			}

			Color var5 = new Color(140, 17, 17); // L: 529

			try {
				if (AbstractByteArrayCopier.field3686 == null) { // L: 531
					AbstractByteArrayCopier.field3686 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = AbstractByteArrayCopier.field3686.getGraphics(); // L: 532
				var6.setColor(var5); // L: 533
				var6.drawRect(0, 0, 303, 33); // L: 534
				var6.fillRect(2, 2, var1 * 3, 30); // L: 535
				var6.setColor(Color.black); // L: 536
				var6.drawRect(1, 1, 301, 31); // L: 537
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 538
				var6.setFont(class306.fontHelvetica13); // L: 539
				var6.setColor(Color.white); // L: 540
				var6.drawString(var2, (304 - class139.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 541
				var4.drawImage(AbstractByteArrayCopier.field3686, canvasWidth / 2 - 152, class143.canvasHeight / 2 - 18, (ImageObserver)null); // L: 542
			} catch (Exception var9) { // L: 544
				int var7 = canvasWidth / 2 - 152; // L: 545
				int var8 = class143.canvasHeight / 2 - 18; // L: 546
				var4.setColor(var5); // L: 547
				var4.drawRect(var7, var8, 303, 33); // L: 548
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 549
				var4.setColor(Color.black); // L: 550
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 551
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 552
				var4.setFont(class306.fontHelvetica13); // L: 553
				var4.setColor(Color.white); // L: 554
				var4.drawString(var2, var7 + (304 - class139.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 555
			}
		} catch (Exception var10) { // L: 558
			this.canvas.repaint(); // L: 559
		}

	} // L: 561

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	protected final void method507() {
		AbstractByteArrayCopier.field3686 = null; // L: 564
		class306.fontHelvetica13 = null; // L: 565
		class139.loginScreenFontMetrics = null; // L: 566
	} // L: 567

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "160680772"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 570
			this.hasErrored = true; // L: 571
			System.out.println("error_game_" + var1); // L: 572

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 574
			} catch (Exception var3) { // L: 576
			}

		}
	} // L: 577

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "335116823"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 580
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Lqy;",
		garbageValue = "-2116397766"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 585
		int var2 = Math.max(var1.getWidth(), this.field215); // L: 586
		int var3 = Math.max(var1.getHeight(), this.field198); // L: 587
		if (this.frame != null) { // L: 588
			Insets var4 = this.frame.getInsets(); // L: 589
			var2 -= var4.right + var4.left; // L: 590
			var3 -= var4.top + var4.bottom; // L: 591
		}

		return new Bounds(var2, var3); // L: 593
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-254629922"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 597
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-87"
	)
	protected abstract void vmethod1617();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 457
			stopTimeMs = WorldMapSection2.method4844(); // L: 458
			Login.method2088(5000L); // L: 459
			this.kill(); // L: 460
		}
	} // L: 461

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 470
			this.fullRedraw = true; // L: 471
			if (WorldMapSection2.method4844() - this.field208 > 1000L) { // L: 472
				Rectangle var2 = var1.getClipBounds(); // L: 473
				if (var2 == null || var2.width >= canvasWidth && var2.height >= class143.canvasHeight) {
					this.isCanvasInvalid = true; // L: 474
				}
			}

		}
	} // L: 476

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 320
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 321
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 322
					String var2 = TaskHandler.javaVersion; // L: 323
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 324
						this.error("wrongjava"); // L: 325
						return; // L: 326
					}

					if (var2.startsWith("1.6.0_")) { // L: 328
						int var3;
						for (var3 = 6; var3 < var2.length() && KeyHandler.isDigit(var2.charAt(var3)); ++var3) { // L: 329 330
						}

						String var4 = var2.substring(6, var3); // L: 331
						if (class162.isNumber(var4) && GrandExchangeEvent.method6573(var4) < 10) { // L: 332
							this.error("wrongjava"); // L: 333
							return; // L: 334
						}
					}

					fiveOrOne = 5; // L: 337
				}
			}

			this.setFocusCycleRoot(true); // L: 340
			this.addCanvas(); // L: 341
			this.setUp(); // L: 342
			clock = class421.method7879(); // L: 343

			while (0L == stopTimeMs || WorldMapSection2.method4844() < stopTimeMs) { // L: 344
				gameCyclesToDo = clock.wait(cycleDurationMillis, fiveOrOne); // L: 345

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) { // L: 346
					this.clientTick();
				}

				this.graphicsTick(); // L: 347
				this.post(this.canvas); // L: 348
			}
		} catch (Exception var6) { // L: 351
			class364.RunException_sendStackTrace((String)null, var6); // L: 352
			this.error("crash"); // L: 353
		}

		this.kill(); // L: 355
	} // L: 356

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 501

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 451
			stopTimeMs = WorldMapSection2.method4844() + 4000L; // L: 452
		}
	} // L: 453

	public final void update(Graphics var1) {
		this.paint(var1); // L: 465
	} // L: 466

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 486
	} // L: 487

	public final void windowActivated(WindowEvent var1) {
	} // L: 490

	public final void windowClosed(WindowEvent var1) {
	} // L: 493

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 497
	} // L: 498

	public final void windowIconified(WindowEvent var1) {
	} // L: 507

	public final void windowOpened(WindowEvent var1) {
	} // L: 510

	public abstract void init();

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 445
			stopTimeMs = 0L; // L: 446
		}
	} // L: 447

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 504

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 480
		this.fullRedraw = true; // L: 481
	} // L: 482

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lhc;",
		garbageValue = "976952306"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 25
			var1 = new VarpDefinition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 28
			return var1; // L: 29
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-141536950"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 9577
			Widget var0 = class36.getWidgetChild(class18.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 9578
			if (var0 != null && var0.onTargetLeave != null) { // L: 9579
				ScriptEvent var1 = new ScriptEvent(); // L: 9580
				var1.widget = var0; // L: 9581
				var1.args = var0.onTargetLeave; // L: 9582
				class9.runScriptEvent(var1); // L: 9583
			}

			Client.selectedSpellItemId = -1; // L: 9585
			Client.isSpellSelected = false; // L: 9586
			class69.invalidateWidget(var0); // L: 9587
		}
	} // L: 9588
}
