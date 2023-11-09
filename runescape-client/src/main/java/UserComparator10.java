import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = 1799410691
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("au")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqb;Lqb;I)I",
		garbageValue = "-1110862870"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
		garbageValue = "74"
	)
	public static String method2909(CharSequence var0) {
		int var1 = var0.length(); // L: 11
		StringBuilder var2 = new StringBuilder(var1); // L: 12

		for (int var3 = 0; var3 < var1; ++var3) { // L: 13
			char var4 = var0.charAt(var3); // L: 14
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') { // L: 15
				if (var4 == ' ') { // L: 16
					var2.append('+');
				} else {
					byte var5 = class348.charToByteCp1252(var4); // L: 18
					var2.append('%'); // L: 19
					int var6 = var5 >> 4 & 15; // L: 20
					if (var6 >= 10) { // L: 21
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 22
					}

					var6 = var5 & 15; // L: 23
					if (var6 >= 10) { // L: 24
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 25
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString(); // L: 28
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1771624140"
	)
	static final void method2907(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : VerticalAlignment.guestClanChannel; // L: 12630
		if (var2 != null && var1 >= 0 && var1 < var2.method3301()) { // L: 12631
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 12632
			if (var3.rank == -1) {
				String var4 = var3.username.getName(); // L: 12634
				PacketBufferNode var5 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3136, Client.packetWriter.isaacCipher); // L: 12635
				var5.packetBuffer.writeByte(3 + AbstractSocket.stringCp1252NullTerminatedByteSize(var4)); // L: 12636
				var5.packetBuffer.writeByte(var0); // L: 12637
				var5.packetBuffer.writeShort(var1); // L: 12638
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 12639
				Client.packetWriter.addNode(var5); // L: 12640
			}
		}
	} // L: 12633 12641
}
