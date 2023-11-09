import java.io.DataInputStream;
import java.net.URL;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -689871749
	)
	@Export("SpriteBuffer_spriteHeight")
	public static int SpriteBuffer_spriteHeight;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;I)I",
		garbageValue = "1620655261"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1); // L: 28
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 32
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "939664876"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 34
				if (var1 != null) { // L: 35
					var2 = class520.method9185(var1);
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

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + class145.RunException_revision + "&cs=" + RunException.field5301 + "&u=" + class17.field77 + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.field5299 + "&e=" + var2); // L: 46
				DataInputStream var4 = new DataInputStream(var3.openStream()); // L: 47
				var4.read(); // L: 48
				var4.close(); // L: 49
			} catch (Exception var5) { // L: 51
			}

		}
	} // L: 52
}
