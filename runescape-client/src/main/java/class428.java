import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
final class class428 implements class427 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpd;B)V",
		garbageValue = "25"
	)
	public void vmethod7681(Object var1, Buffer var2) {
		this.method7655((Integer)var1, var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)Ljava/lang/Object;",
		garbageValue = "1821026092"
	)
	public Object vmethod7683(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lpd;I)V",
		garbageValue = "1028680582"
	)
	void method7655(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2049600891"
	)
	static final void method7654(int var0, int var1, int var2) {
		if (EnumComposition.cameraX < var0) {
			EnumComposition.cameraX = (var0 - EnumComposition.cameraX) * class33.field231 / 1000 + EnumComposition.cameraX + Tiles.field996;
			if (EnumComposition.cameraX > var0) {
				EnumComposition.cameraX = var0;
			}
		}

		if (EnumComposition.cameraX > var0) {
			EnumComposition.cameraX -= (EnumComposition.cameraX - var0) * class33.field231 / 1000 + Tiles.field996;
			if (EnumComposition.cameraX < var0) {
				EnumComposition.cameraX = var0;
			}
		}

		if (FriendSystem.cameraY < var1) {
			FriendSystem.cameraY = (var1 - FriendSystem.cameraY) * class33.field231 / 1000 + FriendSystem.cameraY + Tiles.field996;
			if (FriendSystem.cameraY > var1) {
				FriendSystem.cameraY = var1;
			}
		}

		if (FriendSystem.cameraY > var1) {
			FriendSystem.cameraY -= (FriendSystem.cameraY - var1) * class33.field231 / 1000 + Tiles.field996;
			if (FriendSystem.cameraY < var1) {
				FriendSystem.cameraY = var1;
			}
		}

		if (CollisionMap.cameraZ < var2) {
			CollisionMap.cameraZ = (var2 - CollisionMap.cameraZ) * class33.field231 / 1000 + CollisionMap.cameraZ + Tiles.field996;
			if (CollisionMap.cameraZ > var2) {
				CollisionMap.cameraZ = var2;
			}
		}

		if (CollisionMap.cameraZ > var2) {
			CollisionMap.cameraZ -= (CollisionMap.cameraZ - var2) * class33.field231 / 1000 + Tiles.field996;
			if (CollisionMap.cameraZ < var2) {
				CollisionMap.cameraZ = var2;
			}
		}

	}
}
