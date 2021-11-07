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

@ObfuscatedName("ai")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -858712261
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -5031362625863510515L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("g")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 617104153
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2102456181
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 390027783
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("u")
	@Export("graphicsTickTimes")
	protected static long[] graphicsTickTimes;
	@ObfuscatedName("z")
	@Export("clientTickTimes")
	protected static long[] clientTickTimes;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 688008119
	)
	static int field178;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1856914925
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 942844513
	)
	static int field191;
	@ObfuscatedName("ap")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 4237137078128785361L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 2056276932530273441L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "[Loe;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("e")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 32100603
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -160724727
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -827932873
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1933012565
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1123175499
	)
	int field184;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2060371379
	)
	int field185;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1530282643
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -628736541
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("ai")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ah")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("as")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ac")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ak")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 578203363854775073L
	)
	volatile long field195;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lc;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("ax")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("av")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null;
		GameEngine_redundantStartThreadCount = 0;
		stopTimeMs = 0L;
		isKilled = false;
		cycleDurationMillis = 20;
		fiveOrOne = 1;
		fps = 0;
		graphicsTickTimes = new long[32];
		clientTickTimes = new long[32];
		field191 = 500;
		volatileFocus = true;
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field195 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		ItemContainer.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-608909834"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method533();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-2098346454"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				FloorUnderlayDefinition.method3190(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Leg;",
		garbageValue = "97"
	)
	@Export("mouseWheel")
	protected class144 mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-999701566"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-1"
	)
	protected void method484(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-99443969"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			KeyHandler.KeyHandler_keyCodes[186] = 57;
			KeyHandler.KeyHandler_keyCodes[187] = 27;
			KeyHandler.KeyHandler_keyCodes[188] = 71;
			KeyHandler.KeyHandler_keyCodes[189] = 26;
			KeyHandler.KeyHandler_keyCodes[190] = 72;
			KeyHandler.KeyHandler_keyCodes[191] = 73;
			KeyHandler.KeyHandler_keyCodes[192] = 58;
			KeyHandler.KeyHandler_keyCodes[219] = 42;
			KeyHandler.KeyHandler_keyCodes[220] = 74;
			KeyHandler.KeyHandler_keyCodes[221] = 43;
			KeyHandler.KeyHandler_keyCodes[222] = 59;
			KeyHandler.KeyHandler_keyCodes[223] = 28;
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71;
			KeyHandler.KeyHandler_keyCodes[45] = 26;
			KeyHandler.KeyHandler_keyCodes[46] = 72;
			KeyHandler.KeyHandler_keyCodes[47] = 73;
			KeyHandler.KeyHandler_keyCodes[59] = 57;
			KeyHandler.KeyHandler_keyCodes[61] = 27;
			KeyHandler.KeyHandler_keyCodes[91] = 42;
			KeyHandler.KeyHandler_keyCodes[92] = 74;
			KeyHandler.KeyHandler_keyCodes[93] = 43;
			KeyHandler.KeyHandler_keyCodes[192] = 28;
			KeyHandler.KeyHandler_keyCodes[222] = 58;
			KeyHandler.KeyHandler_keyCodes[520] = 59;
		}

		java.awt.Canvas var1 = this.canvas;
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(KeyHandler.KeyHandler_instance);
		var1.addFocusListener(KeyHandler.KeyHandler_instance);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1124509937"
	)
	protected final void method440() {
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-86"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field184);
			this.contentHeight = Math.max(var2.highY, this.field185);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			KeyHandler.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(canvasWidth, KeyHandler.canvasHeight);
			Canvas.rasterProvider = new RasterProvider(canvasWidth, KeyHandler.canvasHeight, this.canvas);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var3.left, this.canvasY + var3.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.fullRedraw = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1701018417"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - canvasWidth - var1;
		int var4 = this.contentHeight - KeyHandler.canvasHeight - var2;
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
			try {
				Container var5 = this.container();
				int var6 = 0;
				int var7 = 0;
				if (var5 == this.frame) {
					Insets var8 = this.frame.getInsets();
					var6 = var8.left;
					var7 = var8.top;
				}

				Graphics var10 = var5.getGraphics();
				var10.setColor(Color.black);
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight);
				}

				if (var2 > 0) {
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) {
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) {
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) {
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1296094559"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas;
		var1.removeKeyListener(KeyHandler.KeyHandler_instance);
		var1.removeFocusListener(KeyHandler.KeyHandler_instance);
		KeyHandler.field122 = -1;
		ModeWhere.method5543(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas();
		java.awt.Canvas var2 = this.canvas;
		var2.setFocusTraversalKeysEnabled(false);
		var2.addKeyListener(KeyHandler.KeyHandler_instance);
		var2.addFocusListener(KeyHandler.KeyHandler_instance);
		java.awt.Canvas var3 = this.canvas;
		var3.addMouseListener(MouseHandler.MouseHandler_instance);
		var3.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var3.addFocusListener(MouseHandler.MouseHandler_instance);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method533();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-417163265"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameEngine != null) {
				++GameEngine_redundantStartThreadCount;
				if (GameEngine_redundantStartThreadCount >= 3) {
					this.error("alreadyloaded");
					return;
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}

			gameEngine = this;
			canvasWidth = var1;
			KeyHandler.canvasHeight = var2;
			RunException.RunException_revision = var3;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var5) {
			MilliClock.RunException_sendStackTrace((String)null, var5);
			this.error("crash");
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "86"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		canvasWidth = Math.max(var1.getWidth(), this.field184);
		KeyHandler.canvasHeight = Math.max(var1.getHeight(), this.field185);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			canvasWidth -= var2.left + var2.right;
			KeyHandler.canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(canvasWidth, KeyHandler.canvasHeight);
		this.canvas.setVisible(true);
		this.canvas.setBackground(Color.BLACK);
		if (var1 == this.frame) {
			var2 = this.frame.getInsets();
			this.canvas.setLocation(var2.left + this.canvasX, this.canvasY + var2.top);
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY);
		}

		this.canvas.addFocusListener(this);
		this.canvas.requestFocus();
		this.fullRedraw = true;
		if (Canvas.rasterProvider != null && canvasWidth == Canvas.rasterProvider.width && KeyHandler.canvasHeight == Canvas.rasterProvider.height) {
			((RasterProvider)Canvas.rasterProvider).setComponent(this.canvas);
			Canvas.rasterProvider.drawFull(0, 0);
		} else {
			Canvas.rasterProvider = new RasterProvider(canvasWidth, KeyHandler.canvasHeight, this.canvas);
		}

		this.isCanvasInvalid = false;
		this.field195 = class111.method2516();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-597352233"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase();
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
				if (var1.endsWith("127.0.0.1")) {
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1);
					}

					if (var1.endsWith("192.168.1.")) {
						return true;
					} else {
						this.error("invalidhost");
						return false;
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-754121126"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class111.method2516();
		long var3 = clientTickTimes[field178];
		clientTickTimes[field178] = var1;
		field178 = field178 + 1 & 31;
		if (0L != var3 && var1 > var3) {
		}

		synchronized(this) {
			WorldMapSectionType.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "25949374"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = class111.method2516();
		long var4 = graphicsTickTimes[class362.field4057];
		graphicsTickTimes[class362.field4057] = var2;
		class362.field4057 = class362.field4057 + 1 & 31;
		if (var4 != 0L && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field191 - 1 > 50) {
			field191 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(canvasWidth, KeyHandler.canvasHeight);
			this.canvas.setVisible(true);
			if (var1 == this.frame) {
				Insets var7 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var7.left, this.canvasY + var7.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}
		}

		if (this.isCanvasInvalid) {
			this.replaceCanvas();
		}

		this.method449();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1812985306"
	)
	final void method449() {
		Bounds var1 = this.getFrameContentBounds();
		if (var1.highX != this.contentWidth || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1443705423"
	)
	final void method533() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1010664187"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) {
			isKilled = true;

			try {
				this.canvas.removeFocusListener(this);
			} catch (Exception var5) {
			}

			try {
				this.kill0();
			} catch (Exception var4) {
			}

			if (this.frame != null) {
				try {
					System.exit(0);
				} catch (Throwable var3) {
				}
			}

			if (taskHandler != null) {
				try {
					taskHandler.close();
				} catch (Exception var2) {
				}
			}

			this.vmethod1164();
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2071280922"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "466223513"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1302395481"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-9054"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "-1526487406"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (class115.fontHelvetica13 == null) {
				class115.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				class28.loginScreenFontMetrics = this.canvas.getFontMetrics(class115.fontHelvetica13);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, canvasWidth, KeyHandler.canvasHeight);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (class19.field89 == null) {
					class19.field89 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class19.field89.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(class115.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - class28.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(class19.field89, canvasWidth / 2 - 152, KeyHandler.canvasHeight / 2 - 18, (ImageObserver)null);
			} catch (Exception var9) {
				int var7 = canvasWidth / 2 - 152;
				int var8 = KeyHandler.canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(class115.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - class28.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1801681604"
	)
	protected final void method508() {
		class19.field89 = null;
		class115.fontHelvetica13 = null;
		class28.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1990615273"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) {
			this.hasErrored = true;
			System.out.println("error_game_" + var1);

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var3) {
			}

		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "-2036429987"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lmo;",
		garbageValue = "1380374752"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field184);
		int var3 = Math.max(var1.getHeight(), this.field185);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "1980"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-71"
	)
	protected abstract void vmethod1164();

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class111.method2516();
			FloorUnderlayDefinition.method3190(5000L);
			this.kill();
		}
	}

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (class111.method2516() - this.field195 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= canvasWidth && var2.height >= KeyHandler.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public abstract void init();

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class111.method2516() + 4000L;
		}
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) {
				String var1 = TaskHandler.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = GrandExchangeOfferAgeComparator.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class117.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class129.isNumber(var4) && TaskHandler.method2881(var4) < 10) {
							this.error("wrongjava");
							return;
						}
					}

					fiveOrOne = 5;
				}
			}

			this.setFocusCycleRoot(true);
			this.addCanvas();
			this.setUp();

			Object var8;
			try {
				var8 = new NanoClock();
			} catch (Throwable var6) {
				var8 = new MilliClock();
			}

			Clock.clock = (Clock)var8;

			while (stopTimeMs == 0L || class111.method2516() < stopTimeMs) {
				class1.gameCyclesToDo = Clock.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < class1.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var7) {
			MilliClock.RunException_sendStackTrace((String)null, var7);
			this.error("crash");
		}

		this.kill();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1953693522"
	)
	public static int method584() {
		return KeyHandler.KeyHandler_idleCycles;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lni;I)Ljava/lang/String;",
		garbageValue = "658724655"
	)
	public static String method585(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			for (var3 = var0.length(); var2 < var3 && Ignored.method6212(var0.charAt(var2)); ++var2) {
			}

			while (var3 > var2 && Ignored.method6212(var0.charAt(var3 - 1))) {
				--var3;
			}

			int var4 = var3 - var2;
			if (var4 >= 1 && var4 <= SecureRandomCallable.method2052(var1)) {
				StringBuilder var5 = new StringBuilder(var4);

				for (int var6 = var2; var6 < var3; ++var6) {
					char var7 = var0.charAt(var6);
					boolean var8;
					if (Character.isISOControl(var7)) {
						var8 = false;
					} else if (ObjectComposition.isAlphaNumeric(var7)) {
						var8 = true;
					} else {
						char[] var9 = class383.field4236;
						int var10 = 0;

						label93:
						while (true) {
							char var11;
							if (var10 >= var9.length) {
								var9 = class383.field4237;

								for (var10 = 0; var10 < var9.length; ++var10) {
									var11 = var9[var10];
									if (var11 == var7) {
										var8 = true;
										break label93;
									}
								}

								var8 = false;
								break;
							}

							var11 = var9[var10];
							if (var7 == var11) {
								var8 = true;
								break;
							}

							++var10;
						}
					}

					if (var8) {
						char var12;
						switch(var7) {
						case ' ':
						case '-':
						case '_':
						case ' ':
							var12 = '_';
							break;
						case '#':
						case '[':
						case ']':
							var12 = var7;
							break;
						case 'À':
						case 'Á':
						case 'Â':
						case 'Ã':
						case 'Ä':
						case 'à':
						case 'á':
						case 'â':
						case 'ã':
						case 'ä':
							var12 = 'a';
							break;
						case 'Ç':
						case 'ç':
							var12 = 'c';
							break;
						case 'È':
						case 'É':
						case 'Ê':
						case 'Ë':
						case 'è':
						case 'é':
						case 'ê':
						case 'ë':
							var12 = 'e';
							break;
						case 'Í':
						case 'Î':
						case 'Ï':
						case 'í':
						case 'î':
						case 'ï':
							var12 = 'i';
							break;
						case 'Ñ':
						case 'ñ':
							var12 = 'n';
							break;
						case 'Ò':
						case 'Ó':
						case 'Ô':
						case 'Õ':
						case 'Ö':
						case 'ò':
						case 'ó':
						case 'ô':
						case 'õ':
						case 'ö':
							var12 = 'o';
							break;
						case 'Ù':
						case 'Ú':
						case 'Û':
						case 'Ü':
						case 'ù':
						case 'ú':
						case 'û':
						case 'ü':
							var12 = 'u';
							break;
						case 'ß':
							var12 = 'b';
							break;
						case 'ÿ':
						case 'Ÿ':
							var12 = 'y';
							break;
						default:
							var12 = Character.toLowerCase(var7);
						}

						if (var12 != 0) {
							var5.append(var12);
						}
					}
				}

				if (var5.length() == 0) {
					return null;
				} else {
					return var5.toString();
				}
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lop;IIIIIII)V",
		garbageValue = "1750259584"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					if (var1 == 0) {
						int[] var14 = Tiles.Tiles_heights[0][var2];
						int var11 = var2 + var4 + 932731;
						int var12 = var3 + var5 + 556238;
						int var13 = class19.method291(var11 + 45365, var12 + 91923, 4) - 128 + (class19.method291(10294 + var11, var12 + 37821, 2) - 128 >> 1) + (class19.method291(var11, var12, 1) - 128 >> 2);
						var13 = (int)(0.3D * (double)var13) + 35;
						if (var13 < 10) {
							var13 = 10;
						} else if (var13 > 60) {
							var13 = 60;
						}

						var14[var3] = -var13 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var7 == 1) {
					int var8 = var0.readUnsignedByte();
					if (var8 == 1) {
						var8 = 0;
					}

					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8;
					}
					break;
				}

				if (var7 <= 49) {
					Tiles.Tiles_overlays[var1][var2][var3] = var0.readByte();
					Tiles.Tiles_shapes[var1][var2][var3] = (byte)((var7 - 2) / 4);
					Tiles.field969[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
				} else if (var7 <= 81) {
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49);
				} else {
					Tiles.Tiles_underlays[var1][var2][var3] = (byte)(var7 - 81);
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					break;
				}

				if (var7 == 1) {
					var0.readUnsignedByte();
					break;
				}

				if (var7 <= 49) {
					var0.readUnsignedByte();
				}
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "8"
	)
	static int method555(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = PlayerType.method5239(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Varps.method5007(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ItemComposition.method3403(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
