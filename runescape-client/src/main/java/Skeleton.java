import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1781728495
	)
	@Export("id")
	int id;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1946555143
	)
	@Export("count")
	int count;
	@ObfuscatedName("j")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("h")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	class201 field2361;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 19
		Buffer var3 = new Buffer(var2); // L: 20
		this.count = var3.readUnsignedByte(); // L: 21
		this.transformTypes = new int[this.count]; // L: 22
		this.labels = new int[this.count][]; // L: 23

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 24
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 25
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 26
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 27
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) { // L: 29
			var4 = var3.readUnsignedShort(); // L: 30
			if (var4 > 0) { // L: 31
				this.field2361 = new class201(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "236"
	)
	public int method4101() {
		return this.count; // L: 38
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lgj;",
		garbageValue = "1699942506"
	)
	public class201 method4103() {
		return this.field2361; // L: 42
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 5055
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 5056
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 5057
				int var3 = var2.x >> 7; // L: 5058
				int var4 = var2.y >> 7; // L: 5059
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 5060
					if (var2.field1202 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 5061
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 5062
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 5063
					}

					long var5 = class394.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 5065
					var2.playerCycle = Client.cycle; // L: 5066
					Decimator.scene.drawEntity(FriendSystem.Client_plane, var2.x, var2.y, SecureRandomFuture.getTileHeight(var2.field1202 * 64 - 64 + var2.x, var2.field1202 * 64 - 64 + var2.y, FriendSystem.Client_plane), var2.field1202 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 5067
				}
			}
		}

	} // L: 5071
}
