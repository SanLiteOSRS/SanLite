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
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("as")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1153360045
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		longValue = -5482705015650467445L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("c")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 723449305
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 583049383
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1116579509
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("p")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("l")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 747145243
	)
	static int field214;
	@ObfuscatedName("av")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = 6212805581300353937L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -7997747325592305161L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("z")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 710092349
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1047673487
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 609431559
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -828582919
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 798782721
	)
	int field206;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1299455573
	)
	int field215;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1224110449
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1738807033
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("as")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ab")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("al")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ac")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ap")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 5677079363139152629L
	)
	volatile long field200;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("an")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("aa")
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
		field214 = 500; // L: 73
		volatileFocus = true; // L: 82
		garbageCollectorLastCollectionTime = -1L; // L: 85
		garbageCollectorLastCheckTimeMs = -1L; // L: 86
	}

	protected GameEngine() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.fullRedraw = true; // L: 71
		this.resizeCanvasNextFrame = false; // L: 74
		this.isCanvasInvalid = false; // L: 75
		this.field200 = 0L; // L: 76
		EventQueue var1 = null; // L: 89

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 91
		} catch (Throwable var3) { // L: 93
		}

		this.eventQueue = var1; // L: 94
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider(); // L: 95
		class82.pcmPlayerProvider = var2; // L: 97
	} // L: 99

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1713791676"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 102
			this.method431();
		}

		this.maxCanvasWidth = var1; // L: 103
		this.maxCanvasHeight = var2; // L: 104
	} // L: 105

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "-33"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 108
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 109
				WorldMapDecoration.method4967(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 110
			}

		}
	} // L: 111

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lft;",
		garbageValue = "1471418063"
	)
	@Export("mouseWheel")
	protected class158 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 114
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 115
			this.mouseWheelHandler.addTo(this.canvas); // L: 116
		}

		return this.mouseWheelHandler; // L: 118
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "680079177"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 122
	} // L: 123

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1646341133"
	)
	protected void method418(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 126
	} // L: 127

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1856804732"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 131
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 132
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 133
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 134
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 135
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 136
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 137
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 138
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 139
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 140
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 141
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 142
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 143
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 146
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 147
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 148
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 149
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 150
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 151
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 152
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 153
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 154
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 155
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 156
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 157
		}

		WorldMapLabelSize.method4535(this.canvas); // L: 160
	} // L: 161

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-119"
	)
	protected final void method420() {
		class1.method10(this.canvas); // L: 164
	} // L: 165

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2087598572"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 168
		if (var1 != null) { // L: 169
			Bounds var2 = this.getFrameContentBounds(); // L: 170
			this.contentWidth = Math.max(var2.highX, this.field206); // L: 171
			this.contentHeight = Math.max(var2.highY, this.field215); // L: 172
			if (this.contentWidth <= 0) { // L: 173
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 174
				this.contentHeight = 1;
			}

			class352.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 175
			class228.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 176
			this.canvasX = (this.contentWidth - class352.canvasWidth) / 2; // L: 177
			this.canvasY = 0; // L: 178
			this.canvas.setSize(class352.canvasWidth, class228.canvasHeight); // L: 179
			class268.rasterProvider = new RasterProvider(class352.canvasWidth, class228.canvasHeight, this.canvas); // L: 180
			if (var1 == this.frame) { // L: 181
				Insets var3 = this.frame.getInsets(); // L: 182
				this.canvas.setLocation(var3.left + this.canvasX, this.canvasY + var3.top); // L: 183
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 185
			}

			this.fullRedraw = true; // L: 186
			this.resizeGame(); // L: 187
		}
	} // L: 188

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-333237309"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 193
		int var2 = this.canvasY; // L: 194
		int var3 = this.contentWidth - class352.canvasWidth - var1; // L: 195
		int var4 = this.contentHeight - class228.canvasHeight - var2; // L: 196
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 197
			try {
				Container var5 = this.container(); // L: 199
				int var6 = 0; // L: 200
				int var7 = 0; // L: 201
				if (var5 == this.frame) { // L: 202
					Insets var8 = this.frame.getInsets(); // L: 203
					var6 = var8.left; // L: 204
					var7 = var8.top; // L: 205
				}

				Graphics var10 = var5.getGraphics(); // L: 207
				var10.setColor(Color.black); // L: 208
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 209
				}

				if (var2 > 0) { // L: 210
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 211
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 212
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 214
			}
		}

	} // L: 216

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-22578"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas; // L: 219
		var1.removeKeyListener(KeyHandler.KeyHandler_instance); // L: 221
		var1.removeFocusListener(KeyHandler.KeyHandler_instance); // L: 222
		KeyHandler.field141 = -1; // L: 223
		class83.method2189(this.canvas); // L: 225
		if (this.mouseWheelHandler != null) { // L: 226
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas(); // L: 227
		WorldMapLabelSize.method4535(this.canvas); // L: 228
		class1.method10(this.canvas); // L: 229
		if (this.mouseWheelHandler != null) { // L: 230
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method431(); // L: 231
	} // L: 232

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "389868320"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) { // L: 236
				++GameEngine_redundantStartThreadCount; // L: 237
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 238
					this.error("alreadyloaded"); // L: 239
					return; // L: 240
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 242
				return; // L: 243
			}

			gameEngine = this; // L: 245
			class352.canvasWidth = var1; // L: 246
			class228.canvasHeight = var2; // L: 247
			RunException.RunException_revision = var3; // L: 248
			class138.field1608 = var4; // L: 249
			RunException.RunException_applet = this; // L: 250
			if (taskHandler == null) { // L: 251
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 252
		} catch (Exception var6) { // L: 254
			class359.RunException_sendStackTrace((String)null, var6); // L: 255
			this.error("crash"); // L: 256
		}

	} // L: 258

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-171102111"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 261
		if (this.canvas != null) { // L: 262
			this.canvas.removeFocusListener(this); // L: 263
			var1.remove(this.canvas); // L: 264
		}

		class352.canvasWidth = Math.max(var1.getWidth(), this.field206); // L: 266
		class228.canvasHeight = Math.max(var1.getHeight(), this.field215); // L: 267
		Insets var2;
		if (this.frame != null) { // L: 268
			var2 = this.frame.getInsets(); // L: 269
			class352.canvasWidth -= var2.left + var2.right; // L: 270
			class228.canvasHeight -= var2.top + var2.bottom; // L: 271
		}

		this.canvas = new Canvas(this); // L: 273
		var1.setBackground(Color.BLACK); // L: 274
		var1.setLayout((LayoutManager)null); // L: 275
		var1.add(this.canvas); // L: 276
		this.canvas.setSize(class352.canvasWidth, class228.canvasHeight); // L: 277
		this.canvas.setVisible(true); // L: 278
		this.canvas.setBackground(Color.BLACK); // L: 279
		if (var1 == this.frame) { // L: 280
			var2 = this.frame.getInsets(); // L: 281
			this.canvas.setLocation(var2.left + this.canvasX, var2.top + this.canvasY); // L: 282
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 284
		}

		this.canvas.addFocusListener(this); // L: 285
		this.canvas.requestFocus(); // L: 286
		this.fullRedraw = true; // L: 287
		if (class268.rasterProvider != null && class352.canvasWidth == class268.rasterProvider.width && class228.canvasHeight == class268.rasterProvider.height) { // L: 288
			((RasterProvider)class268.rasterProvider).setComponent(this.canvas); // L: 289
			class268.rasterProvider.drawFull(0, 0); // L: 290
		} else {
			class268.rasterProvider = new RasterProvider(class352.canvasWidth, class228.canvasHeight, this.canvas); // L: 293
		}

		this.isCanvasInvalid = false; // L: 295
		this.field200 = class131.method2916(); // L: 296
	} // L: 297

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "59"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 300
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 301
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 302
				if (var1.endsWith("127.0.0.1")) { // L: 303
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 304
					}

					if (var1.endsWith("192.168.1.")) { // L: 305
						return true;
					} else {
						this.error("invalidhost"); // L: 306
						return false; // L: 307
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-195564351"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class131.method2916(); // L: 351
		long var3 = clientTickTimes[VarpDefinition.field1813]; // L: 352
		clientTickTimes[VarpDefinition.field1813] = var1; // L: 353
		VarpDefinition.field1813 = VarpDefinition.field1813 + 1 & 31; // L: 354
		if (0L != var3 && var1 > var3) { // L: 355
		}

		synchronized(this) { // L: 356
			class125.hasFocus = volatileFocus; // L: 357
		} // L: 358

		this.doCycle(); // L: 359
	} // L: 360

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1974617817"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 363
		long var2 = class131.method2916(); // L: 364
		long var4 = graphicsTickTimes[FriendSystem.field807]; // L: 365
		graphicsTickTimes[FriendSystem.field807] = var2; // L: 366
		FriendSystem.field807 = FriendSystem.field807 + 1 & 31; // L: 367
		if (0L != var4 && var2 > var4) { // L: 368
			int var6 = (int)(var2 - var4); // L: 369
			fps = ((var6 >> 1) + 32000) / var6; // L: 370
		}

		if (++field214 - 1 > 50) { // L: 372
			field214 -= 50; // L: 373
			this.fullRedraw = true; // L: 374
			this.canvas.setSize(class352.canvasWidth, class228.canvasHeight); // L: 375
			this.canvas.setVisible(true); // L: 376
			if (var1 == this.frame) { // L: 377
				Insets var7 = this.frame.getInsets(); // L: 378
				this.canvas.setLocation(var7.left + this.canvasX, this.canvasY + var7.top); // L: 379
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 381
			}
		}

		if (this.isCanvasInvalid) { // L: 383
			this.replaceCanvas();
		}

		this.method430(); // L: 384
		this.draw(this.fullRedraw); // L: 385
		if (this.fullRedraw) { // L: 386
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 387
	} // L: 388

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	final void method430() {
		Bounds var1 = this.getFrameContentBounds(); // L: 391
		if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) { // L: 392
			this.resizeCanvas(); // L: 393
			this.resizeCanvasNextFrame = false; // L: 394
		}

	} // L: 396

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	final void method431() {
		this.resizeCanvasNextFrame = true; // L: 399
	} // L: 400

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-433468147"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 403
			isKilled = true; // L: 404

			try {
				this.canvas.removeFocusListener(this); // L: 406
			} catch (Exception var5) { // L: 408
			}

			try {
				this.kill0(); // L: 410
			} catch (Exception var4) { // L: 412
			}

			if (this.frame != null) { // L: 413
				try {
					System.exit(0); // L: 415
				} catch (Throwable var3) { // L: 417
				}
			}

			if (taskHandler != null) { // L: 419
				try {
					taskHandler.close(); // L: 421
				} catch (Exception var2) { // L: 423
				}
			}

			this.vmethod1109(); // L: 425
		}
	} // L: 426

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-8"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-787882687"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-66"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "453908152"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "-982809922"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 512
			if (class306.fontHelvetica13 == null) { // L: 513
				class306.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 514
				WorldMapSprite.loginScreenFontMetrics = this.canvas.getFontMetrics(class306.fontHelvetica13); // L: 515
			}

			if (var3) { // L: 517
				var4.setColor(Color.black); // L: 518
				var4.fillRect(0, 0, class352.canvasWidth, class228.canvasHeight); // L: 519
			}

			Color var5 = new Color(140, 17, 17); // L: 521

			try {
				if (class82.field1066 == null) { // L: 523
					class82.field1066 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class82.field1066.getGraphics(); // L: 524
				var6.setColor(var5); // L: 525
				var6.drawRect(0, 0, 303, 33); // L: 526
				var6.fillRect(2, 2, var1 * 3, 30); // L: 527
				var6.setColor(Color.black); // L: 528
				var6.drawRect(1, 1, 301, 31); // L: 529
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 530
				var6.setFont(class306.fontHelvetica13); // L: 531
				var6.setColor(Color.white); // L: 532
				var6.drawString(var2, (304 - WorldMapSprite.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 533
				var4.drawImage(class82.field1066, class352.canvasWidth / 2 - 152, class228.canvasHeight / 2 - 18, (ImageObserver)null); // L: 534
			} catch (Exception var9) { // L: 536
				int var7 = class352.canvasWidth / 2 - 152; // L: 537
				int var8 = class228.canvasHeight / 2 - 18; // L: 538
				var4.setColor(var5); // L: 539
				var4.drawRect(var7, var8, 303, 33); // L: 540
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 541
				var4.setColor(Color.black); // L: 542
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 543
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 544
				var4.setFont(class306.fontHelvetica13); // L: 545
				var4.setColor(Color.white); // L: 546
				var4.drawString(var2, var7 + (304 - WorldMapSprite.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 547
			}
		} catch (Exception var10) { // L: 550
			this.canvas.repaint(); // L: 551
		}

	} // L: 553

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	protected final void method442() {
		class82.field1066 = null; // L: 556
		class306.fontHelvetica13 = null; // L: 557
		WorldMapSprite.loginScreenFontMetrics = null; // L: 558
	} // L: 559

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 562
			this.hasErrored = true; // L: 563
			System.out.println("error_game_" + var1); // L: 564

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 566
			} catch (Exception var3) { // L: 568
			}

		}
	} // L: 569

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "8"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 572
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lnz;",
		garbageValue = "-1107216591"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 577
		int var2 = Math.max(var1.getWidth(), this.field206); // L: 578
		int var3 = Math.max(var1.getHeight(), this.field215); // L: 579
		if (this.frame != null) { // L: 580
			Insets var4 = this.frame.getInsets(); // L: 581
			var2 -= var4.right + var4.left; // L: 582
			var3 -= var4.bottom + var4.top; // L: 583
		}

		return new Bounds(var2, var3); // L: 585
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-79"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 589
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-395659383"
	)
	protected abstract void vmethod1109();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 462
			this.fullRedraw = true; // L: 463
			if (class131.method2916() - this.field200 > 1000L) { // L: 464
				Rectangle var2 = var1.getClipBounds(); // L: 465
				if (var2 == null || var2.width >= class352.canvasWidth && var2.height >= class228.canvasHeight) {
					this.isCanvasInvalid = true; // L: 466
				}
			}

		}
	} // L: 468

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 449
			stopTimeMs = class131.method2916(); // L: 450
			WorldMapDecoration.method4967(5000L); // L: 451
			this.kill(); // L: 452
		}
	} // L: 453

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 312
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 313
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 314
					String var2 = TaskHandler.javaVersion; // L: 315
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 316
						this.error("wrongjava"); // L: 317
						return; // L: 318
					}

					if (var2.startsWith("1.6.0_")) { // L: 320
						int var3;
						for (var3 = 6; var3 < var2.length() && GameObject.isDigit(var2.charAt(var3)); ++var3) { // L: 321 322
						}

						String var4 = var2.substring(6, var3); // L: 323
						if (class126.isNumber(var4) && class121.method2824(var4) < 10) { // L: 324
							this.error("wrongjava"); // L: 325
							return; // L: 326
						}
					}

					fiveOrOne = 5; // L: 329
				}
			}

			this.setFocusCycleRoot(true); // L: 332
			this.addCanvas(); // L: 333
			this.setUp(); // L: 334
			class238.clock = class67.method1934(); // L: 335

			while (stopTimeMs == 0L || class131.method2916() < stopTimeMs) { // L: 336
				class142.gameCyclesToDo = class238.clock.wait(cycleDurationMillis, fiveOrOne); // L: 337

				for (int var5 = 0; var5 < class142.gameCyclesToDo; ++var5) { // L: 338
					this.clientTick();
				}

				this.graphicsTick(); // L: 339
				this.post(this.canvas); // L: 340
			}
		} catch (Exception var6) { // L: 343
			class359.RunException_sendStackTrace((String)null, var6); // L: 344
			this.error("crash"); // L: 345
		}

		this.kill(); // L: 347
	} // L: 348

	public final void update(Graphics var1) {
		this.paint(var1); // L: 457
	} // L: 458

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 472
		this.fullRedraw = true; // L: 473
	} // L: 474

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 478
	} // L: 479

	public final void windowActivated(WindowEvent var1) {
	} // L: 482

	public abstract void init();

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 489
	} // L: 490

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 493

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 496

	public final void windowOpened(WindowEvent var1) {
	} // L: 502

	public final void windowClosed(WindowEvent var1) {
	} // L: 485

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 437
			stopTimeMs = 0L; // L: 438
		}
	} // L: 439

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 443
			stopTimeMs = class131.method2916() + 4000L; // L: 444
		}
	} // L: 445

	public final void windowIconified(WindowEvent var1) {
	} // L: 499

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "8"
	)
	static final int method563(int var0, int var1) {
		int var2 = var1 * 57 + var0; // L: 957
		var2 ^= var2 << 13; // L: 958
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE; // L: 959
		return var3 >> 19 & 255; // L: 960
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "2112339889"
	)
	static int method562(int var0, Script var1, boolean var2) {
		Widget var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 1322
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1323
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.x; // L: 1324
			return 1; // L: 1325
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1327
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.y; // L: 1328
			return 1; // L: 1329
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1331
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.width; // L: 1332
			return 1; // L: 1333
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1335
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.height; // L: 1336
			return 1; // L: 1337
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1339
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1340
			return 1; // L: 1341
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1343
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.parentId; // L: 1344
			return 1; // L: 1345
		} else {
			return 2; // L: 1347
		}
	}
}
