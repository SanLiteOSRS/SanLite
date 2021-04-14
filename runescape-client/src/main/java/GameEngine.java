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
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("al")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Ldt;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lal;"
	)
	@Export("gameShell")
	static GameEngine gameShell;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1685725481
	)
	@Export("GameShell_redundantStartThreadCount")
	static int GameShell_redundantStartThreadCount;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -4853509514782557043L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("b")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 53446861
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1368983969
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 651117419
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("d")
	@Export("graphicsTickTimes")
	protected static long[] graphicsTickTimes;
	@ObfuscatedName("j")
	@Export("clientTickTimes")
	protected static long[] clientTickTimes;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1639936393
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 531187917
	)
	static int field321;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "Loe;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("ab")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 6808670330875016505L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = 5063361816700909807L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("e")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 523882701
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -504731567
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1685077201
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -327773481
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 981917933
	)
	int field332;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2017329663
	)
	int field320;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 9044595
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1660420049
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("at")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("aj")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("aw")
	volatile boolean field316;
	@ObfuscatedName("as")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ad")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -5289724236337246501L
	)
	volatile long field303;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "Lad;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("az")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("au")
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
		field321 = 500;
		volatileFocus = true;
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.field316 = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field303 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		class301.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "7"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method560();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Object;I)V",
		garbageValue = "2112263032"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				GrandExchangeEvent.method4625(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(I)Ldw;",
		garbageValue = "-702892795"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1964367866"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "1478107780"
	)
	@Export("clipboardSetString")
	protected void clipboardSetString(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "825633698"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		class82.method1924();
		java.awt.Canvas var1 = this.canvas;
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(KeyHandler.KeyHandler_instance);
		var1.addFocusListener(KeyHandler.KeyHandler_instance);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-748357036"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		UserComparator4.method2419(this.canvas);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "105"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field332);
			this.contentHeight = Math.max(var2.highY, this.field320);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			InterfaceParent.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - InterfaceParent.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(InterfaceParent.canvasWidth, canvasHeight);
			rasterProvider = new RasterProvider(InterfaceParent.canvasWidth, canvasHeight, this.canvas);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var3.left, this.canvasY + var3.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.field316 = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1835470787"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "35349985"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - InterfaceParent.canvasWidth - var1;
		int var4 = this.contentHeight - canvasHeight - var2;
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2129767231"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas;
		var1.removeKeyListener(KeyHandler.KeyHandler_instance);
		var1.removeFocusListener(KeyHandler.KeyHandler_instance);
		KeyHandler.field259 = -1;
		WorldMapLabelSize.method2677(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas();
		java.awt.Canvas var2 = this.canvas;
		var2.setFocusTraversalKeysEnabled(false);
		var2.addKeyListener(KeyHandler.KeyHandler_instance);
		var2.addFocusListener(KeyHandler.KeyHandler_instance);
		UserComparator4.method2419(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method560();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(IIII)V",
		garbageValue = "69063419"
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
			InterfaceParent.canvasWidth = var1;
			canvasHeight = var2;
			RunException.RunException_revision = var3;
			SecureRandomCallable.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var5) {
			class223.RunException_sendStackTrace((String)null, var5);
			this.error("crash");
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-431845158"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		InterfaceParent.canvasWidth = Math.max(var1.getWidth(), this.field332);
		canvasHeight = Math.max(var1.getHeight(), this.field320);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			InterfaceParent.canvasWidth -= var2.right + var2.left;
			canvasHeight -= var2.top + var2.bottom;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(InterfaceParent.canvasWidth, canvasHeight);
		this.canvas.setVisible(true);
		this.canvas.setBackground(Color.BLACK);
		if (var1 == this.frame) {
			var2 = this.frame.getInsets();
			this.canvas.setLocation(this.canvasX + var2.left, var2.top + this.canvasY);
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY);
		}

		this.canvas.addFocusListener(this);
		this.canvas.requestFocus();
		this.field316 = true;
		if (rasterProvider != null && InterfaceParent.canvasWidth == rasterProvider.width && canvasHeight == rasterProvider.height) {
			((RasterProvider)rasterProvider).setComponent(this.canvas);
			rasterProvider.drawFull(0, 0);
		} else {
			rasterProvider = new RasterProvider(InterfaceParent.canvasWidth, canvasHeight, this.canvas);
		}

		this.isCanvasInvalid = false;
		this.field303 = ObjectSound.currentTimeMillis();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "-29"
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "24"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = ObjectSound.currentTimeMillis();
		long var3 = clientTickTimes[class29.clientTickTimeIdx];
		clientTickTimes[class29.clientTickTimeIdx] = var1;
		class29.clientTickTimeIdx = class29.clientTickTimeIdx + 1 & 31;
		if (0L != var3 && var1 > var3) {
		}

		synchronized(this) {
			GrandExchangeOfferAgeComparator.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-105"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = ObjectSound.currentTimeMillis();
		long var4 = graphicsTickTimes[class139.graphicsTickTimeIdx];
		graphicsTickTimes[class139.graphicsTickTimeIdx] = var2;
		class139.graphicsTickTimeIdx = class139.graphicsTickTimeIdx + 1 & 31;
		if (var4 != 0L && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field321 - 1 > 50) {
			field321 -= 50;
			this.field316 = true;
			this.canvas.setSize(InterfaceParent.canvasWidth, canvasHeight);
			this.canvas.setVisible(true);
			if (var1 == this.frame) {
				Insets var7 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var7.left, var7.top + this.canvasY);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}
		}

		if (this.isCanvasInvalid) {
			this.replaceCanvas();
		}

		this.method673();
		this.draw(this.field316);
		if (this.field316) {
			this.clearBackground();
		}

		this.field316 = false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2082996572"
	)
	final void method673() {
		Bounds var1 = this.getFrameContentBounds();
		if (this.contentWidth != var1.highX || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1539118256"
	)
	final void method560() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1612459374"
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

			this.vmethod1219();
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-473168642"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-102"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "-278821415"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "74"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;ZI)V",
		garbageValue = "1020883079"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (class26.fontHelvetica13 == null) {
				class26.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				GrandExchangeOfferNameComparator.loginScreenFontMetrics = this.canvas.getFontMetrics(class26.fontHelvetica13);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, InterfaceParent.canvasWidth, canvasHeight);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (GrandExchangeOfferWorldComparator.field3318 == null) {
					GrandExchangeOfferWorldComparator.field3318 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = GrandExchangeOfferWorldComparator.field3318.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(class26.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - GrandExchangeOfferNameComparator.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(GrandExchangeOfferWorldComparator.field3318, InterfaceParent.canvasWidth / 2 - 152, canvasHeight / 2 - 18, (ImageObserver)null);
			} catch (Exception var9) {
				int var7 = InterfaceParent.canvasWidth / 2 - 152;
				int var8 = canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(class26.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - GrandExchangeOfferNameComparator.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "320452892"
	)
	protected final void method594() {
		GrandExchangeOfferWorldComparator.field3318 = null;
		class26.fontHelvetica13 = null;
		GrandExchangeOfferNameComparator.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "2138250050"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "(I)Ljava/awt/Container;",
		garbageValue = "-1157412337"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		signature = "(B)Llj;",
		garbageValue = "80"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field332);
		int var3 = Math.max(var1.getHeight(), this.field320);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-42126832"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1242495393"
	)
	protected abstract void vmethod1219();

	public final synchronized void paint(Graphics var1) {
		if (this == gameShell && !isKilled) {
			this.field316 = true;
			if (ObjectSound.currentTimeMillis() - this.field303 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= InterfaceParent.canvasWidth && var2.height >= canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void destroy() {
		if (this == gameShell && !isKilled) {
			stopTimeMs = ObjectSound.currentTimeMillis();
			GrandExchangeEvent.method4625(5000L);
			this.kill();
		}
	}

	public final void start() {
		if (this == gameShell && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void stop() {
		if (this == gameShell && !isKilled) {
			stopTimeMs = ObjectSound.currentTimeMillis() + 4000L;
		}
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public abstract void init();

	public final void windowOpened(WindowEvent var1) {
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.field316 = true;
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
						for (var3 = 6; var3 < var2.length() && UserComparator4.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (WorldMapArea.isNumber(var4) && class69.method1168(var4) < 10) {
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
			Decimator.clock = PacketBuffer.method6523();

			while (0L == stopTimeMs || ObjectSound.currentTimeMillis() < stopTimeMs) {
				class232.gameCyclesToDo = Decimator.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < class232.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var6) {
			class223.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

		this.kill();
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "1469338847"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1;

		for (int var6 = 0; var6 < var5; ++var6) {
			char var7 = var0.charAt(var6 + var1);
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) {
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) {
				var3[var6 + var4] = -126;
			} else if (var7 == 402) {
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) {
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) {
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) {
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) {
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) {
				var3[var6 + var4] = -119;
			} else if (var7 == 352) {
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) {
				var3[var6 + var4] = -117;
			} else if (var7 == 338) {
				var3[var6 + var4] = -116;
			} else if (var7 == 381) {
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) {
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) {
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) {
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) {
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) {
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) {
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105;
			} else if (var7 == 732) {
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) {
				var3[var6 + var4] = -103;
			} else if (var7 == 353) {
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) {
				var3[var6 + var4] = -101;
			} else if (var7 == 339) {
				var3[var6 + var4] = -100;
			} else if (var7 == 382) {
				var3[var6 + var4] = -98;
			} else if (var7 == 376) {
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63;
			}
		}

		return var5;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1318947252"
	)
	static void method682() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromFriend();
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Lfu;[Lel;I)V",
		garbageValue = "1781189638"
	)
	static final void method680(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) {
			for (var3 = 0; var3 < 104; ++var3) {
				for (var4 = 0; var4 < 104; ++var4) {
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) {
						var5 = var2;
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
							var5 = var2 - 1;
						}

						if (var5 >= 0) {
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.field1103 += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.field1103 < -8) {
			Tiles.field1103 = -8;
		}

		if (Tiles.field1103 > 8) {
			Tiles.field1103 = 8;
		}

		Tiles.field1104 += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.field1104 < -16) {
			Tiles.field1104 = -16;
		}

		if (Tiles.field1104 > 16) {
			Tiles.field1104 = 16;
		}

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		for (var2 = 0; var2 < 4; ++var2) {
			byte[][] var42 = SecureRandomCallable.field1106[var2];
			var9 = (int)Math.sqrt(5100.0D);
			var10 = var9 * 768 >> 8;

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11];
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1];
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536));
					var16 = (var13 << 8) / var15;
					var17 = 65536 / var15;
					var18 = (var14 << 8) / var15;
					var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96;
					var20 = (var42[var12][var11 + 1] >> 3) + (var42[var12 - 1][var11] >> 2) + (var42[var12][var11 - 1] >> 2) + (var42[var12 + 1][var11] >> 3) + (var42[var12][var11] >> 1);
					WorldMapLabelSize.field1570[var12][var11] = var19 - var20;
				}
			}

			for (var11 = 0; var11 < 104; ++var11) {
				Tiles.Tiles_hue[var11] = 0;
				Tiles.Tiles_saturation[var11] = 0;
				Tiles.Tiles_lightness[var11] = 0;
				GrandExchangeOfferOwnWorldComparator.Tiles_hueMultiplier[var11] = 0;
				class375.field4136[var11] = 0;
			}

			for (var11 = -5; var11 < 109; ++var11) {
				for (var12 = 0; var12 < 104; ++var12) {
					var13 = var11 + 5;
					int var10002;
					if (var13 >= 0 && var13 < 104) {
						var14 = class9.field69[var2][var13][var12] & 255;
						if (var14 > 0) {
							var16 = var14 - 1;
							FloorUnderlayDefinition var43 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var16);
							FloorUnderlayDefinition var44;
							if (var43 != null) {
								var44 = var43;
							} else {
								byte[] var46 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var16);
								var43 = new FloorUnderlayDefinition();
								if (var46 != null) {
									var43.decode(new Buffer(var46), var16);
								}

								var43.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var43, (long)var16);
								var44 = var43;
							}

							var10000 = Tiles.Tiles_hue;
							var10000[var12] += var44.hue;
							var10000 = Tiles.Tiles_saturation;
							var10000[var12] += var44.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var12] += var44.lightness;
							var10000 = GrandExchangeOfferOwnWorldComparator.Tiles_hueMultiplier;
							var10000[var12] += var44.hueMultiplier;
							var10002 = class375.field4136[var12]++;
						}
					}

					var14 = var11 - 5;
					if (var14 >= 0 && var14 < 104) {
						var15 = class9.field69[var2][var14][var12] & 255;
						if (var15 > 0) {
							FloorUnderlayDefinition var45 = Tiles.method2035(var15 - 1);
							var10000 = Tiles.Tiles_hue;
							var10000[var12] -= var45.hue;
							var10000 = Tiles.Tiles_saturation;
							var10000[var12] -= var45.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var12] -= var45.lightness;
							var10000 = GrandExchangeOfferOwnWorldComparator.Tiles_hueMultiplier;
							var10000[var12] -= var45.hueMultiplier;
							var10002 = class375.field4136[var12]--;
						}
					}
				}

				if (var11 >= 1 && var11 < 103) {
					var12 = 0;
					var13 = 0;
					var14 = 0;
					var15 = 0;
					var16 = 0;

					for (var17 = -5; var17 < 109; ++var17) {
						var18 = var17 + 5;
						if (var18 >= 0 && var18 < 104) {
							var12 += Tiles.Tiles_hue[var18];
							var13 += Tiles.Tiles_saturation[var18];
							var14 += Tiles.Tiles_lightness[var18];
							var15 += GrandExchangeOfferOwnWorldComparator.Tiles_hueMultiplier[var18];
							var16 += class375.field4136[var18];
						}

						var19 = var17 - 5;
						if (var19 >= 0 && var19 < 104) {
							var12 -= Tiles.Tiles_hue[var19];
							var13 -= Tiles.Tiles_saturation[var19];
							var14 -= Tiles.Tiles_lightness[var19];
							var15 -= GrandExchangeOfferOwnWorldComparator.Tiles_hueMultiplier[var19];
							var16 -= class375.field4136[var19];
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
							if (var2 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var2;
							}

							var20 = class9.field69[var2][var11][var17] & 255;
							int var21 = Tiles.field1092[var2][var11][var17] & 255;
							if (var20 > 0 || var21 > 0) {
								int var22 = Tiles.Tiles_heights[var2][var11][var17];
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17];
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1];
								int var26 = WorldMapLabelSize.field1570[var11][var17];
								int var27 = WorldMapLabelSize.field1570[var11 + 1][var17];
								int var28 = WorldMapLabelSize.field1570[var11 + 1][var17 + 1];
								int var29 = WorldMapLabelSize.field1570[var11][var17 + 1];
								int var30 = -1;
								int var31 = -1;
								int var32;
								int var33;
								if (var20 > 0) {
									var32 = var12 * 256 / var15;
									var33 = var13 / var16;
									int var34 = var14 / var16;
									var30 = Script.hslToRgb(var32, var33, var34);
									var32 = var32 + Tiles.field1103 & 255;
									var34 += Tiles.field1104;
									if (var34 < 0) {
										var34 = 0;
									} else if (var34 > 255) {
										var34 = 255;
									}

									var31 = Script.hslToRgb(var32, var33, var34);
								}

								if (var2 > 0) {
									boolean var49 = true;
									if (var20 == 0 && Tiles.field1091[var2][var11][var17] != 0) {
										var49 = false;
									}

									if (var21 > 0 && !Login.method1968(var21 - 1).hideUnderlay) {
										var49 = false;
									}

									if (var49 && var22 == var23 && var22 == var24 && var25 == var22) {
										var10000 = MidiPcmStream.field2489[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0;
								if (var31 != -1) {
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[Message.method1191(var31, 96)];
								}

								if (var21 == 0) {
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, Message.method1191(var30, var26), Message.method1191(var30, var27), Message.method1191(var30, var28), Message.method1191(var30, var29), 0, 0, 0, 0, var32, 0);
								} else {
									var33 = Tiles.field1091[var2][var11][var17] + 1;
									byte var50 = class362.field4079[var2][var11][var17];
									FloorOverlayDefinition var35 = Login.method1968(var21 - 1);
									int var36 = var35.texture;
									int var37;
									int var38;
									int var39;
									int var40;
									if (var36 >= 0) {
										var38 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var36);
										var37 = -1;
									} else if (var35.primaryRgb == 16711935) {
										var37 = -2;
										var36 = -1;
										var38 = -2;
									} else {
										var37 = Script.hslToRgb(var35.hue, var35.saturation, var35.lightness);
										var39 = var35.hue + Tiles.field1103 & 255;
										var40 = var35.lightness + Tiles.field1104;
										if (var40 < 0) {
											var40 = 0;
										} else if (var40 > 255) {
											var40 = 255;
										}

										var38 = Script.hslToRgb(var39, var35.saturation, var40);
									}

									var39 = 0;
									if (var38 != -2) {
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[Player.method2148(var38, 96)];
									}

									if (var35.secondaryRgb != -1) {
										var40 = var35.secondaryHue + Tiles.field1103 & 255;
										int var41 = var35.secondaryLightness + Tiles.field1104;
										if (var41 < 0) {
											var41 = 0;
										} else if (var41 > 255) {
											var41 = 255;
										}

										var38 = Script.hslToRgb(var40, var35.secondarySaturation, var41);
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[Player.method2148(var38, 96)];
									}

									var0.addTile(var2, var11, var17, var33, var50, var36, var22, var23, var24, var25, Message.method1191(var30, var26), Message.method1191(var30, var27), Message.method1191(var30, var28), Message.method1191(var30, var29), Player.method2148(var37, var26), Player.method2148(var37, var27), Player.method2148(var37, var28), Player.method2148(var37, var29), var32, var39);
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) {
						var17 = 0;
					} else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) {
						var17 = var2 - 1;
					} else {
						var17 = var2;
					}

					var0.setTileMinPlane(var2, var12, var11, var17);
				}
			}

			class9.field69[var2] = null;
			Tiles.field1092[var2] = null;
			Tiles.field1091[var2] = null;
			class362.field4079[var2] = null;
			SecureRandomCallable.field1106[var2] = null;
		}

		var0.method3466(-50, -10, -50);

		for (var2 = 0; var2 < 104; ++var2) {
			for (var3 = 0; var3 < 104; ++var3) {
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1;
		var3 = 2;
		var4 = 4;

		for (var5 = 0; var5 < 4; ++var5) {
			if (var5 > 0) {
				var2 <<= 3;
				var3 <<= 3;
				var4 <<= 3;
			}

			for (int var6 = 0; var6 <= var5; ++var6) {
				for (int var7 = 0; var7 <= 104; ++var7) {
					for (int var8 = 0; var8 <= 104; ++var8) {
						short var48;
						if ((MidiPcmStream.field2489[var6][var8][var7] & var2) != 0) {
							var9 = var7;
							var10 = var7;
							var11 = var6;

							for (var12 = var6; var9 > 0 && (MidiPcmStream.field2489[var6][var8][var9 - 1] & var2) != 0; --var9) {
							}

							while (var10 < 104 && (MidiPcmStream.field2489[var6][var8][var10 + 1] & var2) != 0) {
								++var10;
							}

							label519:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((MidiPcmStream.field2489[var11 - 1][var8][var13] & var2) == 0) {
										break label519;
									}
								}

								--var11;
							}

							label508:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((MidiPcmStream.field2489[var12 + 1][var8][var13] & var2) == 0) {
										break label508;
									}
								}

								++var12;
							}

							var13 = (var12 + 1 - var11) * (var10 - var9 + 1);
							if (var13 >= 8) {
								var48 = 240;
								var15 = Tiles.Tiles_heights[var12][var8][var9] - var48;
								var16 = Tiles.Tiles_heights[var11][var8][var9];
								Scene.Scene_addOccluder(var5, 1, var8 * 128, var8 * 128, var9 * 128, var10 * 128 + 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = MidiPcmStream.field2489[var17][var8];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((MidiPcmStream.field2489[var6][var8][var7] & var3) != 0) {
							var9 = var8;
							var10 = var8;
							var11 = var6;

							for (var12 = var6; var9 > 0 && (MidiPcmStream.field2489[var6][var9 - 1][var7] & var3) != 0; --var9) {
							}

							while (var10 < 104 && (MidiPcmStream.field2489[var6][var10 + 1][var7] & var3) != 0) {
								++var10;
							}

							label572:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((MidiPcmStream.field2489[var11 - 1][var13][var7] & var3) == 0) {
										break label572;
									}
								}

								--var11;
							}

							label561:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((MidiPcmStream.field2489[var12 + 1][var13][var7] & var3) == 0) {
										break label561;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var48 = 240;
								var15 = Tiles.Tiles_heights[var12][var9][var7] - var48;
								var16 = Tiles.Tiles_heights[var11][var9][var7];
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var7 * 128, var7 * 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = MidiPcmStream.field2489[var17][var18];
										var10000[var7] &= ~var3;
									}
								}
							}
						}

						if ((MidiPcmStream.field2489[var6][var8][var7] & var4) != 0) {
							var9 = var8;
							var10 = var8;
							var11 = var7;

							for (var12 = var7; var11 > 0 && (MidiPcmStream.field2489[var6][var8][var11 - 1] & var4) != 0; --var11) {
							}

							while (var12 < 104 && (MidiPcmStream.field2489[var6][var8][var12 + 1] & var4) != 0) {
								++var12;
							}

							label625:
							while (var9 > 0) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((MidiPcmStream.field2489[var6][var9 - 1][var13] & var4) == 0) {
										break label625;
									}
								}

								--var9;
							}

							label614:
							while (var10 < 104) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((MidiPcmStream.field2489[var6][var10 + 1][var13] & var4) == 0) {
										break label614;
									}
								}

								++var10;
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) {
								var13 = Tiles.Tiles_heights[var6][var9][var11];
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

								for (var14 = var9; var14 <= var10; ++var14) {
									for (var15 = var11; var15 <= var12; ++var15) {
										var10000 = MidiPcmStream.field2489[var6][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(ILcc;ZS)I",
		garbageValue = "174"
	)
	static int method547(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? FriendSystem.field905 : class4.field35;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) {
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTRANSTOP) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTRANSBOT) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETFILLMODE) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else if (var0 != 1615 && var0 != 1616) {
			return 2;
		} else {
			++class16.Interpreter_intStackSize;
			return 1;
		}
	}
}
