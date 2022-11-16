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

@ObfuscatedName("ae")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 744029553
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -9139813589801259825L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("j")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2126665387
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2051336563
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -156918551
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("o")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("z")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2111337141
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1820807991
	)
	static int field212;
	@ObfuscatedName("ai")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	protected static class26 field227;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -5318768701372018855L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 1695186618396153021L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("d")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 186826985
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -781288403
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 846076955
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 526763313
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1244283503
	)
	int field224;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 833066567
	)
	int field213;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1533724941
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 506510689
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("af")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ad")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("av")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ap")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("as")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 3712109730462177527L
	)
	volatile long field201;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Le;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("az")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("ab")
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
		field212 = 500; // L: 73
		volatileFocus = true;
		field227 = new class26();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.fullRedraw = true; // L: 71
		this.resizeCanvasNextFrame = false; // L: 74
		this.isCanvasInvalid = false; // L: 75
		this.field201 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		class199.method3999(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "437544293"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 100
			this.method654();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "-82"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				class197.method3946(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lfk;",
		garbageValue = "180606123"
	)
	@Export("mouseWheel")
	protected class165 mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 113
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler; // L: 116
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1645067164"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 120
	} // L: 121

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-399294602"
	)
	protected void method527(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 124
	} // L: 125

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "-268620836"
	)
	protected Clipboard method510() {
		return this.clipboard; // L: 128
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "108"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 133
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 134
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 135
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 136
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 137
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 138
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 139
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 140
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 141
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 142
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 143
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 144
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 145
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 148
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 149
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 150
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 151
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 152
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 153
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 154
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 155
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 156
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 157
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 158
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 159
		}

		field227.method354(this.canvas); // L: 162
	} // L: 163

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "869354353"
	)
	protected final void method603() {
		field227.method356(); // L: 166
	} // L: 167

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lac;IB)V",
		garbageValue = "12"
	)
	protected void method513(class30 var1, int var2) {
		field227.method384(var1, var2); // L: 170
	} // L: 171

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1207459728"
	)
	protected final void method514() {
		java.awt.Canvas var1 = this.canvas; // L: 174
		var1.addMouseListener(MouseHandler.KeyHandler_instance); // L: 176
		var1.addMouseMotionListener(MouseHandler.KeyHandler_instance); // L: 177
		var1.addFocusListener(MouseHandler.KeyHandler_instance); // L: 178
	} // L: 180

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "536118795"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 183
		if (var1 != null) { // L: 184
			Bounds var2 = this.getFrameContentBounds(); // L: 185
			this.contentWidth = Math.max(var2.highX, this.field224); // L: 186
			this.contentHeight = Math.max(var2.highY, this.field213); // L: 187
			if (this.contentWidth <= 0) { // L: 188
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 189
				this.contentHeight = 1;
			}

			canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 190
			class10.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 191
			this.canvasX = (this.contentWidth - canvasWidth) / 2; // L: 192
			this.canvasY = 0; // L: 193
			this.canvas.setSize(canvasWidth, class10.canvasHeight); // L: 194
			class1.rasterProvider = new RasterProvider(canvasWidth, class10.canvasHeight, this.canvas); // L: 195
			if (var1 == this.frame) { // L: 196
				Insets var3 = this.frame.getInsets(); // L: 197
				this.canvas.setLocation(this.canvasX + var3.left, this.canvasY + var3.top); // L: 198
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 200
			}

			this.fullRedraw = true; // L: 201
			this.resizeGame(); // L: 202
		}
	} // L: 203

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1490185666"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "56"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 208
		int var2 = this.canvasY; // L: 209
		int var3 = this.contentWidth - canvasWidth - var1; // L: 210
		int var4 = this.contentHeight - class10.canvasHeight - var2; // L: 211
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 212
			try {
				Container var5 = this.container(); // L: 214
				int var6 = 0; // L: 215
				int var7 = 0; // L: 216
				if (var5 == this.frame) { // L: 217
					Insets var8 = this.frame.getInsets(); // L: 218
					var6 = var8.left; // L: 219
					var7 = var8.top; // L: 220
				}

				Graphics var10 = var5.getGraphics(); // L: 222
				var10.setColor(Color.black); // L: 223
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 224
				}

				if (var2 > 0) { // L: 225
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 226
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 227
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 229
			}
		}

	} // L: 231

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1726244299"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		field227.method355(this.canvas); // L: 234
		java.awt.Canvas var1 = this.canvas; // L: 235
		var1.removeMouseListener(MouseHandler.KeyHandler_instance);
		var1.removeMouseMotionListener(MouseHandler.KeyHandler_instance);
		var1.removeFocusListener(MouseHandler.KeyHandler_instance); // L: 239
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 240
		if (this.mouseWheelHandler != null) { // L: 242
			this.mouseWheelHandler.method308(this.canvas);
		}

		this.addCanvas(); // L: 243
		field227.method354(this.canvas); // L: 244
		java.awt.Canvas var2 = this.canvas; // L: 245
		var2.addMouseListener(MouseHandler.KeyHandler_instance); // L: 247
		var2.addMouseMotionListener(MouseHandler.KeyHandler_instance); // L: 248
		var2.addFocusListener(MouseHandler.KeyHandler_instance); // L: 249
		if (this.mouseWheelHandler != null) { // L: 251
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method654(); // L: 252
	} // L: 253

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "385290861"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) { // L: 257
				++GameEngine_redundantStartThreadCount; // L: 258
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 259
					this.error("alreadyloaded"); // L: 260
					return; // L: 261
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 263
				return; // L: 264
			}

			gameEngine = this; // L: 266
			canvasWidth = var1; // L: 267
			class10.canvasHeight = var2; // L: 268
			RunException.RunException_revision = var3; // L: 269
			RunException.field5018 = var4; // L: 270
			RunException.RunException_applet = this; // L: 271
			if (taskHandler == null) { // L: 272
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 273
		} catch (Exception var6) { // L: 275
			class421.RunException_sendStackTrace((String)null, var6); // L: 276
			this.error("crash"); // L: 277
		}

	} // L: 279

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "292202485"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 282
		if (this.canvas != null) { // L: 283
			this.canvas.removeFocusListener(this); // L: 284
			var1.remove(this.canvas); // L: 285
		}

		canvasWidth = Math.max(var1.getWidth(), this.field224); // L: 287
		class10.canvasHeight = Math.max(var1.getHeight(), this.field213); // L: 288
		Insets var2;
		if (this.frame != null) { // L: 289
			var2 = this.frame.getInsets(); // L: 290
			canvasWidth -= var2.left + var2.right; // L: 291
			class10.canvasHeight -= var2.bottom + var2.top; // L: 292
		}

		this.canvas = new Canvas(this); // L: 294
		var1.setBackground(Color.BLACK); // L: 295
		var1.setLayout((LayoutManager)null); // L: 296
		var1.add(this.canvas); // L: 297
		this.canvas.setSize(canvasWidth, class10.canvasHeight); // L: 298
		this.canvas.setVisible(true); // L: 299
		this.canvas.setBackground(Color.BLACK); // L: 300
		if (var1 == this.frame) { // L: 301
			var2 = this.frame.getInsets(); // L: 302
			this.canvas.setLocation(var2.left + this.canvasX, var2.top + this.canvasY); // L: 303
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 305
		}

		this.canvas.addFocusListener(this); // L: 306
		this.canvas.requestFocus(); // L: 307
		this.fullRedraw = true; // L: 308
		if (class1.rasterProvider != null && canvasWidth == class1.rasterProvider.width && class10.canvasHeight == class1.rasterProvider.height) { // L: 309
			((RasterProvider)class1.rasterProvider).setComponent(this.canvas); // L: 310
			class1.rasterProvider.drawFull(0, 0); // L: 311
		} else {
			class1.rasterProvider = new RasterProvider(canvasWidth, class10.canvasHeight, this.canvas); // L: 314
		}

		this.isCanvasInvalid = false; // L: 316
		this.field201 = UserComparator8.method2748(); // L: 317
	} // L: 318

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1689057535"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 321
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 322
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 323
				if (var1.endsWith("127.0.0.1")) { // L: 324
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 325
					}

					if (var1.endsWith("192.168.1.")) { // L: 326
						return true;
					} else {
						this.error("invalidhost"); // L: 327
						return false; // L: 328
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
		descriptor = "(B)V",
		garbageValue = "18"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = UserComparator8.method2748(); // L: 381
		long var3 = clientTickTimes[class12.field66]; // L: 382
		clientTickTimes[class12.field66] = var1; // L: 383
		class12.field66 = class12.field66 + 1 & 31; // L: 384
		if (var3 != 0L && var1 > var3) { // L: 385
		}

		synchronized(this) { // L: 386
			ChatChannel.hasFocus = volatileFocus; // L: 387
		} // L: 388

		this.doCycle(); // L: 389
	} // L: 390

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1430607867"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 393
		long var2 = UserComparator8.method2748(); // L: 394
		long var4 = graphicsTickTimes[StudioGame.field3743]; // L: 395
		graphicsTickTimes[StudioGame.field3743] = var2; // L: 396
		StudioGame.field3743 = StudioGame.field3743 + 1 & 31; // L: 397
		if (0L != var4 && var2 > var4) { // L: 398
			int var6 = (int)(var2 - var4); // L: 399
			fps = ((var6 >> 1) + 32000) / var6; // L: 400
		}

		if (++field212 - 1 > 50) { // L: 402
			field212 -= 50; // L: 403
			this.fullRedraw = true; // L: 404
			this.canvas.setSize(canvasWidth, class10.canvasHeight); // L: 405
			this.canvas.setVisible(true); // L: 406
			if (var1 == this.frame) { // L: 407
				Insets var7 = this.frame.getInsets(); // L: 408
				this.canvas.setLocation(var7.left + this.canvasX, this.canvasY + var7.top); // L: 409
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 411
			}
		}

		if (this.isCanvasInvalid) { // L: 413
			this.replaceCanvas();
		}

		this.method524(); // L: 414
		this.draw(this.fullRedraw); // L: 415
		if (this.fullRedraw) { // L: 416
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 417
	} // L: 418

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "110"
	)
	final void method524() {
		Bounds var1 = this.getFrameContentBounds(); // L: 421
		if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) { // L: 422
			this.resizeCanvas(); // L: 423
			this.resizeCanvasNextFrame = false; // L: 424
		}

	} // L: 426

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-707731712"
	)
	final void method654() {
		this.resizeCanvasNextFrame = true; // L: 429
	} // L: 430

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "693331185"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 433
			isKilled = true; // L: 434

			try {
				this.canvas.removeFocusListener(this); // L: 436
			} catch (Exception var5) { // L: 438
			}

			try {
				this.kill0(); // L: 440
			} catch (Exception var4) { // L: 442
			}

			if (this.frame != null) { // L: 443
				try {
					System.exit(0); // L: 445
				} catch (Throwable var3) { // L: 447
				}
			}

			if (taskHandler != null) { // L: 449
				try {
					taskHandler.close(); // L: 451
				} catch (Exception var2) { // L: 453
				}
			}

			this.vmethod1485(); // L: 455
		}
	} // L: 456

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1983760905"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1176871177"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1054189604"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-5165"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "-1703323928"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 542
			if (class126.fontHelvetica13 == null) { // L: 543
				class126.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 544
				class10.loginScreenFontMetrics = this.canvas.getFontMetrics(class126.fontHelvetica13); // L: 545
			}

			if (var3) { // L: 547
				var4.setColor(Color.black); // L: 548
				var4.fillRect(0, 0, canvasWidth, class10.canvasHeight); // L: 549
			}

			Color var5 = new Color(140, 17, 17); // L: 551

			try {
				if (AttackOption.field1295 == null) { // L: 553
					AttackOption.field1295 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = AttackOption.field1295.getGraphics(); // L: 554
				var6.setColor(var5); // L: 555
				var6.drawRect(0, 0, 303, 33); // L: 556
				var6.fillRect(2, 2, var1 * 3, 30); // L: 557
				var6.setColor(Color.black); // L: 558
				var6.drawRect(1, 1, 301, 31); // L: 559
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 560
				var6.setFont(class126.fontHelvetica13); // L: 561
				var6.setColor(Color.white); // L: 562
				var6.drawString(var2, (304 - class10.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 563
				var4.drawImage(AttackOption.field1295, canvasWidth / 2 - 152, class10.canvasHeight / 2 - 18, (ImageObserver)null); // L: 564
			} catch (Exception var9) { // L: 566
				int var7 = canvasWidth / 2 - 152; // L: 567
				int var8 = class10.canvasHeight / 2 - 18; // L: 568
				var4.setColor(var5); // L: 569
				var4.drawRect(var7, var8, 303, 33); // L: 570
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 571
				var4.setColor(Color.black); // L: 572
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 573
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 574
				var4.setFont(class126.fontHelvetica13); // L: 575
				var4.setColor(Color.white); // L: 576
				var4.drawString(var2, var7 + (304 - class10.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 577
			}
		} catch (Exception var10) { // L: 580
			this.canvas.repaint(); // L: 581
		}

	} // L: 583

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	protected final void method536() {
		AttackOption.field1295 = null; // L: 586
		class126.fontHelvetica13 = null; // L: 587
		class10.loginScreenFontMetrics = null; // L: 588
	} // L: 589

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "6806"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 592
			this.hasErrored = true; // L: 593
			System.out.println("error_game_" + var1); // L: 594

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 596
			} catch (Exception var3) { // L: 598
			}

		}
	} // L: 599

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "2"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 602
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Loq;",
		garbageValue = "805719906"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 607
		int var2 = Math.max(var1.getWidth(), this.field224); // L: 608
		int var3 = Math.max(var1.getHeight(), this.field213); // L: 609
		if (this.frame != null) { // L: 610
			Insets var4 = this.frame.getInsets(); // L: 611
			var2 -= var4.right + var4.left; // L: 612
			var3 -= var4.top + var4.bottom; // L: 613
		}

		return new Bounds(var2, var3); // L: 615
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1473132947"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 619
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1478842545"
	)
	protected abstract void vmethod1485();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 479
			stopTimeMs = UserComparator8.method2748(); // L: 480
			class197.method3946(5000L); // L: 481
			this.kill(); // L: 482
		}
	} // L: 483

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 492
			this.fullRedraw = true; // L: 493
			if (UserComparator8.method2748() - this.field201 > 1000L) { // L: 494
				Rectangle var2 = var1.getClipBounds(); // L: 495
				if (var2 == null || var2.width >= canvasWidth && var2.height >= class10.canvasHeight) {
					this.isCanvasInvalid = true; // L: 496
				}
			}

		}
	} // L: 498

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 333
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 334
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 335
					String var2 = TaskHandler.javaVersion; // L: 336
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 337
						this.error("wrongjava"); // L: 338
						return; // L: 339
					}

					if (var2.startsWith("1.6.0_")) { // L: 341
						int var3;
						for (var3 = 6; var3 < var2.length() && GrandExchangeOffer.isDigit(var2.charAt(var3)); ++var3) { // L: 342 343
						}

						String var4 = var2.substring(6, var3); // L: 344
						if (WorldMapManager.isNumber(var4) && class100.method2559(var4) < 10) { // L: 345
							this.error("wrongjava"); // L: 346
							return; // L: 347
						}
					}

					fiveOrOne = 5; // L: 350
				}
			}

			this.setFocusCycleRoot(true); // L: 353
			this.addCanvas(); // L: 354
			this.setUp(); // L: 355

			Object var8;
			try {
				var8 = new NanoClock(); // L: 359
			} catch (Throwable var6) { // L: 361
				var8 = new MilliClock(); // L: 362
			}

			class362.clock = (Clock)var8; // L: 365

			while (0L == stopTimeMs || UserComparator8.method2748() < stopTimeMs) { // L: 366
				GroundObject.gameCyclesToDo = class362.clock.wait(cycleDurationMillis, fiveOrOne); // L: 367

				for (int var5 = 0; var5 < GroundObject.gameCyclesToDo; ++var5) { // L: 368
					this.clientTick();
				}

				this.graphicsTick(); // L: 369
				this.post(this.canvas); // L: 370
			}
		} catch (Exception var7) { // L: 373
			class421.RunException_sendStackTrace((String)null, var7); // L: 374
			this.error("crash"); // L: 375
		}

		this.kill(); // L: 377
	} // L: 378

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 473
			stopTimeMs = UserComparator8.method2748() + 4000L; // L: 474
		}
	} // L: 475

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 508
	} // L: 509

	public final void windowActivated(WindowEvent var1) {
	} // L: 512

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 519
	} // L: 520

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 523

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 502
		this.fullRedraw = true; // L: 503
	} // L: 504

	public final void windowIconified(WindowEvent var1) {
	} // L: 529

	public final void windowOpened(WindowEvent var1) {
	} // L: 532

	public abstract void init();

	public final void update(Graphics var1) {
		this.paint(var1); // L: 487
	} // L: 488

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 467
			stopTimeMs = 0L; // L: 468
		}
	} // L: 469

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 526

	public final void windowClosed(WindowEvent var1) {
	} // L: 515

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BI)Lbz;",
		garbageValue = "-2134162282"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 76
		Buffer var2 = new Buffer(var0); // L: 77
		var2.offset = var2.array.length - 2; // L: 78
		int var3 = var2.readUnsignedShort(); // L: 79
		int var4 = var2.array.length - 2 - var3 - 12; // L: 80
		var2.offset = var4; // L: 81
		int var5 = var2.readInt(); // L: 82
		var1.localIntCount = var2.readUnsignedShort(); // L: 83
		var1.localStringCount = var2.readUnsignedShort(); // L: 84
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 85
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 86
		int var6 = var2.readUnsignedByte(); // L: 87
		int var7;
		int var8;
		if (var6 > 0) { // L: 88
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 89

			for (var7 = 0; var7 < var6; ++var7) { // L: 90
				var8 = var2.readUnsignedShort(); // L: 91
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? class37.method712(var8) : 1); // L: 92
				var1.switches[var7] = var9; // L: 93

				while (var8-- > 0) { // L: 94
					int var10 = var2.readInt(); // L: 95
					int var11 = var2.readInt(); // L: 96
					var9.put(new IntegerNode(var11), (long)var10); // L: 97
				}
			}
		}

		var2.offset = 0; // L: 101
		var1.field962 = var2.readStringCp1252NullTerminatedOrNull(); // L: 102
		var1.opcodes = new int[var5]; // L: 103
		var1.intOperands = new int[var5]; // L: 104
		var1.stringOperands = new String[var5]; // L: 105

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 106 107 112
			var8 = var2.readUnsignedShort(); // L: 108
			if (var8 == 3) { // L: 109
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 110
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 111
			}
		}

		return var1; // L: 114
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Lbt;",
		garbageValue = "-1856343638"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 237
		return TextureProvider.getNextWorldListWorld(); // L: 238
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1701204332"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3951
			BufferedSink.clientPreferences.method2378(!BufferedSink.clientPreferences.method2452()); // L: 3952
			if (BufferedSink.clientPreferences.method2452()) { // L: 3953
				MouseHandler.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3954
			} else {
				MouseHandler.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3957
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3960
			BufferedSink.clientPreferences.method2434();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3961
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText; // L: 3962
		}

		if (Client.staffModLevel >= 2) { // L: 3963
			if (var0.equalsIgnoreCase("errortest")) { // L: 3964
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3965
				class7.worldMap.showCoord = !class7.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3966
				BufferedSink.clientPreferences.method2384(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3967
				BufferedSink.clientPreferences.method2384(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc(); // L: 3968
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3969
				WorldMapSection0.method5101();
			}
		}

		PacketBufferNode var1 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3020, Client.packetWriter.isaacCipher); // L: 3972
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 3973
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3974
		Client.packetWriter.addNode(var1); // L: 3975
	} // L: 3976

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1244279489"
	)
	static final void method662() {
		Client.field687 = 0; // L: 5497
		int var0 = class26.baseX * 64 + (class296.localPlayer.x >> 7); // L: 5498
		int var1 = class158.baseY * 64 + (class296.localPlayer.y >> 7); // L: 5499
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) { // L: 5500
			Client.field687 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) { // L: 5501
			Client.field687 = 1;
		}

		if (Client.field687 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) { // L: 5502
			Client.field687 = 0;
		}

	} // L: 5503
}
