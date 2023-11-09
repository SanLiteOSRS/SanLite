import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
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

@ObfuscatedName("bm")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -80992633
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 3016094804513310631L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("ac")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -192567109
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1827165193
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -107171581
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1171551213
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("al")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ar")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("by")
	static Image field222;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 2073437199
	)
	static int field220;
	@ObfuscatedName("bb")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	protected static class25 field228;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		longValue = -2779907213028214903L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		longValue = 5360925924090142977L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("ai")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1518730529
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1015126009
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -881106813
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -21705825
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1990910523
	)
	int field196;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1825729143
	)
	int field212;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1539012411
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 350734463
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bh")
	protected boolean field215;
	@ObfuscatedName("bv")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bt")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bd")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bm")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bf")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		longValue = -1248212789802974837L
	)
	volatile long field210;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bu")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bo")
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
		field220 = 500; // L: 74
		volatileFocus = true;
		field228 = new class25();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.field215 = false; // L: 67
		this.fullRedraw = true; // L: 72
		this.resizeCanvasNextFrame = false; // L: 75
		this.isCanvasInvalid = false; // L: 76
		this.field210 = 0L; // L: 77
		EventQueue var1 = null; // L: 91

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) { // L: 95
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		GroundObject.pcmPlayerProvider = var2; // L: 99
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1343076745"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method521();
		}

		this.maxCanvasWidth = var1; // L: 105
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-272604069"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 110
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				PendingSpawn.method2365(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	} // L: 113

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Lgk;",
		garbageValue = "24"
	)
	@Export("mouseWheel")
	protected class174 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 116
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-84"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 124
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "255"
	)
	protected void method498(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	} // L: 129

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "-1215097022"
	)
	protected Clipboard method499() {
		return this.clipboard;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "216188058"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			KeyHandler.KeyHandler_keyCodes[186] = 57;
			KeyHandler.KeyHandler_keyCodes[187] = 27;
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 140
			KeyHandler.KeyHandler_keyCodes[189] = 26;
			KeyHandler.KeyHandler_keyCodes[190] = 72;
			KeyHandler.KeyHandler_keyCodes[191] = 73;
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 144
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 145
			KeyHandler.KeyHandler_keyCodes[220] = 74;
			KeyHandler.KeyHandler_keyCodes[221] = 43;
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 148
			KeyHandler.KeyHandler_keyCodes[223] = 28;
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71;
			KeyHandler.KeyHandler_keyCodes[45] = 26;
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 154
			KeyHandler.KeyHandler_keyCodes[47] = 73;
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 156
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 157
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 158
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 159
			KeyHandler.KeyHandler_keyCodes[93] = 43;
			KeyHandler.KeyHandler_keyCodes[192] = 28;
			KeyHandler.KeyHandler_keyCodes[222] = 58;
			KeyHandler.KeyHandler_keyCodes[520] = 59;
		}

		field228.method343(this.canvas);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "61"
	)
	protected final void method501() {
		field228.method348(); // L: 170
	} // L: 171

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lbv;II)V",
		garbageValue = "178768313"
	)
	protected void method652(class29 var1, int var2) {
		field228.method344(var1, var2); // L: 174
	} // L: 175

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1089439044"
	)
	protected final void method503() {
		java.awt.Canvas var1 = this.canvas; // L: 178
		var1.addMouseListener(MouseHandler.MouseHandler_instance); // L: 180
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 181
		var1.addFocusListener(MouseHandler.MouseHandler_instance); // L: 182
	} // L: 184

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "122"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 187
		if (var1 != null) { // L: 188
			Bounds var2 = this.getFrameContentBounds(); // L: 189
			this.contentWidth = Math.max(var2.highX, this.field196); // L: 190
			this.contentHeight = Math.max(var2.highY, this.field212); // L: 191
			if (this.contentWidth <= 0) { // L: 192
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 193
				this.contentHeight = 1;
			}

			class113.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 194
			class177.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 195
			this.canvasX = (this.contentWidth - class113.canvasWidth) / 2; // L: 196
			this.canvasY = 0; // L: 197
			this.canvas.setSize(class113.canvasWidth, class177.canvasHeight); // L: 198
			AttackOption.rasterProvider = new RasterProvider(class113.canvasWidth, class177.canvasHeight, this.canvas, this.field215); // L: 199
			if (var1 == this.frame) { // L: 200
				Insets var3 = this.frame.getInsets(); // L: 201
				this.canvas.setLocation(var3.left + this.canvasX, var3.top + this.canvasY); // L: 202
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 204
			}

			this.fullRedraw = true; // L: 205
			this.resizeGame(); // L: 206
		}
	} // L: 207

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "59"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1724529603"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 212
		int var2 = this.canvasY; // L: 213
		int var3 = this.contentWidth - class113.canvasWidth - var1; // L: 214
		int var4 = this.contentHeight - class177.canvasHeight - var2; // L: 215
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 216
			try {
				Container var5 = this.container(); // L: 218
				int var6 = 0; // L: 219
				int var7 = 0; // L: 220
				if (var5 == this.frame) { // L: 221
					Insets var8 = this.frame.getInsets(); // L: 222
					var6 = var8.left; // L: 223
					var7 = var8.top; // L: 224
				}

				Graphics var10 = var5.getGraphics(); // L: 226
				var10.setColor(Color.black); // L: 227
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 228
				}

				if (var2 > 0) { // L: 229
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 230
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 231
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 233
			}
		}

	} // L: 235

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "239"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		field228.method347(this.canvas); // L: 238
		java.awt.Canvas var1 = this.canvas; // L: 239
		var1.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 241
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 242
		var1.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 243
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 244
		if (this.mouseWheelHandler != null) { // L: 246
			this.mouseWheelHandler.method309(this.canvas);
		}

		this.addCanvas(); // L: 247
		field228.method343(this.canvas); // L: 248
		java.awt.Canvas var2 = this.canvas; // L: 249
		var2.addMouseListener(MouseHandler.MouseHandler_instance); // L: 251
		var2.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 252
		var2.addFocusListener(MouseHandler.MouseHandler_instance); // L: 253
		if (this.mouseWheelHandler != null) { // L: 255
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method521(); // L: 256
	} // L: 257

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1491001696"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) { // L: 261
				++GameEngine_redundantStartThreadCount; // L: 262
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 263
					this.error("alreadyloaded"); // L: 264
					return; // L: 265
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 267
				return; // L: 268
			}

			gameEngine = this; // L: 270
			class113.canvasWidth = var1; // L: 271
			class177.canvasHeight = var2; // L: 272
			RunException.RunException_revision = var3; // L: 273
			RunException.field5266 = var4; // L: 274
			RunException.RunException_applet = this; // L: 275
			if (taskHandler == null) { // L: 276
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 277
		} catch (Exception var6) { // L: 279
			Messages.RunException_sendStackTrace((String)null, var6); // L: 280
			this.error("crash"); // L: 281
		}

	} // L: 283

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 286
		if (this.canvas != null) { // L: 287
			this.canvas.removeFocusListener(this); // L: 288
			var1.remove(this.canvas); // L: 289
		}

		class113.canvasWidth = Math.max(var1.getWidth(), this.field196); // L: 291
		class177.canvasHeight = Math.max(var1.getHeight(), this.field212); // L: 292
		Insets var2;
		if (this.frame != null) { // L: 293
			var2 = this.frame.getInsets(); // L: 294
			class113.canvasWidth -= var2.right + var2.left; // L: 295
			class177.canvasHeight -= var2.bottom + var2.top; // L: 296
		}

		this.canvas = new Canvas(this); // L: 298
		var1.setBackground(Color.BLACK); // L: 299
		var1.setLayout((LayoutManager)null); // L: 300
		var1.add(this.canvas); // L: 301
		this.canvas.setSize(class113.canvasWidth, class177.canvasHeight); // L: 302
		this.canvas.setVisible(true); // L: 303
		this.canvas.setBackground(Color.BLACK); // L: 304
		if (var1 == this.frame) { // L: 305
			var2 = this.frame.getInsets(); // L: 306
			this.canvas.setLocation(this.canvasX + var2.left, this.canvasY + var2.top); // L: 307
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 309
		}

		this.canvas.addFocusListener(this); // L: 310
		this.canvas.requestFocus(); // L: 311
		this.fullRedraw = true; // L: 312
		if (AttackOption.rasterProvider != null && class113.canvasWidth == AttackOption.rasterProvider.width && class177.canvasHeight == AttackOption.rasterProvider.height) { // L: 313
			((RasterProvider)AttackOption.rasterProvider).setComponent(this.canvas); // L: 314
			AttackOption.rasterProvider.drawFull(0, 0); // L: 315
		} else {
			AttackOption.rasterProvider = new RasterProvider(class113.canvasWidth, class177.canvasHeight, this.canvas, this.field215); // L: 318
		}

		this.isCanvasInvalid = false; // L: 320
		this.field210 = method661(); // L: 321
	} // L: 322

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "366742"
	)
	protected void method510(boolean var1) {
		if (this.field215 != var1) { // L: 325
			this.field215 = var1; // L: 326
			AttackOption.rasterProvider.method9462(var1); // L: 327
			AttackOption.rasterProvider.apply(); // L: 328
		}

	} // L: 330

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "805251619"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 333
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 334
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 335
				if (var1.endsWith("127.0.0.1")) { // L: 336
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 337
					}

					if (var1.endsWith("192.168.1.")) { // L: 338
						return true;
					} else {
						this.error("invalidhost"); // L: 339
						return false; // L: 340
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1721255354"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = method661(); // L: 393
		long var3 = clientTickTimes[PacketWriter.field1424]; // L: 394
		clientTickTimes[PacketWriter.field1424] = var1; // L: 395
		PacketWriter.field1424 = PacketWriter.field1424 + 1 & 31; // L: 396
		if (0L != var3 && var1 > var3) { // L: 397
		}

		synchronized(this) { // L: 398
			class370.hasFocus = volatileFocus; // L: 399
		} // L: 400

		this.doCycle(); // L: 401
	} // L: 402

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1251903818"
	)
	protected final void method514() {
		this.fullRedraw = true; // L: 405
	} // L: 406

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "543987991"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 409
		long var2 = method661(); // L: 410
		long var4 = graphicsTickTimes[ParamComposition.field2138]; // L: 411
		graphicsTickTimes[ParamComposition.field2138] = var2; // L: 412
		ParamComposition.field2138 = ParamComposition.field2138 + 1 & 31; // L: 413
		if (var4 != 0L && var2 > var4) { // L: 414
			int var6 = (int)(var2 - var4); // L: 415
			fps = ((var6 >> 1) + 32000) / var6; // L: 416
		}

		if (++field220 - 1 > 50) { // L: 418
			field220 -= 50; // L: 419
			this.fullRedraw = true; // L: 420
			this.canvas.setSize(class113.canvasWidth, class177.canvasHeight); // L: 421
			this.canvas.setVisible(true); // L: 422
			if (var1 == this.frame) { // L: 423
				Insets var7 = this.frame.getInsets(); // L: 424
				this.canvas.setLocation(this.canvasX + var7.left, this.canvasY + var7.top); // L: 425
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 427
			}
		}

		if (this.isCanvasInvalid) { // L: 429
			this.replaceCanvas();
		}

		this.method516(); // L: 430
		this.draw(this.fullRedraw); // L: 431
		if (this.fullRedraw) { // L: 432
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 433
	} // L: 434

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1664691529"
	)
	final void method516() {
		Bounds var1 = this.getFrameContentBounds(); // L: 437
		if (this.contentWidth != var1.highX || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 438
			this.resizeCanvas(); // L: 439
			this.resizeCanvasNextFrame = false; // L: 440
		}

	} // L: 442

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	final void method521() {
		this.resizeCanvasNextFrame = true; // L: 445
	} // L: 446

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 449
			isKilled = true; // L: 450

			try {
				this.canvas.removeFocusListener(this); // L: 452
			} catch (Exception var5) { // L: 454
			}

			try {
				this.kill0(); // L: 456
			} catch (Exception var4) { // L: 458
			}

			if (this.frame != null) { // L: 459
				try {
					System.exit(0); // L: 461
				} catch (Throwable var3) { // L: 463
				}
			}

			if (taskHandler != null) { // L: 465
				try {
					taskHandler.close(); // L: 467
				} catch (Exception var2) { // L: 469
				}
			}

			this.vmethod1241(); // L: 471
		}
	} // L: 472

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "208117174"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1753601126"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1944984067"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1298916795"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZB)V",
		garbageValue = "-97"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 558
			if (ObjectSound.fontHelvetica13 == null) { // L: 559
				ObjectSound.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 560
				class85.loginScreenFontMetrics = this.canvas.getFontMetrics(ObjectSound.fontHelvetica13); // L: 561
			}

			if (var3) { // L: 563
				var4.setColor(Color.black); // L: 564
				var4.fillRect(0, 0, class113.canvasWidth, class177.canvasHeight); // L: 565
			}

			Color var5 = new Color(140, 17, 17); // L: 567

			try {
				if (field222 == null) { // L: 569
					field222 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = field222.getGraphics(); // L: 570
				var6.setColor(var5); // L: 571
				var6.drawRect(0, 0, 303, 33); // L: 572
				var6.fillRect(2, 2, var1 * 3, 30); // L: 573
				var6.setColor(Color.black); // L: 574
				var6.drawRect(1, 1, 301, 31); // L: 575
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 576
				var6.setFont(ObjectSound.fontHelvetica13); // L: 577
				var6.setColor(Color.white); // L: 578
				var6.drawString(var2, (304 - class85.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 579
				var4.drawImage(field222, class113.canvasWidth / 2 - 152, class177.canvasHeight / 2 - 18, (ImageObserver)null); // L: 580
			} catch (Exception var9) { // L: 582
				int var7 = class113.canvasWidth / 2 - 152; // L: 583
				int var8 = class177.canvasHeight / 2 - 18; // L: 584
				var4.setColor(var5); // L: 585
				var4.drawRect(var7, var8, 303, 33); // L: 586
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 587
				var4.setColor(Color.black); // L: 588
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 589
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 590
				var4.setFont(ObjectSound.fontHelvetica13); // L: 591
				var4.setColor(Color.white); // L: 592
				var4.drawString(var2, var7 + (304 - class85.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 593
			}
		} catch (Exception var10) { // L: 596
			this.canvas.repaint(); // L: 597
		}

	} // L: 599

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-146638494"
	)
	protected final void method658() {
		field222 = null; // L: 602
		ObjectSound.fontHelvetica13 = null; // L: 603
		class85.loginScreenFontMetrics = null; // L: 604
	} // L: 605

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "305949479"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 608
			this.hasErrored = true; // L: 609
			System.out.println("error_game_" + var1); // L: 610

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 612
			} catch (Exception var3) { // L: 614
			}

		}
	} // L: 615

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "-1637240751"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 618
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Lrb;",
		garbageValue = "790707673"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 623
		int var2 = Math.max(var1.getWidth(), this.field196); // L: 624
		int var3 = Math.max(var1.getHeight(), this.field212); // L: 625
		if (this.frame != null) { // L: 626
			Insets var4 = this.frame.getInsets(); // L: 627
			var2 -= var4.right + var4.left; // L: 628
			var3 -= var4.top + var4.bottom; // L: 629
		}

		return new Bounds(var2, var3); // L: 631
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1032464717"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 635
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1929688897"
	)
	protected abstract void vmethod1241();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 495
			stopTimeMs = method661(); // L: 496
			PendingSpawn.method2365(5000L); // L: 497
			this.kill(); // L: 498
		}
	} // L: 499

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 508
			this.fullRedraw = true; // L: 509
			if (method661() - this.field210 > 1000L) { // L: 510
				Rectangle var2 = var1.getClipBounds(); // L: 511
				if (var2 == null || var2.width >= class113.canvasWidth && var2.height >= class177.canvasHeight) {
					this.isCanvasInvalid = true; // L: 512
				}
			}

		}
	} // L: 514

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 483
			stopTimeMs = 0L; // L: 484
		}
	} // L: 485

	public final void update(Graphics var1) {
		this.paint(var1); // L: 503
	} // L: 504

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 524
	} // L: 525

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 535
	} // L: 536

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 542

	public final void windowIconified(WindowEvent var1) {
	} // L: 545

	public final void windowOpened(WindowEvent var1) {
	} // L: 548

	public abstract void init();

	public final void windowClosed(WindowEvent var1) {
	} // L: 531

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 345
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 346
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 347
					String var2 = class106.javaVersion; // L: 348
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 349
						this.error("wrongjava"); // L: 350
						return; // L: 351
					}

					if (var2.startsWith("1.6.0_")) { // L: 353
						int var3;
						for (var3 = 6; var3 < var2.length() && class330.isDigit(var2.charAt(var3)); ++var3) { // L: 354 355
						}

						String var4 = var2.substring(6, var3); // L: 356
						if (class218.isNumber(var4) && HealthBarUpdate.method2412(var4) < 10) { // L: 357
							this.error("wrongjava"); // L: 358
							return; // L: 359
						}
					}

					fiveOrOne = 5; // L: 362
				}
			}

			this.setFocusCycleRoot(true); // L: 365
			this.addCanvas(); // L: 366
			this.setUp(); // L: 367

			Object var8;
			try {
				var8 = new NanoClock(); // L: 371
			} catch (Throwable var6) { // L: 373
				var8 = new MilliClock(); // L: 374
			}

			class332.clock = (Clock)var8; // L: 377

			while (0L == stopTimeMs || method661() < stopTimeMs) { // L: 378
				gameCyclesToDo = class332.clock.wait(cycleDurationMillis, fiveOrOne); // L: 379

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) { // L: 380
					this.clientTick();
				}

				this.graphicsTick(); // L: 381
				this.post(this.canvas); // L: 382
			}
		} catch (Exception var7) { // L: 385
			Messages.RunException_sendStackTrace((String)null, var7); // L: 386
			this.error("crash"); // L: 387
		}

		this.kill(); // L: 389
	} // L: 390

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 489
			stopTimeMs = method661() + 4000L; // L: 490
		}
	} // L: 491

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 539

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 518
		this.fullRedraw = true; // L: 519
	} // L: 520

	public final void windowActivated(WindowEvent var1) {
	} // L: 528

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "2058818803"
	)
	public static final synchronized long method661() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class301.field3378) { // L: 15
			Canvas.field114 += class301.field3378 - var0; // L: 16
		}

		class301.field3378 = var0; // L: 18
		return var0 + Canvas.field114; // L: 19
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([Lch;II[I[II)V",
		garbageValue = "1909898083"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) { // L: 82
			int var5 = var1 - 1; // L: 83
			int var6 = var2 + 1; // L: 84
			int var7 = (var2 + var1) / 2; // L: 85
			World var8 = var0[var7]; // L: 86
			var0[var7] = var0[var1]; // L: 87
			var0[var1] = var8; // L: 88

			while (var5 < var6) { // L: 89
				boolean var9 = true; // L: 90

				int var10;
				int var11;
				int var12;
				do {
					--var6; // L: 92

					for (var10 = 0; var10 < 4; ++var10) { // L: 93
						if (var3[var10] == 2) { // L: 96
							var11 = var0[var6].index; // L: 97
							var12 = var8.index; // L: 98
						} else if (var3[var10] == 1) { // L: 100
							var11 = var0[var6].population; // L: 101
							var12 = var8.population; // L: 102
							if (var11 == -1 && var4[var10] == 1) { // L: 103
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 104
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 106
							var11 = var0[var6].isMembersOnly() ? 1 : 0; // L: 107
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 108
						} else {
							var11 = var0[var6].id; // L: 111
							var12 = var8.id; // L: 112
						}

						if (var11 != var12) { // L: 114
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) { // L: 117 118
								var9 = false; // L: 120
							}
							break;
						}

						if (var10 == 3) { // L: 115
							var9 = false;
						}
					}
				} while(var9);

				var9 = true; // L: 125

				do {
					++var5; // L: 127

					for (var10 = 0; var10 < 4; ++var10) { // L: 128
						if (var3[var10] == 2) { // L: 131
							var11 = var0[var5].index; // L: 132
							var12 = var8.index; // L: 133
						} else if (var3[var10] == 1) { // L: 135
							var11 = var0[var5].population; // L: 136
							var12 = var8.population; // L: 137
							if (var11 == -1 && var4[var10] == 1) { // L: 138
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001; // L: 139
							}
						} else if (var3[var10] == 3) { // L: 141
							var11 = var0[var5].isMembersOnly() ? 1 : 0; // L: 142
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 143
						} else {
							var11 = var0[var5].id; // L: 146
							var12 = var8.id; // L: 147
						}

						if (var11 != var12) { // L: 149
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) { // L: 152 153
								var9 = false; // L: 155
							}
							break;
						}

						if (var10 == 3) { // L: 150
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) { // L: 160
					World var13 = var0[var5]; // L: 161
					var0[var5] = var0[var6]; // L: 162
					var0[var6] = var13; // L: 163
				}
			}

			sortWorlds(var0, var1, var6, var3, var4); // L: 166
			sortWorlds(var0, var6 + 1, var2, var3, var4); // L: 167
		}

	} // L: 169
}
