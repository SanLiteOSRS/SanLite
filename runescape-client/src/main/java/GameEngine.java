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

@ObfuscatedName("bw")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lfo;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lbw;"
	)
	@Export("gameShell")
	static GameEngine gameShell;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -823733869
	)
	@Export("GameShell_redundantStartThreadCount")
	static int GameShell_redundantStartThreadCount;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = 5260130147769638647L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("i")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -551512965
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1340319367
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 253564767
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("q")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("f")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -744176475
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1469478575
	)
	static int field477;
	@ObfuscatedName("ad")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ai")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 5656541566078499911L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -6735850027157901575L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("o")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -666140821
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 528808707
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 2020225171
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1122384321
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 236351201
	)
	int field475;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1328280729
	)
	int field476;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1655899873
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1639831573
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("am")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ap")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("au")
	volatile boolean field481;
	@ObfuscatedName("at")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("aq")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 158421572570045259L
	)
	volatile long field485;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "Lbc;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("as")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("az")
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
		field477 = 500;
		volatileFocus = true;
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.field481 = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field485 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		class300.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-2029851592"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method991();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Object;I)V",
		garbageValue = "-1294823568"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				class227.method4180(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)Lfd;",
		garbageValue = "51"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-726775332"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "783743664"
	)
	@Export("clipboardSetString")
	protected void clipboardSetString(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-47"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		class8.method105();
		java.awt.Canvas var1 = this.canvas;
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(KeyHandler.KeyHandler_instance);
		var1.addFocusListener(KeyHandler.KeyHandler_instance);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "15264"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		GrandExchangeOfferAgeComparator.method242(this.canvas);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "185905257"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field475);
			this.contentHeight = Math.max(var2.highY, this.field476);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			FloorDecoration.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - FloorDecoration.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(FloorDecoration.canvasWidth, canvasHeight);
			WorldMapSprite.rasterProvider = new RasterProvider(FloorDecoration.canvasWidth, canvasHeight, this.canvas);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var3.left, var3.top + this.canvasY);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.field481 = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "912814062"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1351857768"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - FloorDecoration.canvasWidth - var1;
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1486323299"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		class182.method3683(this.canvas);
		WorldMapAreaData.method751(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas();
		java.awt.Canvas var1 = this.canvas;
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(KeyHandler.KeyHandler_instance);
		var1.addFocusListener(KeyHandler.KeyHandler_instance);
		GrandExchangeOfferAgeComparator.method242(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method991();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(IIII)V",
		garbageValue = "-922388983"
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
			FloorDecoration.canvasWidth = var1;
			canvasHeight = var2;
			ObjectComposition.RunException_revision = var3;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var5) {
			Decimator.RunException_sendStackTrace((String)null, var5);
			this.error("crash");
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1659845190"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		FloorDecoration.canvasWidth = Math.max(var1.getWidth(), this.field475);
		canvasHeight = Math.max(var1.getHeight(), this.field476);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			FloorDecoration.canvasWidth -= var2.left + var2.right;
			canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(FloorDecoration.canvasWidth, canvasHeight);
		this.canvas.setVisible(true);
		this.canvas.setBackground(Color.BLACK);
		if (var1 == this.frame) {
			var2 = this.frame.getInsets();
			this.canvas.setLocation(this.canvasX + var2.left, this.canvasY + var2.top);
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY);
		}

		this.canvas.addFocusListener(this);
		this.canvas.requestFocus();
		this.field481 = true;
		if (WorldMapSprite.rasterProvider != null && FloorDecoration.canvasWidth == WorldMapSprite.rasterProvider.width && canvasHeight == WorldMapSprite.rasterProvider.height) {
			((RasterProvider)WorldMapSprite.rasterProvider).setComponent(this.canvas);
			WorldMapSprite.rasterProvider.drawFull(0, 0);
		} else {
			WorldMapSprite.rasterProvider = new RasterProvider(FloorDecoration.canvasWidth, canvasHeight, this.canvas);
		}

		this.isCanvasInvalid = false;
		this.field485 = PacketWriter.currentTimeMillis();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "395568671"
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-152433822"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = PacketWriter.currentTimeMillis();
		long var3 = clientTickTimes[FontName.clientTickTimeIdx];
		clientTickTimes[FontName.clientTickTimeIdx] = var1;
		FontName.clientTickTimeIdx = FontName.clientTickTimeIdx + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1567053941"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = PacketWriter.currentTimeMillis();
		long var4 = graphicsTickTimes[BoundaryObject.graphicsTickTimeIdx];
		graphicsTickTimes[BoundaryObject.graphicsTickTimeIdx] = var2;
		BoundaryObject.graphicsTickTimeIdx = BoundaryObject.graphicsTickTimeIdx + 1 & 31;
		if (var4 != 0L && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field477 - 1 > 50) {
			field477 -= 50;
			this.field481 = true;
			this.canvas.setSize(FloorDecoration.canvasWidth, canvasHeight);
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

		this.method990();
		this.draw(this.field481);
		if (this.field481) {
			this.clearBackground();
		}

		this.field481 = false;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "428970843"
	)
	final void method990() {
		Bounds var1 = this.getFrameContentBounds();
		if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-650969456"
	)
	final void method991() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-181155812"
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

			this.vmethod1761();
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1974240025"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-720509728"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "(ZB)V",
		garbageValue = "-63"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-645621446"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;ZI)V",
		garbageValue = "577795912"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (class278.fontHelvetica13 == null) {
				class278.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				ApproximateRouteStrategy.loginScreenFontMetrics = this.canvas.getFontMetrics(class278.fontHelvetica13);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, FloorDecoration.canvasWidth, canvasHeight);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (PacketBuffer.field3725 == null) {
					PacketBuffer.field3725 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = PacketBuffer.field3725.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(class278.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - ApproximateRouteStrategy.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(PacketBuffer.field3725, FloorDecoration.canvasWidth / 2 - 152, canvasHeight / 2 - 18, (ImageObserver)null);
			} catch (Exception var9) {
				int var7 = FloorDecoration.canvasWidth / 2 - 152;
				int var8 = canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(class278.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - ApproximateRouteStrategy.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "15"
	)
	protected final void method1002() {
		PacketBuffer.field3725 = null;
		class278.fontHelvetica13 = null;
		ApproximateRouteStrategy.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "1560488333"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "(I)Ljava/awt/Container;",
		garbageValue = "1926936525"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		signature = "(I)Llr;",
		garbageValue = "-1116469540"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field475);
		int var3 = Math.max(var1.getHeight(), this.field476);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.top + var4.bottom;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "2"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "28"
	)
	protected abstract void vmethod1761();

	public final void destroy() {
		if (this == gameShell && !isKilled) {
			stopTimeMs = PacketWriter.currentTimeMillis();
			class227.method4180(5000L);
			this.kill();
		}
	}

	public final synchronized void paint(Graphics var1) {
		if (this == gameShell && !isKilled) {
			this.field481 = true;
			if (PacketWriter.currentTimeMillis() - this.field485 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= FloorDecoration.canvasWidth && var2.height >= canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void start() {
		if (this == gameShell && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.field481 = true;
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
						if (World.isNumber(var4) && GrandExchangeOfferTotalQuantityComparator.parseInt(var4) < 10) {
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
			AbstractWorldMapIcon.clock = ModeWhere.method3761();

			while (stopTimeMs == 0L || PacketWriter.currentTimeMillis() < stopTimeMs) {
				class58.gameCyclesToDo = AbstractWorldMapIcon.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < class58.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var6) {
			Decimator.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

		this.kill();
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void stop() {
		if (this == gameShell && !isKilled) {
			stopTimeMs = PacketWriter.currentTimeMillis() + 4000L;
		}
	}

	public abstract void init();

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(IIB)I",
		garbageValue = "1"
	)
	public static int method996(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "([BII)I",
		garbageValue = "-1245222841"
	)
	public static int method1108(byte[] var0, int var1) {
		int var3 = -1;

		for (int var4 = 0; var4 < var1; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "53"
	)
	static void method1109() {
		if (ModelData0.field1901 != null) {
			Client.field946 = Client.cycle;
			ModelData0.field1901.method4414();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					ModelData0.field1901.method4423(WorldMapManager.baseX * 64 + (Client.players[var0].x >> 7), WorldMapLabel.baseY * 64 + (Client.players[var0].y >> 7));
				}
			}
		}

	}
}
