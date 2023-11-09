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

@ObfuscatedName("an")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("vo")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static class343 field241;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1203794955
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 4122648005638566587L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("q")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1837674965
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -530252609
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1522705797
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("o")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("k")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2031488307
	)
	static int field230;
	@ObfuscatedName("ah")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	static class26 field228;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -4832067984480184411L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = -1788910031421667657L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("f")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1978140097
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 49859079
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -185229721
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1564967965
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -428984103
	)
	int field223;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -917161143
	)
	int field209;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 484486501
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 401178799
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("au")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ar")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("at")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ab")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("al")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -2560848732574539297L
	)
	volatile long field233;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ld;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("ai")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("ax")
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
		field230 = 500;
		volatileFocus = true; // L: 82
		field228 = new class26(); // L: 84
		garbageCollectorLastCollectionTime = -1L; // L: 86
		garbageCollectorLastCheckTimeMs = -1L; // L: 87
	}

	protected GameEngine() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.fullRedraw = true; // L: 71
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false; // L: 75
		this.field233 = 0L; // L: 76
		EventQueue var1 = null; // L: 90

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 92
		} catch (Throwable var3) { // L: 94
		}

		this.eventQueue = var1; // L: 95
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider(); // L: 96
		class20.pcmPlayerProvider = var2; // L: 98
	} // L: 100

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1034759117"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 103
			this.method514();
		}

		this.maxCanvasWidth = var1; // L: 104
		this.maxCanvasHeight = var2; // L: 105
	} // L: 106

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "812093850"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 109
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 110
				class12.method157(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 111
			}

		}
	} // L: 112

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lff;",
		garbageValue = "815709128"
	)
	@Export("mouseWheel")
	protected class166 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 115
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 116
			this.mouseWheelHandler.addTo(this.canvas); // L: 117
		}

		return this.mouseWheelHandler; // L: 119
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-65"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 123
	} // L: 124

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "26091"
	)
	protected void method497(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 127
	} // L: 128

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "10"
	)
	public Clipboard method498() {
		return this.clipboard; // L: 131
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "316580569"
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

		field228.method355(this.canvas); // L: 165
	} // L: 166

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "504544713"
	)
	protected final void method500() {
		field228.method361(); // L: 173
	} // L: 174

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lav;IB)V",
		garbageValue = "0"
	)
	protected void method501(class30 var1, int var2) {
		field228.method353(var1, var2); // L: 177
	} // L: 178

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "848418077"
	)
	protected final void method539() {
		java.awt.Canvas var1 = this.canvas; // L: 181
		var1.addMouseListener(MouseHandler.MouseHandler_instance); // L: 183
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 184
		var1.addFocusListener(MouseHandler.MouseHandler_instance); // L: 185
	} // L: 187

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1257419471"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 190
		if (var1 != null) { // L: 191
			Bounds var2 = this.getFrameContentBounds(); // L: 192
			this.contentWidth = Math.max(var2.highX, this.field223); // L: 193
			this.contentHeight = Math.max(var2.highY, this.field209); // L: 194
			if (this.contentWidth <= 0) { // L: 195
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 196
				this.contentHeight = 1;
			}

			CollisionMap.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 197
			Language.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 198
			this.canvasX = (this.contentWidth - CollisionMap.canvasWidth) / 2; // L: 199
			this.canvasY = 0; // L: 200
			this.canvas.setSize(CollisionMap.canvasWidth, Language.canvasHeight); // L: 201
			RouteStrategy.rasterProvider = new RasterProvider(CollisionMap.canvasWidth, Language.canvasHeight, this.canvas); // L: 202
			if (var1 == this.frame) { // L: 203
				Insets var3 = this.frame.getInsets(); // L: 204
				this.canvas.setLocation(var3.left + this.canvasX, this.canvasY + var3.top); // L: 205
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 207
			}

			this.fullRedraw = true; // L: 208
			this.resizeGame(); // L: 209
		}
	} // L: 210

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-101"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1765015837"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 215
		int var2 = this.canvasY; // L: 216
		int var3 = this.contentWidth - CollisionMap.canvasWidth - var1; // L: 217
		int var4 = this.contentHeight - Language.canvasHeight - var2; // L: 218
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 219
			try {
				Container var5 = this.container(); // L: 221
				int var6 = 0; // L: 222
				int var7 = 0; // L: 223
				if (var5 == this.frame) { // L: 224
					Insets var8 = this.frame.getInsets(); // L: 225
					var6 = var8.left; // L: 226
					var7 = var8.top; // L: 227
				}

				Graphics var10 = var5.getGraphics(); // L: 229
				var10.setColor(Color.black); // L: 230
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 231
				}

				if (var2 > 0) { // L: 232
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 233
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 234
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 236
			}
		}

	} // L: 238

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1144522069"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		field228.method352(this.canvas); // L: 241
		AttackOption.method2603(this.canvas); // L: 242
		if (this.mouseWheelHandler != null) { // L: 243
			this.mouseWheelHandler.method310(this.canvas);
		}

		this.addCanvas(); // L: 244
		field228.method355(this.canvas); // L: 245
		java.awt.Canvas var1 = this.canvas; // L: 246
		var1.addMouseListener(MouseHandler.MouseHandler_instance); // L: 248
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 249
		var1.addFocusListener(MouseHandler.MouseHandler_instance); // L: 250
		if (this.mouseWheelHandler != null) { // L: 252
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method514(); // L: 253
	} // L: 254

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-39"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) { // L: 258
				++GameEngine_redundantStartThreadCount; // L: 259
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 260
					this.error("alreadyloaded"); // L: 261
					return; // L: 262
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 264
				return; // L: 265
			}

			gameEngine = this; // L: 267
			CollisionMap.canvasWidth = var1; // L: 268
			Language.canvasHeight = var2; // L: 269
			RunException.RunException_revision = var3; // L: 270
			RunException.field5065 = var4; // L: 271
			class422.RunException_applet = this; // L: 272
			if (class242.taskHandler == null) { // L: 273
				class242.taskHandler = new TaskHandler();
			}

			class242.taskHandler.newThreadTask(this, 1); // L: 274
		} catch (Exception var6) { // L: 276
			class132.RunException_sendStackTrace((String)null, var6); // L: 277
			this.error("crash"); // L: 278
		}

	} // L: 280

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 283
		if (this.canvas != null) { // L: 284
			this.canvas.removeFocusListener(this); // L: 285
			var1.remove(this.canvas); // L: 286
		}

		CollisionMap.canvasWidth = Math.max(var1.getWidth(), this.field223); // L: 288
		Language.canvasHeight = Math.max(var1.getHeight(), this.field209); // L: 289
		Insets var2;
		if (this.frame != null) { // L: 290
			var2 = this.frame.getInsets(); // L: 291
			CollisionMap.canvasWidth -= var2.right + var2.left; // L: 292
			Language.canvasHeight -= var2.bottom + var2.top; // L: 293
		}

		this.canvas = new Canvas(this); // L: 295
		var1.setBackground(Color.BLACK); // L: 296
		var1.setLayout((LayoutManager)null); // L: 297
		var1.add(this.canvas); // L: 298
		this.canvas.setSize(CollisionMap.canvasWidth, Language.canvasHeight); // L: 299
		this.canvas.setVisible(true); // L: 300
		this.canvas.setBackground(Color.BLACK); // L: 301
		if (var1 == this.frame) { // L: 302
			var2 = this.frame.getInsets(); // L: 303
			this.canvas.setLocation(this.canvasX + var2.left, var2.top + this.canvasY); // L: 304
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 306
		}

		this.canvas.addFocusListener(this); // L: 307
		this.canvas.requestFocus(); // L: 308
		this.fullRedraw = true; // L: 309
		if (RouteStrategy.rasterProvider != null && CollisionMap.canvasWidth == RouteStrategy.rasterProvider.width && Language.canvasHeight == RouteStrategy.rasterProvider.height) { // L: 310
			((RasterProvider)RouteStrategy.rasterProvider).setComponent(this.canvas); // L: 311
			RouteStrategy.rasterProvider.drawFull(0, 0); // L: 312
		} else {
			RouteStrategy.rasterProvider = new RasterProvider(CollisionMap.canvasWidth, Language.canvasHeight, this.canvas); // L: 315
		}

		this.isCanvasInvalid = false; // L: 317
		this.field233 = Message.method1197(); // L: 318
	} // L: 319

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "88"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 322
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 323
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 324
				if (var1.endsWith("127.0.0.1")) { // L: 325
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 326
					}

					if (var1.endsWith("192.168.1.")) { // L: 327
						return true;
					} else {
						this.error("invalidhost"); // L: 328
						return false; // L: 329
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-42"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = Message.method1197(); // L: 382
		long var3 = clientTickTimes[class1.field2]; // L: 383
		clientTickTimes[class1.field2] = var1; // L: 384
		class1.field2 = class1.field2 + 1 & 31; // L: 385
		if (0L != var3 && var1 > var3) { // L: 386
		}

		synchronized(this) { // L: 387
			PacketBuffer.hasFocus = volatileFocus; // L: 388
		} // L: 389

		this.doCycle(); // L: 390
	} // L: 391

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "683817333"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 394
		long var2 = Message.method1197(); // L: 395
		long var4 = graphicsTickTimes[AbstractRasterProvider.field4993]; // L: 396
		graphicsTickTimes[AbstractRasterProvider.field4993] = var2; // L: 397
		AbstractRasterProvider.field4993 = AbstractRasterProvider.field4993 + 1 & 31; // L: 398
		if (0L != var4 && var2 > var4) { // L: 399
			int var6 = (int)(var2 - var4); // L: 400
			fps = ((var6 >> 1) + 32000) / var6; // L: 401
		}

		if (++field230 - 1 > 50) { // L: 403
			field230 -= 50; // L: 404
			this.fullRedraw = true; // L: 405
			this.canvas.setSize(CollisionMap.canvasWidth, Language.canvasHeight); // L: 406
			this.canvas.setVisible(true); // L: 407
			if (var1 == this.frame) { // L: 408
				Insets var7 = this.frame.getInsets(); // L: 409
				this.canvas.setLocation(var7.left + this.canvasX, this.canvasY + var7.top); // L: 410
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 412
			}
		}

		if (this.isCanvasInvalid) { // L: 414
			this.replaceCanvas();
		}

		this.method513(); // L: 415
		this.draw(this.fullRedraw); // L: 416
		if (this.fullRedraw) { // L: 417
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 418
	} // L: 419

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1669783800"
	)
	final void method513() {
		Bounds var1 = this.getFrameContentBounds(); // L: 422
		if (this.contentWidth != var1.highX || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 423
			this.resizeCanvas(); // L: 424
			this.resizeCanvasNextFrame = false; // L: 425
		}

	} // L: 427

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "22596"
	)
	final void method514() {
		this.resizeCanvasNextFrame = true; // L: 430
	} // L: 431

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1133942382"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 434
			isKilled = true; // L: 435

			try {
				this.canvas.removeFocusListener(this); // L: 437
			} catch (Exception var5) { // L: 439
			}

			try {
				this.kill0(); // L: 441
			} catch (Exception var4) { // L: 443
			}

			if (this.frame != null) { // L: 444
				try {
					System.exit(0); // L: 446
				} catch (Throwable var3) { // L: 448
				}
			}

			if (class242.taskHandler != null) { // L: 450
				try {
					class242.taskHandler.close(); // L: 452
				} catch (Exception var2) { // L: 454
				}
			}

			this.vmethod1227(); // L: 456
		}
	} // L: 457

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-22"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "920051106"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1295386641"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "1038398992"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 543
			if (class20.fontHelvetica13 == null) { // L: 544
				class20.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 545
				Messages.loginScreenFontMetrics = this.canvas.getFontMetrics(class20.fontHelvetica13); // L: 546
			}

			if (var3) { // L: 548
				var4.setColor(Color.black); // L: 549
				var4.fillRect(0, 0, CollisionMap.canvasWidth, Language.canvasHeight); // L: 550
			}

			Color var5 = new Color(140, 17, 17); // L: 552

			try {
				if (class69.field892 == null) { // L: 554
					class69.field892 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class69.field892.getGraphics(); // L: 555
				var6.setColor(var5); // L: 556
				var6.drawRect(0, 0, 303, 33); // L: 557
				var6.fillRect(2, 2, var1 * 3, 30); // L: 558
				var6.setColor(Color.black); // L: 559
				var6.drawRect(1, 1, 301, 31); // L: 560
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 561
				var6.setFont(class20.fontHelvetica13); // L: 562
				var6.setColor(Color.white); // L: 563
				var6.drawString(var2, (304 - Messages.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 564
				var4.drawImage(class69.field892, CollisionMap.canvasWidth / 2 - 152, Language.canvasHeight / 2 - 18, (ImageObserver)null); // L: 565
			} catch (Exception var9) { // L: 567
				int var7 = CollisionMap.canvasWidth / 2 - 152; // L: 568
				int var8 = Language.canvasHeight / 2 - 18; // L: 569
				var4.setColor(var5); // L: 570
				var4.drawRect(var7, var8, 303, 33); // L: 571
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 572
				var4.setColor(Color.black); // L: 573
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 574
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 575
				var4.setFont(class20.fontHelvetica13); // L: 576
				var4.setColor(Color.white); // L: 577
				var4.drawString(var2, var7 + (304 - Messages.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 578
			}
		} catch (Exception var10) { // L: 581
			this.canvas.repaint(); // L: 582
		}

	} // L: 584

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1741242852"
	)
	protected final void method527() {
		class69.field892 = null; // L: 587
		class20.fontHelvetica13 = null; // L: 588
		Messages.loginScreenFontMetrics = null; // L: 589
	} // L: 590

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "754431924"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 593
			this.hasErrored = true; // L: 594
			System.out.println("error_game_" + var1); // L: 595

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 597
			} catch (Exception var3) { // L: 599
			}

		}
	} // L: 600

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "-1750796052"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 603
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lok;",
		garbageValue = "1915646281"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 608
		int var2 = Math.max(var1.getWidth(), this.field223); // L: 609
		int var3 = Math.max(var1.getHeight(), this.field209); // L: 610
		if (this.frame != null) { // L: 611
			Insets var4 = this.frame.getInsets(); // L: 612
			var2 -= var4.right + var4.left; // L: 613
			var3 -= var4.bottom + var4.top; // L: 614
		}

		return new Bounds(var2, var3); // L: 616
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1602409348"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 620
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1344730333"
	)
	protected abstract void vmethod1227();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 480
			stopTimeMs = Message.method1197(); // L: 481
			class12.method157(5000L); // L: 482
			this.kill(); // L: 483
		}
	} // L: 484

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 493
			this.fullRedraw = true; // L: 494
			if (Message.method1197() - this.field233 > 1000L) { // L: 495
				Rectangle var2 = var1.getClipBounds(); // L: 496
				if (var2 == null || var2.width >= CollisionMap.canvasWidth && var2.height >= Language.canvasHeight) {
					this.isCanvasInvalid = true; // L: 497
				}
			}

		}
	} // L: 499

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 474
			stopTimeMs = Message.method1197() + 4000L; // L: 475
		}
	} // L: 476

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 503
		this.fullRedraw = true; // L: 504
	} // L: 505

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 527

	public final void windowIconified(WindowEvent var1) {
	} // L: 530

	public final void windowOpened(WindowEvent var1) {
	} // L: 533

	public abstract void init();

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 334
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 335
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 336
					String var2 = TaskHandler.javaVersion; // L: 337
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 338
						this.error("wrongjava"); // L: 339
						return; // L: 340
					}

					if (var2.startsWith("1.6.0_")) { // L: 342
						int var3;
						for (var3 = 6; var3 < var2.length() && WorldMapLabelSize.isDigit(var2.charAt(var3)); ++var3) { // L: 343 344
						}

						String var4 = var2.substring(6, var3); // L: 345
						if (class346.isNumber(var4) && class412.method7858(var4) < 10) { // L: 346
							this.error("wrongjava"); // L: 347
							return; // L: 348
						}
					}

					fiveOrOne = 5; // L: 351
				}
			}

			this.setFocusCycleRoot(true); // L: 354
			this.addCanvas(); // L: 355
			this.setUp(); // L: 356

			Object var8;
			try {
				var8 = new NanoClock(); // L: 360
			} catch (Throwable var6) { // L: 362
				var8 = new MilliClock(); // L: 363
			}

			UrlRequest.clock = (Clock)var8; // L: 366

			while (0L == stopTimeMs || Message.method1197() < stopTimeMs) { // L: 367
				class173.gameCyclesToDo = UrlRequest.clock.wait(cycleDurationMillis, fiveOrOne); // L: 368

				for (int var5 = 0; var5 < class173.gameCyclesToDo; ++var5) { // L: 369
					this.clientTick();
				}

				this.graphicsTick(); // L: 370
				this.post(this.canvas); // L: 371
			}
		} catch (Exception var7) { // L: 374
			class132.RunException_sendStackTrace((String)null, var7); // L: 375
			this.error("crash"); // L: 376
		}

		this.kill(); // L: 378
	} // L: 379

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 468
			stopTimeMs = 0L; // L: 469
		}
	} // L: 470

	public final void update(Graphics var1) {
		this.paint(var1); // L: 488
	} // L: 489

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 524

	public final void windowClosed(WindowEvent var1) {
	} // L: 516

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 509
	} // L: 510

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 520
	} // L: 521

	public final void windowActivated(WindowEvent var1) {
	} // L: 513

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIIZIB)J",
		garbageValue = "22"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 72
		if (var3) { // L: 73
			var5 |= 65536L;
		}

		return var5; // L: 74
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1631778915"
	)
	static void method665() {
		PacketBufferNode var0 = class136.getPacketBufferNode(ClientPacket.field3057, Client.packetWriter.isaacCipher); // L: 4279
		var0.packetBuffer.writeByte(Message.getWindowedMode()); // L: 4280
		var0.packetBuffer.writeShort(CollisionMap.canvasWidth); // L: 4281
		var0.packetBuffer.writeShort(Language.canvasHeight); // L: 4282
		Client.packetWriter.addNode(var0); // L: 4283
	} // L: 4284

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-53"
	)
	static final void method667() {
		FontName.method8202(false); // L: 5716
		Client.field601 = 0; // L: 5717
		boolean var0 = true; // L: 5718

		int var1;
		for (var1 = 0; var1 < class133.regionLandArchives.length; ++var1) { // L: 5719
			if (Client.regionMapArchiveIds[var1] != -1 && class133.regionLandArchives[var1] == null) { // L: 5720 5721
				class133.regionLandArchives[var1] = class4.field7.takeFile(Client.regionMapArchiveIds[var1], 0); // L: 5722
				if (class133.regionLandArchives[var1] == null) { // L: 5723
					var0 = false; // L: 5724
					++Client.field601; // L: 5725
				}
			}

			if (class379.regionLandArchiveIds[var1] != -1 && class241.regionMapArchives[var1] == null) { // L: 5729 5730
				class241.regionMapArchives[var1] = class4.field7.takeFileEncrypted(class379.regionLandArchiveIds[var1], 0, class104.xteaKeys[var1]); // L: 5731
				if (class241.regionMapArchives[var1] == null) { // L: 5732
					var0 = false; // L: 5733
					++Client.field601; // L: 5734
				}
			}
		}

		if (!var0) { // L: 5739
			Client.field658 = 1; // L: 5740
		} else {
			Client.field786 = 0; // L: 5743
			var0 = true; // L: 5744

			int var3;
			int var4;
			for (var1 = 0; var1 < class133.regionLandArchives.length; ++var1) { // L: 5745
				byte[] var17 = class241.regionMapArchives[var1]; // L: 5746
				if (var17 != null) { // L: 5747
					var3 = (class205.regions[var1] >> 8) * 64 - class154.baseX * 64; // L: 5748
					var4 = (class205.regions[var1] & 255) * 64 - class365.baseY * 64; // L: 5749
					if (Client.isInInstance) { // L: 5750
						var3 = 10; // L: 5751
						var4 = 10; // L: 5752
					}

					var0 &= Tiles.method2214(var17, var3, var4); // L: 5754
				}
			}

			if (!var0) { // L: 5757
				Client.field658 = 2; // L: 5758
			} else {
				if (Client.field658 != 0) { // L: 5761
					SoundSystem.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				Client.playPcmPlayers(); // L: 5762
				ReflectionCheck.scene.clear(); // L: 5763

				for (var1 = 0; var1 < 4; ++var1) { // L: 5764
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 5765
					for (var2 = 0; var2 < 104; ++var2) { // L: 5766
						for (var3 = 0; var3 < 104; ++var3) { // L: 5767
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 5768
						}
					}
				}

				Client.playPcmPlayers(); // L: 5772
				GrandExchangeEvent.method6616(); // L: 5773
				var1 = class133.regionLandArchives.length; // L: 5774
				UrlRequester.method2769(); // L: 5775
				FontName.method8202(true); // L: 5776
				int var5;
				if (!Client.isInInstance) { // L: 5777
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) { // L: 5778
						var3 = (class205.regions[var2] >> 8) * 64 - class154.baseX * 64; // L: 5779
						var4 = (class205.regions[var2] & 255) * 64 - class365.baseY * 64; // L: 5780
						var16 = class133.regionLandArchives[var2]; // L: 5781
						if (var16 != null) { // L: 5782
							Client.playPcmPlayers(); // L: 5783
							class14.method168(var16, var3, var4, class17.field101 * 8 - 48, MusicPatchNode2.field3341 * 8 - 48, Client.collisionMaps); // L: 5784
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 5787
						var3 = (class205.regions[var2] >> 8) * 64 - class154.baseX * 64; // L: 5788
						var4 = (class205.regions[var2] & 255) * 64 - class365.baseY * 64; // L: 5789
						var16 = class133.regionLandArchives[var2]; // L: 5790
						if (var16 == null && MusicPatchNode2.field3341 < 800) { // L: 5791
							Client.playPcmPlayers(); // L: 5792
							class71.method2032(var3, var4, 64, 64); // L: 5793
						}
					}

					FontName.method8202(true); // L: 5796

					for (var2 = 0; var2 < var1; ++var2) { // L: 5797
						byte[] var15 = class241.regionMapArchives[var2]; // L: 5798
						if (var15 != null) { // L: 5799
							var4 = (class205.regions[var2] >> 8) * 64 - class154.baseX * 64; // L: 5800
							var5 = (class205.regions[var2] & 255) * 64 - class365.baseY * 64; // L: 5801
							Client.playPcmPlayers(); // L: 5802
							class139.method3087(var15, var4, var5, ReflectionCheck.scene, Client.collisionMaps); // L: 5803
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 5807
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 5808
						Client.playPcmPlayers(); // L: 5809

						for (var3 = 0; var3 < 13; ++var3) { // L: 5810
							for (var4 = 0; var4 < 13; ++var4) { // L: 5811
								boolean var18 = false; // L: 5812
								var6 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5813
								if (var6 != -1) { // L: 5814
									var7 = var6 >> 24 & 3; // L: 5815
									var8 = var6 >> 1 & 3; // L: 5816
									var9 = var6 >> 14 & 1023; // L: 5817
									var10 = var6 >> 3 & 2047; // L: 5818
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 5819

									for (int var12 = 0; var12 < class205.regions.length; ++var12) { // L: 5820
										if (class205.regions[var12] == var11 && class133.regionLandArchives[var12] != null) { // L: 5821
											int var13 = (var9 - var3) * 8; // L: 5822
											int var14 = (var10 - var4) * 8; // L: 5823
											class26.method364(class133.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps); // L: 5824
											var18 = true; // L: 5825
											break;
										}
									}
								}

								if (!var18) { // L: 5830
									ScriptFrame.method1170(var2, var3 * 8, var4 * 8); // L: 5831
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 5836
						for (var3 = 0; var3 < 13; ++var3) { // L: 5837
							var4 = Client.instanceChunkTemplates[0][var2][var3]; // L: 5838
							if (var4 == -1) { // L: 5839
								class71.method2032(var2 * 8, var3 * 8, 8, 8); // L: 5840
							}
						}
					}

					FontName.method8202(true); // L: 5844

					for (var2 = 0; var2 < 4; ++var2) { // L: 5845
						Client.playPcmPlayers(); // L: 5846

						for (var3 = 0; var3 < 13; ++var3) { // L: 5847
							for (var4 = 0; var4 < 13; ++var4) { // L: 5848
								var5 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5849
								if (var5 != -1) { // L: 5850
									var6 = var5 >> 24 & 3; // L: 5851
									var7 = var5 >> 1 & 3; // L: 5852
									var8 = var5 >> 14 & 1023; // L: 5853
									var9 = var5 >> 3 & 2047; // L: 5854
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 5855

									for (var11 = 0; var11 < class205.regions.length; ++var11) { // L: 5856
										if (class205.regions[var11] == var10 && class241.regionMapArchives[var11] != null) { // L: 5857
											Tiles.method2154(class241.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, ReflectionCheck.scene, Client.collisionMaps); // L: 5858
											break; // L: 5859
										}
									}
								}
							}
						}
					}
				}

				FontName.method8202(true); // L: 5867
				Client.playPcmPlayers(); // L: 5868
				WorldMapIcon_1.method4878(ReflectionCheck.scene, Client.collisionMaps); // L: 5869
				FontName.method8202(true); // L: 5870
				var2 = Tiles.Tiles_minPlane; // L: 5871
				if (var2 > class383.Client_plane) { // L: 5872
					var2 = class383.Client_plane;
				}

				if (var2 < class383.Client_plane - 1) { // L: 5873
					var2 = class383.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 5874
					ReflectionCheck.scene.init(Tiles.Tiles_minPlane);
				} else {
					ReflectionCheck.scene.init(0); // L: 5875
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 5876
					for (var4 = 0; var4 < 104; ++var4) { // L: 5877
						class358.updateItemPile(var3, var4); // L: 5878
					}
				}

				Client.playPcmPlayers(); // L: 5881
				class204.method4182(); // L: 5882
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 5883
				PacketBufferNode var19;
				if (BuddyRankComparator.client.hasFrame()) { // L: 5884
					var19 = class136.getPacketBufferNode(ClientPacket.field3130, Client.packetWriter.isaacCipher); // L: 5886
					var19.packetBuffer.method8536(1057001181); // L: 5887
					Client.packetWriter.addNode(var19); // L: 5888
				}

				if (!Client.isInInstance) { // L: 5890
					var3 = (class17.field101 - 6) / 8; // L: 5891
					var4 = (class17.field101 + 6) / 8; // L: 5892
					var5 = (MusicPatchNode2.field3341 - 6) / 8; // L: 5893
					var6 = (MusicPatchNode2.field3341 + 6) / 8; // L: 5894

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 5895
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 5896
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 5897
								class4.field7.loadRegionFromName("m" + var7 + "_" + var8); // L: 5898
								class4.field7.loadRegionFromName("l" + var7 + "_" + var8); // L: 5899
							}
						}
					}
				}

				class140.method3102(30); // L: 5903
				Client.playPcmPlayers(); // L: 5904
				class384.method7371(); // L: 5905
				var19 = class136.getPacketBufferNode(ClientPacket.field3107, Client.packetWriter.isaacCipher); // L: 5906
				Client.packetWriter.addNode(var19); // L: 5907
				KeyHandler.method430(); // L: 5908
			}
		}
	} // L: 5741 5759 5909

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(IIIILrx;Lkv;I)V",
		garbageValue = "-1646892146"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 12462
		if (var6 > 4225 && var6 < 90000) { // L: 12463
			int var7 = Client.camAngleY & 2047; // L: 12464
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 12465
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 12466
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12467
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12468
			double var12 = Math.atan2((double)var10, (double)var11); // L: 12469
			int var14 = var5.width / 2 - 25; // L: 12470
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 12471
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 12472
			byte var17 = 20; // L: 12473
			class139.redHintArrowSprite.method9049(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 12474
		} else {
			class282.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 12476
		}

	} // L: 12477

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "766208383"
	)
	static final void method563() {
		Client.field717 = Client.cycleCntr; // L: 12525
		BufferedSink.field4572 = true; // L: 12526
	} // L: 12527
}
