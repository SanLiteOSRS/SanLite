import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("ao")
	static int[] field1457;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("aq")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lry;Lry;I)I",
		garbageValue = "-1579115164"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) { // L: 15
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1; // L: 16
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1; // L: 19
		}

		return this.compareUser(var1, var2); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 25
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2029946391"
	)
	static final boolean method2944() {
		return ViewportMouse.ViewportMouse_isInViewport; // L: 103
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lng;II)V",
		garbageValue = "-1245873869"
	)
	public static void method2942(Widget var0, int var1) {
		ItemComposition var2 = ArchiveDiskActionHandler.ItemComposition_get(var1); // L: 1041
		var0.field3774.equipment[var2.maleModel] = var1 + 512; // L: 1042
		if (var2.maleModel1 != -1) { // L: 1043
			var0.field3774.equipment[var2.maleModel1] = 0; // L: 1044
		}

		if (var2.maleModel2 != -1) { // L: 1046
			var0.field3774.equipment[var2.maleModel2] = 0; // L: 1047
		}

		var0.field3774.method6477(); // L: 1049
	} // L: 1050

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-30"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (Projectile.friendsChatManager != null) { // L: 12702
			PacketBufferNode var1 = ViewportMouse.getPacketBufferNode(ClientPacket.field3259, Client.packetWriter.isaacCipher); // L: 12703
			var1.packetBuffer.writeByte(class145.stringCp1252NullTerminatedByteSize(var0)); // L: 12704
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12705
			Client.packetWriter.addNode(var1); // L: 12706
		}
	} // L: 12707
}
