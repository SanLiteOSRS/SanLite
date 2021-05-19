import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("h")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("c")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("o")
	@Export("Varps_main")
	public static int[] Varps_main;
	@ObfuscatedName("al")
	static String field2923;

	static {
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

		Varps_temp = new int[4000];
		Varps_main = new int[4000];
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;IIB)Llc;",
		garbageValue = "0"
	)
	public static AbstractSocket method4585(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}
}
