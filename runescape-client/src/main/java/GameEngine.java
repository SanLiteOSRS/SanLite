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

@ObfuscatedName("ba")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lfl;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lba;"
	)
	@Export("gameShell")
	static GameEngine gameShell;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1935036079
	)
	@Export("GameShell_redundantStartThreadCount")
	static int GameShell_redundantStartThreadCount;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = -3572078124580925775L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("z")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2072686187
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1928791623
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1333363833
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1701309635
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("n")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("r")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1541130703
	)
	static int field495;
	@ObfuscatedName("aa")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 5754023503736299787L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -7246664469956592727L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("gk")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 1206716707
	)
	static int field466;
	@ObfuscatedName("q")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1942490897
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -12097029
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -56321895
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 314779351
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1023535157
	)
	int field482;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1830509
	)
	int field483;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1518889003
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -963306765
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("ar")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ay")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ah")
	volatile boolean field488;
	@ObfuscatedName("au")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ai")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = 641067398817964123L
	)
	volatile long field492;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		signature = "Lbf;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("an")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("am")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameShell = null;
		GameShell_redundantStartThreadCount = 0;
		stopTimeMs = 0L;
		isKilled = false;
		cycleDurationMillis = 20;
		fiveOrOne = 1;
		fps = 0;
		graphicsTickTimes = new long[32];
		clientTickTimes = new long[32];
		field495 = 500;
		volatileFocus = true;
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.field488 = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field492 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		class69.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IIS)V",
		garbageValue = "8156"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method1023();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Object;I)V",
		garbageValue = "1268616662"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				WorldMapSection3.method894(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)Lfq;",
		garbageValue = "1414879636"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2067503658"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "1423011731"
	)
	@Export("clipboardSetString")
	protected void clipboardSetString(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "45"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		GrandExchangeOfferNameComparator.method228();
		VertexNormal.method3136(this.canvas);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "932982288"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		TextureProvider.method2899(this.canvas);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-60"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field482);
			this.contentHeight = Math.max(var2.highY, this.field483);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			ItemContainer.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			HealthBar.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - ItemContainer.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(ItemContainer.canvasWidth, HealthBar.canvasHeight);
			class22.rasterProvider = new RasterProvider(ItemContainer.canvasWidth, HealthBar.canvasHeight, this.canvas);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var3.left, var3.top + this.canvasY);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.field488 = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1977357922"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2136821254"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - ItemContainer.canvasWidth - var1;
		int var4 = this.contentHeight - HealthBar.canvasHeight - var2;
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1457891067"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas;
		var1.removeKeyListener(KeyHandler.KeyHandler_instance);
		var1.removeFocusListener(KeyHandler.KeyHandler_instance);
		KeyHandler.field423 = -1;
		java.awt.Canvas var2 = this.canvas;
		var2.removeMouseListener(MouseHandler.MouseHandler_instance);
		var2.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var2.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas();
		VertexNormal.method3136(this.canvas);
		TextureProvider.method2899(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method1023();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(IIII)V",
		garbageValue = "1788157665"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameShell != null) {
				++GameShell_redundantStartThreadCount;
				if (GameShell_redundantStartThreadCount >= 3) {
					this.error("alreadyloaded");
					return;
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}

			gameShell = this;
			ItemContainer.canvasWidth = var1;
			HealthBar.canvasHeight = var2;
			RunException.RunException_revision = var3;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var5) {
			PacketWriter.RunException_sendStackTrace((String)null, var5);
			this.error("crash");
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1769153010"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		ItemContainer.canvasWidth = Math.max(var1.getWidth(), this.field482);
		HealthBar.canvasHeight = Math.max(var1.getHeight(), this.field483);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			ItemContainer.canvasWidth -= var2.left + var2.right;
			HealthBar.canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(ItemContainer.canvasWidth, HealthBar.canvasHeight);
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
		this.field488 = true;
		if (class22.rasterProvider != null && ItemContainer.canvasWidth == class22.rasterProvider.width && HealthBar.canvasHeight == class22.rasterProvider.height) {
			((RasterProvider)class22.rasterProvider).setComponent(this.canvas);
			class22.rasterProvider.drawFull(0, 0);
		} else {
			class22.rasterProvider = new RasterProvider(ItemContainer.canvasWidth, HealthBar.canvasHeight, this.canvas);
		}

		this.isCanvasInvalid = false;
		this.field492 = Nameable.currentTimeMillis();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "-25"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-840084713"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = Nameable.currentTimeMillis();
		long var3 = clientTickTimes[class7.clientTickTimeIdx];
		clientTickTimes[class7.clientTickTimeIdx] = var1;
		class7.clientTickTimeIdx = class7.clientTickTimeIdx + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			class8.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "0"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = Nameable.currentTimeMillis();
		long var4 = graphicsTickTimes[GraphicsDefaults.graphicsTickTimeIdx];
		graphicsTickTimes[GraphicsDefaults.graphicsTickTimeIdx] = var2;
		GraphicsDefaults.graphicsTickTimeIdx = GraphicsDefaults.graphicsTickTimeIdx + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field495 - 1 > 50) {
			field495 -= 50;
			this.field488 = true;
			this.canvas.setSize(ItemContainer.canvasWidth, HealthBar.canvasHeight);
			this.canvas.setVisible(true);
			if (var1 == this.frame) {
				Insets var7 = this.frame.getInsets();
				this.canvas.setLocation(var7.left + this.canvasX, this.canvasY + var7.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}
		}

		if (this.isCanvasInvalid) {
			this.replaceCanvas();
		}

		this.method1022();
		this.draw(this.field488);
		if (this.field488) {
			this.clearBackground();
		}

		this.field488 = false;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1244527776"
	)
	final void method1022() {
		Bounds var1 = this.getFrameContentBounds();
		if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "48"
	)
	final void method1023() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2057674106"
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

			this.vmethod1384();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1060461771"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1100660042"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "-1812204618"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "118"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;ZB)V",
		garbageValue = "45"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (ViewportMouse.fontHelvetica13 == null) {
				ViewportMouse.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				class52.loginScreenFontMetrics = this.canvas.getFontMetrics(ViewportMouse.fontHelvetica13);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, ItemContainer.canvasWidth, HealthBar.canvasHeight);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (class231.field2779 == null) {
					class231.field2779 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class231.field2779.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(ViewportMouse.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - class52.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(class231.field2779, ItemContainer.canvasWidth / 2 - 152, HealthBar.canvasHeight / 2 - 18, (ImageObserver)null);
			} catch (Exception var9) {
				int var7 = ItemContainer.canvasWidth / 2 - 152;
				int var8 = HealthBar.canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(ViewportMouse.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - class52.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "32"
	)
	protected final void method1112() {
		class231.field2779 = null;
		ViewportMouse.fontHelvetica13 = null;
		class52.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-1007402931"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "(B)Ljava/awt/Container;",
		garbageValue = "1"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		signature = "(B)Llw;",
		garbageValue = "-50"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field482);
		int var3 = Math.max(var1.getHeight(), this.field483);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.top + var4.bottom;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "1525003630"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-51"
	)
	protected abstract void vmethod1384();

	public final synchronized void paint(Graphics var1) {
		if (this == gameShell && !isKilled) {
			this.field488 = true;
			if (Nameable.currentTimeMillis() - this.field492 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= ItemContainer.canvasWidth && var2.height >= HealthBar.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void destroy() {
		if (this == gameShell && !isKilled) {
			stopTimeMs = Nameable.currentTimeMillis();
			WorldMapSection3.method894(5000L);
			this.kill();
		}
	}

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) {
				String var1 = TaskHandler.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = TaskHandler.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class1.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class195.isNumber(var4) && ObjectSound.parseInt(var4) < 10) {
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
			UserComparator3.clock = Actor.method1864();

			while (0L == stopTimeMs || Nameable.currentTimeMillis() < stopTimeMs) {
				gameCyclesToDo = UserComparator3.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var6) {
			PacketWriter.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

		this.kill();
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void stop() {
		if (this == gameShell && !isKilled) {
			stopTimeMs = Nameable.currentTimeMillis() + 4000L;
		}
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.field488 = true;
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public abstract void init();

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void start() {
		if (this == gameShell && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-516507127"
	)
	public static int method1072(int var0, int var1) {
		int var2;
		if (var1 > var0) {
			var2 = var0;
			var0 = var1;
			var1 = var2;
		}

		while (var1 != 0) {
			var2 = var0 % var1;
			var0 = var1;
			var1 = var2;
		}

		return var0;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;II)V",
		garbageValue = "-1950130429"
	)
	static final void method1138(String var0, int var1) {
		PacketBufferNode var2 = class4.getPacketBufferNode(ClientPacket.field2234, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(SpriteMask.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		var2.packetBuffer.method5664(var1);
		Client.packetWriter.addNode(var2);
	}
}
