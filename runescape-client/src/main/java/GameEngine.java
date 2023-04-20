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
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1470919505
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 951500247553634275L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("au")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2118369515
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1500331287
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1913114939
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("ax")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ag")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1687260435
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 148605821
	)
	static int field219;
	@ObfuscatedName("bu")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	protected static class25 field216;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		longValue = -3199239881614683375L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		longValue = 9118577410129870745L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = -1727408401
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("ab")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -927540391
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1747234661
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -744210797
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 895830209
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 69014751
	)
	int field211;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1673949127
	)
	int field212;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2087275977
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 83534669
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("by")
	protected boolean field215;
	@ObfuscatedName("be")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bk")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bx")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bm")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bd")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		longValue = -6171487387477770437L
	)
	volatile long field204;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("br")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bg")
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
		field219 = 500;
		volatileFocus = true;
		field216 = new class25();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.field215 = false;
		this.fullRedraw = true; // L: 72
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field204 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 93
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider(); // L: 97
		PcmPlayer.pcmPlayerProvider = var2; // L: 99
	} // L: 101

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "2"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 104
			this.method600();
		}

		this.maxCanvasWidth = var1; // L: 105
		this.maxCanvasHeight = var2; // L: 106
	} // L: 107

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "1513004820"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 110
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 111
				PlayerComposition.method6084(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 112
			}

		}
	} // L: 113

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lgf;",
		garbageValue = "1822835590"
	)
	@Export("mouseWheel")
	protected class170 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 116
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 117
			this.mouseWheelHandler.addTo(this.canvas); // L: 118
		}

		return this.mouseWheelHandler; // L: 120
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1981115082"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 124
	} // L: 125

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-94"
	)
	protected void method555(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 128
	} // L: 129

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "-481768005"
	)
	protected Clipboard method520() {
		return this.clipboard; // L: 132
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "39"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		class158.method3413(); // L: 136
		field216.method355(this.canvas); // L: 137
	} // L: 138

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "95"
	)
	protected final void method540() {
		field216.method357(); // L: 141
	} // L: 142

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbe;IB)V",
		garbageValue = "-45"
	)
	protected void method523(class29 var1, int var2) {
		field216.method353(var1, var2); // L: 145
	} // L: 146

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	protected final void method649() {
		class394.method7672(this.canvas); // L: 149
	} // L: 150

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1698796359"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 153
		if (var1 != null) { // L: 154
			Bounds var2 = this.getFrameContentBounds(); // L: 155
			this.contentWidth = Math.max(var2.highX, this.field211); // L: 156
			this.contentHeight = Math.max(var2.highY, this.field212); // L: 157
			if (this.contentWidth <= 0) { // L: 158
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 159
				this.contentHeight = 1;
			}

			canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 160
			class262.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 161
			this.canvasX = (this.contentWidth - canvasWidth) / 2; // L: 162
			this.canvasY = 0; // L: 163
			this.canvas.setSize(canvasWidth, class262.canvasHeight); // L: 164
			RouteStrategy.rasterProvider = new RasterProvider(canvasWidth, class262.canvasHeight, this.canvas, this.field215); // L: 165
			if (var1 == this.frame) { // L: 166
				Insets var3 = this.frame.getInsets(); // L: 167
				this.canvas.setLocation(var3.left + this.canvasX, this.canvasY + var3.top); // L: 168
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 170
			}

			this.fullRedraw = true; // L: 171
			this.resizeGame(); // L: 172
		}
	} // L: 173

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "79"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "23"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 178
		int var2 = this.canvasY; // L: 179
		int var3 = this.contentWidth - canvasWidth - var1; // L: 180
		int var4 = this.contentHeight - class262.canvasHeight - var2; // L: 181
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 182
			try {
				Container var5 = this.container(); // L: 184
				int var6 = 0; // L: 185
				int var7 = 0; // L: 186
				if (var5 == this.frame) { // L: 187
					Insets var8 = this.frame.getInsets(); // L: 188
					var6 = var8.left; // L: 189
					var7 = var8.top; // L: 190
				}

				Graphics var10 = var5.getGraphics(); // L: 192
				var10.setColor(Color.black); // L: 193
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 194
				}

				if (var2 > 0) { // L: 195
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 196
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 197
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 199
			}
		}

	} // L: 201

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1142186209"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		field216.method370(this.canvas); // L: 204
		java.awt.Canvas var1 = this.canvas; // L: 205
		var1.removeMouseListener(MouseHandler.KeyHandler_instance); // L: 207
		var1.removeMouseMotionListener(MouseHandler.KeyHandler_instance); // L: 208
		var1.removeFocusListener(MouseHandler.KeyHandler_instance); // L: 209
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 210
		if (this.mouseWheelHandler != null) { // L: 212
			this.mouseWheelHandler.method308(this.canvas);
		}

		this.addCanvas(); // L: 213
		field216.method355(this.canvas); // L: 214
		class394.method7672(this.canvas); // L: 215
		if (this.mouseWheelHandler != null) { // L: 216
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method600(); // L: 217
	} // L: 218

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-75"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) { // L: 222
				++GameEngine_redundantStartThreadCount; // L: 223
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 224
					this.error("alreadyloaded"); // L: 225
					return; // L: 226
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 228
				return; // L: 229
			}

			gameEngine = this; // L: 231
			canvasWidth = var1; // L: 232
			class262.canvasHeight = var2; // L: 233
			RunException.RunException_revision = var3; // L: 234
			class441.field4731 = var4; // L: 235
			class100.RunException_applet = this; // L: 236
			if (taskHandler == null) { // L: 237
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 238
		} catch (Exception var6) { // L: 240
			class387.RunException_sendStackTrace((String)null, var6); // L: 241
			this.error("crash"); // L: 242
		}

	} // L: 244

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1549595366"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 247
		if (this.canvas != null) { // L: 248
			this.canvas.removeFocusListener(this); // L: 249
			var1.remove(this.canvas); // L: 250
		}

		canvasWidth = Math.max(var1.getWidth(), this.field211); // L: 252
		class262.canvasHeight = Math.max(var1.getHeight(), this.field212); // L: 253
		Insets var2;
		if (this.frame != null) { // L: 254
			var2 = this.frame.getInsets(); // L: 255
			canvasWidth -= var2.right + var2.left; // L: 256
			class262.canvasHeight -= var2.bottom + var2.top; // L: 257
		}

		this.canvas = new Canvas(this); // L: 259
		var1.setBackground(Color.BLACK); // L: 260
		var1.setLayout((LayoutManager)null); // L: 261
		var1.add(this.canvas); // L: 262
		this.canvas.setSize(canvasWidth, class262.canvasHeight); // L: 263
		this.canvas.setVisible(true); // L: 264
		this.canvas.setBackground(Color.BLACK); // L: 265
		if (var1 == this.frame) { // L: 266
			var2 = this.frame.getInsets(); // L: 267
			this.canvas.setLocation(var2.left + this.canvasX, var2.top + this.canvasY); // L: 268
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 270
		}

		this.canvas.addFocusListener(this); // L: 271
		this.canvas.requestFocus(); // L: 272
		this.fullRedraw = true; // L: 273
		if (RouteStrategy.rasterProvider != null && canvasWidth == RouteStrategy.rasterProvider.width && class262.canvasHeight == RouteStrategy.rasterProvider.height) { // L: 274
			((RasterProvider)RouteStrategy.rasterProvider).setComponent(this.canvas); // L: 275
			RouteStrategy.rasterProvider.drawFull(0, 0); // L: 276
		} else {
			RouteStrategy.rasterProvider = new RasterProvider(canvasWidth, class262.canvasHeight, this.canvas, this.field215); // L: 279
		}

		this.isCanvasInvalid = false; // L: 281
		this.field204 = class96.method2634(); // L: 282
	} // L: 283

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "14"
	)
	protected void method531(boolean var1) {
		if (this.field215 != var1) { // L: 286
			this.field215 = var1; // L: 287
			RouteStrategy.rasterProvider.method9458(var1); // L: 288
			RouteStrategy.rasterProvider.apply(); // L: 289
		}

	} // L: 291

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "524669560"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 294
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 295
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 296
				if (var1.endsWith("127.0.0.1")) { // L: 297
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 298
					}

					if (var1.endsWith("192.168.1.")) { // L: 299
						return true;
					} else {
						this.error("invalidhost"); // L: 300
						return false; // L: 301
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1294253430"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class96.method2634(); // L: 345
		long var3 = clientTickTimes[class335.field3834]; // L: 346
		clientTickTimes[class335.field3834] = var1; // L: 347
		class335.field3834 = class335.field3834 + 1 & 31; // L: 348
		if (var3 != 0L && var1 > var3) { // L: 349
		}

		synchronized(this) { // L: 350
			AbstractByteArrayCopier.hasFocus = volatileFocus; // L: 351
		} // L: 352

		this.doCycle(); // L: 353
	} // L: 354

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "29"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 357
		long var2 = class96.method2634(); // L: 358
		long var4 = graphicsTickTimes[Rasterizer3D.field2520]; // L: 359
		graphicsTickTimes[Rasterizer3D.field2520] = var2; // L: 360
		Rasterizer3D.field2520 = Rasterizer3D.field2520 + 1 & 31; // L: 361
		if (0L != var4 && var2 > var4) { // L: 362
			int var6 = (int)(var2 - var4); // L: 363
			fps = ((var6 >> 1) + 32000) / var6; // L: 364
		}

		if (++field219 - 1 > 50) { // L: 366
			field219 -= 50; // L: 367
			this.fullRedraw = true; // L: 368
			this.canvas.setSize(canvasWidth, class262.canvasHeight); // L: 369
			this.canvas.setVisible(true); // L: 370
			if (var1 == this.frame) { // L: 371
				Insets var7 = this.frame.getInsets(); // L: 372
				this.canvas.setLocation(this.canvasX + var7.left, var7.top + this.canvasY); // L: 373
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 375
			}
		}

		if (this.isCanvasInvalid) { // L: 377
			this.replaceCanvas();
		}

		this.method535(); // L: 378
		this.draw(this.fullRedraw); // L: 379
		if (this.fullRedraw) { // L: 380
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 381
	} // L: 382

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1941798605"
	)
	final void method535() {
		Bounds var1 = this.getFrameContentBounds(); // L: 385
		if (var1.highX != this.contentWidth || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 386
			this.resizeCanvas(); // L: 387
			this.resizeCanvasNextFrame = false; // L: 388
		}

	} // L: 390

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2091423650"
	)
	final void method600() {
		this.resizeCanvasNextFrame = true; // L: 393
	} // L: 394

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "812160949"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 397
			isKilled = true; // L: 398

			try {
				this.canvas.removeFocusListener(this); // L: 400
			} catch (Exception var5) { // L: 402
			}

			try {
				this.kill0(); // L: 404
			} catch (Exception var4) { // L: 406
			}

			if (this.frame != null) { // L: 407
				try {
					System.exit(0); // L: 409
				} catch (Throwable var3) { // L: 411
				}
			}

			if (taskHandler != null) { // L: 413
				try {
					taskHandler.close(); // L: 415
				} catch (Exception var2) { // L: 417
				}
			}

			this.vmethod1452(); // L: 419
		}
	} // L: 420

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2106306379"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "7737"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-72974483"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "-2001673745"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 506
			if (class244.fontHelvetica13 == null) { // L: 507
				class244.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 508
				class27.loginScreenFontMetrics = this.canvas.getFontMetrics(class244.fontHelvetica13); // L: 509
			}

			if (var3) { // L: 511
				var4.setColor(Color.black); // L: 512
				var4.fillRect(0, 0, canvasWidth, class262.canvasHeight); // L: 513
			}

			Color var5 = new Color(140, 17, 17); // L: 515

			try {
				if (PacketWriter.field1394 == null) { // L: 517
					PacketWriter.field1394 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = PacketWriter.field1394.getGraphics(); // L: 518
				var6.setColor(var5); // L: 519
				var6.drawRect(0, 0, 303, 33); // L: 520
				var6.fillRect(2, 2, var1 * 3, 30); // L: 521
				var6.setColor(Color.black); // L: 522
				var6.drawRect(1, 1, 301, 31); // L: 523
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 524
				var6.setFont(class244.fontHelvetica13); // L: 525
				var6.setColor(Color.white); // L: 526
				var6.drawString(var2, (304 - class27.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 527
				var4.drawImage(PacketWriter.field1394, canvasWidth / 2 - 152, class262.canvasHeight / 2 - 18, (ImageObserver)null); // L: 528
			} catch (Exception var9) { // L: 530
				int var7 = canvasWidth / 2 - 152; // L: 531
				int var8 = class262.canvasHeight / 2 - 18; // L: 532
				var4.setColor(var5); // L: 533
				var4.drawRect(var7, var8, 303, 33); // L: 534
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 535
				var4.setColor(Color.black); // L: 536
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 537
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 538
				var4.setFont(class244.fontHelvetica13); // L: 539
				var4.setColor(Color.white); // L: 540
				var4.drawString(var2, var7 + (304 - class27.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 541
			}
		} catch (Exception var10) { // L: 544
			this.canvas.repaint(); // L: 545
		}

	} // L: 547

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-274523606"
	)
	protected final void method644() {
		PacketWriter.field1394 = null; // L: 550
		class244.fontHelvetica13 = null; // L: 551
		class27.loginScreenFontMetrics = null; // L: 552
	} // L: 553

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1294118678"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 556
			this.hasErrored = true; // L: 557
			System.out.println("error_game_" + var1); // L: 558

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 560
			} catch (Exception var3) { // L: 562
			}

		}
	} // L: 563

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "6"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 566
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Lqu;",
		garbageValue = "-1516355947"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 571
		int var2 = Math.max(var1.getWidth(), this.field211); // L: 572
		int var3 = Math.max(var1.getHeight(), this.field212); // L: 573
		if (this.frame != null) { // L: 574
			Insets var4 = this.frame.getInsets(); // L: 575
			var2 -= var4.right + var4.left; // L: 576
			var3 -= var4.top + var4.bottom; // L: 577
		}

		return new Bounds(var2, var3); // L: 579
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "972866614"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 583
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1086551379"
	)
	protected abstract void vmethod1452();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 443
			stopTimeMs = class96.method2634(); // L: 444
			PlayerComposition.method6084(5000L); // L: 445
			this.kill(); // L: 446
		}
	} // L: 447

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 456
			this.fullRedraw = true; // L: 457
			if (class96.method2634() - this.field204 > 1000L) { // L: 458
				Rectangle var2 = var1.getClipBounds(); // L: 459
				if (var2 == null || var2.width >= canvasWidth && var2.height >= class262.canvasHeight) {
					this.isCanvasInvalid = true; // L: 460
				}
			}

		}
	} // L: 462

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 306
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 307
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 308
					String var2 = TaskHandler.javaVersion; // L: 309
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 310
						this.error("wrongjava"); // L: 311
						return; // L: 312
					}

					if (var2.startsWith("1.6.0_")) { // L: 314
						int var3;
						for (var3 = 6; var3 < var2.length() && class149.isDigit(var2.charAt(var3)); ++var3) { // L: 315 316
						}

						String var4 = var2.substring(6, var3); // L: 317
						if (WorldMapSectionType.isNumber(var4) && PacketBufferNode.method5709(var4) < 10) { // L: 318
							this.error("wrongjava"); // L: 319
							return; // L: 320
						}
					}

					fiveOrOne = 5; // L: 323
				}
			}

			this.setFocusCycleRoot(true); // L: 326
			this.addCanvas(); // L: 327
			this.setUp(); // L: 328
			class399.clock = class148.method3284(); // L: 329

			while (stopTimeMs == 0L || class96.method2634() < stopTimeMs) { // L: 330
				DirectByteArrayCopier.gameCyclesToDo = class399.clock.wait(cycleDurationMillis, fiveOrOne); // L: 331

				for (int var5 = 0; var5 < DirectByteArrayCopier.gameCyclesToDo; ++var5) { // L: 332
					this.clientTick();
				}

				this.graphicsTick(); // L: 333
				this.post(this.canvas); // L: 334
			}
		} catch (Exception var6) { // L: 337
			class387.RunException_sendStackTrace((String)null, var6); // L: 338
			this.error("crash"); // L: 339
		}

		this.kill(); // L: 341
	} // L: 342

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 431
			stopTimeMs = 0L; // L: 432
		}
	} // L: 433

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 437
			stopTimeMs = class96.method2634() + 4000L; // L: 438
		}
	} // L: 439

	public final void update(Graphics var1) {
		this.paint(var1); // L: 451
	} // L: 452

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 466
		this.fullRedraw = true; // L: 467
	} // L: 468

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 483
	} // L: 484

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 487

	public final void windowIconified(WindowEvent var1) {
	} // L: 493

	public final void windowOpened(WindowEvent var1) {
	} // L: 496

	public abstract void init();

	public final void windowClosed(WindowEvent var1) {
	} // L: 479

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 490

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 472
	} // L: 473

	public final void windowActivated(WindowEvent var1) {
	} // L: 476

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIILhq;IB)V",
		garbageValue = "-47"
	)
	static void method684(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 73
		var5.plane = var0; // L: 74
		var5.x = var1 * 128; // L: 75
		var5.y = var2 * 128; // L: 76
		int var6 = var3.sizeX; // L: 77
		int var7 = var3.sizeY; // L: 78
		if (var4 == 1 || var4 == 3) { // L: 79
			var6 = var3.sizeY; // L: 80
			var7 = var3.sizeX; // L: 81
		}

		var5.maxX = (var6 + var1) * 128; // L: 83
		var5.maxY = (var7 + var2) * 128; // L: 84
		var5.soundEffectId = var3.ambientSoundId; // L: 85
		var5.field815 = var3.int7 * 128; // L: 86
		var5.field824 = var3.int5; // L: 87
		var5.field825 = var3.int6; // L: 88
		var5.soundEffectIds = var3.soundEffectIds; // L: 89
		if (var3.transforms != null) { // L: 90
			var5.obj = var3; // L: 91
			var5.set(); // L: 92
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 94
		if (var5.soundEffectIds != null) { // L: 95
			var5.field822 = var5.field824 + (int)(Math.random() * (double)(var5.field825 - var5.field824));
		}

	} // L: 96

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1687674321"
	)
	static void method585() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 61

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 62
			var1.clearIsFromFriend(); // L: 64
		}

	} // L: 67
}
