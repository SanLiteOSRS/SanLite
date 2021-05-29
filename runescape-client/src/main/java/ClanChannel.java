import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

import net.runelite.mapping.*;

@ObfuscatedName("y")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	static IndexedSprite field33;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("ny")
	@ObfuscatedGetter(
		intValue = -217468963
	)
	static int field38;
	@ObfuscatedName("v")
	boolean field30;
	@ObfuscatedName("n")
	boolean field27;
	@ObfuscatedName("f")
	@Export("members")
	public List members;
	@ObfuscatedName("y")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -8222609313489775677L
	)
	long field29;
	@ObfuscatedName("j")
	@Export("name")
	public String name;
	@ObfuscatedName("r")
	public byte field32;
	@ObfuscatedName("b")
	public byte field26;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lnd;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field27 = true;
		this.name = null;
		this.method29(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1562690283"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).name;
			}

			ChatChannel.method2013(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ls;I)V",
		garbageValue = "-1843980816"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "85"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-27"
	)
	public int method27() {
		return this.members.size();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "493868170"
	)
	public int method30(String var1) {
		if (!this.field27) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) {
				if (((ClanChannelMember)this.members.get(var2)).name.equalsIgnoreCase(var1)) {
					return var2;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-104022179"
	)
	void method29(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field30 = true;
		}

		if ((var2 & 2) != 0) {
			this.field27 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field29 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field26 = var1.readByte();
		this.field32 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field30) {
					var1.readLong();
				}

				if (this.field27) {
					var6.name = var1.readStringCp1252NullTerminated();
				}

				var6.rank = var1.readByte();
				var6.world = var1.readUnsignedShort();
				if (var3 >= 3) {
					var1.readBoolean();
				}

				this.members.add(var5, var6);
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1446319005"
	)
	static int method41(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) {
			if (var0 == 3702) {
				++class44.Interpreter_intStackSize;
				return 1;
			} else {
				return 2;
			}
		} else {
			--class44.Interpreter_intStackSize;
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "331312284"
	)
	static final void method36(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var13 + var6;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var7 + var15 + var1;
			Rasterizer3D.method3856(var17, var18, var19);
			Rasterizer3D.method3919(var21, var22, var23, var17, var18, var19, var4);
			Rasterizer3D.method3856(var17, var19, var20);
			Rasterizer3D.method3919(var21, var23, var24, var17, var19, var20, var4);
		}
	}
}
