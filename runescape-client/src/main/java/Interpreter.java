import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("as")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("ax")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("ap")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("ab")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("ak")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -149482019
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("af")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1973390929
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lcm;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	static Widget field864;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	static ClanChannel field872;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -803311683
	)
	static int field865;
	@ObfuscatedName("az")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("au")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("aq")
	static boolean field852;
	@ObfuscatedName("aw")
	static boolean field875;
	@ObfuscatedName("ay")
	static ArrayList field873;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 279398559
	)
	static int field871;
	@ObfuscatedName("bj")
	static final double field868;
	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("socketTask")
	static Task socketTask;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 70
		Interpreter_arrays = new int[5][5000]; // L: 71
		Interpreter_intStack = new int[1000]; // L: 72
		Interpreter_stringStack = new String[1000]; // L: 74
		Interpreter_frameDepth = 0; // L: 76
		Interpreter_frames = new ScriptFrame[50]; // L: 77
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 83
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 86
		field852 = false; // L: 89
		field875 = false; // L: 90
		field873 = new ArrayList(); // L: 91
		field871 = 0; // L: 92
		field868 = Math.log(2.0D); // L: 96
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BB)Ltm;",
		garbageValue = "8"
	)
	public static final SpritePixels method2032(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			Class var2 = ImageIO.class; // L: 22
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 23
			} // L: 24

			int var6 = var1.getWidth(); // L: 25
			int var7 = var1.getHeight(); // L: 26
			int[] var4 = new int[var6 * var7]; // L: 27
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6); // L: 28
			var5.grabPixels(); // L: 29
			return new SpritePixels(var4, var6, var7); // L: 30
		} catch (IOException var9) { // L: 32
		} catch (InterruptedException var10) { // L: 33
		}

		return new SpritePixels(0, 0); // L: 34
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "554074328"
	)
	public static int method1961(int var0) {
		return var0 >> 17 & 7; // L: 21
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-5020"
	)
	static final void method2034() {
		if (Client.logoutTimer > 0) { // L: 3080
			FriendSystem.logOut(); // L: 3081
		} else {
			Client.timer.method7608(); // L: 3084
			UserComparator8.method2855(40); // L: 3085
			ArchiveLoader.field1037 = Client.packetWriter.getSocket(); // L: 3086
			Client.packetWriter.removeSocket(); // L: 3087
		}
	} // L: 3082 3088
}
