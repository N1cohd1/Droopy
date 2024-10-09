package com.hueae.droopys_mansion.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CustomTestBlock extends Block {
    public CustomTestBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        world.playSound(player, pos, SoundEvents.BLOCK_COPPER_TRAPDOOR_OPEN, SoundCategory.BLOCKS, 100f, 1f);
        return ActionResult.SUCCESS;
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof SheepEntity sheepEntity) {
            if(!sheepEntity.hasStatusEffect(StatusEffects.INVISIBILITY)) {
                sheepEntity.fallDistance = 0;
                sheepEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 20, 100));
            }
        }
        super.onSteppedOn(world, pos, state, entity);
    }
}
