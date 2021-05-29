import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("r")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("b")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("d")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("s")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("l")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1824375293
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 114758639
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lbw;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1830375703
	)
	static int field982;
	@ObfuscatedName("z")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("w")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("h")
	static boolean field973;
	@ObfuscatedName("q")
	static boolean field986;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 606273051
	)
	static int field987;
	@ObfuscatedName("al")
	static final double field989;
	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field973 = false;
		field986 = false;
		field987 = 0;
		field989 = Math.log(2.0D);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-3"
	)
	static boolean method1848(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var2) {
				return false;
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1954289740"
	)
	public static void method1870() {
		try {
			if (class232.musicPlayerStatus == 1) {
				int var0 = class124.midiPcmStream.method4410();
				if (var0 > 0 && class124.midiPcmStream.isReady()) {
					var0 -= class232.pcmSampleLength;
					if (var0 < 0) {
						var0 = 0;
					}

					class124.midiPcmStream.setPcmStreamVolume(var0);
					return;
				}

				class124.midiPcmStream.clear();
				class124.midiPcmStream.removeAll();
				if (ModelData0.musicTrackArchive != null) {
					class232.musicPlayerStatus = 2;
				} else {
					class232.musicPlayerStatus = 0;
				}

				class2.musicTrack = null;
				Messages.soundCache = null;
			}
		} catch (Exception var2) {
			var2.printStackTrace();
			class124.midiPcmStream.clear();
			class232.musicPlayerStatus = 0;
			class2.musicTrack = null;
			Messages.soundCache = null;
			ModelData0.musicTrackArchive = null;
		}

	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1390224792"
	)
	static final void method1888(int var0) {
		if (var0 >= 0) {
			int var1 = Client.menuArguments1[var0];
			int var2 = Client.menuArguments2[var0];
			int var3 = Client.menuOpcodes[var0];
			int var4 = Client.menuIdentifiers[var0];
			String var5 = Client.menuActions[var0];
			String var6 = Client.menuTargets[var0];
			Script.menuAction(var1, var2, var3, var4, var5, var6, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}
}
