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

@ObfuscatedName("be")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -376176519
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 5343372719285024603L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("at")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1847317883
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1708424065
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -668701839
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("ae")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ap")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 375092601
	)
	static int field184;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 265262917
	)
	static int field199;
	@ObfuscatedName("bu")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	protected static class25 field205;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		longValue = -1073172705104359637L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		longValue = 5011185454868225095L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("ax")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2063610287
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1728891727
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -443626179
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1789973463
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1057335217
	)
	int field189;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1580811907
	)
	int field190;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 868281609
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1278950389
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bp")
	protected boolean field193;
	@ObfuscatedName("bi")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bg")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bh")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("be")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bv")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		longValue = -15677963530786323L
	)
	volatile long field200;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bm")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bf")
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
		field199 = 500; // L: 74
		volatileFocus = true;
		field205 = new class25(); // L: 85
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L; // L: 88
	}

	protected GameEngine() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.field193 = false; // L: 67
		this.fullRedraw = true; // L: 72
		this.resizeCanvasNextFrame = false; // L: 75
		this.isCanvasInvalid = false;
		this.field200 = 0L;
		EventQueue var1 = null; // L: 91

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 93
		} catch (Throwable var3) { // L: 95
		}

		this.eventQueue = var1; // L: 96
		class362.method6857(new DevicePcmPlayerProvider()); // L: 97
	} // L: 98

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1685510226"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 101
			this.method562();
		}

		this.maxCanvasWidth = var1; // L: 102
		this.maxCanvasHeight = var2; // L: 103
	} // L: 104

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "1726607825"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 107
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 108
				VarpDefinition.method3559(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 109
			}

		}
	} // L: 110

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lgn;",
		garbageValue = "92574436"
	)
	@Export("mouseWheel")
	protected class174 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 113
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 114
			this.mouseWheelHandler.addTo(this.canvas); // L: 115
		}

		return this.mouseWheelHandler; // L: 117
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1924414169"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 121
	} // L: 122

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "85"
	)
	protected void method477(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 125
	} // L: 126

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "1102035049"
	)
	public Clipboard method518() {
		return this.clipboard; // L: 129
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "68"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 134
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 135
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 136
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 137
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 138
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 139
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 140
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 141
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 142
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 143
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 144
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 145
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 146
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 149
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 150
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 151
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 152
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 153
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 154
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 155
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 156
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 157
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 158
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 159
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 160
		}

		field205.method333(this.canvas); // L: 163
	} // L: 164

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "16777215"
	)
	protected final void method488() {
		field205.method335(); // L: 167
	} // L: 168

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lbi;II)V",
		garbageValue = "2091199250"
	)
	protected void method481(class29 var1, int var2) {
		field205.method351(var1, var2); // L: 171
	} // L: 172

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-698981640"
	)
	protected final void method482() {
		FriendSystem.method1881(this.canvas); // L: 175
	} // L: 176

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-759608387"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 179
		if (var1 != null) { // L: 180
			Bounds var2 = this.getFrameContentBounds(); // L: 181
			this.contentWidth = Math.max(var2.highX, this.field189); // L: 182
			this.contentHeight = Math.max(var2.highY, this.field190); // L: 183
			if (this.contentWidth <= 0) { // L: 184
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 185
				this.contentHeight = 1;
			}

			class10.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 186
			class11.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 187
			this.canvasX = (this.contentWidth - class10.canvasWidth) / 2; // L: 188
			this.canvasY = 0; // L: 189
			this.canvas.setSize(class10.canvasWidth, class11.canvasHeight); // L: 190
			class139.rasterProvider = new RasterProvider(class10.canvasWidth, class11.canvasHeight, this.canvas, this.field193); // L: 191
			if (var1 == this.frame) { // L: 192
				Insets var3 = this.frame.getInsets(); // L: 193
				this.canvas.setLocation(this.canvasX + var3.left, var3.top + this.canvasY); // L: 194
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 196
			}

			this.fullRedraw = true; // L: 197
			this.resizeGame(); // L: 198
		}
	} // L: 199

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-22061017"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-83"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 204
		int var2 = this.canvasY; // L: 205
		int var3 = this.contentWidth - class10.canvasWidth - var1; // L: 206
		int var4 = this.contentHeight - class11.canvasHeight - var2; // L: 207
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 208
			try {
				Container var5 = this.container(); // L: 210
				int var6 = 0; // L: 211
				int var7 = 0; // L: 212
				if (var5 == this.frame) { // L: 213
					Insets var8 = this.frame.getInsets(); // L: 214
					var6 = var8.left; // L: 215
					var7 = var8.top; // L: 216
				}

				Graphics var10 = var5.getGraphics(); // L: 218
				var10.setColor(Color.black); // L: 219
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 220
				}

				if (var2 > 0) { // L: 221
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 222
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 223
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 225
			}
		}

	} // L: 227

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "28"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		field205.method334(this.canvas); // L: 230
		java.awt.Canvas var1 = this.canvas; // L: 231
		var1.removeMouseListener(MouseHandler.KeyHandler_instance); // L: 233
		var1.removeMouseMotionListener(MouseHandler.KeyHandler_instance); // L: 234
		var1.removeFocusListener(MouseHandler.KeyHandler_instance); // L: 235
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 236
		if (this.mouseWheelHandler != null) { // L: 238
			this.mouseWheelHandler.method290(this.canvas);
		}

		this.addCanvas(); // L: 239
		field205.method333(this.canvas); // L: 240
		FriendSystem.method1881(this.canvas); // L: 241
		if (this.mouseWheelHandler != null) { // L: 242
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method562(); // L: 243
	} // L: 244

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-32"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) { // L: 248
				++GameEngine_redundantStartThreadCount; // L: 249
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 250
					this.error("alreadyloaded"); // L: 251
					return; // L: 252
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 254
				return; // L: 255
			}

			gameEngine = this; // L: 257
			class10.canvasWidth = var1; // L: 258
			class11.canvasHeight = var2; // L: 259
			RunException.RunException_revision = var3; // L: 260
			RunException.field5179 = var4; // L: 261
			class410.RunException_applet = this; // L: 262
			if (taskHandler == null) { // L: 263
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 264
		} catch (Exception var6) { // L: 266
			LoginPacket.RunException_sendStackTrace((String)null, var6); // L: 267
			this.error("crash"); // L: 268
		}

	} // L: 270

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-702237602"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 273
		if (this.canvas != null) { // L: 274
			this.canvas.removeFocusListener(this); // L: 275
			var1.remove(this.canvas); // L: 276
		}

		class10.canvasWidth = Math.max(var1.getWidth(), this.field189); // L: 278
		class11.canvasHeight = Math.max(var1.getHeight(), this.field190); // L: 279
		Insets var2;
		if (this.frame != null) { // L: 280
			var2 = this.frame.getInsets(); // L: 281
			class10.canvasWidth -= var2.right + var2.left; // L: 282
			class11.canvasHeight -= var2.bottom + var2.top; // L: 283
		}

		this.canvas = new Canvas(this); // L: 285
		var1.setBackground(Color.BLACK); // L: 286
		var1.setLayout((LayoutManager)null); // L: 287
		var1.add(this.canvas); // L: 288
		this.canvas.setSize(class10.canvasWidth, class11.canvasHeight); // L: 289
		this.canvas.setVisible(true); // L: 290
		this.canvas.setBackground(Color.BLACK); // L: 291
		if (var1 == this.frame) { // L: 292
			var2 = this.frame.getInsets(); // L: 293
			this.canvas.setLocation(this.canvasX + var2.left, this.canvasY + var2.top); // L: 294
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 296
		}

		this.canvas.addFocusListener(this); // L: 297
		this.canvas.requestFocus(); // L: 298
		this.fullRedraw = true; // L: 299
		if (class139.rasterProvider != null && class10.canvasWidth == class139.rasterProvider.width && class11.canvasHeight == class139.rasterProvider.height) { // L: 300
			((RasterProvider)class139.rasterProvider).setComponent(this.canvas); // L: 301
			class139.rasterProvider.drawFull(0, 0); // L: 302
		} else {
			class139.rasterProvider = new RasterProvider(class10.canvasWidth, class11.canvasHeight, this.canvas, this.field193); // L: 305
		}

		this.isCanvasInvalid = false; // L: 307
		this.field200 = Canvas.method310(); // L: 308
	} // L: 309

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-43564733"
	)
	protected void method489(boolean var1) {
		if (this.field193 != var1) { // L: 312
			this.field193 = var1; // L: 313
			class139.rasterProvider.method9372(var1); // L: 314
			class139.rasterProvider.apply(); // L: 315
		}

	} // L: 317

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1150010665"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 320
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 321
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 322
				if (var1.endsWith("127.0.0.1")) { // L: 323
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 324
					}

					if (var1.endsWith("192.168.1.")) { // L: 325
						return true;
					} else {
						this.error("invalidhost"); // L: 326
						return false; // L: 327
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = Canvas.method310(); // L: 371
		long var3 = clientTickTimes[field184]; // L: 372
		clientTickTimes[field184] = var1; // L: 373
		field184 = field184 + 1 & 31; // L: 374
		if (0L != var3 && var1 > var3) { // L: 375
		}

		synchronized(this) { // L: 376
			class148.hasFocus = volatileFocus; // L: 377
		} // L: 378

		this.doCycle(); // L: 379
	} // L: 380

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1876839238"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 383
		long var2 = Canvas.method310(); // L: 384
		long var4 = graphicsTickTimes[class176.field1854]; // L: 385
		graphicsTickTimes[class176.field1854] = var2; // L: 386
		class176.field1854 = class176.field1854 + 1 & 31; // L: 387
		if (var4 != 0L && var2 > var4) { // L: 388
			int var6 = (int)(var2 - var4); // L: 389
			fps = ((var6 >> 1) + 32000) / var6; // L: 390
		}

		if (++field199 - 1 > 50) { // L: 392
			field199 -= 50; // L: 393
			this.fullRedraw = true; // L: 394
			this.canvas.setSize(class10.canvasWidth, class11.canvasHeight); // L: 395
			this.canvas.setVisible(true); // L: 396
			if (var1 == this.frame) { // L: 397
				Insets var7 = this.frame.getInsets(); // L: 398
				this.canvas.setLocation(this.canvasX + var7.left, this.canvasY + var7.top); // L: 399
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 401
			}
		}

		if (this.isCanvasInvalid) { // L: 403
			this.replaceCanvas();
		}

		this.method494(); // L: 404
		this.draw(this.fullRedraw); // L: 405
		if (this.fullRedraw) { // L: 406
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 407
	} // L: 408

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1305261626"
	)
	final void method494() {
		Bounds var1 = this.getFrameContentBounds(); // L: 411
		if (var1.highX != this.contentWidth || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) { // L: 412
			this.resizeCanvas(); // L: 413
			this.resizeCanvasNextFrame = false; // L: 414
		}

	} // L: 416

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	final void method562() {
		this.resizeCanvasNextFrame = true; // L: 419
	} // L: 420

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-12"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 423
			isKilled = true; // L: 424

			try {
				this.canvas.removeFocusListener(this); // L: 426
			} catch (Exception var5) { // L: 428
			}

			try {
				this.kill0(); // L: 430
			} catch (Exception var4) { // L: 432
			}

			if (this.frame != null) { // L: 433
				try {
					System.exit(0); // L: 435
				} catch (Throwable var3) { // L: 437
				}
			}

			if (taskHandler != null) { // L: 439
				try {
					taskHandler.close(); // L: 441
				} catch (Exception var2) { // L: 443
				}
			}

			this.vmethod1213(); // L: 445
		}
	} // L: 446

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-617153741"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1218006873"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-549944769"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-556802626"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "165199982"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 532
			if (Tile.fontHelvetica13 == null) { // L: 533
				Tile.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 534
				Client.loginScreenFontMetrics = this.canvas.getFontMetrics(Tile.fontHelvetica13); // L: 535
			}

			if (var3) { // L: 537
				var4.setColor(Color.black); // L: 538
				var4.fillRect(0, 0, class10.canvasWidth, class11.canvasHeight); // L: 539
			}

			Color var5 = new Color(140, 17, 17); // L: 541

			try {
				if (class13.field54 == null) { // L: 543
					class13.field54 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class13.field54.getGraphics(); // L: 544
				var6.setColor(var5); // L: 545
				var6.drawRect(0, 0, 303, 33); // L: 546
				var6.fillRect(2, 2, var1 * 3, 30); // L: 547
				var6.setColor(Color.black); // L: 548
				var6.drawRect(1, 1, 301, 31); // L: 549
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 550
				var6.setFont(Tile.fontHelvetica13); // L: 551
				var6.setColor(Color.white); // L: 552
				var6.drawString(var2, (304 - Client.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 553
				var4.drawImage(class13.field54, class10.canvasWidth / 2 - 152, class11.canvasHeight / 2 - 18, (ImageObserver)null); // L: 554
			} catch (Exception var9) { // L: 556
				int var7 = class10.canvasWidth / 2 - 152; // L: 557
				int var8 = class11.canvasHeight / 2 - 18; // L: 558
				var4.setColor(var5); // L: 559
				var4.drawRect(var7, var8, 303, 33); // L: 560
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 561
				var4.setColor(Color.black); // L: 562
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 563
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 564
				var4.setFont(Tile.fontHelvetica13); // L: 565
				var4.setColor(Color.white); // L: 566
				var4.drawString(var2, var7 + (304 - Client.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 567
			}
		} catch (Exception var10) { // L: 570
			this.canvas.repaint(); // L: 571
		}

	} // L: 573

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3855"
	)
	protected final void method506() {
		class13.field54 = null; // L: 576
		Tile.fontHelvetica13 = null; // L: 577
		Client.loginScreenFontMetrics = null; // L: 578
	} // L: 579

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1285720843"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 582
			this.hasErrored = true; // L: 583
			System.out.println("error_game_" + var1); // L: 584

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 586
			} catch (Exception var3) { // L: 588
			}

		}
	} // L: 589

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "582488992"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 592
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)Lqk;",
		garbageValue = "1"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 597
		int var2 = Math.max(var1.getWidth(), this.field189); // L: 598
		int var3 = Math.max(var1.getHeight(), this.field190); // L: 599
		if (this.frame != null) { // L: 600
			Insets var4 = this.frame.getInsets(); // L: 601
			var2 -= var4.left + var4.right; // L: 602
			var3 -= var4.bottom + var4.top; // L: 603
		}

		return new Bounds(var2, var3); // L: 605
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1206892434"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 609
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1476065581"
	)
	protected abstract void vmethod1213();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 469
			stopTimeMs = Canvas.method310(); // L: 470
			VarpDefinition.method3559(5000L); // L: 471
			this.kill(); // L: 472
		}
	} // L: 473

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 482
			this.fullRedraw = true; // L: 483
			if (Canvas.method310() - this.field200 > 1000L) { // L: 484
				Rectangle var2 = var1.getClipBounds(); // L: 485
				if (var2 == null || var2.width >= class10.canvasWidth && var2.height >= class11.canvasHeight) {
					this.isCanvasInvalid = true; // L: 486
				}
			}

		}
	} // L: 488

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 463
			stopTimeMs = Canvas.method310() + 4000L; // L: 464
		}
	} // L: 465

	public final void update(Graphics var1) {
		this.paint(var1); // L: 477
	} // L: 478

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 492
		this.fullRedraw = true; // L: 493
	} // L: 494

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 498
	} // L: 499

	public final void windowActivated(WindowEvent var1) {
	} // L: 502

	public final void windowClosed(WindowEvent var1) {
	} // L: 505

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 516

	public final void windowOpened(WindowEvent var1) {
	} // L: 522

	public abstract void init();

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 513

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 509
	} // L: 510

	public final void windowIconified(WindowEvent var1) {
	} // L: 519

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 332
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 333
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 334
					String var2 = TaskHandler.javaVersion; // L: 335
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 336
						this.error("wrongjava"); // L: 337
						return; // L: 338
					}

					if (var2.startsWith("1.6.0_")) { // L: 340
						int var3;
						for (var3 = 6; var3 < var2.length() && class350.isDigit(var2.charAt(var3)); ++var3) { // L: 341 342
						}

						String var4 = var2.substring(6, var3); // L: 343
						if (DynamicObject.isNumber(var4) && VarbitComposition.method3780(var4) < 10) { // L: 344
							this.error("wrongjava"); // L: 345
							return; // L: 346
						}
					}

					fiveOrOne = 5; // L: 349
				}
			}

			this.setFocusCycleRoot(true); // L: 352
			this.addCanvas(); // L: 353
			this.setUp(); // L: 354
			clock = TextureProvider.method4730(); // L: 355

			while (0L == stopTimeMs || Canvas.method310() < stopTimeMs) { // L: 356
				UserComparator7.gameCyclesToDo = clock.wait(cycleDurationMillis, fiveOrOne); // L: 357

				for (int var5 = 0; var5 < UserComparator7.gameCyclesToDo; ++var5) { // L: 358
					this.clientTick();
				}

				this.graphicsTick(); // L: 359
				this.post(this.canvas); // L: 360
			}
		} catch (Exception var6) { // L: 363
			LoginPacket.RunException_sendStackTrace((String)null, var6); // L: 364
			this.error("crash"); // L: 365
		}

		this.kill(); // L: 367
	} // L: 368

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 457
			stopTimeMs = 0L; // L: 458
		}
	} // L: 459

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "489"
	)
	static final void method478(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 76
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 77
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 78
					Tiles.field995[0][var5][var4] = 127; // L: 79
					if (var0 == var5 && var5 > 0) { // L: 80
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var5 == var0 + var2 && var5 < 103) { // L: 81
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 82
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 87

	@ObfuscatedName("mj")
	static final void method625(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0); // L: 11993
		((TextureProvider)Rasterizer3D.field2512.Rasterizer3D_textureLoader).setBrightness(var0); // L: 11994
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 11996
		WorldMapManager.clientPreferences.method2503(var0); // L: 11998
	} // L: 11999
}
