import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = -541858281
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("az")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrw;Lrw;B)I",
		garbageValue = "-7"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lhk;",
		garbageValue = "1301865649"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 68
		if (var1 != null) { // L: 69
			return var1;
		} else {
			byte[] var2 = class191.NpcDefinition_archive.takeFile(9, var0); // L: 70
			var1 = new NPCComposition(); // L: 71
			var1.id = var0; // L: 72
			if (var2 != null) { // L: 73
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 74
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 75
			return var1; // L: 76
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;I)V",
		garbageValue = "1228226987"
	)
	public static void method2922(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0; // L: 24
	} // L: 25

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "575251863"
	)
	public static void method2914() {
		class210.field2158.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1241805002"
	)
	static String method2926() {
		return NPC.clientPreferences.method2461() ? class132.method3057(Login.Login_username) : Login.Login_username; // L: 293
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-64388897"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 149
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "13"
	)
	static final void method2915(boolean var0) {
		class167.method3417(); // L: 6081
		++Client.packetWriter.pendingWrites; // L: 6082
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 6083
			Client.packetWriter.pendingWrites = 0; // L: 6084
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 6085
				PacketBufferNode var1 = class425.getPacketBufferNode(ClientPacket.field3203, Client.packetWriter.isaacCipher); // L: 6087
				Client.packetWriter.addNode(var1); // L: 6088

				try {
					Client.packetWriter.flush(); // L: 6090
				} catch (IOException var3) { // L: 6092
					Client.hadNetworkError = true; // L: 6093
				}
			}

		}
	} // L: 6096

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-65"
	)
	static final void method2927() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8586 8587 8593
			if (var0.hitpoints == -1) { // L: 8588
				var0.delay = 0; // L: 8589
				WorldMapRectangle.method5683(var0); // L: 8590
			} else {
				var0.remove(); // L: 8592
			}
		}

	} // L: 8595
}
