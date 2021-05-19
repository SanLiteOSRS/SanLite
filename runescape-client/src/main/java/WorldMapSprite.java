import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("c")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var1 + var2 * 64];
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lnz;",
		garbageValue = "2142784840"
	)
	public static class374 method3581(int var0) {
		int var1 = class372.field4132[var0];
		if (var1 == 1) {
			return class374.field4141;
		} else if (var1 == 2) {
			return class374.field4136;
		} else {
			return var1 == 3 ? class374.field4135 : null;
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)Z",
		garbageValue = "418250981"
	)
	static final boolean method3580(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method4617(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) {
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2629, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
