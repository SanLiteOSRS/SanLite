import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class140 extends class143 {
	@ObfuscatedName("aq")
	public static short[][] field1659;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1568997835
	)
	int field1658;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1547450271
	)
	int field1657;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -20381335
	)
	int field1661;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -947832085
	)
	int field1656;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class140(class146 var1) {
		this.this$0 = var1;
		this.field1658 = -1; // L: 158
	} // L: 163

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "209179459"
	)
	void vmethod3337(Buffer var1) {
		this.field1658 = var1.readUnsignedShort(); // L: 166
		this.field1657 = var1.readInt(); // L: 167
		this.field1661 = var1.readUnsignedByte(); // L: 168
		this.field1656 = var1.readUnsignedByte(); // L: 169
	} // L: 170

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "73"
	)
	void vmethod3339(ClanSettings var1) {
		var1.method3192(this.field1658, this.field1657, this.field1661, this.field1656); // L: 173
	} // L: 174

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-64"
	)
	static final void method3093() {
		int var0;
		int var1;
		int var2;
		if (!Client.field788) { // L: 3854
			var0 = Players.field1374 * 16384 + 64; // L: 3855
			var1 = class33.field180 * 128 + 64; // L: 3856
			var2 = class18.getTileHeight(var0, var1, HealthBar.Client_plane) - VarpDefinition.field1937; // L: 3857
			class126.method2942(var0, var2, var1); // L: 3858
		} else if (Client.field791 != null) { // L: 3860
			NPCComposition.cameraX = Client.field791.vmethod8458(); // L: 3861
			class139.cameraZ = Client.field791.vmethod8459(); // L: 3862
			if (Client.field790) { // L: 3863
				class133.cameraY = Client.field791.vmethod8460(); // L: 3864
			} else {
				class133.cameraY = class18.getTileHeight(NPCComposition.cameraX, class139.cameraZ, HealthBar.Client_plane) - Client.field791.vmethod8460(); // L: 3867
			}

			Client.field791.method8479(); // L: 3869
		}

		if (!Client.field789) { // L: 3871
			var0 = PendingSpawn.field1182 * 16384 + 64; // L: 3872
			var1 = VarbitComposition.field2127 * 128 + 64; // L: 3873
			var2 = class18.getTileHeight(var0, var1, HealthBar.Client_plane) - MusicPatchNode2.field3397; // L: 3874
			int var3 = var0 - NPCComposition.cameraX; // L: 3875
			int var4 = var2 - class133.cameraY; // L: 3876
			int var5 = var1 - class139.cameraZ; // L: 3877
			int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3)); // L: 3878
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047; // L: 3879
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047; // L: 3880
			class416.method7711(var7, var8); // L: 3881
		} else {
			if (Client.field608 != null) { // L: 3884
				class129.cameraPitch = Client.field608.method8455(); // L: 3885
				class129.cameraPitch = Math.min(Math.max(class129.cameraPitch, 128), 383); // L: 3886
				Client.field608.method8479(); // L: 3887
			}

			if (Client.field582 != null) { // L: 3889
				UserComparator10.cameraYaw = Client.field582.method8455() & 2047; // L: 3890
				Client.field582.method8479(); // L: 3891
			}
		}

	} // L: 3894
}
