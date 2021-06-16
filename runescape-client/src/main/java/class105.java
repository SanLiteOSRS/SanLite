import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public class class105 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1657910779"
	)
	public static void method2358(boolean var0) {
		if (NetCache.NetCache_socket != null) {
			try {
				Buffer var1 = new Buffer(4);
				var1.writeByte(var0 ? 2 : 3);
				var1.writeMedium(0);
				NetCache.NetCache_socket.write(var1.array, 0, 4);
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close();
				} catch (Exception var3) {
				}

				++NetCache.NetCache_ioExceptions;
				NetCache.NetCache_socket = null;
			}

		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljp;IIIZI)V",
		garbageValue = "1271786262"
	)
	public static void method2357(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class233.musicPlayerStatus = 1;
		InvDefinition.musicTrackArchive = var0;
		class233.musicTrackGroupId = var1;
		class233.musicTrackFileId = var2;
		class233.musicTrackVolume = var3;
		GrandExchangeOfferUnitPriceComparator.musicTrackBoolean = var4;
		FaceNormal.pcmSampleLength = 10000;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1162856506"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}
}
