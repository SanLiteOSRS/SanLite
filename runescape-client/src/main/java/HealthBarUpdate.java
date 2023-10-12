import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dt")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("ab")
	@Export("ItemComposition_inMembersWorld")
	static boolean ItemComposition_inMembersWorld;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1165129097
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1916249825
	)
	@Export("health")
	int health;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2113097989
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -141956253
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-104835898"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-53586823"
	)
	public static String method2462(String var0) {
		int var1 = var0.length(); // L: 159
		char[] var2 = new char[var1]; // L: 160
		byte var3 = 2; // L: 161

		for (int var4 = 0; var4 < var1; ++var4) { // L: 162
			char var5 = var0.charAt(var4); // L: 163
			if (var3 == 0) { // L: 164
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 165
				var5 = StudioGame.method6812(var5);
			}

			if (Character.isLetter(var5)) { // L: 166
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 167
				if (Character.isSpaceChar(var5)) { // L: 168
					if (var3 != 2) { // L: 169
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 171
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 172
		}

		return new String(var2); // L: 174
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "-2085144575"
	)
	static int method2457(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 4418
			Client.logoutTimer = 250; // L: 4419
			return 1; // L: 4420
		} else {
			return 2; // L: 4422
		}
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "2104594196"
	)
	static final void method2460(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 12666
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3382()) { // L: 12667
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12668
				PacketBufferNode var4 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3141, Client.packetWriter.isaacCipher); // L: 12669
				var4.packetBuffer.writeByte(4 + class478.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12670
				var4.packetBuffer.writeByte(var0); // L: 12671
				var4.packetBuffer.writeShort(var1); // L: 12672
				var4.packetBuffer.writeBoolean(var2); // L: 12673
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12674
				Client.packetWriter.addNode(var4); // L: 12675
			}
		}
	} // L: 12676
}
