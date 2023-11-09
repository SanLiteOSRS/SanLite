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

@ObfuscatedName("aj")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1222145989
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = -7158508282885774545L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("j")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1345986471
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1941087105
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1457718443
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("m")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("h")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 949672115
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 642074987
	)
	static int field227;
	@ObfuscatedName("ae")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ah")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ly;"
	)
	protected static class25 field236;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 8447261131994096925L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -5456854692154052241L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("i")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 234490277
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 984448259
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 498385779
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 367830535
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 508658727
	)
	int field224;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1376734783
	)
	int field221;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2102256141
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 592244155
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("ar")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("al")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("at")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("az")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ap")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -4388351395459595055L
	)
	volatile long field228;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lq;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("ak")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("au")
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
		field227 = 500; // L: 73
		volatileFocus = true; // L: 82
		field236 = new class25(); // L: 84
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
		this.field228 = 0L; // L: 76
		EventQueue var1 = null; // L: 90

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 92
		} catch (Throwable var3) { // L: 94
		}

		this.eventQueue = var1; // L: 95
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider(); // L: 96
		class157.pcmPlayerProvider = var2; // L: 98
	} // L: 100

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2005147940"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 103
			this.method517();
		}

		this.maxCanvasWidth = var1; // L: 104
		this.maxCanvasHeight = var2; // L: 105
	} // L: 106

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "453250447"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 109
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 110
				Clock.method3567(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 111
			}

		}
	} // L: 112

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lfr;",
		garbageValue = "-2125493194"
	)
	@Export("mouseWheel")
	protected class170 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 115
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 116
			this.mouseWheelHandler.addTo(this.canvas); // L: 117
		}

		return this.mouseWheelHandler; // L: 119
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "663192476"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 123
	} // L: 124

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2069299723"
	)
	protected void method501(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 127
	} // L: 128

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "2004102528"
	)
	protected Clipboard method502() {
		return this.clipboard; // L: 131
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1034091676"
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

		field236.method354(this.canvas); // L: 165
	} // L: 166

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-90"
	)
	protected final void method521() {
		field236.method356(); // L: 169
	} // L: 170

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lag;II)V",
		garbageValue = "1002490687"
	)
	protected void method505(class29 var1, int var2) {
		field236.method352(var1, var2); // L: 173
	} // L: 174

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-206278117"
	)
	protected final void method506() {
		java.awt.Canvas var1 = this.canvas; // L: 177
		var1.addMouseListener(MouseHandler.MouseHandler_instance); // L: 179
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 180
		var1.addFocusListener(MouseHandler.MouseHandler_instance); // L: 181
	} // L: 183

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1826842990"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 186
		if (var1 != null) { // L: 187
			Bounds var2 = this.getFrameContentBounds(); // L: 188
			this.contentWidth = Math.max(var2.highX, this.field224); // L: 189
			this.contentHeight = Math.max(var2.highY, this.field221); // L: 190
			if (this.contentWidth <= 0) { // L: 191
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 192
				this.contentHeight = 1;
			}

			canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 193
			class127.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 194
			this.canvasX = (this.contentWidth - canvasWidth) / 2; // L: 195
			this.canvasY = 0; // L: 196
			this.canvas.setSize(canvasWidth, class127.canvasHeight); // L: 197
			class25.rasterProvider = new RasterProvider(canvasWidth, class127.canvasHeight, this.canvas); // L: 198
			if (var1 == this.frame) { // L: 199
				Insets var3 = this.frame.getInsets(); // L: 200
				this.canvas.setLocation(this.canvasX + var3.left, var3.top + this.canvasY); // L: 201
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 203
			}

			this.fullRedraw = true; // L: 204
			this.resizeGame(); // L: 205
		}
	} // L: 206

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1977939270"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-117"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 211
		int var2 = this.canvasY; // L: 212
		int var3 = this.contentWidth - canvasWidth - var1; // L: 213
		int var4 = this.contentHeight - class127.canvasHeight - var2; // L: 214
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 215
			try {
				Container var5 = this.container(); // L: 217
				int var6 = 0; // L: 218
				int var7 = 0; // L: 219
				if (var5 == this.frame) { // L: 220
					Insets var8 = this.frame.getInsets(); // L: 221
					var6 = var8.left; // L: 222
					var7 = var8.top; // L: 223
				}

				Graphics var10 = var5.getGraphics(); // L: 225
				var10.setColor(Color.black); // L: 226
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 227
				}

				if (var2 > 0) { // L: 228
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 229
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 230
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 232
			}
		}

	} // L: 234

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1983896831"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		field236.method372(this.canvas); // L: 237
		class189.method3717(this.canvas); // L: 238
		if (this.mouseWheelHandler != null) { // L: 239
			this.mouseWheelHandler.method308(this.canvas);
		}

		this.addCanvas(); // L: 240
		field236.method354(this.canvas); // L: 241
		java.awt.Canvas var1 = this.canvas; // L: 242
		var1.addMouseListener(MouseHandler.MouseHandler_instance); // L: 244
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 245
		var1.addFocusListener(MouseHandler.MouseHandler_instance); // L: 246
		if (this.mouseWheelHandler != null) { // L: 248
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method517(); // L: 249
	} // L: 250

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-230132207"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) { // L: 254
				++GameEngine_redundantStartThreadCount; // L: 255
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 256
					this.error("alreadyloaded"); // L: 257
					return; // L: 258
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 260
				return; // L: 261
			}

			gameEngine = this; // L: 263
			canvasWidth = var1; // L: 264
			class127.canvasHeight = var2; // L: 265
			RunException.RunException_revision = var3; // L: 266
			RunException.field5089 = var4; // L: 267
			RunException.RunException_applet = this; // L: 268
			if (taskHandler == null) { // L: 269
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 270
		} catch (Exception var6) { // L: 272
			class121.RunException_sendStackTrace((String)null, var6); // L: 273
			this.error("crash"); // L: 274
		}

	} // L: 276

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-65380037"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 279
		if (this.canvas != null) { // L: 280
			this.canvas.removeFocusListener(this); // L: 281
			var1.remove(this.canvas); // L: 282
		}

		canvasWidth = Math.max(var1.getWidth(), this.field224); // L: 284
		class127.canvasHeight = Math.max(var1.getHeight(), this.field221); // L: 285
		Insets var2;
		if (this.frame != null) { // L: 286
			var2 = this.frame.getInsets(); // L: 287
			canvasWidth -= var2.right + var2.left; // L: 288
			class127.canvasHeight -= var2.bottom + var2.top; // L: 289
		}

		this.canvas = new Canvas(this); // L: 291
		var1.setBackground(Color.BLACK); // L: 292
		var1.setLayout((LayoutManager)null); // L: 293
		var1.add(this.canvas); // L: 294
		this.canvas.setSize(canvasWidth, class127.canvasHeight); // L: 295
		this.canvas.setVisible(true); // L: 296
		this.canvas.setBackground(Color.BLACK); // L: 297
		if (var1 == this.frame) { // L: 298
			var2 = this.frame.getInsets(); // L: 299
			this.canvas.setLocation(this.canvasX + var2.left, var2.top + this.canvasY); // L: 300
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 302
		}

		this.canvas.addFocusListener(this); // L: 303
		this.canvas.requestFocus(); // L: 304
		this.fullRedraw = true; // L: 305
		if (class25.rasterProvider != null && canvasWidth == class25.rasterProvider.width && class127.canvasHeight == class25.rasterProvider.height) { // L: 306
			((RasterProvider)class25.rasterProvider).setComponent(this.canvas); // L: 307
			class25.rasterProvider.drawFull(0, 0); // L: 308
		} else {
			class25.rasterProvider = new RasterProvider(canvasWidth, class127.canvasHeight, this.canvas); // L: 311
		}

		this.isCanvasInvalid = false; // L: 313
		this.field228 = class153.method3317(); // L: 314
	} // L: 315

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1655777460"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 318
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 319
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 320
				if (var1.endsWith("127.0.0.1")) { // L: 321
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 322
					}

					if (var1.endsWith("192.168.1.")) { // L: 323
						return true;
					} else {
						this.error("invalidhost"); // L: 324
						return false; // L: 325
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "753394225"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class153.method3317(); // L: 369
		long var3 = clientTickTimes[ReflectionCheck.field279]; // L: 370
		clientTickTimes[ReflectionCheck.field279] = var1; // L: 371
		ReflectionCheck.field279 = ReflectionCheck.field279 + 1 & 31; // L: 372
		if (0L != var3 && var1 > var3) { // L: 373
		}

		synchronized(this) { // L: 374
			hasFocus = volatileFocus; // L: 375
		} // L: 376

		this.doCycle(); // L: 377
	} // L: 378

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1164403462"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 381
		long var2 = class153.method3317(); // L: 382
		long var4 = graphicsTickTimes[class20.field117]; // L: 383
		graphicsTickTimes[class20.field117] = var2; // L: 384
		class20.field117 = class20.field117 + 1 & 31; // L: 385
		if (0L != var4 && var2 > var4) { // L: 386
			int var6 = (int)(var2 - var4); // L: 387
			fps = ((var6 >> 1) + 32000) / var6; // L: 388
		}

		if (++field227 - 1 > 50) { // L: 390
			field227 -= 50; // L: 391
			this.fullRedraw = true; // L: 392
			this.canvas.setSize(canvasWidth, class127.canvasHeight); // L: 393
			this.canvas.setVisible(true); // L: 394
			if (var1 == this.frame) { // L: 395
				Insets var7 = this.frame.getInsets(); // L: 396
				this.canvas.setLocation(var7.left + this.canvasX, this.canvasY + var7.top); // L: 397
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 399
			}
		}

		if (this.isCanvasInvalid) { // L: 401
			this.replaceCanvas();
		}

		this.method516(); // L: 402
		this.draw(this.fullRedraw); // L: 403
		if (this.fullRedraw) { // L: 404
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 405
	} // L: 406

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1962102591"
	)
	final void method516() {
		Bounds var1 = this.getFrameContentBounds(); // L: 409
		if (var1.highX != this.contentWidth || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) { // L: 410
			this.resizeCanvas(); // L: 411
			this.resizeCanvasNextFrame = false; // L: 412
		}

	} // L: 414

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1743407922"
	)
	final void method517() {
		this.resizeCanvasNextFrame = true; // L: 417
	} // L: 418

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2049964253"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 421
			isKilled = true; // L: 422

			try {
				this.canvas.removeFocusListener(this); // L: 424
			} catch (Exception var5) { // L: 426
			}

			try {
				this.kill0(); // L: 428
			} catch (Exception var4) { // L: 430
			}

			if (this.frame != null) { // L: 431
				try {
					System.exit(0); // L: 433
				} catch (Throwable var3) { // L: 435
				}
			}

			if (taskHandler != null) { // L: 437
				try {
					taskHandler.close(); // L: 439
				} catch (Exception var2) { // L: 441
				}
			}

			this.vmethod1338(); // L: 443
		}
	} // L: 444

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1082760075"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1127205702"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1484603297"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1860938943"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "-375774379"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 530
			if (class1.fontHelvetica13 == null) { // L: 531
				class1.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 532
				class153.loginScreenFontMetrics = this.canvas.getFontMetrics(class1.fontHelvetica13); // L: 533
			}

			if (var3) { // L: 535
				var4.setColor(Color.black); // L: 536
				var4.fillRect(0, 0, canvasWidth, class127.canvasHeight); // L: 537
			}

			Color var5 = new Color(140, 17, 17); // L: 539

			try {
				if (class364.field4369 == null) { // L: 541
					class364.field4369 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class364.field4369.getGraphics(); // L: 542
				var6.setColor(var5); // L: 543
				var6.drawRect(0, 0, 303, 33); // L: 544
				var6.fillRect(2, 2, var1 * 3, 30); // L: 545
				var6.setColor(Color.black); // L: 546
				var6.drawRect(1, 1, 301, 31); // L: 547
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 548
				var6.setFont(class1.fontHelvetica13); // L: 549
				var6.setColor(Color.white); // L: 550
				var6.drawString(var2, (304 - class153.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 551
				var4.drawImage(class364.field4369, canvasWidth / 2 - 152, class127.canvasHeight / 2 - 18, (ImageObserver)null); // L: 552
			} catch (Exception var9) { // L: 554
				int var7 = canvasWidth / 2 - 152; // L: 555
				int var8 = class127.canvasHeight / 2 - 18; // L: 556
				var4.setColor(var5); // L: 557
				var4.drawRect(var7, var8, 303, 33); // L: 558
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 559
				var4.setColor(Color.black); // L: 560
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 561
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 562
				var4.setFont(class1.fontHelvetica13); // L: 563
				var4.setColor(Color.white); // L: 564
				var4.drawString(var2, var7 + (304 - class153.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 565
			}
		} catch (Exception var10) { // L: 568
			this.canvas.repaint(); // L: 569
		}

	} // L: 571

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-20714"
	)
	protected final void method632() {
		class364.field4369 = null; // L: 574
		class1.fontHelvetica13 = null; // L: 575
		class153.loginScreenFontMetrics = null; // L: 576
	} // L: 577

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-608170522"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 580
			this.hasErrored = true; // L: 581
			System.out.println("error_game_" + var1); // L: 582

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 584
			} catch (Exception var3) { // L: 586
			}

		}
	} // L: 587

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "101"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 590
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Loj;",
		garbageValue = "-1593123346"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 595
		int var2 = Math.max(var1.getWidth(), this.field224); // L: 596
		int var3 = Math.max(var1.getHeight(), this.field221); // L: 597
		if (this.frame != null) { // L: 598
			Insets var4 = this.frame.getInsets(); // L: 599
			var2 -= var4.right + var4.left; // L: 600
			var3 -= var4.top + var4.bottom; // L: 601
		}

		return new Bounds(var2, var3); // L: 603
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-192910334"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 607
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1991813544"
	)
	protected abstract void vmethod1338();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 467
			stopTimeMs = class153.method3317(); // L: 468
			Clock.method3567(5000L); // L: 469
			this.kill(); // L: 470
		}
	} // L: 471

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 480
			this.fullRedraw = true; // L: 481
			if (class153.method3317() - this.field228 > 1000L) { // L: 482
				Rectangle var2 = var1.getClipBounds(); // L: 483
				if (var2 == null || var2.width >= canvasWidth && var2.height >= class127.canvasHeight) {
					this.isCanvasInvalid = true; // L: 484
				}
			}

		}
	} // L: 486

	public final void windowActivated(WindowEvent var1) {
	} // L: 500

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 455
			stopTimeMs = 0L; // L: 456
		}
	} // L: 457

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 461
			stopTimeMs = class153.method3317() + 4000L; // L: 462
		}
	} // L: 463

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 507
	} // L: 508

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 490
		this.fullRedraw = true; // L: 491
	} // L: 492

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 496
	} // L: 497

	public final void windowClosed(WindowEvent var1) {
	} // L: 503

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 514

	public final void windowIconified(WindowEvent var1) {
	} // L: 517

	public final void windowOpened(WindowEvent var1) {
	} // L: 520

	public abstract void init();

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 330
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 331
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 332
					String var2 = TaskHandler.javaVersion; // L: 333
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 334
						this.error("wrongjava"); // L: 335
						return; // L: 336
					}

					if (var2.startsWith("1.6.0_")) { // L: 338
						int var3;
						for (var3 = 6; var3 < var2.length() && CollisionMap.isDigit(var2.charAt(var3)); ++var3) { // L: 339 340
						}

						String var4 = var2.substring(6, var3); // L: 341
						if (class142.isNumber(var4) && WorldMapScaleHandler.method5468(var4) < 10) { // L: 342
							this.error("wrongjava"); // L: 343
							return; // L: 344
						}
					}

					fiveOrOne = 5; // L: 347
				}
			}

			this.setFocusCycleRoot(true); // L: 350
			this.addCanvas(); // L: 351
			this.setUp(); // L: 352
			class177.clock = class161.method3385(); // L: 353

			while (0L == stopTimeMs || class153.method3317() < stopTimeMs) { // L: 354
				InterfaceParent.gameCyclesToDo = class177.clock.wait(cycleDurationMillis, fiveOrOne); // L: 355

				for (int var5 = 0; var5 < InterfaceParent.gameCyclesToDo; ++var5) { // L: 356
					this.clientTick();
				}

				this.graphicsTick(); // L: 357
				this.post(this.canvas); // L: 358
			}
		} catch (Exception var6) { // L: 361
			class121.RunException_sendStackTrace((String)null, var6); // L: 362
			this.error("crash"); // L: 363
		}

		this.kill(); // L: 365
	} // L: 366

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 511

	public final void update(Graphics var1) {
		this.paint(var1); // L: 475
	} // L: 476
}
