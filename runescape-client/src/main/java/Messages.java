import java.io.DataInputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("au")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 938382897
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("as")
	public static String field1422;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "886881488"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 34
				if (var1 != null) { // L: 35
					var2 = class493.method8807(var1);
				}

				if (var0 != null) { // L: 36
					if (var1 != null) { // L: 37
						var2 = var2 + " | ";
					}

					var2 = var2 + var0; // L: 38
				}

				System.out.println("Error: " + var2); // L: 40
				var2 = var2.replace(':', '.'); // L: 41
				var2 = var2.replace('@', '_'); // L: 42
				var2 = var2.replace('&', '_'); // L: 43
				var2 = var2.replace('#', '_'); // L: 44
				if (RunException.RunException_applet == null) { // L: 45
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + RunException.field5266 + "&u=" + RunException.field5263 + "&v1=" + TaskHandler.javaVendor + "&v2=" + class106.javaVersion + "&ct=" + RunException.field5267 + "&e=" + var2); // L: 46
				DataInputStream var4 = new DataInputStream(var3.openStream()); // L: 47
				var4.read(); // L: 48
				var4.close(); // L: 49
			} catch (Exception var5) { // L: 51
			}

		}
	} // L: 52

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "1446947589"
	)
	static int method2771(int var0, Script var1, boolean var2) {
		if (var0 == 7108) { // L: 5103
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = NameableContainer.method7991() ? 1 : 0; // L: 5104
			return 1; // L: 5105
		} else {
			return 2; // L: 5107
		}
	}
}
