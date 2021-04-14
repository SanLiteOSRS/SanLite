import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public abstract class class341 implements class191 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lne;"
	)
	class373 field3928;

	class341(int var1) {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;IB)V",
		garbageValue = "31"
	)
	abstract void vmethod6008(Buffer var1, int var2);

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1416767343"
	)
	public void method6014(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class337[] var3 = new class337[]{class337.field3921, class337.field3922, class337.field3920, class337.field3925};
			class337 var4 = (class337)UserComparator8.findEnumerated(var3, var2);
			if (var4 != null) {
				switch(var4.field3923) {
				case 0:
					var1.readStringCp1252NullCircumfixed();
					break;
				case 1:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				case 2:
					class246[] var5 = new class246[]{class246.field3215, class246.field3214, class246.field3217, class246.field3216};
					UserComparator8.findEnumerated(var5, var1.readUnsignedByte());
					break;
				case 3:
					int var6 = var1.readUnsignedByte();
					this.field3928 = Login.method1969(var6);
				}
			} else {
				this.vmethod6008(var1, var2);
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "660336316"
	)
	boolean method6007() {
		return this.field3928 != null;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(B)Ljava/lang/Object;",
		garbageValue = "58"
	)
	Object method6010() {
		if (this.field3928 == class373.field4126) {
			return 0;
		} else if (this.field3928 == class373.field4134) {
			return -1L;
		} else {
			return this.field3928 == class373.field4128 ? "" : null;
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		signature = "(Lcr;I)V",
		garbageValue = "-745115962"
	)
	static final void method6017(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = WorldMapArea.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = WorldMapArea.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = WorldMapArea.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = WorldMapArea.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) {
			int var6 = WorldMapArea.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = WorldMapSection1.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field1203 = var4;
		var0.field1199 = var5;
	}
}
