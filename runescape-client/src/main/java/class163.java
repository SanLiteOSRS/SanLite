import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
public class class163 extends class145 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -295053931
	)
	int field1765;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -258646435
	)
	int field1764;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lff;)V"
	)
	class163(class148 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-11659242"
	)
	void vmethod3414(Buffer var1) {
		this.field1765 = var1.readInt(); // L: 274
		this.field1764 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "21847466"
	)
	void vmethod3415(ClanSettings var1) {
		var1.method3259(this.field1765, this.field1764); // L: 279
	} // L: 280

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;IZB)Lja;",
		garbageValue = "0"
	)
	public static Frames method3363(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 11
		int[] var5 = var0.getGroupFileIds(var2); // L: 12

		for (int var6 = 0; var6 < var5.length; ++var6) { // L: 13
			byte[] var7 = var0.getFile(var2, var5[var6]); // L: 14
			if (var7 == null) { // L: 15
				var4 = false; // L: 16
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255; // L: 19
				byte[] var9;
				if (var3) { // L: 21
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0); // L: 22
				}

				if (var9 == null) { // L: 23
					var4 = false;
				}
			}
		}

		if (!var4) { // L: 25
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3); // L: 27
			} catch (Exception var11) { // L: 29
				return null; // L: 30
			}
		}
	}

	@ObfuscatedName("al")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 34
			if (0L == var0 % 37L) { // L: 35
				return null;
			} else {
				int var2 = 0; // L: 36

				for (long var3 = var0; 0L != var3; var3 /= 37L) { // L: 37 38 40
					++var2; // L: 39
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) { // L: 42 43 52
					long var6 = var0; // L: 44
					var0 /= 37L; // L: 45
					var8 = class403.base37Table[(int)(var6 - var0 * 37L)]; // L: 46
					if (var8 == '_') { // L: 47
						int var9 = var5.length() - 1; // L: 48
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 49
						var8 = 160; // L: 50
					}
				}

				var5.reverse(); // L: 54
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 55
				return var5.toString(); // L: 56
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "93"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 4001
			class91.clientPreferences.method2558(!class91.clientPreferences.method2502()); // L: 4002
			if (class91.clientPreferences.method2502()) { // L: 4003
				class411.addGameMessage(99, "", "Roofs are now all hidden"); // L: 4004
			} else {
				class411.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 4007
			}
		}

		if (var0.startsWith("zbuf")) { // L: 4010
			boolean var1 = class36.method686(var0.substring(5).trim()) == 1; // L: 4011
			class159.client.method496(var1); // L: 4012
			Rasterizer3D.method4518(var1); // L: 4013
		}

		if (var0.equalsIgnoreCase("z")) { // L: 4015
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 4016
			class91.clientPreferences.method2508();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 4017
			Client.field648 = !Client.field648;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 4018
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 4019
			if (var0.equalsIgnoreCase("errortest")) { // L: 4020
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				class434.worldMap.field4983 = !class434.worldMap.field4983; // L: 4021
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 4022
				class91.clientPreferences.method2573(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 4023
				class91.clientPreferences.method2573(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 4024
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 4025
				class148.method3177();
			}
		}

		PacketBufferNode var2 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3187, Client.packetWriter.isaacCipher); // L: 4028
		var2.packetBuffer.writeByte(var0.length() + 1); // L: 4029
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 4030
		Client.packetWriter.addNode(var2); // L: 4031
	} // L: 4032
}
