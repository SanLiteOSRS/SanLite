import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
public class class424 extends class425 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	class333 field4625;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 964825125
	)
	int field4624;

	@ObfuscatedSignature(
		descriptor = "(Lqe;IZI)V"
	)
	public class424(class425 var1, int var2, boolean var3, int var4) {
		super(var1); // L: 11
		this.field4625 = null; // L: 7
		this.field4624 = 0; // L: 8
		super.field4627 = "FadeInTask"; // L: 12
		if (var2 >= 0) { // L: 13
			if (var3 && var2 < class321.field3478.size()) { // L: 16
				this.field4625 = (class333)class321.field3478.get(var2); // L: 17
			} else if (!var3 && var2 < class321.field3474.size()) { // L: 19
				this.field4625 = (class333)class321.field3474.get(var2); // L: 20
			}

			this.field4624 = var4; // L: 22
		}
	} // L: 14 23

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public boolean vmethod8043() {
		if (this.field4625 != null && this.field4625.field3594 != null) { // L: 27
			this.field4625.field3597 = true; // L: 30

			try {
				if (this.field4625.field3602 < (float)this.field4625.field3592 && this.field4625.field3594.isReady()) { // L: 32
					float var1 = this.field4624 == 0 ? (float)this.field4624 : (float)this.field4625.field3592 / (float)this.field4624; // L: 33
					class333 var10000 = this.field4625;
					var10000.field3602 += 0.0F == var1 ? (float)this.field4625.field3592 : var1; // L: 34
					if (this.field4625.field3602 > (float)this.field4625.field3592) { // L: 35
						this.field4625.field3602 = (float)this.field4625.field3592; // L: 36
					}

					this.field4625.field3594.setPcmStreamVolume((int)this.field4625.field3602); // L: 38
					return false; // L: 39
				}
			} catch (Exception var3) { // L: 42
				this.method8017(var3.getMessage()); // L: 43
				return true; // L: 44
			}

			this.field4625.field3597 = false; // L: 46
			return true; // L: 47
		} else {
			return true; // L: 28
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "1973315729"
	)
	static final void method8010(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		var5 = class127.method2998(var5, var6); // L: 5820
		int var7 = 2048 - var3 & 2047; // L: 5821
		int var8 = 2048 - var4 & 2047; // L: 5822
		int var9 = 0; // L: 5823
		int var10 = 0; // L: 5824
		int var11 = var5; // L: 5825
		int var12;
		int var13;
		int var14;
		if (var7 != 0) { // L: 5826
			var12 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 5827
			var13 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 5828
			var14 = var10 * var13 - var5 * var12 >> 16; // L: 5829
			var11 = var13 * var5 + var12 * var10 >> 16; // L: 5830
			var10 = var14; // L: 5831
		}

		if (var8 != 0) { // L: 5833
			var12 = Rasterizer3D.Rasterizer3D_sine[var8]; // L: 5834
			var13 = Rasterizer3D.Rasterizer3D_cosine[var8]; // L: 5835
			var14 = var12 * var11 + var13 * var9 >> 16; // L: 5836
			var11 = var11 * var13 - var9 * var12 >> 16; // L: 5837
			var9 = var14; // L: 5838
		}

		if (Client.isCameraLocked) { // L: 5840
			class362.field3961 = var0 - var9; // L: 5841
			ArchiveDiskAction.field4355 = var1 - var10; // L: 5842
			class276.field2914 = var2 - var11; // L: 5843
			WorldMapCacheName.field2683 = var3; // L: 5844
			FriendsChatManager.field4736 = var4; // L: 5845
		} else {
			FriendsChatMember.cameraX = var0 - var9; // L: 5848
			class18.cameraY = var1 - var10; // L: 5849
			class317.cameraZ = var2 - var11; // L: 5850
			FriendSystem.cameraPitch = var3; // L: 5851
			Script.cameraYaw = var4; // L: 5852
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (Friend.oculusOrbFocalPointX >> 7 != VarpDefinition.localPlayer.x >> 7 || class59.oculusOrbFocalPointY >> 7 != VarpDefinition.localPlayer.y >> 7)) { // L: 5854 5855
			var12 = VarpDefinition.localPlayer.plane; // L: 5856
			var13 = Projectile.baseX * 64 + (Friend.oculusOrbFocalPointX >> 7); // L: 5857
			var14 = GameEngine.baseY * 8 + (class59.oculusOrbFocalPointY >> 7); // L: 5858
			Login.method2195(var13, var14, var12, true); // L: 5859
		}

	} // L: 5862
}
